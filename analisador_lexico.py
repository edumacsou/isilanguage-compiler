# /bin/base python analisador_lexico.py

from my_token import *

def main():
    """
    O Analisador léxico é uma máquina de estados. ( As regras de negócio estão descritas no arquivo do JFLAP )
    Ele lê letra a letra do arquivo a ser compilado e separa os tokens encontrados.
    Os possíveis Tokens estão descritos no arquivo my_token.py
    Esse programa é bem similar ao apresentado pelo professor na Aula 3 (Implementação do Analisador Léxico)
    """
    file = IsiScanner('input.isi')
    print(file)
    state = 0
    tokens = []
    term = Token()
    while True:
        # A seguinte condicional para o compilador no caracter 62, para fins de teste, depois de todos os estados serem declarados essa linha deve ser alterada para:
        # if file.is_EOF(): break
        # Então adicionarmos o retorno do Analisador
        if file.pos == 62: exit(0)
        match state:
            # Cada case é um estado da máquina de estados
            case 0:
                # O caso 0 é o inicial:
                # Se for lido um caracter nulo, ele é ignorado e continuamos no estado 0
                # Se for lido um caracter minúsculo, então se trata de um identificador (palavra reservada ou nome de variável) então começamos a gravar o Token e passamos para o estado 1
                # Se o caracter lido for um símbolo, passamos para o estado 2
                # Se o caracter for aspas duplas (") então é o início de uma String e pulamos para o estado 3
                if is_space(file.current_char):
                    file.next_char()
                    continue
                if is_lower(file.current_char):
                    state = 1
                    term.append_char(file.current_char)
                    file.next_char()
                    continue
                if is_symbol(file.current_char):
                    state = 2
                    term.append_char(file.current_char)
                    file.next_char()
                    continue
                if file.current_char == '"':
                    term.append_char(file.current_char)
                    file.next_char()
                    state = 3
            case 1:
                # O estado 1 indica que inniciamos a leitura de um identificador
                # Se o caracter lido for uma letra ou um número, continuamos a leitura do Token
                # Se for um espaço vazio, então finalizamos a leitura do Token evoltamos ao estado 0
                # Se o caracter lido for um símbolo, então terminamos a gravação do Token e voltamos para o estado 0, mas dessa vez não atualizamos o caracter corrente, pois esse caracter pode ser parte do próximo Token.
                if is_letter(file.current_char) or is_digit(file.current_char):
                    state = 1
                    term.append_char(file.current_char)
                    file.next_char()
                    continue
                if is_space(file.current_char):
                    state = 0
                    term.set_type(TK_IDENTIFIER)
                    tokens.append(term)
                    print(term)
                    term = Token()
                    file.next_char()
                    continue
                if is_symbol(file.current_char):
                    state = 0
                    term.set_type(TK_IDENTIFIER)
                    tokens.append(term)
                    print(term)
                    term = Token()
                    continue
            case 2:
                # O estado 2 indica que começamos a ler um símbolo
                # Se o caracter lido for um símbolo continuamos a leitura do Token
                # Se o caracter lido não for um símbolo, paramos a leitura do Token e voltamos ao estado 0 sem ler um novo caracter, pois esse último caracter lido pode ser parte do próximo Token
                ### !!!!!!! Esse estado deve ser alterado, para podermos distinguir entre os "Pontuadores" (. e ,) dos "Comparadores" (<, <=, >, >=, ==, !=) do Atribuidor (:=) e dos Delimitadores ( (),{} )
                if is_symbol(file.current_char):
                    term.append_char(file.current_char)
                    file.next_char()
                    continue
                else:
                    term.set_type(TK_OPERATOR)
                    tokens.append(term)
                    print(term)
                    term = Token()
                    state = 0
                    continue
            case 3:
                # O estado 3 indica que estamos dentro de bloco de Texto (String)
                # Continuamos lendo o token enquanto ele se tratar de um caracter válido
                # Se lermos o caracter " o Token de texto é encerrado e voltamos ao estado 0
                if is_valid(file.current_char) and file.current_char != '"':
                    term.append_char(file.current_char)
                    file.next_char()
                    continue
                if file.current_char == '"':
                    term.append_char(file.current_char)
                    term.set_type(TK_TEXT)
                    tokens.append(term)
                    print(term)
                    term = Token()
                    file.next_char()
                    state = 0
                    continue

if __name__ == '__main__':
    main()
