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
		NOTEQUAL=19, GRATEREQUAL=20, LESSEQUAL=21, DOT=22, INT=23, STRING=24, 
		BOOL=25, DOUBLE=26, LIST=27, EXTENDS=28, RETURN=29, ALL=30, FINAL=31, 
		CONST=32, VAR=33, VOID=34, FUNCTION=35, IF=36, WHILE=37, FOR=38, SETSTATE=39, 
		STRING_LINE=40, BUILDCONTEXT=41, STATE=42, CREATE=43, CREATESTATE=44, 
		WIDGET=45, BUILD=46, CONTAINER=47, EXPANDED=48, MATERIALBUTTON=49, CHILD=50, 
		WIDTH=51, HEIGHT=52, COLOR=53, ELSEIF=54, ELSE=55, MATERIALAPP=56, HOME=57, 
		SCAFFOLD=58, PADDING=59, PADDINGSMALL=60, EDGEINSETS=61, ROW=62, COLUMN=63, 
		ONPRESSED=64, IMAGE=65, BODY=66, TEXT=67, NETWORK=68, CHILDREN=69, DYNAMIC=70, 
		STATEFULL=71, STATELESS=72, TRUE=73, FALSE=74, NAME=75, NUMBERDOUBLE=76, 
		NUMBER=77, COMMENT=78, OVERRIDE=79, PRIVATE=80, WS=81;
	public static final int
		RULE_topTreeDeclaration = 0, RULE_allClassesDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_statelessClassDeclaration = 3, RULE_statefullClassDeclaration = 4, 
		RULE_stfulFirstBody = 5, RULE_stfulSecondBody = 6, RULE_statefullAssignStateClassDeclaration = 7, 
		RULE_returnStateTypes = 8, RULE_functionReturnState = 9, RULE_returnArrowState = 10, 
		RULE_buildMethodDeclaration = 11, RULE_dartVariabelsDeclaration = 12, 
		RULE_variable = 13, RULE_integerDeclaration = 14, RULE_doubleDeclaration = 15, 
		RULE_stringDeclaration = 16, RULE_boolDeclaration = 17, RULE_addExpression = 18, 
		RULE_multiplyExpression = 19, RULE_addDoubleExpression = 20, RULE_multiplyDoubleExpression = 21, 
		RULE_booleans = 22, RULE_booleanOperation = 23, RULE_dartAllListsDeclaration = 24, 
		RULE_dartListStringDeclaration = 25, RULE_dartListIntDeclaration = 26, 
		RULE_dartListBoolDeclaration = 27, RULE_widgetsDeclaration = 28, RULE_expandedDeclaration = 29, 
		RULE_paddingDeclaration = 30, RULE_scaffoldDeclaration = 31, RULE_textDeclaration = 32, 
		RULE_materialAppDeclaration = 33, RULE_materialButtonDeclaration = 34, 
		RULE_conatinerDeclaration = 35, RULE_rowColumnDeclaration = 36, RULE_imageDeclaration = 37, 
		RULE_conatinerPropertiesDeclaration = 38, RULE_paddingPropertyDeclaration = 39, 
		RULE_edgeInsistAll = 40, RULE_onPressedPropertyDeclaration = 41, RULE_setStatePressedDeclaration = 42, 
		RULE_heightPropertyDeclaration = 43, RULE_widthPropertyDeclaration = 44, 
		RULE_homePropertyDeclaration = 45, RULE_childPropertyDeclaration = 46, 
		RULE_childrenPropertyDeclaration = 47, RULE_bodyPropertyDeclaration = 48, 
		RULE_buildContextDeclaration = 49, RULE_number = 50, RULE_numberDouble = 51, 
		RULE_ifStatement = 52, RULE_whileStatement = 53, RULE_block = 54, RULE_function = 55, 
		RULE_functionType = 56, RULE_parameters = 57, RULE_statement = 58, RULE_forStatement = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"topTreeDeclaration", "allClassesDeclaration", "classDeclaration", "statelessClassDeclaration", 
			"statefullClassDeclaration", "stfulFirstBody", "stfulSecondBody", "statefullAssignStateClassDeclaration", 
			"returnStateTypes", "functionReturnState", "returnArrowState", "buildMethodDeclaration", 
			"dartVariabelsDeclaration", "variable", "integerDeclaration", "doubleDeclaration", 
			"stringDeclaration", "boolDeclaration", "addExpression", "multiplyExpression", 
			"addDoubleExpression", "multiplyDoubleExpression", "booleans", "booleanOperation", 
			"dartAllListsDeclaration", "dartListStringDeclaration", "dartListIntDeclaration", 
			"dartListBoolDeclaration", "widgetsDeclaration", "expandedDeclaration", 
			"paddingDeclaration", "scaffoldDeclaration", "textDeclaration", "materialAppDeclaration", 
			"materialButtonDeclaration", "conatinerDeclaration", "rowColumnDeclaration", 
			"imageDeclaration", "conatinerPropertiesDeclaration", "paddingPropertyDeclaration", 
			"edgeInsistAll", "onPressedPropertyDeclaration", "setStatePressedDeclaration", 
			"heightPropertyDeclaration", "widthPropertyDeclaration", "homePropertyDeclaration", 
			"childPropertyDeclaration", "childrenPropertyDeclaration", "bodyPropertyDeclaration", 
			"buildContextDeclaration", "number", "numberDouble", "ifStatement", "whileStatement", 
			"block", "function", "functionType", "parameters", "statement", "forStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'<'", "'>'", "'('", "')'", "'['", "']'", 
			"';'", "','", "':'", "'+'", "'-'", "'*'", "'/'", "'=='", "'='", "'!='", 
			"'<='", "'>='", "'.'", "'int'", "'String'", "'bool'", "'double'", "'List'", 
			"'extends'", "'return'", "'all'", "'final'", "'const'", "'var'", "'void'", 
			"'Function'", "'if'", "'while'", "'for'", "'setState'", null, "'BuildContext'", 
			"'State'", "'create'", "'createState'", "'Widget'", "'build'", "'Container'", 
			"'Expanded'", "'MaterialButton'", "'child'", "'width'", "'height'", "'color'", 
			"'else if'", "'else'", "'MaterialApp'", "'home'", "'Scaffold'", "'Padding'", 
			"'padding'", "'EdgeInsets'", "'Row'", "'Column'", "'onPressed'", "'Image'", 
			"'body'", "'Text'", "'network'", "'children'", "'dynamic'", null, null, 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "CRLY_BRKT_OP", "CRLY_BRKT_CL", "ANGLE_BRKT_OP", "ANGLE_BRKT_CL", 
			"BRKT_OP", "BRKT_CL", "SQR_BRKT_OP", "SQR_BRKT_CL", "SEMICOLON", "COMMA", 
			"COLON", "PLUS", "MINUS", "MULTY", "DIVIDE", "EQUAL", "ASSIGN", "NOTEQUAL", 
			"GRATEREQUAL", "LESSEQUAL", "DOT", "INT", "STRING", "BOOL", "DOUBLE", 
			"LIST", "EXTENDS", "RETURN", "ALL", "FINAL", "CONST", "VAR", "VOID", 
			"FUNCTION", "IF", "WHILE", "FOR", "SETSTATE", "STRING_LINE", "BUILDCONTEXT", 
			"STATE", "CREATE", "CREATESTATE", "WIDGET", "BUILD", "CONTAINER", "EXPANDED", 
			"MATERIALBUTTON", "CHILD", "WIDTH", "HEIGHT", "COLOR", "ELSEIF", "ELSE", 
			"MATERIALAPP", "HOME", "SCAFFOLD", "PADDING", "PADDINGSMALL", "EDGEINSETS", 
			"ROW", "COLUMN", "ONPRESSED", "IMAGE", "BODY", "TEXT", "NETWORK", "CHILDREN", 
			"DYNAMIC", "STATEFULL", "STATELESS", "TRUE", "FALSE", "NAME", "NUMBERDOUBLE", 
			"NUMBER", "COMMENT", "OVERRIDE", "PRIVATE", "WS"
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
		public List<DartVariabelsDeclarationContext> dartVariabelsDeclaration() {
			return getRuleContexts(DartVariabelsDeclarationContext.class);
		}
		public DartVariabelsDeclarationContext dartVariabelsDeclaration(int i) {
			return getRuleContext(DartVariabelsDeclarationContext.class,i);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 66832039938L) != 0 || _la==NAME) {
				{
				setState(122);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(120);
					allClassesDeclaration();
					}
					break;
				case INT:
				case STRING:
				case BOOL:
				case DOUBLE:
				case LIST:
				case FINAL:
				case CONST:
				case VAR:
				case VOID:
				case FUNCTION:
				case NAME:
					{
					setState(121);
					dartVariabelsDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(126);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				statefullClassDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
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
			setState(132);
			match(CLASS);
			setState(133);
			match(NAME);
			setState(134);
			match(CRLY_BRKT_OP);
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627378463L) != 0) {
				{
				{
				setState(135);
				dartVariabelsDeclaration();
				}
				}
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(141);
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
			setState(143);
			match(CLASS);
			setState(144);
			match(NAME);
			setState(145);
			match(STATELESS);
			setState(146);
			match(CRLY_BRKT_OP);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627378463L) != 0) {
				{
				{
				setState(147);
				dartVariabelsDeclaration();
				}
				}
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(153);
			buildMethodDeclaration();
			setState(154);
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
			setState(156);
			stfulFirstBody();
			setState(157);
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
			setState(159);
			match(CLASS);
			setState(160);
			match(NAME);
			setState(161);
			match(STATEFULL);
			setState(162);
			match(CRLY_BRKT_OP);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627378463L) != 0) {
				{
				{
				setState(163);
				dartVariabelsDeclaration();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169);
			statefullAssignStateClassDeclaration();
			setState(170);
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
			setState(172);
			match(CLASS);
			setState(173);
			match(NAME);
			setState(174);
			match(EXTENDS);
			setState(175);
			match(STATE);
			setState(176);
			match(ANGLE_BRKT_OP);
			setState(177);
			match(NAME);
			setState(178);
			match(ANGLE_BRKT_CL);
			setState(179);
			match(CRLY_BRKT_OP);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627378463L) != 0) {
				{
				{
				setState(180);
				dartVariabelsDeclaration();
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(186);
			buildMethodDeclaration();
			setState(187);
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
			setState(189);
			match(STATE);
			setState(190);
			match(ANGLE_BRKT_OP);
			setState(191);
			match(NAME);
			setState(192);
			match(ANGLE_BRKT_CL);
			setState(193);
			match(CREATESTATE);
			setState(194);
			match(BRKT_OP);
			setState(195);
			match(BRKT_CL);
			setState(196);
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
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				returnArrowState();
				}
				break;
			case CRLY_BRKT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
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
			setState(202);
			match(CRLY_BRKT_OP);
			setState(203);
			match(RETURN);
			setState(204);
			match(NAME);
			setState(205);
			match(BRKT_OP);
			setState(206);
			match(BRKT_CL);
			setState(207);
			match(SEMICOLON);
			setState(208);
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
			setState(210);
			match(ASSIGN);
			setState(211);
			match(ANGLE_BRKT_CL);
			setState(212);
			match(NAME);
			setState(213);
			match(BRKT_OP);
			setState(214);
			match(BRKT_CL);
			setState(215);
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
			setState(217);
			match(WIDGET);
			setState(218);
			match(BUILD);
			setState(219);
			match(BRKT_OP);
			setState(220);
			buildContextDeclaration();
			setState(221);
			match(BRKT_CL);
			setState(222);
			match(CRLY_BRKT_OP);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627378463L) != 0) {
				{
				{
				setState(223);
				dartVariabelsDeclaration();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(229);
			match(RETURN);
			setState(230);
			widgetsDeclaration();
			setState(231);
			match(SEMICOLON);
			setState(232);
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
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				dartAllListsDeclaration();
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
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==CONST) {
				{
				setState(239);
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

			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(242);
				integerDeclaration();
				}
				break;
			case 2:
				{
				setState(243);
				stringDeclaration();
				}
				break;
			case 3:
				{
				setState(244);
				boolDeclaration();
				}
				break;
			case 4:
				{
				setState(245);
				doubleDeclaration();
				}
				break;
			}
			setState(248);
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
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(250);
				match(INT);
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
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE) {
				{
				setState(258);
				match(DOUBLE);
				}
			}

			setState(261);
			match(NAME);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(262);
				match(ASSIGN);
				setState(263);
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
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(266);
				match(STRING);
				}
			}

			setState(269);
			match(NAME);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(270);
				match(ASSIGN);
				setState(271);
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
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(274);
				match(BOOL);
				}
			}

			setState(277);
			match(NAME);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(278);
				match(ASSIGN);
				setState(279);
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
			setState(282);
			multiplyExpression();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(283);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(284);
				multiplyExpression();
				}
				}
				setState(289);
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
			setState(290);
			number();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(291);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(292);
				number();
				}
				}
				setState(297);
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
			setState(298);
			multiplyDoubleExpression();
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(299);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(300);
				multiplyDoubleExpression();
				}
				}
				setState(305);
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
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(306);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(307);
				numberDouble();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(310);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(313);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(311);
					number();
					}
					break;
				case NUMBERDOUBLE:
					{
					setState(312);
					numberDouble();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(319);
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
			setState(320);
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
	public static class BooleanOperationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(dart_parse.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(dart_parse.NOTEQUAL, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public TerminalNode ANGLE_BRKT_OP() { return getToken(dart_parse.ANGLE_BRKT_OP, 0); }
		public TerminalNode GRATEREQUAL() { return getToken(dart_parse.GRATEREQUAL, 0); }
		public TerminalNode LESSEQUAL() { return getToken(dart_parse.LESSEQUAL, 0); }
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
		public List<TerminalNode> NAME() { return getTokens(dart_parse.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(dart_parse.NAME, i);
		}
		public BooleanOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanOperation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBooleanOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBooleanOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBooleanOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanOperationContext booleanOperation() throws RecognitionException {
		BooleanOperationContext _localctx = new BooleanOperationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_booleanOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(322);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(323);
				numberDouble();
				}
				break;
			case NAME:
				{
				setState(324);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(327);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3801136L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(328);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(329);
				numberDouble();
				}
				break;
			case NAME:
				{
				setState(330);
				match(NAME);
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
		enterRule(_localctx, 48, RULE_dartAllListsDeclaration);
		try {
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				dartListStringDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				dartListIntDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
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
		enterRule(_localctx, 50, RULE_dartListStringDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(LIST);
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(339);
				match(ANGLE_BRKT_OP);
				setState(340);
				match(STRING);
				setState(341);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(344);
			match(NAME);
			setState(345);
			match(ASSIGN);
			setState(346);
			match(SQR_BRKT_OP);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LINE) {
				{
				setState(347);
				match(STRING_LINE);
				setState(352);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(348);
						match(COMMA);
						setState(349);
						match(STRING_LINE);
						}
						} 
					}
					setState(354);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
			}

			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(357);
				match(COMMA);
				}
			}

			setState(360);
			match(SQR_BRKT_CL);
			setState(361);
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
		enterRule(_localctx, 52, RULE_dartListIntDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			match(LIST);
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(364);
				match(ANGLE_BRKT_OP);
				setState(365);
				match(INT);
				setState(366);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(369);
			match(NAME);
			setState(370);
			match(ASSIGN);
			setState(371);
			match(SQR_BRKT_OP);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(372);
				number();
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(373);
						match(COMMA);
						setState(374);
						number();
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
			}

			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(382);
				match(COMMA);
				}
			}

			setState(385);
			match(SQR_BRKT_CL);
			setState(386);
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
		enterRule(_localctx, 54, RULE_dartListBoolDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(LIST);
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(389);
				match(ANGLE_BRKT_OP);
				setState(390);
				match(BOOL);
				setState(391);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(394);
			match(NAME);
			setState(395);
			match(ASSIGN);
			setState(396);
			match(SQR_BRKT_OP);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE) {
				{
				setState(397);
				booleans();
				setState(402);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(398);
						match(COMMA);
						setState(399);
						booleans();
						}
						} 
					}
					setState(404);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
			}

			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(407);
				match(COMMA);
				}
			}

			setState(410);
			match(SQR_BRKT_CL);
			setState(411);
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
		enterRule(_localctx, 56, RULE_widgetsDeclaration);
		try {
			setState(422);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				conatinerDeclaration();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				expandedDeclaration();
				}
				break;
			case MATERIALBUTTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				materialButtonDeclaration();
				}
				break;
			case MATERIALAPP:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				materialAppDeclaration();
				}
				break;
			case SCAFFOLD:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				scaffoldDeclaration();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				paddingDeclaration();
				}
				break;
			case ROW:
			case COLUMN:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				rowColumnDeclaration();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(420);
				textDeclaration();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(421);
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
		enterRule(_localctx, 58, RULE_expandedDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(EXPANDED);
			setState(425);
			match(BRKT_OP);
			setState(426);
			childPropertyDeclaration();
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(427);
				match(COMMA);
				}
			}

			setState(430);
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
		enterRule(_localctx, 60, RULE_paddingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(PADDING);
			setState(433);
			match(BRKT_OP);
			setState(442);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGSMALL:
				{
				{
				setState(434);
				paddingPropertyDeclaration();
				setState(435);
				match(COMMA);
				setState(436);
				childPropertyDeclaration();
				}
				}
				break;
			case CHILD:
				{
				{
				setState(438);
				childPropertyDeclaration();
				setState(439);
				match(COMMA);
				setState(440);
				paddingPropertyDeclaration();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(444);
				match(COMMA);
				}
			}

			setState(447);
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
		enterRule(_localctx, 62, RULE_scaffoldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			match(SCAFFOLD);
			setState(450);
			match(BRKT_OP);
			setState(451);
			bodyPropertyDeclaration();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(452);
				match(COMMA);
				}
			}

			setState(455);
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
		enterRule(_localctx, 64, RULE_textDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(TEXT);
			setState(458);
			match(BRKT_OP);
			setState(459);
			match(STRING_LINE);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(460);
				match(COMMA);
				}
			}

			setState(463);
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
		enterRule(_localctx, 66, RULE_materialAppDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(465);
			match(MATERIALAPP);
			setState(466);
			match(BRKT_OP);
			setState(467);
			homePropertyDeclaration();
			setState(469);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(468);
				match(COMMA);
				}
			}

			setState(471);
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
		public OnPressedPropertyDeclarationContext onPressedPropertyDeclaration() {
			return getRuleContext(OnPressedPropertyDeclarationContext.class,0);
		}
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
		enterRule(_localctx, 68, RULE_materialButtonDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			match(MATERIALBUTTON);
			setState(474);
			match(BRKT_OP);
			setState(475);
			onPressedPropertyDeclaration();
			setState(476);
			childPropertyDeclaration();
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(477);
				match(COMMA);
				}
			}

			setState(480);
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
		enterRule(_localctx, 70, RULE_conatinerDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(CONTAINER);
			setState(483);
			match(BRKT_OP);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0) {
				{
				setState(484);
				conatinerPropertiesDeclaration();
				}
			}

			setState(491);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(487);
					match(COMMA);
					setState(488);
					conatinerPropertiesDeclaration();
					}
					} 
				}
				setState(493);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(494);
				match(COMMA);
				}
			}

			setState(497);
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
		enterRule(_localctx, 72, RULE_rowColumnDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==COLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(500);
			match(BRKT_OP);
			setState(501);
			childrenPropertyDeclaration();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(502);
				match(COMMA);
				}
			}

			setState(505);
			match(BRKT_CL);
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(506);
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
		enterRule(_localctx, 74, RULE_imageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			match(IMAGE);
			setState(510);
			match(DOT);
			setState(511);
			match(NETWORK);
			setState(512);
			match(BRKT_OP);
			setState(513);
			_la = _input.LA(1);
			if ( !(_la==STRING_LINE || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(514);
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
		enterRule(_localctx, 76, RULE_conatinerPropertiesDeclaration);
		try {
			setState(519);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(516);
				heightPropertyDeclaration();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(517);
				widthPropertyDeclaration();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
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
		enterRule(_localctx, 78, RULE_paddingPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(PADDINGSMALL);
			setState(522);
			match(COLON);
			setState(523);
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
		enterRule(_localctx, 80, RULE_edgeInsistAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(EDGEINSETS);
			setState(526);
			match(DOT);
			setState(527);
			match(ALL);
			setState(528);
			match(BRKT_OP);
			setState(529);
			number();
			setState(530);
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
	public static class OnPressedPropertyDeclarationContext extends ParserRuleContext {
		public TerminalNode ONPRESSED() { return getToken(dart_parse.ONPRESSED, 0); }
		public TerminalNode COLON() { return getToken(dart_parse.COLON, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public TerminalNode COMMA() { return getToken(dart_parse.COMMA, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<SetStatePressedDeclarationContext> setStatePressedDeclaration() {
			return getRuleContexts(SetStatePressedDeclarationContext.class);
		}
		public SetStatePressedDeclarationContext setStatePressedDeclaration(int i) {
			return getRuleContext(SetStatePressedDeclarationContext.class,i);
		}
		public OnPressedPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onPressedPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterOnPressedPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitOnPressedPropertyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitOnPressedPropertyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnPressedPropertyDeclarationContext onPressedPropertyDeclaration() throws RecognitionException {
		OnPressedPropertyDeclarationContext _localctx = new OnPressedPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_onPressedPropertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			match(ONPRESSED);
			setState(533);
			match(COLON);
			setState(534);
			match(BRKT_OP);
			setState(535);
			match(BRKT_CL);
			setState(536);
			match(CRLY_BRKT_OP);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627468575L) != 0) {
				{
				setState(539);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INT:
				case STRING:
				case BOOL:
				case DOUBLE:
				case LIST:
				case FINAL:
				case CONST:
				case VAR:
				case VOID:
				case FUNCTION:
				case IF:
				case WHILE:
				case NAME:
					{
					setState(537);
					statement();
					}
					break;
				case SETSTATE:
					{
					setState(538);
					setStatePressedDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
			match(CRLY_BRKT_CL);
			setState(545);
			match(COMMA);
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
	public static class SetStatePressedDeclarationContext extends ParserRuleContext {
		public TerminalNode SETSTATE() { return getToken(dart_parse.SETSTATE, 0); }
		public List<TerminalNode> BRKT_OP() { return getTokens(dart_parse.BRKT_OP); }
		public TerminalNode BRKT_OP(int i) {
			return getToken(dart_parse.BRKT_OP, i);
		}
		public List<TerminalNode> BRKT_CL() { return getTokens(dart_parse.BRKT_CL); }
		public TerminalNode BRKT_CL(int i) {
			return getToken(dart_parse.BRKT_CL, i);
		}
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SetStatePressedDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setStatePressedDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterSetStatePressedDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitSetStatePressedDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitSetStatePressedDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetStatePressedDeclarationContext setStatePressedDeclaration() throws RecognitionException {
		SetStatePressedDeclarationContext _localctx = new SetStatePressedDeclarationContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_setStatePressedDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(SETSTATE);
			setState(548);
			match(BRKT_OP);
			setState(549);
			match(BRKT_OP);
			setState(550);
			match(BRKT_CL);
			setState(551);
			match(CRLY_BRKT_OP);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627403039L) != 0) {
				{
				{
				setState(552);
				statement();
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			match(CRLY_BRKT_CL);
			setState(559);
			match(BRKT_CL);
			setState(560);
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
		enterRule(_localctx, 86, RULE_heightPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(HEIGHT);
			setState(563);
			match(COLON);
			setState(564);
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
		enterRule(_localctx, 88, RULE_widthPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(WIDTH);
			setState(567);
			match(COLON);
			setState(568);
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
		enterRule(_localctx, 90, RULE_homePropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(HOME);
			setState(571);
			match(COLON);
			setState(572);
			match(NAME);
			setState(573);
			match(BRKT_OP);
			setState(574);
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
		enterRule(_localctx, 92, RULE_childPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			match(CHILD);
			setState(577);
			match(COLON);
			setState(578);
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
		enterRule(_localctx, 94, RULE_childrenPropertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			match(CHILDREN);
			setState(581);
			match(COLON);
			setState(582);
			match(SQR_BRKT_OP);
			setState(591);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 47)) & ~0x3f) == 0 && ((1L << (_la - 47)) & 1415687L) != 0) {
				{
				setState(583);
				widgetsDeclaration();
				setState(588);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(584);
						match(COMMA);
						setState(585);
						widgetsDeclaration();
						}
						} 
					}
					setState(590);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				}
				}
			}

			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(593);
				match(COMMA);
				}
			}

			setState(596);
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
		enterRule(_localctx, 96, RULE_bodyPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(BODY);
			setState(599);
			match(COLON);
			setState(600);
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
		enterRule(_localctx, 98, RULE_buildContextDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(BUILDCONTEXT);
			setState(603);
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
		enterRule(_localctx, 100, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
		enterRule(_localctx, 102, RULE_numberDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(dart_parse.IF, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(dart_parse.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(dart_parse.ELSEIF, i);
		}
		public TerminalNode ELSE() { return getToken(dart_parse.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			match(IF);
			setState(610);
			match(BRKT_OP);
			setState(611);
			booleanOperation();
			setState(612);
			match(BRKT_CL);
			setState(613);
			block();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(614);
				match(ELSEIF);
				setState(615);
				block();
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(621);
				match(ELSE);
				setState(622);
				block();
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(dart_parse.WHILE, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			match(WHILE);
			setState(626);
			match(BRKT_OP);
			setState(627);
			booleanOperation();
			setState(628);
			match(BRKT_CL);
			setState(629);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode CRLY_BRKT_OP() { return getToken(dart_parse.CRLY_BRKT_OP, 0); }
		public TerminalNode CRLY_BRKT_CL() { return getToken(dart_parse.CRLY_BRKT_CL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			match(CRLY_BRKT_OP);
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627403039L) != 0) {
				{
				{
				setState(632);
				statement();
				}
				}
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(638);
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
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode FUNCTION() { return getToken(dart_parse.FUNCTION, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				{
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(640);
					match(FUNCTION);
					}
				}

				setState(643);
				functionType();
				}
				}
				break;
			case 2:
				{
				setState(644);
				match(FUNCTION);
				}
				break;
			}
			setState(647);
			match(NAME);
			setState(648);
			match(BRKT_OP);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 4503599627378463L) != 0) {
				{
				setState(649);
				parameters();
				}
			}

			setState(652);
			match(BRKT_CL);
			setState(653);
			block();
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
	public static class FunctionTypeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dart_parse.STRING, 0); }
		public TerminalNode INT() { return getToken(dart_parse.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(dart_parse.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(dart_parse.BOOL, 0); }
		public TerminalNode VAR() { return getToken(dart_parse.VAR, 0); }
		public TerminalNode VOID() { return getToken(dart_parse.VOID, 0); }
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitFunctionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitFunctionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 25895632896L) != 0) ) {
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
	public static class ParametersContext extends ParserRuleContext {
		public List<DartVariabelsDeclarationContext> dartVariabelsDeclaration() {
			return getRuleContexts(DartVariabelsDeclarationContext.class);
		}
		public DartVariabelsDeclarationContext dartVariabelsDeclaration(int i) {
			return getRuleContext(DartVariabelsDeclarationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			dartVariabelsDeclaration();
			setState(662);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(658);
					match(COMMA);
					setState(659);
					dartVariabelsDeclaration();
					}
					} 
				}
				setState(664);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			}
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(665);
				match(COMMA);
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
	public static class StatementContext extends ParserRuleContext {
		public DartVariabelsDeclarationContext dartVariabelsDeclaration() {
			return getRuleContext(DartVariabelsDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_statement);
		try {
			setState(672);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				dartVariabelsDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				whileStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(671);
				function();
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
	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(dart_parse.FOR, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(dart_parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(dart_parse.SEMICOLON, i);
		}
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<IntegerDeclarationContext> integerDeclaration() {
			return getRuleContexts(IntegerDeclarationContext.class);
		}
		public IntegerDeclarationContext integerDeclaration(int i) {
			return getRuleContext(IntegerDeclarationContext.class,i);
		}
		public List<DoubleDeclarationContext> doubleDeclaration() {
			return getRuleContexts(DoubleDeclarationContext.class);
		}
		public DoubleDeclarationContext doubleDeclaration(int i) {
			return getRuleContext(DoubleDeclarationContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_forStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(674);
			match(FOR);
			setState(675);
			match(BRKT_OP);
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(676);
				integerDeclaration();
				}
				break;
			case 2:
				{
				setState(677);
				doubleDeclaration();
				}
				break;
			}
			setState(680);
			match(SEMICOLON);
			setState(681);
			booleanOperation();
			setState(682);
			match(SEMICOLON);
			setState(685);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(683);
				integerDeclaration();
				}
				break;
			case 2:
				{
				setState(684);
				doubleDeclaration();
				}
				break;
			}
			setState(687);
			match(BRKT_CL);
			setState(688);
			block();
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
		"\u0004\u0001Q\u02b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0002"+
		"2\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u00076\u0002"+
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0001"+
		"\u0000\u0001\u0000\u0005\u0000{\b\u0000\n\u0000\f\u0000~\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0083\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u0089\b\u0002\n\u0002\f\u0002"+
		"\u008c\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0005\u0003\u0095\b\u0003\n\u0003\f\u0003\u0098"+
		"\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u00a5\b\u0005\n\u0005\f\u0005\u00a8\t\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b6\b\u0006"+
		"\n\u0006\f\u0006\u00b9\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00c9\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00e1"+
		"\b\u000b\n\u000b\f\u000b\u00e4\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00ee\b\f\u0001"+
		"\r\u0003\r\u00f1\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00f7\b\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0003\u000e\u00fc\b\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u0101\b\u000e\u0001\u000f\u0003\u000f\u0104"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0109\b\u000f"+
		"\u0001\u0010\u0003\u0010\u010c\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0111\b\u0010\u0001\u0011\u0003\u0011\u0114\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0119\b\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u011e\b\u0012\n\u0012\f\u0012\u0121\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u0126\b\u0013\n\u0013"+
		"\f\u0013\u0129\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u012e\b\u0014\n\u0014\f\u0014\u0131\t\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u0135\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u013a"+
		"\b\u0015\u0005\u0015\u013c\b\u0015\n\u0015\f\u0015\u013f\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0146"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u014c"+
		"\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0151\b\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0157\b\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u015f\b\u0019\n\u0019\f\u0019\u0162\t\u0019\u0003\u0019\u0164"+
		"\b\u0019\u0001\u0019\u0003\u0019\u0167\b\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0170\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0005\u001a\u0178\b\u001a\n\u001a\f\u001a\u017b\t\u001a\u0003"+
		"\u001a\u017d\b\u001a\u0001\u001a\u0003\u001a\u0180\b\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0189\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0005\u001b\u0191\b\u001b\n\u001b\f\u001b\u0194"+
		"\t\u001b\u0003\u001b\u0196\b\u001b\u0001\u001b\u0003\u001b\u0199\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01a7\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u01ad\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01bb\b\u001e\u0001\u001e\u0003\u001e"+
		"\u01be\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u01c6\b\u001f\u0001\u001f\u0001\u001f\u0001 "+
		"\u0001 \u0001 \u0001 \u0003 \u01ce\b \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0003!\u01d6\b!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0003\"\u01df\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0003"+
		"#\u01e6\b#\u0001#\u0001#\u0005#\u01ea\b#\n#\f#\u01ed\t#\u0001#\u0003#"+
		"\u01f0\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u01f8\b$\u0001"+
		"$\u0001$\u0003$\u01fc\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0003&\u0208\b&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0005)\u021c\b)\n)\f)\u021f\t)\u0001)\u0001"+
		")\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u022a\b*\n*"+
		"\f*\u022d\t*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001+\u0001"+
		",\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		".\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001/\u0005"+
		"/\u024b\b/\n/\f/\u024e\t/\u0003/\u0250\b/\u0001/\u0003/\u0253\b/\u0001"+
		"/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0005"+
		"4\u0269\b4\n4\f4\u026c\t4\u00014\u00014\u00034\u0270\b4\u00015\u00015"+
		"\u00015\u00015\u00015\u00015\u00016\u00016\u00056\u027a\b6\n6\f6\u027d"+
		"\t6\u00016\u00016\u00017\u00037\u0282\b7\u00017\u00017\u00037\u0286\b"+
		"7\u00017\u00017\u00017\u00037\u028b\b7\u00017\u00017\u00017\u00018\u0001"+
		"8\u00019\u00019\u00019\u00059\u0295\b9\n9\f9\u0298\t9\u00019\u00039\u029b"+
		"\b9\u0001:\u0001:\u0001:\u0001:\u0003:\u02a1\b:\u0001;\u0001;\u0001;\u0001"+
		";\u0003;\u02a7\b;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003;\u02ae\b;\u0001"+
		";\u0001;\u0001;\u0001;\u0000\u0000<\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtv\u0000\b\u0001\u0000\u001f \u0001\u0000\r\u000e"+
		"\u0001\u0000\u000f\u0010\u0001\u0000IJ\u0003\u0000\u0004\u0005\u0011\u0011"+
		"\u0013\u0015\u0001\u0000>?\u0002\u0000((KK\u0002\u0000\u0017\u001a!\""+
		"\u02cf\u0000|\u0001\u0000\u0000\u0000\u0002\u0082\u0001\u0000\u0000\u0000"+
		"\u0004\u0084\u0001\u0000\u0000\u0000\u0006\u008f\u0001\u0000\u0000\u0000"+
		"\b\u009c\u0001\u0000\u0000\u0000\n\u009f\u0001\u0000\u0000\u0000\f\u00ac"+
		"\u0001\u0000\u0000\u0000\u000e\u00bd\u0001\u0000\u0000\u0000\u0010\u00c8"+
		"\u0001\u0000\u0000\u0000\u0012\u00ca\u0001\u0000\u0000\u0000\u0014\u00d2"+
		"\u0001\u0000\u0000\u0000\u0016\u00d9\u0001\u0000\u0000\u0000\u0018\u00ed"+
		"\u0001\u0000\u0000\u0000\u001a\u00f0\u0001\u0000\u0000\u0000\u001c\u00fb"+
		"\u0001\u0000\u0000\u0000\u001e\u0103\u0001\u0000\u0000\u0000 \u010b\u0001"+
		"\u0000\u0000\u0000\"\u0113\u0001\u0000\u0000\u0000$\u011a\u0001\u0000"+
		"\u0000\u0000&\u0122\u0001\u0000\u0000\u0000(\u012a\u0001\u0000\u0000\u0000"+
		"*\u0134\u0001\u0000\u0000\u0000,\u0140\u0001\u0000\u0000\u0000.\u0145"+
		"\u0001\u0000\u0000\u00000\u0150\u0001\u0000\u0000\u00002\u0152\u0001\u0000"+
		"\u0000\u00004\u016b\u0001\u0000\u0000\u00006\u0184\u0001\u0000\u0000\u0000"+
		"8\u01a6\u0001\u0000\u0000\u0000:\u01a8\u0001\u0000\u0000\u0000<\u01b0"+
		"\u0001\u0000\u0000\u0000>\u01c1\u0001\u0000\u0000\u0000@\u01c9\u0001\u0000"+
		"\u0000\u0000B\u01d1\u0001\u0000\u0000\u0000D\u01d9\u0001\u0000\u0000\u0000"+
		"F\u01e2\u0001\u0000\u0000\u0000H\u01f3\u0001\u0000\u0000\u0000J\u01fd"+
		"\u0001\u0000\u0000\u0000L\u0207\u0001\u0000\u0000\u0000N\u0209\u0001\u0000"+
		"\u0000\u0000P\u020d\u0001\u0000\u0000\u0000R\u0214\u0001\u0000\u0000\u0000"+
		"T\u0223\u0001\u0000\u0000\u0000V\u0232\u0001\u0000\u0000\u0000X\u0236"+
		"\u0001\u0000\u0000\u0000Z\u023a\u0001\u0000\u0000\u0000\\\u0240\u0001"+
		"\u0000\u0000\u0000^\u0244\u0001\u0000\u0000\u0000`\u0256\u0001\u0000\u0000"+
		"\u0000b\u025a\u0001\u0000\u0000\u0000d\u025d\u0001\u0000\u0000\u0000f"+
		"\u025f\u0001\u0000\u0000\u0000h\u0261\u0001\u0000\u0000\u0000j\u0271\u0001"+
		"\u0000\u0000\u0000l\u0277\u0001\u0000\u0000\u0000n\u0285\u0001\u0000\u0000"+
		"\u0000p\u028f\u0001\u0000\u0000\u0000r\u0291\u0001\u0000\u0000\u0000t"+
		"\u02a0\u0001\u0000\u0000\u0000v\u02a2\u0001\u0000\u0000\u0000x{\u0003"+
		"\u0002\u0001\u0000y{\u0003\u0018\f\u0000zx\u0001\u0000\u0000\u0000zy\u0001"+
		"\u0000\u0000\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u0001\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000\u007f\u0083\u0003\u0004\u0002\u0000\u0080\u0083\u0003\b\u0004"+
		"\u0000\u0081\u0083\u0003\u0006\u0003\u0000\u0082\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000\u0000"+
		"\u0000\u0083\u0003\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u0001\u0000"+
		"\u0000\u0085\u0086\u0005K\u0000\u0000\u0086\u008a\u0005\u0002\u0000\u0000"+
		"\u0087\u0089\u0003\u0018\f\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089"+
		"\u008c\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a"+
		"\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001\u0000\u0000\u0000\u008c"+
		"\u008a\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0003\u0000\u0000\u008e"+
		"\u0005\u0001\u0000\u0000\u0000\u008f\u0090\u0005\u0001\u0000\u0000\u0090"+
		"\u0091\u0005K\u0000\u0000\u0091\u0092\u0005H\u0000\u0000\u0092\u0096\u0005"+
		"\u0002\u0000\u0000\u0093\u0095\u0003\u0018\f\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0099\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009a\u0003\u0016"+
		"\u000b\u0000\u009a\u009b\u0005\u0003\u0000\u0000\u009b\u0007\u0001\u0000"+
		"\u0000\u0000\u009c\u009d\u0003\n\u0005\u0000\u009d\u009e\u0003\f\u0006"+
		"\u0000\u009e\t\u0001\u0000\u0000\u0000\u009f\u00a0\u0005\u0001\u0000\u0000"+
		"\u00a0\u00a1\u0005K\u0000\u0000\u00a1\u00a2\u0005G\u0000\u0000\u00a2\u00a6"+
		"\u0005\u0002\u0000\u0000\u00a3\u00a5\u0003\u0018\f\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00a9\u0001"+
		"\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u00aa\u0003"+
		"\u000e\u0007\u0000\u00aa\u00ab\u0005\u0003\u0000\u0000\u00ab\u000b\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0005\u0001\u0000\u0000\u00ad\u00ae\u0005"+
		"K\u0000\u0000\u00ae\u00af\u0005\u001c\u0000\u0000\u00af\u00b0\u0005*\u0000"+
		"\u0000\u00b0\u00b1\u0005\u0004\u0000\u0000\u00b1\u00b2\u0005K\u0000\u0000"+
		"\u00b2\u00b3\u0005\u0005\u0000\u0000\u00b3\u00b7\u0005\u0002\u0000\u0000"+
		"\u00b4\u00b6\u0003\u0018\f\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u00ba\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\u0016\u000b\u0000\u00bb"+
		"\u00bc\u0005\u0003\u0000\u0000\u00bc\r\u0001\u0000\u0000\u0000\u00bd\u00be"+
		"\u0005*\u0000\u0000\u00be\u00bf\u0005\u0004\u0000\u0000\u00bf\u00c0\u0005"+
		"K\u0000\u0000\u00c0\u00c1\u0005\u0005\u0000\u0000\u00c1\u00c2\u0005,\u0000"+
		"\u0000\u00c2\u00c3\u0005\u0006\u0000\u0000\u00c3\u00c4\u0005\u0007\u0000"+
		"\u0000\u00c4\u00c5\u0003\u0010\b\u0000\u00c5\u000f\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c9\u0003\u0014\n\u0000\u00c7\u00c9\u0003\u0012\t\u0000\u00c8"+
		"\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9"+
		"\u0011\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u0002\u0000\u0000\u00cb"+
		"\u00cc\u0005\u001d\u0000\u0000\u00cc\u00cd\u0005K\u0000\u0000\u00cd\u00ce"+
		"\u0005\u0006\u0000\u0000\u00ce\u00cf\u0005\u0007\u0000\u0000\u00cf\u00d0"+
		"\u0005\n\u0000\u0000\u00d0\u00d1\u0005\u0003\u0000\u0000\u00d1\u0013\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0005\u0012\u0000\u0000\u00d3\u00d4\u0005"+
		"\u0005\u0000\u0000\u00d4\u00d5\u0005K\u0000\u0000\u00d5\u00d6\u0005\u0006"+
		"\u0000\u0000\u00d6\u00d7\u0005\u0007\u0000\u0000\u00d7\u00d8\u0005\n\u0000"+
		"\u0000\u00d8\u0015\u0001\u0000\u0000\u0000\u00d9\u00da\u0005-\u0000\u0000"+
		"\u00da\u00db\u0005.\u0000\u0000\u00db\u00dc\u0005\u0006\u0000\u0000\u00dc"+
		"\u00dd\u0003b1\u0000\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u00e2\u0005"+
		"\u0002\u0000\u0000\u00df\u00e1\u0003\u0018\f\u0000\u00e0\u00df\u0001\u0000"+
		"\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\u001d"+
		"\u0000\u0000\u00e6\u00e7\u00038\u001c\u0000\u00e7\u00e8\u0005\n\u0000"+
		"\u0000\u00e8\u00e9\u0005\u0003\u0000\u0000\u00e9\u0017\u0001\u0000\u0000"+
		"\u0000\u00ea\u00ee\u0003\u001a\r\u0000\u00eb\u00ee\u0003n7\u0000\u00ec"+
		"\u00ee\u00030\u0018\u0000\u00ed\u00ea\u0001\u0000\u0000\u0000\u00ed\u00eb"+
		"\u0001\u0000\u0000\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ee\u0019"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f1\u0007\u0000\u0000\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f6"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f7\u0003\u001c\u000e\u0000\u00f3\u00f7"+
		"\u0003 \u0010\u0000\u00f4\u00f7\u0003\"\u0011\u0000\u00f5\u00f7\u0003"+
		"\u001e\u000f\u0000\u00f6\u00f2\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\n\u0000\u0000\u00f9\u001b\u0001\u0000\u0000\u0000\u00fa\u00fc\u0005\u0017"+
		"\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100\u0005K\u0000"+
		"\u0000\u00fe\u00ff\u0005\u0012\u0000\u0000\u00ff\u0101\u0003$\u0012\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101\u001d\u0001\u0000\u0000\u0000\u0102\u0104\u0005\u001a\u0000\u0000"+
		"\u0103\u0102\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0108\u0005K\u0000\u0000\u0106"+
		"\u0107\u0005\u0012\u0000\u0000\u0107\u0109\u0003(\u0014\u0000\u0108\u0106"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u001f"+
		"\u0001\u0000\u0000\u0000\u010a\u010c\u0005\u0018\u0000\u0000\u010b\u010a"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u0001\u0000\u0000\u0000\u010d\u0110\u0005K\u0000\u0000\u010e\u010f\u0005"+
		"\u0012\u0000\u0000\u010f\u0111\u0005(\u0000\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111!\u0001\u0000\u0000"+
		"\u0000\u0112\u0114\u0005\u0019\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0115\u0001\u0000\u0000"+
		"\u0000\u0115\u0118\u0005K\u0000\u0000\u0116\u0117\u0005\u0012\u0000\u0000"+
		"\u0117\u0119\u0003,\u0016\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118"+
		"\u0119\u0001\u0000\u0000\u0000\u0119#\u0001\u0000\u0000\u0000\u011a\u011f"+
		"\u0003&\u0013\u0000\u011b\u011c\u0007\u0001\u0000\u0000\u011c\u011e\u0003"+
		"&\u0013\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000"+
		"\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000"+
		"\u0000\u0000\u0120%\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000"+
		"\u0000\u0122\u0127\u0003d2\u0000\u0123\u0124\u0007\u0002\u0000\u0000\u0124"+
		"\u0126\u0003d2\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0129\u0001"+
		"\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001"+
		"\u0000\u0000\u0000\u0128\'\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u012a\u012f\u0003*\u0015\u0000\u012b\u012c\u0007\u0001\u0000"+
		"\u0000\u012c\u012e\u0003*\u0015\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130)\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0135\u0003d2\u0000\u0133\u0135\u0003"+
		"f3\u0000\u0134\u0132\u0001\u0000\u0000\u0000\u0134\u0133\u0001\u0000\u0000"+
		"\u0000\u0135\u013d\u0001\u0000\u0000\u0000\u0136\u0139\u0007\u0002\u0000"+
		"\u0000\u0137\u013a\u0003d2\u0000\u0138\u013a\u0003f3\u0000\u0139\u0137"+
		"\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013c"+
		"\u0001\u0000\u0000\u0000\u013b\u0136\u0001\u0000\u0000\u0000\u013c\u013f"+
		"\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e+\u0001\u0000\u0000\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0007\u0003\u0000\u0000\u0141-\u0001\u0000"+
		"\u0000\u0000\u0142\u0146\u0003d2\u0000\u0143\u0146\u0003f3\u0000\u0144"+
		"\u0146\u0005K\u0000\u0000\u0145\u0142\u0001\u0000\u0000\u0000\u0145\u0143"+
		"\u0001\u0000\u0000\u0000\u0145\u0144\u0001\u0000\u0000\u0000\u0146\u0147"+
		"\u0001\u0000\u0000\u0000\u0147\u014b\u0007\u0004\u0000\u0000\u0148\u014c"+
		"\u0003d2\u0000\u0149\u014c\u0003f3\u0000\u014a\u014c\u0005K\u0000\u0000"+
		"\u014b\u0148\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014a\u0001\u0000\u0000\u0000\u014c/\u0001\u0000\u0000\u0000\u014d"+
		"\u0151\u00032\u0019\u0000\u014e\u0151\u00034\u001a\u0000\u014f\u0151\u0003"+
		"6\u001b\u0000\u0150\u014d\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000"+
		"\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u01511\u0001\u0000\u0000"+
		"\u0000\u0152\u0156\u0005\u001b\u0000\u0000\u0153\u0154\u0005\u0004\u0000"+
		"\u0000\u0154\u0155\u0005\u0018\u0000\u0000\u0155\u0157\u0005\u0005\u0000"+
		"\u0000\u0156\u0153\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0005K\u0000\u0000"+
		"\u0159\u015a\u0005\u0012\u0000\u0000\u015a\u0163\u0005\b\u0000\u0000\u015b"+
		"\u0160\u0005(\u0000\u0000\u015c\u015d\u0005\u000b\u0000\u0000\u015d\u015f"+
		"\u0005(\u0000\u0000\u015e\u015c\u0001\u0000\u0000\u0000\u015f\u0162\u0001"+
		"\u0000\u0000\u0000\u0160\u015e\u0001\u0000\u0000\u0000\u0160\u0161\u0001"+
		"\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000\u0000\u0162\u0160\u0001"+
		"\u0000\u0000\u0000\u0163\u015b\u0001\u0000\u0000\u0000\u0163\u0164\u0001"+
		"\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0167\u0005"+
		"\u000b\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0166\u0167\u0001"+
		"\u0000\u0000\u0000\u0167\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005"+
		"\t\u0000\u0000\u0169\u016a\u0005\n\u0000\u0000\u016a3\u0001\u0000\u0000"+
		"\u0000\u016b\u016f\u0005\u001b\u0000\u0000\u016c\u016d\u0005\u0004\u0000"+
		"\u0000\u016d\u016e\u0005\u0017\u0000\u0000\u016e\u0170\u0005\u0005\u0000"+
		"\u0000\u016f\u016c\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170\u0171\u0001\u0000\u0000\u0000\u0171\u0172\u0005K\u0000\u0000"+
		"\u0172\u0173\u0005\u0012\u0000\u0000\u0173\u017c\u0005\b\u0000\u0000\u0174"+
		"\u0179\u0003d2\u0000\u0175\u0176\u0005\u000b\u0000\u0000\u0176\u0178\u0003"+
		"d2\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000"+
		"\u0000\u0179\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000"+
		"\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000"+
		"\u0000\u017c\u0174\u0001\u0000\u0000\u0000\u017c\u017d\u0001\u0000\u0000"+
		"\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e\u0180\u0005\u000b\u0000"+
		"\u0000\u017f\u017e\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"+
		"\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0005\t\u0000\u0000"+
		"\u0182\u0183\u0005\n\u0000\u0000\u01835\u0001\u0000\u0000\u0000\u0184"+
		"\u0188\u0005\u001b\u0000\u0000\u0185\u0186\u0005\u0004\u0000\u0000\u0186"+
		"\u0187\u0005\u0019\u0000\u0000\u0187\u0189\u0005\u0005\u0000\u0000\u0188"+
		"\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018b\u0005K\u0000\u0000\u018b\u018c"+
		"\u0005\u0012\u0000\u0000\u018c\u0195\u0005\b\u0000\u0000\u018d\u0192\u0003"+
		",\u0016\u0000\u018e\u018f\u0005\u000b\u0000\u0000\u018f\u0191\u0003,\u0016"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000"+
		"\u0000\u0192\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000"+
		"\u0000\u0193\u0196\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000"+
		"\u0000\u0195\u018d\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0198\u0001\u0000\u0000\u0000\u0197\u0199\u0005\u000b\u0000"+
		"\u0000\u0198\u0197\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000"+
		"\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0005\t\u0000\u0000"+
		"\u019b\u019c\u0005\n\u0000\u0000\u019c7\u0001\u0000\u0000\u0000\u019d"+
		"\u01a7\u0003F#\u0000\u019e\u01a7\u0003:\u001d\u0000\u019f\u01a7\u0003"+
		"D\"\u0000\u01a0\u01a7\u0003B!\u0000\u01a1\u01a7\u0003>\u001f\u0000\u01a2"+
		"\u01a7\u0003<\u001e\u0000\u01a3\u01a7\u0003H$\u0000\u01a4\u01a7\u0003"+
		"@ \u0000\u01a5\u01a7\u0003J%\u0000\u01a6\u019d\u0001\u0000\u0000\u0000"+
		"\u01a6\u019e\u0001\u0000\u0000\u0000\u01a6\u019f\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a0\u0001\u0000\u0000\u0000\u01a6\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a2\u0001\u0000\u0000\u0000\u01a6\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a79\u0001\u0000\u0000\u0000\u01a8\u01a9\u00050\u0000\u0000\u01a9\u01aa"+
		"\u0005\u0006\u0000\u0000\u01aa\u01ac\u0003\\.\u0000\u01ab\u01ad\u0005"+
		"\u000b\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ac\u01ad\u0001"+
		"\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae\u01af\u0005"+
		"\u0007\u0000\u0000\u01af;\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005;\u0000"+
		"\u0000\u01b1\u01ba\u0005\u0006\u0000\u0000\u01b2\u01b3\u0003N\'\u0000"+
		"\u01b3\u01b4\u0005\u000b\u0000\u0000\u01b4\u01b5\u0003\\.\u0000\u01b5"+
		"\u01bb\u0001\u0000\u0000\u0000\u01b6\u01b7\u0003\\.\u0000\u01b7\u01b8"+
		"\u0005\u000b\u0000\u0000\u01b8\u01b9\u0003N\'\u0000\u01b9\u01bb\u0001"+
		"\u0000\u0000\u0000\u01ba\u01b2\u0001\u0000\u0000\u0000\u01ba\u01b6\u0001"+
		"\u0000\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01be\u0005"+
		"\u000b\u0000\u0000\u01bd\u01bc\u0001\u0000\u0000\u0000\u01bd\u01be\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0001\u0000\u0000\u0000\u01bf\u01c0\u0005"+
		"\u0007\u0000\u0000\u01c0=\u0001\u0000\u0000\u0000\u01c1\u01c2\u0005:\u0000"+
		"\u0000\u01c2\u01c3\u0005\u0006\u0000\u0000\u01c3\u01c5\u0003`0\u0000\u01c4"+
		"\u01c6\u0005\u000b\u0000\u0000\u01c5\u01c4\u0001\u0000\u0000\u0000\u01c5"+
		"\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000\u0000\u0000\u01c7"+
		"\u01c8\u0005\u0007\u0000\u0000\u01c8?\u0001\u0000\u0000\u0000\u01c9\u01ca"+
		"\u0005C\u0000\u0000\u01ca\u01cb\u0005\u0006\u0000\u0000\u01cb\u01cd\u0005"+
		"(\u0000\u0000\u01cc\u01ce\u0005\u000b\u0000\u0000\u01cd\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d0\u0005\u0007\u0000\u0000\u01d0A\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u00058\u0000\u0000\u01d2\u01d3\u0005\u0006\u0000\u0000"+
		"\u01d3\u01d5\u0003Z-\u0000\u01d4\u01d6\u0005\u000b\u0000\u0000\u01d5\u01d4"+
		"\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005\u0007\u0000\u0000\u01d8C\u0001"+
		"\u0000\u0000\u0000\u01d9\u01da\u00051\u0000\u0000\u01da\u01db\u0005\u0006"+
		"\u0000\u0000\u01db\u01dc\u0003R)\u0000\u01dc\u01de\u0003\\.\u0000\u01dd"+
		"\u01df\u0005\u000b\u0000\u0000\u01de\u01dd\u0001\u0000\u0000\u0000\u01de"+
		"\u01df\u0001\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0"+
		"\u01e1\u0005\u0007\u0000\u0000\u01e1E\u0001\u0000\u0000\u0000\u01e2\u01e3"+
		"\u0005/\u0000\u0000\u01e3\u01e5\u0005\u0006\u0000\u0000\u01e4\u01e6\u0003"+
		"L&\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001\u0000\u0000"+
		"\u0000\u01e6\u01eb\u0001\u0000\u0000\u0000\u01e7\u01e8\u0005\u000b\u0000"+
		"\u0000\u01e8\u01ea\u0003L&\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000\u01ea"+
		"\u01ed\u0001\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01eb"+
		"\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ef\u0001\u0000\u0000\u0000\u01ed"+
		"\u01eb\u0001\u0000\u0000\u0000\u01ee\u01f0\u0005\u000b\u0000\u0000\u01ef"+
		"\u01ee\u0001\u0000\u0000\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0"+
		"\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005\u0007\u0000\u0000\u01f2"+
		"G\u0001\u0000\u0000\u0000\u01f3\u01f4\u0007\u0005\u0000\u0000\u01f4\u01f5"+
		"\u0005\u0006\u0000\u0000\u01f5\u01f7\u0003^/\u0000\u01f6\u01f8\u0005\u000b"+
		"\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f7\u01f8\u0001\u0000"+
		"\u0000\u0000\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0005\u0007"+
		"\u0000\u0000\u01fa\u01fc\u0005\u000b\u0000\u0000\u01fb\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fcI\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0005A\u0000\u0000\u01fe\u01ff\u0005\u0016\u0000\u0000"+
		"\u01ff\u0200\u0005D\u0000\u0000\u0200\u0201\u0005\u0006\u0000\u0000\u0201"+
		"\u0202\u0007\u0006\u0000\u0000\u0202\u0203\u0005\u0007\u0000\u0000\u0203"+
		"K\u0001\u0000\u0000\u0000\u0204\u0208\u0003V+\u0000\u0205\u0208\u0003"+
		"X,\u0000\u0206\u0208\u0003\\.\u0000\u0207\u0204\u0001\u0000\u0000\u0000"+
		"\u0207\u0205\u0001\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000"+
		"\u0208M\u0001\u0000\u0000\u0000\u0209\u020a\u0005<\u0000\u0000\u020a\u020b"+
		"\u0005\f\u0000\u0000\u020b\u020c\u0003P(\u0000\u020cO\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005=\u0000\u0000\u020e\u020f\u0005\u0016\u0000\u0000"+
		"\u020f\u0210\u0005\u001e\u0000\u0000\u0210\u0211\u0005\u0006\u0000\u0000"+
		"\u0211\u0212\u0003d2\u0000\u0212\u0213\u0005\u0007\u0000\u0000\u0213Q"+
		"\u0001\u0000\u0000\u0000\u0214\u0215\u0005@\u0000\u0000\u0215\u0216\u0005"+
		"\f\u0000\u0000\u0216\u0217\u0005\u0006\u0000\u0000\u0217\u0218\u0005\u0007"+
		"\u0000\u0000\u0218\u021d\u0005\u0002\u0000\u0000\u0219\u021c\u0003t:\u0000"+
		"\u021a\u021c\u0003T*\u0000\u021b\u0219\u0001\u0000\u0000\u0000\u021b\u021a"+
		"\u0001\u0000\u0000\u0000\u021c\u021f\u0001\u0000\u0000\u0000\u021d\u021b"+
		"\u0001\u0000\u0000\u0000\u021d\u021e\u0001\u0000\u0000\u0000\u021e\u0220"+
		"\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u0220\u0221"+
		"\u0005\u0003\u0000\u0000\u0221\u0222\u0005\u000b\u0000\u0000\u0222S\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0005\'\u0000\u0000\u0224\u0225\u0005\u0006"+
		"\u0000\u0000\u0225\u0226\u0005\u0006\u0000\u0000\u0226\u0227\u0005\u0007"+
		"\u0000\u0000\u0227\u022b\u0005\u0002\u0000\u0000\u0228\u022a\u0003t:\u0000"+
		"\u0229\u0228\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000"+
		"\u022b\u0229\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000"+
		"\u022c\u022e\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000"+
		"\u022e\u022f\u0005\u0003\u0000\u0000\u022f\u0230\u0005\u0007\u0000\u0000"+
		"\u0230\u0231\u0005\n\u0000\u0000\u0231U\u0001\u0000\u0000\u0000\u0232"+
		"\u0233\u00054\u0000\u0000\u0233\u0234\u0005\f\u0000\u0000\u0234\u0235"+
		"\u0003d2\u0000\u0235W\u0001\u0000\u0000\u0000\u0236\u0237\u00053\u0000"+
		"\u0000\u0237\u0238\u0005\f\u0000\u0000\u0238\u0239\u0003d2\u0000\u0239"+
		"Y\u0001\u0000\u0000\u0000\u023a\u023b\u00059\u0000\u0000\u023b\u023c\u0005"+
		"\f\u0000\u0000\u023c\u023d\u0005K\u0000\u0000\u023d\u023e\u0005\u0006"+
		"\u0000\u0000\u023e\u023f\u0005\u0007\u0000\u0000\u023f[\u0001\u0000\u0000"+
		"\u0000\u0240\u0241\u00052\u0000\u0000\u0241\u0242\u0005\f\u0000\u0000"+
		"\u0242\u0243\u00038\u001c\u0000\u0243]\u0001\u0000\u0000\u0000\u0244\u0245"+
		"\u0005E\u0000\u0000\u0245\u0246\u0005\f\u0000\u0000\u0246\u024f\u0005"+
		"\b\u0000\u0000\u0247\u024c\u00038\u001c\u0000\u0248\u0249\u0005\u000b"+
		"\u0000\u0000\u0249\u024b\u00038\u001c\u0000\u024a\u0248\u0001\u0000\u0000"+
		"\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001\u0000\u0000"+
		"\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u0250\u0001\u0000\u0000"+
		"\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024f\u0247\u0001\u0000\u0000"+
		"\u0000\u024f\u0250\u0001\u0000\u0000\u0000\u0250\u0252\u0001\u0000\u0000"+
		"\u0000\u0251\u0253\u0005\u000b\u0000\u0000\u0252\u0251\u0001\u0000\u0000"+
		"\u0000\u0252\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0001\u0000\u0000"+
		"\u0000\u0254\u0255\u0005\t\u0000\u0000\u0255_\u0001\u0000\u0000\u0000"+
		"\u0256\u0257\u0005B\u0000\u0000\u0257\u0258\u0005\f\u0000\u0000\u0258"+
		"\u0259\u00038\u001c\u0000\u0259a\u0001\u0000\u0000\u0000\u025a\u025b\u0005"+
		")\u0000\u0000\u025b\u025c\u0005K\u0000\u0000\u025cc\u0001\u0000\u0000"+
		"\u0000\u025d\u025e\u0005M\u0000\u0000\u025ee\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0005L\u0000\u0000\u0260g\u0001\u0000\u0000\u0000\u0261\u0262\u0005"+
		"$\u0000\u0000\u0262\u0263\u0005\u0006\u0000\u0000\u0263\u0264\u0003.\u0017"+
		"\u0000\u0264\u0265\u0005\u0007\u0000\u0000\u0265\u026a\u0003l6\u0000\u0266"+
		"\u0267\u00056\u0000\u0000\u0267\u0269\u0003l6\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268\u0001"+
		"\u0000\u0000\u0000\u026a\u026b\u0001\u0000\u0000\u0000\u026b\u026f\u0001"+
		"\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u026e\u0005"+
		"7\u0000\u0000\u026e\u0270\u0003l6\u0000\u026f\u026d\u0001\u0000\u0000"+
		"\u0000\u026f\u0270\u0001\u0000\u0000\u0000\u0270i\u0001\u0000\u0000\u0000"+
		"\u0271\u0272\u0005%\u0000\u0000\u0272\u0273\u0005\u0006\u0000\u0000\u0273"+
		"\u0274\u0003.\u0017\u0000\u0274\u0275\u0005\u0007\u0000\u0000\u0275\u0276"+
		"\u0003l6\u0000\u0276k\u0001\u0000\u0000\u0000\u0277\u027b\u0005\u0002"+
		"\u0000\u0000\u0278\u027a\u0003t:\u0000\u0279\u0278\u0001\u0000\u0000\u0000"+
		"\u027a\u027d\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000\u0000"+
		"\u027b\u027c\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000\u0000"+
		"\u027d\u027b\u0001\u0000\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000"+
		"\u027fm\u0001\u0000\u0000\u0000\u0280\u0282\u0005#\u0000\u0000\u0281\u0280"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283"+
		"\u0001\u0000\u0000\u0000\u0283\u0286\u0003p8\u0000\u0284\u0286\u0005#"+
		"\u0000\u0000\u0285\u0281\u0001\u0000\u0000\u0000\u0285\u0284\u0001\u0000"+
		"\u0000\u0000\u0286\u0287\u0001\u0000\u0000\u0000\u0287\u0288\u0005K\u0000"+
		"\u0000\u0288\u028a\u0005\u0006\u0000\u0000\u0289\u028b\u0003r9\u0000\u028a"+
		"\u0289\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000\u028b"+
		"\u028c\u0001\u0000\u0000\u0000\u028c\u028d\u0005\u0007\u0000\u0000\u028d"+
		"\u028e\u0003l6\u0000\u028eo\u0001\u0000\u0000\u0000\u028f\u0290\u0007"+
		"\u0007\u0000\u0000\u0290q\u0001\u0000\u0000\u0000\u0291\u0296\u0003\u0018"+
		"\f\u0000\u0292\u0293\u0005\u000b\u0000\u0000\u0293\u0295\u0003\u0018\f"+
		"\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0295\u0298\u0001\u0000\u0000"+
		"\u0000\u0296\u0294\u0001\u0000\u0000\u0000\u0296\u0297\u0001\u0000\u0000"+
		"\u0000\u0297\u029a\u0001\u0000\u0000\u0000\u0298\u0296\u0001\u0000\u0000"+
		"\u0000\u0299\u029b\u0005\u000b\u0000\u0000\u029a\u0299\u0001\u0000\u0000"+
		"\u0000\u029a\u029b\u0001\u0000\u0000\u0000\u029bs\u0001\u0000\u0000\u0000"+
		"\u029c\u02a1\u0003\u0018\f\u0000\u029d\u02a1\u0003h4\u0000\u029e\u02a1"+
		"\u0003j5\u0000\u029f\u02a1\u0003n7\u0000\u02a0\u029c\u0001\u0000\u0000"+
		"\u0000\u02a0\u029d\u0001\u0000\u0000\u0000\u02a0\u029e\u0001\u0000\u0000"+
		"\u0000\u02a0\u029f\u0001\u0000\u0000\u0000\u02a1u\u0001\u0000\u0000\u0000"+
		"\u02a2\u02a3\u0005&\u0000\u0000\u02a3\u02a6\u0005\u0006\u0000\u0000\u02a4"+
		"\u02a7\u0003\u001c\u000e\u0000\u02a5\u02a7\u0003\u001e\u000f\u0000\u02a6"+
		"\u02a4\u0001\u0000\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a7"+
		"\u02a8\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005\n\u0000\u0000\u02a9\u02aa"+
		"\u0003.\u0017\u0000\u02aa\u02ad\u0005\n\u0000\u0000\u02ab\u02ae\u0003"+
		"\u001c\u000e\u0000\u02ac\u02ae\u0003\u001e\u000f\u0000\u02ad\u02ab\u0001"+
		"\u0000\u0000\u0000\u02ad\u02ac\u0001\u0000\u0000\u0000\u02ae\u02af\u0001"+
		"\u0000\u0000\u0000\u02af\u02b0\u0005\u0007\u0000\u0000\u02b0\u02b1\u0003"+
		"l6\u0000\u02b1w\u0001\u0000\u0000\u0000Hz|\u0082\u008a\u0096\u00a6\u00b7"+
		"\u00c8\u00e2\u00ed\u00f0\u00f6\u00fb\u0100\u0103\u0108\u010b\u0110\u0113"+
		"\u0118\u011f\u0127\u012f\u0134\u0139\u013d\u0145\u014b\u0150\u0156\u0160"+
		"\u0163\u0166\u016f\u0179\u017c\u017f\u0188\u0192\u0195\u0198\u01a6\u01ac"+
		"\u01ba\u01bd\u01c5\u01cd\u01d5\u01de\u01e5\u01eb\u01ef\u01f7\u01fb\u0207"+
		"\u021b\u021d\u022b\u024c\u024f\u0252\u026a\u026f\u027b\u0281\u0285\u028a"+
		"\u0296\u029a\u02a0\u02a6\u02ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}