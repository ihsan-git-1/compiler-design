// Generated from c:\Users\Vision\Downloads\Desktop\complier\src\dart_lexar.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dart_lexar extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "CRLY_BRKT_OP", "CRLY_BRKT_CL", "ANGLE_BRKT_OP", "ANGLE_BRKT_CL", 
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


	public dart_lexar(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dart_lexar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2H\u025c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3!\3!\3!\3!\7!\u0101\n!\f!\16!\u0104\13!\3!\3!\3!\3!\3!\7"+
		"!\u010b\n!\f!\16!\u010e\13!\3!\5!\u0111\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,"+
		"\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/"+
		"\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\7=\u01ec"+
		"\n=\f=\16=\u01ef\13=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3=\3>\3"+
		">\7>\u0202\n>\f>\16>\u0205\13>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>"+
		"\3>\3>\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\6A\u0223\nA\rA\16A\u0224"+
		"\3B\6B\u0228\nB\rB\16B\u0229\3B\3B\6B\u022e\nB\rB\16B\u022f\3C\3C\7C\u0234"+
		"\nC\fC\16C\u0237\13C\3D\3D\3D\3D\7D\u023d\nD\fD\16D\u0240\13D\3D\3D\3"+
		"E\3E\7E\u0246\nE\fE\16E\u0249\13E\3E\3E\3F\3F\7F\u024f\nF\fF\16F\u0252"+
		"\13F\3F\3F\3G\6G\u0257\nG\rG\16G\u0258\3G\3G\2\2H\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\3\2\7\4\2$$^^\4\2C\\c|\3\2"+
		"\62;\4\2\f\f\17\17\5\2\13\f\17\17\"\"\2\u026a\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\3\u008f\3\2\2\2\5\u0095"+
		"\3\2\2\2\7\u0097\3\2\2\2\t\u0099\3\2\2\2\13\u009b\3\2\2\2\r\u009d\3\2"+
		"\2\2\17\u009f\3\2\2\2\21\u00a1\3\2\2\2\23\u00a3\3\2\2\2\25\u00a5\3\2\2"+
		"\2\27\u00a7\3\2\2\2\31\u00a9\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2"+
		"\37\u00af\3\2\2\2!\u00b1\3\2\2\2#\u00b3\3\2\2\2%\u00b6\3\2\2\2\'\u00b8"+
		"\3\2\2\2)\u00bb\3\2\2\2+\u00bd\3\2\2\2-\u00c1\3\2\2\2/\u00c8\3\2\2\2\61"+
		"\u00cd\3\2\2\2\63\u00d4\3\2\2\2\65\u00d9\3\2\2\2\67\u00e1\3\2\2\29\u00e8"+
		"\3\2\2\2;\u00ec\3\2\2\2=\u00f2\3\2\2\2?\u00f8\3\2\2\2A\u0110\3\2\2\2C"+
		"\u0112\3\2\2\2E\u011f\3\2\2\2G\u0125\3\2\2\2I\u012c\3\2\2\2K\u0138\3\2"+
		"\2\2M\u013f\3\2\2\2O\u0145\3\2\2\2Q\u014f\3\2\2\2S\u0158\3\2\2\2U\u0167"+
		"\3\2\2\2W\u016d\3\2\2\2Y\u0173\3\2\2\2[\u017a\3\2\2\2]\u0180\3\2\2\2_"+
		"\u018c\3\2\2\2a\u0191\3\2\2\2c\u019a\3\2\2\2e\u01a2\3\2\2\2g\u01aa\3\2"+
		"\2\2i\u01b5\3\2\2\2k\u01b9\3\2\2\2m\u01c0\3\2\2\2o\u01c6\3\2\2\2q\u01cb"+
		"\3\2\2\2s\u01d0\3\2\2\2u\u01d8\3\2\2\2w\u01e1\3\2\2\2y\u01e9\3\2\2\2{"+
		"\u01ff\3\2\2\2}\u0216\3\2\2\2\177\u021b\3\2\2\2\u0081\u0222\3\2\2\2\u0083"+
		"\u0227\3\2\2\2\u0085\u0231\3\2\2\2\u0087\u0238\3\2\2\2\u0089\u0243\3\2"+
		"\2\2\u008b\u024c\3\2\2\2\u008d\u0256\3\2\2\2\u008f\u0090\7e\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7c\2\2\u0092\u0093\7u\2\2\u0093\u0094\7u\2\2"+
		"\u0094\4\3\2\2\2\u0095\u0096\7}\2\2\u0096\6\3\2\2\2\u0097\u0098\7\177"+
		"\2\2\u0098\b\3\2\2\2\u0099\u009a\7>\2\2\u009a\n\3\2\2\2\u009b\u009c\7"+
		"@\2\2\u009c\f\3\2\2\2\u009d\u009e\7*\2\2\u009e\16\3\2\2\2\u009f\u00a0"+
		"\7+\2\2\u00a0\20\3\2\2\2\u00a1\u00a2\7]\2\2\u00a2\22\3\2\2\2\u00a3\u00a4"+
		"\7_\2\2\u00a4\24\3\2\2\2\u00a5\u00a6\7=\2\2\u00a6\26\3\2\2\2\u00a7\u00a8"+
		"\7.\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\32\3\2\2\2\u00ab\u00ac"+
		"\7-\2\2\u00ac\34\3\2\2\2\u00ad\u00ae\7/\2\2\u00ae\36\3\2\2\2\u00af\u00b0"+
		"\7,\2\2\u00b0 \3\2\2\2\u00b1\u00b2\7\61\2\2\u00b2\"\3\2\2\2\u00b3\u00b4"+
		"\7?\2\2\u00b4\u00b5\7?\2\2\u00b5$\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7&\3"+
		"\2\2\2\u00b8\u00b9\7#\2\2\u00b9\u00ba\7?\2\2\u00ba(\3\2\2\2\u00bb\u00bc"+
		"\7\60\2\2\u00bc*\3\2\2\2\u00bd\u00be\7k\2\2\u00be\u00bf\7p\2\2\u00bf\u00c0"+
		"\7v\2\2\u00c0,\3\2\2\2\u00c1\u00c2\7U\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4"+
		"\7t\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p\2\2\u00c6\u00c7\7i\2\2\u00c7"+
		".\3\2\2\2\u00c8\u00c9\7d\2\2\u00c9\u00ca\7q\2\2\u00ca\u00cb\7q\2\2\u00cb"+
		"\u00cc\7n\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7q\2\2\u00cf"+
		"\u00d0\7w\2\2\u00d0\u00d1\7d\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2"+
		"\u00d3\62\3\2\2\2\u00d4\u00d5\7N\2\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7"+
		"u\2\2\u00d7\u00d8\7v\2\2\u00d8\64\3\2\2\2\u00d9\u00da\7g\2\2\u00da\u00db"+
		"\7z\2\2\u00db\u00dc\7v\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7p\2\2\u00de"+
		"\u00df\7f\2\2\u00df\u00e0\7u\2\2\u00e0\66\3\2\2\2\u00e1\u00e2\7t\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\u00e4\7v\2\2\u00e4\u00e5\7w\2\2\u00e5\u00e6\7t\2\2"+
		"\u00e6\u00e7\7p\2\2\u00e78\3\2\2\2\u00e8\u00e9\7c\2\2\u00e9\u00ea\7n\2"+
		"\2\u00ea\u00eb\7n\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7h\2\2\u00ed\u00ee\7"+
		"k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7n\2\2\u00f1<"+
		"\3\2\2\2\u00f2\u00f3\7e\2\2\u00f3\u00f4\7q\2\2\u00f4\u00f5\7p\2\2\u00f5"+
		"\u00f6\7u\2\2\u00f6\u00f7\7v\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7x\2\2\u00f9"+
		"\u00fa\7c\2\2\u00fa\u00fb\7t\2\2\u00fb@\3\2\2\2\u00fc\u0102\7$\2\2\u00fd"+
		"\u0101\n\2\2\2\u00fe\u00ff\7^\2\2\u00ff\u0101\13\2\2\2\u0100\u00fd\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0105\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0111\7$"+
		"\2\2\u0106\u010c\7)\2\2\u0107\u010b\n\2\2\2\u0108\u0109\7^\2\2\u0109\u010b"+
		"\13\2\2\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010e\3\2\2\2"+
		"\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0111\7)\2\2\u0110\u00fc\3\2\2\2\u0110\u0106\3\2\2\2\u0111"+
		"B\3\2\2\2\u0112\u0113\7D\2\2\u0113\u0114\7w\2\2\u0114\u0115\7k\2\2\u0115"+
		"\u0116\7n\2\2\u0116\u0117\7f\2\2\u0117\u0118\7E\2\2\u0118\u0119\7q\2\2"+
		"\u0119\u011a\7p\2\2\u011a\u011b\7v\2\2\u011b\u011c\7g\2\2\u011c\u011d"+
		"\7z\2\2\u011d\u011e\7v\2\2\u011eD\3\2\2\2\u011f\u0120\7U\2\2\u0120\u0121"+
		"\7v\2\2\u0121\u0122\7c\2\2\u0122\u0123\7v\2\2\u0123\u0124\7g\2\2\u0124"+
		"F\3\2\2\2\u0125\u0126\7e\2\2\u0126\u0127\7t\2\2\u0127\u0128\7g\2\2\u0128"+
		"\u0129\7c\2\2\u0129\u012a\7v\2\2\u012a\u012b\7g\2\2\u012bH\3\2\2\2\u012c"+
		"\u012d\7e\2\2\u012d\u012e\7t\2\2\u012e\u012f\7g\2\2\u012f\u0130\7c\2\2"+
		"\u0130\u0131\7v\2\2\u0131\u0132\7g\2\2\u0132\u0133\7U\2\2\u0133\u0134"+
		"\7v\2\2\u0134\u0135\7c\2\2\u0135\u0136\7v\2\2\u0136\u0137\7g\2\2\u0137"+
		"J\3\2\2\2\u0138\u0139\7Y\2\2\u0139\u013a\7k\2\2\u013a\u013b\7f\2\2\u013b"+
		"\u013c\7i\2\2\u013c\u013d\7g\2\2\u013d\u013e\7v\2\2\u013eL\3\2\2\2\u013f"+
		"\u0140\7d\2\2\u0140\u0141\7w\2\2\u0141\u0142\7k\2\2\u0142\u0143\7n\2\2"+
		"\u0143\u0144\7f\2\2\u0144N\3\2\2\2\u0145\u0146\7E\2\2\u0146\u0147\7q\2"+
		"\2\u0147\u0148\7p\2\2\u0148\u0149\7v\2\2\u0149\u014a\7c\2\2\u014a\u014b"+
		"\7k\2\2\u014b\u014c\7p\2\2\u014c\u014d\7g\2\2\u014d\u014e\7t\2\2\u014e"+
		"P\3\2\2\2\u014f\u0150\7G\2\2\u0150\u0151\7z\2\2\u0151\u0152\7r\2\2\u0152"+
		"\u0153\7c\2\2\u0153\u0154\7p\2\2\u0154\u0155\7f\2\2\u0155\u0156\7g\2\2"+
		"\u0156\u0157\7f\2\2\u0157R\3\2\2\2\u0158\u0159\7O\2\2\u0159\u015a\7c\2"+
		"\2\u015a\u015b\7v\2\2\u015b\u015c\7g\2\2\u015c\u015d\7t\2\2\u015d\u015e"+
		"\7k\2\2\u015e\u015f\7c\2\2\u015f\u0160\7n\2\2\u0160\u0161\7D\2\2\u0161"+
		"\u0162\7w\2\2\u0162\u0163\7v\2\2\u0163\u0164\7v\2\2\u0164\u0165\7q\2\2"+
		"\u0165\u0166\7p\2\2\u0166T\3\2\2\2\u0167\u0168\7e\2\2\u0168\u0169\7j\2"+
		"\2\u0169\u016a\7k\2\2\u016a\u016b\7n\2\2\u016b\u016c\7f\2\2\u016cV\3\2"+
		"\2\2\u016d\u016e\7y\2\2\u016e\u016f\7k\2\2\u016f\u0170\7f\2\2\u0170\u0171"+
		"\7v\2\2\u0171\u0172\7j\2\2\u0172X\3\2\2\2\u0173\u0174\7j\2\2\u0174\u0175"+
		"\7g\2\2\u0175\u0176\7k\2\2\u0176\u0177\7i\2\2\u0177\u0178\7j\2\2\u0178"+
		"\u0179\7v\2\2\u0179Z\3\2\2\2\u017a\u017b\7e\2\2\u017b\u017c\7q\2\2\u017c"+
		"\u017d\7n\2\2\u017d\u017e\7q\2\2\u017e\u017f\7t\2\2\u017f\\\3\2\2\2\u0180"+
		"\u0181\7O\2\2\u0181\u0182\7c\2\2\u0182\u0183\7v\2\2\u0183\u0184\7g\2\2"+
		"\u0184\u0185\7t\2\2\u0185\u0186\7k\2\2\u0186\u0187\7c\2\2\u0187\u0188"+
		"\7n\2\2\u0188\u0189\7C\2\2\u0189\u018a\7r\2\2\u018a\u018b\7r\2\2\u018b"+
		"^\3\2\2\2\u018c\u018d\7j\2\2\u018d\u018e\7q\2\2\u018e\u018f\7o\2\2\u018f"+
		"\u0190\7g\2\2\u0190`\3\2\2\2\u0191\u0192\7U\2\2\u0192\u0193\7e\2\2\u0193"+
		"\u0194\7c\2\2\u0194\u0195\7h\2\2\u0195\u0196\7h\2\2\u0196\u0197\7q\2\2"+
		"\u0197\u0198\7n\2\2\u0198\u0199\7f\2\2\u0199b\3\2\2\2\u019a\u019b\7R\2"+
		"\2\u019b\u019c\7c\2\2\u019c\u019d\7f\2\2\u019d\u019e\7f\2\2\u019e\u019f"+
		"\7k\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7i\2\2\u01a1d\3\2\2\2\u01a2\u01a3"+
		"\7r\2\2\u01a3\u01a4\7c\2\2\u01a4\u01a5\7f\2\2\u01a5\u01a6\7f\2\2\u01a6"+
		"\u01a7\7k\2\2\u01a7\u01a8\7p\2\2\u01a8\u01a9\7i\2\2\u01a9f\3\2\2\2\u01aa"+
		"\u01ab\7G\2\2\u01ab\u01ac\7f\2\2\u01ac\u01ad\7i\2\2\u01ad\u01ae\7g\2\2"+
		"\u01ae\u01af\7K\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7u\2\2\u01b1\u01b2"+
		"\7g\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7u\2\2\u01b4h\3\2\2\2\u01b5\u01b6"+
		"\7T\2\2\u01b6\u01b7\7q\2\2\u01b7\u01b8\7y\2\2\u01b8j\3\2\2\2\u01b9\u01ba"+
		"\7E\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7n\2\2\u01bc\u01bd\7w\2\2\u01bd"+
		"\u01be\7o\2\2\u01be\u01bf\7p\2\2\u01bfl\3\2\2\2\u01c0\u01c1\7K\2\2\u01c1"+
		"\u01c2\7o\2\2\u01c2\u01c3\7c\2\2\u01c3\u01c4\7i\2\2\u01c4\u01c5\7g\2\2"+
		"\u01c5n\3\2\2\2\u01c6\u01c7\7d\2\2\u01c7\u01c8\7q\2\2\u01c8\u01c9\7f\2"+
		"\2\u01c9\u01ca\7{\2\2\u01cap\3\2\2\2\u01cb\u01cc\7V\2\2\u01cc\u01cd\7"+
		"g\2\2\u01cd\u01ce\7z\2\2\u01ce\u01cf\7v\2\2\u01cfr\3\2\2\2\u01d0\u01d1"+
		"\7p\2\2\u01d1\u01d2\7g\2\2\u01d2\u01d3\7v\2\2\u01d3\u01d4\7y\2\2\u01d4"+
		"\u01d5\7q\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7\7m\2\2\u01d7t\3\2\2\2\u01d8"+
		"\u01d9\7e\2\2\u01d9\u01da\7j\2\2\u01da\u01db\7k\2\2\u01db\u01dc\7n\2\2"+
		"\u01dc\u01dd\7f\2\2\u01dd\u01de\7t\2\2\u01de\u01df\7g\2\2\u01df\u01e0"+
		"\7p\2\2\u01e0v\3\2\2\2\u01e1\u01e2\7f\2\2\u01e2\u01e3\7{\2\2\u01e3\u01e4"+
		"\7p\2\2\u01e4\u01e5\7c\2\2\u01e5\u01e6\7o\2\2\u01e6\u01e7\7k\2\2\u01e7"+
		"\u01e8\7e\2\2\u01e8x\3\2\2\2\u01e9\u01ed\5\65\33\2\u01ea\u01ec\5\u008d"+
		"G\2\u01eb\u01ea\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01f0\3\2\2\2\u01ef\u01ed\3\2\2\2\u01f0\u01f1\7U"+
		"\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7c\2\2\u01f3\u01f4\7v\2\2\u01f4\u01f5"+
		"\7g\2\2\u01f5\u01f6\7h\2\2\u01f6\u01f7\7w\2\2\u01f7\u01f8\7n\2\2\u01f8"+
		"\u01f9\7Y\2\2\u01f9\u01fa\7k\2\2\u01fa\u01fb\7f\2\2\u01fb\u01fc\7i\2\2"+
		"\u01fc\u01fd\7g\2\2\u01fd\u01fe\7v\2\2\u01fez\3\2\2\2\u01ff\u0203\5\65"+
		"\33\2\u0200\u0202\5\u008dG\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0206\3\2\2\2\u0205\u0203\3\2"+
		"\2\2\u0206\u0207\7U\2\2\u0207\u0208\7v\2\2\u0208\u0209\7c\2\2\u0209\u020a"+
		"\7v\2\2\u020a\u020b\7g\2\2\u020b\u020c\7n\2\2\u020c\u020d\7g\2\2\u020d"+
		"\u020e\7u\2\2\u020e\u020f\7u\2\2\u020f\u0210\7Y\2\2\u0210\u0211\7k\2\2"+
		"\u0211\u0212\7f\2\2\u0212\u0213\7i\2\2\u0213\u0214\7g\2\2\u0214\u0215"+
		"\7v\2\2\u0215|\3\2\2\2\u0216\u0217\7v\2\2\u0217\u0218\7t\2\2\u0218\u0219"+
		"\7w\2\2\u0219\u021a\7g\2\2\u021a~\3\2\2\2\u021b\u021c\7h\2\2\u021c\u021d"+
		"\7c\2\2\u021d\u021e\7n\2\2\u021e\u021f\7u\2\2\u021f\u0220\7g\2\2\u0220"+
		"\u0080\3\2\2\2\u0221\u0223\t\3\2\2\u0222\u0221\3\2\2\2\u0223\u0224\3\2"+
		"\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0082\3\2\2\2\u0226"+
		"\u0228\t\4\2\2\u0227\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u022d\7\60\2\2\u022c"+
		"\u022e\t\4\2\2\u022d\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u022f\u0230\3\2\2\2\u0230\u0084\3\2\2\2\u0231\u0235\t\4\2\2\u0232"+
		"\u0234\t\4\2\2\u0233\u0232\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u0086\3\2\2\2\u0237\u0235\3\2\2\2\u0238"+
		"\u0239\7\61\2\2\u0239\u023a\7\61\2\2\u023a\u023e\3\2\2\2\u023b\u023d\n"+
		"\5\2\2\u023c\u023b\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2\2\u023e"+
		"\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242\bD"+
		"\2\2\u0242\u0088\3\2\2\2\u0243\u0247\7B\2\2\u0244\u0246\n\5\2\2\u0245"+
		"\u0244\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2"+
		"\2\2\u0248\u024a\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\bE\2\2\u024b"+
		"\u008a\3\2\2\2\u024c\u0250\7a\2\2\u024d\u024f\n\5\2\2\u024e\u024d\3\2"+
		"\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0253\3\2\2\2\u0252\u0250\3\2\2\2\u0253\u0254\bF\2\2\u0254\u008c\3\2"+
		"\2\2\u0255\u0257\t\6\2\2\u0256\u0255\3\2\2\2\u0257\u0258\3\2\2\2\u0258"+
		"\u0256\3\2\2\2\u0258\u0259\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025b\bG"+
		"\2\2\u025b\u008e\3\2\2\2\22\2\u0100\u0102\u010a\u010c\u0110\u01ed\u0203"+
		"\u0224\u0229\u022f\u0235\u023e\u0247\u0250\u0258\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}