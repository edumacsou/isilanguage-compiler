# Generated from IsiLang.g4 by ANTLR 4.7.2
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

 

import isiExceptions
import isiSymbol
import isiVariable
import isiSymbolTable




def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26")
        buf.write("\u0093\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2")
        buf.write("\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3")
        buf.write("\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6")
        buf.write("\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3")
        buf.write("\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3")
        buf.write("\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3")
        buf.write("\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22z\n\22\3\23\3\23")
        buf.write("\7\23~\n\23\f\23\16\23\u0081\13\23\3\24\6\24\u0084\n\24")
        buf.write("\r\24\16\24\u0085\3\24\3\24\6\24\u008a\n\24\r\24\16\24")
        buf.write("\u008b\5\24\u008e\n\24\3\25\3\25\3\25\3\25\2\2\26\3\3")
        buf.write("\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16")
        buf.write("\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\b\5\2,-//")
        buf.write("\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\5\2\13\f\17")
        buf.write("\17\"\"\2\u009a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2")
        buf.write("\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21")
        buf.write("\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3")
        buf.write("\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2")
        buf.write("\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3+\3\2")
        buf.write("\2\2\5\64\3\2\2\2\7=\3\2\2\2\tD\3\2\2\2\13J\3\2\2\2\r")
        buf.write("O\3\2\2\2\17W\3\2\2\2\21Z\3\2\2\2\23`\3\2\2\2\25b\3\2")
        buf.write("\2\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37")
        buf.write("l\3\2\2\2!n\3\2\2\2#y\3\2\2\2%{\3\2\2\2\'\u0083\3\2\2")
        buf.write("\2)\u008f\3\2\2\2+,\7r\2\2,-\7t\2\2-.\7q\2\2./\7i\2\2")
        buf.write("/\60\7t\2\2\60\61\7c\2\2\61\62\7o\2\2\62\63\7c\2\2\63")
        buf.write("\4\3\2\2\2\64\65\7h\2\2\65\66\7k\2\2\66\67\7o\2\2\678")
        buf.write("\7r\2\289\7t\2\29:\7q\2\2:;\7i\2\2;<\7=\2\2<\6\3\2\2\2")
        buf.write("=>\7p\2\2>?\7w\2\2?@\7o\2\2@A\7g\2\2AB\7t\2\2BC\7q\2\2")
        buf.write("C\b\3\2\2\2DE\7v\2\2EF\7g\2\2FG\7z\2\2GH\7v\2\2HI\7q\2")
        buf.write("\2I\n\3\2\2\2JK\7n\2\2KL\7g\2\2LM\7k\2\2MN\7c\2\2N\f\3")
        buf.write("\2\2\2OP\7g\2\2PQ\7u\2\2QR\7e\2\2RS\7t\2\2ST\7g\2\2TU")
        buf.write("\7x\2\2UV\7c\2\2V\16\3\2\2\2WX\7u\2\2XY\7g\2\2Y\20\3\2")
        buf.write("\2\2Z[\7u\2\2[\\\7g\2\2\\]\7p\2\2]^\7c\2\2^_\7q\2\2_\22")
        buf.write("\3\2\2\2`a\7*\2\2a\24\3\2\2\2bc\7+\2\2c\26\3\2\2\2de\7")
        buf.write("=\2\2e\30\3\2\2\2fg\t\2\2\2g\32\3\2\2\2hi\7?\2\2i\34\3")
        buf.write("\2\2\2jk\7.\2\2k\36\3\2\2\2lm\7}\2\2m \3\2\2\2no\7\177")
        buf.write("\2\2o\"\3\2\2\2pz\t\3\2\2qr\7@\2\2rz\7?\2\2st\7>\2\2t")
        buf.write("z\7?\2\2uv\7?\2\2vz\7?\2\2wx\7#\2\2xz\7?\2\2yp\3\2\2\2")
        buf.write("yq\3\2\2\2ys\3\2\2\2yu\3\2\2\2yw\3\2\2\2z$\3\2\2\2{\177")
        buf.write("\t\4\2\2|~\t\5\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2")
        buf.write("\2\177\u0080\3\2\2\2\u0080&\3\2\2\2\u0081\177\3\2\2\2")
        buf.write("\u0082\u0084\t\6\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3")
        buf.write("\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u008d")
        buf.write("\3\2\2\2\u0087\u0089\7\60\2\2\u0088\u008a\t\6\2\2\u0089")
        buf.write("\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2")
        buf.write("\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3")
        buf.write("\2\2\2\u008d\u008e\3\2\2\2\u008e(\3\2\2\2\u008f\u0090")
        buf.write("\t\7\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\25\2\2\u0092")
        buf.write("*\3\2\2\2\t\2y}\177\u0085\u008b\u008d\3\b\2\2")
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
    AP = 9
    FP = 10
    SC = 11
    OP = 12
    ATTR = 13
    VIR = 14
    ACH = 15
    FCH = 16
    OPREL = 17
    ID = 18
    NUMBER = 19
    WS = 20

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'programa'", "'fimprog;'", "'numero'", "'texto'", "'leia'", 
            "'escreva'", "'se'", "'senao'", "'('", "')'", "';'", "'='", 
            "','", "'{'", "'}'" ]

    symbolicNames = [ "<INVALID>",
            "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", 
            "ID", "NUMBER", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", 
                  "FCH", "OPREL", "ID", "NUMBER", "WS" ]

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

    global _varName
    _varName = ""
    global _varValue
    _varValue = ""

    global symbolTable
    symbolTable = isiSymbolTable.IsiSymbolTable()



