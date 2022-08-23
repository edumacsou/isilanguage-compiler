// Generated from f:\UFABC\Github\isilanguage-compiler\app\IsiLang.g4 by ANTLR 4.9.2
 

from isiExceptions import IsiSemanticException
from isiSymbol import IsiSymbol
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable
from isiProgram import IsiProgram, AbstractCommand, ReadCommand, WriteCommand, AttribCommand, DecisionCommand, WhileCommand


import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AP=11, FP=12, SC=13, OP=14, ATTR=15, VIR=16, ACH=17, FCH=18, 
		OPREL=19, BOOL=20, ID=21, NUMBER=22, TEXT=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", 
			"BOOL", "ID", "NUMBER", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'booleano'", 
			"'leia'", "'escreva'", "'se'", "'senao'", "'enquanto'", "'('", "')'", 
			"';'", null, "'='", "','", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "AP", 
			"FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "BOOL", "ID", 
			"NUMBER", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}



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
	     


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00c7\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u0094\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00a5\n\25\3\26\3\26\7\26\u00a9\n\26\f\26\16"+
		"\26\u00ac\13\26\3\27\6\27\u00af\n\27\r\27\16\27\u00b0\3\27\3\27\6\27\u00b5"+
		"\n\27\r\27\16\27\u00b6\5\27\u00b9\n\27\3\30\3\30\7\30\u00bd\n\30\f\30"+
		"\16\30\u00c0\13\30\3\30\3\30\3\31\3\31\3\31\3\31\2\2\32\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\3\2\t\5\2,-//\61\61\4\2>>@@\3\2c|\5\2"+
		"\62;C\\c|\3\2\62;\6\2\"\"\62;C\\c|\5\2\13\f\17\17\"\"\2\u00d0\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\3\63\3\2\2\2\5<\3\2\2\2\7E\3\2\2\2\tL\3\2\2\2\13R\3\2\2\2\r[\3"+
		"\2\2\2\17`\3\2\2\2\21h\3\2\2\2\23k\3\2\2\2\25q\3\2\2\2\27z\3\2\2\2\31"+
		"|\3\2\2\2\33~\3\2\2\2\35\u0080\3\2\2\2\37\u0082\3\2\2\2!\u0084\3\2\2\2"+
		"#\u0086\3\2\2\2%\u0088\3\2\2\2\'\u0093\3\2\2\2)\u00a4\3\2\2\2+\u00a6\3"+
		"\2\2\2-\u00ae\3\2\2\2/\u00ba\3\2\2\2\61\u00c3\3\2\2\2\63\64\7r\2\2\64"+
		"\65\7t\2\2\65\66\7q\2\2\66\67\7i\2\2\678\7t\2\289\7c\2\29:\7o\2\2:;\7"+
		"c\2\2;\4\3\2\2\2<=\7h\2\2=>\7k\2\2>?\7o\2\2?@\7r\2\2@A\7t\2\2AB\7q\2\2"+
		"BC\7i\2\2CD\7=\2\2D\6\3\2\2\2EF\7p\2\2FG\7w\2\2GH\7o\2\2HI\7g\2\2IJ\7"+
		"t\2\2JK\7q\2\2K\b\3\2\2\2LM\7v\2\2MN\7g\2\2NO\7z\2\2OP\7v\2\2PQ\7q\2\2"+
		"Q\n\3\2\2\2RS\7d\2\2ST\7q\2\2TU\7q\2\2UV\7n\2\2VW\7g\2\2WX\7c\2\2XY\7"+
		"p\2\2YZ\7q\2\2Z\f\3\2\2\2[\\\7n\2\2\\]\7g\2\2]^\7k\2\2^_\7c\2\2_\16\3"+
		"\2\2\2`a\7g\2\2ab\7u\2\2bc\7e\2\2cd\7t\2\2de\7g\2\2ef\7x\2\2fg\7c\2\2"+
		"g\20\3\2\2\2hi\7u\2\2ij\7g\2\2j\22\3\2\2\2kl\7u\2\2lm\7g\2\2mn\7p\2\2"+
		"no\7c\2\2op\7q\2\2p\24\3\2\2\2qr\7g\2\2rs\7p\2\2st\7s\2\2tu\7w\2\2uv\7"+
		"c\2\2vw\7p\2\2wx\7v\2\2xy\7q\2\2y\26\3\2\2\2z{\7*\2\2{\30\3\2\2\2|}\7"+
		"+\2\2}\32\3\2\2\2~\177\7=\2\2\177\34\3\2\2\2\u0080\u0081\t\2\2\2\u0081"+
		"\36\3\2\2\2\u0082\u0083\7?\2\2\u0083 \3\2\2\2\u0084\u0085\7.\2\2\u0085"+
		"\"\3\2\2\2\u0086\u0087\7}\2\2\u0087$\3\2\2\2\u0088\u0089\7\177\2\2\u0089"+
		"&\3\2\2\2\u008a\u0094\t\3\2\2\u008b\u008c\7@\2\2\u008c\u0094\7?\2\2\u008d"+
		"\u008e\7>\2\2\u008e\u0094\7?\2\2\u008f\u0090\7?\2\2\u0090\u0094\7?\2\2"+
		"\u0091\u0092\7#\2\2\u0092\u0094\7?\2\2\u0093\u008a\3\2\2\2\u0093\u008b"+
		"\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008f\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"(\3\2\2\2\u0095\u0096\7x\2\2\u0096\u0097\7g\2\2\u0097\u0098\7t\2\2\u0098"+
		"\u0099\7f\2\2\u0099\u009a\7c\2\2\u009a\u009b\7f\2\2\u009b\u009c\7g\2\2"+
		"\u009c\u009d\7k\2\2\u009d\u009e\7t\2\2\u009e\u00a5\7q\2\2\u009f\u00a0"+
		"\7h\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3"+
		"\u00a5\7q\2\2\u00a4\u0095\3\2\2\2\u00a4\u009f\3\2\2\2\u00a5*\3\2\2\2\u00a6"+
		"\u00aa\t\4\2\2\u00a7\u00a9\t\5\2\2\u00a8\u00a7\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab,\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00af\t\6\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b8\3\2\2\2\u00b2\u00b4\7\60"+
		"\2\2\u00b3\u00b5\t\6\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b9\3\2\2\2\u00b8\u00b2\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9.\3\2\2\2\u00ba\u00be\7$\2\2\u00bb\u00bd"+
		"\t\7\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c2\7$"+
		"\2\2\u00c2\60\3\2\2\2\u00c3\u00c4\t\b\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\b\31\2\2\u00c6\62\3\2\2\2\f\2\u0093\u00a4\u00a8\u00aa\u00b0\u00b6\u00b8"+
		"\u00bc\u00be\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}