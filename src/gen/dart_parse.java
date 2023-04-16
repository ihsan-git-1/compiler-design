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
		CLASS=1, FOR=2, IF=3, ELSEIF=4, ELSE=5, WHILE=6, CRLY_BRKT_OP=7, CRLY_BRKT_CL=8, 
		ANGLE_BRKT_OP=9, ANGLE_BRKT_CL=10, BRKT_OP=11, BRKT_CL=12, SQR_BRKT_OP=13, 
		SQR_BRKT_CL=14, SEMICOLON=15, COMMA=16, COLON=17, DOT=18, PLUS=19, MINUS=20, 
		MULTY=21, DIVIDE=22, MOD=23, EQUAL=24, ASSIGN=25, NOTEQUAL=26, GTE=27, 
		LTE=28, AND=29, OR=30, INC=31, DEC=32, NOT=33, NULL=34, INT=35, STRING=36, 
		BOOL=37, DOUBLE=38, LIST=39, EXTENDS=40, RETURN=41, ALL=42, FINAL=43, 
		CONST=44, VAR=45, VOID=46, FUNCTION=47, SETSTATE=48, STRING_LINE=49, BUILDCONTEXT=50, 
		STATE=51, CREATE=52, CREATESTATE=53, WIDGET=54, BUILD=55, CONTAINER=56, 
		EXPANDED=57, MATERIALBUTTON=58, CHILD=59, WIDTH=60, HEIGHT=61, COLOR=62, 
		MATERIALAPP=63, HOME=64, SCAFFOLD=65, PADDING=66, PADDINGSMALL=67, EDGEINSETS=68, 
		ROW=69, COLUMN=70, ONPRESSED=71, IMAGE=72, BODY=73, TEXT=74, NETWORK=75, 
		CHILDREN=76, DYNAMIC=77, STATEFULL=78, STATELESS=79, TRUE=80, FALSE=81, 
		NAME=82, NUMBERDOUBLE=83, NUMBER=84, COMMENT=85, OVERRIDE=86, PRIVATE=87, 
		WS=88;
	public static final int
		RULE_topTreeDeclaration = 0, RULE_allClassesDeclaration = 1, RULE_classDeclaration = 2, 
		RULE_statelessClassDeclaration = 3, RULE_statefullClassDeclaration = 4, 
		RULE_stfulFirstBody = 5, RULE_stfulSecondBody = 6, RULE_statefullAssignStateClassDeclaration = 7, 
		RULE_returnStateTypes = 8, RULE_functionReturnState = 9, RULE_returnArrowState = 10, 
		RULE_buildMethodDeclaration = 11, RULE_dartDeclaration = 12, RULE_variable = 13, 
		RULE_integerDeclaration = 14, RULE_doubleDeclaration = 15, RULE_stringDeclaration = 16, 
		RULE_boolDeclaration = 17, RULE_addExpression = 18, RULE_multiplyExpression = 19, 
		RULE_addDoubleExpression = 20, RULE_multiplyDoubleExpression = 21, RULE_booleans = 22, 
		RULE_booleanOperation = 23, RULE_dartAllListsDeclaration = 24, RULE_dartListStringDeclaration = 25, 
		RULE_dartListIntDeclaration = 26, RULE_dartListBoolDeclaration = 27, RULE_widgetsDeclaration = 28, 
		RULE_expandedDeclaration = 29, RULE_paddingDeclaration = 30, RULE_scaffoldDeclaration = 31, 
		RULE_textDeclaration = 32, RULE_materialAppDeclaration = 33, RULE_materialButtonDeclaration = 34, 
		RULE_conatinerDeclaration = 35, RULE_rowColumnDeclaration = 36, RULE_imageDeclaration = 37, 
		RULE_conatinerPropertiesDeclaration = 38, RULE_paddingPropertyDeclaration = 39, 
		RULE_edgeInsistAll = 40, RULE_onPressedPropertyDeclaration = 41, RULE_setStatePressedDeclaration = 42, 
		RULE_heightPropertyDeclaration = 43, RULE_widthPropertyDeclaration = 44, 
		RULE_homePropertyDeclaration = 45, RULE_childPropertyDeclaration = 46, 
		RULE_childrenPropertyDeclaration = 47, RULE_bodyPropertyDeclaration = 48, 
		RULE_buildContextDeclaration = 49, RULE_number = 50, RULE_numberDouble = 51, 
		RULE_ifStatement = 52, RULE_whileStatement = 53, RULE_block = 54, RULE_function = 55, 
		RULE_functionType = 56, RULE_parameters = 57, RULE_statement = 58, RULE_forStatement = 59, 
		RULE_forInit = 60, RULE_expressionList = 61, RULE_conditionExpr = 62, 
		RULE_logicalExpression = 63, RULE_binaryExpr = 64, RULE_term = 65, RULE_prefixUnaryOperator = 66, 
		RULE_postfixUnaryOperator = 67, RULE_expression = 68, RULE_literal = 69, 
		RULE_identifier = 70, RULE_functionCall = 71, RULE_arguments = 72;
	private static String[] makeRuleNames() {
		return new String[] {
			"topTreeDeclaration", "allClassesDeclaration", "classDeclaration", "statelessClassDeclaration", 
			"statefullClassDeclaration", "stfulFirstBody", "stfulSecondBody", "statefullAssignStateClassDeclaration", 
			"returnStateTypes", "functionReturnState", "returnArrowState", "buildMethodDeclaration", 
			"dartDeclaration", "variable", "integerDeclaration", "doubleDeclaration", 
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
			"block", "function", "functionType", "parameters", "statement", "forStatement", 
			"forInit", "expressionList", "conditionExpr", "logicalExpression", "binaryExpr", 
			"term", "prefixUnaryOperator", "postfixUnaryOperator", "expression", 
			"literal", "identifier", "functionCall", "arguments"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'for'", "'if'", "'else if'", "'else'", "'while'", "'{'", 
			"'}'", "'<'", "'>'", "'('", "')'", "'['", "']'", "';'", "','", "':'", 
			"'.'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'='", "'!='", "'>='", 
			"'<='", "'&&'", "'||'", "'++'", "'--'", "'!'", "'null'", "'int'", "'String'", 
			"'bool'", "'double'", "'List'", "'extends'", "'return'", "'all'", "'final'", 
			"'const'", "'var'", "'void'", "'Function'", "'setState'", null, "'BuildContext'", 
			"'State'", "'create'", "'createState'", "'Widget'", "'build'", "'Container'", 
			"'Expanded'", "'MaterialButton'", "'child'", "'width'", "'height'", "'color'", 
			"'MaterialApp'", "'home'", "'Scaffold'", "'Padding'", "'padding'", "'EdgeInsets'", 
			"'Row'", "'Column'", "'onPressed'", "'Image'", "'body'", "'Text'", "'network'", 
			"'children'", "'dynamic'", null, null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "FOR", "IF", "ELSEIF", "ELSE", "WHILE", "CRLY_BRKT_OP", 
			"CRLY_BRKT_CL", "ANGLE_BRKT_OP", "ANGLE_BRKT_CL", "BRKT_OP", "BRKT_CL", 
			"SQR_BRKT_OP", "SQR_BRKT_CL", "SEMICOLON", "COMMA", "COLON", "DOT", "PLUS", 
			"MINUS", "MULTY", "DIVIDE", "MOD", "EQUAL", "ASSIGN", "NOTEQUAL", "GTE", 
			"LTE", "AND", "OR", "INC", "DEC", "NOT", "NULL", "INT", "STRING", "BOOL", 
			"DOUBLE", "LIST", "EXTENDS", "RETURN", "ALL", "FINAL", "CONST", "VAR", 
			"VOID", "FUNCTION", "SETSTATE", "STRING_LINE", "BUILDCONTEXT", "STATE", 
			"CREATE", "CREATESTATE", "WIDGET", "BUILD", "CONTAINER", "EXPANDED", 
			"MATERIALBUTTON", "CHILD", "WIDTH", "HEIGHT", "COLOR", "MATERIALAPP", 
			"HOME", "SCAFFOLD", "PADDING", "PADDINGSMALL", "EDGEINSETS", "ROW", "COLUMN", 
			"ONPRESSED", "IMAGE", "BODY", "TEXT", "NETWORK", "CHILDREN", "DYNAMIC", 
			"STATEFULL", "STATELESS", "TRUE", "FALSE", "NAME", "NUMBERDOUBLE", "NUMBER", 
			"COMMENT", "OVERRIDE", "PRIVATE", "WS"
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
		public List<DartDeclarationContext> dartDeclaration() {
			return getRuleContexts(DartDeclarationContext.class);
		}
		public DartDeclarationContext dartDeclaration(int i) {
			return getRuleContext(DartDeclarationContext.class,i);
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
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 273744035577858L) != 0 || _la==NAME) {
				{
				setState(148);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(146);
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
					setState(147);
					dartDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(152);
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
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				statefullClassDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(155);
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
		public List<DartDeclarationContext> dartDeclaration() {
			return getRuleContexts(DartDeclarationContext.class);
		}
		public DartDeclarationContext dartDeclaration(int i) {
			return getRuleContext(DartDeclarationContext.class,i);
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
			setState(158);
			match(CLASS);
			setState(159);
			match(NAME);
			setState(160);
			match(CRLY_BRKT_OP);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 140737488363295L) != 0) {
				{
				{
				setState(161);
				dartDeclaration();
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(167);
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
		public List<DartDeclarationContext> dartDeclaration() {
			return getRuleContexts(DartDeclarationContext.class);
		}
		public DartDeclarationContext dartDeclaration(int i) {
			return getRuleContext(DartDeclarationContext.class,i);
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
			setState(169);
			match(CLASS);
			setState(170);
			match(NAME);
			setState(171);
			match(STATELESS);
			setState(172);
			match(CRLY_BRKT_OP);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 140737488363295L) != 0) {
				{
				{
				setState(173);
				dartDeclaration();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			buildMethodDeclaration();
			setState(180);
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
			setState(182);
			stfulFirstBody();
			setState(183);
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
		public List<DartDeclarationContext> dartDeclaration() {
			return getRuleContexts(DartDeclarationContext.class);
		}
		public DartDeclarationContext dartDeclaration(int i) {
			return getRuleContext(DartDeclarationContext.class,i);
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
			setState(185);
			match(CLASS);
			setState(186);
			match(NAME);
			setState(187);
			match(STATEFULL);
			setState(188);
			match(CRLY_BRKT_OP);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 140737488363295L) != 0) {
				{
				{
				setState(189);
				dartDeclaration();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			statefullAssignStateClassDeclaration();
			setState(196);
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
		public List<DartDeclarationContext> dartDeclaration() {
			return getRuleContexts(DartDeclarationContext.class);
		}
		public DartDeclarationContext dartDeclaration(int i) {
			return getRuleContext(DartDeclarationContext.class,i);
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
			setState(198);
			match(CLASS);
			setState(199);
			match(NAME);
			setState(200);
			match(EXTENDS);
			setState(201);
			match(STATE);
			setState(202);
			match(ANGLE_BRKT_OP);
			setState(203);
			match(NAME);
			setState(204);
			match(ANGLE_BRKT_CL);
			setState(205);
			match(CRLY_BRKT_OP);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 140737488363295L) != 0) {
				{
				{
				setState(206);
				dartDeclaration();
				}
				}
				setState(211);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(212);
			buildMethodDeclaration();
			setState(213);
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
			setState(215);
			match(STATE);
			setState(216);
			match(ANGLE_BRKT_OP);
			setState(217);
			match(NAME);
			setState(218);
			match(ANGLE_BRKT_CL);
			setState(219);
			match(CREATESTATE);
			setState(220);
			match(BRKT_OP);
			setState(221);
			match(BRKT_CL);
			setState(222);
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				returnArrowState();
				}
				break;
			case CRLY_BRKT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
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
			setState(228);
			match(CRLY_BRKT_OP);
			setState(229);
			match(RETURN);
			setState(230);
			match(NAME);
			setState(231);
			match(BRKT_OP);
			setState(232);
			match(BRKT_CL);
			setState(233);
			match(SEMICOLON);
			setState(234);
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
			setState(236);
			match(ASSIGN);
			setState(237);
			match(ANGLE_BRKT_CL);
			setState(238);
			match(NAME);
			setState(239);
			match(BRKT_OP);
			setState(240);
			match(BRKT_CL);
			setState(241);
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
		public List<DartDeclarationContext> dartDeclaration() {
			return getRuleContexts(DartDeclarationContext.class);
		}
		public DartDeclarationContext dartDeclaration(int i) {
			return getRuleContext(DartDeclarationContext.class,i);
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
			setState(243);
			match(WIDGET);
			setState(244);
			match(BUILD);
			setState(245);
			match(BRKT_OP);
			setState(246);
			buildContextDeclaration();
			setState(247);
			match(BRKT_CL);
			setState(248);
			match(CRLY_BRKT_OP);
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 140737488363295L) != 0) {
				{
				{
				setState(249);
				dartDeclaration();
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(255);
			match(RETURN);
			setState(256);
			widgetsDeclaration();
			setState(257);
			match(SEMICOLON);
			setState(258);
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
	public static class DartDeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public DartAllListsDeclarationContext dartAllListsDeclaration() {
			return getRuleContext(DartAllListsDeclarationContext.class,0);
		}
		public DartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dartDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDartDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDartDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DartDeclarationContext dartDeclaration() throws RecognitionException {
		DartDeclarationContext _localctx = new DartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dartDeclaration);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
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
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==CONST) {
				{
				setState(265);
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

			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(268);
				integerDeclaration();
				}
				break;
			case 2:
				{
				setState(269);
				stringDeclaration();
				}
				break;
			case 3:
				{
				setState(270);
				boolDeclaration();
				}
				break;
			case 4:
				{
				setState(271);
				doubleDeclaration();
				}
				break;
			}
			setState(274);
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
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(276);
				match(INT);
				}
			}

			setState(279);
			match(NAME);
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(280);
				match(ASSIGN);
				setState(281);
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
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOUBLE) {
				{
				setState(284);
				match(DOUBLE);
				}
			}

			setState(287);
			match(NAME);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(288);
				match(ASSIGN);
				setState(289);
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
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(292);
				match(STRING);
				}
			}

			setState(295);
			match(NAME);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(296);
				match(ASSIGN);
				setState(297);
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
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BOOL) {
				{
				setState(300);
				match(BOOL);
				}
			}

			setState(303);
			match(NAME);
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(304);
				match(ASSIGN);
				setState(305);
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
			setState(308);
			multiplyExpression();
			setState(313);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(309);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(310);
				multiplyExpression();
				}
				}
				setState(315);
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
			setState(316);
			number();
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(317);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(318);
				number();
				}
				}
				setState(323);
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
			setState(324);
			multiplyDoubleExpression();
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(325);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(326);
				multiplyDoubleExpression();
				}
				}
				setState(331);
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
			setState(334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(332);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(333);
				numberDouble();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(336);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(337);
					number();
					}
					break;
				case NUMBERDOUBLE:
					{
					setState(338);
					numberDouble();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(345);
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
		public BooleanOperationContext booleanOperation() {
			return getRuleContext(BooleanOperationContext.class,0);
		}
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
		try {
			setState(349);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(FALSE);
				}
				break;
			case NAME:
			case NUMBERDOUBLE:
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				booleanOperation();
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
	public static class BooleanOperationContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(dart_parse.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(dart_parse.NOTEQUAL, 0); }
		public TerminalNode ANGLE_BRKT_CL() { return getToken(dart_parse.ANGLE_BRKT_CL, 0); }
		public TerminalNode ANGLE_BRKT_OP() { return getToken(dart_parse.ANGLE_BRKT_OP, 0); }
		public TerminalNode GTE() { return getToken(dart_parse.GTE, 0); }
		public TerminalNode LTE() { return getToken(dart_parse.LTE, 0); }
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
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(351);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(352);
				numberDouble();
				}
				break;
			case NAME:
				{
				setState(353);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(356);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 486540800L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(357);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(358);
				numberDouble();
				}
				break;
			case NAME:
				{
				setState(359);
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
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				dartListStringDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				dartListIntDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
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
			setState(367);
			match(LIST);
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(368);
				match(ANGLE_BRKT_OP);
				setState(369);
				match(STRING);
				setState(370);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(373);
			match(NAME);
			setState(374);
			match(ASSIGN);
			setState(375);
			match(SQR_BRKT_OP);
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LINE) {
				{
				setState(376);
				match(STRING_LINE);
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(377);
						match(COMMA);
						setState(378);
						match(STRING_LINE);
						}
						} 
					}
					setState(383);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				}
			}

			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(386);
				match(COMMA);
				}
			}

			setState(389);
			match(SQR_BRKT_CL);
			setState(390);
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
			setState(392);
			match(LIST);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(393);
				match(ANGLE_BRKT_OP);
				setState(394);
				match(INT);
				setState(395);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(398);
			match(NAME);
			setState(399);
			match(ASSIGN);
			setState(400);
			match(SQR_BRKT_OP);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(401);
				number();
				setState(406);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(402);
						match(COMMA);
						setState(403);
						number();
						}
						} 
					}
					setState(408);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
			}

			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(411);
				match(COMMA);
				}
			}

			setState(414);
			match(SQR_BRKT_CL);
			setState(415);
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
			setState(417);
			match(LIST);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(418);
				match(ANGLE_BRKT_OP);
				setState(419);
				match(BOOL);
				setState(420);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(423);
			match(NAME);
			setState(424);
			match(ASSIGN);
			setState(425);
			match(SQR_BRKT_OP);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 31L) != 0) {
				{
				setState(426);
				booleans();
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(427);
						match(COMMA);
						setState(428);
						booleans();
						}
						} 
					}
					setState(433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				}
			}

			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(436);
				match(COMMA);
				}
			}

			setState(439);
			match(SQR_BRKT_CL);
			setState(440);
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
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				conatinerDeclaration();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				expandedDeclaration();
				}
				break;
			case MATERIALBUTTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				materialButtonDeclaration();
				}
				break;
			case MATERIALAPP:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				materialAppDeclaration();
				}
				break;
			case SCAFFOLD:
				enterOuterAlt(_localctx, 5);
				{
				setState(446);
				scaffoldDeclaration();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(447);
				paddingDeclaration();
				}
				break;
			case ROW:
			case COLUMN:
				enterOuterAlt(_localctx, 7);
				{
				setState(448);
				rowColumnDeclaration();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(449);
				textDeclaration();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(450);
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
			setState(453);
			match(EXPANDED);
			setState(454);
			match(BRKT_OP);
			setState(455);
			childPropertyDeclaration();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(456);
				match(COMMA);
				}
			}

			setState(459);
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
			setState(461);
			match(PADDING);
			setState(462);
			match(BRKT_OP);
			setState(471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGSMALL:
				{
				{
				setState(463);
				paddingPropertyDeclaration();
				setState(464);
				match(COMMA);
				setState(465);
				childPropertyDeclaration();
				}
				}
				break;
			case CHILD:
				{
				{
				setState(467);
				childPropertyDeclaration();
				setState(468);
				match(COMMA);
				setState(469);
				paddingPropertyDeclaration();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(473);
				match(COMMA);
				}
			}

			setState(476);
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
			setState(478);
			match(SCAFFOLD);
			setState(479);
			match(BRKT_OP);
			setState(480);
			bodyPropertyDeclaration();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(481);
				match(COMMA);
				}
			}

			setState(484);
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
			setState(486);
			match(TEXT);
			setState(487);
			match(BRKT_OP);
			setState(488);
			match(STRING_LINE);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(489);
				match(COMMA);
				}
			}

			setState(492);
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
			setState(494);
			match(MATERIALAPP);
			setState(495);
			match(BRKT_OP);
			setState(496);
			homePropertyDeclaration();
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(497);
				match(COMMA);
				}
			}

			setState(500);
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
			setState(502);
			match(MATERIALBUTTON);
			setState(503);
			match(BRKT_OP);
			setState(504);
			onPressedPropertyDeclaration();
			setState(505);
			childPropertyDeclaration();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(506);
				match(COMMA);
				}
			}

			setState(509);
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
			setState(511);
			match(CONTAINER);
			setState(512);
			match(BRKT_OP);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 4035225266123964416L) != 0) {
				{
				setState(513);
				conatinerPropertiesDeclaration();
				}
			}

			setState(520);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(516);
					match(COMMA);
					setState(517);
					conatinerPropertiesDeclaration();
					}
					} 
				}
				setState(522);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(523);
				match(COMMA);
				}
			}

			setState(526);
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
			setState(528);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==COLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(529);
			match(BRKT_OP);
			setState(530);
			childrenPropertyDeclaration();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(531);
				match(COMMA);
				}
			}

			setState(534);
			match(BRKT_CL);
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(535);
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
			setState(538);
			match(IMAGE);
			setState(539);
			match(DOT);
			setState(540);
			match(NETWORK);
			setState(541);
			match(BRKT_OP);
			setState(542);
			_la = _input.LA(1);
			if ( !(_la==STRING_LINE || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(543);
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
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				heightPropertyDeclaration();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(546);
				widthPropertyDeclaration();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(547);
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
			setState(550);
			match(PADDINGSMALL);
			setState(551);
			match(COLON);
			setState(552);
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
			setState(554);
			match(EDGEINSETS);
			setState(555);
			match(DOT);
			setState(556);
			match(ALL);
			setState(557);
			match(BRKT_OP);
			setState(558);
			number();
			setState(559);
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
			setState(561);
			match(ONPRESSED);
			setState(562);
			match(COLON);
			setState(563);
			match(BRKT_OP);
			setState(564);
			match(BRKT_CL);
			setState(565);
			match(CRLY_BRKT_OP);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 555219012288588L) != 0 || _la==NAME) {
				{
				setState(568);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FOR:
				case IF:
				case WHILE:
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
					setState(566);
					statement();
					}
					break;
				case SETSTATE:
					{
					setState(567);
					setStatePressedDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(573);
			match(CRLY_BRKT_CL);
			setState(574);
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
			setState(576);
			match(SETSTATE);
			setState(577);
			match(BRKT_OP);
			setState(578);
			match(BRKT_OP);
			setState(579);
			match(BRKT_CL);
			setState(580);
			match(CRLY_BRKT_OP);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 273744035577932L) != 0 || _la==NAME) {
				{
				{
				setState(581);
				statement();
				}
				}
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(587);
			match(CRLY_BRKT_CL);
			setState(588);
			match(BRKT_CL);
			setState(589);
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
			setState(591);
			match(HEIGHT);
			setState(592);
			match(COLON);
			setState(593);
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
			setState(595);
			match(WIDTH);
			setState(596);
			match(COLON);
			setState(597);
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
			setState(599);
			match(HOME);
			setState(600);
			match(COLON);
			setState(601);
			match(NAME);
			setState(602);
			match(BRKT_OP);
			setState(603);
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
			setState(605);
			match(CHILD);
			setState(606);
			match(COLON);
			setState(607);
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
			setState(609);
			match(CHILDREN);
			setState(610);
			match(COLON);
			setState(611);
			match(SQR_BRKT_OP);
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & 353927L) != 0) {
				{
				setState(612);
				widgetsDeclaration();
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(613);
						match(COMMA);
						setState(614);
						widgetsDeclaration();
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
			}

			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(622);
				match(COMMA);
				}
			}

			setState(625);
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
			setState(627);
			match(BODY);
			setState(628);
			match(COLON);
			setState(629);
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
			setState(631);
			match(BUILDCONTEXT);
			setState(632);
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
			setState(634);
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
			setState(636);
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
		public List<TerminalNode> BRKT_OP() { return getTokens(dart_parse.BRKT_OP); }
		public TerminalNode BRKT_OP(int i) {
			return getToken(dart_parse.BRKT_OP, i);
		}
		public List<ConditionExprContext> conditionExpr() {
			return getRuleContexts(ConditionExprContext.class);
		}
		public ConditionExprContext conditionExpr(int i) {
			return getRuleContext(ConditionExprContext.class,i);
		}
		public List<TerminalNode> BRKT_CL() { return getTokens(dart_parse.BRKT_CL); }
		public TerminalNode BRKT_CL(int i) {
			return getToken(dart_parse.BRKT_CL, i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(dart_parse.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(dart_parse.ELSE, i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(dart_parse.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(dart_parse.ELSEIF, i);
		}
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
			setState(638);
			match(IF);
			setState(639);
			match(BRKT_OP);
			setState(640);
			conditionExpr();
			setState(641);
			match(BRKT_CL);
			setState(642);
			block();
			setState(656);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(651);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(643);
					match(ELSEIF);
					setState(644);
					match(BRKT_OP);
					setState(645);
					conditionExpr();
					setState(646);
					match(BRKT_CL);
					setState(647);
					block();
					}
					}
					setState(653);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(654);
				match(ELSE);
				setState(655);
				block();
				}
				}
				break;
			}
			setState(660);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(658);
				match(ELSE);
				setState(659);
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
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
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
			setState(662);
			match(WHILE);
			setState(663);
			match(BRKT_OP);
			setState(664);
			conditionExpr();
			setState(665);
			match(BRKT_CL);
			setState(666);
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
			setState(668);
			match(CRLY_BRKT_OP);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 273744035577932L) != 0 || _la==NAME) {
				{
				{
				setState(669);
				statement();
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
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
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				{
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(677);
					match(FUNCTION);
					}
				}

				setState(680);
				functionType();
				}
				}
				break;
			case 2:
				{
				setState(681);
				match(FUNCTION);
				}
				break;
			}
			setState(684);
			match(NAME);
			setState(685);
			match(BRKT_OP);
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la - 35)) & ~0x3f) == 0 && ((1L << (_la - 35)) & 140737488363295L) != 0) {
				{
				setState(686);
				parameters();
				}
			}

			setState(689);
			match(BRKT_CL);
			setState(690);
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
			setState(692);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 106068512342016L) != 0) ) {
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
		public List<DartDeclarationContext> dartDeclaration() {
			return getRuleContexts(DartDeclarationContext.class);
		}
		public DartDeclarationContext dartDeclaration(int i) {
			return getRuleContext(DartDeclarationContext.class,i);
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
			setState(694);
			dartDeclaration();
			setState(699);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(695);
					match(COMMA);
					setState(696);
					dartDeclaration();
					}
					} 
				}
				setState(701);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			}
			setState(703);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(702);
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
		public DartDeclarationContext dartDeclaration() {
			return getRuleContext(DartDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
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
			setState(710);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(705);
				dartDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(706);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(707);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(708);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(709);
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
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			match(FOR);
			setState(713);
			match(BRKT_OP);
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(714);
				forInit();
				}
				break;
			}
			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRKT_OP || (((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & 31L) != 0) {
				{
				setState(717);
				conditionExpr();
				}
			}

			setState(720);
			match(SEMICOLON);
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(721);
				expressionList();
				}
			}

			setState(724);
			match(BRKT_CL);
			setState(725);
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
	public static class ForInitContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitForInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_forInit);
		try {
			setState(729);
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
				setState(727);
				variable();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(728);
				expressionList();
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
	public static class ExpressionListContext extends ParserRuleContext {
		public List<AddExpressionContext> addExpression() {
			return getRuleContexts(AddExpressionContext.class);
		}
		public AddExpressionContext addExpression(int i) {
			return getRuleContext(AddExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
			addExpression();
			setState(736);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(732);
				match(COMMA);
				setState(733);
				addExpression();
				}
				}
				setState(738);
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
	public static class ConditionExprContext extends ParserRuleContext {
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public ConditionExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterConditionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitConditionExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitConditionExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionExprContext conditionExpr() throws RecognitionException {
		ConditionExprContext _localctx = new ConditionExprContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_conditionExpr);
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(739);
				booleans();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(740);
				logicalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(741);
				match(BRKT_OP);
				setState(742);
				conditionExpr();
				setState(743);
				match(BRKT_CL);
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
	public static class LogicalExpressionContext extends ParserRuleContext {
		public List<BinaryExprContext> binaryExpr() {
			return getRuleContexts(BinaryExprContext.class);
		}
		public BinaryExprContext binaryExpr(int i) {
			return getRuleContext(BinaryExprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(dart_parse.AND); }
		public TerminalNode AND(int i) {
			return getToken(dart_parse.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(dart_parse.OR); }
		public TerminalNode OR(int i) {
			return getToken(dart_parse.OR, i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_logicalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			binaryExpr();
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(748);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(749);
				binaryExpr();
				}
				}
				setState(754);
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
	public static class BinaryExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(dart_parse.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(dart_parse.EQUAL, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(dart_parse.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(dart_parse.NOTEQUAL, i);
		}
		public List<TerminalNode> LTE() { return getTokens(dart_parse.LTE); }
		public TerminalNode LTE(int i) {
			return getToken(dart_parse.LTE, i);
		}
		public List<TerminalNode> GTE() { return getTokens(dart_parse.GTE); }
		public TerminalNode GTE(int i) {
			return getToken(dart_parse.GTE, i);
		}
		public BinaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBinaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBinaryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBinaryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryExprContext binaryExpr() throws RecognitionException {
		BinaryExprContext _localctx = new BinaryExprContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_binaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			term();
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 486539264L) != 0) {
				{
				{
				setState(756);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 486539264L) != 0) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(757);
				term();
				}
				}
				setState(762);
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
	public static class TermContext extends ParserRuleContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public AddDoubleExpressionContext addDoubleExpression() {
			return getRuleContext(AddDoubleExpressionContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_term);
		try {
			setState(765);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(763);
				addExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(764);
				addDoubleExpression();
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
	public static class PrefixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(dart_parse.INC, 0); }
		public TerminalNode DEC() { return getToken(dart_parse.DEC, 0); }
		public TerminalNode NOT() { return getToken(dart_parse.NOT, 0); }
		public PrefixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterPrefixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitPrefixUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitPrefixUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixUnaryOperatorContext prefixUnaryOperator() throws RecognitionException {
		PrefixUnaryOperatorContext _localctx = new PrefixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_prefixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 15032385536L) != 0) ) {
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
	public static class PostfixUnaryOperatorContext extends ParserRuleContext {
		public TerminalNode INC() { return getToken(dart_parse.INC, 0); }
		public TerminalNode DEC() { return getToken(dart_parse.DEC, 0); }
		public PostfixUnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixUnaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterPostfixUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitPostfixUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitPostfixUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixUnaryOperatorContext postfixUnaryOperator() throws RecognitionException {
		PostfixUnaryOperatorContext _localctx = new PostfixUnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_postfixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			_la = _input.LA(1);
			if ( !(_la==INC || _la==DEC) ) {
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
	public static class ExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrefixUnaryOperatorContext prefixUnaryOperator() {
			return getRuleContext(PrefixUnaryOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public PostfixUnaryOperatorContext postfixUnaryOperator() {
			return getRuleContext(PostfixUnaryOperatorContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(772);
				identifier();
				}
				break;
			case 2:
				{
				setState(773);
				prefixUnaryOperator();
				setState(774);
				expression(5);
				}
				break;
			case 3:
				{
				setState(776);
				addExpression();
				setState(777);
				postfixUnaryOperator();
				}
				break;
			case 4:
				{
				setState(779);
				functionCall();
				}
				break;
			case 5:
				{
				setState(780);
				match(BRKT_OP);
				setState(781);
				expression(0);
				setState(782);
				match(BRKT_CL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(786);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(787);
					postfixUnaryOperator();
					}
					} 
				}
				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
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
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dart_parse.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(dart_parse.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(dart_parse.STRING, 0); }
		public TerminalNode TRUE() { return getToken(dart_parse.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(dart_parse.FALSE, 0); }
		public TerminalNode NULL() { return getToken(dart_parse.NULL, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & 211106232533015L) != 0) ) {
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
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(797);
			identifier();
			setState(798);
			match(BRKT_OP);
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((_la) & ~0x3f) == 0 && ((1L << _la) & 15032387584L) != 0 || _la==NAME || _la==NUMBER) {
				{
				setState(799);
				arguments();
				}
			}

			setState(802);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			expression(0);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(805);
				match(COMMA);
				setState(806);
				expression(0);
				}
				}
				setState(811);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 68:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001X\u032d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"7\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007;\u0002"+
		"<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007@\u0002"+
		"A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007E\u0002"+
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0001\u0000\u0001\u0000\u0005\u0000"+
		"\u0095\b\u0000\n\u0000\f\u0000\u0098\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u009d\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u00a3\b\u0002\n\u0002\f\u0002\u00a6\t\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0005\u0003\u00af\b\u0003\n\u0003\f\u0003\u00b2\t\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00bf\b\u0005\n"+
		"\u0005\f\u0005\u00c2\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00d0\b\u0006\n\u0006\f\u0006"+
		"\u00d3\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0003\b\u00e3\b\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00fb\b\u000b\n\u000b"+
		"\f\u000b\u00fe\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0108\b\f\u0001\r\u0003\r"+
		"\u010b\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0111\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0003\u000e\u0116\b\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u011b\b\u000e\u0001\u000f\u0003\u000f\u011e\b\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0123\b\u000f\u0001\u0010"+
		"\u0003\u0010\u0126\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u012b\b\u0010\u0001\u0011\u0003\u0011\u012e\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u0133\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u0138\b\u0012\n\u0012\f\u0012\u013b\t\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0140\b\u0013\n\u0013\f\u0013\u0143"+
		"\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0148\b\u0014"+
		"\n\u0014\f\u0014\u014b\t\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u014f"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0154\b\u0015"+
		"\u0005\u0015\u0156\b\u0015\n\u0015\f\u0015\u0159\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u015e\b\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0163\b\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0003\u0017\u0169\b\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u016e\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u0174\b\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u017c\b\u0019\n\u0019\f\u0019\u017f\t\u0019"+
		"\u0003\u0019\u0181\b\u0019\u0001\u0019\u0003\u0019\u0184\b\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u018d\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u0195\b\u001a\n\u001a\f\u001a"+
		"\u0198\t\u001a\u0003\u001a\u019a\b\u001a\u0001\u001a\u0003\u001a\u019d"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u01a6\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01ae\b\u001b\n"+
		"\u001b\f\u001b\u01b1\t\u001b\u0003\u001b\u01b3\b\u001b\u0001\u001b\u0003"+
		"\u001b\u01b6\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01c4\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0003\u001d\u01ca\b\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01d8\b\u001e\u0001"+
		"\u001e\u0003\u001e\u01db\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01e3\b\u001f\u0001\u001f\u0001"+
		"\u001f\u0001 \u0001 \u0001 \u0001 \u0003 \u01eb\b \u0001 \u0001 \u0001"+
		"!\u0001!\u0001!\u0001!\u0003!\u01f3\b!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01fc\b\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0003#\u0203\b#\u0001#\u0001#\u0005#\u0207\b#\n#\f#\u020a\t#\u0001#"+
		"\u0003#\u020d\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0003$\u0215"+
		"\b$\u0001$\u0001$\u0003$\u0219\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0003&\u0225\b&\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u0239\b)\n)\f)\u023c\t)\u0001"+
		")\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0005*\u0247"+
		"\b*\n*\f*\u024a\t*\u0001*\u0001*\u0001*\u0001*\u0001+\u0001+\u0001+\u0001"+
		"+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001/\u0001"+
		"/\u0005/\u0268\b/\n/\f/\u026b\t/\u0003/\u026d\b/\u0001/\u0003/\u0270\b"+
		"/\u0001/\u0001/\u00010\u00010\u00010\u00010\u00011\u00011\u00011\u0001"+
		"2\u00012\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00054\u028a\b4\n4\f4\u028d\t4\u00014\u0001"+
		"4\u00034\u0291\b4\u00014\u00014\u00034\u0295\b4\u00015\u00015\u00015\u0001"+
		"5\u00015\u00015\u00016\u00016\u00056\u029f\b6\n6\f6\u02a2\t6\u00016\u0001"+
		"6\u00017\u00037\u02a7\b7\u00017\u00017\u00037\u02ab\b7\u00017\u00017\u0001"+
		"7\u00037\u02b0\b7\u00017\u00017\u00017\u00018\u00018\u00019\u00019\u0001"+
		"9\u00059\u02ba\b9\n9\f9\u02bd\t9\u00019\u00039\u02c0\b9\u0001:\u0001:"+
		"\u0001:\u0001:\u0001:\u0003:\u02c7\b:\u0001;\u0001;\u0001;\u0003;\u02cc"+
		"\b;\u0001;\u0003;\u02cf\b;\u0001;\u0001;\u0003;\u02d3\b;\u0001;\u0001"+
		";\u0001;\u0001<\u0001<\u0003<\u02da\b<\u0001=\u0001=\u0001=\u0005=\u02df"+
		"\b=\n=\f=\u02e2\t=\u0001>\u0001>\u0001>\u0001>\u0001>\u0001>\u0003>\u02ea"+
		"\b>\u0001?\u0001?\u0001?\u0005?\u02ef\b?\n?\f?\u02f2\t?\u0001@\u0001@"+
		"\u0001@\u0005@\u02f7\b@\n@\f@\u02fa\t@\u0001A\u0001A\u0003A\u02fe\bA\u0001"+
		"B\u0001B\u0001C\u0001C\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001"+
		"D\u0001D\u0001D\u0001D\u0001D\u0001D\u0001D\u0003D\u0311\bD\u0001D\u0001"+
		"D\u0005D\u0315\bD\nD\fD\u0318\tD\u0001E\u0001E\u0001F\u0001F\u0001G\u0001"+
		"G\u0001G\u0003G\u0321\bG\u0001G\u0001G\u0001H\u0001H\u0001H\u0005H\u0328"+
		"\bH\nH\fH\u032b\tH\u0001H\u0000\u0001\u0088I\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0000\f\u0001\u0000+,\u0001\u0000\u0013\u0014"+
		"\u0001\u0000\u0015\u0016\u0003\u0000\t\n\u0018\u0018\u001a\u001c\u0001"+
		"\u0000EF\u0002\u000011RR\u0002\u0000#&-.\u0001\u0000\u001d\u001e\u0002"+
		"\u0000\u0018\u0018\u001a\u001c\u0001\u0000\u001f!\u0001\u0000\u001f \u0003"+
		"\u0000\"$&&PQ\u034f\u0000\u0096\u0001\u0000\u0000\u0000\u0002\u009c\u0001"+
		"\u0000\u0000\u0000\u0004\u009e\u0001\u0000\u0000\u0000\u0006\u00a9\u0001"+
		"\u0000\u0000\u0000\b\u00b6\u0001\u0000\u0000\u0000\n\u00b9\u0001\u0000"+
		"\u0000\u0000\f\u00c6\u0001\u0000\u0000\u0000\u000e\u00d7\u0001\u0000\u0000"+
		"\u0000\u0010\u00e2\u0001\u0000\u0000\u0000\u0012\u00e4\u0001\u0000\u0000"+
		"\u0000\u0014\u00ec\u0001\u0000\u0000\u0000\u0016\u00f3\u0001\u0000\u0000"+
		"\u0000\u0018\u0107\u0001\u0000\u0000\u0000\u001a\u010a\u0001\u0000\u0000"+
		"\u0000\u001c\u0115\u0001\u0000\u0000\u0000\u001e\u011d\u0001\u0000\u0000"+
		"\u0000 \u0125\u0001\u0000\u0000\u0000\"\u012d\u0001\u0000\u0000\u0000"+
		"$\u0134\u0001\u0000\u0000\u0000&\u013c\u0001\u0000\u0000\u0000(\u0144"+
		"\u0001\u0000\u0000\u0000*\u014e\u0001\u0000\u0000\u0000,\u015d\u0001\u0000"+
		"\u0000\u0000.\u0162\u0001\u0000\u0000\u00000\u016d\u0001\u0000\u0000\u0000"+
		"2\u016f\u0001\u0000\u0000\u00004\u0188\u0001\u0000\u0000\u00006\u01a1"+
		"\u0001\u0000\u0000\u00008\u01c3\u0001\u0000\u0000\u0000:\u01c5\u0001\u0000"+
		"\u0000\u0000<\u01cd\u0001\u0000\u0000\u0000>\u01de\u0001\u0000\u0000\u0000"+
		"@\u01e6\u0001\u0000\u0000\u0000B\u01ee\u0001\u0000\u0000\u0000D\u01f6"+
		"\u0001\u0000\u0000\u0000F\u01ff\u0001\u0000\u0000\u0000H\u0210\u0001\u0000"+
		"\u0000\u0000J\u021a\u0001\u0000\u0000\u0000L\u0224\u0001\u0000\u0000\u0000"+
		"N\u0226\u0001\u0000\u0000\u0000P\u022a\u0001\u0000\u0000\u0000R\u0231"+
		"\u0001\u0000\u0000\u0000T\u0240\u0001\u0000\u0000\u0000V\u024f\u0001\u0000"+
		"\u0000\u0000X\u0253\u0001\u0000\u0000\u0000Z\u0257\u0001\u0000\u0000\u0000"+
		"\\\u025d\u0001\u0000\u0000\u0000^\u0261\u0001\u0000\u0000\u0000`\u0273"+
		"\u0001\u0000\u0000\u0000b\u0277\u0001\u0000\u0000\u0000d\u027a\u0001\u0000"+
		"\u0000\u0000f\u027c\u0001\u0000\u0000\u0000h\u027e\u0001\u0000\u0000\u0000"+
		"j\u0296\u0001\u0000\u0000\u0000l\u029c\u0001\u0000\u0000\u0000n\u02aa"+
		"\u0001\u0000\u0000\u0000p\u02b4\u0001\u0000\u0000\u0000r\u02b6\u0001\u0000"+
		"\u0000\u0000t\u02c6\u0001\u0000\u0000\u0000v\u02c8\u0001\u0000\u0000\u0000"+
		"x\u02d9\u0001\u0000\u0000\u0000z\u02db\u0001\u0000\u0000\u0000|\u02e9"+
		"\u0001\u0000\u0000\u0000~\u02eb\u0001\u0000\u0000\u0000\u0080\u02f3\u0001"+
		"\u0000\u0000\u0000\u0082\u02fd\u0001\u0000\u0000\u0000\u0084\u02ff\u0001"+
		"\u0000\u0000\u0000\u0086\u0301\u0001\u0000\u0000\u0000\u0088\u0310\u0001"+
		"\u0000\u0000\u0000\u008a\u0319\u0001\u0000\u0000\u0000\u008c\u031b\u0001"+
		"\u0000\u0000\u0000\u008e\u031d\u0001\u0000\u0000\u0000\u0090\u0324\u0001"+
		"\u0000\u0000\u0000\u0092\u0095\u0003\u0002\u0001\u0000\u0093\u0095\u0003"+
		"\u0018\f\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0001\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009d\u0003\u0004"+
		"\u0002\u0000\u009a\u009d\u0003\b\u0004\u0000\u009b\u009d\u0003\u0006\u0003"+
		"\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u0003\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u0005\u0001\u0000\u0000\u009f\u00a0\u0005R\u0000\u0000"+
		"\u00a0\u00a4\u0005\u0007\u0000\u0000\u00a1\u00a3\u0003\u0018\f\u0000\u00a2"+
		"\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0005\b\u0000\u0000\u00a8\u0005\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0001\u0000\u0000\u00aa\u00ab\u0005R\u0000\u0000\u00ab\u00ac\u0005"+
		"O\u0000\u0000\u00ac\u00b0\u0005\u0007\u0000\u0000\u00ad\u00af\u0003\u0018"+
		"\f\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0003\u0016\u000b\u0000\u00b4\u00b5\u0005\b\u0000\u0000"+
		"\u00b5\u0007\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\n\u0005\u0000\u00b7"+
		"\u00b8\u0003\f\u0006\u0000\u00b8\t\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0001\u0000\u0000\u00ba\u00bb\u0005R\u0000\u0000\u00bb\u00bc\u0005"+
		"N\u0000\u0000\u00bc\u00c0\u0005\u0007\u0000\u0000\u00bd\u00bf\u0003\u0018"+
		"\f\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c1\u00c3\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0003\u000e\u0007\u0000\u00c4\u00c5\u0005\b\u0000\u0000"+
		"\u00c5\u000b\u0001\u0000\u0000\u0000\u00c6\u00c7\u0005\u0001\u0000\u0000"+
		"\u00c7\u00c8\u0005R\u0000\u0000\u00c8\u00c9\u0005(\u0000\u0000\u00c9\u00ca"+
		"\u00053\u0000\u0000\u00ca\u00cb\u0005\t\u0000\u0000\u00cb\u00cc\u0005"+
		"R\u0000\u0000\u00cc\u00cd\u0005\n\u0000\u0000\u00cd\u00d1\u0005\u0007"+
		"\u0000\u0000\u00ce\u00d0\u0003\u0018\f\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d3\u0001\u0000\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0001\u0000\u0000\u0000\u00d2\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d5\u0003\u0016\u000b"+
		"\u0000\u00d5\u00d6\u0005\b\u0000\u0000\u00d6\r\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d8\u00053\u0000\u0000\u00d8\u00d9\u0005\t\u0000\u0000\u00d9"+
		"\u00da\u0005R\u0000\u0000\u00da\u00db\u0005\n\u0000\u0000\u00db\u00dc"+
		"\u00055\u0000\u0000\u00dc\u00dd\u0005\u000b\u0000\u0000\u00dd\u00de\u0005"+
		"\f\u0000\u0000\u00de\u00df\u0003\u0010\b\u0000\u00df\u000f\u0001\u0000"+
		"\u0000\u0000\u00e0\u00e3\u0003\u0014\n\u0000\u00e1\u00e3\u0003\u0012\t"+
		"\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u0011\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005\u0007\u0000"+
		"\u0000\u00e5\u00e6\u0005)\u0000\u0000\u00e6\u00e7\u0005R\u0000\u0000\u00e7"+
		"\u00e8\u0005\u000b\u0000\u0000\u00e8\u00e9\u0005\f\u0000\u0000\u00e9\u00ea"+
		"\u0005\u000f\u0000\u0000\u00ea\u00eb\u0005\b\u0000\u0000\u00eb\u0013\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005\u0019\u0000\u0000\u00ed\u00ee\u0005"+
		"\n\u0000\u0000\u00ee\u00ef\u0005R\u0000\u0000\u00ef\u00f0\u0005\u000b"+
		"\u0000\u0000\u00f0\u00f1\u0005\f\u0000\u0000\u00f1\u00f2\u0005\u000f\u0000"+
		"\u0000\u00f2\u0015\u0001\u0000\u0000\u0000\u00f3\u00f4\u00056\u0000\u0000"+
		"\u00f4\u00f5\u00057\u0000\u0000\u00f5\u00f6\u0005\u000b\u0000\u0000\u00f6"+
		"\u00f7\u0003b1\u0000\u00f7\u00f8\u0005\f\u0000\u0000\u00f8\u00fc\u0005"+
		"\u0007\u0000\u0000\u00f9\u00fb\u0003\u0018\f\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00ff\u0001\u0000"+
		"\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u0100\u0005)\u0000"+
		"\u0000\u0100\u0101\u00038\u001c\u0000\u0101\u0102\u0005\u000f\u0000\u0000"+
		"\u0102\u0103\u0005\b\u0000\u0000\u0103\u0017\u0001\u0000\u0000\u0000\u0104"+
		"\u0108\u0003\u001a\r\u0000\u0105\u0108\u0003n7\u0000\u0106\u0108\u0003"+
		"0\u0018\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000"+
		"\u0000\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u0019\u0001\u0000"+
		"\u0000\u0000\u0109\u010b\u0007\u0000\u0000\u0000\u010a\u0109\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0110\u0001\u0000"+
		"\u0000\u0000\u010c\u0111\u0003\u001c\u000e\u0000\u010d\u0111\u0003 \u0010"+
		"\u0000\u010e\u0111\u0003\"\u0011\u0000\u010f\u0111\u0003\u001e\u000f\u0000"+
		"\u0110\u010c\u0001\u0000\u0000\u0000\u0110\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000"+
		"\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u000f\u0000\u0000"+
		"\u0113\u001b\u0001\u0000\u0000\u0000\u0114\u0116\u0005#\u0000\u0000\u0115"+
		"\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116"+
		"\u0117\u0001\u0000\u0000\u0000\u0117\u011a\u0005R\u0000\u0000\u0118\u0119"+
		"\u0005\u0019\u0000\u0000\u0119\u011b\u0003$\u0012\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000\u011b\u001d\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u0005&\u0000\u0000\u011d\u011c\u0001\u0000"+
		"\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0122\u0005R\u0000\u0000\u0120\u0121\u0005\u0019\u0000"+
		"\u0000\u0121\u0123\u0003(\u0014\u0000\u0122\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u001f\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0005$\u0000\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u012a\u0005R\u0000\u0000\u0128\u0129\u0005\u0019\u0000\u0000\u0129\u012b"+
		"\u00051\u0000\u0000\u012a\u0128\u0001\u0000\u0000\u0000\u012a\u012b\u0001"+
		"\u0000\u0000\u0000\u012b!\u0001\u0000\u0000\u0000\u012c\u012e\u0005%\u0000"+
		"\u0000\u012d\u012c\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0132\u0005R\u0000\u0000"+
		"\u0130\u0131\u0005\u0019\u0000\u0000\u0131\u0133\u0003,\u0016\u0000\u0132"+
		"\u0130\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000\u0133"+
		"#\u0001\u0000\u0000\u0000\u0134\u0139\u0003&\u0013\u0000\u0135\u0136\u0007"+
		"\u0001\u0000\u0000\u0136\u0138\u0003&\u0013\u0000\u0137\u0135\u0001\u0000"+
		"\u0000\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a%\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u0141\u0003d2\u0000\u013d"+
		"\u013e\u0007\u0002\u0000\u0000\u013e\u0140\u0003d2\u0000\u013f\u013d\u0001"+
		"\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\'\u0001\u0000"+
		"\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0149\u0003*\u0015"+
		"\u0000\u0145\u0146\u0007\u0001\u0000\u0000\u0146\u0148\u0003*\u0015\u0000"+
		"\u0147\u0145\u0001\u0000\u0000\u0000\u0148\u014b\u0001\u0000\u0000\u0000"+
		"\u0149\u0147\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000\u0000"+
		"\u014a)\u0001\u0000\u0000\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014c"+
		"\u014f\u0003d2\u0000\u014d\u014f\u0003f3\u0000\u014e\u014c\u0001\u0000"+
		"\u0000\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f\u0157\u0001\u0000"+
		"\u0000\u0000\u0150\u0153\u0007\u0002\u0000\u0000\u0151\u0154\u0003d2\u0000"+
		"\u0152\u0154\u0003f3\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152"+
		"\u0001\u0000\u0000\u0000\u0154\u0156\u0001\u0000\u0000\u0000\u0155\u0150"+
		"\u0001\u0000\u0000\u0000\u0156\u0159\u0001\u0000\u0000\u0000\u0157\u0155"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158+\u0001"+
		"\u0000\u0000\u0000\u0159\u0157\u0001\u0000\u0000\u0000\u015a\u015e\u0005"+
		"P\u0000\u0000\u015b\u015e\u0005Q\u0000\u0000\u015c\u015e\u0003.\u0017"+
		"\u0000\u015d\u015a\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015d\u015c\u0001\u0000\u0000\u0000\u015e-\u0001\u0000\u0000\u0000"+
		"\u015f\u0163\u0003d2\u0000\u0160\u0163\u0003f3\u0000\u0161\u0163\u0005"+
		"R\u0000\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163\u0164\u0001\u0000"+
		"\u0000\u0000\u0164\u0168\u0007\u0003\u0000\u0000\u0165\u0169\u0003d2\u0000"+
		"\u0166\u0169\u0003f3\u0000\u0167\u0169\u0005R\u0000\u0000\u0168\u0165"+
		"\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167"+
		"\u0001\u0000\u0000\u0000\u0169/\u0001\u0000\u0000\u0000\u016a\u016e\u0003"+
		"2\u0019\u0000\u016b\u016e\u00034\u001a\u0000\u016c\u016e\u00036\u001b"+
		"\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000\u0000"+
		"\u0000\u016d\u016c\u0001\u0000\u0000\u0000\u016e1\u0001\u0000\u0000\u0000"+
		"\u016f\u0173\u0005\'\u0000\u0000\u0170\u0171\u0005\t\u0000\u0000\u0171"+
		"\u0172\u0005$\u0000\u0000\u0172\u0174\u0005\n\u0000\u0000\u0173\u0170"+
		"\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0175"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0005R\u0000\u0000\u0176\u0177\u0005"+
		"\u0019\u0000\u0000\u0177\u0180\u0005\r\u0000\u0000\u0178\u017d\u00051"+
		"\u0000\u0000\u0179\u017a\u0005\u0010\u0000\u0000\u017a\u017c\u00051\u0000"+
		"\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c\u017f\u0001\u0000\u0000"+
		"\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e\u0181\u0001\u0000\u0000\u0000\u017f\u017d\u0001\u0000\u0000"+
		"\u0000\u0180\u0178\u0001\u0000\u0000\u0000\u0180\u0181\u0001\u0000\u0000"+
		"\u0000\u0181\u0183\u0001\u0000\u0000\u0000\u0182\u0184\u0005\u0010\u0000"+
		"\u0000\u0183\u0182\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000\u0000"+
		"\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185\u0186\u0005\u000e\u0000"+
		"\u0000\u0186\u0187\u0005\u000f\u0000\u0000\u01873\u0001\u0000\u0000\u0000"+
		"\u0188\u018c\u0005\'\u0000\u0000\u0189\u018a\u0005\t\u0000\u0000\u018a"+
		"\u018b\u0005#\u0000\u0000\u018b\u018d\u0005\n\u0000\u0000\u018c\u0189"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u018e"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0005R\u0000\u0000\u018f\u0190\u0005"+
		"\u0019\u0000\u0000\u0190\u0199\u0005\r\u0000\u0000\u0191\u0196\u0003d"+
		"2\u0000\u0192\u0193\u0005\u0010\u0000\u0000\u0193\u0195\u0003d2\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0198\u0001\u0000\u0000\u0000"+
		"\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u019a\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000"+
		"\u0199\u0191\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000"+
		"\u019a\u019c\u0001\u0000\u0000\u0000\u019b\u019d\u0005\u0010\u0000\u0000"+
		"\u019c\u019b\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000\u0000\u0000"+
		"\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u019f\u0005\u000e\u0000\u0000"+
		"\u019f\u01a0\u0005\u000f\u0000\u0000\u01a05\u0001\u0000\u0000\u0000\u01a1"+
		"\u01a5\u0005\'\u0000\u0000\u01a2\u01a3\u0005\t\u0000\u0000\u01a3\u01a4"+
		"\u0005%\u0000\u0000\u01a4\u01a6\u0005\n\u0000\u0000\u01a5\u01a2\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a7\u01a8\u0005R\u0000\u0000\u01a8\u01a9\u0005\u0019"+
		"\u0000\u0000\u01a9\u01b2\u0005\r\u0000\u0000\u01aa\u01af\u0003,\u0016"+
		"\u0000\u01ab\u01ac\u0005\u0010\u0000\u0000\u01ac\u01ae\u0003,\u0016\u0000"+
		"\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000"+
		"\u01af\u01ad\u0001\u0000\u0000\u0000\u01af\u01b0\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b3\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000"+
		"\u01b2\u01aa\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b6\u0005\u0010\u0000\u0000"+
		"\u01b5\u01b4\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b8\u0005\u000e\u0000\u0000"+
		"\u01b8\u01b9\u0005\u000f\u0000\u0000\u01b97\u0001\u0000\u0000\u0000\u01ba"+
		"\u01c4\u0003F#\u0000\u01bb\u01c4\u0003:\u001d\u0000\u01bc\u01c4\u0003"+
		"D\"\u0000\u01bd\u01c4\u0003B!\u0000\u01be\u01c4\u0003>\u001f\u0000\u01bf"+
		"\u01c4\u0003<\u001e\u0000\u01c0\u01c4\u0003H$\u0000\u01c1\u01c4\u0003"+
		"@ \u0000\u01c2\u01c4\u0003J%\u0000\u01c3\u01ba\u0001\u0000\u0000\u0000"+
		"\u01c3\u01bb\u0001\u0000\u0000\u0000\u01c3\u01bc\u0001\u0000\u0000\u0000"+
		"\u01c3\u01bd\u0001\u0000\u0000\u0000\u01c3\u01be\u0001\u0000\u0000\u0000"+
		"\u01c3\u01bf\u0001\u0000\u0000\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c3\u01c1\u0001\u0000\u0000\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000"+
		"\u01c49\u0001\u0000\u0000\u0000\u01c5\u01c6\u00059\u0000\u0000\u01c6\u01c7"+
		"\u0005\u000b\u0000\u0000\u01c7\u01c9\u0003\\.\u0000\u01c8\u01ca\u0005"+
		"\u0010\u0000\u0000\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005"+
		"\f\u0000\u0000\u01cc;\u0001\u0000\u0000\u0000\u01cd\u01ce\u0005B\u0000"+
		"\u0000\u01ce\u01d7\u0005\u000b\u0000\u0000\u01cf\u01d0\u0003N\'\u0000"+
		"\u01d0\u01d1\u0005\u0010\u0000\u0000\u01d1\u01d2\u0003\\.\u0000\u01d2"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003\\.\u0000\u01d4\u01d5"+
		"\u0005\u0010\u0000\u0000\u01d5\u01d6\u0003N\'\u0000\u01d6\u01d8\u0001"+
		"\u0000\u0000\u0000\u01d7\u01cf\u0001\u0000\u0000\u0000\u01d7\u01d3\u0001"+
		"\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01db\u0005"+
		"\u0010\u0000\u0000\u01da\u01d9\u0001\u0000\u0000\u0000\u01da\u01db\u0001"+
		"\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc\u01dd\u0005"+
		"\f\u0000\u0000\u01dd=\u0001\u0000\u0000\u0000\u01de\u01df\u0005A\u0000"+
		"\u0000\u01df\u01e0\u0005\u000b\u0000\u0000\u01e0\u01e2\u0003`0\u0000\u01e1"+
		"\u01e3\u0005\u0010\u0000\u0000\u01e2\u01e1\u0001\u0000\u0000\u0000\u01e2"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e5\u0005\f\u0000\u0000\u01e5?\u0001\u0000\u0000\u0000\u01e6\u01e7"+
		"\u0005J\u0000\u0000\u01e7\u01e8\u0005\u000b\u0000\u0000\u01e8\u01ea\u0005"+
		"1\u0000\u0000\u01e9\u01eb\u0005\u0010\u0000\u0000\u01ea\u01e9\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0001\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0005\f\u0000\u0000\u01edA\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0005?\u0000\u0000\u01ef\u01f0\u0005\u000b\u0000\u0000"+
		"\u01f0\u01f2\u0003Z-\u0000\u01f1\u01f3\u0005\u0010\u0000\u0000\u01f2\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f2\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4"+
		"\u0001\u0000\u0000\u0000\u01f4\u01f5\u0005\f\u0000\u0000\u01f5C\u0001"+
		"\u0000\u0000\u0000\u01f6\u01f7\u0005:\u0000\u0000\u01f7\u01f8\u0005\u000b"+
		"\u0000\u0000\u01f8\u01f9\u0003R)\u0000\u01f9\u01fb\u0003\\.\u0000\u01fa"+
		"\u01fc\u0005\u0010\u0000\u0000\u01fb\u01fa\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fd\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\u0005\f\u0000\u0000\u01feE\u0001\u0000\u0000\u0000\u01ff\u0200"+
		"\u00058\u0000\u0000\u0200\u0202\u0005\u000b\u0000\u0000\u0201\u0203\u0003"+
		"L&\u0000\u0202\u0201\u0001\u0000\u0000\u0000\u0202\u0203\u0001\u0000\u0000"+
		"\u0000\u0203\u0208\u0001\u0000\u0000\u0000\u0204\u0205\u0005\u0010\u0000"+
		"\u0000\u0205\u0207\u0003L&\u0000\u0206\u0204\u0001\u0000\u0000\u0000\u0207"+
		"\u020a\u0001\u0000\u0000\u0000\u0208\u0206\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0001\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a"+
		"\u0208\u0001\u0000\u0000\u0000\u020b\u020d\u0005\u0010\u0000\u0000\u020c"+
		"\u020b\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000\u0000\u020d"+
		"\u020e\u0001\u0000\u0000\u0000\u020e\u020f\u0005\f\u0000\u0000\u020fG"+
		"\u0001\u0000\u0000\u0000\u0210\u0211\u0007\u0004\u0000\u0000\u0211\u0212"+
		"\u0005\u000b\u0000\u0000\u0212\u0214\u0003^/\u0000\u0213\u0215\u0005\u0010"+
		"\u0000\u0000\u0214\u0213\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000"+
		"\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216\u0218\u0005\f\u0000"+
		"\u0000\u0217\u0219\u0005\u0010\u0000\u0000\u0218\u0217\u0001\u0000\u0000"+
		"\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219I\u0001\u0000\u0000\u0000"+
		"\u021a\u021b\u0005H\u0000\u0000\u021b\u021c\u0005\u0012\u0000\u0000\u021c"+
		"\u021d\u0005K\u0000\u0000\u021d\u021e\u0005\u000b\u0000\u0000\u021e\u021f"+
		"\u0007\u0005\u0000\u0000\u021f\u0220\u0005\f\u0000\u0000\u0220K\u0001"+
		"\u0000\u0000\u0000\u0221\u0225\u0003V+\u0000\u0222\u0225\u0003X,\u0000"+
		"\u0223\u0225\u0003\\.\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224"+
		"\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001\u0000\u0000\u0000\u0225"+
		"M\u0001\u0000\u0000\u0000\u0226\u0227\u0005C\u0000\u0000\u0227\u0228\u0005"+
		"\u0011\u0000\u0000\u0228\u0229\u0003P(\u0000\u0229O\u0001\u0000\u0000"+
		"\u0000\u022a\u022b\u0005D\u0000\u0000\u022b\u022c\u0005\u0012\u0000\u0000"+
		"\u022c\u022d\u0005*\u0000\u0000\u022d\u022e\u0005\u000b\u0000\u0000\u022e"+
		"\u022f\u0003d2\u0000\u022f\u0230\u0005\f\u0000\u0000\u0230Q\u0001\u0000"+
		"\u0000\u0000\u0231\u0232\u0005G\u0000\u0000\u0232\u0233\u0005\u0011\u0000"+
		"\u0000\u0233\u0234\u0005\u000b\u0000\u0000\u0234\u0235\u0005\f\u0000\u0000"+
		"\u0235\u023a\u0005\u0007\u0000\u0000\u0236\u0239\u0003t:\u0000\u0237\u0239"+
		"\u0003T*\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0237\u0001\u0000"+
		"\u0000\u0000\u0239\u023c\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000"+
		"\u0000\u0000\u023a\u023b\u0001\u0000\u0000\u0000\u023b\u023d\u0001\u0000"+
		"\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000\u023d\u023e\u0005\b\u0000"+
		"\u0000\u023e\u023f\u0005\u0010\u0000\u0000\u023fS\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u00050\u0000\u0000\u0241\u0242\u0005\u000b\u0000\u0000\u0242"+
		"\u0243\u0005\u000b\u0000\u0000\u0243\u0244\u0005\f\u0000\u0000\u0244\u0248"+
		"\u0005\u0007\u0000\u0000\u0245\u0247\u0003t:\u0000\u0246\u0245\u0001\u0000"+
		"\u0000\u0000\u0247\u024a\u0001\u0000\u0000\u0000\u0248\u0246\u0001\u0000"+
		"\u0000\u0000\u0248\u0249\u0001\u0000\u0000\u0000\u0249\u024b\u0001\u0000"+
		"\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b\u024c\u0005\b\u0000"+
		"\u0000\u024c\u024d\u0005\f\u0000\u0000\u024d\u024e\u0005\u000f\u0000\u0000"+
		"\u024eU\u0001\u0000\u0000\u0000\u024f\u0250\u0005=\u0000\u0000\u0250\u0251"+
		"\u0005\u0011\u0000\u0000\u0251\u0252\u0003d2\u0000\u0252W\u0001\u0000"+
		"\u0000\u0000\u0253\u0254\u0005<\u0000\u0000\u0254\u0255\u0005\u0011\u0000"+
		"\u0000\u0255\u0256\u0003d2\u0000\u0256Y\u0001\u0000\u0000\u0000\u0257"+
		"\u0258\u0005@\u0000\u0000\u0258\u0259\u0005\u0011\u0000\u0000\u0259\u025a"+
		"\u0005R\u0000\u0000\u025a\u025b\u0005\u000b\u0000\u0000\u025b\u025c\u0005"+
		"\f\u0000\u0000\u025c[\u0001\u0000\u0000\u0000\u025d\u025e\u0005;\u0000"+
		"\u0000\u025e\u025f\u0005\u0011\u0000\u0000\u025f\u0260\u00038\u001c\u0000"+
		"\u0260]\u0001\u0000\u0000\u0000\u0261\u0262\u0005L\u0000\u0000\u0262\u0263"+
		"\u0005\u0011\u0000\u0000\u0263\u026c\u0005\r\u0000\u0000\u0264\u0269\u0003"+
		"8\u001c\u0000\u0265\u0266\u0005\u0010\u0000\u0000\u0266\u0268\u00038\u001c"+
		"\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026b\u0001\u0000\u0000"+
		"\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001\u0000\u0000"+
		"\u0000\u026a\u026d\u0001\u0000\u0000\u0000\u026b\u0269\u0001\u0000\u0000"+
		"\u0000\u026c\u0264\u0001\u0000\u0000\u0000\u026c\u026d\u0001\u0000\u0000"+
		"\u0000\u026d\u026f\u0001\u0000\u0000\u0000\u026e\u0270\u0005\u0010\u0000"+
		"\u0000\u026f\u026e\u0001\u0000\u0000\u0000\u026f\u0270\u0001\u0000\u0000"+
		"\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0272\u0005\u000e\u0000"+
		"\u0000\u0272_\u0001\u0000\u0000\u0000\u0273\u0274\u0005I\u0000\u0000\u0274"+
		"\u0275\u0005\u0011\u0000\u0000\u0275\u0276\u00038\u001c\u0000\u0276a\u0001"+
		"\u0000\u0000\u0000\u0277\u0278\u00052\u0000\u0000\u0278\u0279\u0005R\u0000"+
		"\u0000\u0279c\u0001\u0000\u0000\u0000\u027a\u027b\u0005T\u0000\u0000\u027b"+
		"e\u0001\u0000\u0000\u0000\u027c\u027d\u0005S\u0000\u0000\u027dg\u0001"+
		"\u0000\u0000\u0000\u027e\u027f\u0005\u0003\u0000\u0000\u027f\u0280\u0005"+
		"\u000b\u0000\u0000\u0280\u0281\u0003|>\u0000\u0281\u0282\u0005\f\u0000"+
		"\u0000\u0282\u0290\u0003l6\u0000\u0283\u0284\u0005\u0004\u0000\u0000\u0284"+
		"\u0285\u0005\u000b\u0000\u0000\u0285\u0286\u0003|>\u0000\u0286\u0287\u0005"+
		"\f\u0000\u0000\u0287\u0288\u0003l6\u0000\u0288\u028a\u0001\u0000\u0000"+
		"\u0000\u0289\u0283\u0001\u0000\u0000\u0000\u028a\u028d\u0001\u0000\u0000"+
		"\u0000\u028b\u0289\u0001\u0000\u0000\u0000\u028b\u028c\u0001\u0000\u0000"+
		"\u0000\u028c\u028e\u0001\u0000\u0000\u0000\u028d\u028b\u0001\u0000\u0000"+
		"\u0000\u028e\u028f\u0005\u0005\u0000\u0000\u028f\u0291\u0003l6\u0000\u0290"+
		"\u028b\u0001\u0000\u0000\u0000\u0290\u0291\u0001\u0000\u0000\u0000\u0291"+
		"\u0294\u0001\u0000\u0000\u0000\u0292\u0293\u0005\u0005\u0000\u0000\u0293"+
		"\u0295\u0003l6\u0000\u0294\u0292\u0001\u0000\u0000\u0000\u0294\u0295\u0001"+
		"\u0000\u0000\u0000\u0295i\u0001\u0000\u0000\u0000\u0296\u0297\u0005\u0006"+
		"\u0000\u0000\u0297\u0298\u0005\u000b\u0000\u0000\u0298\u0299\u0003|>\u0000"+
		"\u0299\u029a\u0005\f\u0000\u0000\u029a\u029b\u0003l6\u0000\u029bk\u0001"+
		"\u0000\u0000\u0000\u029c\u02a0\u0005\u0007\u0000\u0000\u029d\u029f\u0003"+
		"t:\u0000\u029e\u029d\u0001\u0000\u0000\u0000\u029f\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a0\u029e\u0001\u0000\u0000\u0000\u02a0\u02a1\u0001\u0000\u0000"+
		"\u0000\u02a1\u02a3\u0001\u0000\u0000\u0000\u02a2\u02a0\u0001\u0000\u0000"+
		"\u0000\u02a3\u02a4\u0005\b\u0000\u0000\u02a4m\u0001\u0000\u0000\u0000"+
		"\u02a5\u02a7\u0005/\u0000\u0000\u02a6\u02a5\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a7\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001\u0000\u0000\u0000\u02a8"+
		"\u02ab\u0003p8\u0000\u02a9\u02ab\u0005/\u0000\u0000\u02aa\u02a6\u0001"+
		"\u0000\u0000\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02ab\u02ac\u0001"+
		"\u0000\u0000\u0000\u02ac\u02ad\u0005R\u0000\u0000\u02ad\u02af\u0005\u000b"+
		"\u0000\u0000\u02ae\u02b0\u0003r9\u0000\u02af\u02ae\u0001\u0000\u0000\u0000"+
		"\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0\u02b1\u0001\u0000\u0000\u0000"+
		"\u02b1\u02b2\u0005\f\u0000\u0000\u02b2\u02b3\u0003l6\u0000\u02b3o\u0001"+
		"\u0000\u0000\u0000\u02b4\u02b5\u0007\u0006\u0000\u0000\u02b5q\u0001\u0000"+
		"\u0000\u0000\u02b6\u02bb\u0003\u0018\f\u0000\u02b7\u02b8\u0005\u0010\u0000"+
		"\u0000\u02b8\u02ba\u0003\u0018\f\u0000\u02b9\u02b7\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bd\u0001\u0000\u0000\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000"+
		"\u02bb\u02bc\u0001\u0000\u0000\u0000\u02bc\u02bf\u0001\u0000\u0000\u0000"+
		"\u02bd\u02bb\u0001\u0000\u0000\u0000\u02be\u02c0\u0005\u0010\u0000\u0000"+
		"\u02bf\u02be\u0001\u0000\u0000\u0000\u02bf\u02c0\u0001\u0000\u0000\u0000"+
		"\u02c0s\u0001\u0000\u0000\u0000\u02c1\u02c7\u0003\u0018\f\u0000\u02c2"+
		"\u02c7\u0003h4\u0000\u02c3\u02c7\u0003v;\u0000\u02c4\u02c7\u0003j5\u0000"+
		"\u02c5\u02c7\u0003n7\u0000\u02c6\u02c1\u0001\u0000\u0000\u0000\u02c6\u02c2"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c3\u0001\u0000\u0000\u0000\u02c6\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c6\u02c5\u0001\u0000\u0000\u0000\u02c7u\u0001"+
		"\u0000\u0000\u0000\u02c8\u02c9\u0005\u0002\u0000\u0000\u02c9\u02cb\u0005"+
		"\u000b\u0000\u0000\u02ca\u02cc\u0003x<\u0000\u02cb\u02ca\u0001\u0000\u0000"+
		"\u0000\u02cb\u02cc\u0001\u0000\u0000\u0000\u02cc\u02ce\u0001\u0000\u0000"+
		"\u0000\u02cd\u02cf\u0003|>\u0000\u02ce\u02cd\u0001\u0000\u0000\u0000\u02ce"+
		"\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0001\u0000\u0000\u0000\u02d0"+
		"\u02d2\u0005\u000f\u0000\u0000\u02d1\u02d3\u0003z=\u0000\u02d2\u02d1\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3\u02d4\u0001"+
		"\u0000\u0000\u0000\u02d4\u02d5\u0005\f\u0000\u0000\u02d5\u02d6\u0003l"+
		"6\u0000\u02d6w\u0001\u0000\u0000\u0000\u02d7\u02da\u0003\u001a\r\u0000"+
		"\u02d8\u02da\u0003z=\u0000\u02d9\u02d7\u0001\u0000\u0000\u0000\u02d9\u02d8"+
		"\u0001\u0000\u0000\u0000\u02day\u0001\u0000\u0000\u0000\u02db\u02e0\u0003"+
		"$\u0012\u0000\u02dc\u02dd\u0005\u0010\u0000\u0000\u02dd\u02df\u0003$\u0012"+
		"\u0000\u02de\u02dc\u0001\u0000\u0000\u0000\u02df\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e0\u02de\u0001\u0000\u0000\u0000\u02e0\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e1{\u0001\u0000\u0000\u0000\u02e2\u02e0\u0001\u0000\u0000\u0000"+
		"\u02e3\u02ea\u0003,\u0016\u0000\u02e4\u02ea\u0003~?\u0000\u02e5\u02e6"+
		"\u0005\u000b\u0000\u0000\u02e6\u02e7\u0003|>\u0000\u02e7\u02e8\u0005\f"+
		"\u0000\u0000\u02e8\u02ea\u0001\u0000\u0000\u0000\u02e9\u02e3\u0001\u0000"+
		"\u0000\u0000\u02e9\u02e4\u0001\u0000\u0000\u0000\u02e9\u02e5\u0001\u0000"+
		"\u0000\u0000\u02ea}\u0001\u0000\u0000\u0000\u02eb\u02f0\u0003\u0080@\u0000"+
		"\u02ec\u02ed\u0007\u0007\u0000\u0000\u02ed\u02ef\u0003\u0080@\u0000\u02ee"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f2\u0001\u0000\u0000\u0000\u02f0"+
		"\u02ee\u0001\u0000\u0000\u0000\u02f0\u02f1\u0001\u0000\u0000\u0000\u02f1"+
		"\u007f\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f8\u0003\u0082A\u0000\u02f4\u02f5\u0007\b\u0000\u0000\u02f5\u02f7"+
		"\u0003\u0082A\u0000\u02f6\u02f4\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f9\u0081\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fe\u0003$\u0012\u0000\u02fc\u02fe\u0003(\u0014"+
		"\u0000\u02fd\u02fb\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000"+
		"\u0000\u02fe\u0083\u0001\u0000\u0000\u0000\u02ff\u0300\u0007\t\u0000\u0000"+
		"\u0300\u0085\u0001\u0000\u0000\u0000\u0301\u0302\u0007\n\u0000\u0000\u0302"+
		"\u0087\u0001\u0000\u0000\u0000\u0303\u0304\u0006D\uffff\uffff\u0000\u0304"+
		"\u0311\u0003\u008cF\u0000\u0305\u0306\u0003\u0084B\u0000\u0306\u0307\u0003"+
		"\u0088D\u0005\u0307\u0311\u0001\u0000\u0000\u0000\u0308\u0309\u0003$\u0012"+
		"\u0000\u0309\u030a\u0003\u0086C\u0000\u030a\u0311\u0001\u0000\u0000\u0000"+
		"\u030b\u0311\u0003\u008eG\u0000\u030c\u030d\u0005\u000b\u0000\u0000\u030d"+
		"\u030e\u0003\u0088D\u0000\u030e\u030f\u0005\f\u0000\u0000\u030f\u0311"+
		"\u0001\u0000\u0000\u0000\u0310\u0303\u0001\u0000\u0000\u0000\u0310\u0305"+
		"\u0001\u0000\u0000\u0000\u0310\u0308\u0001\u0000\u0000\u0000\u0310\u030b"+
		"\u0001\u0000\u0000\u0000\u0310\u030c\u0001\u0000\u0000\u0000\u0311\u0316"+
		"\u0001\u0000\u0000\u0000\u0312\u0313\n\u0004\u0000\u0000\u0313\u0315\u0003"+
		"\u0086C\u0000\u0314\u0312\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000"+
		"\u0000\u0000\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000"+
		"\u0000\u0000\u0317\u0089\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000"+
		"\u0000\u0000\u0319\u031a\u0007\u000b\u0000\u0000\u031a\u008b\u0001\u0000"+
		"\u0000\u0000\u031b\u031c\u0005R\u0000\u0000\u031c\u008d\u0001\u0000\u0000"+
		"\u0000\u031d\u031e\u0003\u008cF\u0000\u031e\u0320\u0005\u000b\u0000\u0000"+
		"\u031f\u0321\u0003\u0090H\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0001\u0000\u0000\u0000\u0322"+
		"\u0323\u0005\f\u0000\u0000\u0323\u008f\u0001\u0000\u0000\u0000\u0324\u0329"+
		"\u0003\u0088D\u0000\u0325\u0326\u0005\u0010\u0000\u0000\u0326\u0328\u0003"+
		"\u0088D\u0000\u0327\u0325\u0001\u0000\u0000\u0000\u0328\u032b\u0001\u0000"+
		"\u0000\u0000\u0329\u0327\u0001\u0000\u0000\u0000\u0329\u032a\u0001\u0000"+
		"\u0000\u0000\u032a\u0091\u0001\u0000\u0000\u0000\u032b\u0329\u0001\u0000"+
		"\u0000\u0000U\u0094\u0096\u009c\u00a4\u00b0\u00c0\u00d1\u00e2\u00fc\u0107"+
		"\u010a\u0110\u0115\u011a\u011d\u0122\u0125\u012a\u012d\u0132\u0139\u0141"+
		"\u0149\u014e\u0153\u0157\u015d\u0162\u0168\u016d\u0173\u017d\u0180\u0183"+
		"\u018c\u0196\u0199\u019c\u01a5\u01af\u01b2\u01b5\u01c3\u01c9\u01d7\u01da"+
		"\u01e2\u01ea\u01f2\u01fb\u0202\u0208\u020c\u0214\u0218\u0224\u0238\u023a"+
		"\u0248\u0269\u026c\u026f\u028b\u0290\u0294\u02a0\u02a6\u02aa\u02af\u02bb"+
		"\u02bf\u02c6\u02cb\u02ce\u02d2\u02d9\u02e0\u02e9\u02f0\u02f8\u02fd\u0310"+
		"\u0316\u0320\u0329";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}