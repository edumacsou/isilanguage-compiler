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
		AP=10, FP=11, SC=12, OP=13, ATTR=14, VIR=15, ACH=16, FCH=17, OPREL=18, 
		ID=19, NUMBER=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_cmdattrib = 8, 
		RULE_cmdselecao = 9, RULE_cmdenquanto = 10, RULE_expr = 11, RULE_termo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
			"cmdattrib", "cmdselecao", "cmdenquanto", "expr", "termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'leia'", "'escreva'", 
			"'se'", "'senao'", "'enquanto'", "'('", "')'", "';'", null, "'='", "','", 
			"'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "AP", "FP", 
			"SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", "NUMBER", "WS"
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


	def generatePyCode(self):
	    return self._isiProgram.generatePyTarget()
	     

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
			self._trueList = []
			self._falseList = []
			self._cmdList   = []




			setState(27);
			match(T__0);
			setState(28);
			decl();
			setState(29);
			bloco();
			setState(30);
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
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(33);
				declaravar();
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 || _la==T__3 );
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
			setState(38);
			tipo();
			setState(39);
			match(ID);

			symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

			if(self._symbolTable.exists(str(symbol.getName())) == False):
			     #print("Simbolo adicionado", symbol)
			     self._symbolTable.add(symbol)
			else:
			     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))
			                    
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(41);
				match(VIR);
				setState(42);
				match(ID);

				symbol = IsiVariable(self._ctx.getChild(-1), self.getTipo(), None, False)

				if(self._symbolTable.exists(str(symbol.getName())) == False):
				     #print("Simbolo adicionado", symbol)
				     self._symbolTable.add(symbol)
				else:
				     raise IsiSemanticException("Erro Semantico! A variavel {} ja existe, e nao pode ser declarada novamente!".format(symbol.getName()))

				}
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
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
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(T__2);

				self.setTipo(IsiVariable.NUMBER)
				                    
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__3);

				self.setTipo(IsiVariable.TEXT)
				                    
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

			setState(59); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(58);
				cmd();
				}
				}
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << ID))) != 0) );
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
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				cmdleitura();
				print("Reconhecido comando de leitura!")    
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				cmdescrita();
				print("Reconhecido comando de escrita!")    
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				cmdattrib();
				print("Reconhecido comando de atribuicao!") 
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
				cmdselecao();
				print("Reconhecido comando de selecao!")    
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(75);
				cmdenquanto();
				print("Reconhecido comando de enquanto!")   
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
			setState(80);
			match(T__4);
			setState(81);
			match(AP);
			setState(82);
			match(ID);

			self.checkVar(self._ctx.getChild(-1).getText())
			self._readIDCommand = str(self._ctx.getChild(-1))

			setState(84);
			match(FP);
			setState(85);
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
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
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
			setState(88);
			match(T__5);
			setState(89);
			match(AP);
			setState(90);
			match(ID);

			self.checkVar(self._ctx.getChild(-1).getText())
			self._readIDCommand = str(self._ctx.getChild(-1))

			setState(92);
			match(FP);
			setState(93);
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
			setState(96);
			match(ID);

			self.checkVar(self._ctx.getChild(-1).getText())
			self._exprID = self._ctx.getChild(-1).getText()

			setState(98);
			match(ATTR);

			self._exprContent = ""
			               
			setState(100);
			expr();
			setState(101);
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
			setState(104);
			match(T__6);
			setState(105);
			match(AP);
			setState(106);
			match(ID);

			self.checkVar(self._ctx.getChild(-1).getText())
			self._exprDecision = self._ctx.getChild(-1).getText()

			setState(108);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(110);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(112);
			match(FP);
			setState(113);
			match(ACH);

			# verificar aqui correcao para aceitar ifs aninhados!
			self._curThread = []
			self._stack.append(self._curThread)

			setState(116); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(115);
				cmd();
				}
				}
				setState(118); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << ID))) != 0) );
			setState(120);
			match(FCH);

			self._trueList = self._stack.pop()

			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(122);
				match(T__7);
				setState(123);
				match(ACH);

				# verificar aqui correcao para aceitar ifs aninhados!
				self._curThread = []
				self._stack.append(self._curThread)

				{
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(125);
					cmd();
					}
					}
					setState(128); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << ID))) != 0) );
				}
				setState(130);
				match(FCH);

				self._falseList = self._stack.pop()
				cmd = DecisionCommand(self._exprDecision, self._trueList, self._falseList)
				self._stack[-1].append(cmd)

				}
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
			setState(135);
			match(T__8);
			setState(136);
			match(AP);
			setState(137);
			match(ID);

			self.checkVar(self._ctx.getChild(-1).getText())
			self._exprDecision = self._ctx.getChild(-1).getText()

			setState(139);
			match(OPREL);

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(141);
			termo();

			self._exprDecision += self._ctx.getChild(-1).getText()

			setState(143);
			match(FP);
			setState(144);
			match(ACH);

			# verificar aqui correcao para aceitar ifs aninhados!
			self._curThread = []
			self._stack.append(self._curThread)

			setState(147); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(146);
				cmd();
				}
				}
				setState(149); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__8) | (1L << ID))) != 0) );
			setState(151);
			match(FCH);

			self._cmdList = self._stack.pop()
			cmd = WhileCommand(self._exprDecision, self._cmdList)
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
			setState(154);
			termo();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(155);
				match(OP);

				self._exprContent += self._ctx.getChild(-1).getText() 
				                  
				setState(157);
				termo();
				}
				}
				setState(162);
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
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_termo);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(ID);

				self.checkVar(self._ctx.getChild(-1).getText())
				self._exprContent += self._ctx.getChild(-1).getText()

				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(NUMBER);

				self._exprContent += self._ctx.getChild(-1).getText()
				              
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00ac\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3%\n"+
		"\3\r\3\16\3&\3\4\3\4\3\4\3\4\3\4\3\4\7\4/\n\4\f\4\16\4\62\13\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\6\6>\n\6\r\6\16\6?\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Q\n\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6"+
		"\13w\n\13\r\13\16\13x\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u0081\n\13\r"+
		"\13\16\13\u0082\3\13\3\13\3\13\5\13\u0088\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u0096\n\f\r\f\16\f\u0097\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\7\r\u00a1\n\r\f\r\16\r\u00a4\13\r\3\16\3\16\3\16\3\16\5\16"+
		"\u00aa\n\16\3\16\2\2\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\2\2\u00ac\2"+
		"\34\3\2\2\2\4$\3\2\2\2\6(\3\2\2\2\b9\3\2\2\2\n;\3\2\2\2\fP\3\2\2\2\16"+
		"R\3\2\2\2\20Z\3\2\2\2\22b\3\2\2\2\24j\3\2\2\2\26\u0089\3\2\2\2\30\u009c"+
		"\3\2\2\2\32\u00a9\3\2\2\2\34\35\b\2\1\2\35\36\7\3\2\2\36\37\5\4\3\2\37"+
		" \5\n\6\2 !\7\4\2\2!\"\b\2\1\2\"\3\3\2\2\2#%\5\6\4\2$#\3\2\2\2%&\3\2\2"+
		"\2&$\3\2\2\2&\'\3\2\2\2\'\5\3\2\2\2()\5\b\5\2)*\7\25\2\2*\60\b\4\1\2+"+
		",\7\21\2\2,-\7\25\2\2-/\b\4\1\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61"+
		"\3\2\2\2\61\63\3\2\2\2\62\60\3\2\2\2\63\64\7\16\2\2\64\7\3\2\2\2\65\66"+
		"\7\5\2\2\66:\b\5\1\2\678\7\6\2\28:\b\5\1\29\65\3\2\2\29\67\3\2\2\2:\t"+
		"\3\2\2\2;=\b\6\1\2<>\5\f\7\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@"+
		"\13\3\2\2\2AB\5\16\b\2BC\b\7\1\2CQ\3\2\2\2DE\5\20\t\2EF\b\7\1\2FQ\3\2"+
		"\2\2GH\5\22\n\2HI\b\7\1\2IQ\3\2\2\2JK\5\24\13\2KL\b\7\1\2LQ\3\2\2\2MN"+
		"\5\26\f\2NO\b\7\1\2OQ\3\2\2\2PA\3\2\2\2PD\3\2\2\2PG\3\2\2\2PJ\3\2\2\2"+
		"PM\3\2\2\2Q\r\3\2\2\2RS\7\7\2\2ST\7\f\2\2TU\7\25\2\2UV\b\b\1\2VW\7\r\2"+
		"\2WX\7\16\2\2XY\b\b\1\2Y\17\3\2\2\2Z[\7\b\2\2[\\\7\f\2\2\\]\7\25\2\2]"+
		"^\b\t\1\2^_\7\r\2\2_`\7\16\2\2`a\b\t\1\2a\21\3\2\2\2bc\7\25\2\2cd\b\n"+
		"\1\2de\7\20\2\2ef\b\n\1\2fg\5\30\r\2gh\7\16\2\2hi\b\n\1\2i\23\3\2\2\2"+
		"jk\7\t\2\2kl\7\f\2\2lm\7\25\2\2mn\b\13\1\2no\7\24\2\2op\b\13\1\2pq\5\32"+
		"\16\2qr\b\13\1\2rs\7\r\2\2st\7\22\2\2tv\b\13\1\2uw\5\f\7\2vu\3\2\2\2w"+
		"x\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\23\2\2{\u0087\b\13\1\2|}\7"+
		"\n\2\2}~\7\22\2\2~\u0080\b\13\1\2\177\u0081\5\f\7\2\u0080\177\3\2\2\2"+
		"\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084"+
		"\3\2\2\2\u0084\u0085\7\23\2\2\u0085\u0086\b\13\1\2\u0086\u0088\3\2\2\2"+
		"\u0087|\3\2\2\2\u0087\u0088\3\2\2\2\u0088\25\3\2\2\2\u0089\u008a\7\13"+
		"\2\2\u008a\u008b\7\f\2\2\u008b\u008c\7\25\2\2\u008c\u008d\b\f\1\2\u008d"+
		"\u008e\7\24\2\2\u008e\u008f\b\f\1\2\u008f\u0090\5\32\16\2\u0090\u0091"+
		"\b\f\1\2\u0091\u0092\7\r\2\2\u0092\u0093\7\22\2\2\u0093\u0095\b\f\1\2"+
		"\u0094\u0096\5\f\7\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095"+
		"\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7\23\2\2"+
		"\u009a\u009b\b\f\1\2\u009b\27\3\2\2\2\u009c\u00a2\5\32\16\2\u009d\u009e"+
		"\7\17\2\2\u009e\u009f\b\r\1\2\u009f\u00a1\5\32\16\2\u00a0\u009d\3\2\2"+
		"\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\31"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a6\7\25\2\2\u00a6\u00aa\b\16\1\2"+
		"\u00a7\u00a8\7\26\2\2\u00a8\u00aa\b\16\1\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\33\3\2\2\2\r&\609?Px\u0082\u0087\u0097\u00a2\u00a9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}