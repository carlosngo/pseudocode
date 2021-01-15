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
		Char=10, Char16=11, Char32=12, Const=13, Badconst=14, Continue=15, Create=16, 
		Do=17, Double=18, Else=19, False_=20, Final=21, Float=22, For=23, If=24, 
		Int=25, Long=26, New=27, Return=28, Short=29, Signed=30, String=31, This=32, 
		True_=33, Unsigned=34, Void=35, While=36, LeftParen=37, RightParen=38, 
		LeftBracket=39, RightBracket=40, LeftBrace=41, RightBrace=42, Plus=43, 
		Minus=44, Star=45, Div=46, Mod=47, Caret=48, And=49, Or=50, Not=51, Assign=52, 
		Less=53, Greater=54, PlusAssign=55, MinusAssign=56, StarAssign=57, DivAssign=58, 
		ModAssign=59, XorAssign=60, AndAssign=61, OrAssign=62, Equal=63, NotEqual=64, 
		LessEqual=65, GreaterEqual=66, AndAnd=67, OrOr=68, PlusPlus=69, MinusMinus=70, 
		Comma=71, ArrowStar=72, Arrow=73, Colon=74, Semi=75, Dot=76, DotStar=77, 
		Ellipsis=78, Up=79, Down=80, To=81, Scan=82, Print=83, Then=84, Function=85, 
		Main=86, Identifier=87, DecimalLiteral=88, OctalLiteral=89, HexadecimalLiteral=90, 
		BinaryLiteral=91, Integersuffix=92, Whitespace=93, Newline=94, BlockComment=95, 
		LineComment=96;
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
			"Char", "Char16", "Char32", "Const", "Badconst", "Continue", "Create", 
			"Do", "Double", "Else", "False_", "Final", "Float", "For", "If", "Int", 
			"Long", "New", "Return", "Short", "Signed", "String", "This", "True_", 
			"Unsigned", "Void", "While", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", 
			"Mod", "Caret", "And", "Or", "Not", "Assign", "Less", "Greater", "PlusAssign", 
			"MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
			"OrAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", 
			"OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", "Arrow", "Colon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Up", "Down", "To", "Scan", "Print", 
			"Then", "Function", "Main", "Identifier", "Identifiernondigit", "NONDIGIT", 
			"DIGIT", "DecimalLiteral", "OctalLiteral", "HexadecimalLiteral", "BinaryLiteral", 
			"NONZERODIGIT", "OCTALDIGIT", "HEXADECIMALDIGIT", "BINARYDIGIT", "Integersuffix", 
			"Unsignedsuffix", "Longsuffix", "Longlongsuffix", "Cchar", "Escapesequence", 
			"Simpleescapesequence", "Octalescapesequence", "Hexadecimalescapesequence", 
			"Fractionalconstant", "Exponentpart", "SIGN", "Digitsequence", "Floatingsuffix", 
			"Encodingprefix", "Schar", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'break'", "'char'", 
			"'char16_t'", "'char32_t'", "'constant'", "'constt'", "'continue'", "'create'", 
			"'do'", "'double'", "'else'", "'F'", "'final'", "'float'", "'for'", "'if'", 
			"'int'", "'long'", "'new'", "'return'", "'short'", "'signed'", "'String'", 
			"'this'", "'T'", "'unsigned'", "'void'", "'while'", "'('", "')'", "'['", 
			"']'", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", 
			"'|'", null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'^='", "'&='", "'|='", "'=='", "'!='", "'<='", "'>='", null, null, "'++'", 
			"'--'", "','", "'->*'", "'->'", "':'", "';'", "'.'", "'.*'", "'...'", 
			"'up'", "'down'", "'to'", "'scan'", "'print'", "'then'", "'func'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "BadFloatingLiteral", 
			"StringLiteral", "BadStringLiteral", "BooleanLiteral", "Bool", "Break", 
			"Char", "Char16", "Char32", "Const", "Badconst", "Continue", "Create", 
			"Do", "Double", "Else", "False_", "Final", "Float", "For", "If", "Int", 
			"Long", "New", "Return", "Short", "Signed", "String", "This", "True_", 
			"Unsigned", "Void", "While", "LeftParen", "RightParen", "LeftBracket", 
			"RightBracket", "LeftBrace", "RightBrace", "Plus", "Minus", "Star", "Div", 
			"Mod", "Caret", "And", "Or", "Not", "Assign", "Less", "Greater", "PlusAssign", 
			"MinusAssign", "StarAssign", "DivAssign", "ModAssign", "XorAssign", "AndAssign", 
			"OrAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", "AndAnd", 
			"OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", "Arrow", "Colon", 
			"Semi", "Dot", "DotStar", "Ellipsis", "Up", "Down", "To", "Scan", "Print", 
			"Then", "Function", "Main", "Identifier", "DecimalLiteral", "OctalLiteral", 
			"HexadecimalLiteral", "BinaryLiteral", "Integersuffix", "Whitespace", 
			"Newline", "BlockComment", "LineComment"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2b\u0380\b\1\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\3\2\3\2\5\2\u00f2\n\2\3\2\3\2\5\2\u00f6\n\2\3\2\3\2\5\2\u00fa\n\2"+
		"\3\2\3\2\5\2\u00fe\n\2\5\2\u0100\n\2\3\3\5\3\u0103\n\3\3\3\3\3\6\3\u0107"+
		"\n\3\r\3\16\3\u0108\3\3\3\3\3\4\3\4\5\4\u010f\n\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\u0117\n\4\3\5\3\5\5\5\u011b\n\5\3\5\3\5\3\5\5\5\u0120\n\5\3\6"+
		"\5\6\u0123\n\6\3\6\3\6\7\6\u0127\n\6\f\6\16\6\u012a\13\6\3\6\3\6\3\7\5"+
		"\7\u012f\n\7\3\7\3\7\7\7\u0133\n\7\f\7\16\7\u0136\13\7\3\b\3\b\5\b\u013a"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0147\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,"+
		"\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3"+
		"\64\3\64\5\64\u020d\n\64\3\65\3\65\3\66\3\66\3\67\3\67\38\38\38\39\39"+
		"\39\3:\3:\3:\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3>\3?\3?\3?\3@\3@\3@\3A"+
		"\3A\3A\3B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3D\5D\u023e\nD\3E\3E\3E\3E\5E\u0244"+
		"\nE\3F\3F\3F\3G\3G\3G\3H\3H\3I\3I\3I\3I\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N"+
		"\3N\3N\3O\3O\3O\3O\3P\3P\3P\3Q\3Q\3Q\3Q\3Q\3R\3R\3R\3S\3S\3S\3S\3S\3T"+
		"\3T\3T\3T\3T\3T\3U\3U\3U\3U\3U\3V\3V\3V\3V\3V\3W\3W\3W\3W\3W\3X\3X\3X"+
		"\7X\u028a\nX\fX\16X\u028d\13X\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\5\\\u0297\n\\"+
		"\3\\\7\\\u029a\n\\\f\\\16\\\u029d\13\\\3]\3]\5]\u02a1\n]\3]\7]\u02a4\n"+
		"]\f]\16]\u02a7\13]\3^\3^\3^\3^\5^\u02ad\n^\3^\3^\5^\u02b1\n^\3^\7^\u02b4"+
		"\n^\f^\16^\u02b7\13^\3_\3_\3_\3_\5_\u02bd\n_\3_\3_\5_\u02c1\n_\3_\7_\u02c4"+
		"\n_\f_\16_\u02c7\13_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\5d\u02d3\nd\3d\3d\5"+
		"d\u02d7\nd\3d\3d\5d\u02db\nd\3d\3d\5d\u02df\nd\5d\u02e1\nd\3e\3e\3f\3"+
		"f\3g\3g\3g\3g\5g\u02eb\ng\3h\3h\5h\u02ef\nh\3i\3i\3i\5i\u02f4\ni\3j\3"+
		"j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u030b\n"+
		"j\3j\5j\u030e\nj\3j\3j\3j\3j\5j\u0314\nj\3k\3k\3k\3k\3k\3k\3k\3k\3k\3"+
		"k\3k\5k\u0321\nk\3l\3l\3l\3l\6l\u0327\nl\rl\16l\u0328\3m\5m\u032c\nm\3"+
		"m\3m\3m\3m\3m\5m\u0333\nm\3n\3n\5n\u0337\nn\3n\3n\3n\5n\u033c\nn\3n\5"+
		"n\u033f\nn\3o\3o\3p\3p\5p\u0345\np\3p\7p\u0348\np\fp\16p\u034b\13p\3q"+
		"\3q\3r\3r\3r\5r\u0352\nr\3s\3s\5s\u0356\ns\3t\6t\u0359\nt\rt\16t\u035a"+
		"\3t\3t\3u\3u\5u\u0361\nu\3u\5u\u0364\nu\3u\3u\3v\3v\3v\3v\7v\u036c\nv"+
		"\fv\16v\u036f\13v\3v\3v\3v\3v\3v\3w\3w\3w\3w\7w\u037a\nw\fw\16w\u037d"+
		"\13w\3w\3w\3\u036d\2x\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63"+
		"e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089"+
		"F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009d"+
		"P\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1"+
		"\2\u00b3\2\u00b5\2\u00b7Z\u00b9[\u00bb\\\u00bd]\u00bf\2\u00c1\2\u00c3"+
		"\2\u00c5\2\u00c7^\u00c9\2\u00cb\2\u00cd\2\u00cf\2\u00d1\2\u00d3\2\u00d5"+
		"\2\u00d7\2\u00d9\2\u00db\2\u00dd\2\u00df\2\u00e1\2\u00e3\2\u00e5\2\u00e7"+
		"_\u00e9`\u00eba\u00edb\3\2\21\5\2NNWWww\5\2C\\aac|\3\2\62;\3\2\63;\3\2"+
		"\629\5\2\62;CHch\3\2\62\63\4\2WWww\4\2NNnn\6\2\f\f\17\17))^^\4\2--//\6"+
		"\2HHNNhhnn\6\2\f\f\17\17$$^^\4\2\13\13\"\"\4\2\f\f\17\17\2\u03b4\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2"+
		"\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2"+
		"\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o"+
		"\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2"+
		"\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2"+
		"\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9"+
		"\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b7\3\2\2"+
		"\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00c7\3\2\2\2\2\u00e7"+
		"\3\2\2\2\2\u00e9\3\2\2\2\2\u00eb\3\2\2\2\2\u00ed\3\2\2\2\3\u00ff\3\2\2"+
		"\2\5\u0102\3\2\2\2\7\u0116\3\2\2\2\t\u011f\3\2\2\2\13\u0122\3\2\2\2\r"+
		"\u012e\3\2\2\2\17\u0139\3\2\2\2\21\u0146\3\2\2\2\23\u0148\3\2\2\2\25\u014e"+
		"\3\2\2\2\27\u0153\3\2\2\2\31\u015c\3\2\2\2\33\u0165\3\2\2\2\35\u016e\3"+
		"\2\2\2\37\u0175\3\2\2\2!\u017e\3\2\2\2#\u0185\3\2\2\2%\u0188\3\2\2\2\'"+
		"\u018f\3\2\2\2)\u0194\3\2\2\2+\u0196\3\2\2\2-\u019c\3\2\2\2/\u01a2\3\2"+
		"\2\2\61\u01a6\3\2\2\2\63\u01a9\3\2\2\2\65\u01ad\3\2\2\2\67\u01b2\3\2\2"+
		"\29\u01b6\3\2\2\2;\u01bd\3\2\2\2=\u01c3\3\2\2\2?\u01ca\3\2\2\2A\u01d1"+
		"\3\2\2\2C\u01d6\3\2\2\2E\u01d8\3\2\2\2G\u01e1\3\2\2\2I\u01e6\3\2\2\2K"+
		"\u01ec\3\2\2\2M\u01ee\3\2\2\2O\u01f0\3\2\2\2Q\u01f2\3\2\2\2S\u01f4\3\2"+
		"\2\2U\u01f6\3\2\2\2W\u01f8\3\2\2\2Y\u01fa\3\2\2\2[\u01fc\3\2\2\2]\u01fe"+
		"\3\2\2\2_\u0200\3\2\2\2a\u0202\3\2\2\2c\u0204\3\2\2\2e\u0206\3\2\2\2g"+
		"\u020c\3\2\2\2i\u020e\3\2\2\2k\u0210\3\2\2\2m\u0212\3\2\2\2o\u0214\3\2"+
		"\2\2q\u0217\3\2\2\2s\u021a\3\2\2\2u\u021d\3\2\2\2w\u0220\3\2\2\2y\u0223"+
		"\3\2\2\2{\u0226\3\2\2\2}\u0229\3\2\2\2\177\u022c\3\2\2\2\u0081\u022f\3"+
		"\2\2\2\u0083\u0232\3\2\2\2\u0085\u0235\3\2\2\2\u0087\u023d\3\2\2\2\u0089"+
		"\u0243\3\2\2\2\u008b\u0245\3\2\2\2\u008d\u0248\3\2\2\2\u008f\u024b\3\2"+
		"\2\2\u0091\u024d\3\2\2\2\u0093\u0251\3\2\2\2\u0095\u0254\3\2\2\2\u0097"+
		"\u0256\3\2\2\2\u0099\u0258\3\2\2\2\u009b\u025a\3\2\2\2\u009d\u025d\3\2"+
		"\2\2\u009f\u0261\3\2\2\2\u00a1\u0264\3\2\2\2\u00a3\u0269\3\2\2\2\u00a5"+
		"\u026c\3\2\2\2\u00a7\u0271\3\2\2\2\u00a9\u0277\3\2\2\2\u00ab\u027c\3\2"+
		"\2\2\u00ad\u0281\3\2\2\2\u00af\u0286\3\2\2\2\u00b1\u028e\3\2\2\2\u00b3"+
		"\u0290\3\2\2\2\u00b5\u0292\3\2\2\2\u00b7\u0294\3\2\2\2\u00b9\u029e\3\2"+
		"\2\2\u00bb\u02ac\3\2\2\2\u00bd\u02bc\3\2\2\2\u00bf\u02c8\3\2\2\2\u00c1"+
		"\u02ca\3\2\2\2\u00c3\u02cc\3\2\2\2\u00c5\u02ce\3\2\2\2\u00c7\u02e0\3\2"+
		"\2\2\u00c9\u02e2\3\2\2\2\u00cb\u02e4\3\2\2\2\u00cd\u02ea\3\2\2\2\u00cf"+
		"\u02ee\3\2\2\2\u00d1\u02f3\3\2\2\2\u00d3\u0313\3\2\2\2\u00d5\u0320\3\2"+
		"\2\2\u00d7\u0322\3\2\2\2\u00d9\u0332\3\2\2\2\u00db\u033e\3\2\2\2\u00dd"+
		"\u0340\3\2\2\2\u00df\u0342\3\2\2\2\u00e1\u034c\3\2\2\2\u00e3\u0351\3\2"+
		"\2\2\u00e5\u0355\3\2\2\2\u00e7\u0358\3\2\2\2\u00e9\u0363\3\2\2\2\u00eb"+
		"\u0367\3\2\2\2\u00ed\u0375\3\2\2\2\u00ef\u00f1\5\u00b7\\\2\u00f0\u00f2"+
		"\5\u00c7d\2\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u0100\3\2\2"+
		"\2\u00f3\u00f5\5\u00b9]\2\u00f4\u00f6\5\u00c7d\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u0100\3\2\2\2\u00f7\u00f9\5\u00bb^\2\u00f8\u00fa"+
		"\5\u00c7d\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u0100\3\2\2"+
		"\2\u00fb\u00fd\5\u00bd_\2\u00fc\u00fe\5\u00c7d\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00ef\3\2\2\2\u00ff\u00f3\3\2"+
		"\2\2\u00ff\u00f7\3\2\2\2\u00ff\u00fb\3\2\2\2\u0100\4\3\2\2\2\u0101\u0103"+
		"\t\2\2\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104"+
		"\u0106\7)\2\2\u0105\u0107\5\u00cfh\2\u0106\u0105\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\7)\2\2\u010b\6\3\2\2\2\u010c\u010e\5\u00d9m\2\u010d\u010f\5\u00db"+
		"n\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\5\u00e1q\2\u0111\u0117\3\2\2\2\u0112\u0113\5\u00dfp\2\u0113\u0114"+
		"\5\u00dbn\2\u0114\u0115\5\u00e1q\2\u0115\u0117\3\2\2\2\u0116\u010c\3\2"+
		"\2\2\u0116\u0112\3\2\2\2\u0117\b\3\2\2\2\u0118\u011a\5\u00d9m\2\u0119"+
		"\u011b\5\u00dbn\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0120"+
		"\3\2\2\2\u011c\u011d\5\u00dfp\2\u011d\u011e\5\u00dbn\2\u011e\u0120\3\2"+
		"\2\2\u011f\u0118\3\2\2\2\u011f\u011c\3\2\2\2\u0120\n\3\2\2\2\u0121\u0123"+
		"\5\u00e3r\2\u0122\u0121\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\3\2\2"+
		"\2\u0124\u0128\7$\2\2\u0125\u0127\5\u00e5s\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u012c\7$\2\2\u012c\f\3\2\2\2\u012d\u012f"+
		"\5\u00e3r\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130\u0134\7$\2\2\u0131\u0133\5\u00e5s\2\u0132\u0131\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\16\3\2\2"+
		"\2\u0136\u0134\3\2\2\2\u0137\u013a\5)\25\2\u0138\u013a\5C\"\2\u0139\u0137"+
		"\3\2\2\2\u0139\u0138\3\2\2\2\u013a\20\3\2\2\2\u013b\u013c\7d\2\2\u013c"+
		"\u013d\7q\2\2\u013d\u013e\7q\2\2\u013e\u0147\7n\2\2\u013f\u0140\7d\2\2"+
		"\u0140\u0141\7q\2\2\u0141\u0142\7q\2\2\u0142\u0143\7n\2\2\u0143\u0144"+
		"\7g\2\2\u0144\u0145\7c\2\2\u0145\u0147\7p\2\2\u0146\u013b\3\2\2\2\u0146"+
		"\u013f\3\2\2\2\u0147\22\3\2\2\2\u0148\u0149\7d\2\2\u0149\u014a\7t\2\2"+
		"\u014a\u014b\7g\2\2\u014b\u014c\7c\2\2\u014c\u014d\7m\2\2\u014d\24\3\2"+
		"\2\2\u014e\u014f\7e\2\2\u014f\u0150\7j\2\2\u0150\u0151\7c\2\2\u0151\u0152"+
		"\7t\2\2\u0152\26\3\2\2\2\u0153\u0154\7e\2\2\u0154\u0155\7j\2\2\u0155\u0156"+
		"\7c\2\2\u0156\u0157\7t\2\2\u0157\u0158\7\63\2\2\u0158\u0159\78\2\2\u0159"+
		"\u015a\7a\2\2\u015a\u015b\7v\2\2\u015b\30\3\2\2\2\u015c\u015d\7e\2\2\u015d"+
		"\u015e\7j\2\2\u015e\u015f\7c\2\2\u015f\u0160\7t\2\2\u0160\u0161\7\65\2"+
		"\2\u0161\u0162\7\64\2\2\u0162\u0163\7a\2\2\u0163\u0164\7v\2\2\u0164\32"+
		"\3\2\2\2\u0165\u0166\7e\2\2\u0166\u0167\7q\2\2\u0167\u0168\7p\2\2\u0168"+
		"\u0169\7u\2\2\u0169\u016a\7v\2\2\u016a\u016b\7c\2\2\u016b\u016c\7p\2\2"+
		"\u016c\u016d\7v\2\2\u016d\34\3\2\2\2\u016e\u016f\7e\2\2\u016f\u0170\7"+
		"q\2\2\u0170\u0171\7p\2\2\u0171\u0172\7u\2\2\u0172\u0173\7v\2\2\u0173\u0174"+
		"\7v\2\2\u0174\36\3\2\2\2\u0175\u0176\7e\2\2\u0176\u0177\7q\2\2\u0177\u0178"+
		"\7p\2\2\u0178\u0179\7v\2\2\u0179\u017a\7k\2\2\u017a\u017b\7p\2\2\u017b"+
		"\u017c\7w\2\2\u017c\u017d\7g\2\2\u017d \3\2\2\2\u017e\u017f\7e\2\2\u017f"+
		"\u0180\7t\2\2\u0180\u0181\7g\2\2\u0181\u0182\7c\2\2\u0182\u0183\7v\2\2"+
		"\u0183\u0184\7g\2\2\u0184\"\3\2\2\2\u0185\u0186\7f\2\2\u0186\u0187\7q"+
		"\2\2\u0187$\3\2\2\2\u0188\u0189\7f\2\2\u0189\u018a\7q\2\2\u018a\u018b"+
		"\7w\2\2\u018b\u018c\7d\2\2\u018c\u018d\7n\2\2\u018d\u018e\7g\2\2\u018e"+
		"&\3\2\2\2\u018f\u0190\7g\2\2\u0190\u0191\7n\2\2\u0191\u0192\7u\2\2\u0192"+
		"\u0193\7g\2\2\u0193(\3\2\2\2\u0194\u0195\7H\2\2\u0195*\3\2\2\2\u0196\u0197"+
		"\7h\2\2\u0197\u0198\7k\2\2\u0198\u0199\7p\2\2\u0199\u019a\7c\2\2\u019a"+
		"\u019b\7n\2\2\u019b,\3\2\2\2\u019c\u019d\7h\2\2\u019d\u019e\7n\2\2\u019e"+
		"\u019f\7q\2\2\u019f\u01a0\7c\2\2\u01a0\u01a1\7v\2\2\u01a1.\3\2\2\2\u01a2"+
		"\u01a3\7h\2\2\u01a3\u01a4\7q\2\2\u01a4\u01a5\7t\2\2\u01a5\60\3\2\2\2\u01a6"+
		"\u01a7\7k\2\2\u01a7\u01a8\7h\2\2\u01a8\62\3\2\2\2\u01a9\u01aa\7k\2\2\u01aa"+
		"\u01ab\7p\2\2\u01ab\u01ac\7v\2\2\u01ac\64\3\2\2\2\u01ad\u01ae\7n\2\2\u01ae"+
		"\u01af\7q\2\2\u01af\u01b0\7p\2\2\u01b0\u01b1\7i\2\2\u01b1\66\3\2\2\2\u01b2"+
		"\u01b3\7p\2\2\u01b3\u01b4\7g\2\2\u01b4\u01b5\7y\2\2\u01b58\3\2\2\2\u01b6"+
		"\u01b7\7t\2\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7v\2\2\u01b9\u01ba\7w\2\2"+
		"\u01ba\u01bb\7t\2\2\u01bb\u01bc\7p\2\2\u01bc:\3\2\2\2\u01bd\u01be\7u\2"+
		"\2\u01be\u01bf\7j\2\2\u01bf\u01c0\7q\2\2\u01c0\u01c1\7t\2\2\u01c1\u01c2"+
		"\7v\2\2\u01c2<\3\2\2\2\u01c3\u01c4\7u\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6"+
		"\7i\2\2\u01c6\u01c7\7p\2\2\u01c7\u01c8\7g\2\2\u01c8\u01c9\7f\2\2\u01c9"+
		">\3\2\2\2\u01ca\u01cb\7U\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7t\2\2\u01cd"+
		"\u01ce\7k\2\2\u01ce\u01cf\7p\2\2\u01cf\u01d0\7i\2\2\u01d0@\3\2\2\2\u01d1"+
		"\u01d2\7v\2\2\u01d2\u01d3\7j\2\2\u01d3\u01d4\7k\2\2\u01d4\u01d5\7u\2\2"+
		"\u01d5B\3\2\2\2\u01d6\u01d7\7V\2\2\u01d7D\3\2\2\2\u01d8\u01d9\7w\2\2\u01d9"+
		"\u01da\7p\2\2\u01da\u01db\7u\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd\7i\2\2"+
		"\u01dd\u01de\7p\2\2\u01de\u01df\7g\2\2\u01df\u01e0\7f\2\2\u01e0F\3\2\2"+
		"\2\u01e1\u01e2\7x\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7k\2\2\u01e4\u01e5"+
		"\7f\2\2\u01e5H\3\2\2\2\u01e6\u01e7\7y\2\2\u01e7\u01e8\7j\2\2\u01e8\u01e9"+
		"\7k\2\2\u01e9\u01ea\7n\2\2\u01ea\u01eb\7g\2\2\u01ebJ\3\2\2\2\u01ec\u01ed"+
		"\7*\2\2\u01edL\3\2\2\2\u01ee\u01ef\7+\2\2\u01efN\3\2\2\2\u01f0\u01f1\7"+
		"]\2\2\u01f1P\3\2\2\2\u01f2\u01f3\7_\2\2\u01f3R\3\2\2\2\u01f4\u01f5\7}"+
		"\2\2\u01f5T\3\2\2\2\u01f6\u01f7\7\177\2\2\u01f7V\3\2\2\2\u01f8\u01f9\7"+
		"-\2\2\u01f9X\3\2\2\2\u01fa\u01fb\7/\2\2\u01fbZ\3\2\2\2\u01fc\u01fd\7,"+
		"\2\2\u01fd\\\3\2\2\2\u01fe\u01ff\7\61\2\2\u01ff^\3\2\2\2\u0200\u0201\7"+
		"\'\2\2\u0201`\3\2\2\2\u0202\u0203\7`\2\2\u0203b\3\2\2\2\u0204\u0205\7"+
		"(\2\2\u0205d\3\2\2\2\u0206\u0207\7~\2\2\u0207f\3\2\2\2\u0208\u020d\7#"+
		"\2\2\u0209\u020a\7p\2\2\u020a\u020b\7q\2\2\u020b\u020d\7v\2\2\u020c\u0208"+
		"\3\2\2\2\u020c\u0209\3\2\2\2\u020dh\3\2\2\2\u020e\u020f\7?\2\2\u020fj"+
		"\3\2\2\2\u0210\u0211\7>\2\2\u0211l\3\2\2\2\u0212\u0213\7@\2\2\u0213n\3"+
		"\2\2\2\u0214\u0215\7-\2\2\u0215\u0216\7?\2\2\u0216p\3\2\2\2\u0217\u0218"+
		"\7/\2\2\u0218\u0219\7?\2\2\u0219r\3\2\2\2\u021a\u021b\7,\2\2\u021b\u021c"+
		"\7?\2\2\u021ct\3\2\2\2\u021d\u021e\7\61\2\2\u021e\u021f\7?\2\2\u021fv"+
		"\3\2\2\2\u0220\u0221\7\'\2\2\u0221\u0222\7?\2\2\u0222x\3\2\2\2\u0223\u0224"+
		"\7`\2\2\u0224\u0225\7?\2\2\u0225z\3\2\2\2\u0226\u0227\7(\2\2\u0227\u0228"+
		"\7?\2\2\u0228|\3\2\2\2\u0229\u022a\7~\2\2\u022a\u022b\7?\2\2\u022b~\3"+
		"\2\2\2\u022c\u022d\7?\2\2\u022d\u022e\7?\2\2\u022e\u0080\3\2\2\2\u022f"+
		"\u0230\7#\2\2\u0230\u0231\7?\2\2\u0231\u0082\3\2\2\2\u0232\u0233\7>\2"+
		"\2\u0233\u0234\7?\2\2\u0234\u0084\3\2\2\2\u0235\u0236\7@\2\2\u0236\u0237"+
		"\7?\2\2\u0237\u0086\3\2\2\2\u0238\u0239\7(\2\2\u0239\u023e\7(\2\2\u023a"+
		"\u023b\7c\2\2\u023b\u023c\7p\2\2\u023c\u023e\7f\2\2\u023d\u0238\3\2\2"+
		"\2\u023d\u023a\3\2\2\2\u023e\u0088\3\2\2\2\u023f\u0240\7~\2\2\u0240\u0244"+
		"\7~\2\2\u0241\u0242\7q\2\2\u0242\u0244\7t\2\2\u0243\u023f\3\2\2\2\u0243"+
		"\u0241\3\2\2\2\u0244\u008a\3\2\2\2\u0245\u0246\7-\2\2\u0246\u0247\7-\2"+
		"\2\u0247\u008c\3\2\2\2\u0248\u0249\7/\2\2\u0249\u024a\7/\2\2\u024a\u008e"+
		"\3\2\2\2\u024b\u024c\7.\2\2\u024c\u0090\3\2\2\2\u024d\u024e\7/\2\2\u024e"+
		"\u024f\7@\2\2\u024f\u0250\7,\2\2\u0250\u0092\3\2\2\2\u0251\u0252\7/\2"+
		"\2\u0252\u0253\7@\2\2\u0253\u0094\3\2\2\2\u0254\u0255\7<\2\2\u0255\u0096"+
		"\3\2\2\2\u0256\u0257\7=\2\2\u0257\u0098\3\2\2\2\u0258\u0259\7\60\2\2\u0259"+
		"\u009a\3\2\2\2\u025a\u025b\7\60\2\2\u025b\u025c\7,\2\2\u025c\u009c\3\2"+
		"\2\2\u025d\u025e\7\60\2\2\u025e\u025f\7\60\2\2\u025f\u0260\7\60\2\2\u0260"+
		"\u009e\3\2\2\2\u0261\u0262\7w\2\2\u0262\u0263\7r\2\2\u0263\u00a0\3\2\2"+
		"\2\u0264\u0265\7f\2\2\u0265\u0266\7q\2\2\u0266\u0267\7y\2\2\u0267\u0268"+
		"\7p\2\2\u0268\u00a2\3\2\2\2\u0269\u026a\7v\2\2\u026a\u026b\7q\2\2\u026b"+
		"\u00a4\3\2\2\2\u026c\u026d\7u\2\2\u026d\u026e\7e\2\2\u026e\u026f\7c\2"+
		"\2\u026f\u0270\7p\2\2\u0270\u00a6\3\2\2\2\u0271\u0272\7r\2\2\u0272\u0273"+
		"\7t\2\2\u0273\u0274\7k\2\2\u0274\u0275\7p\2\2\u0275\u0276\7v\2\2\u0276"+
		"\u00a8\3\2\2\2\u0277\u0278\7v\2\2\u0278\u0279\7j\2\2\u0279\u027a\7g\2"+
		"\2\u027a\u027b\7p\2\2\u027b\u00aa\3\2\2\2\u027c\u027d\7h\2\2\u027d\u027e"+
		"\7w\2\2\u027e\u027f\7p\2\2\u027f\u0280\7e\2\2\u0280\u00ac\3\2\2\2\u0281"+
		"\u0282\7o\2\2\u0282\u0283\7c\2\2\u0283\u0284\7k\2\2\u0284\u0285\7p\2\2"+
		"\u0285\u00ae\3\2\2\2\u0286\u028b\5\u00b1Y\2\u0287\u028a\5\u00b1Y\2\u0288"+
		"\u028a\5\u00b5[\2\u0289\u0287\3\2\2\2\u0289\u0288\3\2\2\2\u028a\u028d"+
		"\3\2\2\2\u028b\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u00b0\3\2\2\2\u028d"+
		"\u028b\3\2\2\2\u028e\u028f\5\u00b3Z\2\u028f\u00b2\3\2\2\2\u0290\u0291"+
		"\t\3\2\2\u0291\u00b4\3\2\2\2\u0292\u0293\t\4\2\2\u0293\u00b6\3\2\2\2\u0294"+
		"\u029b\5\u00bf`\2\u0295\u0297\7)\2\2\u0296\u0295\3\2\2\2\u0296\u0297\3"+
		"\2\2\2\u0297\u0298\3\2\2\2\u0298\u029a\5\u00b5[\2\u0299\u0296\3\2\2\2"+
		"\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u00b8"+
		"\3\2\2\2\u029d\u029b\3\2\2\2\u029e\u02a5\7\62\2\2\u029f\u02a1\7)\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\5\u00c1"+
		"a\2\u02a3\u02a0\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5"+
		"\u02a6\3\2\2\2\u02a6\u00ba\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7\62"+
		"\2\2\u02a9\u02ad\7z\2\2\u02aa\u02ab\7\62\2\2\u02ab\u02ad\7Z\2\2\u02ac"+
		"\u02a8\3\2\2\2\u02ac\u02aa\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\u02b5\5\u00c3"+
		"b\2\u02af\u02b1\7)\2\2\u02b0\u02af\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b2"+
		"\3\2\2\2\u02b2\u02b4\5\u00c3b\2\u02b3\u02b0\3\2\2\2\u02b4\u02b7\3\2\2"+
		"\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u00bc\3\2\2\2\u02b7\u02b5"+
		"\3\2\2\2\u02b8\u02b9\7\62\2\2\u02b9\u02bd\7d\2\2\u02ba\u02bb\7\62\2\2"+
		"\u02bb\u02bd\7D\2\2\u02bc\u02b8\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be"+
		"\3\2\2\2\u02be\u02c5\5\u00c5c\2\u02bf\u02c1\7)\2\2\u02c0\u02bf\3\2\2\2"+
		"\u02c0\u02c1\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4\5\u00c5c\2\u02c3"+
		"\u02c0\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c5\u02c6\3\2"+
		"\2\2\u02c6\u00be\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\t\5\2\2\u02c9"+
		"\u00c0\3\2\2\2\u02ca\u02cb\t\6\2\2\u02cb\u00c2\3\2\2\2\u02cc\u02cd\t\7"+
		"\2\2\u02cd\u00c4\3\2\2\2\u02ce\u02cf\t\b\2\2\u02cf\u00c6\3\2\2\2\u02d0"+
		"\u02d2\5\u00c9e\2\u02d1\u02d3\5\u00cbf\2\u02d2\u02d1\3\2\2\2\u02d2\u02d3"+
		"\3\2\2\2\u02d3\u02e1\3\2\2\2\u02d4\u02d6\5\u00c9e\2\u02d5\u02d7\5\u00cd"+
		"g\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02e1\3\2\2\2\u02d8"+
		"\u02da\5\u00cbf\2\u02d9\u02db\5\u00c9e\2\u02da\u02d9\3\2\2\2\u02da\u02db"+
		"\3\2\2\2\u02db\u02e1\3\2\2\2\u02dc\u02de\5\u00cdg\2\u02dd\u02df\5\u00c9"+
		"e\2\u02de\u02dd\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e1\3\2\2\2\u02e0"+
		"\u02d0\3\2\2\2\u02e0\u02d4\3\2\2\2\u02e0\u02d8\3\2\2\2\u02e0\u02dc\3\2"+
		"\2\2\u02e1\u00c8\3\2\2\2\u02e2\u02e3\t\t\2\2\u02e3\u00ca\3\2\2\2\u02e4"+
		"\u02e5\t\n\2\2\u02e5\u00cc\3\2\2\2\u02e6\u02e7\7n\2\2\u02e7\u02eb\7n\2"+
		"\2\u02e8\u02e9\7N\2\2\u02e9\u02eb\7N\2\2\u02ea\u02e6\3\2\2\2\u02ea\u02e8"+
		"\3\2\2\2\u02eb\u00ce\3\2\2\2\u02ec\u02ef\n\13\2\2\u02ed\u02ef\5\u00d1"+
		"i\2\u02ee\u02ec\3\2\2\2\u02ee\u02ed\3\2\2\2\u02ef\u00d0\3\2\2\2\u02f0"+
		"\u02f4\5\u00d3j\2\u02f1\u02f4\5\u00d5k\2\u02f2\u02f4\5\u00d7l\2\u02f3"+
		"\u02f0\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f2\3\2\2\2\u02f4\u00d2\3\2"+
		"\2\2\u02f5\u02f6\7^\2\2\u02f6\u0314\7)\2\2\u02f7\u02f8\7^\2\2\u02f8\u0314"+
		"\7$\2\2\u02f9\u02fa\7^\2\2\u02fa\u0314\7A\2\2\u02fb\u02fc\7^\2\2\u02fc"+
		"\u0314\7^\2\2\u02fd\u02fe\7^\2\2\u02fe\u0314\7c\2\2\u02ff\u0300\7^\2\2"+
		"\u0300\u0314\7d\2\2\u0301\u0302\7^\2\2\u0302\u0314\7h\2\2\u0303\u0304"+
		"\7^\2\2\u0304\u0314\7p\2\2\u0305\u0306\7^\2\2\u0306\u0314\7t\2\2\u0307"+
		"\u030d\7^\2\2\u0308\u030a\7\17\2\2\u0309\u030b\7\f\2\2\u030a\u0309\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030e\3\2\2\2\u030c\u030e\7\f\2\2\u030d"+
		"\u0308\3\2\2\2\u030d\u030c\3\2\2\2\u030e\u0314\3\2\2\2\u030f\u0310\7^"+
		"\2\2\u0310\u0314\7v\2\2\u0311\u0312\7^\2\2\u0312\u0314\7x\2\2\u0313\u02f5"+
		"\3\2\2\2\u0313\u02f7\3\2\2\2\u0313\u02f9\3\2\2\2\u0313\u02fb\3\2\2\2\u0313"+
		"\u02fd\3\2\2\2\u0313\u02ff\3\2\2\2\u0313\u0301\3\2\2\2\u0313\u0303\3\2"+
		"\2\2\u0313\u0305\3\2\2\2\u0313\u0307\3\2\2\2\u0313\u030f\3\2\2\2\u0313"+
		"\u0311\3\2\2\2\u0314\u00d4\3\2\2\2\u0315\u0316\7^\2\2\u0316\u0321\5\u00c1"+
		"a\2\u0317\u0318\7^\2\2\u0318\u0319\5\u00c1a\2\u0319\u031a\5\u00c1a\2\u031a"+
		"\u0321\3\2\2\2\u031b\u031c\7^\2\2\u031c\u031d\5\u00c1a\2\u031d\u031e\5"+
		"\u00c1a\2\u031e\u031f\5\u00c1a\2\u031f\u0321\3\2\2\2\u0320\u0315\3\2\2"+
		"\2\u0320\u0317\3\2\2\2\u0320\u031b\3\2\2\2\u0321\u00d6\3\2\2\2\u0322\u0323"+
		"\7^\2\2\u0323\u0324\7z\2\2\u0324\u0326\3\2\2\2\u0325\u0327\5\u00c3b\2"+
		"\u0326\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u0326\3\2\2\2\u0328\u0329"+
		"\3\2\2\2\u0329\u00d8\3\2\2\2\u032a\u032c\5\u00dfp\2\u032b\u032a\3\2\2"+
		"\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e\7\60\2\2\u032e"+
		"\u0333\5\u00dfp\2\u032f\u0330\5\u00dfp\2\u0330\u0331\7\60\2\2\u0331\u0333"+
		"\3\2\2\2\u0332\u032b\3\2\2\2\u0332\u032f\3\2\2\2\u0333\u00da\3\2\2\2\u0334"+
		"\u0336\7g\2\2\u0335\u0337\5\u00ddo\2\u0336\u0335\3\2\2\2\u0336\u0337\3"+
		"\2\2\2\u0337\u0338\3\2\2\2\u0338\u033f\5\u00dfp\2\u0339\u033b\7G\2\2\u033a"+
		"\u033c\5\u00ddo\2\u033b\u033a\3\2\2\2\u033b\u033c\3\2\2\2\u033c\u033d"+
		"\3\2\2\2\u033d\u033f\5\u00dfp\2\u033e\u0334\3\2\2\2\u033e\u0339\3\2\2"+
		"\2\u033f\u00dc\3\2\2\2\u0340\u0341\t\f\2\2\u0341\u00de\3\2\2\2\u0342\u0349"+
		"\5\u00b5[\2\u0343\u0345\7)\2\2\u0344\u0343\3\2\2\2\u0344\u0345\3\2\2\2"+
		"\u0345\u0346\3\2\2\2\u0346\u0348\5\u00b5[\2\u0347\u0344\3\2\2\2\u0348"+
		"\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u00e0\3\2"+
		"\2\2\u034b\u0349\3\2\2\2\u034c\u034d\t\r\2\2\u034d\u00e2\3\2\2\2\u034e"+
		"\u034f\7w\2\2\u034f\u0352\7:\2\2\u0350\u0352\t\2\2\2\u0351\u034e\3\2\2"+
		"\2\u0351\u0350\3\2\2\2\u0352\u00e4\3\2\2\2\u0353\u0356\n\16\2\2\u0354"+
		"\u0356\5\u00d1i\2\u0355\u0353\3\2\2\2\u0355\u0354\3\2\2\2\u0356\u00e6"+
		"\3\2\2\2\u0357\u0359\t\17\2\2\u0358\u0357\3\2\2\2\u0359\u035a\3\2\2\2"+
		"\u035a\u0358\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d"+
		"\bt\2\2\u035d\u00e8\3\2\2\2\u035e\u0360\7\17\2\2\u035f\u0361\7\f\2\2\u0360"+
		"\u035f\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0364\7\f"+
		"\2\2\u0363\u035e\3\2\2\2\u0363\u0362\3\2\2\2\u0364\u0365\3\2\2\2\u0365"+
		"\u0366\bu\2\2\u0366\u00ea\3\2\2\2\u0367\u0368\7\61\2\2\u0368\u0369\7,"+
		"\2\2\u0369\u036d\3\2\2\2\u036a\u036c\13\2\2\2\u036b\u036a\3\2\2\2\u036c"+
		"\u036f\3\2\2\2\u036d\u036e\3\2\2\2\u036d\u036b\3\2\2\2\u036e\u0370\3\2"+
		"\2\2\u036f\u036d\3\2\2\2\u0370\u0371\7,\2\2\u0371\u0372\7\61\2\2\u0372"+
		"\u0373\3\2\2\2\u0373\u0374\bv\2\2\u0374\u00ec\3\2\2\2\u0375\u0376\7\61"+
		"\2\2\u0376\u0377\7\61\2\2\u0377\u037b\3\2\2\2\u0378\u037a\n\20\2\2\u0379"+
		"\u0378\3\2\2\2\u037a\u037d\3\2\2\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2"+
		"\2\2\u037c\u037e\3\2\2\2\u037d\u037b\3\2\2\2\u037e\u037f\bw\2\2\u037f"+
		"\u00ee\3\2\2\2>\2\u00f1\u00f5\u00f9\u00fd\u00ff\u0102\u0108\u010e\u0116"+
		"\u011a\u011f\u0122\u0128\u012e\u0134\u0139\u0146\u020c\u023d\u0243\u0289"+
		"\u028b\u0296\u029b\u02a0\u02a5\u02ac\u02b0\u02b5\u02bc\u02c0\u02c5\u02d2"+
		"\u02d6\u02da\u02de\u02e0\u02ea\u02ee\u02f3\u030a\u030d\u0313\u0320\u0328"+
		"\u032b\u0332\u0336\u033b\u033e\u0344\u0349\u0351\u0355\u035a\u0360\u0363"+
		"\u036d\u037b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}