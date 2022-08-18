grammar IsiLang;

@header{ 

from isiExceptions import IsiSemanticException
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

if(self._symbolTable.exists(str(symbol.getName())) == False):
     print("Simbolo adicionado", symbol)
     self._symbolTable.add(symbol)
else:
     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
                    }
                    (  VIR
                       ID   {
symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)
print(self._symbolTable._hashTable.keys())
if(self._symbolTable.exists(str(symbol.getName())) == False):
     print("Simbolo adicionado", symbol)
     self._symbolTable.add(symbol)
else:
     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
}
                    )*
                    SC
           ;

           tipo       : 'numero' {
self.setTipo(IsiVariable.NUMBER)
print("tipo lido: {}".format(self.getTipo())) 
                    }
                    | 'texto'  {
self.setTipo(IsiVariable.TEXT)
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
                        ID {
if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
     raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando inserir um valor nela!".format(self._ctx.getChild(-1)))

}
                        FP
                        SC
			;

cmdescrita	: 'escreva'
                 AP
                 ID
                 {
if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
     raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando imprimir ela!".format(self._ctx.getChild(-1)))

}
                 FP
                 SC
			;

cmdattrib	:  ID
               ATTR
               expr
               SC
			;


cmdselecao  :  'se' AP
                    ID {
if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
     raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando utilizar ela numa operacao logica!".format(self._ctx.getChild(-1)))

}
                    OPREL
                    (ID {
if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
     raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando utilizar ela numa operacao logica!".format(self._ctx.getChild(-1)))

} | NUMBER)
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

termo		: ID {
if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
     raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando utilizar ela numa expressao!".format(self._ctx.getChild(-1)))

}
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
