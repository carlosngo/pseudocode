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
		IntegerLiteral=1, CharacterLiteral=2, FloatingLiteral=3, BadFloatingLiteral=4, 
		StringLiteral=5, BadStringLiteral=6, BooleanLiteral=7, Bool=8, Break=9, 
		Char=10, Char16=11, Char32=12, Const=13, Continue=14, Create=15, Do=16, 
		Double=17, Else=18, False_=19, Final=20, Float=21, For=22, If=23, Int=24, 
		Long=25, New=26, Return=27, Short=28, Signed=29, String=30, This=31, True_=32, 
		Unsigned=33, Void=34, While=35, LeftParen=36, RightParen=37, LeftBracket=38, 
		RightBracket=39, LeftBrace=40, RightBrace=41, Plus=42, Minus=43, Star=44, 
		Div=45, Mod=46, Caret=47, And=48, Or=49, Not=50, Assign=51, Less=52, Greater=53, 
		PlusAssign=54, MinusAssign=55, StarAssign=56, DivAssign=57, ModAssign=58, 
		XorAssign=59, AndAssign=60, OrAssign=61, Equal=62, NotEqual=63, LessEqual=64, 
		GreaterEqual=65, AndAnd=66, OrOr=67, PlusPlus=68, MinusMinus=69, Comma=70, 
		ArrowStar=71, Arrow=72, Colon=73, Semi=74, Dot=75, DotStar=76, Ellipsis=77, 
		Up=78, Down=79, To=80, Scan=81, Print=82, Then=83, Function=84, Main=85, 
		Identifier=86, DecimalLiteral=87, OctalLiteral=88, HexadecimalLiteral=89, 
		BinaryLiteral=90, Integersuffix=91, Whitespace=92, Newline=93, BlockComment=94, 
		LineComment=95;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "BadFloatingLiteral", 
			"StringLiteral", "BadStringLiteral", "BooleanLiteral", "Bool", "Break", 
			"Char", "Char16", "Char32", "Const", "Continue", "Create", "Do", "Double", 
			"Else", "False_", "Final", "Float", "For", "If", "Int", "Long", "New", 
			"Return", "Short", "Signed", "String", "This", "True_", "Unsigned", "Void", 
			"While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", 
			"Or", "Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Colon", "Semi", "Dot", 
			"DotStar", "Ellipsis", "Up", "Down", "To", "Scan", "Print", "Then", "Function", 
			"Main", "Identifier", "Identifiernondigit", "NONDIGIT", "DIGIT", "DecimalLiteral", 
			"OctalLiteral", "HexadecimalLiteral", "BinaryLiteral", "NONZERODIGIT", 
			"OCTALDIGIT", "HEXADECIMALDIGIT", "BINARYDIGIT", "Integersuffix", "Unsignedsuffix", 
			"Longsuffix", "Longlongsuffix", "Cchar", "Escapesequence", "Simpleescapesequence", 
			"Octalescapesequence", "Hexadecimalescapesequence", "Fractionalconstant", 
			"Exponentpart", "SIGN", "Digitsequence", "Floatingsuffix", "Encodingprefix", 
			"Schar", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'break'", "'char'", 
			"'char16_t'", "'char32_t'", "'constant'", "'continue'", "'create'", "'do'", 
			"'double'", "'else'", "'F'", "'final'", "'float'", "'for'", "'if'", "'int'", 
			"'long'", "'new'", "'return'", "'short'", "'signed'", "'String'", "'this'", 
			"'T'", "'unsigned'", "'void'", "'while'", "'('", "')'", "'['", "']'", 
			"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", 
			null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'=='", "'!='", "'<='", "'>='", null, null, "'++'", "'--'", 
			"','", "'->*'", "'->'", "':'", "';'", "'.'", "'.*'", "'...'", "'up'", 
			"'down'", "'to'", "'scan'", "'print'", "'then'", "'func'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "BadFloatingLiteral", 
			"StringLiteral", "BadStringLiteral", "BooleanLiteral", "Bool", "Break", 
			"Char", "Char16", "Char32", "Const", "Continue", "Create", "Do", "Double", 
			"Else", "False_", "Final", "Float", "For", "If", "Int", "Long", "New", 
			"Return", "Short", "Signed", "String", "This", "True_", "Unsigned", "Void", 
			"While", "LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", 
			"Or", "Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", 
			"StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", 
			"Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", "OrOr", "PlusPlus", 
			"MinusMinus", "Comma", "ArrowStar", "Arrow", "Colon", "Semi", "Dot", 
			"DotStar", "Ellipsis", "Up", "Down", "To", "Scan", "Print", "Then", "Function", 
			"Main", "Identifier", "DecimalLiteral", "OctalLiteral", "HexadecimalLiteral", 
			"BinaryLiteral", "Integersuffix", "Whitespace", "Newline", "BlockComment", 
			"LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2a\u0377\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\3"+
		"\2\3\2\5\2\u00f0\n\2\3\2\3\2\5\2\u00f4\n\2\3\2\3\2\5\2\u00f8\n\2\3\2\3"+
		"\2\5\2\u00fc\n\2\5\2\u00fe\n\2\3\3\5\3\u0101\n\3\3\3\3\3\6\3\u0105\n\3"+
		"\r\3\16\3\u0106\3\3\3\3\3\4\3\4\5\4\u010d\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\5\4\u0115\n\4\3\5\3\5\5\5\u0119\n\5\3\5\3\5\3\5\5\5\u011e\n\5\3\6\5\6"+
		"\u0121\n\6\3\6\3\6\7\6\u0125\n\6\f\6\16\6\u0128\13\6\3\6\3\6\3\7\5\7\u012d"+
		"\n\7\3\7\3\7\7\7\u0131\n\7\f\7\16\7\u0134\13\7\3\b\3\b\5\b\u0138\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0145\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		"!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3"+
		"$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/"+
		"\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\63\3\63\5\63\u0204\n\63"+
		"\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3\67\38\38\38\39\39\39\3:\3:"+
		"\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A\3A\3A\3B"+
		"\3B\3B\3C\3C\3C\3C\3C\5C\u0235\nC\3D\3D\3D\3D\5D\u023b\nD\3E\3E\3E\3F"+
		"\3F\3F\3G\3G\3H\3H\3H\3H\3I\3I\3I\3J\3J\3K\3K\3L\3L\3M\3M\3M\3N\3N\3N"+
		"\3N\3O\3O\3O\3P\3P\3P\3P\3P\3Q\3Q\3Q\3R\3R\3R\3R\3R\3S\3S\3S\3S\3S\3S"+
		"\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\7W\u0281\nW\fW"+
		"\16W\u0284\13W\3X\3X\3Y\3Y\3Z\3Z\3[\3[\5[\u028e\n[\3[\7[\u0291\n[\f[\16"+
		"[\u0294\13[\3\\\3\\\5\\\u0298\n\\\3\\\7\\\u029b\n\\\f\\\16\\\u029e\13"+
		"\\\3]\3]\3]\3]\5]\u02a4\n]\3]\3]\5]\u02a8\n]\3]\7]\u02ab\n]\f]\16]\u02ae"+
		"\13]\3^\3^\3^\3^\5^\u02b4\n^\3^\3^\5^\u02b8\n^\3^\7^\u02bb\n^\f^\16^\u02be"+
		"\13^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\5c\u02ca\nc\3c\3c\5c\u02ce\nc\3c\3"+
		"c\5c\u02d2\nc\3c\3c\5c\u02d6\nc\5c\u02d8\nc\3d\3d\3e\3e\3f\3f\3f\3f\5"+
		"f\u02e2\nf\3g\3g\5g\u02e6\ng\3h\3h\3h\5h\u02eb\nh\3i\3i\3i\3i\3i\3i\3"+
		"i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\3i\5i\u0302\ni\3i\5i\u0305\n"+
		"i\3i\3i\3i\3i\5i\u030b\ni\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u0318\n"+
		"j\3k\3k\3k\3k\6k\u031e\nk\rk\16k\u031f\3l\5l\u0323\nl\3l\3l\3l\3l\3l\5"+
		"l\u032a\nl\3m\3m\5m\u032e\nm\3m\3m\3m\5m\u0333\nm\3m\5m\u0336\nm\3n\3"+
		"n\3o\3o\5o\u033c\no\3o\7o\u033f\no\fo\16o\u0342\13o\3p\3p\3q\3q\3q\5q"+
		"\u0349\nq\3r\3r\5r\u034d\nr\3s\6s\u0350\ns\rs\16s\u0351\3s\3s\3t\3t\5"+
		"t\u0358\nt\3t\5t\u035b\nt\3t\3t\3u\3u\3u\3u\7u\u0363\nu\fu\16u\u0366\13"+
		"u\3u\3u\3u\3u\3u\3v\3v\3v\3v\7v\u0371\nv\fv\16v\u0374\13v\3v\3v\3\u0364"+
		"\2w\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008d"+
		"H\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1"+
		"R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00af\2\u00b1\2\u00b3\2\u00b5"+
		"Y\u00b7Z\u00b9[\u00bb\\\u00bd\2\u00bf\2\u00c1\2\u00c3\2\u00c5]\u00c7\2"+
		"\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5\2\u00d7\2\u00d9"+
		"\2\u00db\2\u00dd\2\u00df\2\u00e1\2\u00e3\2\u00e5^\u00e7_\u00e9`\u00eb"+
		"a\3\2\21\5\2NNWWww\5\2C\\aac|\3\2\62;\3\2\63;\3\2\629\5\2\62;CHch\3\2"+
		"\62\63\4\2WWww\4\2NNnn\6\2\f\f\17\17))^^\4\2--//\6\2HHNNhhnn\6\2\f\f\17"+
		"\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u03ab\2\3\3\2\2\2\2\5\3\2\2\2\2"+
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
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00b5\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb"+
		"\3\2\2\2\2\u00c5\3\2\2\2\2\u00e5\3\2\2\2\2\u00e7\3\2\2\2\2\u00e9\3\2\2"+
		"\2\2\u00eb\3\2\2\2\3\u00fd\3\2\2\2\5\u0100\3\2\2\2\7\u0114\3\2\2\2\t\u011d"+
		"\3\2\2\2\13\u0120\3\2\2\2\r\u012c\3\2\2\2\17\u0137\3\2\2\2\21\u0144\3"+
		"\2\2\2\23\u0146\3\2\2\2\25\u014c\3\2\2\2\27\u0151\3\2\2\2\31\u015a\3\2"+
		"\2\2\33\u0163\3\2\2\2\35\u016c\3\2\2\2\37\u0175\3\2\2\2!\u017c\3\2\2\2"+
		"#\u017f\3\2\2\2%\u0186\3\2\2\2\'\u018b\3\2\2\2)\u018d\3\2\2\2+\u0193\3"+
		"\2\2\2-\u0199\3\2\2\2/\u019d\3\2\2\2\61\u01a0\3\2\2\2\63\u01a4\3\2\2\2"+
		"\65\u01a9\3\2\2\2\67\u01ad\3\2\2\29\u01b4\3\2\2\2;\u01ba\3\2\2\2=\u01c1"+
		"\3\2\2\2?\u01c8\3\2\2\2A\u01cd\3\2\2\2C\u01cf\3\2\2\2E\u01d8\3\2\2\2G"+
		"\u01dd\3\2\2\2I\u01e3\3\2\2\2K\u01e5\3\2\2\2M\u01e7\3\2\2\2O\u01e9\3\2"+
		"\2\2Q\u01eb\3\2\2\2S\u01ed\3\2\2\2U\u01ef\3\2\2\2W\u01f1\3\2\2\2Y\u01f3"+
		"\3\2\2\2[\u01f5\3\2\2\2]\u01f7\3\2\2\2_\u01f9\3\2\2\2a\u01fb\3\2\2\2c"+
		"\u01fd\3\2\2\2e\u0203\3\2\2\2g\u0205\3\2\2\2i\u0207\3\2\2\2k\u0209\3\2"+
		"\2\2m\u020b\3\2\2\2o\u020e\3\2\2\2q\u0211\3\2\2\2s\u0214\3\2\2\2u\u0217"+
		"\3\2\2\2w\u021a\3\2\2\2y\u021d\3\2\2\2{\u0220\3\2\2\2}\u0223\3\2\2\2\177"+
		"\u0226\3\2\2\2\u0081\u0229\3\2\2\2\u0083\u022c\3\2\2\2\u0085\u0234\3\2"+
		"\2\2\u0087\u023a\3\2\2\2\u0089\u023c\3\2\2\2\u008b\u023f\3\2\2\2\u008d"+
		"\u0242\3\2\2\2\u008f\u0244\3\2\2\2\u0091\u0248\3\2\2\2\u0093\u024b\3\2"+
		"\2\2\u0095\u024d\3\2\2\2\u0097\u024f\3\2\2\2\u0099\u0251\3\2\2\2\u009b"+
		"\u0254\3\2\2\2\u009d\u0258\3\2\2\2\u009f\u025b\3\2\2\2\u00a1\u0260\3\2"+
		"\2\2\u00a3\u0263\3\2\2\2\u00a5\u0268\3\2\2\2\u00a7\u026e\3\2\2\2\u00a9"+
		"\u0273\3\2\2\2\u00ab\u0278\3\2\2\2\u00ad\u027d\3\2\2\2\u00af\u0285\3\2"+
		"\2\2\u00b1\u0287\3\2\2\2\u00b3\u0289\3\2\2\2\u00b5\u028b\3\2\2\2\u00b7"+
		"\u0295\3\2\2\2\u00b9\u02a3\3\2\2\2\u00bb\u02b3\3\2\2\2\u00bd\u02bf\3\2"+
		"\2\2\u00bf\u02c1\3\2\2\2\u00c1\u02c3\3\2\2\2\u00c3\u02c5\3\2\2\2\u00c5"+
		"\u02d7\3\2\2\2\u00c7\u02d9\3\2\2\2\u00c9\u02db\3\2\2\2\u00cb\u02e1\3\2"+
		"\2\2\u00cd\u02e5\3\2\2\2\u00cf\u02ea\3\2\2\2\u00d1\u030a\3\2\2\2\u00d3"+
		"\u0317\3\2\2\2\u00d5\u0319\3\2\2\2\u00d7\u0329\3\2\2\2\u00d9\u0335\3\2"+
		"\2\2\u00db\u0337\3\2\2\2\u00dd\u0339\3\2\2\2\u00df\u0343\3\2\2\2\u00e1"+
		"\u0348\3\2\2\2\u00e3\u034c\3\2\2\2\u00e5\u034f\3\2\2\2\u00e7\u035a\3\2"+
		"\2\2\u00e9\u035e\3\2\2\2\u00eb\u036c\3\2\2\2\u00ed\u00ef\5\u00b5[\2\u00ee"+
		"\u00f0\5\u00c5c\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00fe"+
		"\3\2\2\2\u00f1\u00f3\5\u00b7\\\2\u00f2\u00f4\5\u00c5c\2\u00f3\u00f2\3"+
		"\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00fe\3\2\2\2\u00f5\u00f7\5\u00b9]\2"+
		"\u00f6\u00f8\5\u00c5c\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8"+
		"\u00fe\3\2\2\2\u00f9\u00fb\5\u00bb^\2\u00fa\u00fc\5\u00c5c\2\u00fb\u00fa"+
		"\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00ed\3\2\2\2\u00fd"+
		"\u00f1\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\4\3\2\2\2"+
		"\u00ff\u0101\t\2\2\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102"+
		"\3\2\2\2\u0102\u0104\7)\2\2\u0103\u0105\5\u00cdg\2\u0104\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0108"+
		"\3\2\2\2\u0108\u0109\7)\2\2\u0109\6\3\2\2\2\u010a\u010c\5\u00d7l\2\u010b"+
		"\u010d\5\u00d9m\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e"+
		"\3\2\2\2\u010e\u010f\5\u00dfp\2\u010f\u0115\3\2\2\2\u0110\u0111\5\u00dd"+
		"o\2\u0111\u0112\5\u00d9m\2\u0112\u0113\5\u00dfp\2\u0113\u0115\3\2\2\2"+
		"\u0114\u010a\3\2\2\2\u0114\u0110\3\2\2\2\u0115\b\3\2\2\2\u0116\u0118\5"+
		"\u00d7l\2\u0117\u0119\5\u00d9m\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2"+
		"\2\u0119\u011e\3\2\2\2\u011a\u011b\5\u00ddo\2\u011b\u011c\5\u00d9m\2\u011c"+
		"\u011e\3\2\2\2\u011d\u0116\3\2\2\2\u011d\u011a\3\2\2\2\u011e\n\3\2\2\2"+
		"\u011f\u0121\5\u00e1q\2\u0120\u011f\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0126\7$\2\2\u0123\u0125\5\u00e3r\2\u0124\u0123\3"+
		"\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127"+
		"\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7$\2\2\u012a\f\3\2\2\2"+
		"\u012b\u012d\5\u00e1q\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0132\7$\2\2\u012f\u0131\5\u00e3r\2\u0130\u012f\3"+
		"\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\16\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0138\5\'\24\2\u0136\u0138\5A!\2"+
		"\u0137\u0135\3\2\2\2\u0137\u0136\3\2\2\2\u0138\20\3\2\2\2\u0139\u013a"+
		"\7d\2\2\u013a\u013b\7q\2\2\u013b\u013c\7q\2\2\u013c\u0145\7n\2\2\u013d"+
		"\u013e\7d\2\2\u013e\u013f\7q\2\2\u013f\u0140\7q\2\2\u0140\u0141\7n\2\2"+
		"\u0141\u0142\7g\2\2\u0142\u0143\7c\2\2\u0143\u0145\7p\2\2\u0144\u0139"+
		"\3\2\2\2\u0144\u013d\3\2\2\2\u0145\22\3\2\2\2\u0146\u0147\7d\2\2\u0147"+
		"\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014a\7c\2\2\u014a\u014b\7m\2\2"+
		"\u014b\24\3\2\2\2\u014c\u014d\7e\2\2\u014d\u014e\7j\2\2\u014e\u014f\7"+
		"c\2\2\u014f\u0150\7t\2\2\u0150\26\3\2\2\2\u0151\u0152\7e\2\2\u0152\u0153"+
		"\7j\2\2\u0153\u0154\7c\2\2\u0154\u0155\7t\2\2\u0155\u0156\7\63\2\2\u0156"+
		"\u0157\78\2\2\u0157\u0158\7a\2\2\u0158\u0159\7v\2\2\u0159\30\3\2\2\2\u015a"+
		"\u015b\7e\2\2\u015b\u015c\7j\2\2\u015c\u015d\7c\2\2\u015d\u015e\7t\2\2"+
		"\u015e\u015f\7\65\2\2\u015f\u0160\7\64\2\2\u0160\u0161\7a\2\2\u0161\u0162"+
		"\7v\2\2\u0162\32\3\2\2\2\u0163\u0164\7e\2\2\u0164\u0165\7q\2\2\u0165\u0166"+
		"\7p\2\2\u0166\u0167\7u\2\2\u0167\u0168\7v\2\2\u0168\u0169\7c\2\2\u0169"+
		"\u016a\7p\2\2\u016a\u016b\7v\2\2\u016b\34\3\2\2\2\u016c\u016d\7e\2\2\u016d"+
		"\u016e\7q\2\2\u016e\u016f\7p\2\2\u016f\u0170\7v\2\2\u0170\u0171\7k\2\2"+
		"\u0171\u0172\7p\2\2\u0172\u0173\7w\2\2\u0173\u0174\7g\2\2\u0174\36\3\2"+
		"\2\2\u0175\u0176\7e\2\2\u0176\u0177\7t\2\2\u0177\u0178\7g\2\2\u0178\u0179"+
		"\7c\2\2\u0179\u017a\7v\2\2\u017a\u017b\7g\2\2\u017b \3\2\2\2\u017c\u017d"+
		"\7f\2\2\u017d\u017e\7q\2\2\u017e\"\3\2\2\2\u017f\u0180\7f\2\2\u0180\u0181"+
		"\7q\2\2\u0181\u0182\7w\2\2\u0182\u0183\7d\2\2\u0183\u0184\7n\2\2\u0184"+
		"\u0185\7g\2\2\u0185$\3\2\2\2\u0186\u0187\7g\2\2\u0187\u0188\7n\2\2\u0188"+
		"\u0189\7u\2\2\u0189\u018a\7g\2\2\u018a&\3\2\2\2\u018b\u018c\7H\2\2\u018c"+
		"(\3\2\2\2\u018d\u018e\7h\2\2\u018e\u018f\7k\2\2\u018f\u0190\7p\2\2\u0190"+
		"\u0191\7c\2\2\u0191\u0192\7n\2\2\u0192*\3\2\2\2\u0193\u0194\7h\2\2\u0194"+
		"\u0195\7n\2\2\u0195\u0196\7q\2\2\u0196\u0197\7c\2\2\u0197\u0198\7v\2\2"+
		"\u0198,\3\2\2\2\u0199\u019a\7h\2\2\u019a\u019b\7q\2\2\u019b\u019c\7t\2"+
		"\2\u019c.\3\2\2\2\u019d\u019e\7k\2\2\u019e\u019f\7h\2\2\u019f\60\3\2\2"+
		"\2\u01a0\u01a1\7k\2\2\u01a1\u01a2\7p\2\2\u01a2\u01a3\7v\2\2\u01a3\62\3"+
		"\2\2\2\u01a4\u01a5\7n\2\2\u01a5\u01a6\7q\2\2\u01a6\u01a7\7p\2\2\u01a7"+
		"\u01a8\7i\2\2\u01a8\64\3\2\2\2\u01a9\u01aa\7p\2\2\u01aa\u01ab\7g\2\2\u01ab"+
		"\u01ac\7y\2\2\u01ac\66\3\2\2\2\u01ad\u01ae\7t\2\2\u01ae\u01af\7g\2\2\u01af"+
		"\u01b0\7v\2\2\u01b0\u01b1\7w\2\2\u01b1\u01b2\7t\2\2\u01b2\u01b3\7p\2\2"+
		"\u01b38\3\2\2\2\u01b4\u01b5\7u\2\2\u01b5\u01b6\7j\2\2\u01b6\u01b7\7q\2"+
		"\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7v\2\2\u01b9:\3\2\2\2\u01ba\u01bb\7"+
		"u\2\2\u01bb\u01bc\7k\2\2\u01bc\u01bd\7i\2\2\u01bd\u01be\7p\2\2\u01be\u01bf"+
		"\7g\2\2\u01bf\u01c0\7f\2\2\u01c0<\3\2\2\2\u01c1\u01c2\7U\2\2\u01c2\u01c3"+
		"\7v\2\2\u01c3\u01c4\7t\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6\7p\2\2\u01c6"+
		"\u01c7\7i\2\2\u01c7>\3\2\2\2\u01c8\u01c9\7v\2\2\u01c9\u01ca\7j\2\2\u01ca"+
		"\u01cb\7k\2\2\u01cb\u01cc\7u\2\2\u01cc@\3\2\2\2\u01cd\u01ce\7V\2\2\u01ce"+
		"B\3\2\2\2\u01cf\u01d0\7w\2\2\u01d0\u01d1\7p\2\2\u01d1\u01d2\7u\2\2\u01d2"+
		"\u01d3\7k\2\2\u01d3\u01d4\7i\2\2\u01d4\u01d5\7p\2\2\u01d5\u01d6\7g\2\2"+
		"\u01d6\u01d7\7f\2\2\u01d7D\3\2\2\2\u01d8\u01d9\7x\2\2\u01d9\u01da\7q\2"+
		"\2\u01da\u01db\7k\2\2\u01db\u01dc\7f\2\2\u01dcF\3\2\2\2\u01dd\u01de\7"+
		"y\2\2\u01de\u01df\7j\2\2\u01df\u01e0\7k\2\2\u01e0\u01e1\7n\2\2\u01e1\u01e2"+
		"\7g\2\2\u01e2H\3\2\2\2\u01e3\u01e4\7*\2\2\u01e4J\3\2\2\2\u01e5\u01e6\7"+
		"+\2\2\u01e6L\3\2\2\2\u01e7\u01e8\7]\2\2\u01e8N\3\2\2\2\u01e9\u01ea\7_"+
		"\2\2\u01eaP\3\2\2\2\u01eb\u01ec\7}\2\2\u01ecR\3\2\2\2\u01ed\u01ee\7\177"+
		"\2\2\u01eeT\3\2\2\2\u01ef\u01f0\7-\2\2\u01f0V\3\2\2\2\u01f1\u01f2\7/\2"+
		"\2\u01f2X\3\2\2\2\u01f3\u01f4\7,\2\2\u01f4Z\3\2\2\2\u01f5\u01f6\7\61\2"+
		"\2\u01f6\\\3\2\2\2\u01f7\u01f8\7\'\2\2\u01f8^\3\2\2\2\u01f9\u01fa\7`\2"+
		"\2\u01fa`\3\2\2\2\u01fb\u01fc\7(\2\2\u01fcb\3\2\2\2\u01fd\u01fe\7~\2\2"+
		"\u01fed\3\2\2\2\u01ff\u0204\7#\2\2\u0200\u0201\7p\2\2\u0201\u0202\7q\2"+
		"\2\u0202\u0204\7v\2\2\u0203\u01ff\3\2\2\2\u0203\u0200\3\2\2\2\u0204f\3"+
		"\2\2\2\u0205\u0206\7?\2\2\u0206h\3\2\2\2\u0207\u0208\7>\2\2\u0208j\3\2"+
		"\2\2\u0209\u020a\7@\2\2\u020al\3\2\2\2\u020b\u020c\7-\2\2\u020c\u020d"+
		"\7?\2\2\u020dn\3\2\2\2\u020e\u020f\7/\2\2\u020f\u0210\7?\2\2\u0210p\3"+
		"\2\2\2\u0211\u0212\7,\2\2\u0212\u0213\7?\2\2\u0213r\3\2\2\2\u0214\u0215"+
		"\7\61\2\2\u0215\u0216\7?\2\2\u0216t\3\2\2\2\u0217\u0218\7\'\2\2\u0218"+
		"\u0219\7?\2\2\u0219v\3\2\2\2\u021a\u021b\7`\2\2\u021b\u021c\7?\2\2\u021c"+
		"x\3\2\2\2\u021d\u021e\7(\2\2\u021e\u021f\7?\2\2\u021fz\3\2\2\2\u0220\u0221"+
		"\7~\2\2\u0221\u0222\7?\2\2\u0222|\3\2\2\2\u0223\u0224\7?\2\2\u0224\u0225"+
		"\7?\2\2\u0225~\3\2\2\2\u0226\u0227\7#\2\2\u0227\u0228\7?\2\2\u0228\u0080"+
		"\3\2\2\2\u0229\u022a\7>\2\2\u022a\u022b\7?\2\2\u022b\u0082\3\2\2\2\u022c"+
		"\u022d\7@\2\2\u022d\u022e\7?\2\2\u022e\u0084\3\2\2\2\u022f\u0230\7(\2"+
		"\2\u0230\u0235\7(\2\2\u0231\u0232\7c\2\2\u0232\u0233\7p\2\2\u0233\u0235"+
		"\7f\2\2\u0234\u022f\3\2\2\2\u0234\u0231\3\2\2\2\u0235\u0086\3\2\2\2\u0236"+
		"\u0237\7~\2\2\u0237\u023b\7~\2\2\u0238\u0239\7q\2\2\u0239\u023b\7t\2\2"+
		"\u023a\u0236\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u0088\3\2\2\2\u023c\u023d"+
		"\7-\2\2\u023d\u023e\7-\2\2\u023e\u008a\3\2\2\2\u023f\u0240\7/\2\2\u0240"+
		"\u0241\7/\2\2\u0241\u008c\3\2\2\2\u0242\u0243\7.\2\2\u0243\u008e\3\2\2"+
		"\2\u0244\u0245\7/\2\2\u0245\u0246\7@\2\2\u0246\u0247\7,\2\2\u0247\u0090"+
		"\3\2\2\2\u0248\u0249\7/\2\2\u0249\u024a\7@\2\2\u024a\u0092\3\2\2\2\u024b"+
		"\u024c\7<\2\2\u024c\u0094\3\2\2\2\u024d\u024e\7=\2\2\u024e\u0096\3\2\2"+
		"\2\u024f\u0250\7\60\2\2\u0250\u0098\3\2\2\2\u0251\u0252\7\60\2\2\u0252"+
		"\u0253\7,\2\2\u0253\u009a\3\2\2\2\u0254\u0255\7\60\2\2\u0255\u0256\7\60"+
		"\2\2\u0256\u0257\7\60\2\2\u0257\u009c\3\2\2\2\u0258\u0259\7w\2\2\u0259"+
		"\u025a\7r\2\2\u025a\u009e\3\2\2\2\u025b\u025c\7f\2\2\u025c\u025d\7q\2"+
		"\2\u025d\u025e\7y\2\2\u025e\u025f\7p\2\2\u025f\u00a0\3\2\2\2\u0260\u0261"+
		"\7v\2\2\u0261\u0262\7q\2\2\u0262\u00a2\3\2\2\2\u0263\u0264\7u\2\2\u0264"+
		"\u0265\7e\2\2\u0265\u0266\7c\2\2\u0266\u0267\7p\2\2\u0267\u00a4\3\2\2"+
		"\2\u0268\u0269\7r\2\2\u0269\u026a\7t\2\2\u026a\u026b\7k\2\2\u026b\u026c"+
		"\7p\2\2\u026c\u026d\7v\2\2\u026d\u00a6\3\2\2\2\u026e\u026f\7v\2\2\u026f"+
		"\u0270\7j\2\2\u0270\u0271\7g\2\2\u0271\u0272\7p\2\2\u0272\u00a8\3\2\2"+
		"\2\u0273\u0274\7h\2\2\u0274\u0275\7w\2\2\u0275\u0276\7p\2\2\u0276\u0277"+
		"\7e\2\2\u0277\u00aa\3\2\2\2\u0278\u0279\7o\2\2\u0279\u027a\7c\2\2\u027a"+
		"\u027b\7k\2\2\u027b\u027c\7p\2\2\u027c\u00ac\3\2\2\2\u027d\u0282\5\u00af"+
		"X\2\u027e\u0281\5\u00afX\2\u027f\u0281\5\u00b3Z\2\u0280\u027e\3\2\2\2"+
		"\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280\3\2\2\2\u0282\u0283"+
		"\3\2\2\2\u0283\u00ae\3\2\2\2\u0284\u0282\3\2\2\2\u0285\u0286\5\u00b1Y"+
		"\2\u0286\u00b0\3\2\2\2\u0287\u0288\t\3\2\2\u0288\u00b2\3\2\2\2\u0289\u028a"+
		"\t\4\2\2\u028a\u00b4\3\2\2\2\u028b\u0292\5\u00bd_\2\u028c\u028e\7)\2\2"+
		"\u028d\u028c\3\2\2\2\u028d\u028e\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291"+
		"\5\u00b3Z\2\u0290\u028d\3\2\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2"+
		"\2\u0292\u0293\3\2\2\2\u0293\u00b6\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u029c"+
		"\7\62\2\2\u0296\u0298\7)\2\2\u0297\u0296\3\2\2\2\u0297\u0298\3\2\2\2\u0298"+
		"\u0299\3\2\2\2\u0299\u029b\5\u00bf`\2\u029a\u0297\3\2\2\2\u029b\u029e"+
		"\3\2\2\2\u029c\u029a\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u00b8\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029f\u02a0\7\62\2\2\u02a0\u02a4\7z\2\2\u02a1\u02a2\7\62"+
		"\2\2\u02a2\u02a4\7Z\2\2\u02a3\u029f\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a4"+
		"\u02a5\3\2\2\2\u02a5\u02ac\5\u00c1a\2\u02a6\u02a8\7)\2\2\u02a7\u02a6\3"+
		"\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02a9\3\2\2\2\u02a9\u02ab\5\u00c1a\2"+
		"\u02aa\u02a7\3\2\2\2\u02ab\u02ae\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ac\u02ad"+
		"\3\2\2\2\u02ad\u00ba\3\2\2\2\u02ae\u02ac\3\2\2\2\u02af\u02b0\7\62\2\2"+
		"\u02b0\u02b4\7d\2\2\u02b1\u02b2\7\62\2\2\u02b2\u02b4\7D\2\2\u02b3\u02af"+
		"\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02bc\5\u00c3b"+
		"\2\u02b6\u02b8\7)\2\2\u02b7\u02b6\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b9"+
		"\3\2\2\2\u02b9\u02bb\5\u00c3b\2\u02ba\u02b7\3\2\2\2\u02bb\u02be\3\2\2"+
		"\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u00bc\3\2\2\2\u02be\u02bc"+
		"\3\2\2\2\u02bf\u02c0\t\5\2\2\u02c0\u00be\3\2\2\2\u02c1\u02c2\t\6\2\2\u02c2"+
		"\u00c0\3\2\2\2\u02c3\u02c4\t\7\2\2\u02c4\u00c2\3\2\2\2\u02c5\u02c6\t\b"+
		"\2\2\u02c6\u00c4\3\2\2\2\u02c7\u02c9\5\u00c7d\2\u02c8\u02ca\5\u00c9e\2"+
		"\u02c9\u02c8\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca\u02d8\3\2\2\2\u02cb\u02cd"+
		"\5\u00c7d\2\u02cc\u02ce\5\u00cbf\2\u02cd\u02cc\3\2\2\2\u02cd\u02ce\3\2"+
		"\2\2\u02ce\u02d8\3\2\2\2\u02cf\u02d1\5\u00c9e\2\u02d0\u02d2\5\u00c7d\2"+
		"\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d8\3\2\2\2\u02d3\u02d5"+
		"\5\u00cbf\2\u02d4\u02d6\5\u00c7d\2\u02d5\u02d4\3\2\2\2\u02d5\u02d6\3\2"+
		"\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02c7\3\2\2\2\u02d7\u02cb\3\2\2\2\u02d7"+
		"\u02cf\3\2\2\2\u02d7\u02d3\3\2\2\2\u02d8\u00c6\3\2\2\2\u02d9\u02da\t\t"+
		"\2\2\u02da\u00c8\3\2\2\2\u02db\u02dc\t\n\2\2\u02dc\u00ca\3\2\2\2\u02dd"+
		"\u02de\7n\2\2\u02de\u02e2\7n\2\2\u02df\u02e0\7N\2\2\u02e0\u02e2\7N\2\2"+
		"\u02e1\u02dd\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2\u00cc\3\2\2\2\u02e3\u02e6"+
		"\n\13\2\2\u02e4\u02e6\5\u00cfh\2\u02e5\u02e3\3\2\2\2\u02e5\u02e4\3\2\2"+
		"\2\u02e6\u00ce\3\2\2\2\u02e7\u02eb\5\u00d1i\2\u02e8\u02eb\5\u00d3j\2\u02e9"+
		"\u02eb\5\u00d5k\2\u02ea\u02e7\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02e9"+
		"\3\2\2\2\u02eb\u00d0\3\2\2\2\u02ec\u02ed\7^\2\2\u02ed\u030b\7)\2\2\u02ee"+
		"\u02ef\7^\2\2\u02ef\u030b\7$\2\2\u02f0\u02f1\7^\2\2\u02f1\u030b\7A\2\2"+
		"\u02f2\u02f3\7^\2\2\u02f3\u030b\7^\2\2\u02f4\u02f5\7^\2\2\u02f5\u030b"+
		"\7c\2\2\u02f6\u02f7\7^\2\2\u02f7\u030b\7d\2\2\u02f8\u02f9\7^\2\2\u02f9"+
		"\u030b\7h\2\2\u02fa\u02fb\7^\2\2\u02fb\u030b\7p\2\2\u02fc\u02fd\7^\2\2"+
		"\u02fd\u030b\7t\2\2\u02fe\u0304\7^\2\2\u02ff\u0301\7\17\2\2\u0300\u0302"+
		"\7\f\2\2\u0301\u0300\3\2\2\2\u0301\u0302\3\2\2\2\u0302\u0305\3\2\2\2\u0303"+
		"\u0305\7\f\2\2\u0304\u02ff\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u030b\3\2"+
		"\2\2\u0306\u0307\7^\2\2\u0307\u030b\7v\2\2\u0308\u0309\7^\2\2\u0309\u030b"+
		"\7x\2\2\u030a\u02ec\3\2\2\2\u030a\u02ee\3\2\2\2\u030a\u02f0\3\2\2\2\u030a"+
		"\u02f2\3\2\2\2\u030a\u02f4\3\2\2\2\u030a\u02f6\3\2\2\2\u030a\u02f8\3\2"+
		"\2\2\u030a\u02fa\3\2\2\2\u030a\u02fc\3\2\2\2\u030a\u02fe\3\2\2\2\u030a"+
		"\u0306\3\2\2\2\u030a\u0308\3\2\2\2\u030b\u00d2\3\2\2\2\u030c\u030d\7^"+
		"\2\2\u030d\u0318\5\u00bf`\2\u030e\u030f\7^\2\2\u030f\u0310\5\u00bf`\2"+
		"\u0310\u0311\5\u00bf`\2\u0311\u0318\3\2\2\2\u0312\u0313\7^\2\2\u0313\u0314"+
		"\5\u00bf`\2\u0314\u0315\5\u00bf`\2\u0315\u0316\5\u00bf`\2\u0316\u0318"+
		"\3\2\2\2\u0317\u030c\3\2\2\2\u0317\u030e\3\2\2\2\u0317\u0312\3\2\2\2\u0318"+
		"\u00d4\3\2\2\2\u0319\u031a\7^\2\2\u031a\u031b\7z\2\2\u031b\u031d\3\2\2"+
		"\2\u031c\u031e\5\u00c1a\2\u031d\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u031d\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u00d6\3\2\2\2\u0321\u0323\5\u00dd"+
		"o\2\u0322\u0321\3\2\2\2\u0322\u0323\3\2\2\2\u0323\u0324\3\2\2\2\u0324"+
		"\u0325\7\60\2\2\u0325\u032a\5\u00ddo\2\u0326\u0327\5\u00ddo\2\u0327\u0328"+
		"\7\60\2\2\u0328\u032a\3\2\2\2\u0329\u0322\3\2\2\2\u0329\u0326\3\2\2\2"+
		"\u032a\u00d8\3\2\2\2\u032b\u032d\7g\2\2\u032c\u032e\5\u00dbn\2\u032d\u032c"+
		"\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u0336\5\u00ddo"+
		"\2\u0330\u0332\7G\2\2\u0331\u0333\5\u00dbn\2\u0332\u0331\3\2\2\2\u0332"+
		"\u0333\3\2\2\2\u0333\u0334\3\2\2\2\u0334\u0336\5\u00ddo\2\u0335\u032b"+
		"\3\2\2\2\u0335\u0330\3\2\2\2\u0336\u00da\3\2\2\2\u0337\u0338\t\f\2\2\u0338"+
		"\u00dc\3\2\2\2\u0339\u0340\5\u00b3Z\2\u033a\u033c\7)\2\2\u033b\u033a\3"+
		"\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\5\u00b3Z\2"+
		"\u033e\u033b\3\2\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u00de\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0344\t\r\2\2\u0344"+
		"\u00e0\3\2\2\2\u0345\u0346\7w\2\2\u0346\u0349\7:\2\2\u0347\u0349\t\2\2"+
		"\2\u0348\u0345\3\2\2\2\u0348\u0347\3\2\2\2\u0349\u00e2\3\2\2\2\u034a\u034d"+
		"\n\16\2\2\u034b\u034d\5\u00cfh\2\u034c\u034a\3\2\2\2\u034c\u034b\3\2\2"+
		"\2\u034d\u00e4\3\2\2\2\u034e\u0350\t\17\2\2\u034f\u034e\3\2\2\2\u0350"+
		"\u0351\3\2\2\2\u0351\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353\u0354\bs\2\2\u0354\u00e6\3\2\2\2\u0355\u0357\7\17\2\2\u0356"+
		"\u0358\7\f\2\2\u0357\u0356\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035b\3\2"+
		"\2\2\u0359\u035b\7\f\2\2\u035a\u0355\3\2\2\2\u035a\u0359\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u035d\bt\2\2\u035d\u00e8\3\2\2\2\u035e\u035f\7\61"+
		"\2\2\u035f\u0360\7,\2\2\u0360\u0364\3\2\2\2\u0361\u0363\13\2\2\2\u0362"+
		"\u0361\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0365\3\2\2\2\u0364\u0362\3\2"+
		"\2\2\u0365\u0367\3\2\2\2\u0366\u0364\3\2\2\2\u0367\u0368\7,\2\2\u0368"+
		"\u0369\7\61\2\2\u0369\u036a\3\2\2\2\u036a\u036b\bu\2\2\u036b\u00ea\3\2"+
		"\2\2\u036c\u036d\7\61\2\2\u036d\u036e\7\61\2\2\u036e\u0372\3\2\2\2\u036f"+
		"\u0371\n\20\2\2\u0370\u036f\3\2\2\2\u0371\u0374\3\2\2\2\u0372\u0370\3"+
		"\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\3\2\2\2\u0374\u0372\3\2\2\2\u0375"+
		"\u0376\bv\2\2\u0376\u00ec\3\2\2\2>\2\u00ef\u00f3\u00f7\u00fb\u00fd\u0100"+
		"\u0106\u010c\u0114\u0118\u011d\u0120\u0126\u012c\u0132\u0137\u0144\u0203"+
		"\u0234\u023a\u0280\u0282\u028d\u0292\u0297\u029c\u02a3\u02a7\u02ac\u02b3"+
		"\u02b7\u02bc\u02c9\u02cd\u02d1\u02d5\u02d7\u02e1\u02e5\u02ea\u0301\u0304"+
		"\u030a\u0317\u031f\u0322\u0329\u032d\u0332\u0335\u033b\u0340\u0348\u034c"+
		"\u0351\u0357\u035a\u0364\u0372\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}