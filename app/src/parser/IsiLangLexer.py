# Generated from IsiLang.g4 by ANTLR 4.7.2
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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27")
        buf.write("\u009e\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\2\3\2\3")
        buf.write("\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3")
        buf.write("\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b")
        buf.write("\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3")
        buf.write("\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17")
        buf.write("\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23")
        buf.write("\3\23\3\23\3\23\3\23\3\23\5\23\u0085\n\23\3\24\3\24\7")
        buf.write("\24\u0089\n\24\f\24\16\24\u008c\13\24\3\25\6\25\u008f")
        buf.write("\n\25\r\25\16\25\u0090\3\25\3\25\6\25\u0095\n\25\r\25")
        buf.write("\16\25\u0096\5\25\u0099\n\25\3\26\3\26\3\26\3\26\2\2\27")
        buf.write("\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31")
        buf.write("\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\b\5")
        buf.write("\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13")
        buf.write("\f\17\17\"\"\2\u00a5\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2")
        buf.write("\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2")
        buf.write("\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31")
        buf.write("\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2")
        buf.write("\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3")
        buf.write("\2\2\2\3-\3\2\2\2\5\66\3\2\2\2\7?\3\2\2\2\tF\3\2\2\2\13")
        buf.write("L\3\2\2\2\rQ\3\2\2\2\17Y\3\2\2\2\21\\\3\2\2\2\23b\3\2")
        buf.write("\2\2\25k\3\2\2\2\27m\3\2\2\2\31o\3\2\2\2\33q\3\2\2\2\35")
        buf.write("s\3\2\2\2\37u\3\2\2\2!w\3\2\2\2#y\3\2\2\2%\u0084\3\2\2")
        buf.write("\2\'\u0086\3\2\2\2)\u008e\3\2\2\2+\u009a\3\2\2\2-.\7r")
        buf.write("\2\2./\7t\2\2/\60\7q\2\2\60\61\7i\2\2\61\62\7t\2\2\62")
        buf.write("\63\7c\2\2\63\64\7o\2\2\64\65\7c\2\2\65\4\3\2\2\2\66\67")
        buf.write("\7h\2\2\678\7k\2\289\7o\2\29:\7r\2\2:;\7t\2\2;<\7q\2\2")
        buf.write("<=\7i\2\2=>\7=\2\2>\6\3\2\2\2?@\7p\2\2@A\7w\2\2AB\7o\2")
        buf.write("\2BC\7g\2\2CD\7t\2\2DE\7q\2\2E\b\3\2\2\2FG\7v\2\2GH\7")
        buf.write("g\2\2HI\7z\2\2IJ\7v\2\2JK\7q\2\2K\n\3\2\2\2LM\7n\2\2M")
        buf.write("N\7g\2\2NO\7k\2\2OP\7c\2\2P\f\3\2\2\2QR\7g\2\2RS\7u\2")
        buf.write("\2ST\7e\2\2TU\7t\2\2UV\7g\2\2VW\7x\2\2WX\7c\2\2X\16\3")
        buf.write("\2\2\2YZ\7u\2\2Z[\7g\2\2[\20\3\2\2\2\\]\7u\2\2]^\7g\2")
        buf.write("\2^_\7p\2\2_`\7c\2\2`a\7q\2\2a\22\3\2\2\2bc\7g\2\2cd\7")
        buf.write("p\2\2de\7s\2\2ef\7w\2\2fg\7c\2\2gh\7p\2\2hi\7v\2\2ij\7")
        buf.write("q\2\2j\24\3\2\2\2kl\7*\2\2l\26\3\2\2\2mn\7+\2\2n\30\3")
        buf.write("\2\2\2op\7=\2\2p\32\3\2\2\2qr\t\2\2\2r\34\3\2\2\2st\7")
        buf.write("?\2\2t\36\3\2\2\2uv\7.\2\2v \3\2\2\2wx\7}\2\2x\"\3\2\2")
        buf.write("\2yz\7\177\2\2z$\3\2\2\2{\u0085\t\3\2\2|}\7@\2\2}\u0085")
        buf.write("\7?\2\2~\177\7>\2\2\177\u0085\7?\2\2\u0080\u0081\7?\2")
        buf.write("\2\u0081\u0085\7?\2\2\u0082\u0083\7#\2\2\u0083\u0085\7")
        buf.write("?\2\2\u0084{\3\2\2\2\u0084|\3\2\2\2\u0084~\3\2\2\2\u0084")
        buf.write("\u0080\3\2\2\2\u0084\u0082\3\2\2\2\u0085&\3\2\2\2\u0086")
        buf.write("\u008a\t\4\2\2\u0087\u0089\t\5\2\2\u0088\u0087\3\2\2\2")
        buf.write("\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3")
        buf.write("\2\2\2\u008b(\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008f")
        buf.write("\t\6\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090")
        buf.write("\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0098\3\2\2\2")
        buf.write("\u0092\u0094\7\60\2\2\u0093\u0095\t\6\2\2\u0094\u0093")
        buf.write("\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2\2\2\u0096")
        buf.write("\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0092\3\2\2\2")
        buf.write("\u0098\u0099\3\2\2\2\u0099*\3\2\2\2\u009a\u009b\t\7\2")
        buf.write("\2\u009b\u009c\3\2\2\2\u009c\u009d\b\26\2\2\u009d,\3\2")
        buf.write("\2\2\t\2\u0084\u0088\u008a\u0090\u0096\u0098\3\b\2\2")
        return buf.getvalue()


class IsiLangLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    T__0 = 1
    T__1 = 2
    T__2 = 3
    T__3 = 4
    T__4 = 5
    T__5 = 6
    T__6 = 7
    T__7 = 8
    T__8 = 9
    AP = 10
    FP = 11
    SC = 12
    OP = 13
    ATTR = 14
    VIR = 15
    ACH = 16
    FCH = 17
    OPREL = 18
    ID = 19
    NUMBER = 20
    WS = 21

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'programa'", "'fimprog;'", "'numero'", "'texto'", "'leia'", 
            "'escreva'", "'se'", "'senao'", "'enquanto'", "'('", "')'", 
            "';'", "'='", "','", "'{'", "'}'" ]

    symbolicNames = [ "<INVALID>",
            "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", 
            "ID", "NUMBER", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "AP", "FP", "SC", "OP", "ATTR", "VIR", 
                  "ACH", "FCH", "OPREL", "ID", "NUMBER", "WS" ]

    grammarFileName = "IsiLang.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None



    def setTipo(self, tipo):
      self._tipo = tipo
    def getTipo(self):
      return self._tipo

    def checkVar(self, varName):
      if not self._symbolTable.exists(varName):
        raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente! ".format(varName))
      self._symbolTable.setUsed(varName)


