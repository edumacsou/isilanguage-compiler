grammar IsiLang;

prog	: 'programa' decl bloco  'fimprog;'
		;

decl    :  (declaravar)+
        ;


declaravar :  tipo ID
              (  VIR
              	 ID
              )*
               SC
           ;

tipo       : 'numero'
           | 'texto'
           ;

bloco	:
          (cmd)+
		;


cmd		:  cmdleitura
 		|  cmdescrita
 		|  cmdattrib
 		|  cmdselecao
		;

cmdleitura	: 'leia' AP
                     ID
                     FP
                     SC
			;

cmdescrita	: 'escreva'
                 AP
                 ID
                 FP
                 SC
			;

cmdattrib	:  ID
               ATTR
               expr
               SC
			;


cmdselecao  :  'se' AP
                    ID
                    OPREL
                    (ID | NUMBER)
                    FP
                    ACH
                    (cmd)+

                    FCH
                   ('senao'
                   	 ACH
                   	(cmd+)
                   	FCH
                   )?
            ;

expr		:  termo (
	             OP
	            termo
	            )*
			;

termo		: ID
            |
              NUMBER
			;


AP	: '('
	;

FP	: ')'
	;

SC	: ';'
	;

OP	: '+' | '-' | '*' | '/'
	;

ATTR : '='
	 ;

VIR  : ','
     ;

ACH  : '{'
     ;

FCH  : '}'
     ;


OPREL : '>' | '<' | '>=' | '<=' | '==' | '!='
      ;

ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;

NUMBER	: [0-9]+ ('.' [0-9]+)?
		;

WS	: (' ' | '\t' | '\n' | '\r') -> skip;