# Generated from IsiLang.g4 by ANTLR 4.7.2
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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33")
        buf.write("\u00d6\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30")
        buf.write("\4\31\t\31\4\32\t\32\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3")
        buf.write("\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4")
        buf.write("\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3")
        buf.write("\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b")
        buf.write("\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3")
        buf.write("\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3")
        buf.write("\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0089")
        buf.write("\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24")
        buf.write("\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u009c\n\24\3")
        buf.write("\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25")
        buf.write("\3\25\3\25\3\25\3\25\5\25\u00ad\n\25\3\26\3\26\7\26\u00b1")
        buf.write("\n\26\f\26\16\26\u00b4\13\26\3\27\6\27\u00b7\n\27\r\27")
        buf.write("\16\27\u00b8\3\27\3\27\6\27\u00bd\n\27\r\27\16\27\u00be")
        buf.write("\5\27\u00c1\n\27\3\30\3\30\7\30\u00c5\n\30\f\30\16\30")
        buf.write("\u00c8\13\30\3\30\3\30\3\31\3\31\7\31\u00ce\n\31\f\31")
        buf.write("\16\31\u00d1\13\31\3\32\3\32\3\32\3\32\2\2\33\3\3\5\4")
        buf.write("\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17")
        buf.write("\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63")
        buf.write("\33\3\2\t\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2")
        buf.write("\62;\3\2$$\5\2\13\f\17\17\"\"\2\u00e3\2\3\3\2\2\2\2\5")
        buf.write("\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2")
        buf.write("\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2")
        buf.write("\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2")
        buf.write("\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2")
        buf.write("\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61")
        buf.write("\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5>\3\2\2\2\7G\3\2\2")
        buf.write("\2\tN\3\2\2\2\13T\3\2\2\2\r]\3\2\2\2\17b\3\2\2\2\21j\3")
        buf.write("\2\2\2\23m\3\2\2\2\25s\3\2\2\2\27|\3\2\2\2\31~\3\2\2\2")
        buf.write("\33\u0080\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c")
        buf.write("\3\2\2\2#\u008e\3\2\2\2%\u0090\3\2\2\2\'\u009b\3\2\2\2")
        buf.write(")\u00ac\3\2\2\2+\u00ae\3\2\2\2-\u00b6\3\2\2\2/\u00c2\3")
        buf.write("\2\2\2\61\u00cb\3\2\2\2\63\u00d2\3\2\2\2\65\66\7r\2\2")
        buf.write("\66\67\7t\2\2\678\7q\2\289\7i\2\29:\7t\2\2:;\7c\2\2;<")
        buf.write("\7o\2\2<=\7c\2\2=\4\3\2\2\2>?\7h\2\2?@\7k\2\2@A\7o\2\2")
        buf.write("AB\7r\2\2BC\7t\2\2CD\7q\2\2DE\7i\2\2EF\7=\2\2F\6\3\2\2")
        buf.write("\2GH\7p\2\2HI\7w\2\2IJ\7o\2\2JK\7g\2\2KL\7t\2\2LM\7q\2")
        buf.write("\2M\b\3\2\2\2NO\7v\2\2OP\7g\2\2PQ\7z\2\2QR\7v\2\2RS\7")
        buf.write("q\2\2S\n\3\2\2\2TU\7d\2\2UV\7q\2\2VW\7q\2\2WX\7n\2\2X")
        buf.write("Y\7g\2\2YZ\7c\2\2Z[\7p\2\2[\\\7q\2\2\\\f\3\2\2\2]^\7n")
        buf.write("\2\2^_\7g\2\2_`\7k\2\2`a\7c\2\2a\16\3\2\2\2bc\7g\2\2c")
        buf.write("d\7u\2\2de\7e\2\2ef\7t\2\2fg\7g\2\2gh\7x\2\2hi\7c\2\2")
        buf.write("i\20\3\2\2\2jk\7u\2\2kl\7g\2\2l\22\3\2\2\2mn\7u\2\2no")
        buf.write("\7g\2\2op\7p\2\2pq\7c\2\2qr\7q\2\2r\24\3\2\2\2st\7g\2")
        buf.write("\2tu\7p\2\2uv\7s\2\2vw\7w\2\2wx\7c\2\2xy\7p\2\2yz\7v\2")
        buf.write("\2z{\7q\2\2{\26\3\2\2\2|}\7*\2\2}\30\3\2\2\2~\177\7+\2")
        buf.write("\2\177\32\3\2\2\2\u0080\u0081\7=\2\2\u0081\34\3\2\2\2")
        buf.write("\u0082\u0089\t\2\2\2\u0083\u0084\7,\2\2\u0084\u0089\7")
        buf.write(",\2\2\u0085\u0086\7\61\2\2\u0086\u0089\7\61\2\2\u0087")
        buf.write("\u0089\7\'\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2")
        buf.write("\u0088\u0085\3\2\2\2\u0088\u0087\3\2\2\2\u0089\36\3\2")
        buf.write("\2\2\u008a\u008b\7?\2\2\u008b \3\2\2\2\u008c\u008d\7.")
        buf.write("\2\2\u008d\"\3\2\2\2\u008e\u008f\7}\2\2\u008f$\3\2\2\2")
        buf.write("\u0090\u0091\7\177\2\2\u0091&\3\2\2\2\u0092\u009c\t\3")
        buf.write("\2\2\u0093\u0094\7@\2\2\u0094\u009c\7?\2\2\u0095\u0096")
        buf.write("\7>\2\2\u0096\u009c\7?\2\2\u0097\u0098\7?\2\2\u0098\u009c")
        buf.write("\7?\2\2\u0099\u009a\7#\2\2\u009a\u009c\7?\2\2\u009b\u0092")
        buf.write("\3\2\2\2\u009b\u0093\3\2\2\2\u009b\u0095\3\2\2\2\u009b")
        buf.write("\u0097\3\2\2\2\u009b\u0099\3\2\2\2\u009c(\3\2\2\2\u009d")
        buf.write("\u009e\7x\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7t\2\2\u00a0")
        buf.write("\u00a1\7f\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7f\2\2\u00a3")
        buf.write("\u00a4\7g\2\2\u00a4\u00a5\7k\2\2\u00a5\u00a6\7t\2\2\u00a6")
        buf.write("\u00ad\7q\2\2\u00a7\u00a8\7h\2\2\u00a8\u00a9\7c\2\2\u00a9")
        buf.write("\u00aa\7n\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ad\7q\2\2\u00ac")
        buf.write("\u009d\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad*\3\2\2\2\u00ae")
        buf.write("\u00b2\t\4\2\2\u00af\u00b1\t\5\2\2\u00b0\u00af\3\2\2\2")
        buf.write("\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3")
        buf.write("\2\2\2\u00b3,\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7")
        buf.write("\t\6\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8")
        buf.write("\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c0\3\2\2\2")
        buf.write("\u00ba\u00bc\7\60\2\2\u00bb\u00bd\t\6\2\2\u00bc\u00bb")
        buf.write("\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bc\3\2\2\2\u00be")
        buf.write("\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00ba\3\2\2\2")
        buf.write("\u00c0\u00c1\3\2\2\2\u00c1.\3\2\2\2\u00c2\u00c6\7$\2\2")
        buf.write("\u00c3\u00c5\n\7\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3")
        buf.write("\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9")
        buf.write("\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00ca\7$\2\2\u00ca")
        buf.write("\60\3\2\2\2\u00cb\u00cf\t\4\2\2\u00cc\u00ce\t\4\2\2\u00cd")
        buf.write("\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2")
        buf.write("\u00cf\u00d0\3\2\2\2\u00d0\62\3\2\2\2\u00d1\u00cf\3\2")
        buf.write("\2\2\u00d2\u00d3\t\b\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5")
        buf.write("\b\32\2\2\u00d5\64\3\2\2\2\r\2\u0088\u009b\u00ac\u00b0")
        buf.write("\u00b2\u00b8\u00be\u00c0\u00c6\u00cf\3\b\2\2")
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
    T__9 = 10
    AP = 11
    FP = 12
    SC = 13
    OP = 14
    ATTR = 15
    VIR = 16
    ACH = 17
    FCH = 18
    OPREL = 19
    BOOL = 20
    ID = 21
    NUMBER = 22
    TEXT = 23
    NOTCMD = 24
    WS = 25

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'programa'", "'fimprog;'", "'numero'", "'texto'", "'booleano'", 
            "'leia'", "'escreva'", "'se'", "'senao'", "'enquanto'", "'('", 
            "')'", "';'", "'='", "','", "'{'", "'}'" ]

    symbolicNames = [ "<INVALID>",
            "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", 
            "BOOL", "ID", "NUMBER", "TEXT", "NOTCMD", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "T__9", "AP", "FP", "SC", "OP", "ATTR", 
                  "VIR", "ACH", "FCH", "OPREL", "BOOL", "ID", "NUMBER", 
                  "TEXT", "NOTCMD", "WS" ]

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
        raise IsiSemanticException("Erro Semantico! A variavel {} NAO existe! ".format(varName))
      self._symbolTable.setUsed(varName)

    def checkVarType(self, var):
      if var.getTypeStr() != self._exprType and self._exprType != "any":
        raise IsiSemanticException("Erro Semantico! Esperava valor do tipo {}, mas recebeu {}, que possui tipo {}! ".format( self._exprType, var.getName(), var.getTypeStr()))

    def generatePyCode(self, outputname="stdOutput.py"):
        return self._isiProgram.generatePyTarget(outputname)
         


