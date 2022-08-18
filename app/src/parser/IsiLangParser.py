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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\26")
        buf.write("\u008c\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\3\2")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3#\n\3\r\3\16\3$\3\4\3")
        buf.write("\4\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\4\3\4\3")
        buf.write("\5\3\5\3\5\3\5\5\58\n\5\3\6\6\6;\n\6\r\6\16\6<\3\7\3\7")
        buf.write("\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7K\n\7\3\b")
        buf.write("\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3")
        buf.write("\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3")
        buf.write("\13\3\13\3\13\5\13j\n\13\3\13\3\13\3\13\6\13o\n\13\r\13")
        buf.write("\16\13p\3\13\3\13\3\13\3\13\6\13w\n\13\r\13\16\13x\3\13")
        buf.write("\3\13\5\13}\n\13\3\f\3\f\3\f\7\f\u0082\n\f\f\f\16\f\u0085")
        buf.write("\13\f\3\r\3\r\3\r\5\r\u008a\n\r\3\r\2\2\16\2\4\6\b\n\f")
        buf.write("\16\20\22\24\26\30\2\2\2\u008c\2\32\3\2\2\2\4\"\3\2\2")
        buf.write("\2\6&\3\2\2\2\b\67\3\2\2\2\n:\3\2\2\2\fJ\3\2\2\2\16L\3")
        buf.write("\2\2\2\20T\3\2\2\2\22\\\3\2\2\2\24a\3\2\2\2\26~\3\2\2")
        buf.write("\2\30\u0089\3\2\2\2\32\33\b\2\1\2\33\34\7\3\2\2\34\35")
        buf.write("\5\4\3\2\35\36\5\n\6\2\36\37\7\4\2\2\37 \b\2\1\2 \3\3")
        buf.write("\2\2\2!#\5\6\4\2\"!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2")
        buf.write("\2\2%\5\3\2\2\2&\'\5\b\5\2\'(\7\24\2\2(.\b\4\1\2)*\7\20")
        buf.write("\2\2*+\7\24\2\2+-\b\4\1\2,)\3\2\2\2-\60\3\2\2\2.,\3\2")
        buf.write("\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\r\2\2\62")
        buf.write("\7\3\2\2\2\63\64\7\5\2\2\648\b\5\1\2\65\66\7\6\2\2\66")
        buf.write("8\b\5\1\2\67\63\3\2\2\2\67\65\3\2\2\28\t\3\2\2\29;\5\f")
        buf.write("\7\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\13\3\2\2")
        buf.write("\2>?\5\16\b\2?@\b\7\1\2@K\3\2\2\2AB\5\20\t\2BC\b\7\1\2")
        buf.write("CK\3\2\2\2DE\5\22\n\2EF\b\7\1\2FK\3\2\2\2GH\5\24\13\2")
        buf.write("HI\b\7\1\2IK\3\2\2\2J>\3\2\2\2JA\3\2\2\2JD\3\2\2\2JG\3")
        buf.write("\2\2\2K\r\3\2\2\2LM\7\7\2\2MN\7\13\2\2NO\7\24\2\2OP\b")
        buf.write("\b\1\2PQ\7\f\2\2QR\7\r\2\2RS\b\b\1\2S\17\3\2\2\2TU\7\b")
        buf.write("\2\2UV\7\13\2\2VW\7\24\2\2WX\b\t\1\2XY\7\f\2\2YZ\7\r\2")
        buf.write("\2Z[\b\t\1\2[\21\3\2\2\2\\]\7\24\2\2]^\7\17\2\2^_\5\26")
        buf.write("\f\2_`\7\r\2\2`\23\3\2\2\2ab\7\t\2\2bc\7\13\2\2cd\7\24")
        buf.write("\2\2de\b\13\1\2ei\7\23\2\2fg\7\24\2\2gj\b\13\1\2hj\7\25")
        buf.write("\2\2if\3\2\2\2ih\3\2\2\2jk\3\2\2\2kl\7\f\2\2ln\7\21\2")
        buf.write("\2mo\5\f\7\2nm\3\2\2\2op\3\2\2\2pn\3\2\2\2pq\3\2\2\2q")
        buf.write("r\3\2\2\2r|\7\22\2\2st\7\n\2\2tv\7\21\2\2uw\5\f\7\2vu")
        buf.write("\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\22")
        buf.write("\2\2{}\3\2\2\2|s\3\2\2\2|}\3\2\2\2}\25\3\2\2\2~\u0083")
        buf.write("\5\30\r\2\177\u0080\7\16\2\2\u0080\u0082\5\30\r\2\u0081")
        buf.write("\177\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3\2\2\2\u0083")
        buf.write("\u0084\3\2\2\2\u0084\27\3\2\2\2\u0085\u0083\3\2\2\2\u0086")
        buf.write("\u0087\7\24\2\2\u0087\u008a\b\r\1\2\u0088\u008a\7\25\2")
        buf.write("\2\u0089\u0086\3\2\2\2\u0089\u0088\3\2\2\2\u008a\31\3")
        buf.write("\2\2\2\r$.\67<Jipx|\u0083\u0089")
        return buf.getvalue()


class IsiLangParser ( Parser ):

    grammarFileName = "IsiLang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'programa'", "'fimprog;'", "'numero'", 
                     "'texto'", "'leia'", "'escreva'", "'se'", "'senao'", 
                     "'('", "')'", "';'", "<INVALID>", "'='", "','", "'{'", 
                     "'}'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "AP", "FP", "SC", "OP", "ATTR", "VIR", 
                      "ACH", "FCH", "OPREL", "ID", "NUMBER", "WS" ]

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
    RULE_expr = 10
    RULE_termo = 11

    ruleNames =  [ "prog", "decl", "declaravar", "tipo", "bloco", "cmd", 
                   "cmdleitura", "cmdescrita", "cmdattrib", "cmdselecao", 
                   "expr", "termo" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    AP=9
    FP=10
    SC=11
    OP=12
    ATTR=13
    VIR=14
    ACH=15
    FCH=16
    OPREL=17
    ID=18
    NUMBER=19
    WS=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    def setTipo(self, tipo):
      self._tipo = tipo
    def getTipo(self):
      return self._tipo



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

            self.state = 25
            self.match(IsiLangParser.T__0)
            self.state = 26
            self.decl()
            self.state = 27
            self.bloco()
            self.state = 28
            self.match(IsiLangParser.T__1)

            # comandos em python executados no fim do programa

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
            self.state = 32 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 31
                self.declaravar()
                self.state = 34 
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
            self.state = 36
            self.tipo()
            self.state = 37
            self.match(IsiLangParser.ID)

            symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

            if(self._symbolTable.exists(str(symbol.getName())) == False):
                 #print("Simbolo adicionado", symbol)
                 self._symbolTable.add(symbol)
            else:
                 raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
                                
            self.state = 44
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==IsiLangParser.VIR:
                self.state = 39
                self.match(IsiLangParser.VIR)
                self.state = 40
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

            self.state = 47
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
            self.state = 53
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.T__2]:
                self.enterOuterAlt(localctx, 1)
                self.state = 49
                self.match(IsiLangParser.T__2)

                self.setTipo(IsiVariable.NUMBER)
                print("tipo lido: {}".format(self.getTipo())) 
                                    
                pass
            elif token in [IsiLangParser.T__3]:
                self.enterOuterAlt(localctx, 2)
                self.state = 51
                self.match(IsiLangParser.T__3)

                self.setTipo(IsiVariable.TEXT)
                print("tipo lido: {}".format(self.getTipo()))
                                    
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
            self.state = 56 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 55
                self.cmd()
                self.state = 58 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.ID))) != 0)):
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
            self.state = 72
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.T__4]:
                self.enterOuterAlt(localctx, 1)
                self.state = 60
                self.cmdleitura()
                print("Reconhecido comando de leitura!")    
                pass
            elif token in [IsiLangParser.T__5]:
                self.enterOuterAlt(localctx, 2)
                self.state = 63
                self.cmdescrita()
                print("Reconhecido comando de escrita!")    
                pass
            elif token in [IsiLangParser.ID]:
                self.enterOuterAlt(localctx, 3)
                self.state = 66
                self.cmdattrib()
                print("Reconhecido comando de atribuicao!") 
                pass
            elif token in [IsiLangParser.T__6]:
                self.enterOuterAlt(localctx, 4)
                self.state = 69
                self.cmdselecao()
                print("Reconhecido comando de selecao!")    
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
            self.state = 74
            self.match(IsiLangParser.T__4)
            self.state = 75
            self.match(IsiLangParser.AP)
            self.state = 76
            self.match(IsiLangParser.ID)

            if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
                 raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando inserir um valor nela!".format(self._ctx.getChild(-1)))
            else:
                 self._readIDCommand = str(self._ctx.getChild(-1))

            self.state = 78
            self.match(IsiLangParser.FP)
            self.state = 79
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
            self.state = 82
            self.match(IsiLangParser.T__5)
            self.state = 83
            self.match(IsiLangParser.AP)
            self.state = 84
            self.match(IsiLangParser.ID)

            if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
                 raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando imprimir ela!".format(self._ctx.getChild(-1)))
            else:
                 self._readIDCommand = str(self._ctx.getChild(-1))

            self.state = 86
            self.match(IsiLangParser.FP)
            self.state = 87
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
            self.state = 90
            self.match(IsiLangParser.ID)
            self.state = 91
            self.match(IsiLangParser.ATTR)
            self.state = 92
            self.expr()
            self.state = 93
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

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(IsiLangParser.ID)
            else:
                return self.getToken(IsiLangParser.ID, i)

        def OPREL(self):
            return self.getToken(IsiLangParser.OPREL, 0)

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

        def NUMBER(self):
            return self.getToken(IsiLangParser.NUMBER, 0)

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

            if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
                 raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando utilizar ela numa operacao logica!".format(self._ctx.getChild(-1)))


            self.state = 99
            self.match(IsiLangParser.OPREL)
            self.state = 103
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.ID]:
                self.state = 100
                self.match(IsiLangParser.ID)

                if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
                     raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando utilizar ela numa operacao logica!".format(self._ctx.getChild(-1)))


                pass
            elif token in [IsiLangParser.NUMBER]:
                self.state = 102
                self.match(IsiLangParser.NUMBER)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 105
            self.match(IsiLangParser.FP)
            self.state = 106
            self.match(IsiLangParser.ACH)
            self.state = 108 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 107
                self.cmd()
                self.state = 110 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.ID))) != 0)):
                    break

            self.state = 112
            self.match(IsiLangParser.FCH)
            self.state = 122
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==IsiLangParser.T__7:
                self.state = 113
                self.match(IsiLangParser.T__7)
                self.state = 114
                self.match(IsiLangParser.ACH)

                self.state = 116 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 115
                    self.cmd()
                    self.state = 118 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << IsiLangParser.T__4) | (1 << IsiLangParser.T__5) | (1 << IsiLangParser.T__6) | (1 << IsiLangParser.ID))) != 0)):
                        break

                self.state = 120
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
        self.enterRule(localctx, 20, self.RULE_expr)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 124
            self.termo()
            self.state = 129
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==IsiLangParser.OP:
                self.state = 125
                self.match(IsiLangParser.OP)
                self.state = 126
                self.termo()
                self.state = 131
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
        self.enterRule(localctx, 22, self.RULE_termo)
        try:
            self.state = 135
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [IsiLangParser.ID]:
                self.enterOuterAlt(localctx, 1)
                self.state = 132
                self.match(IsiLangParser.ID)

                if (self._symbolTable.exists(str(self._ctx.getChild(-1))) == False):
                     raise IsiSemanticException("Erro Semantico! A variavel '{}' nao foi declarada, e voce esta tentando utilizar ela numa expressao!".format(self._ctx.getChild(-1)))


                pass
            elif token in [IsiLangParser.NUMBER]:
                self.enterOuterAlt(localctx, 2)
                self.state = 134
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





