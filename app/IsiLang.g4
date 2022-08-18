grammar IsiLang;

@header{ 

from isiExceptions import IsiSemanticException
from isiSymbol import IsiSymbol
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable
from isiProgram import IsiProgram, AbstractCommand, ReadCommand, WriteCommand

}

@members{

def setTipo(self, tipo):
  self._tipo = tipo
def getTipo(self):
  return self._tipo

def checkVar(self, varName):
  if not self._symbolTable.exists(varName):
    raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente! ".format(varName))
  self._symbolTable.setUsed(varName)
}

prog	: 
{
# comandos em python executados antes do inicio do programa
self._symbolTable = IsiSymbolTable()
self._isiProgram = IsiProgram()
self._readIDCommand = None
self._curThread = []
self._exprID = None
self._exprContent = None
}
    'programa' decl bloco  'fimprog;'
{
# comandos em python executados no fim do programa
self._symbolTable.checkUnused()
self._isiProgram.setCommands(self._curThread)
}
      ;

decl    :  (declaravar)+
        ;


declaravar :  tipo ID {
symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

if(self._symbolTable.exists(str(symbol.getName())) == False):
     #print("Simbolo adicionado", symbol)
     self._symbolTable.add(symbol)
else:
     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
                    }
                    (  VIR
                       ID   {
symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

if(self._symbolTable.exists(str(symbol.getName())) == False):
     #print("Simbolo adicionado", symbol)
     self._symbolTable.add(symbol)
else:
     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
}
                    )*
                    SC
           ;

           tipo       : 'numero' {
self.setTipo(IsiVariable.NUMBER)
                    }
                    | 'texto'  {
self.setTipo(IsiVariable.TEXT)
                    }
           ;

bloco	:
          (cmd)+
		;


cmd		:  cmdleitura {print("Reconhecido comando de leitura!")    }
 		|  cmdescrita {print("Reconhecido comando de escrita!")    }
 		|  cmdattrib  {print("Reconhecido comando de atribuicao!") }
 		|  cmdselecao {print("Reconhecido comando de selecao!")    }
 		|  cmdenquanto    {print("Reconhecido comando de enquanto!")    }
		;

cmdleitura	: 'leia' AP
                        ID {
self.checkVar(self._ctx.getChild(-1).getText())
self._readIDCommand = str(self._ctx.getChild(-1))
}
                        FP
                        SC
{
cmd = ReadCommand(self._readIDCommand)
self._curThread.append(cmd)
}
			;

cmdescrita	: 'escreva'
                 AP
                 ID
                 {
self.checkVar(self._ctx.getChild(-1).getText())
self._readIDCommand = str(self._ctx.getChild(-1))
}
                 FP
                 SC
{
cmd = WriteCommand(self._readIDCommand)
self._curThread.append(cmd)
}
			;

cmdattrib	:  ID {self.checkVar(self._ctx.getChild(-1).getText())}
               ATTR
               expr
               SC
			;


cmdselecao  :  'se' AP
                    ID {
self.checkVar(self._ctx.getChild(-1).getText())
}
                    OPREL
                    termo
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

cmdenquanto    : 'enquanto' AP
                            ID{
self.checkVar(self._ctx.getChild(-1).getText())
}
                    OPREL
                    termo
                    FP
                    ACH
                    (cmd)+
                    FCH
               ;


expr		:  termo (
	             OP
	            termo
	            )*
			;

termo		: ID {
self.checkVar(self._ctx.getChild(-1).getText())
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
