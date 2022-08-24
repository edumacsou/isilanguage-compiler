grammar IsiLang;

@header{ 

from isiExceptions import IsiSemanticException
from isiSymbol import IsiSymbol
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable
from isiProgram import IsiProgram, AbstractCommand, ReadCommand, WriteCommand, AttribCommand, DecisionCommand, WhileCommand

}

@members{

def setTipo(self, tipo):
  self._tipo = tipo
def getTipo(self):
  return self._tipo


def checkVar(self, varName):
  if not self._isiProgram._varTable.exists(varName):
    raise IsiSemanticException("Erro Semantico! A variavel {} NAO existe! ".format(varName))
  self._isiProgram._varTable.setUsed(varName)

def checkVarType(self, var):
  if var.getTypeStr() != self._exprType and self._exprType != "any":
    raise IsiSemanticException("Erro Semantico! Esperava valor do tipo {}, mas recebeu {}, que possui tipo {}! ".format( self._exprType, var.getName(), var.getTypeStr()))

def generatePyCode(self, outputname="stdOutput.py"):
    return self._isiProgram.generatePyTarget(outputname)

def generateCCode(self, outputname="stdOutput.c"):
    return self._isiProgram.generateCTarget(outputname)
     
}

prog	: 
{
# comandos em python executados antes do inicio do programa
#self._symbolTable = IsiSymbolTable()
self._isiProgram = IsiProgram()
self._readIDCommand = None
self._curThread = []
self._stack = []   # pseudo stack usando lista, muito lento! Evoluir para uma implementacao melhor de pilha
self._exprID = None
self._exprContent = None
self._exprDecision = None
self._exprDecisionStack = []
self._trueList = []
self._falseList = []
self._cmdList   = []
self._exprType = None
self._elseCheck = False
self._elseCheckStack = []

}
    'programa' decl bloco  'fimprog;'
{
# comandos em python executados no fim do programa
self._isiProgram._varTable.checkUnused()
self._isiProgram.setCommands(self._stack.pop())
}
      ;

decl    : (declaravar)+
        ;


declaravar :  tipo ID {
symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

if(self._isiProgram._varTable.exists(str(symbol.getName())) == False):
     #print("Simbolo adicionado: {}".format(symbol.getName()))
     self._isiProgram._varTable.add(symbol)
     #print("symbol table:{}".format(self._isiProgram._varTable._hashTable))
else:
     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
                    }
                    (  VIR
                       ID   {
symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

if(self._isiProgram._varTable.exists(str(symbol.getName())) == False):
     #print("Simbolo adicionado: {}".format(symbol.getName()))
     self._isiProgram._varTable.add(symbol)
     #print("symbol table:{}".format(self._isiProgram._varTable._hashTable))
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
                    | 'booleano'{
self.setTipo(IsiVariable.BOOL) 
}
           ;

bloco	:
{
self._curThread = []
self._stack.append(self._curThread)
}
          (cmd)+
		;


cmd		:  invalidcmdleitura
          |  cmdleitura 
 		|  cmdescrita
          |  invalidcmd
          |  invalidcmdselecao  
          |  invalidcmdenquanto
 		|  cmdattrib 
 		|  cmdselecao 
 		|  cmdenquanto
          |  invalidelse
          
		;

cmdleitura	: 'leia' AP
                        ID {
self.checkVar(self._ctx.getChild(-1).getText())
self._readIDCommand = str(self._ctx.getChild(-1))
}
                        FP
                        SC
{
cmd = ReadCommand(self._readIDCommand, self._isiProgram._varTable.get(self._readIDCommand))
self._stack[-1].append(cmd)
}
			;

cmdescrita	: 'escreva' {self._exprType = "any"}
                 AP
                 termo
                 {
varName = self._ctx.getChild(-1).getText()
self._readIDCommand = str(varName)
}
                 FP
                 SC
{
variavel = self._isiProgram._varTable.get(self._readIDCommand)
if(variavel != None):
     tipo = variavel.getType()
else:
     tipo = IsiVariable.TEXT
cmd = WriteCommand(self._readIDCommand, tipo)
self._stack[-1].append(cmd)
}
			;

invalidcmd : ID 
{
#print("Comando nao reconhecido, subindo exception...")
raise IsiSemanticException("Erro Semantico! Comando {} nao reconhecido ou mal utilizado!".format(self._ctx.getChild(-1).getText()))   
}            AP(ID | NUMBER | expr | termo | TEXT) FP SC
          ;

invalidcmdleitura : 'leia' AP FP{raise IsiSemanticException("Erro Semantico! Comando de leitura sem uma variavel para armazenar a entrada do terminal !!")} SC
                  ;


invalidcmdselecao : invalidcmdselecaocond  | invalidcmdselecaocmdv | invalidcmdselecaocmdf
                  ;

invalidcmdselecaocmdv : 'se' AP ID OPREL termo FP ACH FCH{raise IsiSemanticException("Erro Semantico! Comando de selecao sem comando para condicao == Verdadeiro !!")} ('senao' ACH (cmd)+ FCH)
                  ;

invalidcmdselecaocmdf : 'se' AP ID OPREL termo FP ACH (cmd)+ FCH 'senao' ACH FCH{raise IsiSemanticException("Erro Semantico! Comando de selecao, com uso de SENAO, sem comando para condicao == Falso !!")}
                  ;

invalidcmdselecaocond : 'se' AP (TEXT | BOOL | NUMBER | ID)? FP{raise IsiSemanticException("Erro Semantico! Comando de selecao sem condicao de verificacao, ou condicao mal formulada!!")} ACH (cmd)+ FCH ('senao' ACH (cmd)+ FCH)
                  ;

invalidcmdenquanto : invalidcmdenquantocond | invalidcmdenquantocmd
                   ;

invalidcmdenquantocond :  'enquanto' AP (TEXT | BOOL | NUMBER | ID)? FP{raise IsiSemanticException("Erro Semantico! Comando Enquanto sem condicao de verificacao, ou condicao mal formulada!!")} ACH (cmd)+ FCH
                       ;

invalidcmdenquantocmd :   'enquanto' AP ID OPREL termo FP ACH FCH {raise IsiSemanticException("Erro Semantico! Comando Enquanto sem utilizacao de comandos internos, looping sem nenhuma utilidade!!")}
                      ;


cmdattrib	:  ID {
varName = self._ctx.getChild(-1).getText()
self.checkVar(varName)
self._exprID = varName
self._exprType = self._isiProgram._varTable.get(varName).getTypeStr()
}
               ATTR{
self._exprContent = ""
               }
               expr
               SC{
cmd = AttribCommand(self._exprID, self._exprContent)
self._stack[-1].append(cmd)
               }
			;


cmdselecao  :  'se' AP
                    ID {
varName = self._ctx.getChild(-1).getText()
self.checkVar(varName)
self._exprDecision = varName
self._exprType = self._isiProgram._varTable.get(varName).getTypeStr()
}
                   OPREL{
self._exprDecision += self._ctx.getChild(-1).getText()
}
                    termo{
self._exprDecision += self._ctx.getChild(-1).getText()
}
                    FP
                    ACH{
self._exprDecisionStack.append(self._exprDecision)
self._elseCheck = False
self._elseCheckStack.append(False)
self._curThread = []
self._stack.append(self._curThread)
}
                    (cmd)+

                    FCH{
self._trueList = self._stack.pop()
}
                   ('senao'
                   	 ACH{
self._elseCheck = True
self._elseCheckStack[-1] = True
self._curThread = []
self._stack.append(self._curThread)
}
                   	(cmd+)
                   	FCH{
self._falseList = self._stack.pop()
cmd = DecisionCommand(self._exprDecisionStack.pop(), self._trueList, self._falseList)
self._stack[-1].append(cmd)
}
                   )?{
if(self._elseCheckStack.pop() == False):
    cmd = DecisionCommand(self._exprDecisionStack.pop(), self._trueList, [])
    self._stack[-1].append(cmd)
else:
    self._elseCheck = False
}
            ;

cmdenquanto    : 'enquanto' AP
                            ID{
varName = self._ctx.getChild(-1).getText()
self.checkVar(varName)
self._exprDecision = varName
self._exprType = self._isiProgram._varTable.get(varName).getTypeStr()
}
                    OPREL{
self._exprDecision += self._ctx.getChild(-1).getText()
}
                    termo{
self._exprDecision += self._ctx.getChild(-1).getText()
}
                    FP
                    ACH{
self._exprDecisionStack.append(self._exprDecision)
self._curThread = []
self._stack.append(self._curThread)
}
                    (cmd)+
                    FCH{
self._cmdList = self._stack.pop()
cmd = WhileCommand(self._exprDecisionStack.pop(), self._cmdList)
self._stack[-1].append(cmd)
}
               ;


expr		:  termo (
	             OP{
self._exprContent += self._ctx.getChild(-1).getText() 
                  }
	            termo 
	            )*
			;

termo		: ID {
varName = self._ctx.getChild(-1).getText()
self.checkVar(varName)
self._exprContent += varName
self.checkVarType(self._isiProgram._varTable.get(varName))
}
            |
              NUMBER{
varName = self._ctx.getChild(-1).getText()
self._exprContent += varName
self.checkVarType(IsiVariable(f"Número {varName}", IsiVariable.NUMBER, varName, False))
              }
            |
              TEXT{
varName = self._ctx.getChild(-1).getText()
self._exprContent += varName
self.checkVarType(IsiVariable(f"Texto {varName}", IsiVariable.TEXT, varName, False))
            }
            |
               BOOL{
varName = self._ctx.getChild(-1).getText()
self._exprContent += varName
self.checkVarType(IsiVariable(f"Bool {varName}", IsiVariable.BOOL, varName, False))               
}
			;


invalidelse : 'senao'
{
raise IsiSemanticException("Erro Semantico! Palavra reservada SENAO utilizada erroneamente antes do SE!") 
}
            ;



AP	: '('
	;

FP	: ')'
	;

SC	: ';'
	;

OP	: '+' | '-' | '*' | '/' | '**' | '//' | '%'
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

BOOL : 'verdadeiro' | 'falso'
     ;

ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;

NUMBER	: [0-9]+ ('.' [0-9]+)?
		;

TEXT : '"' (~["])* '"'
    ;

NOTCMD : [a-z] ([a-z])*
     ;

WS	: (' ' | '\t' | '\n' | '\r') -> skip
     ;
