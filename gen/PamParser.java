// Generated from C:/Users/marti/PycharmProjects/antleris/src/Pam.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PamParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		NEWLINE=18, WEAKOP=19, STRONGOP=20, RELATION=21, NUMBER=22, VARNAME=23, 
		WS=24;
	public static final int
		RULE_progr = 0, RULE_series = 1, RULE_stmt = 2, RULE_input_stmt = 3, RULE_output_stmt = 4, 
		RULE_assign_stmt = 5, RULE_cond_stmt = 6, RULE_loop = 7, RULE_logical_weak = 8, 
		RULE_logical_strong = 9, RULE_logical_strongest = 10, RULE_compar = 11, 
		RULE_varlist = 12, RULE_expr = 13, RULE_term = 14, RULE_elem = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"progr", "series", "stmt", "input_stmt", "output_stmt", "assign_stmt", 
			"cond_stmt", "loop", "logical_weak", "logical_strong", "logical_strongest", 
			"compar", "varlist", "expr", "term", "elem"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'read'", "'write'", "':='", "'if'", "'then'", "'else'", 
			"'fi'", "'while'", "'do'", "'end'", "'NOT'", "'AND'", "'OR'", "','", 
			"'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "NEWLINE", "WEAKOP", "STRONGOP", 
			"RELATION", "NUMBER", "VARNAME", "WS"
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
	public String getGrammarFileName() { return "Pam.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PamParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgrContext extends ParserRuleContext {
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(PamParser.NEWLINE, 0); }
		public ProgrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_progr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterProgr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitProgr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitProgr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgrContext progr() throws RecognitionException {
		ProgrContext _localctx = new ProgrContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_progr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			series();
			setState(33);
			match(NEWLINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeriesContext extends ParserRuleContext {
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public SeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitSeries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitSeries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeriesContext series() throws RecognitionException {
		SeriesContext _localctx = new SeriesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_series);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			stmt();
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(36);
				match(T__0);
				setState(37);
				stmt();
				}
				}
				setState(42);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public Input_stmtContext input_stmt() {
			return getRuleContext(Input_stmtContext.class,0);
		}
		public Output_stmtContext output_stmt() {
			return getRuleContext(Output_stmtContext.class,0);
		}
		public Assign_stmtContext assign_stmt() {
			return getRuleContext(Assign_stmtContext.class,0);
		}
		public Cond_stmtContext cond_stmt() {
			return getRuleContext(Cond_stmtContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				input_stmt();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				output_stmt();
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				assign_stmt();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				cond_stmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				loop();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Input_stmtContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Input_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterInput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitInput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitInput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_stmtContext input_stmt() throws RecognitionException {
		Input_stmtContext _localctx = new Input_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__1);
			setState(51);
			varlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Output_stmtContext extends ParserRuleContext {
		public VarlistContext varlist() {
			return getRuleContext(VarlistContext.class,0);
		}
		public Output_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterOutput_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitOutput_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitOutput_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_stmtContext output_stmt() throws RecognitionException {
		Output_stmtContext _localctx = new Output_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_output_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__2);
			setState(54);
			varlist();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Assign_stmtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(PamParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Assign_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterAssign_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitAssign_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitAssign_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_stmtContext assign_stmt() throws RecognitionException {
		Assign_stmtContext _localctx = new Assign_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assign_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(VARNAME);
			setState(57);
			match(T__3);
			setState(58);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Cond_stmtContext extends ParserRuleContext {
		public Logical_strongestContext logical_strongest() {
			return getRuleContext(Logical_strongestContext.class,0);
		}
		public List<SeriesContext> series() {
			return getRuleContexts(SeriesContext.class);
		}
		public SeriesContext series(int i) {
			return getRuleContext(SeriesContext.class,i);
		}
		public Cond_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterCond_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitCond_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitCond_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_stmtContext cond_stmt() throws RecognitionException {
		Cond_stmtContext _localctx = new Cond_stmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cond_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__4);
			setState(61);
			logical_strongest(0);
			setState(62);
			match(T__5);
			setState(63);
			series();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(64);
				match(T__6);
				setState(65);
				series();
				}
			}

			setState(68);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ParserRuleContext {
		public Logical_strongestContext logical_strongest() {
			return getRuleContext(Logical_strongestContext.class,0);
		}
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__8);
			setState(71);
			logical_strongest(0);
			setState(72);
			match(T__9);
			setState(73);
			series();
			setState(74);
			match(T__10);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_weakContext extends ParserRuleContext {
		public Logical_weakContext logical_weak() {
			return getRuleContext(Logical_weakContext.class,0);
		}
		public ComparContext compar() {
			return getRuleContext(ComparContext.class,0);
		}
		public Logical_weakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_weak; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLogical_weak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLogical_weak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLogical_weak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_weakContext logical_weak() throws RecognitionException {
		Logical_weakContext _localctx = new Logical_weakContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_logical_weak);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(T__11);
				setState(77);
				logical_weak();
				}
				break;
			case T__15:
			case NUMBER:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				compar();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_strongContext extends ParserRuleContext {
		public Logical_weakContext logical_weak() {
			return getRuleContext(Logical_weakContext.class,0);
		}
		public Logical_strongContext logical_strong() {
			return getRuleContext(Logical_strongContext.class,0);
		}
		public Logical_strongContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_strong; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLogical_strong(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLogical_strong(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLogical_strong(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_strongContext logical_strong() throws RecognitionException {
		return logical_strong(0);
	}

	private Logical_strongContext logical_strong(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_strongContext _localctx = new Logical_strongContext(_ctx, _parentState);
		Logical_strongContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_logical_strong, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(82);
			logical_weak();
			}
			_ctx.stop = _input.LT(-1);
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_strongContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_strong);
					setState(84);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(85);
					match(T__12);
					setState(86);
					logical_weak();
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Logical_strongestContext extends ParserRuleContext {
		public Logical_strongContext logical_strong() {
			return getRuleContext(Logical_strongContext.class,0);
		}
		public Logical_strongestContext logical_strongest() {
			return getRuleContext(Logical_strongestContext.class,0);
		}
		public Logical_strongestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_strongest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterLogical_strongest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitLogical_strongest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitLogical_strongest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_strongestContext logical_strongest() throws RecognitionException {
		return logical_strongest(0);
	}

	private Logical_strongestContext logical_strongest(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Logical_strongestContext _localctx = new Logical_strongestContext(_ctx, _parentState);
		Logical_strongestContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_logical_strongest, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			logical_strong(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Logical_strongestContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logical_strongest);
					setState(95);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(96);
					match(T__13);
					setState(97);
					logical_strong(0);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RELATION() { return getToken(PamParser.RELATION, 0); }
		public ComparContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterCompar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitCompar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitCompar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparContext compar() throws RecognitionException {
		ComparContext _localctx = new ComparContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			expr();
			setState(104);
			match(RELATION);
			setState(105);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarlistContext extends ParserRuleContext {
		public List<TerminalNode> VARNAME() { return getTokens(PamParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(PamParser.VARNAME, i);
		}
		public VarlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varlist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterVarlist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitVarlist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitVarlist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarlistContext varlist() throws RecognitionException {
		VarlistContext _localctx = new VarlistContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(VARNAME);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(108);
				match(T__14);
				setState(109);
				match(VARNAME);
				}
				}
				setState(114);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> WEAKOP() { return getTokens(PamParser.WEAKOP); }
		public TerminalNode WEAKOP(int i) {
			return getToken(PamParser.WEAKOP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			term();
			setState(120);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(WEAKOP);
					setState(117);
					term();
					}
					} 
				}
				setState(122);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<ElemContext> elem() {
			return getRuleContexts(ElemContext.class);
		}
		public ElemContext elem(int i) {
			return getRuleContext(ElemContext.class,i);
		}
		public List<TerminalNode> STRONGOP() { return getTokens(PamParser.STRONGOP); }
		public TerminalNode STRONGOP(int i) {
			return getToken(PamParser.STRONGOP, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			elem();
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(124);
					match(STRONGOP);
					setState(125);
					elem();
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElemContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(PamParser.NUMBER, 0); }
		public TerminalNode VARNAME() { return getToken(PamParser.VARNAME, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).enterElem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PamListener ) ((PamListener)listener).exitElem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PamVisitor ) return ((PamVisitor<? extends T>)visitor).visitElem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElemContext elem() throws RecognitionException {
		ElemContext _localctx = new ElemContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elem);
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(NUMBER);
				}
				break;
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(VARNAME);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(T__15);
				setState(134);
				expr();
				setState(135);
				match(T__16);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return logical_strong_sempred((Logical_strongContext)_localctx, predIndex);
		case 10:
			return logical_strongest_sempred((Logical_strongestContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logical_strong_sempred(Logical_strongContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean logical_strongest_sempred(Logical_strongestContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0018\u008c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*\t\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00021\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006C\b\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\bP\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\tX\b\t\n\t\f\t[\t\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nc\b\n\n\n\f\nf\t\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\fo"+
		"\b\f\n\f\f\fr\t\f\u0001\r\u0001\r\u0001\r\u0005\rw\b\r\n\r\f\rz\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u007f\b\u000e\n\u000e\f\u000e"+
		"\u0082\t\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u008a\b\u000f\u0001\u000f\u0000\u0002\u0012\u0014"+
		"\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e\u0000\u0000\u0089\u0000 \u0001\u0000\u0000\u0000\u0002"+
		"#\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000\u00062\u0001"+
		"\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000"+
		"\f<\u0001\u0000\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010O\u0001"+
		"\u0000\u0000\u0000\u0012Q\u0001\u0000\u0000\u0000\u0014\\\u0001\u0000"+
		"\u0000\u0000\u0016g\u0001\u0000\u0000\u0000\u0018k\u0001\u0000\u0000\u0000"+
		"\u001as\u0001\u0000\u0000\u0000\u001c{\u0001\u0000\u0000\u0000\u001e\u0089"+
		"\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000!\"\u0005\u0012\u0000"+
		"\u0000\"\u0001\u0001\u0000\u0000\u0000#(\u0003\u0004\u0002\u0000$%\u0005"+
		"\u0001\u0000\u0000%\'\u0003\u0004\u0002\u0000&$\u0001\u0000\u0000\u0000"+
		"\'*\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)\u0003\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+1\u0003"+
		"\u0006\u0003\u0000,1\u0003\b\u0004\u0000-1\u0003\n\u0005\u0000.1\u0003"+
		"\f\u0006\u0000/1\u0003\u000e\u0007\u00000+\u0001\u0000\u0000\u00000,\u0001"+
		"\u0000\u0000\u00000-\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u0000"+
		"0/\u0001\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000023\u0005\u0002"+
		"\u0000\u000034\u0003\u0018\f\u00004\u0007\u0001\u0000\u0000\u000056\u0005"+
		"\u0003\u0000\u000067\u0003\u0018\f\u00007\t\u0001\u0000\u0000\u000089"+
		"\u0005\u0017\u0000\u00009:\u0005\u0004\u0000\u0000:;\u0003\u001a\r\u0000"+
		";\u000b\u0001\u0000\u0000\u0000<=\u0005\u0005\u0000\u0000=>\u0003\u0014"+
		"\n\u0000>?\u0005\u0006\u0000\u0000?B\u0003\u0002\u0001\u0000@A\u0005\u0007"+
		"\u0000\u0000AC\u0003\u0002\u0001\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DE\u0005\b\u0000\u0000E\r"+
		"\u0001\u0000\u0000\u0000FG\u0005\t\u0000\u0000GH\u0003\u0014\n\u0000H"+
		"I\u0005\n\u0000\u0000IJ\u0003\u0002\u0001\u0000JK\u0005\u000b\u0000\u0000"+
		"K\u000f\u0001\u0000\u0000\u0000LM\u0005\f\u0000\u0000MP\u0003\u0010\b"+
		"\u0000NP\u0003\u0016\u000b\u0000OL\u0001\u0000\u0000\u0000ON\u0001\u0000"+
		"\u0000\u0000P\u0011\u0001\u0000\u0000\u0000QR\u0006\t\uffff\uffff\u0000"+
		"RS\u0003\u0010\b\u0000SY\u0001\u0000\u0000\u0000TU\n\u0002\u0000\u0000"+
		"UV\u0005\r\u0000\u0000VX\u0003\u0010\b\u0000WT\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\u0013\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0006"+
		"\n\uffff\uffff\u0000]^\u0003\u0012\t\u0000^d\u0001\u0000\u0000\u0000_"+
		"`\n\u0002\u0000\u0000`a\u0005\u000e\u0000\u0000ac\u0003\u0012\t\u0000"+
		"b_\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000e\u0015\u0001\u0000\u0000\u0000fd\u0001"+
		"\u0000\u0000\u0000gh\u0003\u001a\r\u0000hi\u0005\u0015\u0000\u0000ij\u0003"+
		"\u001a\r\u0000j\u0017\u0001\u0000\u0000\u0000kp\u0005\u0017\u0000\u0000"+
		"lm\u0005\u000f\u0000\u0000mo\u0005\u0017\u0000\u0000nl\u0001\u0000\u0000"+
		"\u0000or\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000q\u0019\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"sx\u0003\u001c\u000e\u0000tu\u0005\u0013\u0000\u0000uw\u0003\u001c\u000e"+
		"\u0000vt\u0001\u0000\u0000\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u001b\u0001\u0000\u0000\u0000"+
		"zx\u0001\u0000\u0000\u0000{\u0080\u0003\u001e\u000f\u0000|}\u0005\u0014"+
		"\u0000\u0000}\u007f\u0003\u001e\u000f\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0001\u0000\u0000\u0000\u0081\u001d\u0001\u0000\u0000\u0000\u0082"+
		"\u0080\u0001\u0000\u0000\u0000\u0083\u008a\u0005\u0016\u0000\u0000\u0084"+
		"\u008a\u0005\u0017\u0000\u0000\u0085\u0086\u0005\u0010\u0000\u0000\u0086"+
		"\u0087\u0003\u001a\r\u0000\u0087\u0088\u0005\u0011\u0000\u0000\u0088\u008a"+
		"\u0001\u0000\u0000\u0000\u0089\u0083\u0001\u0000\u0000\u0000\u0089\u0084"+
		"\u0001\u0000\u0000\u0000\u0089\u0085\u0001\u0000\u0000\u0000\u008a\u001f"+
		"\u0001\u0000\u0000\u0000\n(0BOYdpx\u0080\u0089";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}