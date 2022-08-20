# Compilador IsiLanguage

O objetivo do presente projeto é desenvolver os aspectos práticos da IsiLanguage, que consiste em uma linguagem de programação imperativa muito próxima do Português estruturado, tratando-se de um compilador compilador para a linguagem IsiLanguage.

Tal trabalho foi realizado como Projeto Final para a disciplina de Compiladores, ministrada pelo Professor Dr. Francisco Isidro Massetto e, pertencente ao curso de Bacharelado em Ciência da Computação da Universidade Federal do ABC (UFABC). 

<br />

# Execução do Código Fonte

Para realizar a execução do compilador é necessário navegar até a pasta raíz do código (../app/src/) e executar o seguinte comando:

```bash
java -jar "src\antlr-4.7.2-complete.jar" -Dlanguage=Python3 IsiLang.g4 -o src/parser
```

<br />

# Fases de Desenvolvimento (Working...)

A tabela abaixo retrata as instruções para a entrega do projeto:

| Item                                                                            | Status     |
|---------------------------------------------------------------------------------|------------|
| Possuir 2 tipos de dados (pelo menos 1 string)                                  | DONE       |
| Possuir a instrução de decisão (if/else)                                        | DONE       |
| Pelo menos 1 estrutura de repetição                                             | TODO       |
| Verificar atribuições com compatibilidade de tipos (semântica)                  | TODO       |
| Possuir operações de entrada e saída                                            | DONE       |
| Aceitar números decimais                                                        | DONE       |
| Verificar declaração de variávies (não usar variáveis que não foram declaradas) | TODO (EDU) |
| Verificar se há variáveis declaradas e não utilizadas (warning)                 | TODO (EDU) |
| Geração de pelo menos 1 linguagem destino (C/Java/Python)                       | TODO (HEN) |

<br />

### • Analisador Léxico (Working...)

Neste tópico, realizou-se a implementação de um analisador léxico, ou seja, o dicionário e o seu conjunto dos vocábulos para a linguagem determinada conforme demonstra a tabela a seguir:
  
| Palavra Token                        | Correspondente                                        |
|--------------------------------------|-------------------------------------------------------|
| Palavras Reservadas                  | ```programa``` ```fimprog``` ```declare``` ```leia``` ```escreva``` ```se``` ```entao``` ```senao``` ```numero``` ```texto``` ```enquanto``` ```null``` |
| Letra                                | ```(A..Z)``` ```(a..z)```                             |
| Dígito                               | ```0..9```                                            |
| Símbolo                              | ```ASCII de 32 a 126```                               |
| Operadores                           | ```.``` ```+``` ```-``` ```*``` ```/``` ```++``` ```--``` ```=``` ```==``` ```!=``` ```>``` ```>=``` ```<``` ```<=``` ```&&``` ```pipe(ou)``` |
| Delimitadores                        | ```,``` ```;``` ```( )``` ```{ }``` ```[ ]```         |
| Comentário de Linha                  | ```// Este é um exemplo de comentário de linha. ```   |
| Comentário de Bloco                  | ```/* Este é um exemplo de comentário de bloco. */``` |

<br />

### • Analisador Sintático (Working...)

Aaaaaaaaaaaa

<br />

### • Analisador Semântico (Working...)

Aaaaaaaaaaaaa

# Componentes do Grupo

| Nome do Integrante                    | Registro Acadêmico (RA)               | Github do Integrante                  |
|---------------------------------------|---------------------------------------|---------------------------------------|
| Ananda de Oliveira Gonçalves Antenor  | 11129411                              | https://github.com/anandaantenor      |
| Eduardo Maciel de Souza               | 11055516                              | https://github.com/edumacsou          |
| Henrique Fantato Silva de Albuquerque | 21053916                              | https://github.com/henriquefsa98      |
| Leonardo Vaz Lourenço                 | 11201811616                           | https://github.com/leowvazd           |
| Saulo Jacção Rosa                     | 11063113                              | https://github.com/SauloJRosa         |

<br />
