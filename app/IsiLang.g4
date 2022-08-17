grammar IsiLang;

@header{ 

import isiExceptions
import isiSymbol
import isiVariable
import isiSymbolTable

}

@members{

def setTipo(self, tipo):
  self._tipo = tipo
def getTipo(self):
  return self._tipo

global _varName
_varName = ""
global _varValue
_varValue = ""

global symbolTable
symbolTable = isiSymbolTable.IsiSymbolTable()

}

prog	: 'programa' decl bloco  'fimprog;'

      ;

decl    :  (declaravar)+
        ;


declaravar :  tipo ID {
print("ID lido: {}, do tipo {}".format(self._ctx.getChild(-1), self.getTipo()))
_varName = self._ctx.getChild(-1)
_varValue = None
symbol = isiVariable.IsiVariable(_varName, self.getTipo(), _varValue)
print("Simbolo adcionado {}".format(symbol.toString()))
symbolTable.add(symbol)
                    }
                    (  VIR
                       ID   {
print(self._ctx.getChild(-1))
_varName = self._ctx.getChild(-1)
_varValue = None
symbol = isiVariable.IsiVariable(_varName, self.getTipo(), _varValue)
print("Simbolo adcionado {}".format(symbol.toString()))
symbolTable.add(symbol)
}
                    )*
                    SC
           ;

           tipo       : 'numero' {
self.setTipo(0) #isiVariable.IsiVariable.NUMBER
print("tipo lido: {}".format(self.getTipo())) 
                    }
                    | 'texto'  {
self.setTipo(1) #isiVariable.IsiVariable.TEXT
print("tipo lido: {}".format(self.getTipo()))
                    }
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
