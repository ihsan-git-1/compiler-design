// Generated from java-escape by ANTLR 4.11.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class dart_parse extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, CRLY_BRKT_OP=2, CRLY_BRKT_CL=3, ANGLE_BRKT_OP=4, ANGLE_BRKT_CL=5, 
		BRKT_OP=6, BRKT_CL=7, SQR_BRKT_OP=8, SQR_BRKT_CL=9, SEMICOLON=10, COMMA=11, 
		COLON=12, PLUS=13, MINUS=14, MULTY=15, DIVIDE=16, EQUAL=17, ASSIGN=18, 
		NOTEQUAL=19, DOT=20, INT=21, STRING=22, BOOL=23, DOUBLE=24, LIST=25, EXTENDS=26, 
		RETURN=27, ALL=28, FINAL=29, CONST=30, VAR=31, STRING_LINE=32, BUILDCONTEXT=33, 
		STATE=34, CREATE=35, CREATESTATE=36, WIDGET=37, BUILD=38, CONTAINER=39, 
		EXPANDED=40, MATERIALBUTTON=41, CHILD=42, WIDTH=43, HEIGHT=44, COLOR=45, 
		MATERIALAPP=46, HOME=47, SCAFFOLD=48, PADDING=49, PADDINGSMALL=50, EDGEINSETS=51, 
		ROW=52, COLUMN=53, IMAGE=54, BODY=55, TEXT=56, NETWORK=57, CHILDREN=58, 
		DYNAMIC=59, STATEFULL=60, STATELESS=61, TRUE=62, FALSE=63, NAME=64, NUMBERDOUBLE=65, 
		NUMBER=66, COMMENT=67, OVERRIDE=68, PRIVATE=69, WS=70;
	public static final int
		RULE_topTreeDeclaration = 0, RULE_allClassesDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_statelessClassDeclaration = 3, RULE_statefullClassDeclaration = 4, 
		RULE_stfulFirstBody = 5, RULE_stfulSecondBody = 6, RULE_statefullAssignStateClassDeclaration = 7, 
		RULE_returnStateTypes = 8, RULE_functionReturnState = 9, RULE_returnArrowState = 10, 
		RULE_buildMethodDeclaration = 11, RULE_dartVariabelsDeclaration = 12, 
		RULE_variable = 13, RULE_integerDeclaration = 14, RULE_doubleDeclaration = 15, 
		RULE_stringDeclaration = 16, RULE_boolDeclaration = 17, RULE_addExpression = 18, 
		RULE_multiplyExpression = 19, RULE_addDoubleExpression = 20, RULE_multiplyDoubleExpression = 21, 
		RULE_booleans = 22, RULE_dartAllListsDeclaration = 23, RULE_dartListStringDeclaration = 24, 
		RULE_dartListIntDeclaration = 25, RULE_dartListBoolDeclaration = 26, RULE_widgetsDeclaration = 27, 
		RULE_expandedDeclaration = 28, RULE_paddingDeclaration = 29, RULE_scaffoldDeclaration = 30, 
		RULE_textDeclaration = 31, RULE_materialAppDeclaration = 32, RULE_materialButtonDeclaration = 33, 
		RULE_conatinerDeclaration = 34, RULE_rowColumnDeclaration = 35, RULE_imageDeclaration = 36, 
		RULE_conatinerPropertiesDeclaration = 37, RULE_paddingPropertyDeclaration = 38, 
		RULE_edgeInsistAll = 39, RULE_heightPropertyDeclaration = 40, RULE_widthPropertyDeclaration = 41, 
		RULE_homePropertyDeclaration = 42, RULE_childPropertyDeclaration = 43, 
		RULE_childrenPropertyDeclaration = 44, RULE_bodyPropertyDeclaration = 45, 
		RULE_buildContextDeclaration = 46, RULE_number = 47, RULE_numberDouble = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"topTreeDeclaration", "allClassesDeclaration", "classDeclaration", "statelessClassDeclaration", 
			"statefullClassDeclaration", "stfulFirstBody", "stfulSecondBody", "statefullAssignStateClassDeclaration", 
			"returnStateTypes", "functionReturnState", "returnArrowState", "buildMethodDeclaration", 
			"dartVariabelsDeclaration", "variable", "integerDeclaration", "doubleDeclaration", 
			"stringDeclaration", "boolDeclaration", "addExpression", "multiplyExpression", 
			"addDoubleExpression", "multiplyDoubleExpression", "booleans", "dartAllListsDeclaration", 
			"dartListStringDeclaration", "dartListIntDeclaration", "dartListBoolDeclaration", 
			"widgetsDeclaration", "expandedDeclaration", "paddingDeclaration", "scaffoldDeclaration", 
			"textDeclaration", "materialAppDeclaration", "materialButtonDeclaration", 
			"conatinerDeclaration", "rowColumnDeclaration", "imageDeclaration", "conatinerPropertiesDeclaration", 
			"paddingPropertyDeclaration", "edgeInsistAll", "heightPropertyDeclaration", 
			"widthPropertyDeclaration", "homePropertyDeclaration", "childPropertyDeclaration", 
			"childrenPropertyDeclaration", "bodyPropertyDeclaration", "buildContextDeclaration", 
			"number", "numberDouble"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'<'", "'>'", "'('", "')'", "'['", "']'", 
			"';'", "','", "':'", "'+'", "'-'", "'*'", "'/'", "'=='", "'='", "'!='", 
			"'.'", "'int'", "'String'", "'bool'", "'double'", "'List'", "'extends'", 
			"'return'", "'all'", "'final'", "'const'", "'var'", null, "'BuildContext'", 
			"'State'", "'create'", "'createState'", "'Widget'", "'build'", "'Container'", 
			"'Expanded'", "'MaterialButton'", "'child'", "'width'", "'height'", "'color'", 
			"'MaterialApp'", "'home'", "'Scaffold'", "'Padding'", "'padding'", "'EdgeInsets'", 
			"'Row'", "'Column'", "'Image'", "'body'", "'Text'", "'network'", "'children'", 
			"'dynamic'", null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "CRLY_BRKT_OP", "CRLY_BRKT_CL", "ANGLE_BRKT_OP", "ANGLE_BRKT_CL", 
			"BRKT_OP", "BRKT_CL", "SQR_BRKT_OP", "SQR_BRKT_CL", "SEMICOLON", "COMMA", 
			"COLON", "PLUS", "MINUS", "MULTY", "DIVIDE", "EQUAL", "ASSIGN", "NOTEQUAL", 
			"DOT", "INT", "STRING", "BOOL", "DOUBLE", "LIST", "EXTENDS", "RETURN", 
			"ALL", "FINAL", "CONST", "VAR", "STRING_LINE", "BUILDCONTEXT", "STATE", 
			"CREATE", "CREATESTATE", "WIDGET", "BUILD", "CONTAINER", "EXPANDED", 
			"MATERIALBUTTON", "CHILD", "WIDTH", "HEIGHT", "COLOR", "MATERIALAPP", 
			"HOME", "SCAFFOLD", "PADDING", "PADDINGSMALL", "EDGEINSETS", "ROW", "COLUMN", 
			"IMAGE", "BODY", "TEXT", "NETWORK", "CHILDREN", "DYNAMIC", "STATEFULL", 
			"STATELESS", "TRUE", "FALSE", "NAME", "NUMBERDOUBLE", "NUMBER", "COMMENT", 
			"OVERRIDE", "PRIVATE", "WS"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public dart_parse(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TopTreeDeclarationContext extends ParserRuleContext {
		public List<AllClassesDeclarationContext> allClassesDeclaration() {
			return getRuleContexts(AllClassesDeclarationContext.class);
		}
		public AllClassesDeclarationContext allClassesDeclaration(int i) {
			return getRuleContext(AllClassesDeclarationContext.class,i);
		}
		public TopTreeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topTreeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterTopTreeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitTopTreeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitTopTreeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopTreeDeclarationContext topTreeDeclaration() throws RecognitionException {
		TopTreeDeclarationContext _localctx = new TopTreeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topTreeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(98);
				allClassesDeclaration();
				}
				}
				setState(103);
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
	public static class AllClassesDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public StatefullClassDeclarationContext statefullClassDeclaration() {
			return getRuleContext(StatefullClassDeclarationContext.class,0);
		}
		public StatelessClassDeclarationContext statelessClassDeclaration() {
			return getRuleContext(StatelessClassDeclarationContext.class,0);
		}
		public AllClassesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allClassesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterAllClassesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitAllClassesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitAllClassesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllClassesDeclarationContext allClassesDeclaration() throws RecognitionException {
		AllClassesDeclarationContext _localctx = new AllClassesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_allClassesDeclaration);
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				statefullClassDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				statelessClassDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dart_parse.CLASS, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public List<DartVariabelsDeclarationContext> dartVariabelsDeclaration() {
			return getRuleContexts(DartVariabelsDeclarationContext.class);
		}
		public DartVariabelsDeclarationContext dartVariabelsDeclaration(int i) {
			return getRuleContext(DartVariabelsDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(CLASS);
			setState(110);
			match(NAME);
			setState(111);
			match(CRLY_BRKT_OP);
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 8796093023007L) != 0) {
				{
				{
				setState(112);
				dartVariabelsDeclaration();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(CRLY_BRKT_CL);
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
	public static class StatelessClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dart_parse.CLASS, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode STATELESS() { return getToken(dart_parse.STATELESS, 0); }
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public BuildMethodDeclarationContext buildMethodDeclaration() {
			return getRuleContext(BuildMethodDeclarationContext.class,0);
		}
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public List<DartVariabelsDeclarationContext> dartVariabelsDeclaration() {
			return getRuleContexts(DartVariabelsDeclarationContext.class);
		}
		public DartVariabelsDeclarationContext dartVariabelsDeclaration(int i) {
			return getRuleContext(DartVariabelsDeclarationContext.class,i);
		}
		public StatelessClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelessClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStatelessClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStatelessClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStatelessClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatelessClassDeclarationContext statelessClassDeclaration() throws RecognitionException {
		StatelessClassDeclarationContext _localctx = new StatelessClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statelessClassDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(CLASS);
			setState(121);
			match(NAME);
			setState(122);
			match(STATELESS);
			setState(123);
			match(CRLY_BRKT_OP);
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 8796093023007L) != 0) {
				{
				{
				setState(124);
				dartVariabelsDeclaration();
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			buildMethodDeclaration();
			setState(131);
			match(CRLY_BRKT_CL);
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
	public static class StatefullClassDeclarationContext extends ParserRuleContext {
		public StfulFirstBodyContext stfulFirstBody() {
			return getRuleContext(StfulFirstBodyContext.class,0);
		}
		public StfulSecondBodyContext stfulSecondBody() {
			return getRuleContext(StfulSecondBodyContext.class,0);
		}
		public StatefullClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statefullClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStatefullClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStatefullClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStatefullClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatefullClassDeclarationContext statefullClassDeclaration() throws RecognitionException {
		StatefullClassDeclarationContext _localctx = new StatefullClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statefullClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			stfulFirstBody();
			setState(134);
			stfulSecondBody();
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
	public static class StfulFirstBodyContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dart_parse.CLASS, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode STATEFULL() { return getToken(dart_parse.STATEFULL, 0); }
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public StatefullAssignStateClassDeclarationContext statefullAssignStateClassDeclaration() {
			return getRuleContext(StatefullAssignStateClassDeclarationContext.class,0);
		}
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public List<DartVariabelsDeclarationContext> dartVariabelsDeclaration() {
			return getRuleContexts(DartVariabelsDeclarationContext.class);
		}
		public DartVariabelsDeclarationContext dartVariabelsDeclaration(int i) {
			return getRuleContext(DartVariabelsDeclarationContext.class,i);
		}
		public StfulFirstBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stfulFirstBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStfulFirstBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStfulFirstBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStfulFirstBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StfulFirstBodyContext stfulFirstBody() throws RecognitionException {
		StfulFirstBodyContext _localctx = new StfulFirstBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stfulFirstBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(CLASS);
			setState(137);
			match(NAME);
			setState(138);
			match(STATEFULL);
			setState(139);
			match(CRLY_BRKT_OP);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 8796093023007L) != 0) {
				{
				{
				setState(140);
				dartVariabelsDeclaration();
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			statefullAssignStateClassDeclaration();
			setState(147);
			match(CRLY_BRKT_CL);
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
	public static class StfulSecondBodyContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(dart_parse.CLASS, 0); }
		public List<TerminalNode> NAME() { return getTokens(dart_parse.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(dart_parse.NAME, i);
		}
		public TerminalNode EXTENDS() { return getToken(dart_parse.EXTENDS, 0); }
		public TerminalNode STATE() { return getToken(dart_parse.STATE, 0); }
		public TerminalNode ANGLE_BRKT_OP() { return getToken(dart_parse.ANGLE_BRKT_OP, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public BuildMethodDeclarationContext buildMethodDeclaration() {
			return getRuleContext(BuildMethodDeclarationContext.class,0);
		}
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public List<DartVariabelsDeclarationContext> dartVariabelsDeclaration() {
			return getRuleContexts(DartVariabelsDeclarationContext.class);
		}
		public DartVariabelsDeclarationContext dartVariabelsDeclaration(int i) {
			return getRuleContext(DartVariabelsDeclarationContext.class,i);
		}
		public StfulSecondBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stfulSecondBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStfulSecondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStfulSecondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStfulSecondBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StfulSecondBodyContext stfulSecondBody() throws RecognitionException {
		StfulSecondBodyContext _localctx = new StfulSecondBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stfulSecondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(CLASS);
			setState(150);
			match(NAME);
			setState(151);
			match(EXTENDS);
			setState(152);
			match(STATE);
			setState(153);
			match(ANGLE_BRKT_OP);
			setState(154);
			match(NAME);
			setState(155);
			match(ANGLE_BRKT_CL);
			setState(156);
			match(CRLY_BRKT_OP);
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 8796093023007L) != 0) {
				{
				{
				setState(157);
				dartVariabelsDeclaration();
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(163);
			buildMethodDeclaration();
			setState(164);
			match(CRLY_BRKT_CL);
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
	public static class StatefullAssignStateClassDeclarationContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(dart_parse.STATE, 0); }
		public TerminalNode ANGLE_BRKT_OP() { return getToken(dart_parse.ANGLE_BRKT_OP, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public TerminalNode CREATESTATE() { return getToken(dart_parse.CREATESTATE, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public ReturnStateTypesContext returnStateTypes() {
			return getRuleContext(ReturnStateTypesContext.class,0);
		}
		public StatefullAssignStateClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statefullAssignStateClassDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStatefullAssignStateClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStatefullAssignStateClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStatefullAssignStateClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatefullAssignStateClassDeclarationContext statefullAssignStateClassDeclaration() throws RecognitionException {
		StatefullAssignStateClassDeclarationContext _localctx = new StatefullAssignStateClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statefullAssignStateClassDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(STATE);
			setState(167);
			match(ANGLE_BRKT_OP);
			setState(168);
			match(NAME);
			setState(169);
			match(ANGLE_BRKT_CL);
			setState(170);
			match(CREATESTATE);
			setState(171);
			match(BRKT_OP);
			setState(172);
			match(BRKT_CL);
			setState(173);
			returnStateTypes();
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
	public static class ReturnStateTypesContext extends ParserRuleContext {
		public ReturnArrowStateContext returnArrowState() {
			return getRuleContext(ReturnArrowStateContext.class,0);
		}
		public FunctionReturnStateContext functionReturnState() {
			return getRuleContext(FunctionReturnStateContext.class,0);
		}
		public ReturnStateTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStateTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterReturnStateTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitReturnStateTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitReturnStateTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStateTypesContext returnStateTypes() throws RecognitionException {
		ReturnStateTypesContext _localctx = new ReturnStateTypesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnStateTypes);
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				returnArrowState();
				}
				break;
			case CRLY_BRKT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				functionReturnState();
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
	public static class FunctionReturnStateContext extends ParserRuleContext {
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public TerminalNode RETURN() { return getToken(dart_parse.RETURN, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public FunctionReturnStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterFunctionReturnState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitFunctionReturnState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitFunctionReturnState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnStateContext functionReturnState() throws RecognitionException {
		FunctionReturnStateContext _localctx = new FunctionReturnStateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionReturnState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(CRLY_BRKT_OP);
			setState(180);
			match(RETURN);
			setState(181);
			match(NAME);
			setState(182);
			match(BRKT_OP);
			setState(183);
			match(BRKT_CL);
			setState(184);
			match(SEMICOLON);
			setState(185);
			match(CRLY_BRKT_CL);
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
	public static class ReturnArrowStateContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public ReturnArrowStateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnArrowState; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterReturnArrowState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitReturnArrowState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitReturnArrowState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnArrowStateContext returnArrowState() throws RecognitionException {
		ReturnArrowStateContext _localctx = new ReturnArrowStateContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnArrowState);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ASSIGN);
			setState(188);
			match(ANGLE_BRKT_CL);
			setState(189);
			match(NAME);
			setState(190);
			match(BRKT_OP);
			setState(191);
			match(BRKT_CL);
			setState(192);
			match(SEMICOLON);
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
	public static class BuildMethodDeclarationContext extends ParserRuleContext {
		public TerminalNode WIDGET() { return getToken(dart_parse.WIDGET, 0); }
		public TerminalNode BUILD() { return getToken(dart_parse.BUILD, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public BuildContextDeclarationContext buildContextDeclaration() {
			return getRuleContext(BuildContextDeclarationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public TerminalNode RETURN() { return getToken(dart_parse.RETURN, 0); }
		public WidgetsDeclarationContext widgetsDeclaration() {
			return getRuleContext(WidgetsDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public List<DartVariabelsDeclarationContext> dartVariabelsDeclaration() {
			return getRuleContexts(DartVariabelsDeclarationContext.class);
		}
		public DartVariabelsDeclarationContext dartVariabelsDeclaration(int i) {
			return getRuleContext(DartVariabelsDeclarationContext.class,i);
		}
		public BuildMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBuildMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBuildMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBuildMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildMethodDeclarationContext buildMethodDeclaration() throws RecognitionException {
		BuildMethodDeclarationContext _localctx = new BuildMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_buildMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(WIDGET);
			setState(195);
			match(BUILD);
			setState(196);
			match(BRKT_OP);
			setState(197);
			buildContextDeclaration();
			setState(198);
			match(BRKT_CL);
			setState(199);
			match(CRLY_BRKT_OP);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 21)) & ~0x3f) == 0 && ((1L << (_la - 21)) & 8796093023007L) != 0) {
				{
				{
				setState(200);
				dartVariabelsDeclaration();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(RETURN);
			setState(207);
			widgetsDeclaration();
			setState(208);
			match(SEMICOLON);
			setState(209);
			match(CRLY_BRKT_CL);
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
	public static class DartVariabelsDeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public DartAllListsDeclarationContext dartAllListsDeclaration() {
			return getRuleContext(DartAllListsDeclarationContext.class,0);
		}
		public DartVariabelsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dartVariabelsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDartVariabelsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDartVariabelsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDartVariabelsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DartVariabelsDeclarationContext dartVariabelsDeclaration() throws RecognitionException {
		DartVariabelsDeclarationContext _localctx = new DartVariabelsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dartVariabelsDeclaration);
		try {
			setState(213);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case BOOL:
			case DOUBLE:
			case FINAL:
			case CONST:
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				variable();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				dartAllListsDeclaration();
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public IntegerDeclarationContext integerDeclaration() {
			return getRuleContext(IntegerDeclarationContext.class,0);
		}
		public StringDeclarationContext stringDeclaration() {
			return getRuleContext(StringDeclarationContext.class,0);
		}
		public BoolDeclarationContext boolDeclaration() {
			return getRuleContext(BoolDeclarationContext.class,0);
		}
		public DoubleDeclarationContext doubleDeclaration() {
			return getRuleContext(DoubleDeclarationContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(dart_parse.FINAL, 0); }
		public TerminalNode CONST() { return getToken(dart_parse.CONST, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==CONST) {
				{
				setState(215);
				_la = _input.LA(1);
				if ( !(_la==FINAL || _la==CONST) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(218);
				integerDeclaration();
				}
				break;
			case 2:
				{
				setState(219);
				stringDeclaration();
				}
				break;
			case 3:
				{
				setState(220);
				boolDeclaration();
				}
				break;
			case 4:
				{
				setState(221);
				doubleDeclaration();
				}
				break;
			}
			setState(224);
			match(SEMICOLON);
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
	public static class IntegerDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode INT() { return getToken(dart_parse.INT, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public IntegerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterIntegerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitIntegerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitIntegerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerDeclarationContext integerDeclaration() throws RecognitionException {
		IntegerDeclarationContext _localctx = new IntegerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(226);
				match(INT);
				}
			}

			setState(229);
			match(NAME);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(230);
				match(ASSIGN);
				setState(231);
				addExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DoubleDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode DOUBLE() { return getToken(dart_parse.DOUBLE, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public AddDoubleExpressionContext addDoubleExpression() {
			return getRuleContext(AddDoubleExpressionContext.class,0);
		}
		public DoubleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDoubleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDoubleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDoubleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleDeclarationContext doubleDeclaration() throws RecognitionException {
		DoubleDeclarationContext _localctx = new DoubleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doubleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE) {
				{
				setState(234);
				match(DOUBLE);
				}
			}

			setState(237);
			match(NAME);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(238);
				match(ASSIGN);
				setState(239);
				addDoubleExpression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode STRING() { return getToken(dart_parse.STRING, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public TerminalNode STRING_LINE() { return getToken(dart_parse.STRING_LINE, 0); }
		public StringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDeclarationContext stringDeclaration() throws RecognitionException {
		StringDeclarationContext _localctx = new StringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stringDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(242);
				match(STRING);
				}
			}

			setState(245);
			match(NAME);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(246);
				match(ASSIGN);
				setState(247);
				match(STRING_LINE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode BOOL() { return getToken(dart_parse.BOOL, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public BoolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBoolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBoolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolDeclarationContext boolDeclaration() throws RecognitionException {
		BoolDeclarationContext _localctx = new BoolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_boolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(250);
				match(BOOL);
				}
			}

			setState(253);
			match(NAME);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(254);
				match(ASSIGN);
				setState(255);
				booleans();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AddExpressionContext extends ParserRuleContext {
		public List<MultiplyExpressionContext> multiplyExpression() {
			return getRuleContexts(MultiplyExpressionContext.class);
		}
		public MultiplyExpressionContext multiplyExpression(int i) {
			return getRuleContext(MultiplyExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(dart_parse.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(dart_parse.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(dart_parse.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(dart_parse.MINUS, i);
		}
		public AddExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterAddExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitAddExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitAddExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpressionContext addExpression() throws RecognitionException {
		AddExpressionContext _localctx = new AddExpressionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			multiplyExpression();
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(260);
				multiplyExpression();
				}
				}
				setState(265);
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
	public static class MultiplyExpressionContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> MULTY() { return getTokens(dart_parse.MULTY); }
		public TerminalNode MULTY(int i) {
			return getToken(dart_parse.MULTY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(dart_parse.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(dart_parse.DIVIDE, i);
		}
		public MultiplyExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterMultiplyExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitMultiplyExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitMultiplyExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyExpressionContext multiplyExpression() throws RecognitionException {
		MultiplyExpressionContext _localctx = new MultiplyExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_multiplyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			number();
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(268);
				number();
				}
				}
				setState(273);
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
	public static class AddDoubleExpressionContext extends ParserRuleContext {
		public List<MultiplyDoubleExpressionContext> multiplyDoubleExpression() {
			return getRuleContexts(MultiplyDoubleExpressionContext.class);
		}
		public MultiplyDoubleExpressionContext multiplyDoubleExpression(int i) {
			return getRuleContext(MultiplyDoubleExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(dart_parse.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(dart_parse.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(dart_parse.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(dart_parse.MINUS, i);
		}
		public AddDoubleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addDoubleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterAddDoubleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitAddDoubleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitAddDoubleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddDoubleExpressionContext addDoubleExpression() throws RecognitionException {
		AddDoubleExpressionContext _localctx = new AddDoubleExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addDoubleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			multiplyDoubleExpression();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(275);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(276);
				multiplyDoubleExpression();
				}
				}
				setState(281);
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
	public static class MultiplyDoubleExpressionContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<NumberDoubleContext> numberDouble() {
			return getRuleContexts(NumberDoubleContext.class);
		}
		public NumberDoubleContext numberDouble(int i) {
			return getRuleContext(NumberDoubleContext.class,i);
		}
		public List<TerminalNode> MULTY() { return getTokens(dart_parse.MULTY); }
		public TerminalNode MULTY(int i) {
			return getToken(dart_parse.MULTY, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(dart_parse.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(dart_parse.DIVIDE, i);
		}
		public MultiplyDoubleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyDoubleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterMultiplyDoubleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitMultiplyDoubleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitMultiplyDoubleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyDoubleExpressionContext multiplyDoubleExpression() throws RecognitionException {
		MultiplyDoubleExpressionContext _localctx = new MultiplyDoubleExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_multiplyDoubleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(282);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(283);
				numberDouble();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(286);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(287);
					number();
					}
					break;
				case NUMBERDOUBLE:
					{
					setState(288);
					numberDouble();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleansContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(dart_parse.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(dart_parse.FALSE, 0); }
		public BooleansContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleans; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBooleans(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBooleans(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBooleans(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleansContext booleans() throws RecognitionException {
		BooleansContext _localctx = new BooleansContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class DartAllListsDeclarationContext extends ParserRuleContext {
		public DartListStringDeclarationContext dartListStringDeclaration() {
			return getRuleContext(DartListStringDeclarationContext.class,0);
		}
		public DartListIntDeclarationContext dartListIntDeclaration() {
			return getRuleContext(DartListIntDeclarationContext.class,0);
		}
		public DartListBoolDeclarationContext dartListBoolDeclaration() {
			return getRuleContext(DartListBoolDeclarationContext.class,0);
		}
		public DartAllListsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dartAllListsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDartAllListsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDartAllListsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDartAllListsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DartAllListsDeclarationContext dartAllListsDeclaration() throws RecognitionException {
		DartAllListsDeclarationContext _localctx = new DartAllListsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dartAllListsDeclaration);
		try {
			setState(301);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				dartListStringDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				dartListIntDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(300);
				dartListBoolDeclaration();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DartListStringDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(dart_parse.LIST, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public TerminalNode SQR_BRKT_OP() { return getToken(dart_parse.SQR_BRKT_OP, 0); }
		public TerminalNode SQR_BRKT_CL() { return getToken(dart_parse.SQR_BRKT_CL, 0); }
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public TerminalNode ANGLE_BRKT_OP() { return getToken(dart_parse.ANGLE_BRKT_OP, 0); }
		public TerminalNode STRING() { return getToken(dart_parse.STRING, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public List<TerminalNode> STRING_LINE() { return getTokens(dart_parse.STRING_LINE); }
		public TerminalNode STRING_LINE(int i) {
			return getToken(dart_parse.STRING_LINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public DartListStringDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dartListStringDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDartListStringDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDartListStringDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDartListStringDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DartListStringDeclarationContext dartListStringDeclaration() throws RecognitionException {
		DartListStringDeclarationContext _localctx = new DartListStringDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_dartListStringDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(LIST);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(304);
				match(ANGLE_BRKT_OP);
				setState(305);
				match(STRING);
				setState(306);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(309);
			match(NAME);
			setState(310);
			match(ASSIGN);
			setState(311);
			match(SQR_BRKT_OP);
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LINE) {
				{
				setState(312);
				match(STRING_LINE);
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(313);
						match(COMMA);
						setState(314);
						match(STRING_LINE);
						}
						} 
					}
					setState(319);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				}
			}

			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(322);
				match(COMMA);
				}
			}

			setState(325);
			match(SQR_BRKT_CL);
			setState(326);
			match(SEMICOLON);
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
	public static class DartListIntDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(dart_parse.LIST, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public TerminalNode SQR_BRKT_OP() { return getToken(dart_parse.SQR_BRKT_OP, 0); }
		public TerminalNode SQR_BRKT_CL() { return getToken(dart_parse.SQR_BRKT_CL, 0); }
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public TerminalNode ANGLE_BRKT_OP() { return getToken(dart_parse.ANGLE_BRKT_OP, 0); }
		public TerminalNode INT() { return getToken(dart_parse.INT, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public DartListIntDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dartListIntDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDartListIntDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDartListIntDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDartListIntDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DartListIntDeclarationContext dartListIntDeclaration() throws RecognitionException {
		DartListIntDeclarationContext _localctx = new DartListIntDeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_dartListIntDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(LIST);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(329);
				match(ANGLE_BRKT_OP);
				setState(330);
				match(INT);
				setState(331);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(334);
			match(NAME);
			setState(335);
			match(ASSIGN);
			setState(336);
			match(SQR_BRKT_OP);
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(337);
				number();
				setState(342);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(338);
						match(COMMA);
						setState(339);
						number();
						}
						} 
					}
					setState(344);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
			}

			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(347);
				match(COMMA);
				}
			}

			setState(350);
			match(SQR_BRKT_CL);
			setState(351);
			match(SEMICOLON);
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
	public static class DartListBoolDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(dart_parse.LIST, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public TerminalNode SQR_BRKT_OP() { return getToken(dart_parse.SQR_BRKT_OP, 0); }
		public TerminalNode SQR_BRKT_CL() { return getToken(dart_parse.SQR_BRKT_CL, 0); }
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public TerminalNode ANGLE_BRKT_OP() { return getToken(dart_parse.ANGLE_BRKT_OP, 0); }
		public TerminalNode BOOL() { return getToken(dart_parse.BOOL, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public List<BooleansContext> booleans() {
			return getRuleContexts(BooleansContext.class);
		}
		public BooleansContext booleans(int i) {
			return getRuleContext(BooleansContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public DartListBoolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dartListBoolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDartListBoolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDartListBoolDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDartListBoolDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DartListBoolDeclarationContext dartListBoolDeclaration() throws RecognitionException {
		DartListBoolDeclarationContext _localctx = new DartListBoolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_dartListBoolDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(LIST);
			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(354);
				match(ANGLE_BRKT_OP);
				setState(355);
				match(BOOL);
				setState(356);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(359);
			match(NAME);
			setState(360);
			match(ASSIGN);
			setState(361);
			match(SQR_BRKT_OP);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE) {
				{
				setState(362);
				booleans();
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(363);
						match(COMMA);
						setState(364);
						booleans();
						}
						} 
					}
					setState(369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
			}

			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(372);
				match(COMMA);
				}
			}

			setState(375);
			match(SQR_BRKT_CL);
			setState(376);
			match(SEMICOLON);
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
	public static class WidgetsDeclarationContext extends ParserRuleContext {
		public ConatinerDeclarationContext conatinerDeclaration() {
			return getRuleContext(ConatinerDeclarationContext.class,0);
		}
		public ExpandedDeclarationContext expandedDeclaration() {
			return getRuleContext(ExpandedDeclarationContext.class,0);
		}
		public MaterialButtonDeclarationContext materialButtonDeclaration() {
			return getRuleContext(MaterialButtonDeclarationContext.class,0);
		}
		public MaterialAppDeclarationContext materialAppDeclaration() {
			return getRuleContext(MaterialAppDeclarationContext.class,0);
		}
		public ScaffoldDeclarationContext scaffoldDeclaration() {
			return getRuleContext(ScaffoldDeclarationContext.class,0);
		}
		public PaddingDeclarationContext paddingDeclaration() {
			return getRuleContext(PaddingDeclarationContext.class,0);
		}
		public RowColumnDeclarationContext rowColumnDeclaration() {
			return getRuleContext(RowColumnDeclarationContext.class,0);
		}
		public TextDeclarationContext textDeclaration() {
			return getRuleContext(TextDeclarationContext.class,0);
		}
		public ImageDeclarationContext imageDeclaration() {
			return getRuleContext(ImageDeclarationContext.class,0);
		}
		public WidgetsDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widgetsDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterWidgetsDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitWidgetsDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitWidgetsDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidgetsDeclarationContext widgetsDeclaration() throws RecognitionException {
		WidgetsDeclarationContext _localctx = new WidgetsDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_widgetsDeclaration);
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(378);
				conatinerDeclaration();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				expandedDeclaration();
				}
				break;
			case MATERIALBUTTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				materialButtonDeclaration();
				}
				break;
			case MATERIALAPP:
				enterOuterAlt(_localctx, 4);
				{
				setState(381);
				materialAppDeclaration();
				}
				break;
			case SCAFFOLD:
				enterOuterAlt(_localctx, 5);
				{
				setState(382);
				scaffoldDeclaration();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				paddingDeclaration();
				}
				break;
			case ROW:
			case COLUMN:
				enterOuterAlt(_localctx, 7);
				{
				setState(384);
				rowColumnDeclaration();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(385);
				textDeclaration();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(386);
				imageDeclaration();
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
	public static class ExpandedDeclarationContext extends ParserRuleContext {
		public TerminalNode EXPANDED() { return getToken(dart_parse.EXPANDED, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public ChildPropertyDeclarationContext childPropertyDeclaration() {
			return getRuleContext(ChildPropertyDeclarationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode COMMA() { return getToken(dart_parse.COMMA, 0); }
		public ExpandedDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expandedDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterExpandedDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitExpandedDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitExpandedDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpandedDeclarationContext expandedDeclaration() throws RecognitionException {
		ExpandedDeclarationContext _localctx = new ExpandedDeclarationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expandedDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(EXPANDED);
			setState(390);
			match(BRKT_OP);
			setState(391);
			childPropertyDeclaration();
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(392);
				match(COMMA);
				}
			}

			setState(395);
			match(BRKT_CL);
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
	public static class PaddingDeclarationContext extends ParserRuleContext {
		public TerminalNode PADDING() { return getToken(dart_parse.PADDING, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public PaddingPropertyDeclarationContext paddingPropertyDeclaration() {
			return getRuleContext(PaddingPropertyDeclarationContext.class,0);
		}
		public ChildPropertyDeclarationContext childPropertyDeclaration() {
			return getRuleContext(ChildPropertyDeclarationContext.class,0);
		}
		public PaddingDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterPaddingDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitPaddingDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitPaddingDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingDeclarationContext paddingDeclaration() throws RecognitionException {
		PaddingDeclarationContext _localctx = new PaddingDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_paddingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(PADDING);
			setState(398);
			match(BRKT_OP);
			setState(407);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGSMALL:
				{
				{
				setState(399);
				paddingPropertyDeclaration();
				setState(400);
				match(COMMA);
				setState(401);
				childPropertyDeclaration();
				}
				}
				break;
			case CHILD:
				{
				{
				setState(403);
				childPropertyDeclaration();
				setState(404);
				match(COMMA);
				setState(405);
				paddingPropertyDeclaration();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(409);
				match(COMMA);
				}
			}

			setState(412);
			match(BRKT_CL);
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
	public static class ScaffoldDeclarationContext extends ParserRuleContext {
		public TerminalNode SCAFFOLD() { return getToken(dart_parse.SCAFFOLD, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public BodyPropertyDeclarationContext bodyPropertyDeclaration() {
			return getRuleContext(BodyPropertyDeclarationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode COMMA() { return getToken(dart_parse.COMMA, 0); }
		public ScaffoldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scaffoldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterScaffoldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitScaffoldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitScaffoldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScaffoldDeclarationContext scaffoldDeclaration() throws RecognitionException {
		ScaffoldDeclarationContext _localctx = new ScaffoldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_scaffoldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			match(SCAFFOLD);
			setState(415);
			match(BRKT_OP);
			setState(416);
			bodyPropertyDeclaration();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(417);
				match(COMMA);
				}
			}

			setState(420);
			match(BRKT_CL);
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
	public static class TextDeclarationContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(dart_parse.TEXT, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode STRING_LINE() { return getToken(dart_parse.STRING_LINE, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode COMMA() { return getToken(dart_parse.COMMA, 0); }
		public TextDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterTextDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitTextDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitTextDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextDeclarationContext textDeclaration() throws RecognitionException {
		TextDeclarationContext _localctx = new TextDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_textDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			match(TEXT);
			setState(423);
			match(BRKT_OP);
			setState(424);
			match(STRING_LINE);
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(425);
				match(COMMA);
				}
			}

			setState(428);
			match(BRKT_CL);
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
	public static class MaterialAppDeclarationContext extends ParserRuleContext {
		public TerminalNode MATERIALAPP() { return getToken(dart_parse.MATERIALAPP, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public HomePropertyDeclarationContext homePropertyDeclaration() {
			return getRuleContext(HomePropertyDeclarationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode COMMA() { return getToken(dart_parse.COMMA, 0); }
		public MaterialAppDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialAppDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterMaterialAppDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitMaterialAppDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitMaterialAppDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialAppDeclarationContext materialAppDeclaration() throws RecognitionException {
		MaterialAppDeclarationContext _localctx = new MaterialAppDeclarationContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_materialAppDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(MATERIALAPP);
			setState(431);
			match(BRKT_OP);
			setState(432);
			homePropertyDeclaration();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(433);
				match(COMMA);
				}
			}

			setState(436);
			match(BRKT_CL);
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
	public static class MaterialButtonDeclarationContext extends ParserRuleContext {
		public TerminalNode MATERIALBUTTON() { return getToken(dart_parse.MATERIALBUTTON, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public ChildPropertyDeclarationContext childPropertyDeclaration() {
			return getRuleContext(ChildPropertyDeclarationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode COMMA() { return getToken(dart_parse.COMMA, 0); }
		public MaterialButtonDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_materialButtonDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterMaterialButtonDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitMaterialButtonDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitMaterialButtonDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaterialButtonDeclarationContext materialButtonDeclaration() throws RecognitionException {
		MaterialButtonDeclarationContext _localctx = new MaterialButtonDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_materialButtonDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(438);
			match(MATERIALBUTTON);
			setState(439);
			match(BRKT_OP);
			setState(440);
			childPropertyDeclaration();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(441);
				match(COMMA);
				}
			}

			setState(444);
			match(BRKT_CL);
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
	public static class ConatinerDeclarationContext extends ParserRuleContext {
		public TerminalNode CONTAINER() { return getToken(dart_parse.CONTAINER, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public List<ConatinerPropertiesDeclarationContext> conatinerPropertiesDeclaration() {
			return getRuleContexts(ConatinerPropertiesDeclarationContext.class);
		}
		public ConatinerPropertiesDeclarationContext conatinerPropertiesDeclaration(int i) {
			return getRuleContext(ConatinerPropertiesDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public ConatinerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conatinerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterConatinerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitConatinerDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitConatinerDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConatinerDeclarationContext conatinerDeclaration() throws RecognitionException {
		ConatinerDeclarationContext _localctx = new ConatinerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_conatinerDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			match(CONTAINER);
			setState(447);
			match(BRKT_OP);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 30786325577728L) != 0) {
				{
				setState(448);
				conatinerPropertiesDeclaration();
				}
			}

			setState(455);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(451);
					match(COMMA);
					setState(452);
					conatinerPropertiesDeclaration();
					}
					} 
				}
				setState(457);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(458);
				match(COMMA);
				}
			}

			setState(461);
			match(BRKT_CL);
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
	public static class RowColumnDeclarationContext extends ParserRuleContext {
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public ChildrenPropertyDeclarationContext childrenPropertyDeclaration() {
			return getRuleContext(ChildrenPropertyDeclarationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode ROW() { return getToken(dart_parse.ROW, 0); }
		public TerminalNode COLUMN() { return getToken(dart_parse.COLUMN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public RowColumnDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowColumnDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterRowColumnDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitRowColumnDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitRowColumnDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowColumnDeclarationContext rowColumnDeclaration() throws RecognitionException {
		RowColumnDeclarationContext _localctx = new RowColumnDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_rowColumnDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==COLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(464);
			match(BRKT_OP);
			setState(465);
			childrenPropertyDeclaration();
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(466);
				match(COMMA);
				}
			}

			setState(469);
			match(BRKT_CL);
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(470);
				match(COMMA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ImageDeclarationContext extends ParserRuleContext {
		public TerminalNode IMAGE() { return getToken(dart_parse.IMAGE, 0); }
		public TerminalNode DOT() { return getToken(dart_parse.DOT, 0); }
		public TerminalNode NETWORK() { return getToken(dart_parse.NETWORK, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode STRING_LINE() { return getToken(dart_parse.STRING_LINE, 0); }
		public ImageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterImageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitImageDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitImageDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageDeclarationContext imageDeclaration() throws RecognitionException {
		ImageDeclarationContext _localctx = new ImageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_imageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(IMAGE);
			setState(474);
			match(DOT);
			setState(475);
			match(NETWORK);
			setState(476);
			match(BRKT_OP);
			setState(477);
			_la = _input.LA(1);
			if ( !(_la==STRING_LINE || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(478);
			match(BRKT_CL);
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
	public static class ConatinerPropertiesDeclarationContext extends ParserRuleContext {
		public HeightPropertyDeclarationContext heightPropertyDeclaration() {
			return getRuleContext(HeightPropertyDeclarationContext.class,0);
		}
		public WidthPropertyDeclarationContext widthPropertyDeclaration() {
			return getRuleContext(WidthPropertyDeclarationContext.class,0);
		}
		public ChildPropertyDeclarationContext childPropertyDeclaration() {
			return getRuleContext(ChildPropertyDeclarationContext.class,0);
		}
		public ConatinerPropertiesDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conatinerPropertiesDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterConatinerPropertiesDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitConatinerPropertiesDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitConatinerPropertiesDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConatinerPropertiesDeclarationContext conatinerPropertiesDeclaration() throws RecognitionException {
		ConatinerPropertiesDeclarationContext _localctx = new ConatinerPropertiesDeclarationContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_conatinerPropertiesDeclaration);
		try {
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(480);
				heightPropertyDeclaration();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(481);
				widthPropertyDeclaration();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				childPropertyDeclaration();
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
	public static class PaddingPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode PADDINGSMALL() { return getToken(dart_parse.PADDINGSMALL, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public EdgeInsistAllContext edgeInsistAll() {
			return getRuleContext(EdgeInsistAllContext.class,0);
		}
		public PaddingPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paddingPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterPaddingPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitPaddingPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitPaddingPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PaddingPropertyDeclarationContext paddingPropertyDeclaration() throws RecognitionException {
		PaddingPropertyDeclarationContext _localctx = new PaddingPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_paddingPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(PADDINGSMALL);
			setState(486);
			match(COLON);
			setState(487);
			edgeInsistAll();
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
	public static class EdgeInsistAllContext extends ParserRuleContext {
		public TerminalNode EDGEINSETS() { return getToken(dart_parse.EDGEINSETS, 0); }
		public TerminalNode DOT() { return getToken(dart_parse.DOT, 0); }
		public TerminalNode ALL() { return getToken(dart_parse.ALL, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public EdgeInsistAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edgeInsistAll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterEdgeInsistAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitEdgeInsistAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitEdgeInsistAll(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeInsistAllContext edgeInsistAll() throws RecognitionException {
		EdgeInsistAllContext _localctx = new EdgeInsistAllContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_edgeInsistAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(EDGEINSETS);
			setState(490);
			match(DOT);
			setState(491);
			match(ALL);
			setState(492);
			match(BRKT_OP);
			setState(493);
			number();
			setState(494);
			match(BRKT_CL);
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
	public static class HeightPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(dart_parse.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public HeightPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heightPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterHeightPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitHeightPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitHeightPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightPropertyDeclarationContext heightPropertyDeclaration() throws RecognitionException {
		HeightPropertyDeclarationContext _localctx = new HeightPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_heightPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			match(HEIGHT);
			setState(497);
			match(COLON);
			setState(498);
			number();
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
	public static class WidthPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(dart_parse.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public WidthPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widthPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterWidthPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitWidthPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitWidthPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthPropertyDeclarationContext widthPropertyDeclaration() throws RecognitionException {
		WidthPropertyDeclarationContext _localctx = new WidthPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_widthPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(WIDTH);
			setState(501);
			match(COLON);
			setState(502);
			number();
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
	public static class HomePropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode HOME() { return getToken(dart_parse.HOME, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public HomePropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_homePropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterHomePropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitHomePropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitHomePropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HomePropertyDeclarationContext homePropertyDeclaration() throws RecognitionException {
		HomePropertyDeclarationContext _localctx = new HomePropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_homePropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			match(HOME);
			setState(505);
			match(COLON);
			setState(506);
			match(NAME);
			setState(507);
			match(BRKT_OP);
			setState(508);
			match(BRKT_CL);
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
	public static class ChildPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode CHILD() { return getToken(dart_parse.CHILD, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public WidgetsDeclarationContext widgetsDeclaration() {
			return getRuleContext(WidgetsDeclarationContext.class,0);
		}
		public ChildPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterChildPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitChildPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitChildPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildPropertyDeclarationContext childPropertyDeclaration() throws RecognitionException {
		ChildPropertyDeclarationContext _localctx = new ChildPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_childPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(CHILD);
			setState(511);
			match(COLON);
			setState(512);
			widgetsDeclaration();
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
	public static class ChildrenPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode CHILDREN() { return getToken(dart_parse.CHILDREN, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public TerminalNode SQR_BRKT_OP() { return getToken(dart_parse.SQR_BRKT_OP, 0); }
		public TerminalNode SQR_BRKT_CL() { return getToken(dart_parse.SQR_BRKT_CL, 0); }
		public List<WidgetsDeclarationContext> widgetsDeclaration() {
			return getRuleContexts(WidgetsDeclarationContext.class);
		}
		public WidgetsDeclarationContext widgetsDeclaration(int i) {
			return getRuleContext(WidgetsDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public ChildrenPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_childrenPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterChildrenPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitChildrenPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitChildrenPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChildrenPropertyDeclarationContext childrenPropertyDeclaration() throws RecognitionException {
		ChildrenPropertyDeclarationContext _localctx = new ChildrenPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_childrenPropertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(CHILDREN);
			setState(515);
			match(COLON);
			setState(516);
			match(SQR_BRKT_OP);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 104501433394528256L) != 0) {
				{
				setState(517);
				widgetsDeclaration();
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(518);
						match(COMMA);
						setState(519);
						widgetsDeclaration();
						}
						} 
					}
					setState(524);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				}
			}

			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(527);
				match(COMMA);
				}
			}

			setState(530);
			match(SQR_BRKT_CL);
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
	public static class BodyPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode BODY() { return getToken(dart_parse.BODY, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public WidgetsDeclarationContext widgetsDeclaration() {
			return getRuleContext(WidgetsDeclarationContext.class,0);
		}
		public BodyPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBodyPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBodyPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBodyPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyPropertyDeclarationContext bodyPropertyDeclaration() throws RecognitionException {
		BodyPropertyDeclarationContext _localctx = new BodyPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_bodyPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(BODY);
			setState(533);
			match(COLON);
			setState(534);
			widgetsDeclaration();
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
	public static class BuildContextDeclarationContext extends ParserRuleContext {
		public TerminalNode BUILDCONTEXT() { return getToken(dart_parse.BUILDCONTEXT, 0); }
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public BuildContextDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildContextDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBuildContextDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBuildContextDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBuildContextDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContextDeclarationContext buildContextDeclaration() throws RecognitionException {
		BuildContextDeclarationContext _localctx = new BuildContextDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_buildContextDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(BUILDCONTEXT);
			setState(537);
			match(NAME);
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
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(dart_parse.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			match(NUMBER);
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
	public static class NumberDoubleContext extends ParserRuleContext {
		public TerminalNode NUMBERDOUBLE() { return getToken(dart_parse.NUMBERDOUBLE, 0); }
		public NumberDoubleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberDouble; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterNumberDouble(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitNumberDouble(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitNumberDouble(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberDoubleContext numberDouble() throws RecognitionException {
		NumberDoubleContext _localctx = new NumberDoubleContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_numberDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			match(NUMBERDOUBLE);
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
		"\u0004\u0001F\u0220\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0005\u0000"+
		"d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001l\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002r\b\u0002\n\u0002\f\u0002u\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"~\b\u0003\n\u0003\f\u0003\u0081\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008e\b\u0005\n\u0005\f\u0005"+
		"\u0091\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u009f\b\u0006\n\u0006\f\u0006\u00a2\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00b2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00ca\b\u000b\n\u000b\f\u000b\u00cd\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0003\f\u00d6\b\f\u0001\r\u0003\r\u00d9\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00df\b\r\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00e4\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00e9\b\u000e\u0001\u000f"+
		"\u0003\u000f\u00ec\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00f1\b\u000f\u0001\u0010\u0003\u0010\u00f4\b\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00f9\b\u0010\u0001\u0011\u0003\u0011\u00fc"+
		"\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0101\b\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0106\b\u0012\n\u0012"+
		"\f\u0012\u0109\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u010e\b\u0013\n\u0013\f\u0013\u0111\t\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u0116\b\u0014\n\u0014\f\u0014\u0119\t\u0014\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u011d\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u0122\b\u0015\u0005\u0015\u0124\b\u0015\n\u0015\f\u0015\u0127"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003"+
		"\u0017\u012e\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0134\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u013c\b\u0018\n\u0018\f\u0018\u013f\t\u0018"+
		"\u0003\u0018\u0141\b\u0018\u0001\u0018\u0003\u0018\u0144\b\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0003\u0019\u014d\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u0155\b\u0019\n\u0019\f\u0019"+
		"\u0158\t\u0019\u0003\u0019\u015a\b\u0019\u0001\u0019\u0003\u0019\u015d"+
		"\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u0166\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u016e\b\u001a\n"+
		"\u001a\f\u001a\u0171\t\u001a\u0003\u001a\u0173\b\u001a\u0001\u001a\u0003"+
		"\u001a\u0176\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u0184\b\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u018a\b\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0198\b\u001d\u0001"+
		"\u001d\u0003\u001d\u019b\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01a3\b\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ab"+
		"\b\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01b3"+
		"\b \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0003!\u01bb\b!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0003\"\u01c2\b\"\u0001\"\u0001\"\u0005\"\u01c6"+
		"\b\"\n\"\f\"\u01c9\t\"\u0001\"\u0003\"\u01cc\b\"\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0001#\u0003#\u01d4\b#\u0001#\u0001#\u0003#\u01d8\b#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003"+
		"%\u01e4\b%\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001"+
		"+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001,\u0005,\u0209\b,\n,"+
		"\f,\u020c\t,\u0003,\u020e\b,\u0001,\u0003,\u0211\b,\u0001,\u0001,\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u0000\u00001\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`\u0000\u0006\u0001\u0000\u001d\u001e\u0001\u0000\r\u000e\u0001\u0000"+
		"\u000f\u0010\u0001\u0000>?\u0001\u000045\u0002\u0000  @@\u0231\u0000e"+
		"\u0001\u0000\u0000\u0000\u0002k\u0001\u0000\u0000\u0000\u0004m\u0001\u0000"+
		"\u0000\u0000\u0006x\u0001\u0000\u0000\u0000\b\u0085\u0001\u0000\u0000"+
		"\u0000\n\u0088\u0001\u0000\u0000\u0000\f\u0095\u0001\u0000\u0000\u0000"+
		"\u000e\u00a6\u0001\u0000\u0000\u0000\u0010\u00b1\u0001\u0000\u0000\u0000"+
		"\u0012\u00b3\u0001\u0000\u0000\u0000\u0014\u00bb\u0001\u0000\u0000\u0000"+
		"\u0016\u00c2\u0001\u0000\u0000\u0000\u0018\u00d5\u0001\u0000\u0000\u0000"+
		"\u001a\u00d8\u0001\u0000\u0000\u0000\u001c\u00e3\u0001\u0000\u0000\u0000"+
		"\u001e\u00eb\u0001\u0000\u0000\u0000 \u00f3\u0001\u0000\u0000\u0000\""+
		"\u00fb\u0001\u0000\u0000\u0000$\u0102\u0001\u0000\u0000\u0000&\u010a\u0001"+
		"\u0000\u0000\u0000(\u0112\u0001\u0000\u0000\u0000*\u011c\u0001\u0000\u0000"+
		"\u0000,\u0128\u0001\u0000\u0000\u0000.\u012d\u0001\u0000\u0000\u00000"+
		"\u012f\u0001\u0000\u0000\u00002\u0148\u0001\u0000\u0000\u00004\u0161\u0001"+
		"\u0000\u0000\u00006\u0183\u0001\u0000\u0000\u00008\u0185\u0001\u0000\u0000"+
		"\u0000:\u018d\u0001\u0000\u0000\u0000<\u019e\u0001\u0000\u0000\u0000>"+
		"\u01a6\u0001\u0000\u0000\u0000@\u01ae\u0001\u0000\u0000\u0000B\u01b6\u0001"+
		"\u0000\u0000\u0000D\u01be\u0001\u0000\u0000\u0000F\u01cf\u0001\u0000\u0000"+
		"\u0000H\u01d9\u0001\u0000\u0000\u0000J\u01e3\u0001\u0000\u0000\u0000L"+
		"\u01e5\u0001\u0000\u0000\u0000N\u01e9\u0001\u0000\u0000\u0000P\u01f0\u0001"+
		"\u0000\u0000\u0000R\u01f4\u0001\u0000\u0000\u0000T\u01f8\u0001\u0000\u0000"+
		"\u0000V\u01fe\u0001\u0000\u0000\u0000X\u0202\u0001\u0000\u0000\u0000Z"+
		"\u0214\u0001\u0000\u0000\u0000\\\u0218\u0001\u0000\u0000\u0000^\u021b"+
		"\u0001\u0000\u0000\u0000`\u021d\u0001\u0000\u0000\u0000bd\u0003\u0002"+
		"\u0001\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000ec\u0001"+
		"\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000f\u0001\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hl\u0003\u0004\u0002\u0000il\u0003\b\u0004"+
		"\u0000jl\u0003\u0006\u0003\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000"+
		"\u0000\u0000kj\u0001\u0000\u0000\u0000l\u0003\u0001\u0000\u0000\u0000"+
		"mn\u0005\u0001\u0000\u0000no\u0005@\u0000\u0000os\u0005\u0002\u0000\u0000"+
		"pr\u0003\u0018\f\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000"+
		"sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000vw\u0005\u0003\u0000\u0000w\u0005\u0001"+
		"\u0000\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0005@\u0000\u0000z{\u0005"+
		"=\u0000\u0000{\u007f\u0005\u0002\u0000\u0000|~\u0003\u0018\f\u0000}|\u0001"+
		"\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000"+
		"\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000"+
		"\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0003\u0016\u000b"+
		"\u0000\u0083\u0084\u0005\u0003\u0000\u0000\u0084\u0007\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0003\n\u0005\u0000\u0086\u0087\u0003\f\u0006\u0000"+
		"\u0087\t\u0001\u0000\u0000\u0000\u0088\u0089\u0005\u0001\u0000\u0000\u0089"+
		"\u008a\u0005@\u0000\u0000\u008a\u008b\u0005<\u0000\u0000\u008b\u008f\u0005"+
		"\u0002\u0000\u0000\u008c\u008e\u0003\u0018\f\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0093\u0003\u000e"+
		"\u0007\u0000\u0093\u0094\u0005\u0003\u0000\u0000\u0094\u000b\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0005\u0001\u0000\u0000\u0096\u0097\u0005@\u0000"+
		"\u0000\u0097\u0098\u0005\u001a\u0000\u0000\u0098\u0099\u0005\"\u0000\u0000"+
		"\u0099\u009a\u0005\u0004\u0000\u0000\u009a\u009b\u0005@\u0000\u0000\u009b"+
		"\u009c\u0005\u0005\u0000\u0000\u009c\u00a0\u0005\u0002\u0000\u0000\u009d"+
		"\u009f\u0003\u0018\f\u0000\u009e\u009d\u0001\u0000\u0000\u0000\u009f\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a3\u00a4\u0003\u0016\u000b\u0000\u00a4\u00a5"+
		"\u0005\u0003\u0000\u0000\u00a5\r\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005"+
		"\"\u0000\u0000\u00a7\u00a8\u0005\u0004\u0000\u0000\u00a8\u00a9\u0005@"+
		"\u0000\u0000\u00a9\u00aa\u0005\u0005\u0000\u0000\u00aa\u00ab\u0005$\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0006\u0000\u0000\u00ac\u00ad\u0005\u0007\u0000"+
		"\u0000\u00ad\u00ae\u0003\u0010\b\u0000\u00ae\u000f\u0001\u0000\u0000\u0000"+
		"\u00af\u00b2\u0003\u0014\n\u0000\u00b0\u00b2\u0003\u0012\t\u0000\u00b1"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u0011\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0002\u0000\u0000\u00b4"+
		"\u00b5\u0005\u001b\u0000\u0000\u00b5\u00b6\u0005@\u0000\u0000\u00b6\u00b7"+
		"\u0005\u0006\u0000\u0000\u00b7\u00b8\u0005\u0007\u0000\u0000\u00b8\u00b9"+
		"\u0005\n\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000\u00ba\u0013\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0005\u0012\u0000\u0000\u00bc\u00bd\u0005"+
		"\u0005\u0000\u0000\u00bd\u00be\u0005@\u0000\u0000\u00be\u00bf\u0005\u0006"+
		"\u0000\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0\u00c1\u0005\n\u0000"+
		"\u0000\u00c1\u0015\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005%\u0000\u0000"+
		"\u00c3\u00c4\u0005&\u0000\u0000\u00c4\u00c5\u0005\u0006\u0000\u0000\u00c5"+
		"\u00c6\u0003\\.\u0000\u00c6\u00c7\u0005\u0007\u0000\u0000\u00c7\u00cb"+
		"\u0005\u0002\u0000\u0000\u00c8\u00ca\u0003\u0018\f\u0000\u00c9\u00c8\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005"+
		"\u001b\u0000\u0000\u00cf\u00d0\u00036\u001b\u0000\u00d0\u00d1\u0005\n"+
		"\u0000\u0000\u00d1\u00d2\u0005\u0003\u0000\u0000\u00d2\u0017\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d6\u0003\u001a\r\u0000\u00d4\u00d6\u0003.\u0017"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d6\u0019\u0001\u0000\u0000\u0000\u00d7\u00d9\u0007\u0000\u0000"+
		"\u0000\u00d8\u00d7\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000\u0000"+
		"\u0000\u00d9\u00de\u0001\u0000\u0000\u0000\u00da\u00df\u0003\u001c\u000e"+
		"\u0000\u00db\u00df\u0003 \u0010\u0000\u00dc\u00df\u0003\"\u0011\u0000"+
		"\u00dd\u00df\u0003\u001e\u000f\u0000\u00de\u00da\u0001\u0000\u0000\u0000"+
		"\u00de\u00db\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000"+
		"\u00de\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e1\u0005\n\u0000\u0000\u00e1\u001b\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e4\u0005\u0015\u0000\u0000\u00e3\u00e2\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e8\u0005@\u0000\u0000\u00e6\u00e7\u0005\u0012\u0000\u0000\u00e7\u00e9"+
		"\u0003$\u0012\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e9\u001d\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005"+
		"\u0018\u0000\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0001\u0000\u0000\u0000\u00ed\u00f0\u0005"+
		"@\u0000\u0000\u00ee\u00ef\u0005\u0012\u0000\u0000\u00ef\u00f1\u0003(\u0014"+
		"\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f1\u001f\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u0016\u0000"+
		"\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f8\u0005@\u0000\u0000"+
		"\u00f6\u00f7\u0005\u0012\u0000\u0000\u00f7\u00f9\u0005 \u0000\u0000\u00f8"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"!\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u0017\u0000\u0000\u00fb\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd"+
		"\u0001\u0000\u0000\u0000\u00fd\u0100\u0005@\u0000\u0000\u00fe\u00ff\u0005"+
		"\u0012\u0000\u0000\u00ff\u0101\u0003,\u0016\u0000\u0100\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101#\u0001\u0000\u0000"+
		"\u0000\u0102\u0107\u0003&\u0013\u0000\u0103\u0104\u0007\u0001\u0000\u0000"+
		"\u0104\u0106\u0003&\u0013\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108%\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u010a\u010f\u0003^/\u0000\u010b\u010c\u0007\u0002"+
		"\u0000\u0000\u010c\u010e\u0003^/\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\'\u0001\u0000\u0000\u0000\u0111"+
		"\u010f\u0001\u0000\u0000\u0000\u0112\u0117\u0003*\u0015\u0000\u0113\u0114"+
		"\u0007\u0001\u0000\u0000\u0114\u0116\u0003*\u0015\u0000\u0115\u0113\u0001"+
		"\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118)\u0001\u0000"+
		"\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u011a\u011d\u0003^/\u0000"+
		"\u011b\u011d\u0003`0\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011b"+
		"\u0001\u0000\u0000\u0000\u011d\u0125\u0001\u0000\u0000\u0000\u011e\u0121"+
		"\u0007\u0002\u0000\u0000\u011f\u0122\u0003^/\u0000\u0120\u0122\u0003`"+
		"0\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000"+
		"\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u011e\u0001\u0000\u0000"+
		"\u0000\u0124\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000"+
		"\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126+\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0007\u0003\u0000\u0000"+
		"\u0129-\u0001\u0000\u0000\u0000\u012a\u012e\u00030\u0018\u0000\u012b\u012e"+
		"\u00032\u0019\u0000\u012c\u012e\u00034\u001a\u0000\u012d\u012a\u0001\u0000"+
		"\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000\u012d\u012c\u0001\u0000"+
		"\u0000\u0000\u012e/\u0001\u0000\u0000\u0000\u012f\u0133\u0005\u0019\u0000"+
		"\u0000\u0130\u0131\u0005\u0004\u0000\u0000\u0131\u0132\u0005\u0016\u0000"+
		"\u0000\u0132\u0134\u0005\u0005\u0000\u0000\u0133\u0130\u0001\u0000\u0000"+
		"\u0000\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0005@\u0000\u0000\u0136\u0137\u0005\u0012\u0000\u0000"+
		"\u0137\u0140\u0005\b\u0000\u0000\u0138\u013d\u0005 \u0000\u0000\u0139"+
		"\u013a\u0005\u000b\u0000\u0000\u013a\u013c\u0005 \u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0141"+
		"\u0001\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0138"+
		"\u0001\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0143"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0005\u000b\u0000\u0000\u0143\u0142"+
		"\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145"+
		"\u0001\u0000\u0000\u0000\u0145\u0146\u0005\t\u0000\u0000\u0146\u0147\u0005"+
		"\n\u0000\u0000\u01471\u0001\u0000\u0000\u0000\u0148\u014c\u0005\u0019"+
		"\u0000\u0000\u0149\u014a\u0005\u0004\u0000\u0000\u014a\u014b\u0005\u0015"+
		"\u0000\u0000\u014b\u014d\u0005\u0005\u0000\u0000\u014c\u0149\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014e\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005@\u0000\u0000\u014f\u0150\u0005\u0012\u0000"+
		"\u0000\u0150\u0159\u0005\b\u0000\u0000\u0151\u0156\u0003^/\u0000\u0152"+
		"\u0153\u0005\u000b\u0000\u0000\u0153\u0155\u0003^/\u0000\u0154\u0152\u0001"+
		"\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000\u0000\u0156\u0154\u0001"+
		"\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u015a\u0001"+
		"\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0159\u0151\u0001"+
		"\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015c\u0001"+
		"\u0000\u0000\u0000\u015b\u015d\u0005\u000b\u0000\u0000\u015c\u015b\u0001"+
		"\u0000\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u015f\u0005\t\u0000\u0000\u015f\u0160\u0005\n"+
		"\u0000\u0000\u01603\u0001\u0000\u0000\u0000\u0161\u0165\u0005\u0019\u0000"+
		"\u0000\u0162\u0163\u0005\u0004\u0000\u0000\u0163\u0164\u0005\u0017\u0000"+
		"\u0000\u0164\u0166\u0005\u0005\u0000\u0000\u0165\u0162\u0001\u0000\u0000"+
		"\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000"+
		"\u0000\u0167\u0168\u0005@\u0000\u0000\u0168\u0169\u0005\u0012\u0000\u0000"+
		"\u0169\u0172\u0005\b\u0000\u0000\u016a\u016f\u0003,\u0016\u0000\u016b"+
		"\u016c\u0005\u000b\u0000\u0000\u016c\u016e\u0003,\u0016\u0000\u016d\u016b"+
		"\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000\u0000\u016f\u016d"+
		"\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000\u0000\u0170\u0173"+
		"\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000\u0172\u016a"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175"+
		"\u0001\u0000\u0000\u0000\u0174\u0176\u0005\u000b\u0000\u0000\u0175\u0174"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005\t\u0000\u0000\u0178\u0179\u0005"+
		"\n\u0000\u0000\u01795\u0001\u0000\u0000\u0000\u017a\u0184\u0003D\"\u0000"+
		"\u017b\u0184\u00038\u001c\u0000\u017c\u0184\u0003B!\u0000\u017d\u0184"+
		"\u0003@ \u0000\u017e\u0184\u0003<\u001e\u0000\u017f\u0184\u0003:\u001d"+
		"\u0000\u0180\u0184\u0003F#\u0000\u0181\u0184\u0003>\u001f\u0000\u0182"+
		"\u0184\u0003H$\u0000\u0183\u017a\u0001\u0000\u0000\u0000\u0183\u017b\u0001"+
		"\u0000\u0000\u0000\u0183\u017c\u0001\u0000\u0000\u0000\u0183\u017d\u0001"+
		"\u0000\u0000\u0000\u0183\u017e\u0001\u0000\u0000\u0000\u0183\u017f\u0001"+
		"\u0000\u0000\u0000\u0183\u0180\u0001\u0000\u0000\u0000\u0183\u0181\u0001"+
		"\u0000\u0000\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u01847\u0001\u0000"+
		"\u0000\u0000\u0185\u0186\u0005(\u0000\u0000\u0186\u0187\u0005\u0006\u0000"+
		"\u0000\u0187\u0189\u0003V+\u0000\u0188\u018a\u0005\u000b\u0000\u0000\u0189"+
		"\u0188\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a"+
		"\u018b\u0001\u0000\u0000\u0000\u018b\u018c\u0005\u0007\u0000\u0000\u018c"+
		"9\u0001\u0000\u0000\u0000\u018d\u018e\u00051\u0000\u0000\u018e\u0197\u0005"+
		"\u0006\u0000\u0000\u018f\u0190\u0003L&\u0000\u0190\u0191\u0005\u000b\u0000"+
		"\u0000\u0191\u0192\u0003V+\u0000\u0192\u0198\u0001\u0000\u0000\u0000\u0193"+
		"\u0194\u0003V+\u0000\u0194\u0195\u0005\u000b\u0000\u0000\u0195\u0196\u0003"+
		"L&\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u018f\u0001\u0000\u0000"+
		"\u0000\u0197\u0193\u0001\u0000\u0000\u0000\u0198\u019a\u0001\u0000\u0000"+
		"\u0000\u0199\u019b\u0005\u000b\u0000\u0000\u019a\u0199\u0001\u0000\u0000"+
		"\u0000\u019a\u019b\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000"+
		"\u0000\u019c\u019d\u0005\u0007\u0000\u0000\u019d;\u0001\u0000\u0000\u0000"+
		"\u019e\u019f\u00050\u0000\u0000\u019f\u01a0\u0005\u0006\u0000\u0000\u01a0"+
		"\u01a2\u0003Z-\u0000\u01a1\u01a3\u0005\u000b\u0000\u0000\u01a2\u01a1\u0001"+
		"\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001"+
		"\u0000\u0000\u0000\u01a4\u01a5\u0005\u0007\u0000\u0000\u01a5=\u0001\u0000"+
		"\u0000\u0000\u01a6\u01a7\u00058\u0000\u0000\u01a7\u01a8\u0005\u0006\u0000"+
		"\u0000\u01a8\u01aa\u0005 \u0000\u0000\u01a9\u01ab\u0005\u000b\u0000\u0000"+
		"\u01aa\u01a9\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000"+
		"\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ad\u0005\u0007\u0000\u0000"+
		"\u01ad?\u0001\u0000\u0000\u0000\u01ae\u01af\u0005.\u0000\u0000\u01af\u01b0"+
		"\u0005\u0006\u0000\u0000\u01b0\u01b2\u0003T*\u0000\u01b1\u01b3\u0005\u000b"+
		"\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u0005\u0007"+
		"\u0000\u0000\u01b5A\u0001\u0000\u0000\u0000\u01b6\u01b7\u0005)\u0000\u0000"+
		"\u01b7\u01b8\u0005\u0006\u0000\u0000\u01b8\u01ba\u0003V+\u0000\u01b9\u01bb"+
		"\u0005\u000b\u0000\u0000\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01bd"+
		"\u0005\u0007\u0000\u0000\u01bdC\u0001\u0000\u0000\u0000\u01be\u01bf\u0005"+
		"\'\u0000\u0000\u01bf\u01c1\u0005\u0006\u0000\u0000\u01c0\u01c2\u0003J"+
		"%\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000\u0000"+
		"\u0000\u01c2\u01c7\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005\u000b\u0000"+
		"\u0000\u01c4\u01c6\u0003J%\u0000\u01c5\u01c3\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c9\u0001\u0000\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0001\u0000\u0000\u0000\u01c8\u01cb\u0001\u0000\u0000\u0000\u01c9"+
		"\u01c7\u0001\u0000\u0000\u0000\u01ca\u01cc\u0005\u000b\u0000\u0000\u01cb"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000\u0000\u0000\u01cc"+
		"\u01cd\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005\u0007\u0000\u0000\u01ce"+
		"E\u0001\u0000\u0000\u0000\u01cf\u01d0\u0007\u0004\u0000\u0000\u01d0\u01d1"+
		"\u0005\u0006\u0000\u0000\u01d1\u01d3\u0003X,\u0000\u01d2\u01d4\u0005\u000b"+
		"\u0000\u0000\u01d3\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d7\u0005\u0007"+
		"\u0000\u0000\u01d6\u01d8\u0005\u000b\u0000\u0000\u01d7\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8G\u0001\u0000\u0000"+
		"\u0000\u01d9\u01da\u00056\u0000\u0000\u01da\u01db\u0005\u0014\u0000\u0000"+
		"\u01db\u01dc\u00059\u0000\u0000\u01dc\u01dd\u0005\u0006\u0000\u0000\u01dd"+
		"\u01de\u0007\u0005\u0000\u0000\u01de\u01df\u0005\u0007\u0000\u0000\u01df"+
		"I\u0001\u0000\u0000\u0000\u01e0\u01e4\u0003P(\u0000\u01e1\u01e4\u0003"+
		"R)\u0000\u01e2\u01e4\u0003V+\u0000\u01e3\u01e0\u0001\u0000\u0000\u0000"+
		"\u01e3\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000"+
		"\u01e4K\u0001\u0000\u0000\u0000\u01e5\u01e6\u00052\u0000\u0000\u01e6\u01e7"+
		"\u0005\f\u0000\u0000\u01e7\u01e8\u0003N\'\u0000\u01e8M\u0001\u0000\u0000"+
		"\u0000\u01e9\u01ea\u00053\u0000\u0000\u01ea\u01eb\u0005\u0014\u0000\u0000"+
		"\u01eb\u01ec\u0005\u001c\u0000\u0000\u01ec\u01ed\u0005\u0006\u0000\u0000"+
		"\u01ed\u01ee\u0003^/\u0000\u01ee\u01ef\u0005\u0007\u0000\u0000\u01efO"+
		"\u0001\u0000\u0000\u0000\u01f0\u01f1\u0005,\u0000\u0000\u01f1\u01f2\u0005"+
		"\f\u0000\u0000\u01f2\u01f3\u0003^/\u0000\u01f3Q\u0001\u0000\u0000\u0000"+
		"\u01f4\u01f5\u0005+\u0000\u0000\u01f5\u01f6\u0005\f\u0000\u0000\u01f6"+
		"\u01f7\u0003^/\u0000\u01f7S\u0001\u0000\u0000\u0000\u01f8\u01f9\u0005"+
		"/\u0000\u0000\u01f9\u01fa\u0005\f\u0000\u0000\u01fa\u01fb\u0005@\u0000"+
		"\u0000\u01fb\u01fc\u0005\u0006\u0000\u0000\u01fc\u01fd\u0005\u0007\u0000"+
		"\u0000\u01fdU\u0001\u0000\u0000\u0000\u01fe\u01ff\u0005*\u0000\u0000\u01ff"+
		"\u0200\u0005\f\u0000\u0000\u0200\u0201\u00036\u001b\u0000\u0201W\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0005:\u0000\u0000\u0203\u0204\u0005\f"+
		"\u0000\u0000\u0204\u020d\u0005\b\u0000\u0000\u0205\u020a\u00036\u001b"+
		"\u0000\u0206\u0207\u0005\u000b\u0000\u0000\u0207\u0209\u00036\u001b\u0000"+
		"\u0208\u0206\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000"+
		"\u020a\u0208\u0001\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000"+
		"\u020b\u020e\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000"+
		"\u020d\u0205\u0001\u0000\u0000\u0000\u020d\u020e\u0001\u0000\u0000\u0000"+
		"\u020e\u0210\u0001\u0000\u0000\u0000\u020f\u0211\u0005\u000b\u0000\u0000"+
		"\u0210\u020f\u0001\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000"+
		"\u0211\u0212\u0001\u0000\u0000\u0000\u0212\u0213\u0005\t\u0000\u0000\u0213"+
		"Y\u0001\u0000\u0000\u0000\u0214\u0215\u00057\u0000\u0000\u0215\u0216\u0005"+
		"\f\u0000\u0000\u0216\u0217\u00036\u001b\u0000\u0217[\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0005!\u0000\u0000\u0219\u021a\u0005@\u0000\u0000\u021a"+
		"]\u0001\u0000\u0000\u0000\u021b\u021c\u0005B\u0000\u0000\u021c_\u0001"+
		"\u0000\u0000\u0000\u021d\u021e\u0005A\u0000\u0000\u021ea\u0001\u0000\u0000"+
		"\u00007eks\u007f\u008f\u00a0\u00b1\u00cb\u00d5\u00d8\u00de\u00e3\u00e8"+
		"\u00eb\u00f0\u00f3\u00f8\u00fb\u0100\u0107\u010f\u0117\u011c\u0121\u0125"+
		"\u012d\u0133\u013d\u0140\u0143\u014c\u0156\u0159\u015c\u0165\u016f\u0172"+
		"\u0175\u0183\u0189\u0197\u019a\u01a2\u01aa\u01b2\u01ba\u01c1\u01c7\u01cb"+
		"\u01d3\u01d7\u01e3\u020a\u020d\u0210";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}