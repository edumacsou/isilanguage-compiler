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
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30")
        buf.write("\u00a9\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7")
        buf.write("\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r")
        buf.write("\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23")
        buf.write("\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2")
        buf.write("\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3")
        buf.write("\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5")
        buf.write("\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3")
        buf.write("\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n")
        buf.write("\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16")
        buf.write("\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23")
        buf.write("\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0087\n\23\3")
        buf.write("\24\3\24\7\24\u008b\n\24\f\24\16\24\u008e\13\24\3\25\6")
        buf.write("\25\u0091\n\25\r\25\16\25\u0092\3\25\3\25\6\25\u0097\n")
        buf.write("\25\r\25\16\25\u0098\5\25\u009b\n\25\3\26\3\26\7\26\u009f")
        buf.write("\n\26\f\26\16\26\u00a2\13\26\3\26\3\26\3\27\3\27\3\27")
        buf.write("\3\27\2\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13")
        buf.write("\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26")
        buf.write("+\27-\30\3\2\t\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\")
        buf.write("c|\3\2\62;\6\2\"\"\62;C\\c|\5\2\13\f\17\17\"\"\2\u00b1")
        buf.write("\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13")
        buf.write("\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3")
        buf.write("\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2")
        buf.write("\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2")
        buf.write("%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2")
        buf.write("\3/\3\2\2\2\58\3\2\2\2\7A\3\2\2\2\tH\3\2\2\2\13N\3\2\2")
        buf.write("\2\rS\3\2\2\2\17[\3\2\2\2\21^\3\2\2\2\23d\3\2\2\2\25m")
        buf.write("\3\2\2\2\27o\3\2\2\2\31q\3\2\2\2\33s\3\2\2\2\35u\3\2\2")
        buf.write("\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%\u0086\3\2\2\2\'\u0088")
        buf.write("\3\2\2\2)\u0090\3\2\2\2+\u009c\3\2\2\2-\u00a5\3\2\2\2")
        buf.write("/\60\7r\2\2\60\61\7t\2\2\61\62\7q\2\2\62\63\7i\2\2\63")
        buf.write("\64\7t\2\2\64\65\7c\2\2\65\66\7o\2\2\66\67\7c\2\2\67\4")
        buf.write("\3\2\2\289\7h\2\29:\7k\2\2:;\7o\2\2;<\7r\2\2<=\7t\2\2")
        buf.write("=>\7q\2\2>?\7i\2\2?@\7=\2\2@\6\3\2\2\2AB\7p\2\2BC\7w\2")
        buf.write("\2CD\7o\2\2DE\7g\2\2EF\7t\2\2FG\7q\2\2G\b\3\2\2\2HI\7")
        buf.write("v\2\2IJ\7g\2\2JK\7z\2\2KL\7v\2\2LM\7q\2\2M\n\3\2\2\2N")
        buf.write("O\7n\2\2OP\7g\2\2PQ\7k\2\2QR\7c\2\2R\f\3\2\2\2ST\7g\2")
        buf.write("\2TU\7u\2\2UV\7e\2\2VW\7t\2\2WX\7g\2\2XY\7x\2\2YZ\7c\2")
        buf.write("\2Z\16\3\2\2\2[\\\7u\2\2\\]\7g\2\2]\20\3\2\2\2^_\7u\2")
        buf.write("\2_`\7g\2\2`a\7p\2\2ab\7c\2\2bc\7q\2\2c\22\3\2\2\2de\7")
        buf.write("g\2\2ef\7p\2\2fg\7s\2\2gh\7w\2\2hi\7c\2\2ij\7p\2\2jk\7")
        buf.write("v\2\2kl\7q\2\2l\24\3\2\2\2mn\7*\2\2n\26\3\2\2\2op\7+\2")
        buf.write("\2p\30\3\2\2\2qr\7=\2\2r\32\3\2\2\2st\t\2\2\2t\34\3\2")
        buf.write("\2\2uv\7?\2\2v\36\3\2\2\2wx\7.\2\2x \3\2\2\2yz\7}\2\2")
        buf.write("z\"\3\2\2\2{|\7\177\2\2|$\3\2\2\2}\u0087\t\3\2\2~\177")
        buf.write("\7@\2\2\177\u0087\7?\2\2\u0080\u0081\7>\2\2\u0081\u0087")
        buf.write("\7?\2\2\u0082\u0083\7?\2\2\u0083\u0087\7?\2\2\u0084\u0085")
        buf.write("\7#\2\2\u0085\u0087\7?\2\2\u0086}\3\2\2\2\u0086~\3\2\2")
        buf.write("\2\u0086\u0080\3\2\2\2\u0086\u0082\3\2\2\2\u0086\u0084")
        buf.write("\3\2\2\2\u0087&\3\2\2\2\u0088\u008c\t\4\2\2\u0089\u008b")
        buf.write("\t\5\2\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2\u008c")
        buf.write("\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d(\3\2\2\2\u008e")
        buf.write("\u008c\3\2\2\2\u008f\u0091\t\6\2\2\u0090\u008f\3\2\2\2")
        buf.write("\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3")
        buf.write("\2\2\2\u0093\u009a\3\2\2\2\u0094\u0096\7\60\2\2\u0095")
        buf.write("\u0097\t\6\2\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2")
        buf.write("\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\3")
        buf.write("\2\2\2\u009a\u0094\3\2\2\2\u009a\u009b\3\2\2\2\u009b*")
        buf.write("\3\2\2\2\u009c\u00a0\7$\2\2\u009d\u009f\t\7\2\2\u009e")
        buf.write("\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2")
        buf.write("\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3")
        buf.write("\2\2\2\u00a3\u00a4\7$\2\2\u00a4,\3\2\2\2\u00a5\u00a6\t")
        buf.write("\b\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\27\2\2\u00a8")
        buf.write(".\3\2\2\2\13\2\u0086\u008a\u008c\u0092\u0098\u009a\u009e")
        buf.write("\u00a0\3\b\2\2")
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
    TEXT = 21
    WS = 22

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'programa'", "'fimprog;'", "'numero'", "'texto'", "'leia'", 
            "'escreva'", "'se'", "'senao'", "'enquanto'", "'('", "')'", 
            "';'", "'='", "','", "'{'", "'}'" ]

    symbolicNames = [ "<INVALID>",
            "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", 
            "ID", "NUMBER", "TEXT", "WS" ]

    ruleNames = [ "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", 
                  "T__7", "T__8", "AP", "FP", "SC", "OP", "ATTR", "VIR", 
                  "ACH", "FCH", "OPREL", "ID", "NUMBER", "TEXT", "WS" ]

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
      if var.getType() != self._exprType and self._exprType != "any":
        raise IsiSemanticException("Erro Semantico! Esperava variável '{}' do tipo {}, mas possui tipo {}! ".format(var.getName(), self._exprType, var.getType()))

    def generatePyCode(self, outputname="stdOutput.py"):
        return self._isiProgram.generatePyTarget(outputname)
         


