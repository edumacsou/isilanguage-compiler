Existem alguns pontos de melhoria como comentários no código.
1. Colocar as funções de validação do tipo is_*** para dentro da classe IsiScanner para reduzir a quantidade de código
1. Colocar a função next_char como padrão após a leitura de qualquer caracter e usar a função back (já implementada) para os casos em que não deveriamos ler um novo caracter (semelhante ao método do professor, isso reduziria a quantidade de código e repetição do termo file.next_char() )
1. Criar o estado que é responsável pela leitura de números e identificar se eles se tratam de Inteiros ou Float
1. Modificar o estado que cria os Tokens de símbolo, para ser possível separar melhor os tipos de símbolos, pontuação, atribuição, comparação e escopo.
