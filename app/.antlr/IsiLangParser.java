// Generated from f:\UFABC\Github\isilanguage-compiler\app\IsiLang.g4 by ANTLR 4.9.2
 

from isiExceptions import IsiSemanticException
from isiSymbol import IsiSymbol
from isiVariable import IsiVariable
from isiSymbolTable import IsiSymbolTable
from isiProgram import IsiProgram, AbstractCommand, ReadCommand, WriteCommand, AttribCommand, DecisionCommand, WhileCommand


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, AP=11, FP=12, SC=13, OP=14, ATTR=15, VIR=16, ACH=17, FCH=18, 
		OPREL=19, BOOL=20, ID=21, NUMBER=22, TEXT=23, NOTCMD=24, WS=25;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_invalidcmd = 8, 
		RULE_invalidcmdleitura = 9, RULE_invalidcmdselecao = 10, RULE_invalidcmdselecaocmdv = 11, 
		RULE_invalidcmdselecaocmdf = 12, RULE_invalidcmdselecaocond = 13, RULE_invalidcmdenquanto = 14, 
		RULE_invalidcmdenquantocond = 15, RULE_invalidcmdenquantocmd = 16, RULE_cmdattrib = 17, 
		RULE_cmdselecao = 18, RULE_cmdenquanto = 19, RULE_expr = 20, RULE_termo = 21, 
		RULE_invalidelse = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
			"invalidcmd", "invalidcmdleitura", "invalidcmdselecao", "invalidcmdselecaocmdv", 
			"invalidcmdselecaocmdf", "invalidcmdselecaocond", "invalidcmdenquanto", 
			"invalidcmdenquantocond", "invalidcmdenquantocmd", "cmdattrib", "cmdselecao", 
			"cmdenquanto", "expr", "termo", "invalidelse"
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
			"NUMBER", "TEXT", "NOTCMD", "WS"
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

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



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
	     

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{

			# comandos em python executados antes do inicio do programa
			self._symbolTable = IsiSymbolTable()
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


			setState(47);
			match(T__0);
			setState(48);
			decl();
			setState(49);
			bloco();
			setState(50);
			match(T__1);

			# comandos em python executados no fim do programa
			self._symbolTable.checkUnused()
			self._isiProgram.setCommands(self._stack.pop())

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				declaravar();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(IsiLangParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(IsiLangParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			tipo();
			setState(59);
			match(ID);

			symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

			if(self._symbolTable.exists(str(symbol.getName())) == False):
			     #print("Simbolo adicionado", symbol)
			     self._symbolTable.add(symbol)
			else:
			     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
			                    
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(61);
				match(VIR);
				setState(62);
				match(ID);

				symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

				if(self._symbolTable.exists(str(symbol.getName())) == False):
				     #print("Simbolo adicionado", symbol)
				     self._symbolTable.add(symbol)
				else:
				     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))

				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(T__2);

				self.setTipo(IsiVariable.NUMBER)
				                    
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(T__3);

				self.setTipo(IsiVariable.TEXT)
				                    
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__4);

				self.setTipo(IsiVariable.BOOL) 

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			self._curThread = []
			self._stack.append(self._curThread)

			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(80);
				cmd();
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public InvalidcmdleituraContext invalidcmdleitura() {
			return getRuleContext(InvalidcmdleituraContext.class,0);
		}
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public InvalidcmdContext invalidcmd() {
			return getRuleContext(InvalidcmdContext.class,0);
		}
		public InvalidcmdselecaoContext invalidcmdselecao() {
			return getRuleContext(InvalidcmdselecaoContext.class,0);
		}
		public InvalidcmdenquantoContext invalidcmdenquanto() {
			return getRuleContext(InvalidcmdenquantoContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdenquantoContext cmdenquanto() {
			return getRuleContext(CmdenquantoContext.class,0);
		}
		public InvalidelseContext invalidelse() {
			return getRuleContext(InvalidelseContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				invalidcmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				cmdleitura();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				cmdescrita();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				invalidcmd();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(89);
				invalidcmdselecao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				invalidcmdenquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				cmdattrib();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(92);
				cmdselecao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(93);
				cmdenquanto();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(94);
				invalidelse();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__5);
			setState(98);
			match(AP);
			setState(99);
			match(ID);

			print("Deu pau aqui no leia?")
			self.checkVar(self._ctx.getChild(-1).getText())
			self._readIDCommand = str(self._ctx.getChild(-1))

			setState(101);
			match(FP);
			setState(102);
			match(SC);

			cmd = ReadCommand(self._readIDCommand, self._symbolTable.get(self._readIDCommand))
			self._stack[-1].append(cmd)

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__6);
			self._exprType = "any"
			print("Deu pau aqui no escreva?")
			setState(108);
			match(AP);
			setState(109);
			termo();

			varName = self._ctx.getChild(-1).getText()
			self._readIDCommand = str(varName)

			setState(111);
			match(FP);
			setState(112);
			match(SC);

			cmd = WriteCommand(self._readIDCommand)
			self._stack[-1].append(cmd)

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public InvalidcmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmd; }
	}

	public final InvalidcmdContext invalidcmd() throws RecognitionException {
		InvalidcmdContext _localctx = new InvalidcmdContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_invalidcmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(ID);

			print("Comando nao reconhecido, subindo exception...")
			raise IsiSemanticException("Erro Semantico! Comando {} nao reconhecido ou mal utilizado!".format(self._ctx.getChild(-1).getText()))   

			setState(117);
			match(AP);
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(118);
				match(ID);
				}
				break;
			case 2:
				{
				setState(119);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(120);
				expr();
				}
				break;
			case 4:
				{
				setState(121);
				termo();
				}
				break;
			case 5:
				{
				setState(122);
				match(TEXT);
				}
				break;
			}
			setState(125);
			match(FP);
			setState(126);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public InvalidcmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdleitura; }
	}

	public final InvalidcmdleituraContext invalidcmdleitura() throws RecognitionException {
		InvalidcmdleituraContext _localctx = new InvalidcmdleituraContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_invalidcmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__5);
			setState(129);
			match(AP);
			setState(130);
			match(FP);
			raise IsiSemanticException("Erro Semantico! Comando de leitura sem uma variavel para armazenar a entrada do terminal !!")
			setState(132);
			match(SC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdselecaoContext extends ParserRuleContext {
		public InvalidcmdselecaocondContext invalidcmdselecaocond() {
			return getRuleContext(InvalidcmdselecaocondContext.class,0);
		}
		public InvalidcmdselecaocmdvContext invalidcmdselecaocmdv() {
			return getRuleContext(InvalidcmdselecaocmdvContext.class,0);
		}
		public InvalidcmdselecaocmdfContext invalidcmdselecaocmdf() {
			return getRuleContext(InvalidcmdselecaocmdfContext.class,0);
		}
		public InvalidcmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdselecao; }
	}

	public final InvalidcmdselecaoContext invalidcmdselecao() throws RecognitionException {
		InvalidcmdselecaoContext _localctx = new InvalidcmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_invalidcmdselecao);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				invalidcmdselecaocond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(135);
				invalidcmdselecaocmdv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(136);
				invalidcmdselecaocmdf();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdselecaocmdvContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(IsiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(IsiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(IsiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(IsiLangParser.FCH, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public InvalidcmdselecaocmdvContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdselecaocmdv; }
	}

	public final InvalidcmdselecaocmdvContext invalidcmdselecaocmdv() throws RecognitionException {
		InvalidcmdselecaocmdvContext _localctx = new InvalidcmdselecaocmdvContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_invalidcmdselecaocmdv);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__7);
			setState(140);
			match(AP);
			setState(141);
			match(ID);
			setState(142);
			match(OPREL);
			setState(143);
			termo();
			setState(144);
			match(FP);
			setState(145);
			match(ACH);
			setState(146);
			match(FCH);
			raise IsiSemanticException("Erro Semantico! Comando de selecao sem comando para condicao == Verdadeiro !!")
			{
			setState(148);
			match(T__8);
			setState(149);
			match(ACH);
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				cmd();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(155);
			match(FCH);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdselecaocmdfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(IsiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(IsiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(IsiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(IsiLangParser.FCH, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public InvalidcmdselecaocmdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdselecaocmdf; }
	}

	public final InvalidcmdselecaocmdfContext invalidcmdselecaocmdf() throws RecognitionException {
		InvalidcmdselecaocmdfContext _localctx = new InvalidcmdselecaocmdfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_invalidcmdselecaocmdf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__7);
			setState(158);
			match(AP);
			setState(159);
			match(ID);
			setState(160);
			match(OPREL);
			setState(161);
			termo();
			setState(162);
			match(FP);
			setState(163);
			match(ACH);
			setState(165); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(164);
				cmd();
				}
				}
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(169);
			match(FCH);
			setState(170);
			match(T__8);
			setState(171);
			match(ACH);
			setState(172);
			match(FCH);
			raise IsiSemanticException("Erro Semantico! Comando de selecao, com uso de SENAO, sem comando para condicao == Falso !!")
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdselecaocondContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(IsiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(IsiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(IsiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(IsiLangParser.FCH, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TerminalNode BOOL() { return getToken(IsiLangParser.BOOL, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public InvalidcmdselecaocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdselecaocond; }
	}

	public final InvalidcmdselecaocondContext invalidcmdselecaocond() throws RecognitionException {
		InvalidcmdselecaocondContext _localctx = new InvalidcmdselecaocondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_invalidcmdselecaocond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(T__7);
			setState(176);
			match(AP);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				setState(177);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(180);
			match(FP);
			raise IsiSemanticException("Erro Semantico! Comando de selecao sem condicao de verificacao, ou condicao mal formulada!!")
			setState(182);
			match(ACH);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				cmd();
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(188);
			match(FCH);
			{
			setState(189);
			match(T__8);
			setState(190);
			match(ACH);
			setState(192); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(191);
				cmd();
				}
				}
				setState(194); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(196);
			match(FCH);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdenquantoContext extends ParserRuleContext {
		public InvalidcmdenquantocondContext invalidcmdenquantocond() {
			return getRuleContext(InvalidcmdenquantocondContext.class,0);
		}
		public InvalidcmdenquantocmdContext invalidcmdenquantocmd() {
			return getRuleContext(InvalidcmdenquantocmdContext.class,0);
		}
		public InvalidcmdenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdenquanto; }
	}

	public final InvalidcmdenquantoContext invalidcmdenquanto() throws RecognitionException {
		InvalidcmdenquantoContext _localctx = new InvalidcmdenquantoContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_invalidcmdenquanto);
		try {
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				invalidcmdenquantocond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				invalidcmdenquantocmd();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdenquantocondContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TerminalNode BOOL() { return getToken(IsiLangParser.BOOL, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public InvalidcmdenquantocondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdenquantocond; }
	}

	public final InvalidcmdenquantocondContext invalidcmdenquantocond() throws RecognitionException {
		InvalidcmdenquantocondContext _localctx = new InvalidcmdenquantocondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_invalidcmdenquantocond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__9);
			setState(203);
			match(AP);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				setState(204);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << NUMBER) | (1L << TEXT))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(207);
			match(FP);
			raise IsiSemanticException("Erro Semantico! Comando Enquanto sem condicao de verificacao, ou condicao mal formulada!!")
			setState(209);
			match(ACH);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				cmd();
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(215);
			match(FCH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidcmdenquantocmdContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public InvalidcmdenquantocmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidcmdenquantocmd; }
	}

	public final InvalidcmdenquantocmdContext invalidcmdenquantocmd() throws RecognitionException {
		InvalidcmdenquantocmdContext _localctx = new InvalidcmdenquantocmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_invalidcmdenquantocmd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(T__9);
			setState(218);
			match(AP);
			setState(219);
			match(ID);
			setState(220);
			match(OPREL);
			setState(221);
			termo();
			setState(222);
			match(FP);
			setState(223);
			match(ACH);
			setState(224);
			match(FCH);
			raise IsiSemanticException("Erro Semantico! Comando Enquanto sem utilizacao de comandos internos, looping sem nenhuma utilidade!!")
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdattribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);

			print("Deu pau aqui no attrib?")
			varName = self._ctx.getChild(-1).getText()
			print("deu pau aqui vei: {}".format(varName))
			self.checkVar(varName)
			self._exprID = varName
			self._exprType = self._symbolTable.get(varName).getTypeStr()

			setState(229);
			match(ATTR);

			self._exprContent = ""
			               
			setState(231);
			expr();
			setState(232);
			match(SC);

			cmd = AttribCommand(self._exprID, self._exprContent)
			self._stack[-1].append(cmd)
			               
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(IsiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(IsiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(IsiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(IsiLangParser.FCH, i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__7);
			setState(236);
			match(AP);
			setState(237);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprDecision = varName
			self._exprType = self._symbolTable.get(varName).getTypeStr()

			setState(239);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(241);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(243);
			match(FP);
			setState(244);
			match(ACH);

			self._exprDecisionStack.append(self._exprDecision)
			self._elseCheck = False
			self._elseCheckStack.append(False)
			self._curThread = []
			self._stack.append(self._curThread)

			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				cmd();
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(251);
			match(FCH);

			self._trueList = self._stack.pop()

			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(253);
				match(T__8);
				setState(254);
				match(ACH);

				self._elseCheck = True
				self._elseCheckStack[-1] = True
				self._curThread = []
				self._stack.append(self._curThread)

				{
				setState(257); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(256);
					cmd();
					}
					}
					setState(259); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
				}
				setState(261);
				match(FCH);

				self._falseList = self._stack.pop()
				cmd = DecisionCommand(self._exprDecisionStack.pop(), self._trueList, self._falseList)
				self._stack[-1].append(cmd)

				}
				break;
			}

			if(self._elseCheckStack.pop() == False):
			    cmd = DecisionCommand(self._exprDecisionStack.pop(), self._trueList, [])
			    self._stack[-1].append(cmd)
			else:
			    self._elseCheck = False

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdenquantoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdenquanto; }
	}

	public final CmdenquantoContext cmdenquanto() throws RecognitionException {
		CmdenquantoContext _localctx = new CmdenquantoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__9);
			setState(269);
			match(AP);
			setState(270);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprDecision = varName
			self._exprType = self._symbolTable.get(varName).getTypeStr()

			setState(272);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(274);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(276);
			match(FP);
			setState(277);
			match(ACH);

			self._exprDecisionStack.append(self._exprDecision)
			self._curThread = []
			self._stack.append(self._curThread)

			setState(280); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(279);
				cmd();
				}
				}
				setState(282); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(284);
			match(FCH);

			self._cmdList = self._stack.pop()
			cmd = WhileCommand(self._exprDecisionStack.pop(), self._cmdList)
			self._stack[-1].append(cmd)

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> OP() { return getTokens(IsiLangParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(IsiLangParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			termo();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(288);
				match(OP);

				self._exprContent += self._ctx.getChild(-1).getText() 
				                  
				setState(290);
				termo();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TerminalNode BOOL() { return getToken(IsiLangParser.BOOL, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_termo);
		try {
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(ID);

				varName = self._ctx.getChild(-1).getText()
				self.checkVar(varName)
				self._exprContent += varName
				self.checkVarType(self._symbolTable.get(varName))

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				match(NUMBER);

				varName = self._ctx.getChild(-1).getText()
				self._exprContent += varName
				self.checkVarType(IsiVariable(f"Número {varName}", IsiVariable.NUMBER, varName, False))
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				match(TEXT);

				varName = self._ctx.getChild(-1).getText()
				self._exprContent += varName
				self.checkVarType(IsiVariable(f"Texto {varName}", IsiVariable.TEXT, varName, False))
				            
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(302);
				match(BOOL);

				varName = self._ctx.getChild(-1).getText()
				self._exprContent += varName
				self.checkVarType(IsiVariable(f"Bool {varName}", IsiVariable.BOOL, varName, False))               

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InvalidelseContext extends ParserRuleContext {
		public InvalidelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_invalidelse; }
	}

	public final InvalidelseContext invalidelse() throws RecognitionException {
		InvalidelseContext _localctx = new InvalidelseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_invalidelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__8);

			raise IsiSemanticException("Erro Semantico! Palavra reservada SENAO utilizada erroneamente antes do SE!") 

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0138\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\6\39\n\3\r\3\16\3:\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"C\n\4\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6"+
		"\6\6T\n\6\r\6\16\6U\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\6\r\u009a\n\r\r\r\16\r\u009b\3\r\3\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\6\16\u00a8\n\16\r\16\16\16\u00a9\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u00b5\n\17\3\17\3\17\3\17\3\17"+
		"\6\17\u00bb\n\17\r\17\16\17\u00bc\3\17\3\17\3\17\3\17\6\17\u00c3\n\17"+
		"\r\17\16\17\u00c4\3\17\3\17\3\20\3\20\5\20\u00cb\n\20\3\21\3\21\3\21\5"+
		"\21\u00d0\n\21\3\21\3\21\3\21\3\21\6\21\u00d6\n\21\r\21\16\21\u00d7\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\6\24\u00fa\n\24\r\24\16\24\u00fb\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\6\24\u0104\n\24\r\24\16\24\u0105\3\24\3\24\3\24\5\24\u010b"+
		"\n\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\6\25\u011b\n\25\r\25\16\25\u011c\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\7\26\u0126\n\26\f\26\16\26\u0129\13\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u0133\n\27\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\26\31\2\u0144\2\60\3\2\2\2\4"+
		"8\3\2\2\2\6<\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fa\3\2\2\2\16c\3\2\2\2\20k"+
		"\3\2\2\2\22u\3\2\2\2\24\u0082\3\2\2\2\26\u008b\3\2\2\2\30\u008d\3\2\2"+
		"\2\32\u009f\3\2\2\2\34\u00b1\3\2\2\2\36\u00ca\3\2\2\2 \u00cc\3\2\2\2\""+
		"\u00db\3\2\2\2$\u00e5\3\2\2\2&\u00ed\3\2\2\2(\u010e\3\2\2\2*\u0121\3\2"+
		"\2\2,\u0132\3\2\2\2.\u0134\3\2\2\2\60\61\b\2\1\2\61\62\7\3\2\2\62\63\5"+
		"\4\3\2\63\64\5\n\6\2\64\65\7\4\2\2\65\66\b\2\1\2\66\3\3\2\2\2\679\5\6"+
		"\4\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<=\5\b\5\2=>"+
		"\7\27\2\2>D\b\4\1\2?@\7\22\2\2@A\7\27\2\2AC\b\4\1\2B?\3\2\2\2CF\3\2\2"+
		"\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\17\2\2H\7\3\2\2\2IJ\7\5"+
		"\2\2JP\b\5\1\2KL\7\6\2\2LP\b\5\1\2MN\7\7\2\2NP\b\5\1\2OI\3\2\2\2OK\3\2"+
		"\2\2OM\3\2\2\2P\t\3\2\2\2QS\b\6\1\2RT\5\f\7\2SR\3\2\2\2TU\3\2\2\2US\3"+
		"\2\2\2UV\3\2\2\2V\13\3\2\2\2Wb\5\24\13\2Xb\5\16\b\2Yb\5\20\t\2Zb\5\22"+
		"\n\2[b\5\26\f\2\\b\5\36\20\2]b\5$\23\2^b\5&\24\2_b\5(\25\2`b\5.\30\2a"+
		"W\3\2\2\2aX\3\2\2\2aY\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2"+
		"a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\r\3\2\2\2cd\7\b\2\2de\7\r\2\2ef\7\27\2"+
		"\2fg\b\b\1\2gh\7\16\2\2hi\7\17\2\2ij\b\b\1\2j\17\3\2\2\2kl\7\t\2\2lm\b"+
		"\t\1\2mn\b\t\1\2no\7\r\2\2op\5,\27\2pq\b\t\1\2qr\7\16\2\2rs\7\17\2\2s"+
		"t\b\t\1\2t\21\3\2\2\2uv\7\27\2\2vw\b\n\1\2w}\7\r\2\2x~\7\27\2\2y~\7\30"+
		"\2\2z~\5*\26\2{~\5,\27\2|~\7\31\2\2}x\3\2\2\2}y\3\2\2\2}z\3\2\2\2}{\3"+
		"\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u0080\7\16\2\2\u0080\u0081\7\17\2\2"+
		"\u0081\23\3\2\2\2\u0082\u0083\7\b\2\2\u0083\u0084\7\r\2\2\u0084\u0085"+
		"\7\16\2\2\u0085\u0086\b\13\1\2\u0086\u0087\7\17\2\2\u0087\25\3\2\2\2\u0088"+
		"\u008c\5\34\17\2\u0089\u008c\5\30\r\2\u008a\u008c\5\32\16\2\u008b\u0088"+
		"\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d"+
		"\u008e\7\n\2\2\u008e\u008f\7\r\2\2\u008f\u0090\7\27\2\2\u0090\u0091\7"+
		"\25\2\2\u0091\u0092\5,\27\2\u0092\u0093\7\16\2\2\u0093\u0094\7\23\2\2"+
		"\u0094\u0095\7\24\2\2\u0095\u0096\b\r\1\2\u0096\u0097\7\13\2\2\u0097\u0099"+
		"\7\23\2\2\u0098\u009a\5\f\7\2\u0099\u0098\3\2\2\2\u009a\u009b\3\2\2\2"+
		"\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\7\24\2\2\u009e\31\3\2\2\2\u009f\u00a0\7\n\2\2\u00a0\u00a1\7\r\2\2\u00a1"+
		"\u00a2\7\27\2\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\5,\27\2\u00a4\u00a5\7"+
		"\16\2\2\u00a5\u00a7\7\23\2\2\u00a6\u00a8\5\f\7\2\u00a7\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\7\24\2\2\u00ac\u00ad\7\13\2\2\u00ad\u00ae\7\23\2\2\u00ae"+
		"\u00af\7\24\2\2\u00af\u00b0\b\16\1\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\n"+
		"\2\2\u00b2\u00b4\7\r\2\2\u00b3\u00b5\t\2\2\2\u00b4\u00b3\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\16\2\2\u00b7\u00b8\b"+
		"\17\1\2\u00b8\u00ba\7\23\2\2\u00b9\u00bb\5\f\7\2\u00ba\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2"+
		"\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0\7\13\2\2\u00c0\u00c2\7\23\2\2\u00c1"+
		"\u00c3\5\f\7\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\24\2\2\u00c7"+
		"\35\3\2\2\2\u00c8\u00cb\5 \21\2\u00c9\u00cb\5\"\22\2\u00ca\u00c8\3\2\2"+
		"\2\u00ca\u00c9\3\2\2\2\u00cb\37\3\2\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00cf"+
		"\7\r\2\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\7\16\2\2\u00d2\u00d3\b\21\1\2\u00d3\u00d5\7"+
		"\23\2\2\u00d4\u00d6\5\f\7\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\24"+
		"\2\2\u00da!\3\2\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\7\r\2\2\u00dd\u00de"+
		"\7\27\2\2\u00de\u00df\7\25\2\2\u00df\u00e0\5,\27\2\u00e0\u00e1\7\16\2"+
		"\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\7\24\2\2\u00e3\u00e4\b\22\1\2\u00e4"+
		"#\3\2\2\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\b\23\1\2\u00e7\u00e8\7\21\2"+
		"\2\u00e8\u00e9\b\23\1\2\u00e9\u00ea\5*\26\2\u00ea\u00eb\7\17\2\2\u00eb"+
		"\u00ec\b\23\1\2\u00ec%\3\2\2\2\u00ed\u00ee\7\n\2\2\u00ee\u00ef\7\r\2\2"+
		"\u00ef\u00f0\7\27\2\2\u00f0\u00f1\b\24\1\2\u00f1\u00f2\7\25\2\2\u00f2"+
		"\u00f3\b\24\1\2\u00f3\u00f4\5,\27\2\u00f4\u00f5\b\24\1\2\u00f5\u00f6\7"+
		"\16\2\2\u00f6\u00f7\7\23\2\2\u00f7\u00f9\b\24\1\2\u00f8\u00fa\5\f\7\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\7\24\2\2\u00fe\u010a\b\24\1\2"+
		"\u00ff\u0100\7\13\2\2\u0100\u0101\7\23\2\2\u0101\u0103\b\24\1\2\u0102"+
		"\u0104\5\f\7\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108\7\24\2\2\u0108"+
		"\u0109\b\24\1\2\u0109\u010b\3\2\2\2\u010a\u00ff\3\2\2\2\u010a\u010b\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\b\24\1\2\u010d\'\3\2\2\2\u010e"+
		"\u010f\7\f\2\2\u010f\u0110\7\r\2\2\u0110\u0111\7\27\2\2\u0111\u0112\b"+
		"\25\1\2\u0112\u0113\7\25\2\2\u0113\u0114\b\25\1\2\u0114\u0115\5,\27\2"+
		"\u0115\u0116\b\25\1\2\u0116\u0117\7\16\2\2\u0117\u0118\7\23\2\2\u0118"+
		"\u011a\b\25\1\2\u0119\u011b\5\f\7\2\u011a\u0119\3\2\2\2\u011b\u011c\3"+
		"\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2\u011e"+
		"\u011f\7\24\2\2\u011f\u0120\b\25\1\2\u0120)\3\2\2\2\u0121\u0127\5,\27"+
		"\2\u0122\u0123\7\20\2\2\u0123\u0124\b\26\1\2\u0124\u0126\5,\27\2\u0125"+
		"\u0122\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2"+
		"\2\2\u0128+\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012b\7\27\2\2\u012b\u0133"+
		"\b\27\1\2\u012c\u012d\7\30\2\2\u012d\u0133\b\27\1\2\u012e\u012f\7\31\2"+
		"\2\u012f\u0133\b\27\1\2\u0130\u0131\7\26\2\2\u0131\u0133\b\27\1\2\u0132"+
		"\u012a\3\2\2\2\u0132\u012c\3\2\2\2\u0132\u012e\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133-\3\2\2\2\u0134\u0135\7\13\2\2\u0135\u0136\b\30\1\2\u0136/\3"+
		"\2\2\2\27:DOUa}\u008b\u009b\u00a9\u00b4\u00bc\u00c4\u00ca\u00cf\u00d7"+
		"\u00fb\u0105\u010a\u011c\u0127\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}