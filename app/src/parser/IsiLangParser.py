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
from isiProgram import IsiProgram, AbstractCommand, ReadCommand, WriteCommand



def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27")
        buf.write("\u009d\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3%\n\3\r\3\16")
        buf.write("\3&\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4")
        buf.write("\3\4\3\4\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\6\6=\n\6\r\6\16")
        buf.write("\6>\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3")
        buf.write("\7\3\7\3\7\5\7P\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3")
        buf.write("\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n")
        buf.write("\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13q\n")
        buf.write("\13\r\13\16\13r\3\13\3\13\3\13\3\13\6\13y\n\13\r\13\16")
        buf.write("\13z\3\13\3\13\5\13\177\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3")
        buf.write("\f\3\f\3\f\6\f\u008a\n\f\r\f\16\f\u008b\3\f\3\f\3\r\3")
        buf.write("\r\3\r\7\r\u0093\n\r\f\r\16\r\u0096\13\r\3\16\3\16\3\16")
        buf.write("\5\16\u009b\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26")
        buf.write("\30\32\2\2\2\u009d\2\34\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2")
        buf.write("\b9\3\2\2\2\n<\3\2\2\2\fO\3\2\2\2\16Q\3\2\2\2\20Y\3\2")
        buf.write("\2\2\22a\3\2\2\2\24g\3\2\2\2\26\u0080\3\2\2\2\30\u008f")
        buf.write("\3\2\2\2\32\u009a\3\2\2\2\34\35\b\2\1\2\35\36\7\3\2\2")
        buf.write("\36\37\5\4\3\2\37 \5\n\6\2 !\7\4\2\2!\"\b\2\1\2\"\3\3")
        buf.write("\2\2\2#%\5\6\4\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2")
        buf.write("\2\2\'\5\3\2\2\2()\5\b\5\2)*\7\25\2\2*\60\b\4\1\2+,\7")
        buf.write("\21\2\2,-\7\25\2\2-/\b\4\1\2.+\3\2\2\2/\62\3\2\2\2\60")
        buf.write(".\3\2\2\2\60\61\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63")
        buf.write("\64\7\16\2\2\64\7\3\2\2\2\65\66\7\5\2\2\66:\b\5\1\2\67")
        buf.write("8\7\6\2\28:\b\5\1\29\65\3\2\2\29\67\3\2\2\2:\t\3\2\2\2")
        buf.write(";=\5\f\7\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>?\3\2\2\2?\13")
        buf.write("\3\2\2\2@A\5\16\b\2AB\b\7\1\2BP\3\2\2\2CD\5\20\t\2DE\b")
        buf.write("\7\1\2EP\3\2\2\2FG\5\22\n\2GH\b\7\1\2HP\3\2\2\2IJ\5\24")
        buf.write("\13\2JK\b\7\1\2KP\3\2\2\2LM\5\26\f\2MN\b\7\1\2NP\3\2\2")
        buf.write("\2O@\3\2\2\2OC\3\2\2\2OF\3\2\2\2OI\3\2\2\2OL\3\2\2\2P")
        buf.write("\r\3\2\2\2QR\7\7\2\2RS\7\f\2\2ST\7\25\2\2TU\b\b\1\2UV")
        buf.write("\7\r\2\2VW\7\16\2\2WX\b\b\1\2X\17\3\2\2\2YZ\7\b\2\2Z[")
        buf.write("\7\f\2\2[\\\7\25\2\2\\]\b\t\1\2]^\7\r\2\2^_\7\16\2\2_")
        buf.write("`\b\t\1\2`\21\3\2\2\2ab\7\25\2\2bc\b\n\1\2cd\7\20\2\2")
        buf.write("de\5\30\r\2ef\7\16\2\2f\23\3\2\2\2gh\7\t\2\2hi\7\f\2\2")
        buf.write("ij\7\25\2\2jk\b\13\1\2kl\7\24\2\2lm\5\32\16\2mn\7\r\2")
        buf.write("\2np\7\22\2\2oq\5\f\7\2po\3\2\2\2qr\3\2\2\2rp\3\2\2\2")
        buf.write("rs\3\2\2\2st\3\2\2\2t~\7\23\2\2uv\7\n\2\2vx\7\22\2\2w")
        buf.write("y\5\f\7\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3")
        buf.write("\2\2\2|}\7\23\2\2}\177\3\2\2\2~u\3\2\2\2~\177\3\2\2\2")
        buf.write("\177\25\3\2\2\2\u0080\u0081\7\13\2\2\u0081\u0082\7\f\2")
        buf.write("\2\u0082\u0083\7\25\2\2\u0083\u0084\b\f\1\2\u0084\u0085")
        buf.write("\7\24\2\2\u0085\u0086\5\32\16\2\u0086\u0087\7\r\2\2\u0087")
        buf.write("\u0089\7\22\2\2\u0088\u008a\5\f\7\2\u0089\u0088\3\2\2")
        buf.write("\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c")
        buf.write("\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\7\23\2\2\u008e")
        buf.write("\27\3\2\2\2\u008f\u0094\5\32\16\2\u0090\u0091\7\17\2\2")
        buf.write("\u0091\u0093\5\32\16\2\u0092\u0090\3\2\2\2\u0093\u0096")
        buf.write("\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095")
        buf.write("\31\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0098\7\25\2\2\u0098")
        buf.write("\u009b\b\16\1\2\u0099\u009b\7\26\2\2\u009a\u0097\3\2\2")
        buf.write("\2\u009a\u0099\3\2\2\2\u009b\33\3\2\2\2\r&\609>Orz~\u008b")
        buf.write("\u0094\u009a")
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
                      "WS" ]

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
    WS=21

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
        raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente! ".format(varName))
      self._symbolTable.setUsed(varName)



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
            self._exprID = None
            self._exprContent = None

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
            self._isiProgram.setCommands(self._curThread)

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
            self.state = 58 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 57
                self.cmd()
                self.state = 60 
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
            self.state = 77
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.T__4]:
                self.enterOuterAlt(localctx, 1)
                self.state = 62
                self.cmdleitura()
                print("Reconhecido comando de leitura!")    
                pass
            elif token in [IsiLangParser.T__5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 65
                self.cmdescrita()
                print("Reconhecido comando de escrita!")    
                pass
            elif token in [IsiLangParser.ID]:
                self.enterOuterAlt(localctx, 3)
                self.state = 68
                self.cmdattrib()
                print("Reconhecido comando de atribuicao!") 
                pass
            elif token in [IsiLangParser.T__6]:
                self.enterOuterAlt(localctx, 4)
                self.state = 71
                self.cmdselecao()
                print("Reconhecido comando de selecao!")    
                pass
            elif token in [IsiLangParser.T__8]:
                self.enterOuterAlt(localctx, 5)
                self.state = 74
                self.cmdenquanto()
                print("Reconhecido comando de enquanto!")    
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
            self.state = 79
            self.match(IsiLangParser.T__4)
            self.state = 80
            self.match(IsiLangParser.AP)
            self.state = 81
            self.match(IsiLangParser.ID)

            self.checkVar(self._ctx.getChild(-1).getText())
            self._readIDCommand = str(self._ctx.getChild(-1))

            self.state = 83
            self.match(IsiLangParser.FP)
            self.state = 84
            self.match(IsiLangParser.SC)

            cmd = ReadCommand(self._readIDCommand)
            self._curThread.append(cmd)

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

        def ID(self):
            return self.getToken(IsiLangParser.ID, 0)

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
            self.state = 87
            self.match(IsiLangParser.T__5)
            self.state = 88
            self.match(IsiLangParser.AP)
            self.state = 89
            self.match(IsiLangParser.ID)

            self.checkVar(self._ctx.getChild(-1).getText())
            self._readIDCommand = str(self._ctx.getChild(-1))

            self.state = 91
            self.match(IsiLangParser.FP)
            self.state = 92
            self.match(IsiLangParser.SC)

            cmd = WriteCommand(self._readIDCommand)
            self._curThread.append(cmd)

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
            self.state = 95
            self.match(IsiLangParser.ID)
            self.checkVar(self._ctx.getChild(-1).getText())
            self.state = 97
            self.match(IsiLangParser.ATTR)
            self.state = 98
            self.expr()
            self.state = 99
            self.match(IsiLangParser.SC)
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
            self.state = 101
            self.match(IsiLangParser.T__6)
            self.state = 102
            self.match(IsiLangParser.AP)
            self.state = 103
            self.match(IsiLangParser.ID)

            self.checkVar(self._ctx.getChild(-1).getText())

            self.state = 105
            self.match(IsiLangParser.OPREL)
            self.state = 106
            self.termo()
            self.state = 107
            self.match(IsiLangParser.FP)
            self.state = 108
            self.match(IsiLangParser.ACH)
            self.state = 110 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 109
                self.cmd()
                self.state = 112 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.T__8) | (1 << IsiLangParser.ID))) != 0)):
                    break

            self.state = 114
            self.match(IsiLangParser.FCH)
            self.state = 124
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==IsiLangParser.T__7:
                self.state = 115
                self.match(IsiLangParser.T__7)
                self.state = 116
                self.match(IsiLangParser.ACH)

                self.state = 118 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 117
                    self.cmd()
                    self.state = 120 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.T__8) | (1 << IsiLangParser.ID))) != 0)):
                        break

                self.state = 122
                self.match(IsiLangParser.FCH)


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

            self.checkVar(self._ctx.getChild(-1).getText())

            self.state = 130
            self.match(IsiLangParser.OPREL)
            self.state = 131
            self.termo()
            self.state = 132
            self.match(IsiLangParser.FP)
            self.state = 133
            self.match(IsiLangParser.ACH)
            self.state = 135 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 134
                self.cmd()
                self.state = 137 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.T__8) | (1 << IsiLangParser.ID))) != 0)):
                    break

            self.state = 139
            self.match(IsiLangParser.FCH)
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
            self.state = 141
            self.termo()
            self.state = 146
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==IsiLangParser.OP:
                self.state = 142
                self.match(IsiLangParser.OP)
                self.state = 143
                self.termo()
                self.state = 148
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
            self.state = 152
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 149
                self.match(IsiLangParser.ID)

                self.checkVar(self._ctx.getChild(-1).getText())

                pass
            elif token in [IsiLangParser.NUMBER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 151
                self.match(IsiLangParser.NUMBER)
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





