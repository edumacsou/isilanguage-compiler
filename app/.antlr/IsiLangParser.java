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
		OPREL=19, BOOL=20, ID=21, NUMBER=22, TEXT=23, WS=24;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_cmdattrib = 8, 
		RULE_cmdselecao = 9, RULE_cmdenquanto = 10, RULE_expr = 11, RULE_termo = 12, 
		RULE_invalidelse = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
			"cmdattrib", "cmdselecao", "cmdenquanto", "expr", "termo", "invalidelse"
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


			setState(29);
			match(T__0);
			setState(30);
			decl();
			setState(31);
			bloco();
			setState(32);
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
			setState(36); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(35);
				declaravar();
				}
				}
				setState(38); 
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
			setState(40);
			tipo();
			setState(41);
			match(ID);

			symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

			if(self._symbolTable.exists(str(symbol.getName())) == False):
			     #print("Simbolo adicionado", symbol)
			     self._symbolTable.add(symbol)
			else:
			     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
			                    
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(43);
				match(VIR);
				setState(44);
				match(ID);

				symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

				if(self._symbolTable.exists(str(symbol.getName())) == False):
				     #print("Simbolo adicionado", symbol)
				     self._symbolTable.add(symbol)
				else:
				     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))

				}
				}
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(51);
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
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(T__2);

				self.setTipo(IsiVariable.NUMBER)
				                    
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__3);

				self.setTipo(IsiVariable.TEXT)
				                    
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
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

			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				cmd();
				}
				}
				setState(65); 
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
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
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
			setState(73);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				cmdleitura();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				cmdattrib();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				cmdselecao();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				cmdenquanto();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(72);
				invalidelse();
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
			setState(75);
			match(T__5);
			setState(76);
			match(AP);
			setState(77);
			match(ID);

			self.checkVar(self._ctx.getChild(-1).getText())
			self._readIDCommand = str(self._ctx.getChild(-1))

			setState(79);
			match(FP);
			setState(80);
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
			setState(83);
			match(T__6);
			self._exprType = "any"
			setState(85);
			match(AP);
			setState(86);
			termo();

			varName = self._ctx.getChild(-1).getText()
			self._readIDCommand = str(varName)

			setState(88);
			match(FP);
			setState(89);
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
		enterRule(_localctx, 16, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprID = varName
			self._exprType = self._symbolTable.get(varName).getTypeStr()

			setState(94);
			match(ATTR);

			self._exprContent = ""
			               
			setState(96);
			expr();
			setState(97);
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
		enterRule(_localctx, 18, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__7);
			setState(101);
			match(AP);
			setState(102);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprDecision = varName
			self._exprType = self._symbolTable.get(varName).getTypeStr()

			setState(104);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(106);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(108);
			match(FP);
			setState(109);
			match(ACH);

			self._exprDecisionStack.append(self._exprDecision)
			self._elseCheck = False
			self._elseCheckStack.append(False)
			self._curThread = []
			self._stack.append(self._curThread)

			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(111);
				cmd();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(116);
			match(FCH);

			self._trueList = self._stack.pop()

			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(118);
				match(T__8);
				setState(119);
				match(ACH);

				self._elseCheck = True
				self._elseCheckStack[-1] = True
				self._curThread = []
				self._stack.append(self._curThread)

				{
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(121);
					cmd();
					}
					}
					setState(124); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
				}
				setState(126);
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
		enterRule(_localctx, 20, RULE_cmdenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__9);
			setState(134);
			match(AP);
			setState(135);
			match(ID);

			varName = self._ctx.getChild(-1).getText()
			self.checkVar(varName)
			self._exprDecision = varName
			self._exprType = self._symbolTable.get(varName).getTypeStr()

			setState(137);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(139);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(141);
			match(FP);
			setState(142);
			match(ACH);

			self._exprDecisionStack.append(self._exprDecision)
			self._curThread = []
			self._stack.append(self._curThread)

			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144);
				cmd();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << ID))) != 0) );
			setState(149);
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
		enterRule(_localctx, 22, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			termo();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(153);
				match(OP);

				self._exprContent += self._ctx.getChild(-1).getText() 
				                  
				setState(155);
				termo();
				}
				}
				setState(160);
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
		enterRule(_localctx, 24, RULE_termo);
		try {
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
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
				setState(163);
				match(NUMBER);

				varName = self._ctx.getChild(-1).getText()
				self._exprContent += varName
				self.checkVarType(IsiVariable(f"Número {varName}", IsiVariable.NUMBER, varName, False))
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				match(TEXT);

				varName = self._ctx.getChild(-1).getText()
				self._exprContent += varName
				self.checkVarType(IsiVariable(f"Texto {varName}", IsiVariable.TEXT, varName, False))
				            
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(167);
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
		enterRule(_localctx, 26, RULE_invalidelse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00b1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\6\3\'\n\3\r\3\16\3(\3\4\3\4\3\4\3\4\3\4\3\4\7\4\61\n\4\f\4\16\4\64"+
		"\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\6\6B\n\6\r\6\16"+
		"\6C\3\7\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13s\n\13\r\13"+
		"\16\13t\3\13\3\13\3\13\3\13\3\13\3\13\6\13}\n\13\r\13\16\13~\3\13\3\13"+
		"\3\13\5\13\u0084\n\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\6\f\u0094\n\f\r\f\16\f\u0095\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7"+
		"\r\u009f\n\r\f\r\16\r\u00a2\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u00ac\n\16\3\17\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\2\2\2\u00b4\2\36\3\2\2\2\4&\3\2\2\2\6*\3\2\2\2\b=\3\2\2\2"+
		"\n?\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2\20U\3\2\2\2\22^\3\2\2\2\24f\3\2\2\2"+
		"\26\u0087\3\2\2\2\30\u009a\3\2\2\2\32\u00ab\3\2\2\2\34\u00ad\3\2\2\2\36"+
		"\37\b\2\1\2\37 \7\3\2\2 !\5\4\3\2!\"\5\n\6\2\"#\7\4\2\2#$\b\2\1\2$\3\3"+
		"\2\2\2%\'\5\6\4\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\5\3\2\2\2"+
		"*+\5\b\5\2+,\7\27\2\2,\62\b\4\1\2-.\7\22\2\2./\7\27\2\2/\61\b\4\1\2\60"+
		"-\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\62"+
		"\3\2\2\2\65\66\7\17\2\2\66\7\3\2\2\2\678\7\5\2\28>\b\5\1\29:\7\6\2\2:"+
		">\b\5\1\2;<\7\7\2\2<>\b\5\1\2=\67\3\2\2\2=9\3\2\2\2=;\3\2\2\2>\t\3\2\2"+
		"\2?A\b\6\1\2@B\5\f\7\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2D\13\3\2"+
		"\2\2EL\5\16\b\2FL\5\20\t\2GL\5\22\n\2HL\5\24\13\2IL\5\26\f\2JL\5\34\17"+
		"\2KE\3\2\2\2KF\3\2\2\2KG\3\2\2\2KH\3\2\2\2KI\3\2\2\2KJ\3\2\2\2L\r\3\2"+
		"\2\2MN\7\b\2\2NO\7\r\2\2OP\7\27\2\2PQ\b\b\1\2QR\7\16\2\2RS\7\17\2\2ST"+
		"\b\b\1\2T\17\3\2\2\2UV\7\t\2\2VW\b\t\1\2WX\7\r\2\2XY\5\32\16\2YZ\b\t\1"+
		"\2Z[\7\16\2\2[\\\7\17\2\2\\]\b\t\1\2]\21\3\2\2\2^_\7\27\2\2_`\b\n\1\2"+
		"`a\7\21\2\2ab\b\n\1\2bc\5\30\r\2cd\7\17\2\2de\b\n\1\2e\23\3\2\2\2fg\7"+
		"\n\2\2gh\7\r\2\2hi\7\27\2\2ij\b\13\1\2jk\7\25\2\2kl\b\13\1\2lm\5\32\16"+
		"\2mn\b\13\1\2no\7\16\2\2op\7\23\2\2pr\b\13\1\2qs\5\f\7\2rq\3\2\2\2st\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\7\24\2\2w\u0083\b\13\1\2xy\7\13"+
		"\2\2yz\7\23\2\2z|\b\13\1\2{}\5\f\7\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177"+
		"\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\24\2\2\u0081\u0082\b\13\1\2\u0082"+
		"\u0084\3\2\2\2\u0083x\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\b\13\1\2\u0086\25\3\2\2\2\u0087\u0088\7\f\2\2\u0088\u0089"+
		"\7\r\2\2\u0089\u008a\7\27\2\2\u008a\u008b\b\f\1\2\u008b\u008c\7\25\2\2"+
		"\u008c\u008d\b\f\1\2\u008d\u008e\5\32\16\2\u008e\u008f\b\f\1\2\u008f\u0090"+
		"\7\16\2\2\u0090\u0091\7\23\2\2\u0091\u0093\b\f\1\2\u0092\u0094\5\f\7\2"+
		"\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u0099\b\f\1\2"+
		"\u0099\27\3\2\2\2\u009a\u00a0\5\32\16\2\u009b\u009c\7\20\2\2\u009c\u009d"+
		"\b\r\1\2\u009d\u009f\5\32\16\2\u009e\u009b\3\2\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\31\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\7\27\2\2\u00a4\u00ac\b\16\1\2\u00a5\u00a6\7\30\2"+
		"\2\u00a6\u00ac\b\16\1\2\u00a7\u00a8\7\31\2\2\u00a8\u00ac\b\16\1\2\u00a9"+
		"\u00aa\7\26\2\2\u00aa\u00ac\b\16\1\2\u00ab\u00a3\3\2\2\2\u00ab\u00a5\3"+
		"\2\2\2\u00ab\u00a7\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\33\3\2\2\2\u00ad"+
		"\u00ae\7\13\2\2\u00ae\u00af\b\17\1\2\u00af\35\3\2\2\2\r(\62=CKt~\u0083"+
		"\u0095\u00a0\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}