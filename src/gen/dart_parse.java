// Generated from dart_parse.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dart_parse extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

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
		RULE_integerDeclarationLine = 14, RULE_integerDeclaration = 15, RULE_integerDeclarationAssignment = 16, 
		RULE_integerAssignment = 17, RULE_doubleDeclarationLine = 18, RULE_doubleDeclaration = 19, 
		RULE_doubleDeclarationAssignment = 20, RULE_doubleAssignment = 21, RULE_stringDeclarationLine = 22, 
		RULE_stringDeclaration = 23, RULE_stringDeclarationAssignment = 24, RULE_stringAssignment = 25, 
		RULE_booleanDeclarationLine = 26, RULE_booleanDeclaration = 27, RULE_booleanDeclarationAssignment = 28, 
		RULE_booleanAssignment = 29, RULE_addExpression = 30, RULE_multiplyExpression = 31, 
		RULE_addDoubleExpression = 32, RULE_multiplyDoubleExpression = 33, RULE_booleans = 34, 
		RULE_booleanOperation = 35, RULE_dartAllListsDeclaration = 36, RULE_dartListStringDeclaration = 37, 
		RULE_dartListIntDeclaration = 38, RULE_dartListBoolDeclaration = 39, RULE_widgetsDeclaration = 40, 
		RULE_expandedDeclaration = 41, RULE_paddingDeclaration = 42, RULE_scaffoldDeclaration = 43, 
		RULE_textDeclaration = 44, RULE_materialAppDeclaration = 45, RULE_materialButtonDeclaration = 46, 
		RULE_conatinerDeclaration = 47, RULE_rowColumnDeclaration = 48, RULE_imageDeclaration = 49, 
		RULE_conatinerPropertiesDeclaration = 50, RULE_paddingPropertyDeclaration = 51, 
		RULE_edgeInsistAll = 52, RULE_onPressedPropertyDeclaration = 53, RULE_setStatePressedDeclaration = 54, 
		RULE_heightPropertyDeclaration = 55, RULE_widthPropertyDeclaration = 56, 
		RULE_homePropertyDeclaration = 57, RULE_childPropertyDeclaration = 58, 
		RULE_childrenPropertyDeclaration = 59, RULE_bodyPropertyDeclaration = 60, 
		RULE_buildContextDeclaration = 61, RULE_number = 62, RULE_numberDouble = 63, 
		RULE_ifStatement = 64, RULE_whileStatement = 65, RULE_block = 66, RULE_function = 67, 
		RULE_functionType = 68, RULE_parameters = 69, RULE_assignment = 70, RULE_statement = 71, 
		RULE_forStatement = 72, RULE_variableAssignment = 73, RULE_conditionExpr = 74, 
		RULE_andExpr = 75, RULE_binaryExpr = 76, RULE_term = 77, RULE_numericExpr = 78, 
		RULE_numericTerm = 79, RULE_prefixUnaryOperator = 80, RULE_postfixUnaryOperator = 81, 
		RULE_expression = 82, RULE_literal = 83, RULE_identifier = 84, RULE_functionCall = 85, 
		RULE_arguments = 86;
	private static String[] makeRuleNames() {
		return new String[] {
			"topTreeDeclaration", "allClassesDeclaration", "classDeclaration", "statelessClassDeclaration", 
			"statefullClassDeclaration", "stfulFirstBody", "stfulSecondBody", "statefullAssignStateClassDeclaration", 
			"returnStateTypes", "functionReturnState", "returnArrowState", "buildMethodDeclaration", 
			"dartDeclaration", "variable", "integerDeclarationLine", "integerDeclaration", 
			"integerDeclarationAssignment", "integerAssignment", "doubleDeclarationLine", 
			"doubleDeclaration", "doubleDeclarationAssignment", "doubleAssignment", 
			"stringDeclarationLine", "stringDeclaration", "stringDeclarationAssignment", 
			"stringAssignment", "booleanDeclarationLine", "booleanDeclaration", "booleanDeclarationAssignment", 
			"booleanAssignment", "addExpression", "multiplyExpression", "addDoubleExpression", 
			"multiplyDoubleExpression", "booleans", "booleanOperation", "dartAllListsDeclaration", 
			"dartListStringDeclaration", "dartListIntDeclaration", "dartListBoolDeclaration", 
			"widgetsDeclaration", "expandedDeclaration", "paddingDeclaration", "scaffoldDeclaration", 
			"textDeclaration", "materialAppDeclaration", "materialButtonDeclaration", 
			"conatinerDeclaration", "rowColumnDeclaration", "imageDeclaration", "conatinerPropertiesDeclaration", 
			"paddingPropertyDeclaration", "edgeInsistAll", "onPressedPropertyDeclaration", 
			"setStatePressedDeclaration", "heightPropertyDeclaration", "widthPropertyDeclaration", 
			"homePropertyDeclaration", "childPropertyDeclaration", "childrenPropertyDeclaration", 
			"bodyPropertyDeclaration", "buildContextDeclaration", "number", "numberDouble", 
			"ifStatement", "whileStatement", "block", "function", "functionType", 
			"parameters", "assignment", "statement", "forStatement", "variableAssignment", 
			"conditionExpr", "andExpr", "binaryExpr", "term", "numericExpr", "numericTerm", 
			"prefixUnaryOperator", "postfixUnaryOperator", "expression", "literal", 
			"identifier", "functionCall", "arguments"
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
	public String getGrammarFileName() { return "dart_parse.g4"; }

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
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0)) {
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLASS:
					{
					setState(174);
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
					{
					setState(175);
					dartDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(180);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				statefullClassDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(183);
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
			setState(186);
			match(CLASS);
			setState(187);
			match(NAME);
			setState(188);
			match(CRLY_BRKT_OP);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0)) {
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
			setState(197);
			match(CLASS);
			setState(198);
			match(NAME);
			setState(199);
			match(STATELESS);
			setState(200);
			match(CRLY_BRKT_OP);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(201);
				dartDeclaration();
				}
				}
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(207);
			buildMethodDeclaration();
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
			setState(210);
			stfulFirstBody();
			setState(211);
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
			setState(213);
			match(CLASS);
			setState(214);
			match(NAME);
			setState(215);
			match(STATEFULL);
			setState(216);
			match(CRLY_BRKT_OP);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(217);
				dartDeclaration();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			statefullAssignStateClassDeclaration();
			setState(224);
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
			setState(226);
			match(CLASS);
			setState(227);
			match(NAME);
			setState(228);
			match(EXTENDS);
			setState(229);
			match(STATE);
			setState(230);
			match(ANGLE_BRKT_OP);
			setState(231);
			match(NAME);
			setState(232);
			match(ANGLE_BRKT_CL);
			setState(233);
			match(CRLY_BRKT_OP);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(234);
				dartDeclaration();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			buildMethodDeclaration();
			setState(241);
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
			setState(243);
			match(STATE);
			setState(244);
			match(ANGLE_BRKT_OP);
			setState(245);
			match(NAME);
			setState(246);
			match(ANGLE_BRKT_CL);
			setState(247);
			match(CREATESTATE);
			setState(248);
			match(BRKT_OP);
			setState(249);
			match(BRKT_CL);
			setState(250);
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
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				returnArrowState();
				}
				break;
			case CRLY_BRKT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
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
			setState(256);
			match(CRLY_BRKT_OP);
			setState(257);
			match(RETURN);
			setState(258);
			match(NAME);
			setState(259);
			match(BRKT_OP);
			setState(260);
			match(BRKT_CL);
			setState(261);
			match(SEMICOLON);
			setState(262);
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
			setState(264);
			match(ASSIGN);
			setState(265);
			match(ANGLE_BRKT_CL);
			setState(266);
			match(NAME);
			setState(267);
			match(BRKT_OP);
			setState(268);
			match(BRKT_CL);
			setState(269);
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
			setState(271);
			match(WIDGET);
			setState(272);
			match(BUILD);
			setState(273);
			match(BRKT_OP);
			setState(274);
			buildContextDeclaration();
			setState(275);
			match(BRKT_CL);
			setState(276);
			match(CRLY_BRKT_OP);
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0)) {
				{
				{
				setState(277);
				dartDeclaration();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(RETURN);
			setState(284);
			widgetsDeclaration();
			setState(285);
			match(SEMICOLON);
			setState(286);
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
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				function();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(290);
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public IntegerDeclarationLineContext integerDeclarationLine() {
			return getRuleContext(IntegerDeclarationLineContext.class,0);
		}
		public StringDeclarationLineContext stringDeclarationLine() {
			return getRuleContext(StringDeclarationLineContext.class,0);
		}
		public BooleanDeclarationLineContext booleanDeclarationLine() {
			return getRuleContext(BooleanDeclarationLineContext.class,0);
		}
		public DoubleDeclarationLineContext doubleDeclarationLine() {
			return getRuleContext(DoubleDeclarationLineContext.class,0);
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
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL || _la==CONST) {
				{
				setState(293);
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

			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(296);
				integerDeclarationLine();
				}
				break;
			case STRING:
				{
				setState(297);
				stringDeclarationLine();
				}
				break;
			case BOOL:
				{
				setState(298);
				booleanDeclarationLine();
				}
				break;
			case DOUBLE:
				{
				setState(299);
				doubleDeclarationLine();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(302);
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

	public static class IntegerDeclarationLineContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(dart_parse.INT, 0); }
		public List<IntegerDeclarationContext> integerDeclaration() {
			return getRuleContexts(IntegerDeclarationContext.class);
		}
		public IntegerDeclarationContext integerDeclaration(int i) {
			return getRuleContext(IntegerDeclarationContext.class,i);
		}
		public List<IntegerDeclarationAssignmentContext> integerDeclarationAssignment() {
			return getRuleContexts(IntegerDeclarationAssignmentContext.class);
		}
		public IntegerDeclarationAssignmentContext integerDeclarationAssignment(int i) {
			return getRuleContext(IntegerDeclarationAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public IntegerDeclarationLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerDeclarationLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterIntegerDeclarationLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitIntegerDeclarationLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitIntegerDeclarationLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerDeclarationLineContext integerDeclarationLine() throws RecognitionException {
		IntegerDeclarationLineContext _localctx = new IntegerDeclarationLineContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_integerDeclarationLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(INT);
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(305);
				integerDeclaration();
				}
				break;
			case 2:
				{
				setState(306);
				integerDeclarationAssignment();
				}
				break;
			}
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(309);
				match(COMMA);
				setState(312);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(310);
					integerDeclaration();
					}
					break;
				case 2:
					{
					setState(311);
					integerDeclarationAssignment();
					}
					break;
				}
				}
				}
				setState(318);
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

	public static class IntegerDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
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
		enterRule(_localctx, 30, RULE_integerDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
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

	public static class IntegerDeclarationAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public IntegerDeclarationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerDeclarationAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterIntegerDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitIntegerDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitIntegerDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerDeclarationAssignmentContext integerDeclarationAssignment() throws RecognitionException {
		IntegerDeclarationAssignmentContext _localctx = new IntegerDeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_integerDeclarationAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(NAME);
			setState(322);
			match(ASSIGN);
			setState(323);
			addExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public IntegerAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterIntegerAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitIntegerAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitIntegerAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerAssignmentContext integerAssignment() throws RecognitionException {
		IntegerAssignmentContext _localctx = new IntegerAssignmentContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_integerAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(NAME);
			setState(326);
			match(ASSIGN);
			setState(327);
			addExpression();
			setState(328);
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

	public static class DoubleDeclarationLineContext extends ParserRuleContext {
		public TerminalNode DOUBLE() { return getToken(dart_parse.DOUBLE, 0); }
		public List<DoubleDeclarationContext> doubleDeclaration() {
			return getRuleContexts(DoubleDeclarationContext.class);
		}
		public DoubleDeclarationContext doubleDeclaration(int i) {
			return getRuleContext(DoubleDeclarationContext.class,i);
		}
		public List<DoubleDeclarationAssignmentContext> doubleDeclarationAssignment() {
			return getRuleContexts(DoubleDeclarationAssignmentContext.class);
		}
		public DoubleDeclarationAssignmentContext doubleDeclarationAssignment(int i) {
			return getRuleContext(DoubleDeclarationAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public DoubleDeclarationLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDeclarationLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDoubleDeclarationLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDoubleDeclarationLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDoubleDeclarationLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleDeclarationLineContext doubleDeclarationLine() throws RecognitionException {
		DoubleDeclarationLineContext _localctx = new DoubleDeclarationLineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doubleDeclarationLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(DOUBLE);
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(331);
				doubleDeclaration();
				}
				break;
			case 2:
				{
				setState(332);
				doubleDeclarationAssignment();
				}
				break;
			}
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(335);
				match(COMMA);
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(336);
					doubleDeclaration();
					}
					break;
				case 2:
					{
					setState(337);
					doubleDeclarationAssignment();
					}
					break;
				}
				}
				}
				setState(344);
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

	public static class DoubleDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
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
		enterRule(_localctx, 38, RULE_doubleDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
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

	public static class DoubleDeclarationAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public AddDoubleExpressionContext addDoubleExpression() {
			return getRuleContext(AddDoubleExpressionContext.class,0);
		}
		public DoubleDeclarationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleDeclarationAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDoubleDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDoubleDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDoubleDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleDeclarationAssignmentContext doubleDeclarationAssignment() throws RecognitionException {
		DoubleDeclarationAssignmentContext _localctx = new DoubleDeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_doubleDeclarationAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(NAME);
			setState(348);
			match(ASSIGN);
			setState(349);
			addDoubleExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoubleAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public AddDoubleExpressionContext addDoubleExpression() {
			return getRuleContext(AddDoubleExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public DoubleAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doubleAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterDoubleAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitDoubleAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitDoubleAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoubleAssignmentContext doubleAssignment() throws RecognitionException {
		DoubleAssignmentContext _localctx = new DoubleAssignmentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_doubleAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(NAME);
			setState(352);
			match(ASSIGN);
			setState(353);
			addDoubleExpression();
			setState(354);
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

	public static class StringDeclarationLineContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(dart_parse.STRING, 0); }
		public List<StringDeclarationContext> stringDeclaration() {
			return getRuleContexts(StringDeclarationContext.class);
		}
		public StringDeclarationContext stringDeclaration(int i) {
			return getRuleContext(StringDeclarationContext.class,i);
		}
		public List<StringDeclarationAssignmentContext> stringDeclarationAssignment() {
			return getRuleContexts(StringDeclarationAssignmentContext.class);
		}
		public StringDeclarationAssignmentContext stringDeclarationAssignment(int i) {
			return getRuleContext(StringDeclarationAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public StringDeclarationLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDeclarationLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStringDeclarationLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStringDeclarationLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStringDeclarationLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDeclarationLineContext stringDeclarationLine() throws RecognitionException {
		StringDeclarationLineContext _localctx = new StringDeclarationLineContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_stringDeclarationLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			match(STRING);
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(357);
				stringDeclaration();
				}
				break;
			case 2:
				{
				setState(358);
				stringDeclarationAssignment();
				}
				break;
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(361);
				match(COMMA);
				setState(364);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(362);
					stringDeclaration();
					}
					break;
				case 2:
					{
					setState(363);
					stringDeclarationAssignment();
					}
					break;
				}
				}
				}
				setState(370);
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

	public static class StringDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
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
		enterRule(_localctx, 46, RULE_stringDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
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

	public static class StringDeclarationAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public TerminalNode STRING_LINE() { return getToken(dart_parse.STRING_LINE, 0); }
		public StringDeclarationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringDeclarationAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStringDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStringDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStringDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringDeclarationAssignmentContext stringDeclarationAssignment() throws RecognitionException {
		StringDeclarationAssignmentContext _localctx = new StringDeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_stringDeclarationAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(NAME);
			setState(374);
			match(ASSIGN);
			setState(375);
			match(STRING_LINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public TerminalNode STRING_LINE() { return getToken(dart_parse.STRING_LINE, 0); }
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public StringAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterStringAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitStringAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitStringAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringAssignmentContext stringAssignment() throws RecognitionException {
		StringAssignmentContext _localctx = new StringAssignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_stringAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(NAME);
			setState(378);
			match(ASSIGN);
			setState(379);
			match(STRING_LINE);
			setState(380);
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

	public static class BooleanDeclarationLineContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(dart_parse.BOOL, 0); }
		public List<BooleanDeclarationContext> booleanDeclaration() {
			return getRuleContexts(BooleanDeclarationContext.class);
		}
		public BooleanDeclarationContext booleanDeclaration(int i) {
			return getRuleContext(BooleanDeclarationContext.class,i);
		}
		public List<BooleanDeclarationAssignmentContext> booleanDeclarationAssignment() {
			return getRuleContexts(BooleanDeclarationAssignmentContext.class);
		}
		public BooleanDeclarationAssignmentContext booleanDeclarationAssignment(int i) {
			return getRuleContext(BooleanDeclarationAssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(dart_parse.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(dart_parse.COMMA, i);
		}
		public BooleanDeclarationLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanDeclarationLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBooleanDeclarationLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBooleanDeclarationLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBooleanDeclarationLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanDeclarationLineContext booleanDeclarationLine() throws RecognitionException {
		BooleanDeclarationLineContext _localctx = new BooleanDeclarationLineContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_booleanDeclarationLine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(BOOL);
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(383);
				booleanDeclaration();
				}
				break;
			case 2:
				{
				setState(384);
				booleanDeclarationAssignment();
				}
				break;
			}
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(387);
				match(COMMA);
				setState(390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(388);
					booleanDeclaration();
					}
					break;
				case 2:
					{
					setState(389);
					booleanDeclarationAssignment();
					}
					break;
				}
				}
				}
				setState(396);
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

	public static class BooleanDeclarationContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public BooleanDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBooleanDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBooleanDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBooleanDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanDeclarationContext booleanDeclaration() throws RecognitionException {
		BooleanDeclarationContext _localctx = new BooleanDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_booleanDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
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

	public static class BooleanDeclarationAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public BooleanDeclarationAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanDeclarationAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBooleanDeclarationAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBooleanDeclarationAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBooleanDeclarationAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanDeclarationAssignmentContext booleanDeclarationAssignment() throws RecognitionException {
		BooleanDeclarationAssignmentContext _localctx = new BooleanDeclarationAssignmentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_booleanDeclarationAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			match(NAME);
			setState(400);
			match(ASSIGN);
			setState(401);
			booleans();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanAssignmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(dart_parse.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(dart_parse.ASSIGN, 0); }
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(dart_parse.SEMICOLON, 0); }
		public BooleanAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterBooleanAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitBooleanAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitBooleanAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanAssignmentContext booleanAssignment() throws RecognitionException {
		BooleanAssignmentContext _localctx = new BooleanAssignmentContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_booleanAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(NAME);
			setState(404);
			match(ASSIGN);
			setState(405);
			booleans();
			setState(406);
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
		enterRule(_localctx, 60, RULE_addExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			multiplyExpression();
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(409);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(410);
				multiplyExpression();
				}
				}
				setState(415);
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
		enterRule(_localctx, 62, RULE_multiplyExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			number();
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(417);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(418);
				number();
				}
				}
				setState(423);
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
		enterRule(_localctx, 64, RULE_addDoubleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			multiplyDoubleExpression();
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(425);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(426);
				multiplyDoubleExpression();
				}
				}
				setState(431);
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
		enterRule(_localctx, 66, RULE_multiplyDoubleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(432);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(433);
				numberDouble();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTY || _la==DIVIDE) {
				{
				{
				setState(436);
				_la = _input.LA(1);
				if ( !(_la==MULTY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(439);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
					{
					setState(437);
					number();
					}
					break;
				case NUMBERDOUBLE:
					{
					setState(438);
					numberDouble();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(445);
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
		enterRule(_localctx, 68, RULE_booleans);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		enterRule(_localctx, 70, RULE_booleanOperation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(448);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(449);
				numberDouble();
				}
				break;
			case NAME:
				{
				setState(450);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(453);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ANGLE_BRKT_OP) | (1L << ANGLE_BRKT_CL) | (1L << EQUAL) | (1L << NOTEQUAL) | (1L << GTE) | (1L << LTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(454);
				number();
				}
				break;
			case NUMBERDOUBLE:
				{
				setState(455);
				numberDouble();
				}
				break;
			case NAME:
				{
				setState(456);
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
		enterRule(_localctx, 72, RULE_dartAllListsDeclaration);
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				dartListStringDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				dartListIntDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(461);
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
		enterRule(_localctx, 74, RULE_dartListStringDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			match(LIST);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(465);
				match(ANGLE_BRKT_OP);
				setState(466);
				match(STRING);
				setState(467);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(470);
			match(NAME);
			setState(471);
			match(ASSIGN);
			setState(472);
			match(SQR_BRKT_OP);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING_LINE) {
				{
				setState(473);
				match(STRING_LINE);
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(474);
						match(COMMA);
						setState(475);
						match(STRING_LINE);
						}
						} 
					}
					setState(480);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
			}

			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(483);
				match(COMMA);
				}
			}

			setState(486);
			match(SQR_BRKT_CL);
			setState(487);
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
		enterRule(_localctx, 76, RULE_dartListIntDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			match(LIST);
			setState(493);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(490);
				match(ANGLE_BRKT_OP);
				setState(491);
				match(INT);
				setState(492);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(495);
			match(NAME);
			setState(496);
			match(ASSIGN);
			setState(497);
			match(SQR_BRKT_OP);
			setState(506);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUMBER) {
				{
				setState(498);
				number();
				setState(503);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(499);
						match(COMMA);
						setState(500);
						number();
						}
						} 
					}
					setState(505);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				}
			}

			setState(509);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(508);
				match(COMMA);
				}
			}

			setState(511);
			match(SQR_BRKT_CL);
			setState(512);
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
		enterRule(_localctx, 78, RULE_dartListBoolDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			match(LIST);
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ANGLE_BRKT_OP) {
				{
				setState(515);
				match(ANGLE_BRKT_OP);
				setState(516);
				match(BOOL);
				setState(517);
				match(ANGLE_BRKT_CL);
				}
			}

			setState(520);
			match(NAME);
			setState(521);
			match(ASSIGN);
			setState(522);
			match(SQR_BRKT_OP);
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRUE || _la==FALSE) {
				{
				setState(523);
				booleans();
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(524);
						match(COMMA);
						setState(525);
						booleans();
						}
						} 
					}
					setState(530);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				}
			}

			setState(534);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(533);
				match(COMMA);
				}
			}

			setState(536);
			match(SQR_BRKT_CL);
			setState(537);
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
		enterRule(_localctx, 80, RULE_widgetsDeclaration);
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONTAINER:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				conatinerDeclaration();
				}
				break;
			case EXPANDED:
				enterOuterAlt(_localctx, 2);
				{
				setState(540);
				expandedDeclaration();
				}
				break;
			case MATERIALBUTTON:
				enterOuterAlt(_localctx, 3);
				{
				setState(541);
				materialButtonDeclaration();
				}
				break;
			case MATERIALAPP:
				enterOuterAlt(_localctx, 4);
				{
				setState(542);
				materialAppDeclaration();
				}
				break;
			case SCAFFOLD:
				enterOuterAlt(_localctx, 5);
				{
				setState(543);
				scaffoldDeclaration();
				}
				break;
			case PADDING:
				enterOuterAlt(_localctx, 6);
				{
				setState(544);
				paddingDeclaration();
				}
				break;
			case ROW:
			case COLUMN:
				enterOuterAlt(_localctx, 7);
				{
				setState(545);
				rowColumnDeclaration();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 8);
				{
				setState(546);
				textDeclaration();
				}
				break;
			case IMAGE:
				enterOuterAlt(_localctx, 9);
				{
				setState(547);
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
		enterRule(_localctx, 82, RULE_expandedDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(EXPANDED);
			setState(551);
			match(BRKT_OP);
			setState(552);
			childPropertyDeclaration();
			setState(554);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(553);
				match(COMMA);
				}
			}

			setState(556);
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
		enterRule(_localctx, 84, RULE_paddingDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(PADDING);
			setState(559);
			match(BRKT_OP);
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PADDINGSMALL:
				{
				{
				setState(560);
				paddingPropertyDeclaration();
				setState(561);
				match(COMMA);
				setState(562);
				childPropertyDeclaration();
				}
				}
				break;
			case CHILD:
				{
				{
				setState(564);
				childPropertyDeclaration();
				setState(565);
				match(COMMA);
				setState(566);
				paddingPropertyDeclaration();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(570);
				match(COMMA);
				}
			}

			setState(573);
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
		enterRule(_localctx, 86, RULE_scaffoldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(SCAFFOLD);
			setState(576);
			match(BRKT_OP);
			setState(577);
			bodyPropertyDeclaration();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(578);
				match(COMMA);
				}
			}

			setState(581);
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
		enterRule(_localctx, 88, RULE_textDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
			match(TEXT);
			setState(584);
			match(BRKT_OP);
			setState(585);
			match(STRING_LINE);
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(586);
				match(COMMA);
				}
			}

			setState(589);
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
		enterRule(_localctx, 90, RULE_materialAppDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			match(MATERIALAPP);
			setState(592);
			match(BRKT_OP);
			setState(593);
			homePropertyDeclaration();
			setState(595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(594);
				match(COMMA);
				}
			}

			setState(597);
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
		enterRule(_localctx, 92, RULE_materialButtonDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(MATERIALBUTTON);
			setState(600);
			match(BRKT_OP);
			setState(601);
			onPressedPropertyDeclaration();
			setState(602);
			childPropertyDeclaration();
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(603);
				match(COMMA);
				}
			}

			setState(606);
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
		enterRule(_localctx, 94, RULE_conatinerDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608);
			match(CONTAINER);
			setState(609);
			match(BRKT_OP);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CHILD) | (1L << WIDTH) | (1L << HEIGHT))) != 0)) {
				{
				setState(610);
				conatinerPropertiesDeclaration();
				}
			}

			setState(617);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(613);
					match(COMMA);
					setState(614);
					conatinerPropertiesDeclaration();
					}
					} 
				}
				setState(619);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(620);
				match(COMMA);
				}
			}

			setState(623);
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
		enterRule(_localctx, 96, RULE_rowColumnDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			_la = _input.LA(1);
			if ( !(_la==ROW || _la==COLUMN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(626);
			match(BRKT_OP);
			setState(627);
			childrenPropertyDeclaration();
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(628);
				match(COMMA);
				}
			}

			setState(631);
			match(BRKT_CL);
			setState(633);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(632);
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
		enterRule(_localctx, 98, RULE_imageDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(IMAGE);
			setState(636);
			match(DOT);
			setState(637);
			match(NETWORK);
			setState(638);
			match(BRKT_OP);
			setState(639);
			_la = _input.LA(1);
			if ( !(_la==STRING_LINE || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(640);
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
		enterRule(_localctx, 100, RULE_conatinerPropertiesDeclaration);
		try {
			setState(645);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEIGHT:
				enterOuterAlt(_localctx, 1);
				{
				setState(642);
				heightPropertyDeclaration();
				}
				break;
			case WIDTH:
				enterOuterAlt(_localctx, 2);
				{
				setState(643);
				widthPropertyDeclaration();
				}
				break;
			case CHILD:
				enterOuterAlt(_localctx, 3);
				{
				setState(644);
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
		enterRule(_localctx, 102, RULE_paddingPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			match(PADDINGSMALL);
			setState(648);
			match(COLON);
			setState(649);
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
		enterRule(_localctx, 104, RULE_edgeInsistAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(EDGEINSETS);
			setState(652);
			match(DOT);
			setState(653);
			match(ALL);
			setState(654);
			match(BRKT_OP);
			setState(655);
			number();
			setState(656);
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
		enterRule(_localctx, 106, RULE_onPressedPropertyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			match(ONPRESSED);
			setState(659);
			match(COLON);
			setState(660);
			match(BRKT_OP);
			setState(661);
			match(BRKT_CL);
			setState(662);
			match(CRLY_BRKT_OP);
			setState(667);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION) | (1L << SETSTATE))) != 0) || _la==NAME) {
				{
				setState(665);
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
					setState(663);
					statement();
					}
					break;
				case SETSTATE:
					{
					setState(664);
					setStatePressedDeclaration();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(670);
			match(CRLY_BRKT_CL);
			setState(671);
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
		enterRule(_localctx, 108, RULE_setStatePressedDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(SETSTATE);
			setState(674);
			match(BRKT_OP);
			setState(675);
			match(BRKT_OP);
			setState(676);
			match(BRKT_CL);
			setState(677);
			match(CRLY_BRKT_OP);
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0) || _la==NAME) {
				{
				{
				setState(678);
				statement();
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			match(CRLY_BRKT_CL);
			setState(685);
			match(BRKT_CL);
			setState(686);
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
		enterRule(_localctx, 110, RULE_heightPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(HEIGHT);
			setState(689);
			match(COLON);
			setState(690);
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
		enterRule(_localctx, 112, RULE_widthPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			match(WIDTH);
			setState(693);
			match(COLON);
			setState(694);
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
		enterRule(_localctx, 114, RULE_homePropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(HOME);
			setState(697);
			match(COLON);
			setState(698);
			match(NAME);
			setState(699);
			match(BRKT_OP);
			setState(700);
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
		enterRule(_localctx, 116, RULE_childPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			match(CHILD);
			setState(703);
			match(COLON);
			setState(704);
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
		enterRule(_localctx, 118, RULE_childrenPropertyDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(706);
			match(CHILDREN);
			setState(707);
			match(COLON);
			setState(708);
			match(SQR_BRKT_OP);
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (CONTAINER - 56)) | (1L << (EXPANDED - 56)) | (1L << (MATERIALBUTTON - 56)) | (1L << (MATERIALAPP - 56)) | (1L << (SCAFFOLD - 56)) | (1L << (PADDING - 56)) | (1L << (ROW - 56)) | (1L << (COLUMN - 56)) | (1L << (IMAGE - 56)) | (1L << (TEXT - 56)))) != 0)) {
				{
				setState(709);
				widgetsDeclaration();
				setState(714);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(710);
						match(COMMA);
						setState(711);
						widgetsDeclaration();
						}
						} 
					}
					setState(716);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
				}
				}
			}

			setState(720);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(719);
				match(COMMA);
				}
			}

			setState(722);
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
		enterRule(_localctx, 120, RULE_bodyPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(BODY);
			setState(725);
			match(COLON);
			setState(726);
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
		enterRule(_localctx, 122, RULE_buildContextDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(728);
			match(BUILDCONTEXT);
			setState(729);
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
		enterRule(_localctx, 124, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(731);
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
		enterRule(_localctx, 126, RULE_numberDouble);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
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
		enterRule(_localctx, 128, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(IF);
			setState(736);
			match(BRKT_OP);
			setState(737);
			conditionExpr();
			setState(738);
			match(BRKT_CL);
			setState(739);
			block();
			setState(753);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ELSEIF) {
					{
					{
					setState(740);
					match(ELSEIF);
					setState(741);
					match(BRKT_OP);
					setState(742);
					conditionExpr();
					setState(743);
					match(BRKT_CL);
					setState(744);
					block();
					}
					}
					setState(750);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				{
				setState(751);
				match(ELSE);
				setState(752);
				block();
				}
				}
				break;
			}
			setState(757);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(755);
				match(ELSE);
				setState(756);
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
		enterRule(_localctx, 130, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(759);
			match(WHILE);
			setState(760);
			match(BRKT_OP);
			setState(761);
			conditionExpr();
			setState(762);
			match(BRKT_CL);
			setState(763);
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
		enterRule(_localctx, 132, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(CRLY_BRKT_OP);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FOR) | (1L << IF) | (1L << WHILE) | (1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0) || _la==NAME) {
				{
				{
				setState(766);
				statement();
				}
				}
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(772);
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
		enterRule(_localctx, 134, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				{
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FUNCTION) {
					{
					setState(774);
					match(FUNCTION);
					}
				}

				setState(777);
				functionType();
				}
				}
				break;
			case 2:
				{
				setState(778);
				match(FUNCTION);
				}
				break;
			}
			setState(781);
			match(NAME);
			setState(782);
			match(BRKT_OP);
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << LIST) | (1L << FINAL) | (1L << CONST) | (1L << VAR) | (1L << VOID) | (1L << FUNCTION))) != 0)) {
				{
				setState(783);
				parameters();
				}
			}

			setState(786);
			match(BRKT_CL);
			setState(787);
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
		enterRule(_localctx, 136, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(789);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << VAR) | (1L << VOID))) != 0)) ) {
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
		enterRule(_localctx, 138, RULE_parameters);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			dartDeclaration();
			setState(796);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(792);
					match(COMMA);
					setState(793);
					dartDeclaration();
					}
					} 
				}
				setState(798);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			setState(800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(799);
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

	public static class AssignmentContext extends ParserRuleContext {
		public IntegerAssignmentContext integerAssignment() {
			return getRuleContext(IntegerAssignmentContext.class,0);
		}
		public DoubleAssignmentContext doubleAssignment() {
			return getRuleContext(DoubleAssignmentContext.class,0);
		}
		public BooleanAssignmentContext booleanAssignment() {
			return getRuleContext(BooleanAssignmentContext.class,0);
		}
		public StringAssignmentContext stringAssignment() {
			return getRuleContext(StringAssignmentContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_assignment);
		try {
			setState(806);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				integerAssignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(803);
				doubleAssignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(804);
				booleanAssignment();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(805);
				stringAssignment();
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
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
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
		enterRule(_localctx, 142, RULE_statement);
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(808);
				dartDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(810);
				forStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(811);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(812);
				function();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(813);
				assignment();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(dart_parse.FOR, 0); }
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(dart_parse.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(dart_parse.SEMICOLON, i);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public VariableAssignmentContext variableAssignment() {
			return getRuleContext(VariableAssignmentContext.class,0);
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
		enterRule(_localctx, 144, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(FOR);
			setState(817);
			match(BRKT_OP);
			setState(819);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << BOOL) | (1L << DOUBLE) | (1L << FINAL) | (1L << CONST))) != 0)) {
				{
				setState(818);
				variable();
				}
			}

			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BRKT_OP || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (TRUE - 80)) | (1L << (FALSE - 80)) | (1L << (NAME - 80)) | (1L << (NUMBERDOUBLE - 80)) | (1L << (NUMBER - 80)))) != 0)) {
				{
				setState(821);
				conditionExpr();
				}
			}

			setState(824);
			match(SEMICOLON);
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(825);
				variableAssignment();
				}
			}

			setState(828);
			match(SEMICOLON);
			setState(829);
			match(BRKT_CL);
			setState(830);
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

	public static class VariableAssignmentContext extends ParserRuleContext {
		public IntegerDeclarationContext integerDeclaration() {
			return getRuleContext(IntegerDeclarationContext.class,0);
		}
		public StringDeclarationContext stringDeclaration() {
			return getRuleContext(StringDeclarationContext.class,0);
		}
		public BooleanDeclarationContext booleanDeclaration() {
			return getRuleContext(BooleanDeclarationContext.class,0);
		}
		public DoubleDeclarationContext doubleDeclaration() {
			return getRuleContext(DoubleDeclarationContext.class,0);
		}
		public VariableAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterVariableAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitVariableAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitVariableAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableAssignmentContext variableAssignment() throws RecognitionException {
		VariableAssignmentContext _localctx = new VariableAssignmentContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_variableAssignment);
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				integerDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				stringDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				booleanDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				doubleDeclaration();
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

	public static class ConditionExprContext extends ParserRuleContext {
		public List<AndExprContext> andExpr() {
			return getRuleContexts(AndExprContext.class);
		}
		public AndExprContext andExpr(int i) {
			return getRuleContext(AndExprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(dart_parse.OR); }
		public TerminalNode OR(int i) {
			return getToken(dart_parse.OR, i);
		}
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
		enterRule(_localctx, 148, RULE_conditionExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			andExpr();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(839);
				match(OR);
				setState(840);
				andExpr();
				}
				}
				setState(845);
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

	public static class AndExprContext extends ParserRuleContext {
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
		public AndExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExprContext andExpr() throws RecognitionException {
		AndExprContext _localctx = new AndExprContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_andExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			binaryExpr();
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(847);
				match(AND);
				setState(848);
				binaryExpr();
				}
				}
				setState(853);
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
		enterRule(_localctx, 152, RULE_binaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			term();
			setState(859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL || _la==NOTEQUAL) {
				{
				{
				setState(855);
				_la = _input.LA(1);
				if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(856);
				term();
				}
				}
				setState(861);
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

	public static class TermContext extends ParserRuleContext {
		public NumericExprContext numericExpr() {
			return getRuleContext(NumericExprContext.class,0);
		}
		public TerminalNode BRKT_OP() { return getToken(dart_parse.BRKT_OP, 0); }
		public ConditionExprContext conditionExpr() {
			return getRuleContext(ConditionExprContext.class,0);
		}
		public TerminalNode BRKT_CL() { return getToken(dart_parse.BRKT_CL, 0); }
		public BooleansContext booleans() {
			return getRuleContext(BooleansContext.class,0);
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
		enterRule(_localctx, 154, RULE_term);
		try {
			setState(868);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case NUMBERDOUBLE:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				numericExpr();
				}
				break;
			case BRKT_OP:
				enterOuterAlt(_localctx, 2);
				{
				setState(863);
				match(BRKT_OP);
				setState(864);
				conditionExpr();
				setState(865);
				match(BRKT_CL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
				booleans();
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

	public static class NumericExprContext extends ParserRuleContext {
		public List<NumericTermContext> numericTerm() {
			return getRuleContexts(NumericTermContext.class);
		}
		public NumericTermContext numericTerm(int i) {
			return getRuleContext(NumericTermContext.class,i);
		}
		public TerminalNode LTE() { return getToken(dart_parse.LTE, 0); }
		public TerminalNode GTE() { return getToken(dart_parse.GTE, 0); }
		public TerminalNode EQUAL() { return getToken(dart_parse.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(dart_parse.NOTEQUAL, 0); }
		public NumericExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterNumericExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitNumericExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitNumericExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericExprContext numericExpr() throws RecognitionException {
		NumericExprContext _localctx = new NumericExprContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_numericExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			numericTerm();
			setState(871);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << GTE) | (1L << LTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(872);
			numericTerm();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericTermContext extends ParserRuleContext {
		public AddExpressionContext addExpression() {
			return getRuleContext(AddExpressionContext.class,0);
		}
		public AddDoubleExpressionContext addDoubleExpression() {
			return getRuleContext(AddDoubleExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumericTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericTerm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).enterNumericTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof dart_parseListener ) ((dart_parseListener)listener).exitNumericTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof dart_parseVisitor ) return ((dart_parseVisitor<? extends T>)visitor).visitNumericTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumericTermContext numericTerm() throws RecognitionException {
		NumericTermContext _localctx = new NumericTermContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_numericTerm);
		try {
			setState(877);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				addExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(875);
				addDoubleExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(876);
				identifier();
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
		enterRule(_localctx, 160, RULE_prefixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INC) | (1L << DEC) | (1L << NOT))) != 0)) ) {
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
		enterRule(_localctx, 162, RULE_postfixUnaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
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
		int _startState = 164;
		enterRecursionRule(_localctx, 164, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(884);
				identifier();
				}
				break;
			case 2:
				{
				setState(885);
				prefixUnaryOperator();
				setState(886);
				expression(5);
				}
				break;
			case 3:
				{
				setState(888);
				addExpression();
				setState(889);
				postfixUnaryOperator();
				}
				break;
			case 4:
				{
				setState(891);
				functionCall();
				}
				break;
			case 5:
				{
				setState(892);
				match(BRKT_OP);
				setState(893);
				expression(0);
				setState(894);
				match(BRKT_CL);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(902);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(898);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(899);
					postfixUnaryOperator();
					}
					} 
				}
				setState(904);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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
		enterRule(_localctx, 166, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(905);
			_la = _input.LA(1);
			if ( !(((((_la - 34)) & ~0x3f) == 0 && ((1L << (_la - 34)) & ((1L << (NULL - 34)) | (1L << (INT - 34)) | (1L << (STRING - 34)) | (1L << (DOUBLE - 34)) | (1L << (TRUE - 34)) | (1L << (FALSE - 34)))) != 0)) ) {
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
		enterRule(_localctx, 168, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
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
		enterRule(_localctx, 170, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(909);
			identifier();
			setState(910);
			match(BRKT_OP);
			setState(912);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BRKT_OP) | (1L << INC) | (1L << DEC) | (1L << NOT))) != 0) || _la==NAME || _la==NUMBER) {
				{
				setState(911);
				arguments();
				}
			}

			setState(914);
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
		enterRule(_localctx, 172, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(916);
			expression(0);
			setState(921);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(917);
				match(COMMA);
				setState(918);
				expression(0);
				}
				}
				setState(923);
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
		case 82:
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
		"\u0004\u0001X\u039d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007J\u0002"+
		"K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007O\u0002"+
		"P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007T\u0002"+
		"U\u0007U\u0002V\u0007V\u0001\u0000\u0001\u0000\u0005\u0000\u00b1\b\u0000"+
		"\n\u0000\f\u0000\u00b4\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001\u00b9\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u00bf\b\u0002\n\u0002\f\u0002\u00c2\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u00cb\b\u0003\n\u0003\f\u0003\u00ce\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00db\b\u0005\n\u0005\f\u0005"+
		"\u00de\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0005\u0006\u00ec\b\u0006\n\u0006\f\u0006\u00ef\t\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0003\b\u00ff\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0117\b\u000b\n\u000b\f\u000b\u011a\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u0124\b\f\u0001\r\u0003\r\u0127\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u012d\b\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u0134\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u0139\b\u000e\u0005\u000e\u013b\b\u000e\n\u000e\f\u000e\u013e\t"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u014e\b\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0153\b\u0012\u0005\u0012\u0155\b\u0012"+
		"\n\u0012\f\u0012\u0158\t\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0168"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u016d\b\u0016"+
		"\u0005\u0016\u016f\b\u0016\n\u0016\f\u0016\u0172\t\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0003\u001a\u0182\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003"+
		"\u001a\u0187\b\u001a\u0005\u001a\u0189\b\u001a\n\u001a\f\u001a\u018c\t"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u019c\b\u001e\n\u001e\f\u001e"+
		"\u019f\t\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01a4\b"+
		"\u001f\n\u001f\f\u001f\u01a7\t\u001f\u0001 \u0001 \u0001 \u0005 \u01ac"+
		"\b \n \f \u01af\t \u0001!\u0001!\u0003!\u01b3\b!\u0001!\u0001!\u0001!"+
		"\u0003!\u01b8\b!\u0005!\u01ba\b!\n!\f!\u01bd\t!\u0001\"\u0001\"\u0001"+
		"#\u0001#\u0001#\u0003#\u01c4\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u01ca"+
		"\b#\u0001$\u0001$\u0001$\u0003$\u01cf\b$\u0001%\u0001%\u0001%\u0001%\u0003"+
		"%\u01d5\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0005%\u01dd\b%\n"+
		"%\f%\u01e0\t%\u0003%\u01e2\b%\u0001%\u0003%\u01e5\b%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0003&\u01ee\b&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0001&\u0005&\u01f6\b&\n&\f&\u01f9\t&\u0003&\u01fb\b&\u0001&"+
		"\u0003&\u01fe\b&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0003\'\u0207\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u020f\b\'\n\'\f\'\u0212\t\'\u0003\'\u0214\b\'\u0001\'\u0003\'\u0217"+
		"\b\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0003(\u0225\b(\u0001)\u0001)\u0001)\u0001)\u0003"+
		")\u022b\b)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0001*\u0003*\u0239\b*\u0001*\u0003*\u023c\b*\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0003+\u0244\b+\u0001+\u0001+\u0001,\u0001"+
		",\u0001,\u0001,\u0003,\u024c\b,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0003-\u0254\b-\u0001-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001.\u0003"+
		".\u025d\b.\u0001.\u0001.\u0001/\u0001/\u0001/\u0003/\u0264\b/\u0001/\u0001"+
		"/\u0005/\u0268\b/\n/\f/\u026b\t/\u0001/\u0003/\u026e\b/\u0001/\u0001/"+
		"\u00010\u00010\u00010\u00010\u00030\u0276\b0\u00010\u00010\u00030\u027a"+
		"\b0\u00011\u00011\u00011\u00011\u00011\u00011\u00011\u00012\u00012\u0001"+
		"2\u00032\u0286\b2\u00013\u00013\u00013\u00013\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00015\u00015\u00015\u00015\u00015\u00015\u0001"+
		"5\u00055\u029a\b5\n5\f5\u029d\t5\u00015\u00015\u00015\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00056\u02a8\b6\n6\f6\u02ab\t6\u00016\u00016\u0001"+
		"6\u00016\u00017\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"9\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001:\u0001:\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0001;\u0005;\u02c9\b;\n;\f;\u02cc\t;\u0003"+
		";\u02ce\b;\u0001;\u0003;\u02d1\b;\u0001;\u0001;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001=\u0001=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0005@\u02eb"+
		"\b@\n@\f@\u02ee\t@\u0001@\u0001@\u0003@\u02f2\b@\u0001@\u0001@\u0003@"+
		"\u02f6\b@\u0001A\u0001A\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0005"+
		"B\u0300\bB\nB\fB\u0303\tB\u0001B\u0001B\u0001C\u0003C\u0308\bC\u0001C"+
		"\u0001C\u0003C\u030c\bC\u0001C\u0001C\u0001C\u0003C\u0311\bC\u0001C\u0001"+
		"C\u0001C\u0001D\u0001D\u0001E\u0001E\u0001E\u0005E\u031b\bE\nE\fE\u031e"+
		"\tE\u0001E\u0003E\u0321\bE\u0001F\u0001F\u0001F\u0001F\u0003F\u0327\b"+
		"F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003G\u032f\bG\u0001H\u0001"+
		"H\u0001H\u0003H\u0334\bH\u0001H\u0003H\u0337\bH\u0001H\u0001H\u0003H\u033b"+
		"\bH\u0001H\u0001H\u0001H\u0001H\u0001I\u0001I\u0001I\u0001I\u0003I\u0345"+
		"\bI\u0001J\u0001J\u0001J\u0005J\u034a\bJ\nJ\fJ\u034d\tJ\u0001K\u0001K"+
		"\u0001K\u0005K\u0352\bK\nK\fK\u0355\tK\u0001L\u0001L\u0001L\u0005L\u035a"+
		"\bL\nL\fL\u035d\tL\u0001M\u0001M\u0001M\u0001M\u0001M\u0001M\u0003M\u0365"+
		"\bM\u0001N\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0003O\u036e\bO\u0001"+
		"P\u0001P\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001"+
		"R\u0001R\u0001R\u0001R\u0001R\u0001R\u0001R\u0003R\u0381\bR\u0001R\u0001"+
		"R\u0005R\u0385\bR\nR\fR\u0388\tR\u0001S\u0001S\u0001T\u0001T\u0001U\u0001"+
		"U\u0001U\u0003U\u0391\bU\u0001U\u0001U\u0001V\u0001V\u0001V\u0005V\u0398"+
		"\bV\nV\fV\u039b\tV\u0001V\u0000\u0001\u00a4W\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u0000\r\u0001\u0000+,\u0001\u0000"+
		"\u0013\u0014\u0001\u0000\u0015\u0016\u0001\u0000PQ\u0003\u0000\t\n\u0018"+
		"\u0018\u001a\u001c\u0001\u0000EF\u0002\u000011RR\u0002\u0000#&-.\u0002"+
		"\u0000\u0018\u0018\u001a\u001a\u0002\u0000\u0018\u0018\u001a\u001c\u0001"+
		"\u0000\u001f!\u0001\u0000\u001f \u0003\u0000\"$&&PQ\u03ba\u0000\u00b2"+
		"\u0001\u0000\u0000\u0000\u0002\u00b8\u0001\u0000\u0000\u0000\u0004\u00ba"+
		"\u0001\u0000\u0000\u0000\u0006\u00c5\u0001\u0000\u0000\u0000\b\u00d2\u0001"+
		"\u0000\u0000\u0000\n\u00d5\u0001\u0000\u0000\u0000\f\u00e2\u0001\u0000"+
		"\u0000\u0000\u000e\u00f3\u0001\u0000\u0000\u0000\u0010\u00fe\u0001\u0000"+
		"\u0000\u0000\u0012\u0100\u0001\u0000\u0000\u0000\u0014\u0108\u0001\u0000"+
		"\u0000\u0000\u0016\u010f\u0001\u0000\u0000\u0000\u0018\u0123\u0001\u0000"+
		"\u0000\u0000\u001a\u0126\u0001\u0000\u0000\u0000\u001c\u0130\u0001\u0000"+
		"\u0000\u0000\u001e\u013f\u0001\u0000\u0000\u0000 \u0141\u0001\u0000\u0000"+
		"\u0000\"\u0145\u0001\u0000\u0000\u0000$\u014a\u0001\u0000\u0000\u0000"+
		"&\u0159\u0001\u0000\u0000\u0000(\u015b\u0001\u0000\u0000\u0000*\u015f"+
		"\u0001\u0000\u0000\u0000,\u0164\u0001\u0000\u0000\u0000.\u0173\u0001\u0000"+
		"\u0000\u00000\u0175\u0001\u0000\u0000\u00002\u0179\u0001\u0000\u0000\u0000"+
		"4\u017e\u0001\u0000\u0000\u00006\u018d\u0001\u0000\u0000\u00008\u018f"+
		"\u0001\u0000\u0000\u0000:\u0193\u0001\u0000\u0000\u0000<\u0198\u0001\u0000"+
		"\u0000\u0000>\u01a0\u0001\u0000\u0000\u0000@\u01a8\u0001\u0000\u0000\u0000"+
		"B\u01b2\u0001\u0000\u0000\u0000D\u01be\u0001\u0000\u0000\u0000F\u01c3"+
		"\u0001\u0000\u0000\u0000H\u01ce\u0001\u0000\u0000\u0000J\u01d0\u0001\u0000"+
		"\u0000\u0000L\u01e9\u0001\u0000\u0000\u0000N\u0202\u0001\u0000\u0000\u0000"+
		"P\u0224\u0001\u0000\u0000\u0000R\u0226\u0001\u0000\u0000\u0000T\u022e"+
		"\u0001\u0000\u0000\u0000V\u023f\u0001\u0000\u0000\u0000X\u0247\u0001\u0000"+
		"\u0000\u0000Z\u024f\u0001\u0000\u0000\u0000\\\u0257\u0001\u0000\u0000"+
		"\u0000^\u0260\u0001\u0000\u0000\u0000`\u0271\u0001\u0000\u0000\u0000b"+
		"\u027b\u0001\u0000\u0000\u0000d\u0285\u0001\u0000\u0000\u0000f\u0287\u0001"+
		"\u0000\u0000\u0000h\u028b\u0001\u0000\u0000\u0000j\u0292\u0001\u0000\u0000"+
		"\u0000l\u02a1\u0001\u0000\u0000\u0000n\u02b0\u0001\u0000\u0000\u0000p"+
		"\u02b4\u0001\u0000\u0000\u0000r\u02b8\u0001\u0000\u0000\u0000t\u02be\u0001"+
		"\u0000\u0000\u0000v\u02c2\u0001\u0000\u0000\u0000x\u02d4\u0001\u0000\u0000"+
		"\u0000z\u02d8\u0001\u0000\u0000\u0000|\u02db\u0001\u0000\u0000\u0000~"+
		"\u02dd\u0001\u0000\u0000\u0000\u0080\u02df\u0001\u0000\u0000\u0000\u0082"+
		"\u02f7\u0001\u0000\u0000\u0000\u0084\u02fd\u0001\u0000\u0000\u0000\u0086"+
		"\u030b\u0001\u0000\u0000\u0000\u0088\u0315\u0001\u0000\u0000\u0000\u008a"+
		"\u0317\u0001\u0000\u0000\u0000\u008c\u0326\u0001\u0000\u0000\u0000\u008e"+
		"\u032e\u0001\u0000\u0000\u0000\u0090\u0330\u0001\u0000\u0000\u0000\u0092"+
		"\u0344\u0001\u0000\u0000\u0000\u0094\u0346\u0001\u0000\u0000\u0000\u0096"+
		"\u034e\u0001\u0000\u0000\u0000\u0098\u0356\u0001\u0000\u0000\u0000\u009a"+
		"\u0364\u0001\u0000\u0000\u0000\u009c\u0366\u0001\u0000\u0000\u0000\u009e"+
		"\u036d\u0001\u0000\u0000\u0000\u00a0\u036f\u0001\u0000\u0000\u0000\u00a2"+
		"\u0371\u0001\u0000\u0000\u0000\u00a4\u0380\u0001\u0000\u0000\u0000\u00a6"+
		"\u0389\u0001\u0000\u0000\u0000\u00a8\u038b\u0001\u0000\u0000\u0000\u00aa"+
		"\u038d\u0001\u0000\u0000\u0000\u00ac\u0394\u0001\u0000\u0000\u0000\u00ae"+
		"\u00b1\u0003\u0002\u0001\u0000\u00af\u00b1\u0003\u0018\f\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u0001\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b9\u0003\u0004\u0002\u0000\u00b6\u00b9"+
		"\u0003\b\u0004\u0000\u00b7\u00b9\u0003\u0006\u0003\u0000\u00b8\u00b5\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u0003\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005"+
		"\u0001\u0000\u0000\u00bb\u00bc\u0005R\u0000\u0000\u00bc\u00c0\u0005\u0007"+
		"\u0000\u0000\u00bd\u00bf\u0003\u0018\f\u0000\u00be\u00bd\u0001\u0000\u0000"+
		"\u0000\u00bf\u00c2\u0001\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000\u00c1\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005\b\u0000\u0000"+
		"\u00c4\u0005\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0001\u0000\u0000"+
		"\u00c6\u00c7\u0005R\u0000\u0000\u00c7\u00c8\u0005O\u0000\u0000\u00c8\u00cc"+
		"\u0005\u0007\u0000\u0000\u00c9\u00cb\u0003\u0018\f\u0000\u00ca\u00c9\u0001"+
		"\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000\u0000\u00cc\u00ca\u0001"+
		"\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001"+
		"\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000\u0000\u00cf\u00d0\u0003"+
		"\u0016\u000b\u0000\u00d0\u00d1\u0005\b\u0000\u0000\u00d1\u0007\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d3\u0003\n\u0005\u0000\u00d3\u00d4\u0003\f\u0006"+
		"\u0000\u00d4\t\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005\u0001\u0000\u0000"+
		"\u00d6\u00d7\u0005R\u0000\u0000\u00d7\u00d8\u0005N\u0000\u0000\u00d8\u00dc"+
		"\u0005\u0007\u0000\u0000\u00d9\u00db\u0003\u0018\f\u0000\u00da\u00d9\u0001"+
		"\u0000\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001"+
		"\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e0\u0003"+
		"\u000e\u0007\u0000\u00e0\u00e1\u0005\b\u0000\u0000\u00e1\u000b\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e3\u0005\u0001\u0000\u0000\u00e3\u00e4\u0005R\u0000"+
		"\u0000\u00e4\u00e5\u0005(\u0000\u0000\u00e5\u00e6\u00053\u0000\u0000\u00e6"+
		"\u00e7\u0005\t\u0000\u0000\u00e7\u00e8\u0005R\u0000\u0000\u00e8\u00e9"+
		"\u0005\n\u0000\u0000\u00e9\u00ed\u0005\u0007\u0000\u0000\u00ea\u00ec\u0003"+
		"\u0018\f\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000"+
		"\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f1\u0003\u0016\u000b\u0000\u00f1\u00f2\u0005\b\u0000"+
		"\u0000\u00f2\r\u0001\u0000\u0000\u0000\u00f3\u00f4\u00053\u0000\u0000"+
		"\u00f4\u00f5\u0005\t\u0000\u0000\u00f5\u00f6\u0005R\u0000\u0000\u00f6"+
		"\u00f7\u0005\n\u0000\u0000\u00f7\u00f8\u00055\u0000\u0000\u00f8\u00f9"+
		"\u0005\u000b\u0000\u0000\u00f9\u00fa\u0005\f\u0000\u0000\u00fa\u00fb\u0003"+
		"\u0010\b\u0000\u00fb\u000f\u0001\u0000\u0000\u0000\u00fc\u00ff\u0003\u0014"+
		"\n\u0000\u00fd\u00ff\u0003\u0012\t\u0000\u00fe\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0011\u0001\u0000\u0000"+
		"\u0000\u0100\u0101\u0005\u0007\u0000\u0000\u0101\u0102\u0005)\u0000\u0000"+
		"\u0102\u0103\u0005R\u0000\u0000\u0103\u0104\u0005\u000b\u0000\u0000\u0104"+
		"\u0105\u0005\f\u0000\u0000\u0105\u0106\u0005\u000f\u0000\u0000\u0106\u0107"+
		"\u0005\b\u0000\u0000\u0107\u0013\u0001\u0000\u0000\u0000\u0108\u0109\u0005"+
		"\u0019\u0000\u0000\u0109\u010a\u0005\n\u0000\u0000\u010a\u010b\u0005R"+
		"\u0000\u0000\u010b\u010c\u0005\u000b\u0000\u0000\u010c\u010d\u0005\f\u0000"+
		"\u0000\u010d\u010e\u0005\u000f\u0000\u0000\u010e\u0015\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u00056\u0000\u0000\u0110\u0111\u00057\u0000\u0000\u0111"+
		"\u0112\u0005\u000b\u0000\u0000\u0112\u0113\u0003z=\u0000\u0113\u0114\u0005"+
		"\f\u0000\u0000\u0114\u0118\u0005\u0007\u0000\u0000\u0115\u0117\u0003\u0018"+
		"\f\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000"+
		"\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000"+
		"\u0000\u011b\u011c\u0005)\u0000\u0000\u011c\u011d\u0003P(\u0000\u011d"+
		"\u011e\u0005\u000f\u0000\u0000\u011e\u011f\u0005\b\u0000\u0000\u011f\u0017"+
		"\u0001\u0000\u0000\u0000\u0120\u0124\u0003\u001a\r\u0000\u0121\u0124\u0003"+
		"\u0086C\u0000\u0122\u0124\u0003H$\u0000\u0123\u0120\u0001\u0000\u0000"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0122\u0001\u0000\u0000"+
		"\u0000\u0124\u0019\u0001\u0000\u0000\u0000\u0125\u0127\u0007\u0000\u0000"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000"+
		"\u0000\u0127\u012c\u0001\u0000\u0000\u0000\u0128\u012d\u0003\u001c\u000e"+
		"\u0000\u0129\u012d\u0003,\u0016\u0000\u012a\u012d\u00034\u001a\u0000\u012b"+
		"\u012d\u0003$\u0012\u0000\u012c\u0128\u0001\u0000\u0000\u0000\u012c\u0129"+
		"\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012c\u012b"+
		"\u0001\u0000\u0000\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012f"+
		"\u0005\u000f\u0000\u0000\u012f\u001b\u0001\u0000\u0000\u0000\u0130\u0133"+
		"\u0005#\u0000\u0000\u0131\u0134\u0003\u001e\u000f\u0000\u0132\u0134\u0003"+
		" \u0010\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000"+
		"\u0000\u0000\u0134\u013c\u0001\u0000\u0000\u0000\u0135\u0138\u0005\u0010"+
		"\u0000\u0000\u0136\u0139\u0003\u001e\u000f\u0000\u0137\u0139\u0003 \u0010"+
		"\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a\u0135\u0001\u0000\u0000"+
		"\u0000\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000"+
		"\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u001d\u0001\u0000\u0000"+
		"\u0000\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0140\u0005R\u0000\u0000"+
		"\u0140\u001f\u0001\u0000\u0000\u0000\u0141\u0142\u0005R\u0000\u0000\u0142"+
		"\u0143\u0005\u0019\u0000\u0000\u0143\u0144\u0003<\u001e\u0000\u0144!\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0005R\u0000\u0000\u0146\u0147\u0005\u0019"+
		"\u0000\u0000\u0147\u0148\u0003<\u001e\u0000\u0148\u0149\u0005\u000f\u0000"+
		"\u0000\u0149#\u0001\u0000\u0000\u0000\u014a\u014d\u0005&\u0000\u0000\u014b"+
		"\u014e\u0003&\u0013\u0000\u014c\u014e\u0003(\u0014\u0000\u014d\u014b\u0001"+
		"\u0000\u0000\u0000\u014d\u014c\u0001\u0000\u0000\u0000\u014e\u0156\u0001"+
		"\u0000\u0000\u0000\u014f\u0152\u0005\u0010\u0000\u0000\u0150\u0153\u0003"+
		"&\u0013\u0000\u0151\u0153\u0003(\u0014\u0000\u0152\u0150\u0001\u0000\u0000"+
		"\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000"+
		"\u0000\u0154\u014f\u0001\u0000\u0000\u0000\u0155\u0158\u0001\u0000\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000"+
		"\u0000\u0157%\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000\u0000\u0000"+
		"\u0159\u015a\u0005R\u0000\u0000\u015a\'\u0001\u0000\u0000\u0000\u015b"+
		"\u015c\u0005R\u0000\u0000\u015c\u015d\u0005\u0019\u0000\u0000\u015d\u015e"+
		"\u0003@ \u0000\u015e)\u0001\u0000\u0000\u0000\u015f\u0160\u0005R\u0000"+
		"\u0000\u0160\u0161\u0005\u0019\u0000\u0000\u0161\u0162\u0003@ \u0000\u0162"+
		"\u0163\u0005\u000f\u0000\u0000\u0163+\u0001\u0000\u0000\u0000\u0164\u0167"+
		"\u0005$\u0000\u0000\u0165\u0168\u0003.\u0017\u0000\u0166\u0168\u00030"+
		"\u0018\u0000\u0167\u0165\u0001\u0000\u0000\u0000\u0167\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u0170\u0001\u0000\u0000\u0000\u0169\u016c\u0005\u0010"+
		"\u0000\u0000\u016a\u016d\u0003.\u0017\u0000\u016b\u016d\u00030\u0018\u0000"+
		"\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016b\u0001\u0000\u0000\u0000"+
		"\u016d\u016f\u0001\u0000\u0000\u0000\u016e\u0169\u0001\u0000\u0000\u0000"+
		"\u016f\u0172\u0001\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0171\u0001\u0000\u0000\u0000\u0171-\u0001\u0000\u0000\u0000\u0172"+
		"\u0170\u0001\u0000\u0000\u0000\u0173\u0174\u0005R\u0000\u0000\u0174/\u0001"+
		"\u0000\u0000\u0000\u0175\u0176\u0005R\u0000\u0000\u0176\u0177\u0005\u0019"+
		"\u0000\u0000\u0177\u0178\u00051\u0000\u0000\u01781\u0001\u0000\u0000\u0000"+
		"\u0179\u017a\u0005R\u0000\u0000\u017a\u017b\u0005\u0019\u0000\u0000\u017b"+
		"\u017c\u00051\u0000\u0000\u017c\u017d\u0005\u000f\u0000\u0000\u017d3\u0001"+
		"\u0000\u0000\u0000\u017e\u0181\u0005%\u0000\u0000\u017f\u0182\u00036\u001b"+
		"\u0000\u0180\u0182\u00038\u001c\u0000\u0181\u017f\u0001\u0000\u0000\u0000"+
		"\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u018a\u0001\u0000\u0000\u0000"+
		"\u0183\u0186\u0005\u0010\u0000\u0000\u0184\u0187\u00036\u001b\u0000\u0185"+
		"\u0187\u00038\u001c\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185"+
		"\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0183"+
		"\u0001\u0000\u0000\u0000\u0189\u018c\u0001\u0000\u0000\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b5\u0001"+
		"\u0000\u0000\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018d\u018e\u0005"+
		"R\u0000\u0000\u018e7\u0001\u0000\u0000\u0000\u018f\u0190\u0005R\u0000"+
		"\u0000\u0190\u0191\u0005\u0019\u0000\u0000\u0191\u0192\u0003D\"\u0000"+
		"\u01929\u0001\u0000\u0000\u0000\u0193\u0194\u0005R\u0000\u0000\u0194\u0195"+
		"\u0005\u0019\u0000\u0000\u0195\u0196\u0003D\"\u0000\u0196\u0197\u0005"+
		"\u000f\u0000\u0000\u0197;\u0001\u0000\u0000\u0000\u0198\u019d\u0003>\u001f"+
		"\u0000\u0199\u019a\u0007\u0001\u0000\u0000\u019a\u019c\u0003>\u001f\u0000"+
		"\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019f\u0001\u0000\u0000\u0000"+
		"\u019d\u019b\u0001\u0000\u0000\u0000\u019d\u019e\u0001\u0000\u0000\u0000"+
		"\u019e=\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0"+
		"\u01a5\u0003|>\u0000\u01a1\u01a2\u0007\u0002\u0000\u0000\u01a2\u01a4\u0003"+
		"|>\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6?\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a8\u01ad\u0003B!\u0000\u01a9\u01aa\u0007\u0001\u0000\u0000\u01aa\u01ac"+
		"\u0003B!\u0000\u01ab\u01a9\u0001\u0000\u0000\u0000\u01ac\u01af\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001\u0000"+
		"\u0000\u0000\u01aeA\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000"+
		"\u0000\u01b0\u01b3\u0003|>\u0000\u01b1\u01b3\u0003~?\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b3\u01bb"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b7\u0007\u0002\u0000\u0000\u01b5\u01b8"+
		"\u0003|>\u0000\u01b6\u01b8\u0003~?\u0000\u01b7\u01b5\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b8\u01ba\u0001\u0000\u0000"+
		"\u0000\u01b9\u01b4\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001\u0000\u0000"+
		"\u0000\u01bcC\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000"+
		"\u01be\u01bf\u0007\u0003\u0000\u0000\u01bfE\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c4\u0003|>\u0000\u01c1\u01c4\u0003~?\u0000\u01c2\u01c4\u0005R\u0000"+
		"\u0000\u01c3\u01c0\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c2\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000\u0000"+
		"\u0000\u01c5\u01c9\u0007\u0004\u0000\u0000\u01c6\u01ca\u0003|>\u0000\u01c7"+
		"\u01ca\u0003~?\u0000\u01c8\u01ca\u0005R\u0000\u0000\u01c9\u01c6\u0001"+
		"\u0000\u0000\u0000\u01c9\u01c7\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001"+
		"\u0000\u0000\u0000\u01caG\u0001\u0000\u0000\u0000\u01cb\u01cf\u0003J%"+
		"\u0000\u01cc\u01cf\u0003L&\u0000\u01cd\u01cf\u0003N\'\u0000\u01ce\u01cb"+
		"\u0001\u0000\u0000\u0000\u01ce\u01cc\u0001\u0000\u0000\u0000\u01ce\u01cd"+
		"\u0001\u0000\u0000\u0000\u01cfI\u0001\u0000\u0000\u0000\u01d0\u01d4\u0005"+
		"\'\u0000\u0000\u01d1\u01d2\u0005\t\u0000\u0000\u01d2\u01d3\u0005$\u0000"+
		"\u0000\u01d3\u01d5\u0005\n\u0000\u0000\u01d4\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0005R\u0000\u0000\u01d7\u01d8\u0005\u0019\u0000\u0000\u01d8"+
		"\u01e1\u0005\r\u0000\u0000\u01d9\u01de\u00051\u0000\u0000\u01da\u01db"+
		"\u0005\u0010\u0000\u0000\u01db\u01dd\u00051\u0000\u0000\u01dc\u01da\u0001"+
		"\u0000\u0000\u0000\u01dd\u01e0\u0001\u0000\u0000\u0000\u01de\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01df\u0001\u0000\u0000\u0000\u01df\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e1\u01d9\u0001"+
		"\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e5\u0005\u0010\u0000\u0000\u01e4\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e6\u01e7\u0005\u000e\u0000\u0000\u01e7\u01e8\u0005"+
		"\u000f\u0000\u0000\u01e8K\u0001\u0000\u0000\u0000\u01e9\u01ed\u0005\'"+
		"\u0000\u0000\u01ea\u01eb\u0005\t\u0000\u0000\u01eb\u01ec\u0005#\u0000"+
		"\u0000\u01ec\u01ee\u0005\n\u0000\u0000\u01ed\u01ea\u0001\u0000\u0000\u0000"+
		"\u01ed\u01ee\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000"+
		"\u01ef\u01f0\u0005R\u0000\u0000\u01f0\u01f1\u0005\u0019\u0000\u0000\u01f1"+
		"\u01fa\u0005\r\u0000\u0000\u01f2\u01f7\u0003|>\u0000\u01f3\u01f4\u0005"+
		"\u0010\u0000\u0000\u01f4\u01f6\u0003|>\u0000\u01f5\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01fb\u0001\u0000\u0000"+
		"\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01f2\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fb\u0001\u0000\u0000\u0000\u01fb\u01fd\u0001\u0000\u0000"+
		"\u0000\u01fc\u01fe\u0005\u0010\u0000\u0000\u01fd\u01fc\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000"+
		"\u0000\u01ff\u0200\u0005\u000e\u0000\u0000\u0200\u0201\u0005\u000f\u0000"+
		"\u0000\u0201M\u0001\u0000\u0000\u0000\u0202\u0206\u0005\'\u0000\u0000"+
		"\u0203\u0204\u0005\t\u0000\u0000\u0204\u0205\u0005%\u0000\u0000\u0205"+
		"\u0207\u0005\n\u0000\u0000\u0206\u0203\u0001\u0000\u0000\u0000\u0206\u0207"+
		"\u0001\u0000\u0000\u0000\u0207\u0208\u0001\u0000\u0000\u0000\u0208\u0209"+
		"\u0005R\u0000\u0000\u0209\u020a\u0005\u0019\u0000\u0000\u020a\u0213\u0005"+
		"\r\u0000\u0000\u020b\u0210\u0003D\"\u0000\u020c\u020d\u0005\u0010\u0000"+
		"\u0000\u020d\u020f\u0003D\"\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000\u0000\u0000"+
		"\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0214\u0001\u0000\u0000\u0000"+
		"\u0212\u0210\u0001\u0000\u0000\u0000\u0213\u020b\u0001\u0000\u0000\u0000"+
		"\u0213\u0214\u0001\u0000\u0000\u0000\u0214\u0216\u0001\u0000\u0000\u0000"+
		"\u0215\u0217\u0005\u0010\u0000\u0000\u0216\u0215\u0001\u0000\u0000\u0000"+
		"\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0005\u000e\u0000\u0000\u0219\u021a\u0005\u000f\u0000\u0000"+
		"\u021aO\u0001\u0000\u0000\u0000\u021b\u0225\u0003^/\u0000\u021c\u0225"+
		"\u0003R)\u0000\u021d\u0225\u0003\\.\u0000\u021e\u0225\u0003Z-\u0000\u021f"+
		"\u0225\u0003V+\u0000\u0220\u0225\u0003T*\u0000\u0221\u0225\u0003`0\u0000"+
		"\u0222\u0225\u0003X,\u0000\u0223\u0225\u0003b1\u0000\u0224\u021b\u0001"+
		"\u0000\u0000\u0000\u0224\u021c\u0001\u0000\u0000\u0000\u0224\u021d\u0001"+
		"\u0000\u0000\u0000\u0224\u021e\u0001\u0000\u0000\u0000\u0224\u021f\u0001"+
		"\u0000\u0000\u0000\u0224\u0220\u0001\u0000\u0000\u0000\u0224\u0221\u0001"+
		"\u0000\u0000\u0000\u0224\u0222\u0001\u0000\u0000\u0000\u0224\u0223\u0001"+
		"\u0000\u0000\u0000\u0225Q\u0001\u0000\u0000\u0000\u0226\u0227\u00059\u0000"+
		"\u0000\u0227\u0228\u0005\u000b\u0000\u0000\u0228\u022a\u0003t:\u0000\u0229"+
		"\u022b\u0005\u0010\u0000\u0000\u022a\u0229\u0001\u0000\u0000\u0000\u022a"+
		"\u022b\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c"+
		"\u022d\u0005\f\u0000\u0000\u022dS\u0001\u0000\u0000\u0000\u022e\u022f"+
		"\u0005B\u0000\u0000\u022f\u0238\u0005\u000b\u0000\u0000\u0230\u0231\u0003"+
		"f3\u0000\u0231\u0232\u0005\u0010\u0000\u0000\u0232\u0233\u0003t:\u0000"+
		"\u0233\u0239\u0001\u0000\u0000\u0000\u0234\u0235\u0003t:\u0000\u0235\u0236"+
		"\u0005\u0010\u0000\u0000\u0236\u0237\u0003f3\u0000\u0237\u0239\u0001\u0000"+
		"\u0000\u0000\u0238\u0230\u0001\u0000\u0000\u0000\u0238\u0234\u0001\u0000"+
		"\u0000\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u023c\u0005\u0010"+
		"\u0000\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023b\u023c\u0001\u0000"+
		"\u0000\u0000\u023c\u023d\u0001\u0000\u0000\u0000\u023d\u023e\u0005\f\u0000"+
		"\u0000\u023eU\u0001\u0000\u0000\u0000\u023f\u0240\u0005A\u0000\u0000\u0240"+
		"\u0241\u0005\u000b\u0000\u0000\u0241\u0243\u0003x<\u0000\u0242\u0244\u0005"+
		"\u0010\u0000\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245\u0246\u0005"+
		"\f\u0000\u0000\u0246W\u0001\u0000\u0000\u0000\u0247\u0248\u0005J\u0000"+
		"\u0000\u0248\u0249\u0005\u000b\u0000\u0000\u0249\u024b\u00051\u0000\u0000"+
		"\u024a\u024c\u0005\u0010\u0000\u0000\u024b\u024a\u0001\u0000\u0000\u0000"+
		"\u024b\u024c\u0001\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u0005\f\u0000\u0000\u024eY\u0001\u0000\u0000\u0000\u024f"+
		"\u0250\u0005?\u0000\u0000\u0250\u0251\u0005\u000b\u0000\u0000\u0251\u0253"+
		"\u0003r9\u0000\u0252\u0254\u0005\u0010\u0000\u0000\u0253\u0252\u0001\u0000"+
		"\u0000\u0000\u0253\u0254\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000"+
		"\u0000\u0000\u0255\u0256\u0005\f\u0000\u0000\u0256[\u0001\u0000\u0000"+
		"\u0000\u0257\u0258\u0005:\u0000\u0000\u0258\u0259\u0005\u000b\u0000\u0000"+
		"\u0259\u025a\u0003j5\u0000\u025a\u025c\u0003t:\u0000\u025b\u025d\u0005"+
		"\u0010\u0000\u0000\u025c\u025b\u0001\u0000\u0000\u0000\u025c\u025d\u0001"+
		"\u0000\u0000\u0000\u025d\u025e\u0001\u0000\u0000\u0000\u025e\u025f\u0005"+
		"\f\u0000\u0000\u025f]\u0001\u0000\u0000\u0000\u0260\u0261\u00058\u0000"+
		"\u0000\u0261\u0263\u0005\u000b\u0000\u0000\u0262\u0264\u0003d2\u0000\u0263"+
		"\u0262\u0001\u0000\u0000\u0000\u0263\u0264\u0001\u0000\u0000\u0000\u0264"+
		"\u0269\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u0010\u0000\u0000\u0266"+
		"\u0268\u0003d2\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026b\u0001"+
		"\u0000\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u026a\u0001"+
		"\u0000\u0000\u0000\u026a\u026d\u0001\u0000\u0000\u0000\u026b\u0269\u0001"+
		"\u0000\u0000\u0000\u026c\u026e\u0005\u0010\u0000\u0000\u026d\u026c\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0005\f\u0000\u0000\u0270_\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0007\u0005\u0000\u0000\u0272\u0273\u0005\u000b"+
		"\u0000\u0000\u0273\u0275\u0003v;\u0000\u0274\u0276\u0005\u0010\u0000\u0000"+
		"\u0275\u0274\u0001\u0000\u0000\u0000\u0275\u0276\u0001\u0000\u0000\u0000"+
		"\u0276\u0277\u0001\u0000\u0000\u0000\u0277\u0279\u0005\f\u0000\u0000\u0278"+
		"\u027a\u0005\u0010\u0000\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279"+
		"\u027a\u0001\u0000\u0000\u0000\u027aa\u0001\u0000\u0000\u0000\u027b\u027c"+
		"\u0005H\u0000\u0000\u027c\u027d\u0005\u0012\u0000\u0000\u027d\u027e\u0005"+
		"K\u0000\u0000\u027e\u027f\u0005\u000b\u0000\u0000\u027f\u0280\u0007\u0006"+
		"\u0000\u0000\u0280\u0281\u0005\f\u0000\u0000\u0281c\u0001\u0000\u0000"+
		"\u0000\u0282\u0286\u0003n7\u0000\u0283\u0286\u0003p8\u0000\u0284\u0286"+
		"\u0003t:\u0000\u0285\u0282\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000"+
		"\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286e\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0005C\u0000\u0000\u0288\u0289\u0005\u0011\u0000\u0000"+
		"\u0289\u028a\u0003h4\u0000\u028ag\u0001\u0000\u0000\u0000\u028b\u028c"+
		"\u0005D\u0000\u0000\u028c\u028d\u0005\u0012\u0000\u0000\u028d\u028e\u0005"+
		"*\u0000\u0000\u028e\u028f\u0005\u000b\u0000\u0000\u028f\u0290\u0003|>"+
		"\u0000\u0290\u0291\u0005\f\u0000\u0000\u0291i\u0001\u0000\u0000\u0000"+
		"\u0292\u0293\u0005G\u0000\u0000\u0293\u0294\u0005\u0011\u0000\u0000\u0294"+
		"\u0295\u0005\u000b\u0000\u0000\u0295\u0296\u0005\f\u0000\u0000\u0296\u029b"+
		"\u0005\u0007\u0000\u0000\u0297\u029a\u0003\u008eG\u0000\u0298\u029a\u0003"+
		"l6\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u0298\u0001\u0000\u0000"+
		"\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000\u0000"+
		"\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u029e\u0001\u0000\u0000"+
		"\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u029f\u0005\b\u0000\u0000"+
		"\u029f\u02a0\u0005\u0010\u0000\u0000\u02a0k\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a2\u00050\u0000\u0000\u02a2\u02a3\u0005\u000b\u0000\u0000\u02a3\u02a4"+
		"\u0005\u000b\u0000\u0000\u02a4\u02a5\u0005\f\u0000\u0000\u02a5\u02a9\u0005"+
		"\u0007\u0000\u0000\u02a6\u02a8\u0003\u008eG\u0000\u02a7\u02a6\u0001\u0000"+
		"\u0000\u0000\u02a8\u02ab\u0001\u0000\u0000\u0000\u02a9\u02a7\u0001\u0000"+
		"\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0001\u0000"+
		"\u0000\u0000\u02ab\u02a9\u0001\u0000\u0000\u0000\u02ac\u02ad\u0005\b\u0000"+
		"\u0000\u02ad\u02ae\u0005\f\u0000\u0000\u02ae\u02af\u0005\u000f\u0000\u0000"+
		"\u02afm\u0001\u0000\u0000\u0000\u02b0\u02b1\u0005=\u0000\u0000\u02b1\u02b2"+
		"\u0005\u0011\u0000\u0000\u02b2\u02b3\u0003|>\u0000\u02b3o\u0001\u0000"+
		"\u0000\u0000\u02b4\u02b5\u0005<\u0000\u0000\u02b5\u02b6\u0005\u0011\u0000"+
		"\u0000\u02b6\u02b7\u0003|>\u0000\u02b7q\u0001\u0000\u0000\u0000\u02b8"+
		"\u02b9\u0005@\u0000\u0000\u02b9\u02ba\u0005\u0011\u0000\u0000\u02ba\u02bb"+
		"\u0005R\u0000\u0000\u02bb\u02bc\u0005\u000b\u0000\u0000\u02bc\u02bd\u0005"+
		"\f\u0000\u0000\u02bds\u0001\u0000\u0000\u0000\u02be\u02bf\u0005;\u0000"+
		"\u0000\u02bf\u02c0\u0005\u0011\u0000\u0000\u02c0\u02c1\u0003P(\u0000\u02c1"+
		"u\u0001\u0000\u0000\u0000\u02c2\u02c3\u0005L\u0000\u0000\u02c3\u02c4\u0005"+
		"\u0011\u0000\u0000\u02c4\u02cd\u0005\r\u0000\u0000\u02c5\u02ca\u0003P"+
		"(\u0000\u02c6\u02c7\u0005\u0010\u0000\u0000\u02c7\u02c9\u0003P(\u0000"+
		"\u02c8\u02c6\u0001\u0000\u0000\u0000\u02c9\u02cc\u0001\u0000\u0000\u0000"+
		"\u02ca\u02c8\u0001\u0000\u0000\u0000\u02ca\u02cb\u0001\u0000\u0000\u0000"+
		"\u02cb\u02ce\u0001\u0000\u0000\u0000\u02cc\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cd\u02c5\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000"+
		"\u02ce\u02d0\u0001\u0000\u0000\u0000\u02cf\u02d1\u0005\u0010\u0000\u0000"+
		"\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d0\u02d1\u0001\u0000\u0000\u0000"+
		"\u02d1\u02d2\u0001\u0000\u0000\u0000\u02d2\u02d3\u0005\u000e\u0000\u0000"+
		"\u02d3w\u0001\u0000\u0000\u0000\u02d4\u02d5\u0005I\u0000\u0000\u02d5\u02d6"+
		"\u0005\u0011\u0000\u0000\u02d6\u02d7\u0003P(\u0000\u02d7y\u0001\u0000"+
		"\u0000\u0000\u02d8\u02d9\u00052\u0000\u0000\u02d9\u02da\u0005R\u0000\u0000"+
		"\u02da{\u0001\u0000\u0000\u0000\u02db\u02dc\u0005T\u0000\u0000\u02dc}"+
		"\u0001\u0000\u0000\u0000\u02dd\u02de\u0005S\u0000\u0000\u02de\u007f\u0001"+
		"\u0000\u0000\u0000\u02df\u02e0\u0005\u0003\u0000\u0000\u02e0\u02e1\u0005"+
		"\u000b\u0000\u0000\u02e1\u02e2\u0003\u0094J\u0000\u02e2\u02e3\u0005\f"+
		"\u0000\u0000\u02e3\u02f1\u0003\u0084B\u0000\u02e4\u02e5\u0005\u0004\u0000"+
		"\u0000\u02e5\u02e6\u0005\u000b\u0000\u0000\u02e6\u02e7\u0003\u0094J\u0000"+
		"\u02e7\u02e8\u0005\f\u0000\u0000\u02e8\u02e9\u0003\u0084B\u0000\u02e9"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ea\u02e4\u0001\u0000\u0000\u0000\u02eb"+
		"\u02ee\u0001\u0000\u0000\u0000\u02ec\u02ea\u0001\u0000\u0000\u0000\u02ec"+
		"\u02ed\u0001\u0000\u0000\u0000\u02ed\u02ef\u0001\u0000\u0000\u0000\u02ee"+
		"\u02ec\u0001\u0000\u0000\u0000\u02ef\u02f0\u0005\u0005\u0000\u0000\u02f0"+
		"\u02f2\u0003\u0084B\u0000\u02f1\u02ec\u0001\u0000\u0000\u0000\u02f1\u02f2"+
		"\u0001\u0000\u0000\u0000\u02f2\u02f5\u0001\u0000\u0000\u0000\u02f3\u02f4"+
		"\u0005\u0005\u0000\u0000\u02f4\u02f6\u0003\u0084B\u0000\u02f5\u02f3\u0001"+
		"\u0000\u0000\u0000\u02f5\u02f6\u0001\u0000\u0000\u0000\u02f6\u0081\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0005\u0006\u0000\u0000\u02f8\u02f9\u0005"+
		"\u000b\u0000\u0000\u02f9\u02fa\u0003\u0094J\u0000\u02fa\u02fb\u0005\f"+
		"\u0000\u0000\u02fb\u02fc\u0003\u0084B\u0000\u02fc\u0083\u0001\u0000\u0000"+
		"\u0000\u02fd\u0301\u0005\u0007\u0000\u0000\u02fe\u0300\u0003\u008eG\u0000"+
		"\u02ff\u02fe\u0001\u0000\u0000\u0000\u0300\u0303\u0001\u0000\u0000\u0000"+
		"\u0301\u02ff\u0001\u0000\u0000\u0000\u0301\u0302\u0001\u0000\u0000\u0000"+
		"\u0302\u0304\u0001\u0000\u0000\u0000\u0303\u0301\u0001\u0000\u0000\u0000"+
		"\u0304\u0305\u0005\b\u0000\u0000\u0305\u0085\u0001\u0000\u0000\u0000\u0306"+
		"\u0308\u0005/\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000\u0307\u0308"+
		"\u0001\u0000\u0000\u0000\u0308\u0309\u0001\u0000\u0000\u0000\u0309\u030c"+
		"\u0003\u0088D\u0000\u030a\u030c\u0005/\u0000\u0000\u030b\u0307\u0001\u0000"+
		"\u0000\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030c\u030d\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0005R\u0000\u0000\u030e\u0310\u0005\u000b\u0000"+
		"\u0000\u030f\u0311\u0003\u008aE\u0000\u0310\u030f\u0001\u0000\u0000\u0000"+
		"\u0310\u0311\u0001\u0000\u0000\u0000\u0311\u0312\u0001\u0000\u0000\u0000"+
		"\u0312\u0313\u0005\f\u0000\u0000\u0313\u0314\u0003\u0084B\u0000\u0314"+
		"\u0087\u0001\u0000\u0000\u0000\u0315\u0316\u0007\u0007\u0000\u0000\u0316"+
		"\u0089\u0001\u0000\u0000\u0000\u0317\u031c\u0003\u0018\f\u0000\u0318\u0319"+
		"\u0005\u0010\u0000\u0000\u0319\u031b\u0003\u0018\f\u0000\u031a\u0318\u0001"+
		"\u0000\u0000\u0000\u031b\u031e\u0001\u0000\u0000\u0000\u031c\u031a\u0001"+
		"\u0000\u0000\u0000\u031c\u031d\u0001\u0000\u0000\u0000\u031d\u0320\u0001"+
		"\u0000\u0000\u0000\u031e\u031c\u0001\u0000\u0000\u0000\u031f\u0321\u0005"+
		"\u0010\u0000\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0320\u0321\u0001"+
		"\u0000\u0000\u0000\u0321\u008b\u0001\u0000\u0000\u0000\u0322\u0327\u0003"+
		"\"\u0011\u0000\u0323\u0327\u0003*\u0015\u0000\u0324\u0327\u0003:\u001d"+
		"\u0000\u0325\u0327\u00032\u0019\u0000\u0326\u0322\u0001\u0000\u0000\u0000"+
		"\u0326\u0323\u0001\u0000\u0000\u0000\u0326\u0324\u0001\u0000\u0000\u0000"+
		"\u0326\u0325\u0001\u0000\u0000\u0000\u0327\u008d\u0001\u0000\u0000\u0000"+
		"\u0328\u032f\u0003\u0018\f\u0000\u0329\u032f\u0003\u0080@\u0000\u032a"+
		"\u032f\u0003\u0090H\u0000\u032b\u032f\u0003\u0082A\u0000\u032c\u032f\u0003"+
		"\u0086C\u0000\u032d\u032f\u0003\u008cF\u0000\u032e\u0328\u0001\u0000\u0000"+
		"\u0000\u032e\u0329\u0001\u0000\u0000\u0000\u032e\u032a\u0001\u0000\u0000"+
		"\u0000\u032e\u032b\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000"+
		"\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u008f\u0001\u0000\u0000"+
		"\u0000\u0330\u0331\u0005\u0002\u0000\u0000\u0331\u0333\u0005\u000b\u0000"+
		"\u0000\u0332\u0334\u0003\u001a\r\u0000\u0333\u0332\u0001\u0000\u0000\u0000"+
		"\u0333\u0334\u0001\u0000\u0000\u0000\u0334\u0336\u0001\u0000\u0000\u0000"+
		"\u0335\u0337\u0003\u0094J\u0000\u0336\u0335\u0001\u0000\u0000\u0000\u0336"+
		"\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000\u0338"+
		"\u033a\u0005\u000f\u0000\u0000\u0339\u033b\u0003\u0092I\u0000\u033a\u0339"+
		"\u0001\u0000\u0000\u0000\u033a\u033b\u0001\u0000\u0000\u0000\u033b\u033c"+
		"\u0001\u0000\u0000\u0000\u033c\u033d\u0005\u000f\u0000\u0000\u033d\u033e"+
		"\u0005\f\u0000\u0000\u033e\u033f\u0003\u0084B\u0000\u033f\u0091\u0001"+
		"\u0000\u0000\u0000\u0340\u0345\u0003\u001e\u000f\u0000\u0341\u0345\u0003"+
		".\u0017\u0000\u0342\u0345\u00036\u001b\u0000\u0343\u0345\u0003&\u0013"+
		"\u0000\u0344\u0340\u0001\u0000\u0000\u0000\u0344\u0341\u0001\u0000\u0000"+
		"\u0000\u0344\u0342\u0001\u0000\u0000\u0000\u0344\u0343\u0001\u0000\u0000"+
		"\u0000\u0345\u0093\u0001\u0000\u0000\u0000\u0346\u034b\u0003\u0096K\u0000"+
		"\u0347\u0348\u0005\u001e\u0000\u0000\u0348\u034a\u0003\u0096K\u0000\u0349"+
		"\u0347\u0001\u0000\u0000\u0000\u034a\u034d\u0001\u0000\u0000\u0000\u034b"+
		"\u0349\u0001\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c"+
		"\u0095\u0001\u0000\u0000\u0000\u034d\u034b\u0001\u0000\u0000\u0000\u034e"+
		"\u0353\u0003\u0098L\u0000\u034f\u0350\u0005\u001d\u0000\u0000\u0350\u0352"+
		"\u0003\u0098L\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0352\u0355\u0001"+
		"\u0000\u0000\u0000\u0353\u0351\u0001\u0000\u0000\u0000\u0353\u0354\u0001"+
		"\u0000\u0000\u0000\u0354\u0097\u0001\u0000\u0000\u0000\u0355\u0353\u0001"+
		"\u0000\u0000\u0000\u0356\u035b\u0003\u009aM\u0000\u0357\u0358\u0007\b"+
		"\u0000\u0000\u0358\u035a\u0003\u009aM\u0000\u0359\u0357\u0001\u0000\u0000"+
		"\u0000\u035a\u035d\u0001\u0000\u0000\u0000\u035b\u0359\u0001\u0000\u0000"+
		"\u0000\u035b\u035c\u0001\u0000\u0000\u0000\u035c\u0099\u0001\u0000\u0000"+
		"\u0000\u035d\u035b\u0001\u0000\u0000\u0000\u035e\u0365\u0003\u009cN\u0000"+
		"\u035f\u0360\u0005\u000b\u0000\u0000\u0360\u0361\u0003\u0094J\u0000\u0361"+
		"\u0362\u0005\f\u0000\u0000\u0362\u0365\u0001\u0000\u0000\u0000\u0363\u0365"+
		"\u0003D\"\u0000\u0364\u035e\u0001\u0000\u0000\u0000\u0364\u035f\u0001"+
		"\u0000\u0000\u0000\u0364\u0363\u0001\u0000\u0000\u0000\u0365\u009b\u0001"+
		"\u0000\u0000\u0000\u0366\u0367\u0003\u009eO\u0000\u0367\u0368\u0007\t"+
		"\u0000\u0000\u0368\u0369\u0003\u009eO\u0000\u0369\u009d\u0001\u0000\u0000"+
		"\u0000\u036a\u036e\u0003<\u001e\u0000\u036b\u036e\u0003@ \u0000\u036c"+
		"\u036e\u0003\u00a8T\u0000\u036d\u036a\u0001\u0000\u0000\u0000\u036d\u036b"+
		"\u0001\u0000\u0000\u0000\u036d\u036c\u0001\u0000\u0000\u0000\u036e\u009f"+
		"\u0001\u0000\u0000\u0000\u036f\u0370\u0007\n\u0000\u0000\u0370\u00a1\u0001"+
		"\u0000\u0000\u0000\u0371\u0372\u0007\u000b\u0000\u0000\u0372\u00a3\u0001"+
		"\u0000\u0000\u0000\u0373\u0374\u0006R\uffff\uffff\u0000\u0374\u0381\u0003"+
		"\u00a8T\u0000\u0375\u0376\u0003\u00a0P\u0000\u0376\u0377\u0003\u00a4R"+
		"\u0005\u0377\u0381\u0001\u0000\u0000\u0000\u0378\u0379\u0003<\u001e\u0000"+
		"\u0379\u037a\u0003\u00a2Q\u0000\u037a\u0381\u0001\u0000\u0000\u0000\u037b"+
		"\u0381\u0003\u00aaU\u0000\u037c\u037d\u0005\u000b\u0000\u0000\u037d\u037e"+
		"\u0003\u00a4R\u0000\u037e\u037f\u0005\f\u0000\u0000\u037f\u0381\u0001"+
		"\u0000\u0000\u0000\u0380\u0373\u0001\u0000\u0000\u0000\u0380\u0375\u0001"+
		"\u0000\u0000\u0000\u0380\u0378\u0001\u0000\u0000\u0000\u0380\u037b\u0001"+
		"\u0000\u0000\u0000\u0380\u037c\u0001\u0000\u0000\u0000\u0381\u0386\u0001"+
		"\u0000\u0000\u0000\u0382\u0383\n\u0004\u0000\u0000\u0383\u0385\u0003\u00a2"+
		"Q\u0000\u0384\u0382\u0001\u0000\u0000\u0000\u0385\u0388\u0001\u0000\u0000"+
		"\u0000\u0386\u0384\u0001\u0000\u0000\u0000\u0386\u0387\u0001\u0000\u0000"+
		"\u0000\u0387\u00a5\u0001\u0000\u0000\u0000\u0388\u0386\u0001\u0000\u0000"+
		"\u0000\u0389\u038a\u0007\f\u0000\u0000\u038a\u00a7\u0001\u0000\u0000\u0000"+
		"\u038b\u038c\u0005R\u0000\u0000\u038c\u00a9\u0001\u0000\u0000\u0000\u038d"+
		"\u038e\u0003\u00a8T\u0000\u038e\u0390\u0005\u000b\u0000\u0000\u038f\u0391"+
		"\u0003\u00acV\u0000\u0390\u038f\u0001\u0000\u0000\u0000\u0390\u0391\u0001"+
		"\u0000\u0000\u0000\u0391\u0392\u0001\u0000\u0000\u0000\u0392\u0393\u0005"+
		"\f\u0000\u0000\u0393\u00ab\u0001\u0000\u0000\u0000\u0394\u0399\u0003\u00a4"+
		"R\u0000\u0395\u0396\u0005\u0010\u0000\u0000\u0396\u0398\u0003\u00a4R\u0000"+
		"\u0397\u0395\u0001\u0000\u0000\u0000\u0398\u039b\u0001\u0000\u0000\u0000"+
		"\u0399\u0397\u0001\u0000\u0000\u0000\u0399\u039a\u0001\u0000\u0000\u0000"+
		"\u039a\u00ad\u0001\u0000\u0000\u0000\u039b\u0399\u0001\u0000\u0000\u0000"+
		"Y\u00b0\u00b2\u00b8\u00c0\u00cc\u00dc\u00ed\u00fe\u0118\u0123\u0126\u012c"+
		"\u0133\u0138\u013c\u014d\u0152\u0156\u0167\u016c\u0170\u0181\u0186\u018a"+
		"\u019d\u01a5\u01ad\u01b2\u01b7\u01bb\u01c3\u01c9\u01ce\u01d4\u01de\u01e1"+
		"\u01e4\u01ed\u01f7\u01fa\u01fd\u0206\u0210\u0213\u0216\u0224\u022a\u0238"+
		"\u023b\u0243\u024b\u0253\u025c\u0263\u0269\u026d\u0275\u0279\u0285\u0299"+
		"\u029b\u02a9\u02ca\u02cd\u02d0\u02ec\u02f1\u02f5\u0301\u0307\u030b\u0310"+
		"\u031c\u0320\u0326\u032e\u0333\u0336\u033a\u0344\u034b\u0353\u035b\u0364"+
		"\u036d\u0380\u0386\u0390\u0399";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}