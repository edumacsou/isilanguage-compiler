grammar IsiLang;

prog	: 'programa' decl {
import os
## __file is inside app/src/parser, the root folder of the project will be app/
ROOT_PATH = os.path.normpath(os.path.join(os.path.dirname(__file__), '../../'))
import sys
sys.path.append(ROOT_PATH)
from src.parser.Singleton import Singleton
Singleton()} bloco  'fimprog;'

      ;

decl    :  (declaravar)+
        ;


        declaravar :  tipo ID          {print(self._ctx.getChild(-1))}
                           (  VIR
                         	ID       {print(self._ctx.getChild(-1))}
                           )*
                           SC
           ;

tipo       : 'numero' {print("Tipo Numero")}
           | 'texto'  {print("Tipo Texto") }
           ;

bloco	:
          (cmd)+
		;


cmd		:  cmdleitura {print("Reconhecido comando de leitura!")    }
 		|  cmdescrita {print("Reconhecido comando de escrita!")    }
 		|  cmdattrib  {print("Reconhecido comando de atribuicao!") }
 		|  cmdselecao {print("Reconhecido comando de selecao!")    }
		;

cmdleitura	: 'leia' AP
                        ID {print("ID = " + str(self._ctx.getChild(-1)))}
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
