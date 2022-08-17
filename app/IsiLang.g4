grammar IsiLang;

@header{ 

import isiExceptions
import isiSymbol
import isiVariable
import isiSymbolTable

}

@members{

global _tipo
_tipo = 0
global _varName
_varName = ""
global _varValue
_varValue = ""

global symbolTable
symbolTable = isiSymbolTable.IsiSymbolTable()

}

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


declaravar :  tipo ID       {
print("ID lido: {}, do tipo {}".format(self._ctx.getChild(-1), _tipo))
_varName = self._ctx.getChild(-1)
_varValue = None
symbol = isiVariable.IsiVariable(_varName, _tipo, _varValue)
print("Simbolo adcionado {}".format(symbol.toString()))
symbolTable.add(symbol)

}
                    (  VIR
                       ID   {
print(self._ctx.getChild(-1))
_varName = self._ctx.getChild(-1)
_varValue = None
symbol = isiVariable.IsiVariable(_varName, _tipo, _varValue)
print("Simbolo adcionado {}".format(symbol.toString()))
symbolTable.add(symbol)
}
                    )*
                    SC
           ;

tipo       : 'numero' {_tipo = 0 #isiVariable.IsiVariable.NUMBER
print("tipo lido: {}".format(_tipo)) }
           | 'texto'  {_tipo = 1 #isiVariable.IsiVariable.TEXT
print("tipo lido: {}".format(_tipo))   }
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
