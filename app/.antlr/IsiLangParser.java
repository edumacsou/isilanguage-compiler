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


			setState(47);
			match(T__0);
			setState(48);
			decl();
			setState(49);
			bloco();
			setState(50);
			match(T__1);

			# comandos em python executados no fim do programa
			self._isiProgram._varTable.checkUnused()
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

			if(self._isiProgram._varTable.exists(str(symbol.getName())) == False):
			     print("Simbolo adicionado: {}".format(symbol.getName()))
			     self._isiProgram._varTable.add(symbol)
			     print("symbol table:{}".format(self._isiProgram._varTable._hashTable))
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

				if(self._isiProgram._varTable.exists(str(symbol.getName())) == False):
				     print("Simbolo adicionado: {}".format(symbol.getName()))
				     self._isiProgram._varTable.add(symbol)
				     print("symbol table:{}".format(self._isiProgram._varTable._hashTable))
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

			self.checkVar(self._ctx.getChild(-1).getText())
			self._readIDCommand = str(self._ctx.getChild(-1))

			setState(101);
			match(FP);
			setState(102);
			match(SC);

			cmd = ReadCommand(self._readIDCommand, self._isiProgram._varTable.get(self._readIDCommand))
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
			setState(107);
			match(AP);
			setState(108);
			termo();

			varName = self._ctx.getChild(-1).getText()
			self._readIDCommand = str(varName)

			setState(110);
			match(FP);
			setState(111);
			match(SC);

			variavel = self._isiProgram._varTable.get(self._readIDCommand)
			if(variavel != None):
			     tipo = variavel.getType()
			else:
			     tipo = IsiVariable.TEXT
			cmd = WriteCommand(self._readIDCommand, tipo)
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
			setState(114);
			match(ID);

			print("Comando nao reconhecido, subindo exception...")
			raise IsiSemanticException("Erro Semantico! Comando {} nao reconhecido ou mal utilizado!".format(self._ctx.getChild(-1).getText()))   

			setState(116);
			match(AP);
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(117);
				match(ID);
				}
				break;
			case 2:
				{
				setState(118);
				match(NUMBER);
				}
				break;
			case 3:
				{
				setState(119);
				expr();
				}
				break;
			case 4:
				{
				setState(120);
				termo();
				}
				break;
			case 5:
				{
				setState(121);
				match(TEXT);
				}
				break;
			}
			setState(124);
			match(FP);
			setState(125);
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
			setState(127);
			match(T__5);
			setState(128);
			match(AP);
			setState(129);
			match(FP);
			raise IsiSemanticException("Erro Semantico! Comando de leitura sem uma variavel para armazenar a entrada do terminal !!")
			setState(131);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				invalidcmdselecaocond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				invalidcmdselecaocmdv();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
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
			setState(138);
			match(T__7);
			setState(139);
			match(AP);
			setState(140);
			match(ID);
			setState(141);
			match(OPREL);
			setState(142);
			termo();
			setState(143);
			match(FP);
			setState(144);
			match(ACH);
			setState(145);
			match(FCH);
			raise IsiSemanticException("Erro Semantico! Comando de selecao sem comando para condicao == Verdadeiro !!")
			{
			setState(147);
			match(T__8);
			setState(148);
			match(ACH);
			setState(150); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(149);
				cmd();
				}
				}
				setState(152); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(154);
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
			setState(156);
			match(T__7);
			setState(157);
			match(AP);
			setState(158);
			match(ID);
			setState(159);
			match(OPREL);
			setState(160);
			termo();
			setState(161);
			match(FP);
			setState(162);
			match(ACH);
			setState(164); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(163);
				cmd();
				}
				}
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(168);
			match(FCH);
			setState(169);
			match(T__8);
			setState(170);
			match(ACH);
			setState(171);
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
			setState(174);
			match(T__7);
			setState(175);
			match(AP);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				setState(176);
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

			setState(179);
			match(FP);
			raise IsiSemanticException("Erro Semantico! Comando de selecao sem condicao de verificacao, ou condicao mal formulada!!")
			setState(181);
			match(ACH);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182);
				cmd();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(187);
			match(FCH);
			{
			setState(188);
			match(T__8);
			setState(189);
			match(ACH);
			setState(191); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(190);
				cmd();
				}
				}
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(195);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				invalidcmdenquantocond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
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
			setState(201);
			match(T__9);
			setState(202);
			match(AP);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << ID) | (1L << NUMBER) | (1L << TEXT))) != 0)) {
				{
				setState(203);
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

			setState(206);
			match(FP);
			raise IsiSemanticException("Erro Semantico! Comando Enquanto sem condicao de verificacao, ou condicao mal formulada!!")
			setState(208);
			match(ACH);
			setState(210); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(209);
				cmd();
				}
				}
				setState(212); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(214);
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
			setState(216);
			match(T__9);
			setState(217);
			match(AP);
			setState(218);
			match(ID);
			setState(219);
			match(OPREL);
			setState(220);
			termo();
			setState(221);
			match(FP);
			setState(222);
			match(ACH);
			setState(223);
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
			setState(226);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprID = varName
			self._exprType = self._isiProgram._varTable.get(varName).getTypeStr()

			setState(228);
			match(ATTR);

			self._exprContent = ""
			               
			setState(230);
			expr();
			setState(231);
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
			setState(234);
			match(T__7);
			setState(235);
			match(AP);
			setState(236);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprDecision = varName
			self._exprType = self._isiProgram._varTable.get(varName).getTypeStr()

			setState(238);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(240);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(242);
			match(FP);
			setState(243);
			match(ACH);

			self._exprDecisionStack.append(self._exprDecision)
			self._elseCheck = False
			self._elseCheckStack.append(False)
			self._curThread = []
			self._stack.append(self._curThread)

			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				cmd();
				}
				}
				setState(248); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(250);
			match(FCH);

			self._trueList = self._stack.pop()

			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(252);
				match(T__8);
				setState(253);
				match(ACH);

				self._elseCheck = True
				self._elseCheckStack[-1] = True
				self._curThread = []
				self._stack.append(self._curThread)

				{
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(255);
					cmd();
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
				}
				setState(260);
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
			setState(267);
			match(T__9);
			setState(268);
			match(AP);
			setState(269);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprDecision = varName
			self._exprType = self._isiProgram._varTable.get(varName).getTypeStr()

			setState(271);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(273);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(275);
			match(FP);
			setState(276);
			match(ACH);

			self._exprDecisionStack.append(self._exprDecision)
			self._curThread = []
			self._stack.append(self._curThread)

			setState(279); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(278);
				cmd();
				}
				}
				setState(281); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(283);
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
			setState(286);
			termo();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(287);
				match(OP);

				self._exprContent += self._ctx.getChild(-1).getText() 
				                  
				setState(289);
				termo();
				}
				}
				setState(294);
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
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(ID);

				varName = self._ctx.getChild(-1).getText()
				self.checkVar(varName)
				self._exprContent += varName
				self.checkVarType(self._isiProgram._varTable.get(varName))

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				match(NUMBER);

				varName = self._ctx.getChild(-1).getText()
				self._exprContent += varName
				self.checkVarType(IsiVariable(f"Número {varName}", IsiVariable.NUMBER, varName, False))
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				match(TEXT);

				varName = self._ctx.getChild(-1).getText()
				self._exprContent += varName
				self.checkVarType(IsiVariable(f"Texto {varName}", IsiVariable.TEXT, varName, False))
				            
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(301);
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
			setState(305);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0137\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\6\39\n\3\r\3\16\3:\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"C\n\4\f\4\16\4F\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6"+
		"\6\6T\n\6\r\6\16\6U\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7b\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n}\n\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\6\r\u0099\n\r\r\r\16\r\u009a\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\6\16\u00a7\n\16\r\16\16\16\u00a8\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\5\17\u00b4\n\17\3\17\3\17\3\17\3\17\6\17"+
		"\u00ba\n\17\r\17\16\17\u00bb\3\17\3\17\3\17\3\17\6\17\u00c2\n\17\r\17"+
		"\16\17\u00c3\3\17\3\17\3\20\3\20\5\20\u00ca\n\20\3\21\3\21\3\21\5\21\u00cf"+
		"\n\21\3\21\3\21\3\21\3\21\6\21\u00d5\n\21\r\21\16\21\u00d6\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\6\24\u00f9\n\24\r\24\16\24\u00fa\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\6\24\u0103\n\24\r\24\16\24\u0104\3\24\3\24\3\24\5\24\u010a\n\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25"+
		"\u011a\n\25\r\25\16\25\u011b\3\25\3\25\3\25\3\26\3\26\3\26\3\26\7\26\u0125"+
		"\n\26\f\26\16\26\u0128\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5"+
		"\27\u0132\n\27\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\2\3\3\2\26\31\2\u0143\2\60\3\2\2\2\48\3\2\2\2\6<\3"+
		"\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fa\3\2\2\2\16c\3\2\2\2\20k\3\2\2\2\22t\3"+
		"\2\2\2\24\u0081\3\2\2\2\26\u008a\3\2\2\2\30\u008c\3\2\2\2\32\u009e\3\2"+
		"\2\2\34\u00b0\3\2\2\2\36\u00c9\3\2\2\2 \u00cb\3\2\2\2\"\u00da\3\2\2\2"+
		"$\u00e4\3\2\2\2&\u00ec\3\2\2\2(\u010d\3\2\2\2*\u0120\3\2\2\2,\u0131\3"+
		"\2\2\2.\u0133\3\2\2\2\60\61\b\2\1\2\61\62\7\3\2\2\62\63\5\4\3\2\63\64"+
		"\5\n\6\2\64\65\7\4\2\2\65\66\b\2\1\2\66\3\3\2\2\2\679\5\6\4\28\67\3\2"+
		"\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;\5\3\2\2\2<=\5\b\5\2=>\7\27\2\2>D\b"+
		"\4\1\2?@\7\22\2\2@A\7\27\2\2AC\b\4\1\2B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2D"+
		"E\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\7\17\2\2H\7\3\2\2\2IJ\7\5\2\2JP\b\5\1"+
		"\2KL\7\6\2\2LP\b\5\1\2MN\7\7\2\2NP\b\5\1\2OI\3\2\2\2OK\3\2\2\2OM\3\2\2"+
		"\2P\t\3\2\2\2QS\b\6\1\2RT\5\f\7\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2"+
		"\2\2V\13\3\2\2\2Wb\5\24\13\2Xb\5\16\b\2Yb\5\20\t\2Zb\5\22\n\2[b\5\26\f"+
		"\2\\b\5\36\20\2]b\5$\23\2^b\5&\24\2_b\5(\25\2`b\5.\30\2aW\3\2\2\2aX\3"+
		"\2\2\2aY\3\2\2\2aZ\3\2\2\2a[\3\2\2\2a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_"+
		"\3\2\2\2a`\3\2\2\2b\r\3\2\2\2cd\7\b\2\2de\7\r\2\2ef\7\27\2\2fg\b\b\1\2"+
		"gh\7\16\2\2hi\7\17\2\2ij\b\b\1\2j\17\3\2\2\2kl\7\t\2\2lm\b\t\1\2mn\7\r"+
		"\2\2no\5,\27\2op\b\t\1\2pq\7\16\2\2qr\7\17\2\2rs\b\t\1\2s\21\3\2\2\2t"+
		"u\7\27\2\2uv\b\n\1\2v|\7\r\2\2w}\7\27\2\2x}\7\30\2\2y}\5*\26\2z}\5,\27"+
		"\2{}\7\31\2\2|w\3\2\2\2|x\3\2\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}~\3\2"+
		"\2\2~\177\7\16\2\2\177\u0080\7\17\2\2\u0080\23\3\2\2\2\u0081\u0082\7\b"+
		"\2\2\u0082\u0083\7\r\2\2\u0083\u0084\7\16\2\2\u0084\u0085\b\13\1\2\u0085"+
		"\u0086\7\17\2\2\u0086\25\3\2\2\2\u0087\u008b\5\34\17\2\u0088\u008b\5\30"+
		"\r\2\u0089\u008b\5\32\16\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u0089\3\2\2\2\u008b\27\3\2\2\2\u008c\u008d\7\n\2\2\u008d\u008e\7\r\2"+
		"\2\u008e\u008f\7\27\2\2\u008f\u0090\7\25\2\2\u0090\u0091\5,\27\2\u0091"+
		"\u0092\7\16\2\2\u0092\u0093\7\23\2\2\u0093\u0094\7\24\2\2\u0094\u0095"+
		"\b\r\1\2\u0095\u0096\7\13\2\2\u0096\u0098\7\23\2\2\u0097\u0099\5\f\7\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\24\2\2\u009d\31\3\2\2\2\u009e"+
		"\u009f\7\n\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\7\27\2\2\u00a1\u00a2\7"+
		"\25\2\2\u00a2\u00a3\5,\27\2\u00a3\u00a4\7\16\2\2\u00a4\u00a6\7\23\2\2"+
		"\u00a5\u00a7\5\f\7\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6"+
		"\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\24\2\2"+
		"\u00ab\u00ac\7\13\2\2\u00ac\u00ad\7\23\2\2\u00ad\u00ae\7\24\2\2\u00ae"+
		"\u00af\b\16\1\2\u00af\33\3\2\2\2\u00b0\u00b1\7\n\2\2\u00b1\u00b3\7\r\2"+
		"\2\u00b2\u00b4\t\2\2\2\u00b3\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b6\7\16\2\2\u00b6\u00b7\b\17\1\2\u00b7\u00b9\7\23\2"+
		"\2\u00b8\u00ba\5\f\7\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\24\2\2"+
		"\u00be\u00bf\7\13\2\2\u00bf\u00c1\7\23\2\2\u00c0\u00c2\5\f\7\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\7\24\2\2\u00c6\35\3\2\2\2\u00c7\u00ca\5 \21"+
		"\2\u00c8\u00ca\5\"\22\2\u00c9\u00c7\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\37\3\2\2\2\u00cb\u00cc\7\f\2\2\u00cc\u00ce\7\r\2\2\u00cd\u00cf\t\2\2"+
		"\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1"+
		"\7\16\2\2\u00d1\u00d2\b\21\1\2\u00d2\u00d4\7\23\2\2\u00d3\u00d5\5\f\7"+
		"\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7"+
		"\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\24\2\2\u00d9!\3\2\2\2\u00da"+
		"\u00db\7\f\2\2\u00db\u00dc\7\r\2\2\u00dc\u00dd\7\27\2\2\u00dd\u00de\7"+
		"\25\2\2\u00de\u00df\5,\27\2\u00df\u00e0\7\16\2\2\u00e0\u00e1\7\23\2\2"+
		"\u00e1\u00e2\7\24\2\2\u00e2\u00e3\b\22\1\2\u00e3#\3\2\2\2\u00e4\u00e5"+
		"\7\27\2\2\u00e5\u00e6\b\23\1\2\u00e6\u00e7\7\21\2\2\u00e7\u00e8\b\23\1"+
		"\2\u00e8\u00e9\5*\26\2\u00e9\u00ea\7\17\2\2\u00ea\u00eb\b\23\1\2\u00eb"+
		"%\3\2\2\2\u00ec\u00ed\7\n\2\2\u00ed\u00ee\7\r\2\2\u00ee\u00ef\7\27\2\2"+
		"\u00ef\u00f0\b\24\1\2\u00f0\u00f1\7\25\2\2\u00f1\u00f2\b\24\1\2\u00f2"+
		"\u00f3\5,\27\2\u00f3\u00f4\b\24\1\2\u00f4\u00f5\7\16\2\2\u00f5\u00f6\7"+
		"\23\2\2\u00f6\u00f8\b\24\1\2\u00f7\u00f9\5\f\7\2\u00f8\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3\2"+
		"\2\2\u00fc\u00fd\7\24\2\2\u00fd\u0109\b\24\1\2\u00fe\u00ff\7\13\2\2\u00ff"+
		"\u0100\7\23\2\2\u0100\u0102\b\24\1\2\u0101\u0103\5\f\7\2\u0102\u0101\3"+
		"\2\2\2\u0103\u0104\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\3\2\2\2\u0106\u0107\7\24\2\2\u0107\u0108\b\24\1\2\u0108\u010a\3"+
		"\2\2\2\u0109\u00fe\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\b\24\1\2\u010c\'\3\2\2\2\u010d\u010e\7\f\2\2\u010e\u010f\7\r\2"+
		"\2\u010f\u0110\7\27\2\2\u0110\u0111\b\25\1\2\u0111\u0112\7\25\2\2\u0112"+
		"\u0113\b\25\1\2\u0113\u0114\5,\27\2\u0114\u0115\b\25\1\2\u0115\u0116\7"+
		"\16\2\2\u0116\u0117\7\23\2\2\u0117\u0119\b\25\1\2\u0118\u011a\5\f\7\2"+
		"\u0119\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\7\24\2\2\u011e\u011f\b\25\1\2"+
		"\u011f)\3\2\2\2\u0120\u0126\5,\27\2\u0121\u0122\7\20\2\2\u0122\u0123\b"+
		"\26\1\2\u0123\u0125\5,\27\2\u0124\u0121\3\2\2\2\u0125\u0128\3\2\2\2\u0126"+
		"\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127+\3\2\2\2\u0128\u0126\3\2\2\2"+
		"\u0129\u012a\7\27\2\2\u012a\u0132\b\27\1\2\u012b\u012c\7\30\2\2\u012c"+
		"\u0132\b\27\1\2\u012d\u012e\7\31\2\2\u012e\u0132\b\27\1\2\u012f\u0130"+
		"\7\26\2\2\u0130\u0132\b\27\1\2\u0131\u0129\3\2\2\2\u0131\u012b\3\2\2\2"+
		"\u0131\u012d\3\2\2\2\u0131\u012f\3\2\2\2\u0132-\3\2\2\2\u0133\u0134\7"+
		"\13\2\2\u0134\u0135\b\30\1\2\u0135/\3\2\2\2\27:DOUa|\u008a\u009a\u00a8"+
		"\u00b3\u00bb\u00c3\u00c9\u00ce\u00d6\u00fa\u0104\u0109\u011b\u0126\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}