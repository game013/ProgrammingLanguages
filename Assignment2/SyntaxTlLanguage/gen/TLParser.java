// Generated from /Users/game013/Documents/Git/ProgrammingLanguages/Assignment2/SyntaxTlLanguage/TL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WHILE=2, FOR=3, IF=4, ELSE=5, LOG=6, FUNCION=7, FALSE=8, TRUE=9, 
		IMPORTAR=10, IN=11, RETORNO=12, END=13, DESDE=14, TODO=15, LEER=16, TOKEN_LLAVE_IZQ=17, 
		TOKEN_LLAVE_DER=18, TOKEN_COR_IZQ=19, TOKEN_COR_DER=20, TOKEN_PAR_IZQ=21, 
		TOKEN_PAR_DER=22, TOKEN_MAYOR=23, TOKEN_MENOR=24, TOKEN_MAYOR_IGUAL=25, 
		TOKEN_MENOR_IGUAL=26, TOKEN_IGUAL_NUM=27, TOKEN_POINT=28, TOKEN_DIFF_NUM=29, 
		TOKEN_AND=30, TOKEN_OR=31, TOKEN_NOT=32, TOKEN_MAS=33, TOKEN_MENOS=34, 
		TOKEN_MUL=35, TOKEN_DIV=36, TOKEN_MOD=37, TOKEN_POT=38, TOKEN_ASSIGN=39, 
		TOKEN_COMA=40, TOKEN_DOSP=41, TOKEN_STRING=42, COMMENTARIO=43, ID=44, 
		TOKEN_INTEGER=45, TOKEN_FLOAT=46, WS=47, BL=48;
	public static final int
		RULE_all = 0, RULE_import_block = 1, RULE_import_block_1 = 2, RULE_import_block_2 = 3, 
		RULE_func = 4, RULE_params = 5, RULE_empty_main = 6, RULE_main = 7, RULE_cond = 8, 
		RULE_cond_header = 9, RULE_if_header = 10, RULE_elseif = 11, RULE_else_block = 12, 
		RULE_bool = 13, RULE_binary_bool = 14, RULE_unary_bool = 15, RULE_expr = 16;
	public static final String[] ruleNames = {
		"all", "import_block", "import_block_1", "import_block_2", "func", "params", 
		"empty_main", "main", "cond", "cond_header", "if_header", "elseif", "else_block", 
		"bool", "binary_bool", "unary_bool", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", "'while'", "'for'", "'if'", "'else'", "'log'", "'funcion'", 
		"'false'", "'true'", "'importar'", "'in'", "'retorno'", "'end'", "'desde'", 
		"'todo'", "'leer'", "'{'", "'}'", "'['", "']'", "'('", "')'", "'>'", "'<'", 
		"'>='", "'<='", "'=='", "'.'", "'!='", "'&&'", "'||'", "'!'", "'+'", "'-'", 
		"'*'", "'/'", "'%'", "'^'", "'='", "','", "':'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WHILE", "FOR", "IF", "ELSE", "LOG", "FUNCION", "FALSE", "TRUE", 
		"IMPORTAR", "IN", "RETORNO", "END", "DESDE", "TODO", "LEER", "TOKEN_LLAVE_IZQ", 
		"TOKEN_LLAVE_DER", "TOKEN_COR_IZQ", "TOKEN_COR_DER", "TOKEN_PAR_IZQ", 
		"TOKEN_PAR_DER", "TOKEN_MAYOR", "TOKEN_MENOR", "TOKEN_MAYOR_IGUAL", "TOKEN_MENOR_IGUAL", 
		"TOKEN_IGUAL_NUM", "TOKEN_POINT", "TOKEN_DIFF_NUM", "TOKEN_AND", "TOKEN_OR", 
		"TOKEN_NOT", "TOKEN_MAS", "TOKEN_MENOS", "TOKEN_MUL", "TOKEN_DIV", "TOKEN_MOD", 
		"TOKEN_POT", "TOKEN_ASSIGN", "TOKEN_COMA", "TOKEN_DOSP", "TOKEN_STRING", 
		"COMMENTARIO", "ID", "TOKEN_INTEGER", "TOKEN_FLOAT", "WS", "BL"
	};
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
	public String getGrammarFileName() { return "TL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AllContext extends ParserRuleContext {
		public Empty_mainContext empty_main() {
			return getRuleContext(Empty_mainContext.class,0);
		}
		public List<Import_blockContext> import_block() {
			return getRuleContexts(Import_blockContext.class);
		}
		public Import_blockContext import_block(int i) {
			return getRuleContext(Import_blockContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public AllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllContext all() throws RecognitionException {
		AllContext _localctx = new AllContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_all);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORTAR || _la==DESDE) {
				{
				{
				setState(34);
				import_block();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCION) {
				{
				{
				setState(40);
				func();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			empty_main();
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

	public static class Import_blockContext extends ParserRuleContext {
		public Import_block_1Context import_block_1() {
			return getRuleContext(Import_block_1Context.class,0);
		}
		public Import_block_2Context import_block_2() {
			return getRuleContext(Import_block_2Context.class,0);
		}
		public Import_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterImport_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitImport_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitImport_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_blockContext import_block() throws RecognitionException {
		Import_blockContext _localctx = new Import_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_import_block);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORTAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				import_block_1();
				}
				break;
			case DESDE:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				import_block_2();
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

	public static class Import_block_1Context extends ParserRuleContext {
		public TerminalNode IMPORTAR() { return getToken(TLParser.IMPORTAR, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<TerminalNode> TOKEN_POINT() { return getTokens(TLParser.TOKEN_POINT); }
		public TerminalNode TOKEN_POINT(int i) {
			return getToken(TLParser.TOKEN_POINT, i);
		}
		public Import_block_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_block_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterImport_block_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitImport_block_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitImport_block_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_block_1Context import_block_1() throws RecognitionException {
		Import_block_1Context _localctx = new Import_block_1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_import_block_1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(IMPORTAR);
			setState(53);
			match(T__0);
			setState(54);
			match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_POINT) {
				{
				{
				setState(55);
				match(TOKEN_POINT);
				setState(56);
				match(ID);
				}
				}
				setState(61);
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

	public static class Import_block_2Context extends ParserRuleContext {
		public TerminalNode DESDE() { return getToken(TLParser.DESDE, 0); }
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public TerminalNode IMPORTAR() { return getToken(TLParser.IMPORTAR, 0); }
		public List<TerminalNode> TOKEN_POINT() { return getTokens(TLParser.TOKEN_POINT); }
		public TerminalNode TOKEN_POINT(int i) {
			return getToken(TLParser.TOKEN_POINT, i);
		}
		public Import_block_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_import_block_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterImport_block_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitImport_block_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitImport_block_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Import_block_2Context import_block_2() throws RecognitionException {
		Import_block_2Context _localctx = new Import_block_2Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_import_block_2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DESDE);
			setState(63);
			match(T__0);
			setState(64);
			match(ID);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_POINT) {
				{
				{
				setState(65);
				match(TOKEN_POINT);
				setState(66);
				match(ID);
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(IMPORTAR);
			setState(73);
			match(ID);
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

	public static class FuncContext extends ParserRuleContext {
		public List<TerminalNode> FUNCION() { return getTokens(TLParser.FUNCION); }
		public TerminalNode FUNCION(int i) {
			return getToken(TLParser.FUNCION, i);
		}
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public Empty_mainContext empty_main() {
			return getRuleContext(Empty_mainContext.class,0);
		}
		public TerminalNode RETORNO() { return getToken(TLParser.RETORNO, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(TLParser.END, 0); }
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(FUNCION);
			setState(76);
			match(T__0);
			setState(77);
			match(ID);
			setState(78);
			match(TOKEN_PAR_IZQ);
			setState(79);
			params();
			setState(80);
			match(TOKEN_PAR_DER);
			setState(81);
			empty_main();
			setState(82);
			match(RETORNO);
			setState(83);
			match(T__0);
			setState(84);
			expr();
			setState(85);
			match(END);
			setState(86);
			match(T__0);
			setState(87);
			match(FUNCION);
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

	public static class ParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TLParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLParser.ID, i);
		}
		public List<TerminalNode> TOKEN_COMA() { return getTokens(TLParser.TOKEN_COMA); }
		public TerminalNode TOKEN_COMA(int i) {
			return getToken(TLParser.TOKEN_COMA, i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_params);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(ID);
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TOKEN_COMA) {
					{
					{
					setState(90);
					match(TOKEN_COMA);
					setState(91);
					match(ID);
					}
					}
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case TOKEN_PAR_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Empty_mainContext extends ParserRuleContext {
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public Empty_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterEmpty_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitEmpty_main(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitEmpty_main(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Empty_mainContext empty_main() throws RecognitionException {
		Empty_mainContext _localctx = new Empty_mainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_empty_main);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				main();
				}
				break;
			case EOF:
			case RETORNO:
			case TOKEN_LLAVE_DER:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MainContext extends ParserRuleContext {
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				cond();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				expr();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(106);
					expr();
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class CondContext extends ParserRuleContext {
		public Cond_headerContext cond_header() {
			return getRuleContext(Cond_headerContext.class,0);
		}
		public List<ElseifContext> elseif() {
			return getRuleContexts(ElseifContext.class);
		}
		public ElseifContext elseif(int i) {
			return getRuleContext(ElseifContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		CondContext _localctx = new CondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cond);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			cond_header();
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(115);
					elseif();
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(121);
				else_block();
				}
				break;
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

	public static class Cond_headerContext extends ParserRuleContext {
		public If_headerContext if_header() {
			return getRuleContext(If_headerContext.class,0);
		}
		public TerminalNode TOKEN_LLAVE_IZQ() { return getToken(TLParser.TOKEN_LLAVE_IZQ, 0); }
		public Empty_mainContext empty_main() {
			return getRuleContext(Empty_mainContext.class,0);
		}
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(TLParser.TOKEN_LLAVE_DER, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public Cond_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterCond_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitCond_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitCond_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_headerContext cond_header() throws RecognitionException {
		Cond_headerContext _localctx = new Cond_headerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cond_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				{
				setState(124);
				if_header();
				setState(125);
				match(TOKEN_LLAVE_IZQ);
				setState(126);
				empty_main();
				setState(127);
				match(TOKEN_LLAVE_DER);
				}
				}
				break;
			case 2:
				{
				{
				setState(129);
				if_header();
				setState(130);
				main();
				}
				}
				break;
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

	public static class If_headerContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(TLParser.IF, 0); }
		public TerminalNode TOKEN_PAR_IZQ() { return getToken(TLParser.TOKEN_PAR_IZQ, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public TerminalNode TOKEN_PAR_DER() { return getToken(TLParser.TOKEN_PAR_DER, 0); }
		public List<TerminalNode> WS() { return getTokens(TLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TLParser.WS, i);
		}
		public If_headerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterIf_header(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitIf_header(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitIf_header(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_headerContext if_header() throws RecognitionException {
		If_headerContext _localctx = new If_headerContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_header);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(IF);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(135);
				match(WS);
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
			match(TOKEN_PAR_IZQ);
			setState(142);
			bool();
			setState(143);
			match(TOKEN_PAR_DER);
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

	public static class ElseifContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TLParser.ELSE, 0); }
		public Cond_headerContext cond_header() {
			return getRuleContext(Cond_headerContext.class,0);
		}
		public ElseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterElseif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitElseif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitElseif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifContext elseif() throws RecognitionException {
		ElseifContext _localctx = new ElseifContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_elseif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ELSE);
			setState(146);
			match(T__0);
			setState(147);
			cond_header();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(TLParser.ELSE, 0); }
		public TerminalNode TOKEN_LLAVE_IZQ() { return getToken(TLParser.TOKEN_LLAVE_IZQ, 0); }
		public Empty_mainContext empty_main() {
			return getRuleContext(Empty_mainContext.class,0);
		}
		public TerminalNode TOKEN_LLAVE_DER() { return getToken(TLParser.TOKEN_LLAVE_DER, 0); }
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterElse_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitElse_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitElse_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_else_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ELSE);
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_LLAVE_IZQ:
				{
				{
				setState(150);
				match(TOKEN_LLAVE_IZQ);
				setState(151);
				empty_main();
				setState(152);
				match(TOKEN_LLAVE_DER);
				}
				}
				break;
			case IF:
			case ID:
				{
				{
				setState(154);
				main();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BoolContext extends ParserRuleContext {
		public List<Binary_boolContext> binary_bool() {
			return getRuleContexts(Binary_boolContext.class);
		}
		public Binary_boolContext binary_bool(int i) {
			return getRuleContext(Binary_boolContext.class,i);
		}
		public List<Unary_boolContext> unary_bool() {
			return getRuleContexts(Unary_boolContext.class);
		}
		public Unary_boolContext unary_bool(int i) {
			return getRuleContext(Unary_boolContext.class,i);
		}
		public List<TerminalNode> TOKEN_AND() { return getTokens(TLParser.TOKEN_AND); }
		public TerminalNode TOKEN_AND(int i) {
			return getToken(TLParser.TOKEN_AND, i);
		}
		public List<TerminalNode> TOKEN_OR() { return getTokens(TLParser.TOKEN_OR); }
		public TerminalNode TOKEN_OR(int i) {
			return getToken(TLParser.TOKEN_OR, i);
		}
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(157);
				binary_bool();
				}
				break;
			case 2:
				{
				setState(158);
				unary_bool();
				}
				break;
			}
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TOKEN_AND || _la==TOKEN_OR) {
				{
				{
				setState(161);
				_la = _input.LA(1);
				if ( !(_la==TOKEN_AND || _la==TOKEN_OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(164);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(162);
					binary_bool();
					}
					break;
				case 2:
					{
					setState(163);
					unary_bool();
					}
					break;
				}
				}
				}
				setState(170);
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

	public static class Binary_boolContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TOKEN_MENOR() { return getToken(TLParser.TOKEN_MENOR, 0); }
		public TerminalNode TOKEN_MAYOR() { return getToken(TLParser.TOKEN_MAYOR, 0); }
		public TerminalNode TOKEN_MENOR_IGUAL() { return getToken(TLParser.TOKEN_MENOR_IGUAL, 0); }
		public TerminalNode TOKEN_MAYOR_IGUAL() { return getToken(TLParser.TOKEN_MAYOR_IGUAL, 0); }
		public TerminalNode TOKEN_DIFF_NUM() { return getToken(TLParser.TOKEN_DIFF_NUM, 0); }
		public TerminalNode TOKEN_IGUAL_NUM() { return getToken(TLParser.TOKEN_IGUAL_NUM, 0); }
		public Binary_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterBinary_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitBinary_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitBinary_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_boolContext binary_bool() throws RecognitionException {
		Binary_boolContext _localctx = new Binary_boolContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			expr();
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TOKEN_MAYOR) | (1L << TOKEN_MENOR) | (1L << TOKEN_MAYOR_IGUAL) | (1L << TOKEN_MENOR_IGUAL) | (1L << TOKEN_IGUAL_NUM) | (1L << TOKEN_DIFF_NUM))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(173);
			expr();
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

	public static class Unary_boolContext extends ParserRuleContext {
		public TerminalNode TOKEN_NOT() { return getToken(TLParser.TOKEN_NOT, 0); }
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public Unary_boolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterUnary_bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitUnary_bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitUnary_bool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_boolContext unary_bool() throws RecognitionException {
		Unary_boolContext _localctx = new Unary_boolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_unary_bool);
		try {
			setState(178);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TOKEN_NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				match(TOKEN_NOT);
				setState(176);
				match(ID);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(177);
				match(ID);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLParser.ID, 0); }
		public List<TerminalNode> WS() { return getTokens(TLParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(TLParser.WS, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLListener ) ((TLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TLVisitor ) return ((TLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ID);
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(181);
				match(WS);
				}
				}
				setState(186);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u00be\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3\3"+
		"\3\5\3\65\n\3\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\5\3\5\3\5"+
		"\3\5\3\5\7\5F\n\5\f\5\16\5I\13\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7_\n\7\f\7\16\7b\13\7\3\7"+
		"\5\7e\n\7\3\b\3\b\5\bi\n\b\3\t\3\t\3\t\7\tn\n\t\f\t\16\tq\13\t\5\ts\n"+
		"\t\3\n\3\n\7\nw\n\n\f\n\16\nz\13\n\3\n\5\n}\n\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\5\13\u0087\n\13\3\f\3\f\7\f\u008b\n\f\f\f\16\f\u008e"+
		"\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u009e\n\16\3\17\3\17\5\17\u00a2\n\17\3\17\3\17\3\17\5\17\u00a7\n\17"+
		"\7\17\u00a9\n\17\f\17\16\17\u00ac\13\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\5\21\u00b5\n\21\3\22\3\22\7\22\u00b9\n\22\f\22\16\22\u00bc\13\22"+
		"\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\4\3\2 !\4\2\31"+
		"\35\37\37\2\u00c0\2\'\3\2\2\2\4\64\3\2\2\2\6\66\3\2\2\2\b@\3\2\2\2\nM"+
		"\3\2\2\2\fd\3\2\2\2\16h\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24\u0086\3\2\2"+
		"\2\26\u0088\3\2\2\2\30\u0093\3\2\2\2\32\u0097\3\2\2\2\34\u00a1\3\2\2\2"+
		"\36\u00ad\3\2\2\2 \u00b4\3\2\2\2\"\u00b6\3\2\2\2$&\5\4\3\2%$\3\2\2\2&"+
		")\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3\2\2\2*,\5\n\6\2+*\3\2\2"+
		"\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2/-\3\2\2\2\60\61\5\16\b\2"+
		"\61\3\3\2\2\2\62\65\5\6\4\2\63\65\5\b\5\2\64\62\3\2\2\2\64\63\3\2\2\2"+
		"\65\5\3\2\2\2\66\67\7\f\2\2\678\7\3\2\28=\7.\2\29:\7\36\2\2:<\7.\2\2;"+
		"9\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>\7\3\2\2\2?=\3\2\2\2@A\7\20\2"+
		"\2AB\7\3\2\2BG\7.\2\2CD\7\36\2\2DF\7.\2\2EC\3\2\2\2FI\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\f\2\2KL\7.\2\2L\t\3\2\2\2MN\7\t\2"+
		"\2NO\7\3\2\2OP\7.\2\2PQ\7\27\2\2QR\5\f\7\2RS\7\30\2\2ST\5\16\b\2TU\7\16"+
		"\2\2UV\7\3\2\2VW\5\"\22\2WX\7\17\2\2XY\7\3\2\2YZ\7\t\2\2Z\13\3\2\2\2["+
		"`\7.\2\2\\]\7*\2\2]_\7.\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a"+
		"e\3\2\2\2b`\3\2\2\2ce\3\2\2\2d[\3\2\2\2dc\3\2\2\2e\r\3\2\2\2fi\5\20\t"+
		"\2gi\3\2\2\2hf\3\2\2\2hg\3\2\2\2i\17\3\2\2\2js\5\22\n\2ko\5\"\22\2ln\5"+
		"\"\22\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2ps\3\2\2\2qo\3\2\2\2rj"+
		"\3\2\2\2rk\3\2\2\2s\21\3\2\2\2tx\5\24\13\2uw\5\30\r\2vu\3\2\2\2wz\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y|\3\2\2\2zx\3\2\2\2{}\5\32\16\2|{\3\2\2\2|}\3"+
		"\2\2\2}\23\3\2\2\2~\177\5\26\f\2\177\u0080\7\23\2\2\u0080\u0081\5\16\b"+
		"\2\u0081\u0082\7\24\2\2\u0082\u0087\3\2\2\2\u0083\u0084\5\26\f\2\u0084"+
		"\u0085\5\20\t\2\u0085\u0087\3\2\2\2\u0086~\3\2\2\2\u0086\u0083\3\2\2\2"+
		"\u0087\25\3\2\2\2\u0088\u008c\7\6\2\2\u0089\u008b\7\61\2\2\u008a\u0089"+
		"\3\2\2\2\u008b\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d"+
		"\u008f\3\2\2\2\u008e\u008c\3\2\2\2\u008f\u0090\7\27\2\2\u0090\u0091\5"+
		"\34\17\2\u0091\u0092\7\30\2\2\u0092\27\3\2\2\2\u0093\u0094\7\7\2\2\u0094"+
		"\u0095\7\3\2\2\u0095\u0096\5\24\13\2\u0096\31\3\2\2\2\u0097\u009d\7\7"+
		"\2\2\u0098\u0099\7\23\2\2\u0099\u009a\5\16\b\2\u009a\u009b\7\24\2\2\u009b"+
		"\u009e\3\2\2\2\u009c\u009e\5\20\t\2\u009d\u0098\3\2\2\2\u009d\u009c\3"+
		"\2\2\2\u009e\33\3\2\2\2\u009f\u00a2\5\36\20\2\u00a0\u00a2\5 \21\2\u00a1"+
		"\u009f\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00aa\3\2\2\2\u00a3\u00a6\t\2"+
		"\2\2\u00a4\u00a7\5\36\20\2\u00a5\u00a7\5 \21\2\u00a6\u00a4\3\2\2\2\u00a6"+
		"\u00a5\3\2\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00aa"+
		"\3\2\2\2\u00ad\u00ae\5\"\22\2\u00ae\u00af\t\3\2\2\u00af\u00b0\5\"\22\2"+
		"\u00b0\37\3\2\2\2\u00b1\u00b2\7\"\2\2\u00b2\u00b5\7.\2\2\u00b3\u00b5\7"+
		".\2\2\u00b4\u00b1\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5!\3\2\2\2\u00b6\u00ba"+
		"\7.\2\2\u00b7\u00b9\7\61\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb#\3\2\2\2\u00bc\u00ba\3\2\2\2"+
		"\26\'-\64=G`dhorx|\u0086\u008c\u009d\u00a1\u00a6\u00aa\u00b4\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}