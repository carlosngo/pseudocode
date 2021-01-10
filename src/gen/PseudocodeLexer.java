// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\PseudocodeLexer.g4 by ANTLR 4.9
package gen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudocodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, CharacterLiteral=2, FloatingLiteral=3, StringLiteral=4, 
		BooleanLiteral=5, Bool=6, Break=7, Char=8, Char16=9, Char32=10, Const=11, 
		Continue=12, Create=13, Do=14, Double=15, Else=16, False_=17, Final=18, 
		Float=19, For=20, If=21, Int=22, Long=23, New=24, Return=25, Short=26, 
		Signed=27, String=28, This=29, True_=30, Unsigned=31, Void=32, While=33, 
		LeftParen=34, RightParen=35, LeftBracket=36, RightBracket=37, LeftBrace=38, 
		RightBrace=39, Plus=40, Minus=41, Star=42, Div=43, Mod=44, Caret=45, And=46, 
		Or=47, Not=48, Assign=49, Less=50, Greater=51, PlusAssign=52, MinusAssign=53, 
		StarAssign=54, DivAssign=55, ModAssign=56, XorAssign=57, AndAssign=58, 
		OrAssign=59, Equal=60, NotEqual=61, LessEqual=62, GreaterEqual=63, AndAnd=64, 
		OrOr=65, PlusPlus=66, MinusMinus=67, Comma=68, ArrowStar=69, Arrow=70, 
		Colon=71, Semi=72, Dot=73, DotStar=74, Ellipsis=75, Up=76, Down=77, To=78, 
		Scan=79, Print=80, Then=81, Function=82, Main=83, Identifier=84, DecimalLiteral=85, 
		OctalLiteral=86, HexadecimalLiteral=87, BinaryLiteral=88, Integersuffix=89, 
		Whitespace=90, Newline=91, BlockComment=92, LineComment=93;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "Bool", "Break", "Char", "Char16", "Char32", "Const", 
			"Continue", "Create", "Do", "Double", "Else", "False_", "Final", "Float", 
			"For", "If", "Int", "Long", "New", "Return", "Short", "Signed", "String", 
			"This", "True_", "Unsigned", "Void", "While", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
			"Star", "Div", "Mod", "Caret", "And", "Or", "Not", "Assign", "Less", 
			"Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
			"XorAssign", "AndAssign", "OrAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"ArrowStar", "Arrow", "Colon", "Semi", "Dot", "DotStar", "Ellipsis", 
			"Up", "Down", "To", "Scan", "Print", "Then", "Function", "Main", "Identifier", 
			"Identifiernondigit", "NONDIGIT", "DIGIT", "DecimalLiteral", "OctalLiteral", 
			"HexadecimalLiteral", "BinaryLiteral", "NONZERODIGIT", "OCTALDIGIT", 
			"HEXADECIMALDIGIT", "BINARYDIGIT", "Integersuffix", "Unsignedsuffix", 
			"Longsuffix", "Longlongsuffix", "Cchar", "Escapesequence", "Simpleescapesequence", 
			"Octalescapesequence", "Hexadecimalescapesequence", "Fractionalconstant", 
			"Exponentpart", "SIGN", "Digitsequence", "Floatingsuffix", "Encodingprefix", 
			"Schar", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'break'", "'char'", "'char16_t'", 
			"'char32_t'", "'constant'", "'continue'", "'create'", "'do'", "'double'", 
			"'else'", "'F'", "'final'", "'float'", "'for'", "'if'", "'int'", "'long'", 
			"'new'", "'return'", "'short'", "'signed'", "'String'", "'this'", "'T'", 
			"'unsigned'", "'void'", "'while'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", null, 
			"'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'=='", "'!='", "'<='", "'>='", null, null, "'++'", "'--'", 
			"','", "'->*'", "'->'", "':'", "';'", "'.'", "'.*'", "'...'", "'up'", 
			"'down'", "'to'", "'scan'", "'print'", "'then'", "'func'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "Bool", "Break", "Char", "Char16", "Char32", "Const", 
			"Continue", "Create", "Do", "Double", "Else", "False_", "Final", "Float", 
			"For", "If", "Int", "Long", "New", "Return", "Short", "Signed", "String", 
			"This", "True_", "Unsigned", "Void", "While", "LeftParen", "RightParen", 
			"LeftBracket", "RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", 
			"Star", "Div", "Mod", "Caret", "And", "Or", "Not", "Assign", "Less", 
			"Greater", "PlusAssign", "MinusAssign", "StarAssign", "DivAssign", "ModAssign", 
			"XorAssign", "AndAssign", "OrAssign", "Equal", "NotEqual", "LessEqual", 
			"GreaterEqual", "AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", 
			"ArrowStar", "Arrow", "Colon", "Semi", "Dot", "DotStar", "Ellipsis", 
			"Up", "Down", "To", "Scan", "Print", "Then", "Function", "Main", "Identifier", 
			"DecimalLiteral", "OctalLiteral", "HexadecimalLiteral", "BinaryLiteral", 
			"Integersuffix", "Whitespace", "Newline", "BlockComment", "LineComment"
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


	public PseudocodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PseudocodeLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2_\u0360\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\3\2\3\2\5\2\u00ec"+
		"\n\2\3\2\3\2\5\2\u00f0\n\2\3\2\3\2\5\2\u00f4\n\2\3\2\3\2\5\2\u00f8\n\2"+
		"\5\2\u00fa\n\2\3\3\5\3\u00fd\n\3\3\3\3\3\6\3\u0101\n\3\r\3\16\3\u0102"+
		"\3\3\3\3\3\4\3\4\5\4\u0109\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0111\n\4\3"+
		"\5\5\5\u0114\n\5\3\5\3\5\7\5\u0118\n\5\f\5\16\5\u011b\13\5\3\5\3\5\3\6"+
		"\3\6\5\6\u0121\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u012e"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3"+
		"*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\61\5\61\u01ed"+
		"\n\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3\67"+
		"\3\67\3\67\38\38\38\39\39\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3"+
		">\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3A\3A\5A\u021e\nA\3B\3B\3B\3B\5B\u0224"+
		"\nB\3C\3C\3C\3D\3D\3D\3E\3E\3F\3F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3J\3J\3K"+
		"\3K\3K\3L\3L\3L\3L\3M\3M\3M\3N\3N\3N\3N\3N\3O\3O\3O\3P\3P\3P\3P\3P\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3T\3T\3T\3T\3T\3U\3U\3U"+
		"\7U\u026a\nU\fU\16U\u026d\13U\3V\3V\3W\3W\3X\3X\3Y\3Y\5Y\u0277\nY\3Y\7"+
		"Y\u027a\nY\fY\16Y\u027d\13Y\3Z\3Z\5Z\u0281\nZ\3Z\7Z\u0284\nZ\fZ\16Z\u0287"+
		"\13Z\3[\3[\3[\3[\5[\u028d\n[\3[\3[\5[\u0291\n[\3[\7[\u0294\n[\f[\16[\u0297"+
		"\13[\3\\\3\\\3\\\3\\\5\\\u029d\n\\\3\\\3\\\5\\\u02a1\n\\\3\\\7\\\u02a4"+
		"\n\\\f\\\16\\\u02a7\13\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\5a\u02b3\na\3a"+
		"\3a\5a\u02b7\na\3a\3a\5a\u02bb\na\3a\3a\5a\u02bf\na\5a\u02c1\na\3b\3b"+
		"\3c\3c\3d\3d\3d\3d\5d\u02cb\nd\3e\3e\5e\u02cf\ne\3f\3f\3f\5f\u02d4\nf"+
		"\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\3g\5g\u02eb"+
		"\ng\3g\5g\u02ee\ng\3g\3g\3g\3g\5g\u02f4\ng\3h\3h\3h\3h\3h\3h\3h\3h\3h"+
		"\3h\3h\5h\u0301\nh\3i\3i\3i\3i\6i\u0307\ni\ri\16i\u0308\3j\5j\u030c\n"+
		"j\3j\3j\3j\3j\3j\5j\u0313\nj\3k\3k\5k\u0317\nk\3k\3k\3k\5k\u031c\nk\3"+
		"k\5k\u031f\nk\3l\3l\3m\3m\5m\u0325\nm\3m\7m\u0328\nm\fm\16m\u032b\13m"+
		"\3n\3n\3o\3o\3o\5o\u0332\no\3p\3p\5p\u0336\np\3q\6q\u0339\nq\rq\16q\u033a"+
		"\3q\3q\3r\3r\5r\u0341\nr\3r\5r\u0344\nr\3r\3r\3s\3s\3s\3s\7s\u034c\ns"+
		"\fs\16s\u034f\13s\3s\3s\3s\3s\3s\3t\3t\3t\3t\7t\u035a\nt\ft\16t\u035d"+
		"\13t\3t\3t\3\u034d\2u\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab\2\u00ad\2\u00af\2\u00b1"+
		"W\u00b3X\u00b5Y\u00b7Z\u00b9\2\u00bb\2\u00bd\2\u00bf\2\u00c1[\u00c3\2"+
		"\u00c5\2\u00c7\2\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5"+
		"\2\u00d7\2\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1\\\u00e3]\u00e5^\u00e7"+
		"_\3\2\21\5\2NNWWww\5\2C\\aac|\3\2\62;\3\2\63;\3\2\629\5\2\62;CHch\3\2"+
		"\62\63\4\2WWww\4\2NNnn\6\2\f\f\17\17))^^\4\2--//\6\2HHNNhhnn\6\2\f\f\17"+
		"\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u0390\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2"+
		"M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3"+
		"\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2"+
		"\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2"+
		"s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00b1\3\2\2"+
		"\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00c1\3\2\2\2\2\u00e1"+
		"\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\3\u00f9\3\2\2"+
		"\2\5\u00fc\3\2\2\2\7\u0110\3\2\2\2\t\u0113\3\2\2\2\13\u0120\3\2\2\2\r"+
		"\u012d\3\2\2\2\17\u012f\3\2\2\2\21\u0135\3\2\2\2\23\u013a\3\2\2\2\25\u0143"+
		"\3\2\2\2\27\u014c\3\2\2\2\31\u0155\3\2\2\2\33\u015e\3\2\2\2\35\u0165\3"+
		"\2\2\2\37\u0168\3\2\2\2!\u016f\3\2\2\2#\u0174\3\2\2\2%\u0176\3\2\2\2\'"+
		"\u017c\3\2\2\2)\u0182\3\2\2\2+\u0186\3\2\2\2-\u0189\3\2\2\2/\u018d\3\2"+
		"\2\2\61\u0192\3\2\2\2\63\u0196\3\2\2\2\65\u019d\3\2\2\2\67\u01a3\3\2\2"+
		"\29\u01aa\3\2\2\2;\u01b1\3\2\2\2=\u01b6\3\2\2\2?\u01b8\3\2\2\2A\u01c1"+
		"\3\2\2\2C\u01c6\3\2\2\2E\u01cc\3\2\2\2G\u01ce\3\2\2\2I\u01d0\3\2\2\2K"+
		"\u01d2\3\2\2\2M\u01d4\3\2\2\2O\u01d6\3\2\2\2Q\u01d8\3\2\2\2S\u01da\3\2"+
		"\2\2U\u01dc\3\2\2\2W\u01de\3\2\2\2Y\u01e0\3\2\2\2[\u01e2\3\2\2\2]\u01e4"+
		"\3\2\2\2_\u01e6\3\2\2\2a\u01ec\3\2\2\2c\u01ee\3\2\2\2e\u01f0\3\2\2\2g"+
		"\u01f2\3\2\2\2i\u01f4\3\2\2\2k\u01f7\3\2\2\2m\u01fa\3\2\2\2o\u01fd\3\2"+
		"\2\2q\u0200\3\2\2\2s\u0203\3\2\2\2u\u0206\3\2\2\2w\u0209\3\2\2\2y\u020c"+
		"\3\2\2\2{\u020f\3\2\2\2}\u0212\3\2\2\2\177\u0215\3\2\2\2\u0081\u021d\3"+
		"\2\2\2\u0083\u0223\3\2\2\2\u0085\u0225\3\2\2\2\u0087\u0228\3\2\2\2\u0089"+
		"\u022b\3\2\2\2\u008b\u022d\3\2\2\2\u008d\u0231\3\2\2\2\u008f\u0234\3\2"+
		"\2\2\u0091\u0236\3\2\2\2\u0093\u0238\3\2\2\2\u0095\u023a\3\2\2\2\u0097"+
		"\u023d\3\2\2\2\u0099\u0241\3\2\2\2\u009b\u0244\3\2\2\2\u009d\u0249\3\2"+
		"\2\2\u009f\u024c\3\2\2\2\u00a1\u0251\3\2\2\2\u00a3\u0257\3\2\2\2\u00a5"+
		"\u025c\3\2\2\2\u00a7\u0261\3\2\2\2\u00a9\u0266\3\2\2\2\u00ab\u026e\3\2"+
		"\2\2\u00ad\u0270\3\2\2\2\u00af\u0272\3\2\2\2\u00b1\u0274\3\2\2\2\u00b3"+
		"\u027e\3\2\2\2\u00b5\u028c\3\2\2\2\u00b7\u029c\3\2\2\2\u00b9\u02a8\3\2"+
		"\2\2\u00bb\u02aa\3\2\2\2\u00bd\u02ac\3\2\2\2\u00bf\u02ae\3\2\2\2\u00c1"+
		"\u02c0\3\2\2\2\u00c3\u02c2\3\2\2\2\u00c5\u02c4\3\2\2\2\u00c7\u02ca\3\2"+
		"\2\2\u00c9\u02ce\3\2\2\2\u00cb\u02d3\3\2\2\2\u00cd\u02f3\3\2\2\2\u00cf"+
		"\u0300\3\2\2\2\u00d1\u0302\3\2\2\2\u00d3\u0312\3\2\2\2\u00d5\u031e\3\2"+
		"\2\2\u00d7\u0320\3\2\2\2\u00d9\u0322\3\2\2\2\u00db\u032c\3\2\2\2\u00dd"+
		"\u0331\3\2\2\2\u00df\u0335\3\2\2\2\u00e1\u0338\3\2\2\2\u00e3\u0343\3\2"+
		"\2\2\u00e5\u0347\3\2\2\2\u00e7\u0355\3\2\2\2\u00e9\u00eb\5\u00b1Y\2\u00ea"+
		"\u00ec\5\u00c1a\2\u00eb\u00ea\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00fa"+
		"\3\2\2\2\u00ed\u00ef\5\u00b3Z\2\u00ee\u00f0\5\u00c1a\2\u00ef\u00ee\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00fa\3\2\2\2\u00f1\u00f3\5\u00b5[\2\u00f2"+
		"\u00f4\5\u00c1a\2\u00f3\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fa"+
		"\3\2\2\2\u00f5\u00f7\5\u00b7\\\2\u00f6\u00f8\5\u00c1a\2\u00f7\u00f6\3"+
		"\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00e9\3\2\2\2\u00f9"+
		"\u00ed\3\2\2\2\u00f9\u00f1\3\2\2\2\u00f9\u00f5\3\2\2\2\u00fa\4\3\2\2\2"+
		"\u00fb\u00fd\t\2\2\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u0100\7)\2\2\u00ff\u0101\5\u00c9e\2\u0100\u00ff\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0105\7)\2\2\u0105\6\3\2\2\2\u0106\u0108\5\u00d3j\2\u0107"+
		"\u0109\5\u00d5k\2\u0108\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a"+
		"\3\2\2\2\u010a\u010b\5\u00dbn\2\u010b\u0111\3\2\2\2\u010c\u010d\5\u00d9"+
		"m\2\u010d\u010e\5\u00d5k\2\u010e\u010f\5\u00dbn\2\u010f\u0111\3\2\2\2"+
		"\u0110\u0106\3\2\2\2\u0110\u010c\3\2\2\2\u0111\b\3\2\2\2\u0112\u0114\5"+
		"\u00ddo\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2\2\2"+
		"\u0115\u0119\7$\2\2\u0116\u0118\5\u00dfp\2\u0117\u0116\3\2\2\2\u0118\u011b"+
		"\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011c\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011d\7$\2\2\u011d\n\3\2\2\2\u011e\u0121\5#\22\2"+
		"\u011f\u0121\5=\37\2\u0120\u011e\3\2\2\2\u0120\u011f\3\2\2\2\u0121\f\3"+
		"\2\2\2\u0122\u0123\7d\2\2\u0123\u0124\7q\2\2\u0124\u0125\7q\2\2\u0125"+
		"\u012e\7n\2\2\u0126\u0127\7d\2\2\u0127\u0128\7q\2\2\u0128\u0129\7q\2\2"+
		"\u0129\u012a\7n\2\2\u012a\u012b\7g\2\2\u012b\u012c\7c\2\2\u012c\u012e"+
		"\7p\2\2\u012d\u0122\3\2\2\2\u012d\u0126\3\2\2\2\u012e\16\3\2\2\2\u012f"+
		"\u0130\7d\2\2\u0130\u0131\7t\2\2\u0131\u0132\7g\2\2\u0132\u0133\7c\2\2"+
		"\u0133\u0134\7m\2\2\u0134\20\3\2\2\2\u0135\u0136\7e\2\2\u0136\u0137\7"+
		"j\2\2\u0137\u0138\7c\2\2\u0138\u0139\7t\2\2\u0139\22\3\2\2\2\u013a\u013b"+
		"\7e\2\2\u013b\u013c\7j\2\2\u013c\u013d\7c\2\2\u013d\u013e\7t\2\2\u013e"+
		"\u013f\7\63\2\2\u013f\u0140\78\2\2\u0140\u0141\7a\2\2\u0141\u0142\7v\2"+
		"\2\u0142\24\3\2\2\2\u0143\u0144\7e\2\2\u0144\u0145\7j\2\2\u0145\u0146"+
		"\7c\2\2\u0146\u0147\7t\2\2\u0147\u0148\7\65\2\2\u0148\u0149\7\64\2\2\u0149"+
		"\u014a\7a\2\2\u014a\u014b\7v\2\2\u014b\26\3\2\2\2\u014c\u014d\7e\2\2\u014d"+
		"\u014e\7q\2\2\u014e\u014f\7p\2\2\u014f\u0150\7u\2\2\u0150\u0151\7v\2\2"+
		"\u0151\u0152\7c\2\2\u0152\u0153\7p\2\2\u0153\u0154\7v\2\2\u0154\30\3\2"+
		"\2\2\u0155\u0156\7e\2\2\u0156\u0157\7q\2\2\u0157\u0158\7p\2\2\u0158\u0159"+
		"\7v\2\2\u0159\u015a\7k\2\2\u015a\u015b\7p\2\2\u015b\u015c\7w\2\2\u015c"+
		"\u015d\7g\2\2\u015d\32\3\2\2\2\u015e\u015f\7e\2\2\u015f\u0160\7t\2\2\u0160"+
		"\u0161\7g\2\2\u0161\u0162\7c\2\2\u0162\u0163\7v\2\2\u0163\u0164\7g\2\2"+
		"\u0164\34\3\2\2\2\u0165\u0166\7f\2\2\u0166\u0167\7q\2\2\u0167\36\3\2\2"+
		"\2\u0168\u0169\7f\2\2\u0169\u016a\7q\2\2\u016a\u016b\7w\2\2\u016b\u016c"+
		"\7d\2\2\u016c\u016d\7n\2\2\u016d\u016e\7g\2\2\u016e \3\2\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7n\2\2\u0171\u0172\7u\2\2\u0172\u0173\7g\2\2\u0173"+
		"\"\3\2\2\2\u0174\u0175\7H\2\2\u0175$\3\2\2\2\u0176\u0177\7h\2\2\u0177"+
		"\u0178\7k\2\2\u0178\u0179\7p\2\2\u0179\u017a\7c\2\2\u017a\u017b\7n\2\2"+
		"\u017b&\3\2\2\2\u017c\u017d\7h\2\2\u017d\u017e\7n\2\2\u017e\u017f\7q\2"+
		"\2\u017f\u0180\7c\2\2\u0180\u0181\7v\2\2\u0181(\3\2\2\2\u0182\u0183\7"+
		"h\2\2\u0183\u0184\7q\2\2\u0184\u0185\7t\2\2\u0185*\3\2\2\2\u0186\u0187"+
		"\7k\2\2\u0187\u0188\7h\2\2\u0188,\3\2\2\2\u0189\u018a\7k\2\2\u018a\u018b"+
		"\7p\2\2\u018b\u018c\7v\2\2\u018c.\3\2\2\2\u018d\u018e\7n\2\2\u018e\u018f"+
		"\7q\2\2\u018f\u0190\7p\2\2\u0190\u0191\7i\2\2\u0191\60\3\2\2\2\u0192\u0193"+
		"\7p\2\2\u0193\u0194\7g\2\2\u0194\u0195\7y\2\2\u0195\62\3\2\2\2\u0196\u0197"+
		"\7t\2\2\u0197\u0198\7g\2\2\u0198\u0199\7v\2\2\u0199\u019a\7w\2\2\u019a"+
		"\u019b\7t\2\2\u019b\u019c\7p\2\2\u019c\64\3\2\2\2\u019d\u019e\7u\2\2\u019e"+
		"\u019f\7j\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7t\2\2\u01a1\u01a2\7v\2\2"+
		"\u01a2\66\3\2\2\2\u01a3\u01a4\7u\2\2\u01a4\u01a5\7k\2\2\u01a5\u01a6\7"+
		"i\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7g\2\2\u01a8\u01a9\7f\2\2\u01a98"+
		"\3\2\2\2\u01aa\u01ab\7U\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7t\2\2\u01ad"+
		"\u01ae\7k\2\2\u01ae\u01af\7p\2\2\u01af\u01b0\7i\2\2\u01b0:\3\2\2\2\u01b1"+
		"\u01b2\7v\2\2\u01b2\u01b3\7j\2\2\u01b3\u01b4\7k\2\2\u01b4\u01b5\7u\2\2"+
		"\u01b5<\3\2\2\2\u01b6\u01b7\7V\2\2\u01b7>\3\2\2\2\u01b8\u01b9\7w\2\2\u01b9"+
		"\u01ba\7p\2\2\u01ba\u01bb\7u\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7i\2\2"+
		"\u01bd\u01be\7p\2\2\u01be\u01bf\7g\2\2\u01bf\u01c0\7f\2\2\u01c0@\3\2\2"+
		"\2\u01c1\u01c2\7x\2\2\u01c2\u01c3\7q\2\2\u01c3\u01c4\7k\2\2\u01c4\u01c5"+
		"\7f\2\2\u01c5B\3\2\2\2\u01c6\u01c7\7y\2\2\u01c7\u01c8\7j\2\2\u01c8\u01c9"+
		"\7k\2\2\u01c9\u01ca\7n\2\2\u01ca\u01cb\7g\2\2\u01cbD\3\2\2\2\u01cc\u01cd"+
		"\7*\2\2\u01cdF\3\2\2\2\u01ce\u01cf\7+\2\2\u01cfH\3\2\2\2\u01d0\u01d1\7"+
		"]\2\2\u01d1J\3\2\2\2\u01d2\u01d3\7_\2\2\u01d3L\3\2\2\2\u01d4\u01d5\7}"+
		"\2\2\u01d5N\3\2\2\2\u01d6\u01d7\7\177\2\2\u01d7P\3\2\2\2\u01d8\u01d9\7"+
		"-\2\2\u01d9R\3\2\2\2\u01da\u01db\7/\2\2\u01dbT\3\2\2\2\u01dc\u01dd\7,"+
		"\2\2\u01ddV\3\2\2\2\u01de\u01df\7\61\2\2\u01dfX\3\2\2\2\u01e0\u01e1\7"+
		"\'\2\2\u01e1Z\3\2\2\2\u01e2\u01e3\7`\2\2\u01e3\\\3\2\2\2\u01e4\u01e5\7"+
		"(\2\2\u01e5^\3\2\2\2\u01e6\u01e7\7~\2\2\u01e7`\3\2\2\2\u01e8\u01ed\7#"+
		"\2\2\u01e9\u01ea\7p\2\2\u01ea\u01eb\7q\2\2\u01eb\u01ed\7v\2\2\u01ec\u01e8"+
		"\3\2\2\2\u01ec\u01e9\3\2\2\2\u01edb\3\2\2\2\u01ee\u01ef\7?\2\2\u01efd"+
		"\3\2\2\2\u01f0\u01f1\7>\2\2\u01f1f\3\2\2\2\u01f2\u01f3\7@\2\2\u01f3h\3"+
		"\2\2\2\u01f4\u01f5\7-\2\2\u01f5\u01f6\7?\2\2\u01f6j\3\2\2\2\u01f7\u01f8"+
		"\7/\2\2\u01f8\u01f9\7?\2\2\u01f9l\3\2\2\2\u01fa\u01fb\7,\2\2\u01fb\u01fc"+
		"\7?\2\2\u01fcn\3\2\2\2\u01fd\u01fe\7\61\2\2\u01fe\u01ff\7?\2\2\u01ffp"+
		"\3\2\2\2\u0200\u0201\7\'\2\2\u0201\u0202\7?\2\2\u0202r\3\2\2\2\u0203\u0204"+
		"\7`\2\2\u0204\u0205\7?\2\2\u0205t\3\2\2\2\u0206\u0207\7(\2\2\u0207\u0208"+
		"\7?\2\2\u0208v\3\2\2\2\u0209\u020a\7~\2\2\u020a\u020b\7?\2\2\u020bx\3"+
		"\2\2\2\u020c\u020d\7?\2\2\u020d\u020e\7?\2\2\u020ez\3\2\2\2\u020f\u0210"+
		"\7#\2\2\u0210\u0211\7?\2\2\u0211|\3\2\2\2\u0212\u0213\7>\2\2\u0213\u0214"+
		"\7?\2\2\u0214~\3\2\2\2\u0215\u0216\7@\2\2\u0216\u0217\7?\2\2\u0217\u0080"+
		"\3\2\2\2\u0218\u0219\7(\2\2\u0219\u021e\7(\2\2\u021a\u021b\7c\2\2\u021b"+
		"\u021c\7p\2\2\u021c\u021e\7f\2\2\u021d\u0218\3\2\2\2\u021d\u021a\3\2\2"+
		"\2\u021e\u0082\3\2\2\2\u021f\u0220\7~\2\2\u0220\u0224\7~\2\2\u0221\u0222"+
		"\7q\2\2\u0222\u0224\7t\2\2\u0223\u021f\3\2\2\2\u0223\u0221\3\2\2\2\u0224"+
		"\u0084\3\2\2\2\u0225\u0226\7-\2\2\u0226\u0227\7-\2\2\u0227\u0086\3\2\2"+
		"\2\u0228\u0229\7/\2\2\u0229\u022a\7/\2\2\u022a\u0088\3\2\2\2\u022b\u022c"+
		"\7.\2\2\u022c\u008a\3\2\2\2\u022d\u022e\7/\2\2\u022e\u022f\7@\2\2\u022f"+
		"\u0230\7,\2\2\u0230\u008c\3\2\2\2\u0231\u0232\7/\2\2\u0232\u0233\7@\2"+
		"\2\u0233\u008e\3\2\2\2\u0234\u0235\7<\2\2\u0235\u0090\3\2\2\2\u0236\u0237"+
		"\7=\2\2\u0237\u0092\3\2\2\2\u0238\u0239\7\60\2\2\u0239\u0094\3\2\2\2\u023a"+
		"\u023b\7\60\2\2\u023b\u023c\7,\2\2\u023c\u0096\3\2\2\2\u023d\u023e\7\60"+
		"\2\2\u023e\u023f\7\60\2\2\u023f\u0240\7\60\2\2\u0240\u0098\3\2\2\2\u0241"+
		"\u0242\7w\2\2\u0242\u0243\7r\2\2\u0243\u009a\3\2\2\2\u0244\u0245\7f\2"+
		"\2\u0245\u0246\7q\2\2\u0246\u0247\7y\2\2\u0247\u0248\7p\2\2\u0248\u009c"+
		"\3\2\2\2\u0249\u024a\7v\2\2\u024a\u024b\7q\2\2\u024b\u009e\3\2\2\2\u024c"+
		"\u024d\7u\2\2\u024d\u024e\7e\2\2\u024e\u024f\7c\2\2\u024f\u0250\7p\2\2"+
		"\u0250\u00a0\3\2\2\2\u0251\u0252\7r\2\2\u0252\u0253\7t\2\2\u0253\u0254"+
		"\7k\2\2\u0254\u0255\7p\2\2\u0255\u0256\7v\2\2\u0256\u00a2\3\2\2\2\u0257"+
		"\u0258\7v\2\2\u0258\u0259\7j\2\2\u0259\u025a\7g\2\2\u025a\u025b\7p\2\2"+
		"\u025b\u00a4\3\2\2\2\u025c\u025d\7h\2\2\u025d\u025e\7w\2\2\u025e\u025f"+
		"\7p\2\2\u025f\u0260\7e\2\2\u0260\u00a6\3\2\2\2\u0261\u0262\7o\2\2\u0262"+
		"\u0263\7c\2\2\u0263\u0264\7k\2\2\u0264\u0265\7p\2\2\u0265\u00a8\3\2\2"+
		"\2\u0266\u026b\5\u00abV\2\u0267\u026a\5\u00abV\2\u0268\u026a\5\u00afX"+
		"\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269"+
		"\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u00aa\3\2\2\2\u026d\u026b\3\2\2\2\u026e"+
		"\u026f\5\u00adW\2\u026f\u00ac\3\2\2\2\u0270\u0271\t\3\2\2\u0271\u00ae"+
		"\3\2\2\2\u0272\u0273\t\4\2\2\u0273\u00b0\3\2\2\2\u0274\u027b\5\u00b9]"+
		"\2\u0275\u0277\7)\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u0278"+
		"\3\2\2\2\u0278\u027a\5\u00afX\2\u0279\u0276\3\2\2\2\u027a\u027d\3\2\2"+
		"\2\u027b\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u00b2\3\2\2\2\u027d\u027b"+
		"\3\2\2\2\u027e\u0285\7\62\2\2\u027f\u0281\7)\2\2\u0280\u027f\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\u0282\3\2\2\2\u0282\u0284\5\u00bb^\2\u0283\u0280"+
		"\3\2\2\2\u0284\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286"+
		"\u00b4\3\2\2\2\u0287\u0285\3\2\2\2\u0288\u0289\7\62\2\2\u0289\u028d\7"+
		"z\2\2\u028a\u028b\7\62\2\2\u028b\u028d\7Z\2\2\u028c\u0288\3\2\2\2\u028c"+
		"\u028a\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u0295\5\u00bd_\2\u028f\u0291"+
		"\7)\2\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292"+
		"\u0294\5\u00bd_\2\u0293\u0290\3\2\2\2\u0294\u0297\3\2\2\2\u0295\u0293"+
		"\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u00b6\3\2\2\2\u0297\u0295\3\2\2\2\u0298"+
		"\u0299\7\62\2\2\u0299\u029d\7d\2\2\u029a\u029b\7\62\2\2\u029b\u029d\7"+
		"D\2\2\u029c\u0298\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029e\3\2\2\2\u029e"+
		"\u02a5\5\u00bf`\2\u029f\u02a1\7)\2\2\u02a0\u029f\3\2\2\2\u02a0\u02a1\3"+
		"\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\5\u00bf`\2\u02a3\u02a0\3\2\2\2"+
		"\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u00b8"+
		"\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\t\5\2\2\u02a9\u00ba\3\2\2\2\u02aa"+
		"\u02ab\t\6\2\2\u02ab\u00bc\3\2\2\2\u02ac\u02ad\t\7\2\2\u02ad\u00be\3\2"+
		"\2\2\u02ae\u02af\t\b\2\2\u02af\u00c0\3\2\2\2\u02b0\u02b2\5\u00c3b\2\u02b1"+
		"\u02b3\5\u00c5c\2\u02b2\u02b1\3\2\2\2\u02b2\u02b3\3\2\2\2\u02b3\u02c1"+
		"\3\2\2\2\u02b4\u02b6\5\u00c3b\2\u02b5\u02b7\5\u00c7d\2\u02b6\u02b5\3\2"+
		"\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02c1\3\2\2\2\u02b8\u02ba\5\u00c5c\2\u02b9"+
		"\u02bb\5\u00c3b\2\u02ba\u02b9\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02c1"+
		"\3\2\2\2\u02bc\u02be\5\u00c7d\2\u02bd\u02bf\5\u00c3b\2\u02be\u02bd\3\2"+
		"\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02b0\3\2\2\2\u02c0"+
		"\u02b4\3\2\2\2\u02c0\u02b8\3\2\2\2\u02c0\u02bc\3\2\2\2\u02c1\u00c2\3\2"+
		"\2\2\u02c2\u02c3\t\t\2\2\u02c3\u00c4\3\2\2\2\u02c4\u02c5\t\n\2\2\u02c5"+
		"\u00c6\3\2\2\2\u02c6\u02c7\7n\2\2\u02c7\u02cb\7n\2\2\u02c8\u02c9\7N\2"+
		"\2\u02c9\u02cb\7N\2\2\u02ca\u02c6\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb\u00c8"+
		"\3\2\2\2\u02cc\u02cf\n\13\2\2\u02cd\u02cf\5\u00cbf\2\u02ce\u02cc\3\2\2"+
		"\2\u02ce\u02cd\3\2\2\2\u02cf\u00ca\3\2\2\2\u02d0\u02d4\5\u00cdg\2\u02d1"+
		"\u02d4\5\u00cfh\2\u02d2\u02d4\5\u00d1i\2\u02d3\u02d0\3\2\2\2\u02d3\u02d1"+
		"\3\2\2\2\u02d3\u02d2\3\2\2\2\u02d4\u00cc\3\2\2\2\u02d5\u02d6\7^\2\2\u02d6"+
		"\u02f4\7)\2\2\u02d7\u02d8\7^\2\2\u02d8\u02f4\7$\2\2\u02d9\u02da\7^\2\2"+
		"\u02da\u02f4\7A\2\2\u02db\u02dc\7^\2\2\u02dc\u02f4\7^\2\2\u02dd\u02de"+
		"\7^\2\2\u02de\u02f4\7c\2\2\u02df\u02e0\7^\2\2\u02e0\u02f4\7d\2\2\u02e1"+
		"\u02e2\7^\2\2\u02e2\u02f4\7h\2\2\u02e3\u02e4\7^\2\2\u02e4\u02f4\7p\2\2"+
		"\u02e5\u02e6\7^\2\2\u02e6\u02f4\7t\2\2\u02e7\u02ed\7^\2\2\u02e8\u02ea"+
		"\7\17\2\2\u02e9\u02eb\7\f\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2"+
		"\u02eb\u02ee\3\2\2\2\u02ec\u02ee\7\f\2\2\u02ed\u02e8\3\2\2\2\u02ed\u02ec"+
		"\3\2\2\2\u02ee\u02f4\3\2\2\2\u02ef\u02f0\7^\2\2\u02f0\u02f4\7v\2\2\u02f1"+
		"\u02f2\7^\2\2\u02f2\u02f4\7x\2\2\u02f3\u02d5\3\2\2\2\u02f3\u02d7\3\2\2"+
		"\2\u02f3\u02d9\3\2\2\2\u02f3\u02db\3\2\2\2\u02f3\u02dd\3\2\2\2\u02f3\u02df"+
		"\3\2\2\2\u02f3\u02e1\3\2\2\2\u02f3\u02e3\3\2\2\2\u02f3\u02e5\3\2\2\2\u02f3"+
		"\u02e7\3\2\2\2\u02f3\u02ef\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f4\u00ce\3\2"+
		"\2\2\u02f5\u02f6\7^\2\2\u02f6\u0301\5\u00bb^\2\u02f7\u02f8\7^\2\2\u02f8"+
		"\u02f9\5\u00bb^\2\u02f9\u02fa\5\u00bb^\2\u02fa\u0301\3\2\2\2\u02fb\u02fc"+
		"\7^\2\2\u02fc\u02fd\5\u00bb^\2\u02fd\u02fe\5\u00bb^\2\u02fe\u02ff\5\u00bb"+
		"^\2\u02ff\u0301\3\2\2\2\u0300\u02f5\3\2\2\2\u0300\u02f7\3\2\2\2\u0300"+
		"\u02fb\3\2\2\2\u0301\u00d0\3\2\2\2\u0302\u0303\7^\2\2\u0303\u0304\7z\2"+
		"\2\u0304\u0306\3\2\2\2\u0305\u0307\5\u00bd_\2\u0306\u0305\3\2\2\2\u0307"+
		"\u0308\3\2\2\2\u0308\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u00d2\3\2"+
		"\2\2\u030a\u030c\5\u00d9m\2\u030b\u030a\3\2\2\2\u030b\u030c\3\2\2\2\u030c"+
		"\u030d\3\2\2\2\u030d\u030e\7\60\2\2\u030e\u0313\5\u00d9m\2\u030f\u0310"+
		"\5\u00d9m\2\u0310\u0311\7\60\2\2\u0311\u0313\3\2\2\2\u0312\u030b\3\2\2"+
		"\2\u0312\u030f\3\2\2\2\u0313\u00d4\3\2\2\2\u0314\u0316\7g\2\2\u0315\u0317"+
		"\5\u00d7l\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2\2"+
		"\2\u0318\u031f\5\u00d9m\2\u0319\u031b\7G\2\2\u031a\u031c\5\u00d7l\2\u031b"+
		"\u031a\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031d\3\2\2\2\u031d\u031f\5\u00d9"+
		"m\2\u031e\u0314\3\2\2\2\u031e\u0319\3\2\2\2\u031f\u00d6\3\2\2\2\u0320"+
		"\u0321\t\f\2\2\u0321\u00d8\3\2\2\2\u0322\u0329\5\u00afX\2\u0323\u0325"+
		"\7)\2\2\u0324\u0323\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0328\5\u00afX\2\u0327\u0324\3\2\2\2\u0328\u032b\3\2\2\2\u0329\u0327"+
		"\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u00da\3\2\2\2\u032b\u0329\3\2\2\2\u032c"+
		"\u032d\t\r\2\2\u032d\u00dc\3\2\2\2\u032e\u032f\7w\2\2\u032f\u0332\7:\2"+
		"\2\u0330\u0332\t\2\2\2\u0331\u032e\3\2\2\2\u0331\u0330\3\2\2\2\u0332\u00de"+
		"\3\2\2\2\u0333\u0336\n\16\2\2\u0334\u0336\5\u00cbf\2\u0335\u0333\3\2\2"+
		"\2\u0335\u0334\3\2\2\2\u0336\u00e0\3\2\2\2\u0337\u0339\t\17\2\2\u0338"+
		"\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u0338\3\2\2\2\u033a\u033b\3\2"+
		"\2\2\u033b\u033c\3\2\2\2\u033c\u033d\bq\2\2\u033d\u00e2\3\2\2\2\u033e"+
		"\u0340\7\17\2\2\u033f\u0341\7\f\2\2\u0340\u033f\3\2\2\2\u0340\u0341\3"+
		"\2\2\2\u0341\u0344\3\2\2\2\u0342\u0344\7\f\2\2\u0343\u033e\3\2\2\2\u0343"+
		"\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\br\2\2\u0346\u00e4\3\2"+
		"\2\2\u0347\u0348\7\61\2\2\u0348\u0349\7,\2\2\u0349\u034d\3\2\2\2\u034a"+
		"\u034c\13\2\2\2\u034b\u034a\3\2\2\2\u034c\u034f\3\2\2\2\u034d\u034e\3"+
		"\2\2\2\u034d\u034b\3\2\2\2\u034e\u0350\3\2\2\2\u034f\u034d\3\2\2\2\u0350"+
		"\u0351\7,\2\2\u0351\u0352\7\61\2\2\u0352\u0353\3\2\2\2\u0353\u0354\bs"+
		"\2\2\u0354\u00e6\3\2\2\2\u0355\u0356\7\61\2\2\u0356\u0357\7\61\2\2\u0357"+
		"\u035b\3\2\2\2\u0358\u035a\n\20\2\2\u0359\u0358\3\2\2\2\u035a\u035d\3"+
		"\2\2\2\u035b\u0359\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035e\3\2\2\2\u035d"+
		"\u035b\3\2\2\2\u035e\u035f\bt\2\2\u035f\u00e8\3\2\2\2:\2\u00eb\u00ef\u00f3"+
		"\u00f7\u00f9\u00fc\u0102\u0108\u0110\u0113\u0119\u0120\u012d\u01ec\u021d"+
		"\u0223\u0269\u026b\u0276\u027b\u0280\u0285\u028c\u0290\u0295\u029c\u02a0"+
		"\u02a5\u02b2\u02b6\u02ba\u02be\u02c0\u02ca\u02ce\u02d3\u02ea\u02ed\u02f3"+
		"\u0300\u0308\u030b\u0312\u0316\u031b\u031e\u0324\u0329\u0331\u0335\u033a"+
		"\u0340\u0343\u034d\u035b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}