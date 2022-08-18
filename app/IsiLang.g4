grammar IsiLang;

@header{ 

import isiExceptions
from isiSymbol import IsiSymbol
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable

}

@members{

def setTipo(self, tipo):
  self._tipo = tipo
def getTipo(self):
  return self._tipo
}

prog	: {self._symbolTable = IsiSymbolTable()}'programa' decl bloco  'fimprog;'
      ;

decl    :  (declaravar)+
        ;


declaravar :  tipo ID {
symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)
print("Simbolo adicionado", symbol)
self._symbolTable.add(symbol)
                    }
                    (  VIR
                       ID   {
symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)
print("Simbolo adicionado", symbol)
self._symbolTable.add(symbol)
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
