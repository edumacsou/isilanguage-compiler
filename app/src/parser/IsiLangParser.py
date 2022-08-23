# Generated from IsiLang.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

 

from isiExceptions import IsiSemanticException
from isiSymbol import IsiSymbol
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable
from isiProgram import IsiProgram, AbstractCommand, ReadCommand, WriteCommand, AttribCommand, DecisionCommand, WhileCommand



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30")
        buf.write("\u00a5\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3%\n\3\r\3\16")
        buf.write("\3&\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4")
        buf.write("\3\4\3\4\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\6\6>\n\6\r\6")
        buf.write("\16\6?\3\7\3\7\3\7\3\7\3\7\5\7G\n\7\3\b\3\b\3\b\3\b\3")
        buf.write("\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n")
        buf.write("\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13")
        buf.write("\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13n\n\13\r\13\16")
        buf.write("\13o\3\13\3\13\3\13\3\13\3\13\3\13\6\13x\n\13\r\13\16")
        buf.write("\13y\3\13\3\13\3\13\5\13\177\n\13\3\f\3\f\3\f\3\f\3\f")
        buf.write("\3\f\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u008d\n\f\r\f\16\f\u008e")
        buf.write("\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r\u0098\n\r\f\r\16\r\u009b")
        buf.write("\13\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00a3\n\16\3")
        buf.write("\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00a6")
        buf.write("\2\34\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b9\3\2\2\2\n;\3\2")
        buf.write("\2\2\fF\3\2\2\2\16H\3\2\2\2\20P\3\2\2\2\22Y\3\2\2\2\24")
        buf.write("a\3\2\2\2\26\u0080\3\2\2\2\30\u0093\3\2\2\2\32\u00a2\3")
        buf.write("\2\2\2\34\35\b\2\1\2\35\36\7\3\2\2\36\37\5\4\3\2\37 \5")
        buf.write("\n\6\2 !\7\4\2\2!\"\b\2\1\2\"\3\3\2\2\2#%\5\6\4\2$#\3")
        buf.write("\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2()\5")
        buf.write("\b\5\2)*\7\25\2\2*\60\b\4\1\2+,\7\21\2\2,-\7\25\2\2-/")
        buf.write("\b\4\1\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2")
        buf.write("\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\16\2\2\64\7\3\2")
        buf.write("\2\2\65\66\7\5\2\2\66:\b\5\1\2\678\7\6\2\28:\b\5\1\29")
        buf.write("\65\3\2\2\29\67\3\2\2\2:\t\3\2\2\2;=\b\6\1\2<>\5\f\7\2")
        buf.write("=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@\13\3\2\2\2A")
        buf.write("G\5\16\b\2BG\5\20\t\2CG\5\22\n\2DG\5\24\13\2EG\5\26\f")
        buf.write("\2FA\3\2\2\2FB\3\2\2\2FC\3\2\2\2FD\3\2\2\2FE\3\2\2\2G")
        buf.write("\r\3\2\2\2HI\7\7\2\2IJ\7\f\2\2JK\7\25\2\2KL\b\b\1\2LM")
        buf.write("\7\r\2\2MN\7\16\2\2NO\b\b\1\2O\17\3\2\2\2PQ\7\b\2\2QR")
        buf.write("\b\t\1\2RS\7\f\2\2ST\5\32\16\2TU\b\t\1\2UV\7\r\2\2VW\7")
        buf.write("\16\2\2WX\b\t\1\2X\21\3\2\2\2YZ\7\25\2\2Z[\b\n\1\2[\\")
        buf.write("\7\20\2\2\\]\b\n\1\2]^\5\30\r\2^_\7\16\2\2_`\b\n\1\2`")
        buf.write("\23\3\2\2\2ab\7\t\2\2bc\7\f\2\2cd\7\25\2\2de\b\13\1\2")
        buf.write("ef\7\24\2\2fg\b\13\1\2gh\5\32\16\2hi\b\13\1\2ij\7\r\2")
        buf.write("\2jk\7\22\2\2km\b\13\1\2ln\5\f\7\2ml\3\2\2\2no\3\2\2\2")
        buf.write("om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\23\2\2r~\b\13\1\2s")
        buf.write("t\7\n\2\2tu\7\22\2\2uw\b\13\1\2vx\5\f\7\2wv\3\2\2\2xy")
        buf.write("\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\23\2\2|}\b")
        buf.write("\13\1\2}\177\3\2\2\2~s\3\2\2\2~\177\3\2\2\2\177\25\3\2")
        buf.write("\2\2\u0080\u0081\7\13\2\2\u0081\u0082\7\f\2\2\u0082\u0083")
        buf.write("\7\25\2\2\u0083\u0084\b\f\1\2\u0084\u0085\7\24\2\2\u0085")
        buf.write("\u0086\b\f\1\2\u0086\u0087\5\32\16\2\u0087\u0088\b\f\1")
        buf.write("\2\u0088\u0089\7\r\2\2\u0089\u008a\7\22\2\2\u008a\u008c")
        buf.write("\b\f\1\2\u008b\u008d\5\f\7\2\u008c\u008b\3\2\2\2\u008d")
        buf.write("\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2")
        buf.write("\u008f\u0090\3\2\2\2\u0090\u0091\7\23\2\2\u0091\u0092")
        buf.write("\b\f\1\2\u0092\27\3\2\2\2\u0093\u0099\5\32\16\2\u0094")
        buf.write("\u0095\7\17\2\2\u0095\u0096\b\r\1\2\u0096\u0098\5\32\16")
        buf.write("\2\u0097\u0094\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097")
        buf.write("\3\2\2\2\u0099\u009a\3\2\2\2\u009a\31\3\2\2\2\u009b\u0099")
        buf.write("\3\2\2\2\u009c\u009d\7\25\2\2\u009d\u00a3\b\16\1\2\u009e")
        buf.write("\u009f\7\26\2\2\u009f\u00a3\b\16\1\2\u00a0\u00a1\7\27")
        buf.write("\2\2\u00a1\u00a3\b\16\1\2\u00a2\u009c\3\2\2\2\u00a2\u009e")
        buf.write("\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\33\3\2\2\2\r&\609?")
        buf.write("Foy~\u008e\u0099\u00a2")
        return buf.getvalue()


class IsiLangParser ( Parser ):

    grammarFileName = "IsiLang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'programa'", "'fimprog;'", "'numero'", 
                     "'texto'", "'leia'", "'escreva'", "'se'", "'senao'", 
                     "'enquanto'", "'('", "')'", "';'", "<INVALID>", "'='", 
                     "','", "'{'", "'}'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "AP", "FP", "SC", "OP", 
                      "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", 
                      "TEXT", "WS" ]

    RULE_prog = 0
    RULE_decl = 1
    RULE_declaravar = 2
    RULE_tipo = 3
    RULE_bloco = 4
    RULE_cmd = 5
    RULE_cmdleitura = 6
    RULE_cmdescrita = 7
    RULE_cmdattrib = 8
    RULE_cmdselecao = 9
    RULE_cmdenquanto = 10
    RULE_expr = 11
    RULE_termo = 12

    ruleNames =  [ "prog", "decl", "declaravar", "tipo", "bloco", "cmd", 
                   "cmdleitura", "cmdescrita", "cmdattrib", "cmdselecao", 
                   "cmdenquanto", "expr", "termo" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    AP=10
    FP=11
    SC=12
    OP=13
    ATTR=14
    VIR=15
    ACH=16
    FCH=17
    OPREL=18
    ID=19
    NUMBER=20
    TEXT=21
    WS=22

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    def setTipo(self, tipo):
      self._tipo = tipo
    def getTipo(self):
      return self._tipo


    def checkVar(self, varName):
      if not self._symbolTable.exists(varName):
        raise IsiSemanticException("Erro Semantico! A variavel {} NAO existe! ".format(varName))
      self._symbolTable.setUsed(varName)

    def checkVarType(self, var):
      if var.getType() != self._exprType and self._exprType != "any":
        raise IsiSemanticException("Erro Semantico! Esperava variável '{}' do tipo {}, mas possui tipo {}! ".format(var.getName(), self._exprType, var.getType()))

    def generatePyCode(self, outputname="stdOutput.py"):
        return self._isiProgram.generatePyTarget(outputname)
         



    class ProgContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def decl(self):
            return self.getTypedRuleContext(IsiLangParser.DeclContext,0)


        def bloco(self):
            return self.getTypedRuleContext(IsiLangParser.BlocoContext,0)


        def getRuleIndex(self):
            return IsiLangParser.RULE_prog

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProg" ):
                listener.enterProg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProg" ):
                listener.exitProg(self)




    def prog(self):

        localctx = IsiLangParser.ProgContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_prog)
        try:
            self.enterOuterAlt(localctx, 1)

            # comandos em python executados antes do inicio do programa
            self._symbolTable = IsiSymbolTable()
            self._isiProgram = IsiProgram()
            self._readIDCommand = None
            self._curThread = []
            self._stack = []   # pseudo stack usando lista, muito lento! Evoluir para uma implementacao melhor de pilha
            self._exprID = None
            self._exprContent = None
            self._exprDecision = None
            self._trueList = []
            self._falseList = []
            self._cmdList   = []
            self._exprType = None


            self.state = 27
            self.match(IsiLangParser.T__0)
            self.state = 28
            self.decl()
            self.state = 29
            self.bloco()
            self.state = 30
            self.match(IsiLangParser.T__1)

            # comandos em python executados no fim do programa
            self._symbolTable.checkUnused()
            self._isiProgram.setCommands(self._stack.pop())

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def declaravar(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(IsiLangParser.DeclaravarContext)
            else:
                return self.getTypedRuleContext(IsiLangParser.DeclaravarContext,i)


        def getRuleIndex(self):
            return IsiLangParser.RULE_decl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDecl" ):
                listener.enterDecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDecl" ):
                listener.exitDecl(self)




    def decl(self):

        localctx = IsiLangParser.DeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_decl)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 34 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 33
                self.declaravar()
                self.state = 36 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==IsiLangParser.T__2 or _la==IsiLangParser.T__3):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclaravarContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def tipo(self):
            return self.getTypedRuleContext(IsiLangParser.TipoContext,0)


        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(IsiLangParser.ID)
            else:
                return self.getToken(IsiLangParser.ID, i)

        def SC(self):
            return self.getToken(IsiLangParser.SC, 0)

        def VIR(self, i:int=None):
            if i is None:
                return self.getTokens(IsiLangParser.VIR)
            else:
                return self.getToken(IsiLangParser.VIR, i)

        def getRuleIndex(self):
            return IsiLangParser.RULE_declaravar

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDeclaravar" ):
                listener.enterDeclaravar(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDeclaravar" ):
                listener.exitDeclaravar(self)




    def declaravar(self):

        localctx = IsiLangParser.DeclaravarContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_declaravar)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            self.tipo()
            self.state = 39
            self.match(IsiLangParser.ID)

            symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

            if(self._symbolTable.exists(str(symbol.getName())) == False):
                 #print("Simbolo adicionado", symbol)
                 self._symbolTable.add(symbol)
            else:
                 raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
                                
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==IsiLangParser.VIR:
                self.state = 41
                self.match(IsiLangParser.VIR)
                self.state = 42
                self.match(IsiLangParser.ID)

                symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

                if(self._symbolTable.exists(str(symbol.getName())) == False):
                     #print("Simbolo adicionado", symbol)
                     self._symbolTable.add(symbol)
                else:
                     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))

                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 49
            self.match(IsiLangParser.SC)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TipoContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return IsiLangParser.RULE_tipo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTipo" ):
                listener.enterTipo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTipo" ):
                listener.exitTipo(self)




    def tipo(self):

        localctx = IsiLangParser.TipoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_tipo)
        try:
            self.state = 55
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.T__2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 51
                self.match(IsiLangParser.T__2)

                self.setTipo(IsiVariable.NUMBER)
                                    
                pass
            elif token in [IsiLangParser.T__3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 53
                self.match(IsiLangParser.T__3)

                self.setTipo(IsiVariable.TEXT)
                                    
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class BlocoContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cmd(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(IsiLangParser.CmdContext)
            else:
                return self.getTypedRuleContext(IsiLangParser.CmdContext,i)


        def getRuleIndex(self):
            return IsiLangParser.RULE_bloco

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterBloco" ):
                listener.enterBloco(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitBloco" ):
                listener.exitBloco(self)




    def bloco(self):

        localctx = IsiLangParser.BlocoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_bloco)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)

            self._curThread = []
            self._stack.append(self._curThread)

            self.state = 59 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 58
                self.cmd()
                self.state = 61 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.T__8) | (1 << IsiLangParser.ID))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmdContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def cmdleitura(self):
            return self.getTypedRuleContext(IsiLangParser.CmdleituraContext,0)


        def cmdescrita(self):
            return self.getTypedRuleContext(IsiLangParser.CmdescritaContext,0)


        def cmdattrib(self):
            return self.getTypedRuleContext(IsiLangParser.CmdattribContext,0)


        def cmdselecao(self):
            return self.getTypedRuleContext(IsiLangParser.CmdselecaoContext,0)


        def cmdenquanto(self):
            return self.getTypedRuleContext(IsiLangParser.CmdenquantoContext,0)


        def getRuleIndex(self):
            return IsiLangParser.RULE_cmd

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmd" ):
                listener.enterCmd(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmd" ):
                listener.exitCmd(self)




    def cmd(self):

        localctx = IsiLangParser.CmdContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_cmd)
        try:
            self.state = 68
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.T__4]:
                self.enterOuterAlt(localctx, 1)
                self.state = 63
                self.cmdleitura()
                pass
            elif token in [IsiLangParser.T__5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 64
                self.cmdescrita()
                pass
            elif token in [IsiLangParser.ID]:
                self.enterOuterAlt(localctx, 3)
                self.state = 65
                self.cmdattrib()
                pass
            elif token in [IsiLangParser.T__6]:
                self.enterOuterAlt(localctx, 4)
                self.state = 66
                self.cmdselecao()
                pass
            elif token in [IsiLangParser.T__8]:
                self.enterOuterAlt(localctx, 5)
                self.state = 67
                self.cmdenquanto()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmdleituraContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AP(self):
            return self.getToken(IsiLangParser.AP, 0)

        def ID(self):
            return self.getToken(IsiLangParser.ID, 0)

        def FP(self):
            return self.getToken(IsiLangParser.FP, 0)

        def SC(self):
            return self.getToken(IsiLangParser.SC, 0)

        def getRuleIndex(self):
            return IsiLangParser.RULE_cmdleitura

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmdleitura" ):
                listener.enterCmdleitura(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmdleitura" ):
                listener.exitCmdleitura(self)




    def cmdleitura(self):

        localctx = IsiLangParser.CmdleituraContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_cmdleitura)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 70
            self.match(IsiLangParser.T__4)
            self.state = 71
            self.match(IsiLangParser.AP)
            self.state = 72
            self.match(IsiLangParser.ID)

            self.checkVar(self._ctx.getChild(-1).getText())
            self._readIDCommand = str(self._ctx.getChild(-1))

            self.state = 74
            self.match(IsiLangParser.FP)
            self.state = 75
            self.match(IsiLangParser.SC)

            cmd = ReadCommand(self._readIDCommand, self._symbolTable.get(self._readIDCommand))
            self._stack[-1].append(cmd)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmdescritaContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AP(self):
            return self.getToken(IsiLangParser.AP, 0)

        def termo(self):
            return self.getTypedRuleContext(IsiLangParser.TermoContext,0)


        def FP(self):
            return self.getToken(IsiLangParser.FP, 0)

        def SC(self):
            return self.getToken(IsiLangParser.SC, 0)

        def getRuleIndex(self):
            return IsiLangParser.RULE_cmdescrita

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmdescrita" ):
                listener.enterCmdescrita(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmdescrita" ):
                listener.exitCmdescrita(self)




    def cmdescrita(self):

        localctx = IsiLangParser.CmdescritaContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_cmdescrita)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 78
            self.match(IsiLangParser.T__5)
            self._exprType = "any"
            self.state = 80
            self.match(IsiLangParser.AP)
            self.state = 81
            self.termo()

            varName = self._ctx.getChild(-1).getText()
            self._readIDCommand = str(varName)

            self.state = 83
            self.match(IsiLangParser.FP)
            self.state = 84
            self.match(IsiLangParser.SC)

            cmd = WriteCommand(self._readIDCommand)
            self._stack[-1].append(cmd)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmdattribContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(IsiLangParser.ID, 0)

        def ATTR(self):
            return self.getToken(IsiLangParser.ATTR, 0)

        def expr(self):
            return self.getTypedRuleContext(IsiLangParser.ExprContext,0)


        def SC(self):
            return self.getToken(IsiLangParser.SC, 0)

        def getRuleIndex(self):
            return IsiLangParser.RULE_cmdattrib

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmdattrib" ):
                listener.enterCmdattrib(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmdattrib" ):
                listener.exitCmdattrib(self)




    def cmdattrib(self):

        localctx = IsiLangParser.CmdattribContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_cmdattrib)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 87
            self.match(IsiLangParser.ID)

            varName = self._ctx.getChild(-1).getText()
            self.checkVar(varName)
            self._exprID = varName
            self._exprType = self._symbolTable.get(varName).getType()

            self.state = 89
            self.match(IsiLangParser.ATTR)

            self._exprContent = ""
                           
            self.state = 91
            self.expr()
            self.state = 92
            self.match(IsiLangParser.SC)

            cmd = AttribCommand(self._exprID, self._exprContent)
            self._stack[-1].append(cmd)
                           
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmdselecaoContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AP(self):
            return self.getToken(IsiLangParser.AP, 0)

        def ID(self):
            return self.getToken(IsiLangParser.ID, 0)

        def OPREL(self):
            return self.getToken(IsiLangParser.OPREL, 0)

        def termo(self):
            return self.getTypedRuleContext(IsiLangParser.TermoContext,0)


        def FP(self):
            return self.getToken(IsiLangParser.FP, 0)

        def ACH(self, i:int=None):
            if i is None:
                return self.getTokens(IsiLangParser.ACH)
            else:
                return self.getToken(IsiLangParser.ACH, i)

        def FCH(self, i:int=None):
            if i is None:
                return self.getTokens(IsiLangParser.FCH)
            else:
                return self.getToken(IsiLangParser.FCH, i)

        def cmd(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(IsiLangParser.CmdContext)
            else:
                return self.getTypedRuleContext(IsiLangParser.CmdContext,i)


        def getRuleIndex(self):
            return IsiLangParser.RULE_cmdselecao

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmdselecao" ):
                listener.enterCmdselecao(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmdselecao" ):
                listener.exitCmdselecao(self)




    def cmdselecao(self):

        localctx = IsiLangParser.CmdselecaoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_cmdselecao)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 95
            self.match(IsiLangParser.T__6)
            self.state = 96
            self.match(IsiLangParser.AP)
            self.state = 97
            self.match(IsiLangParser.ID)

            varName = self._ctx.getChild(-1).getText()
            self.checkVar(varName)
            self._exprDecision = varName
            self._exprType = self._symbolTable.get(varName).getType()

            self.state = 99
            self.match(IsiLangParser.OPREL)

            self._exprDecision += self._ctx.getChild(-1).getText()

            self.state = 101
            self.termo()

            self._exprDecision += self._ctx.getChild(-1).getText()

            self.state = 103
            self.match(IsiLangParser.FP)
            self.state = 104
            self.match(IsiLangParser.ACH)


            self._curThread = []
            self._stack.append(self._curThread)

            self.state = 107 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 106
                self.cmd()
                self.state = 109 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.T__8) | (1 << IsiLangParser.ID))) != 0)):
                    break

            self.state = 111
            self.match(IsiLangParser.FCH)

            self._trueList = self._stack.pop()

            self.state = 124
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==IsiLangParser.T__7:
                self.state = 113
                self.match(IsiLangParser.T__7)
                self.state = 114
                self.match(IsiLangParser.ACH)


                self._curThread = []
                self._stack.append(self._curThread)


                self.state = 117 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 116
                    self.cmd()
                    self.state = 119 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.T__8) | (1 << IsiLangParser.ID))) != 0)):
                        break

                self.state = 121
                self.match(IsiLangParser.FCH)

                self._falseList = self._stack.pop()
                cmd = DecisionCommand(self._exprDecision, self._trueList, self._falseList)
                self._stack[-1].append(cmd)



        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class CmdenquantoContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AP(self):
            return self.getToken(IsiLangParser.AP, 0)

        def ID(self):
            return self.getToken(IsiLangParser.ID, 0)

        def OPREL(self):
            return self.getToken(IsiLangParser.OPREL, 0)

        def termo(self):
            return self.getTypedRuleContext(IsiLangParser.TermoContext,0)


        def FP(self):
            return self.getToken(IsiLangParser.FP, 0)

        def ACH(self):
            return self.getToken(IsiLangParser.ACH, 0)

        def FCH(self):
            return self.getToken(IsiLangParser.FCH, 0)

        def cmd(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(IsiLangParser.CmdContext)
            else:
                return self.getTypedRuleContext(IsiLangParser.CmdContext,i)


        def getRuleIndex(self):
            return IsiLangParser.RULE_cmdenquanto

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCmdenquanto" ):
                listener.enterCmdenquanto(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCmdenquanto" ):
                listener.exitCmdenquanto(self)




    def cmdenquanto(self):

        localctx = IsiLangParser.CmdenquantoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_cmdenquanto)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 126
            self.match(IsiLangParser.T__8)
            self.state = 127
            self.match(IsiLangParser.AP)
            self.state = 128
            self.match(IsiLangParser.ID)

            varName = self._ctx.getChild(-1).getText()
            self.checkVar(varName)
            self._exprDecision = varName
            self._exprType = self._symbolTable.get(varName).getType()

            self.state = 130
            self.match(IsiLangParser.OPREL)

            self._exprDecision += self._ctx.getChild(-1).getText()

            self.state = 132
            self.termo()

            self._exprDecision += self._ctx.getChild(-1).getText()

            self.state = 134
            self.match(IsiLangParser.FP)
            self.state = 135
            self.match(IsiLangParser.ACH)


            self._curThread = []
            self._stack.append(self._curThread)

            self.state = 138 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 137
                self.cmd()
                self.state = 140 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.T__8) | (1 << IsiLangParser.ID))) != 0)):
                    break

            self.state = 142
            self.match(IsiLangParser.FCH)

            self._cmdList = self._stack.pop()
            cmd = WhileCommand(self._exprDecision, self._cmdList)
            self._stack[-1].append(cmd)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def termo(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(IsiLangParser.TermoContext)
            else:
                return self.getTypedRuleContext(IsiLangParser.TermoContext,i)


        def OP(self, i:int=None):
            if i is None:
                return self.getTokens(IsiLangParser.OP)
            else:
                return self.getToken(IsiLangParser.OP, i)

        def getRuleIndex(self):
            return IsiLangParser.RULE_expr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpr" ):
                listener.enterExpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpr" ):
                listener.exitExpr(self)




    def expr(self):

        localctx = IsiLangParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 145
            self.termo()
            self.state = 151
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==IsiLangParser.OP:
                self.state = 146
                self.match(IsiLangParser.OP)

                self._exprContent += self._ctx.getChild(-1).getText() 
                                  
                self.state = 148
                self.termo()
                self.state = 153
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TermoContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ID(self):
            return self.getToken(IsiLangParser.ID, 0)

        def NUMBER(self):
            return self.getToken(IsiLangParser.NUMBER, 0)

        def TEXT(self):
            return self.getToken(IsiLangParser.TEXT, 0)

        def getRuleIndex(self):
            return IsiLangParser.RULE_termo

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTermo" ):
                listener.enterTermo(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTermo" ):
                listener.exitTermo(self)




    def termo(self):

        localctx = IsiLangParser.TermoContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_termo)
        try:
            self.state = 160
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 154
                self.match(IsiLangParser.ID)

                varName = self._ctx.getChild(-1).getText()
                self.checkVar(varName)
                self._exprContent += varName
                self.checkVarType(self._symbolTable.get(varName))

                pass
            elif token in [IsiLangParser.NUMBER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 156
                self.match(IsiLangParser.NUMBER)

                varName = self._ctx.getChild(-1).getText()
                self._exprContent += varName
                self.checkVarType(IsiVariable(f"Número {varName}", IsiVariable.NUMBER, varName, False))
                              
                pass
            elif token in [IsiLangParser.TEXT]:
                self.enterOuterAlt(localctx, 3)
                self.state = 158
                self.match(IsiLangParser.TEXT)

                varName = self._ctx.getChild(-1).getText()
                self._exprContent += varName
                self.checkVarType(IsiVariable(f"Texto {varName}", IsiVariable.TEXT, varName, False))
                            
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





