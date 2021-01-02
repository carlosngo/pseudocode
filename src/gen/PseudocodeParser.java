// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\PseudocodeParser.g4 by ANTLR 4.9
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
public class PseudocodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, CharacterLiteral=2, FloatingLiteral=3, StringLiteral=4, 
		BooleanLiteral=5, PointerLiteral=6, UserDefinedLiteral=7, MultiLineMacro=8, 
		Directive=9, Alignas=10, Alignof=11, Asm=12, Auto=13, Bool=14, Break=15, 
		Case=16, Catch=17, Char=18, Char16=19, Char32=20, Class=21, Const=22, 
		Constexpr=23, Const_cast=24, Continue=25, Create=26, Decltype=27, Default=28, 
		Delete=29, Do=30, Double=31, Dynamic_cast=32, Else=33, Enum=34, Explicit=35, 
		Export=36, Extern=37, False_=38, Final=39, Float=40, For=41, Friend=42, 
		Goto=43, If=44, Inline=45, Int=46, Long=47, Mutable=48, Namespace=49, 
		New=50, Noexcept=51, Nullptr=52, Operator=53, Override=54, Private=55, 
		Protected=56, Public=57, Register=58, Reinterpret_cast=59, Return=60, 
		Short=61, Signed=62, Sizeof=63, Static=64, Static_assert=65, Static_cast=66, 
		String=67, Struct=68, Switch=69, Template=70, This=71, Thread_local=72, 
		Throw=73, True_=74, Try=75, Typedef=76, Typeid_=77, Typename_=78, Union=79, 
		Unsigned=80, Using=81, Virtual=82, Void=83, Volatile=84, Wchar=85, While=86, 
		LeftParen=87, RightParen=88, LeftBracket=89, RightBracket=90, LeftBrace=91, 
		RightBrace=92, Plus=93, Minus=94, Star=95, Div=96, Mod=97, Caret=98, And=99, 
		Or=100, Tilde=101, Not=102, Assign=103, Less=104, Greater=105, PlusAssign=106, 
		MinusAssign=107, StarAssign=108, DivAssign=109, ModAssign=110, XorAssign=111, 
		AndAssign=112, OrAssign=113, LeftShiftAssign=114, RightShiftAssign=115, 
		Equal=116, NotEqual=117, LessEqual=118, GreaterEqual=119, AndAnd=120, 
		OrOr=121, PlusPlus=122, MinusMinus=123, Comma=124, ArrowStar=125, Arrow=126, 
		Question=127, Colon=128, Doublecolon=129, Semi=130, Dot=131, DotStar=132, 
		Ellipsis=133, Up=134, Down=135, To=136, Scan=137, Print=138, Then=139, 
		Function=140, Main=141, Identifier=142, DecimalLiteral=143, OctalLiteral=144, 
		HexadecimalLiteral=145, BinaryLiteral=146, Integersuffix=147, UserDefinedIntegerLiteral=148, 
		UserDefinedFloatingLiteral=149, UserDefinedStringLiteral=150, UserDefinedCharacterLiteral=151, 
		Whitespace=152, Newline=153, BlockComment=154, LineComment=155;
	public static final int
		RULE_init = 0, RULE_primaryExpression = 1, RULE_expression = 2, RULE_assignmentExpression = 3, 
		RULE_logicalOrExpression = 4, RULE_logicalAndExpression = 5, RULE_equalityExpression = 6, 
		RULE_relationalExpression = 7, RULE_additiveExpression = 8, RULE_multiplicativeExpression = 9, 
		RULE_unaryExpression = 10, RULE_createExpression = 11, RULE_postfixExpression = 12, 
		RULE_constantExpression = 13, RULE_expressionList = 14, RULE_assignmentOperator = 15, 
		RULE_binaryOperator = 16, RULE_literal = 17, RULE_statement = 18, RULE_printStatement = 19, 
		RULE_scanStatement = 20, RULE_jumpStatement = 21, RULE_expressionStatement = 22, 
		RULE_compoundStatement = 23, RULE_statementSeq = 24, RULE_selectionStatement = 25, 
		RULE_ifStatement = 26, RULE_elseIfStatement = 27, RULE_elseStatement = 28, 
		RULE_condition = 29, RULE_iterationStatement = 30, RULE_forInitStatement = 31, 
		RULE_iterationInit = 32, RULE_declarationseq = 33, RULE_declaration = 34, 
		RULE_emptyDeclaration = 35, RULE_simpleDeclaration = 36, RULE_declSpecifierSeq = 37, 
		RULE_typeSpecifier = 38, RULE_declarator = 39, RULE_functionDefinition = 40, 
		RULE_mainFunction = 41, RULE_initDeclaratorList = 42, RULE_initDeclarator = 43, 
		RULE_initializer = 44, RULE_initializerClause = 45, RULE_initializerList = 46, 
		RULE_parametersAndQualifiers = 47, RULE_parameterDeclarationClause = 48, 
		RULE_parameterDeclaration = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "primaryExpression", "expression", "assignmentExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"createExpression", "postfixExpression", "constantExpression", "expressionList", 
			"assignmentOperator", "binaryOperator", "literal", "statement", "printStatement", 
			"scanStatement", "jumpStatement", "expressionStatement", "compoundStatement", 
			"statementSeq", "selectionStatement", "ifStatement", "elseIfStatement", 
			"elseStatement", "condition", "iterationStatement", "forInitStatement", 
			"iterationInit", "declarationseq", "declaration", "emptyDeclaration", 
			"simpleDeclaration", "declSpecifierSeq", "typeSpecifier", "declarator", 
			"functionDefinition", "mainFunction", "initDeclaratorList", "initDeclarator", 
			"initializer", "initializerClause", "initializerList", "parametersAndQualifiers", 
			"parameterDeclarationClause", "parameterDeclaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "'alignas'", 
			"'alignof'", "'asm'", "'auto'", null, "'break'", "'case'", "'catch'", 
			"'char'", "'char16_t'", "'char32_t'", "'class'", "'constant'", "'constexpr'", 
			"'const_cast'", "'continue'", "'create'", "'decltype'", "'default'", 
			"'delete'", "'do'", "'double'", "'dynamic_cast'", "'else'", "'enum'", 
			"'explicit'", "'export'", "'extern'", "'F'", "'final'", "'float'", "'for'", 
			"'friend'", "'goto'", "'if'", "'inline'", "'int'", "'long'", "'mutable'", 
			"'namespace'", "'new'", "'noexcept'", "'nullptr'", "'operator'", "'override'", 
			"'private'", "'protected'", "'public'", "'register'", "'reinterpret_cast'", 
			"'return'", "'short'", "'signed'", "'sizeof'", "'static'", "'static_assert'", 
			"'static_cast'", "'String'", "'struct'", "'switch'", "'template'", "'this'", 
			"'thread_local'", "'throw'", "'T'", "'try'", "'typedef'", "'typeid'", 
			"'typename'", "'union'", "'unsigned'", "'using'", "'virtual'", "'void'", 
			"'volatile'", "'wchar_t'", "'while'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'&'", "'|'", "'~'", 
			null, "'='", "'<'", "'>'", "'+='", "'-='", "'*='", "'/='", "'%='", "'^='", 
			"'&='", "'|='", "'<<='", "'>>='", "'=='", "'!='", "'<='", "'>='", null, 
			null, "'++'", "'--'", "','", "'->*'", "'->'", "'?'", "':'", "'::'", "';'", 
			"'.'", "'.*'", "'...'", "'up'", "'down'", "'to'", "'scan'", "'print'", 
			"'then'", "'func'", "'main'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "CharacterLiteral", "FloatingLiteral", "StringLiteral", 
			"BooleanLiteral", "PointerLiteral", "UserDefinedLiteral", "MultiLineMacro", 
			"Directive", "Alignas", "Alignof", "Asm", "Auto", "Bool", "Break", "Case", 
			"Catch", "Char", "Char16", "Char32", "Class", "Const", "Constexpr", "Const_cast", 
			"Continue", "Create", "Decltype", "Default", "Delete", "Do", "Double", 
			"Dynamic_cast", "Else", "Enum", "Explicit", "Export", "Extern", "False_", 
			"Final", "Float", "For", "Friend", "Goto", "If", "Inline", "Int", "Long", 
			"Mutable", "Namespace", "New", "Noexcept", "Nullptr", "Operator", "Override", 
			"Private", "Protected", "Public", "Register", "Reinterpret_cast", "Return", 
			"Short", "Signed", "Sizeof", "Static", "Static_assert", "Static_cast", 
			"String", "Struct", "Switch", "Template", "This", "Thread_local", "Throw", 
			"True_", "Try", "Typedef", "Typeid_", "Typename_", "Union", "Unsigned", 
			"Using", "Virtual", "Void", "Volatile", "Wchar", "While", "LeftParen", 
			"RightParen", "LeftBracket", "RightBracket", "LeftBrace", "RightBrace", 
			"Plus", "Minus", "Star", "Div", "Mod", "Caret", "And", "Or", "Tilde", 
			"Not", "Assign", "Less", "Greater", "PlusAssign", "MinusAssign", "StarAssign", 
			"DivAssign", "ModAssign", "XorAssign", "AndAssign", "OrAssign", "LeftShiftAssign", 
			"RightShiftAssign", "Equal", "NotEqual", "LessEqual", "GreaterEqual", 
			"AndAnd", "OrOr", "PlusPlus", "MinusMinus", "Comma", "ArrowStar", "Arrow", 
			"Question", "Colon", "Doublecolon", "Semi", "Dot", "DotStar", "Ellipsis", 
			"Up", "Down", "To", "Scan", "Print", "Then", "Function", "Main", "Identifier", 
			"DecimalLiteral", "OctalLiteral", "HexadecimalLiteral", "BinaryLiteral", 
			"Integersuffix", "UserDefinedIntegerLiteral", "UserDefinedFloatingLiteral", 
			"UserDefinedStringLiteral", "UserDefinedCharacterLiteral", "Whitespace", 
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

	@Override
	public String getGrammarFileName() { return "PseudocodeParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PseudocodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PseudocodeParser.EOF, 0); }
		public DeclarationseqContext declarationseq() {
			return getRuleContext(DeclarationseqContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Bool - 14)) | (1L << (Char - 14)) | (1L << (Const - 14)) | (1L << (Double - 14)) | (1L << (Final - 14)) | (1L << (Float - 14)) | (1L << (Int - 14)) | (1L << (Long - 14)) | (1L << (Short - 14)) | (1L << (String - 14)))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (Void - 83)) | (1L << (Semi - 83)) | (1L << (Function - 83)) | (1L << (Main - 83)) | (1L << (Identifier - 83)))) != 0)) {
				{
				setState(100);
				declarationseq();
				}
			}

			setState(103);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public TerminalNode This() { return getToken(PseudocodeParser.This, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PseudocodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudocodeParser.Identifier, i);
		}
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		try {
			int _alt;
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				match(This);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(108);
				match(LeftParen);
				setState(109);
				expression();
				setState(110);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(LeftParen);
				setState(113);
				expression();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				match(LeftParen);
				setState(117);
				expression();
				setState(118);
				match(RightParen);
				setState(119);
				match(RightParen);
				 notifyErrorListeners("too many closing parentheses"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(Identifier);
				setState(124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(123);
						match(Identifier);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("expected double quotes or operators"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				literal();
				setState(131); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(130);
						literal();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(133); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("expected double quotes or operators"); 
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignmentExpression);
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				logicalOrExpression();
				setState(143);
				assignmentOperator();
				setState(144);
				initializerClause();
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OrOr() { return getTokens(PseudocodeParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(PseudocodeParser.OrOr, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			logicalAndExpression();
			setState(153);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(149);
					match(OrOr);
					setState(150);
					logicalAndExpression();
					}
					} 
				}
				setState(155);
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
			exitRule();
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(PseudocodeParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(PseudocodeParser.AndAnd, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			equalityExpression();
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(157);
					match(AndAnd);
					setState(158);
					equalityExpression();
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equal() { return getTokens(PseudocodeParser.Equal); }
		public TerminalNode Equal(int i) {
			return getToken(PseudocodeParser.Equal, i);
		}
		public List<TerminalNode> NotEqual() { return getTokens(PseudocodeParser.NotEqual); }
		public TerminalNode NotEqual(int i) {
			return getToken(PseudocodeParser.NotEqual, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_equalityExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			relationalExpression();
			setState(169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(165);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(166);
					relationalExpression();
					}
					} 
				}
				setState(171);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> Less() { return getTokens(PseudocodeParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PseudocodeParser.Less, i);
		}
		public List<TerminalNode> Greater() { return getTokens(PseudocodeParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PseudocodeParser.Greater, i);
		}
		public List<TerminalNode> LessEqual() { return getTokens(PseudocodeParser.LessEqual); }
		public TerminalNode LessEqual(int i) {
			return getToken(PseudocodeParser.LessEqual, i);
		}
		public List<TerminalNode> GreaterEqual() { return getTokens(PseudocodeParser.GreaterEqual); }
		public TerminalNode GreaterEqual(int i) {
			return getToken(PseudocodeParser.GreaterEqual, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			additiveExpression();
			setState(177);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(173);
					_la = _input.LA(1);
					if ( !(((((_la - 104)) & ~0x3f) == 0 && ((1L << (_la - 104)) & ((1L << (Less - 104)) | (1L << (Greater - 104)) | (1L << (LessEqual - 104)) | (1L << (GreaterEqual - 104)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(174);
					additiveExpression();
					}
					} 
				}
				setState(179);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(PseudocodeParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(PseudocodeParser.Plus, i);
		}
		public List<TerminalNode> Minus() { return getTokens(PseudocodeParser.Minus); }
		public TerminalNode Minus(int i) {
			return getToken(PseudocodeParser.Minus, i);
		}
		public List<TerminalNode> PlusPlus() { return getTokens(PseudocodeParser.PlusPlus); }
		public TerminalNode PlusPlus(int i) {
			return getToken(PseudocodeParser.PlusPlus, i);
		}
		public List<TerminalNode> MinusMinus() { return getTokens(PseudocodeParser.MinusMinus); }
		public TerminalNode MinusMinus(int i) {
			return getToken(PseudocodeParser.MinusMinus, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				multiplicativeExpression();
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(182);
						multiplicativeExpression();
						}
						} 
					}
					setState(187);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				multiplicativeExpression();
				setState(193);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						_la = _input.LA(1);
						if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (Plus - 93)) | (1L << (Minus - 93)) | (1L << (PlusPlus - 93)) | (1L << (MinusMinus - 93)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(190);
						multiplicativeExpression();
						}
						} 
					}
					setState(195);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				 notifyErrorListeners("redundant +"); 
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> Star() { return getTokens(PseudocodeParser.Star); }
		public TerminalNode Star(int i) {
			return getToken(PseudocodeParser.Star, i);
		}
		public List<TerminalNode> Div() { return getTokens(PseudocodeParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(PseudocodeParser.Div, i);
		}
		public List<TerminalNode> Mod() { return getTokens(PseudocodeParser.Mod); }
		public TerminalNode Mod(int i) {
			return getToken(PseudocodeParser.Mod, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_multiplicativeExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			unaryExpression(0);
			setState(205);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					_la = _input.LA(1);
					if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (Star - 95)) | (1L << (Div - 95)) | (1L << (Mod - 95)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(202);
					unaryExpression(0);
					}
					} 
				}
				setState(207);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode Not() { return getToken(PseudocodeParser.Not, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public CreateExpressionContext createExpression() {
			return getRuleContext(CreateExpressionContext.class,0);
		}
		public List<BinaryOperatorContext> binaryOperator() {
			return getRuleContexts(BinaryOperatorContext.class);
		}
		public BinaryOperatorContext binaryOperator(int i) {
			return getRuleContext(BinaryOperatorContext.class,i);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		return unaryExpression(0);
	}

	private UnaryExpressionContext unaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, _parentState);
		UnaryExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_unaryExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case PointerLiteral:
			case UserDefinedLiteral:
			case This:
			case LeftParen:
			case Identifier:
				{
				setState(209);
				postfixExpression();
				}
				break;
			case Not:
				{
				setState(210);
				match(Not);
				setState(211);
				unaryExpression(4);
				}
				break;
			case Create:
			case New:
				{
				setState(212);
				createExpression();
				}
				break;
			case Plus:
			case Minus:
			case Star:
			case Div:
			case Mod:
			case Assign:
			case Less:
			case Greater:
			case PlusAssign:
			case MinusAssign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case Equal:
			case NotEqual:
			case LessEqual:
			case GreaterEqual:
			case AndAnd:
			case OrOr:
				{
				setState(214); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(213);
						binaryOperator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(216); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(218);
				unaryExpression(2);
				 notifyErrorListeners("redundant binary operator. Missing operand"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnaryExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unaryExpression);
					setState(223);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(225); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(224);
							binaryOperator();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(227); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					 notifyErrorListeners("redundant binary operator. Missing operand"); 
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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

	public static class CreateExpressionContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudocodeParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PseudocodeParser.RightBracket, 0); }
		public TerminalNode Create() { return getToken(PseudocodeParser.Create, 0); }
		public TerminalNode New() { return getToken(PseudocodeParser.New, 0); }
		public CreateExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterCreateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitCreateExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitCreateExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateExpressionContext createExpression() throws RecognitionException {
		CreateExpressionContext _localctx = new CreateExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_la = _input.LA(1);
			if ( !(_la==Create || _la==New) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(237);
			typeSpecifier();
			setState(238);
			match(LeftBracket);
			setState(239);
			constantExpression();
			setState(240);
			match(RightBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudocodeParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PseudocodeParser.RightBracket, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(PseudocodeParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudocodeParser.MinusMinus, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_postfixExpression);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(Identifier);
				setState(244);
				match(LeftBracket);
				setState(245);
				expression();
				setState(246);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(Identifier);
				setState(249);
				match(LeftParen);
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Create) | (1L << New))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (LeftParen - 71)) | (1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (Div - 71)) | (1L << (Mod - 71)) | (1L << (Not - 71)) | (1L << (Assign - 71)) | (1L << (Less - 71)) | (1L << (Greater - 71)) | (1L << (PlusAssign - 71)) | (1L << (MinusAssign - 71)) | (1L << (StarAssign - 71)) | (1L << (DivAssign - 71)) | (1L << (ModAssign - 71)) | (1L << (Equal - 71)) | (1L << (NotEqual - 71)) | (1L << (LessEqual - 71)) | (1L << (GreaterEqual - 71)) | (1L << (AndAnd - 71)) | (1L << (OrOr - 71)))) != 0) || _la==Identifier) {
					{
					setState(250);
					expressionList();
					}
				}

				setState(253);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				match(Identifier);
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(256);
				literal();
				setState(257);
				match(LeftParen);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Create) | (1L << New))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (LeftParen - 71)) | (1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (Div - 71)) | (1L << (Mod - 71)) | (1L << (Not - 71)) | (1L << (Assign - 71)) | (1L << (Less - 71)) | (1L << (Greater - 71)) | (1L << (PlusAssign - 71)) | (1L << (MinusAssign - 71)) | (1L << (StarAssign - 71)) | (1L << (DivAssign - 71)) | (1L << (ModAssign - 71)) | (1L << (Equal - 71)) | (1L << (NotEqual - 71)) | (1L << (LessEqual - 71)) | (1L << (GreaterEqual - 71)) | (1L << (AndAnd - 71)) | (1L << (OrOr - 71)))) != 0) || _la==Identifier) {
					{
					setState(258);
					expressionList();
					}
				}

				setState(261);
				match(RightParen);
				 notifyErrorListeners("redundant parentheses"); 
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

	public static class ConstantExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_constantExpression);
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				assignmentExpression();
				 notifyErrorListeners("unexpected assignment operation"); 
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

	public static class ExpressionListContext extends ParserRuleContext {
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			initializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(PseudocodeParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(PseudocodeParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(PseudocodeParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(PseudocodeParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(PseudocodeParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(PseudocodeParser.MinusAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ( !(((((_la - 103)) & ~0x3f) == 0 && ((1L << (_la - 103)) & ((1L << (Assign - 103)) | (1L << (PlusAssign - 103)) | (1L << (MinusAssign - 103)) | (1L << (StarAssign - 103)) | (1L << (DivAssign - 103)) | (1L << (ModAssign - 103)))) != 0)) ) {
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

	public static class BinaryOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TerminalNode Plus() { return getToken(PseudocodeParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(PseudocodeParser.Minus, 0); }
		public TerminalNode Star() { return getToken(PseudocodeParser.Star, 0); }
		public TerminalNode Div() { return getToken(PseudocodeParser.Div, 0); }
		public TerminalNode Mod() { return getToken(PseudocodeParser.Mod, 0); }
		public TerminalNode Greater() { return getToken(PseudocodeParser.Greater, 0); }
		public TerminalNode Less() { return getToken(PseudocodeParser.Less, 0); }
		public TerminalNode GreaterEqual() { return getToken(PseudocodeParser.GreaterEqual, 0); }
		public TerminalNode Equal() { return getToken(PseudocodeParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(PseudocodeParser.NotEqual, 0); }
		public TerminalNode LessEqual() { return getToken(PseudocodeParser.LessEqual, 0); }
		public TerminalNode AndAnd() { return getToken(PseudocodeParser.AndAnd, 0); }
		public TerminalNode OrOr() { return getToken(PseudocodeParser.OrOr, 0); }
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitBinaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitBinaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_binaryOperator);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				assignmentOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(Plus);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(Minus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				match(Star);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(Div);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				match(Mod);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(Greater);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				match(Less);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				match(GreaterEqual);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(285);
				match(Equal);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(286);
				match(NotEqual);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(287);
				match(LessEqual);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(288);
				match(GreaterEqual);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(289);
				match(AndAnd);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(290);
				match(OrOr);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(PseudocodeParser.IntegerLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(PseudocodeParser.CharacterLiteral, 0); }
		public TerminalNode FloatingLiteral() { return getToken(PseudocodeParser.FloatingLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudocodeParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(PseudocodeParser.BooleanLiteral, 0); }
		public TerminalNode PointerLiteral() { return getToken(PseudocodeParser.PointerLiteral, 0); }
		public TerminalNode UserDefinedLiteral() { return getToken(PseudocodeParser.UserDefinedLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public ScanStatementContext scanStatement() {
			return getRuleContext(ScanStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statement);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(296);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(297);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(299);
				jumpStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(301);
				scanStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(302);
				simpleDeclaration();
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

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(PseudocodeParser.Print, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			match(Print);
			setState(306);
			match(LeftParen);
			setState(307);
			constantExpression();
			setState(308);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ScanStatementContext extends ParserRuleContext {
		public TerminalNode Scan() { return getToken(PseudocodeParser.Scan, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudocodeParser.StringLiteral, 0); }
		public TerminalNode Comma() { return getToken(PseudocodeParser.Comma, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
		public ScanStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scanStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterScanStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitScanStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitScanStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScanStatementContext scanStatement() throws RecognitionException {
		ScanStatementContext _localctx = new ScanStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_scanStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Scan);
			setState(311);
			match(LeftParen);
			setState(312);
			match(StringLiteral);
			setState(313);
			match(Comma);
			setState(314);
			match(Identifier);
			setState(315);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public TerminalNode Break() { return getToken(PseudocodeParser.Break, 0); }
		public TerminalNode Continue() { return getToken(PseudocodeParser.Continue, 0); }
		public TerminalNode Return() { return getToken(PseudocodeParser.Return, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jumpStatement);
		int _la;
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(317);
					match(Break);
					}
					break;
				case Continue:
					{
					setState(318);
					match(Continue);
					}
					break;
				case Return:
					{
					setState(319);
					match(Return);
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Create) | (1L << New))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (LeftParen - 71)) | (1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (Div - 71)) | (1L << (Mod - 71)) | (1L << (Not - 71)) | (1L << (Assign - 71)) | (1L << (Less - 71)) | (1L << (Greater - 71)) | (1L << (PlusAssign - 71)) | (1L << (MinusAssign - 71)) | (1L << (StarAssign - 71)) | (1L << (DivAssign - 71)) | (1L << (ModAssign - 71)) | (1L << (Equal - 71)) | (1L << (NotEqual - 71)) | (1L << (LessEqual - 71)) | (1L << (GreaterEqual - 71)) | (1L << (AndAnd - 71)) | (1L << (OrOr - 71)))) != 0) || _la==Identifier) {
						{
						setState(320);
						constantExpression();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(325);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				match(Return);
				setState(327);
				typeSpecifier();
				setState(328);
				match(Semi);
				 notifyErrorListeners("expected expression as return value"); 
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Create) | (1L << New))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (LeftParen - 71)) | (1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (Div - 71)) | (1L << (Mod - 71)) | (1L << (Not - 71)) | (1L << (Assign - 71)) | (1L << (Less - 71)) | (1L << (Greater - 71)) | (1L << (PlusAssign - 71)) | (1L << (MinusAssign - 71)) | (1L << (StarAssign - 71)) | (1L << (DivAssign - 71)) | (1L << (ModAssign - 71)) | (1L << (Equal - 71)) | (1L << (NotEqual - 71)) | (1L << (LessEqual - 71)) | (1L << (GreaterEqual - 71)) | (1L << (AndAnd - 71)) | (1L << (OrOr - 71)))) != 0) || _la==Identifier) {
				{
				setState(333);
				expression();
				}
			}

			setState(336);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(PseudocodeParser.LeftBrace, 0); }
		public List<TerminalNode> RightBrace() { return getTokens(PseudocodeParser.RightBrace); }
		public TerminalNode RightBrace(int i) {
			return getToken(PseudocodeParser.RightBrace, i);
		}
		public StatementSeqContext statementSeq() {
			return getRuleContext(StatementSeqContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compoundStatement);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338);
				match(LeftBrace);
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (String - 67)) | (1L << (This - 67)) | (1L << (Void - 67)) | (1L << (While - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (Div - 67)) | (1L << (Mod - 67)) | (1L << (Not - 67)) | (1L << (Assign - 67)) | (1L << (Less - 67)) | (1L << (Greater - 67)) | (1L << (PlusAssign - 67)) | (1L << (MinusAssign - 67)) | (1L << (StarAssign - 67)) | (1L << (DivAssign - 67)) | (1L << (ModAssign - 67)) | (1L << (Equal - 67)) | (1L << (NotEqual - 67)) | (1L << (LessEqual - 67)) | (1L << (GreaterEqual - 67)) | (1L << (AndAnd - 67)) | (1L << (OrOr - 67)) | (1L << (Semi - 67)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (Scan - 137)) | (1L << (Print - 137)) | (1L << (Identifier - 137)))) != 0)) {
					{
					setState(339);
					statementSeq();
					}
				}

				setState(342);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(LeftBrace);
				setState(345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(344);
					statementSeq();
					}
					break;
				}
				 notifyErrorListeners("expected closing curly brace"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(348);
				match(LeftBrace);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (String - 67)) | (1L << (This - 67)) | (1L << (Void - 67)) | (1L << (While - 67)) | (1L << (LeftParen - 67)) | (1L << (LeftBrace - 67)) | (1L << (Plus - 67)) | (1L << (Minus - 67)) | (1L << (Star - 67)) | (1L << (Div - 67)) | (1L << (Mod - 67)) | (1L << (Not - 67)) | (1L << (Assign - 67)) | (1L << (Less - 67)) | (1L << (Greater - 67)) | (1L << (PlusAssign - 67)) | (1L << (MinusAssign - 67)) | (1L << (StarAssign - 67)) | (1L << (DivAssign - 67)) | (1L << (ModAssign - 67)) | (1L << (Equal - 67)) | (1L << (NotEqual - 67)) | (1L << (LessEqual - 67)) | (1L << (GreaterEqual - 67)) | (1L << (AndAnd - 67)) | (1L << (OrOr - 67)) | (1L << (Semi - 67)))) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (Scan - 137)) | (1L << (Print - 137)) | (1L << (Identifier - 137)))) != 0)) {
					{
					setState(349);
					statementSeq();
					}
				}

				setState(352);
				match(RightBrace);
				setState(353);
				match(RightBrace);
				 notifyErrorListeners("too many closing curly braces"); 
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

	public static class StatementSeqContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterStatementSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitStatementSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitStatementSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementSeqContext statementSeq() throws RecognitionException {
		StatementSeqContext _localctx = new StatementSeqContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_statementSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(358); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(357);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(360); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public List<ElseIfStatementContext> elseIfStatement() {
			return getRuleContexts(ElseIfStatementContext.class);
		}
		public ElseIfStatementContext elseIfStatement(int i) {
			return getRuleContext(ElseIfStatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_selectionStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			ifStatement();
			setState(366);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(363);
					elseIfStatement();
					}
					} 
				}
				setState(368);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(369);
				elseStatement();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(PseudocodeParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Then() { return getToken(PseudocodeParser.Then, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ifStatement);
		int _la;
		try {
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(If);
				setState(373);
				match(LeftParen);
				setState(374);
				condition();
				setState(375);
				match(RightParen);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(376);
					match(Then);
					}
				}

				setState(379);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(381);
				match(If);
				setState(382);
				match(LeftParen);
				setState(383);
				condition();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(384);
					match(Then);
					}
				}

				setState(387);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(390);
				match(If);
				setState(391);
				match(LeftParen);
				setState(392);
				condition();
				setState(393);
				match(RightParen);
				setState(394);
				match(RightParen);
				setState(396);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(395);
					match(Then);
					}
				}

				setState(398);
				compoundStatement();
				 notifyErrorListeners("too many closing parentheses"); 
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

	public static class ElseIfStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PseudocodeParser.Else, 0); }
		public TerminalNode If() { return getToken(PseudocodeParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Then() { return getToken(PseudocodeParser.Then, 0); }
		public ElseIfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIfStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterElseIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitElseIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitElseIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfStatementContext elseIfStatement() throws RecognitionException {
		ElseIfStatementContext _localctx = new ElseIfStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_elseIfStatement);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(403);
				match(Else);
				setState(404);
				match(If);
				setState(405);
				match(LeftParen);
				setState(406);
				condition();
				setState(407);
				match(RightParen);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(408);
					match(Then);
					}
				}

				setState(411);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				match(Else);
				setState(414);
				match(If);
				setState(415);
				match(LeftParen);
				setState(416);
				condition();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(417);
					match(Then);
					}
				}

				setState(420);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(Else);
				setState(424);
				match(If);
				setState(425);
				match(LeftParen);
				setState(426);
				condition();
				setState(427);
				match(RightParen);
				setState(428);
				match(RightParen);
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(429);
					match(Then);
					}
				}

				setState(432);
				compoundStatement();
				 notifyErrorListeners("too many closing parentheses"); 
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(PseudocodeParser.Else, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Then() { return getToken(PseudocodeParser.Then, 0); }
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(Else);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Then) {
				{
				setState(438);
				match(Then);
				}
			}

			setState(441);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			constantExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PseudocodeParser.For, 0); }
		public IterationInitContext iterationInit() {
			return getRuleContext(IterationInitContext.class,0);
		}
		public TerminalNode To() { return getToken(PseudocodeParser.To, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Up() { return getToken(PseudocodeParser.Up, 0); }
		public TerminalNode Down() { return getToken(PseudocodeParser.Down, 0); }
		public TerminalNode While() { return getToken(PseudocodeParser.While, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(PseudocodeParser.Do, 0); }
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_iterationStatement);
		int _la;
		try {
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(For);
				setState(446);
				iterationInit();
				setState(447);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(448);
				match(To);
				setState(449);
				constantExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(While);
				setState(452);
				iterationInit();
				setState(453);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(454);
				match(To);
				setState(455);
				constantExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(457);
				match(While);
				setState(458);
				match(LeftParen);
				setState(459);
				condition();
				setState(460);
				match(RightParen);
				setState(461);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				match(Do);
				setState(464);
				statement();
				setState(465);
				match(While);
				setState(466);
				match(LeftParen);
				setState(467);
				condition();
				setState(468);
				match(RightParen);
				setState(469);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(471);
				match(For);
				setState(472);
				match(LeftParen);
				{
				setState(473);
				forInitStatement();
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Create) | (1L << New))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (LeftParen - 71)) | (1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (Div - 71)) | (1L << (Mod - 71)) | (1L << (Not - 71)) | (1L << (Assign - 71)) | (1L << (Less - 71)) | (1L << (Greater - 71)) | (1L << (PlusAssign - 71)) | (1L << (MinusAssign - 71)) | (1L << (StarAssign - 71)) | (1L << (DivAssign - 71)) | (1L << (ModAssign - 71)) | (1L << (Equal - 71)) | (1L << (NotEqual - 71)) | (1L << (LessEqual - 71)) | (1L << (GreaterEqual - 71)) | (1L << (AndAnd - 71)) | (1L << (OrOr - 71)))) != 0) || _la==Identifier) {
					{
					setState(474);
					condition();
					}
				}

				setState(477);
				match(Semi);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Create) | (1L << New))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (LeftParen - 71)) | (1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (Div - 71)) | (1L << (Mod - 71)) | (1L << (Not - 71)) | (1L << (Assign - 71)) | (1L << (Less - 71)) | (1L << (Greater - 71)) | (1L << (PlusAssign - 71)) | (1L << (MinusAssign - 71)) | (1L << (StarAssign - 71)) | (1L << (DivAssign - 71)) | (1L << (ModAssign - 71)) | (1L << (Equal - 71)) | (1L << (NotEqual - 71)) | (1L << (LessEqual - 71)) | (1L << (GreaterEqual - 71)) | (1L << (AndAnd - 71)) | (1L << (OrOr - 71)))) != 0) || _la==Identifier) {
					{
					setState(478);
					expression();
					}
				}

				}
				setState(481);
				match(RightParen);
				setState(482);
				statement();
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

	public static class ForInitStatementContext extends ParserRuleContext {
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public ForInitStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterForInitStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitForInitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitForInitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitStatementContext forInitStatement() throws RecognitionException {
		ForInitStatementContext _localctx = new ForInitStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_forInitStatement);
		try {
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(486);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(487);
				simpleDeclaration();
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

	public static class IterationInitContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public IterationInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterIterationInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitIterationInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitIterationInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationInitContext iterationInit() throws RecognitionException {
		IterationInitContext _localctx = new IterationInitContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_iterationInit);
		int _la;
		try {
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short))) != 0) || _la==String || _la==Void) {
					{
					setState(491);
					declSpecifierSeq();
					}
				}

				setState(494);
				initDeclaratorList();
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

	public static class DeclarationseqContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationseqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationseq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterDeclarationseq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitDeclarationseq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitDeclarationseq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationseqContext declarationseq() throws RecognitionException {
		DeclarationseqContext _localctx = new DeclarationseqContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_declarationseq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(497);
				declaration();
				}
				}
				setState(500); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (Bool - 14)) | (1L << (Char - 14)) | (1L << (Const - 14)) | (1L << (Double - 14)) | (1L << (Final - 14)) | (1L << (Float - 14)) | (1L << (Int - 14)) | (1L << (Long - 14)) | (1L << (Short - 14)) | (1L << (String - 14)))) != 0) || ((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (Void - 83)) | (1L << (Semi - 83)) | (1L << (Function - 83)) | (1L << (Main - 83)) | (1L << (Identifier - 83)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public SimpleDeclarationContext simpleDeclaration() {
			return getRuleContext(SimpleDeclarationContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public EmptyDeclarationContext emptyDeclaration() {
			return getRuleContext(EmptyDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_declaration);
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(504);
				emptyDeclaration();
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

	public static class EmptyDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public EmptyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterEmptyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitEmptyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitEmptyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyDeclarationContext emptyDeclaration() throws RecognitionException {
		EmptyDeclarationContext _localctx = new EmptyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public SimpleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterSimpleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitSimpleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitSimpleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleDeclarationContext simpleDeclaration() throws RecognitionException {
		SimpleDeclarationContext _localctx = new SimpleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_simpleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short))) != 0) || _la==String || _la==Void) {
				{
				setState(509);
				declSpecifierSeq();
				}
			}

			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(512);
				initDeclaratorList();
				}
			}

			setState(515);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclSpecifierSeqContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudocodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudocodeParser.RightBracket, 0); }
		public TerminalNode Const() { return getToken(PseudocodeParser.Const, 0); }
		public TerminalNode Final() { return getToken(PseudocodeParser.Final, 0); }
		public DeclSpecifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declSpecifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterDeclSpecifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitDeclSpecifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitDeclSpecifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclSpecifierSeqContext declSpecifierSeq() throws RecognitionException {
		DeclSpecifierSeqContext _localctx = new DeclSpecifierSeqContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_declSpecifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const || _la==Final) {
				{
				setState(517);
				_la = _input.LA(1);
				if ( !(_la==Const || _la==Final) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(520);
			typeSpecifier();
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(521);
				match(LeftBracket);
				setState(522);
				match(RightBracket);
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

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Char() { return getToken(PseudocodeParser.Char, 0); }
		public TerminalNode Bool() { return getToken(PseudocodeParser.Bool, 0); }
		public TerminalNode Short() { return getToken(PseudocodeParser.Short, 0); }
		public TerminalNode Int() { return getToken(PseudocodeParser.Int, 0); }
		public TerminalNode Long() { return getToken(PseudocodeParser.Long, 0); }
		public TerminalNode Float() { return getToken(PseudocodeParser.Float, 0); }
		public TerminalNode Double() { return getToken(PseudocodeParser.Double, 0); }
		public TerminalNode Void() { return getToken(PseudocodeParser.Void, 0); }
		public TerminalNode String() { return getToken(PseudocodeParser.String, 0); }
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short))) != 0) || _la==String || _la==Void) ) {
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

	public static class DeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudocodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudocodeParser.RightBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_declarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			match(Identifier);
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftParen:
				{
				setState(528);
				parametersAndQualifiers();
				}
				break;
			case LeftBracket:
				{
				setState(529);
				match(LeftBracket);
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << PointerLiteral) | (1L << UserDefinedLiteral) | (1L << Create) | (1L << New))) != 0) || ((((_la - 71)) & ~0x3f) == 0 && ((1L << (_la - 71)) & ((1L << (This - 71)) | (1L << (LeftParen - 71)) | (1L << (Plus - 71)) | (1L << (Minus - 71)) | (1L << (Star - 71)) | (1L << (Div - 71)) | (1L << (Mod - 71)) | (1L << (Not - 71)) | (1L << (Assign - 71)) | (1L << (Less - 71)) | (1L << (Greater - 71)) | (1L << (PlusAssign - 71)) | (1L << (MinusAssign - 71)) | (1L << (StarAssign - 71)) | (1L << (DivAssign - 71)) | (1L << (ModAssign - 71)) | (1L << (Equal - 71)) | (1L << (NotEqual - 71)) | (1L << (LessEqual - 71)) | (1L << (GreaterEqual - 71)) | (1L << (AndAnd - 71)) | (1L << (OrOr - 71)))) != 0) || _la==Identifier) {
					{
					setState(530);
					constantExpression();
					}
				}

				setState(533);
				match(RightBracket);
				}
				break;
			case RightParen:
			case LeftBrace:
			case Assign:
			case Comma:
			case Semi:
			case Up:
			case Down:
				break;
			default:
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Function() { return getToken(PseudocodeParser.Function, 0); }
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_functionDefinition);
		int _la;
		try {
			setState(544);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(536);
					match(Function);
					}
				}

				setState(539);
				declSpecifierSeq();
				setState(540);
				declarator();
				setState(541);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(543);
				mainFunction();
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

	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(PseudocodeParser.Main, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Function() { return getToken(PseudocodeParser.Function, 0); }
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_mainFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Function) {
				{
				setState(546);
				match(Function);
				}
			}

			setState(550);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short))) != 0) || _la==String || _la==Void) {
				{
				setState(549);
				declSpecifierSeq();
				}
			}

			setState(552);
			match(Main);
			setState(553);
			match(LeftParen);
			setState(554);
			match(RightParen);
			setState(555);
			compoundStatement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public List<InitDeclaratorContext> initDeclarator() {
			return getRuleContexts(InitDeclaratorContext.class);
		}
		public InitDeclaratorContext initDeclarator(int i) {
			return getRuleContext(InitDeclaratorContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudocodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudocodeParser.Comma, i);
		}
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			initDeclarator();
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(558);
				match(Comma);
				setState(559);
				initDeclarator();
				}
				}
				setState(564);
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(565);
			declarator();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(566);
				initializer();
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

	public static class InitializerContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(PseudocodeParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(Assign);
			setState(570);
			initializerClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerClauseContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public InitializerClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterInitializerClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitInitializerClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitInitializerClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerClauseContext initializerClause() throws RecognitionException {
		InitializerClauseContext _localctx = new InitializerClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_initializerClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			assignmentExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public List<InitializerClauseContext> initializerClause() {
			return getRuleContexts(InitializerClauseContext.class);
		}
		public InitializerClauseContext initializerClause(int i) {
			return getRuleContext(InitializerClauseContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudocodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudocodeParser.Comma, i);
		}
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		InitializerListContext _localctx = new InitializerListContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			initializerClause();
			setState(579);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(575);
				match(Comma);
				setState(576);
				initializerClause();
				}
				}
				setState(581);
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

	public static class ParametersAndQualifiersContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
		public ParameterDeclarationClauseContext parameterDeclarationClause() {
			return getRuleContext(ParameterDeclarationClauseContext.class,0);
		}
		public ParametersAndQualifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersAndQualifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterParametersAndQualifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitParametersAndQualifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitParametersAndQualifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersAndQualifiersContext parametersAndQualifiers() throws RecognitionException {
		ParametersAndQualifiersContext _localctx = new ParametersAndQualifiersContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parametersAndQualifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(LeftParen);
			setState(584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short))) != 0) || _la==String || _la==Void) {
				{
				setState(583);
				parameterDeclarationClause();
				}
			}

			setState(586);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterDeclarationClauseContext extends ParserRuleContext {
		public List<ParameterDeclarationContext> parameterDeclaration() {
			return getRuleContexts(ParameterDeclarationContext.class);
		}
		public ParameterDeclarationContext parameterDeclaration(int i) {
			return getRuleContext(ParameterDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudocodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudocodeParser.Comma, i);
		}
		public ParameterDeclarationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclarationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterParameterDeclarationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitParameterDeclarationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitParameterDeclarationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationClauseContext parameterDeclarationClause() throws RecognitionException {
		ParameterDeclarationClauseContext _localctx = new ParameterDeclarationClauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parameterDeclarationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			parameterDeclaration();
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(589);
				match(Comma);
				setState(590);
				parameterDeclaration();
				}
				}
				setState(595);
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

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(PseudocodeParser.Assign, 0); }
		public InitializerClauseContext initializerClause() {
			return getRuleContext(InitializerClauseContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_parameterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			declSpecifierSeq();
			{
			setState(597);
			declarator();
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(598);
				match(Assign);
				setState(599);
				initializerClause();
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return unaryExpression_sempred((UnaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean unaryExpression_sempred(UnaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u009d\u025d\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\5\2"+
		"h\n\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\6\3\177\n\3\r\3\16\3\u0080\3\3\3\3\3\3\6\3\u0086"+
		"\n\3\r\3\16\3\u0087\3\3\3\3\5\3\u008c\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\5\5\u0095\n\5\3\6\3\6\3\6\7\6\u009a\n\6\f\6\16\6\u009d\13\6\3\7\3\7\3"+
		"\7\7\7\u00a2\n\7\f\7\16\7\u00a5\13\7\3\b\3\b\3\b\7\b\u00aa\n\b\f\b\16"+
		"\b\u00ad\13\b\3\t\3\t\3\t\7\t\u00b2\n\t\f\t\16\t\u00b5\13\t\3\n\3\n\3"+
		"\n\7\n\u00ba\n\n\f\n\16\n\u00bd\13\n\3\n\3\n\3\n\7\n\u00c2\n\n\f\n\16"+
		"\n\u00c5\13\n\3\n\3\n\5\n\u00c9\n\n\3\13\3\13\3\13\7\13\u00ce\n\13\f\13"+
		"\16\13\u00d1\13\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00d9\n\f\r\f\16\f\u00da"+
		"\3\f\3\f\3\f\5\f\u00e0\n\f\3\f\3\f\6\f\u00e4\n\f\r\f\16\f\u00e5\3\f\3"+
		"\f\7\f\u00ea\n\f\f\f\16\f\u00ed\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00fe\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0106\n\16\3\16\3\16\3\16\5\16\u010b\n\16\3\17\3\17\3"+
		"\17\3\17\5\17\u0111\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0126\n\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0132\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\5\27\u0144\n\27\5\27\u0146\n\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u014e"+
		"\n\27\3\30\5\30\u0151\n\30\3\30\3\30\3\31\3\31\5\31\u0157\n\31\3\31\3"+
		"\31\3\31\5\31\u015c\n\31\3\31\3\31\3\31\5\31\u0161\n\31\3\31\3\31\3\31"+
		"\5\31\u0166\n\31\3\32\6\32\u0169\n\32\r\32\16\32\u016a\3\33\3\33\7\33"+
		"\u016f\n\33\f\33\16\33\u0172\13\33\3\33\5\33\u0175\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u017c\n\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0184\n"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u018f\n\34\3\34"+
		"\3\34\3\34\5\34\u0194\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u019c\n"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a5\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01b1\n\35\3\35\3\35\3\35\5\35"+
		"\u01b6\n\35\3\36\3\36\5\36\u01ba\n\36\3\36\3\36\3\37\3\37\3 \3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \5 \u01de\n \3 \3 \5 \u01e2\n \3 \3 \3 \5 \u01e7\n \3!\3!\5!"+
		"\u01eb\n!\3\"\3\"\5\"\u01ef\n\"\3\"\5\"\u01f2\n\"\3#\6#\u01f5\n#\r#\16"+
		"#\u01f6\3$\3$\3$\5$\u01fc\n$\3%\3%\3&\5&\u0201\n&\3&\5&\u0204\n&\3&\3"+
		"&\3\'\5\'\u0209\n\'\3\'\3\'\3\'\5\'\u020e\n\'\3(\3(\3)\3)\3)\3)\5)\u0216"+
		"\n)\3)\5)\u0219\n)\3*\5*\u021c\n*\3*\3*\3*\3*\3*\5*\u0223\n*\3+\5+\u0226"+
		"\n+\3+\5+\u0229\n+\3+\3+\3+\3+\3+\3,\3,\3,\7,\u0233\n,\f,\16,\u0236\13"+
		",\3-\3-\5-\u023a\n-\3.\3.\3.\3/\3/\3\60\3\60\3\60\7\60\u0244\n\60\f\60"+
		"\16\60\u0247\13\60\3\61\3\61\5\61\u024b\n\61\3\61\3\61\3\62\3\62\3\62"+
		"\7\62\u0252\n\62\f\62\16\62\u0255\13\62\3\63\3\63\3\63\3\63\5\63\u025b"+
		"\n\63\3\63\2\3\26\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\16\3\2vw\4\2jkxy\3\2_`\4\2_`|}\3\2"+
		"ac\4\2\34\34\64\64\3\2|}\4\2iilp\3\2\3\t\3\2\u0088\u0089\4\2\30\30))\n"+
		"\2\20\20\24\24!!**\60\61??EEUU\2\u0294\2g\3\2\2\2\4\u008b\3\2\2\2\6\u008d"+
		"\3\2\2\2\b\u0094\3\2\2\2\n\u0096\3\2\2\2\f\u009e\3\2\2\2\16\u00a6\3\2"+
		"\2\2\20\u00ae\3\2\2\2\22\u00c8\3\2\2\2\24\u00ca\3\2\2\2\26\u00df\3\2\2"+
		"\2\30\u00ee\3\2\2\2\32\u010a\3\2\2\2\34\u0110\3\2\2\2\36\u0112\3\2\2\2"+
		" \u0114\3\2\2\2\"\u0125\3\2\2\2$\u0127\3\2\2\2&\u0131\3\2\2\2(\u0133\3"+
		"\2\2\2*\u0138\3\2\2\2,\u014d\3\2\2\2.\u0150\3\2\2\2\60\u0165\3\2\2\2\62"+
		"\u0168\3\2\2\2\64\u016c\3\2\2\2\66\u0193\3\2\2\28\u01b5\3\2\2\2:\u01b7"+
		"\3\2\2\2<\u01bd\3\2\2\2>\u01e6\3\2\2\2@\u01ea\3\2\2\2B\u01f1\3\2\2\2D"+
		"\u01f4\3\2\2\2F\u01fb\3\2\2\2H\u01fd\3\2\2\2J\u0200\3\2\2\2L\u0208\3\2"+
		"\2\2N\u020f\3\2\2\2P\u0211\3\2\2\2R\u0222\3\2\2\2T\u0225\3\2\2\2V\u022f"+
		"\3\2\2\2X\u0237\3\2\2\2Z\u023b\3\2\2\2\\\u023e\3\2\2\2^\u0240\3\2\2\2"+
		"`\u0248\3\2\2\2b\u024e\3\2\2\2d\u0256\3\2\2\2fh\5D#\2gf\3\2\2\2gh\3\2"+
		"\2\2hi\3\2\2\2ij\7\2\2\3j\3\3\2\2\2k\u008c\5$\23\2l\u008c\7I\2\2m\u008c"+
		"\7\u0090\2\2no\7Y\2\2op\5\6\4\2pq\7Z\2\2q\u008c\3\2\2\2rs\7Y\2\2st\5\6"+
		"\4\2tu\b\3\1\2u\u008c\3\2\2\2vw\7Y\2\2wx\5\6\4\2xy\7Z\2\2yz\7Z\2\2z{\b"+
		"\3\1\2{\u008c\3\2\2\2|~\7\u0090\2\2}\177\7\u0090\2\2~}\3\2\2\2\177\u0080"+
		"\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u008c\b\3\1\2\u0083\u0085\5$\23\2\u0084\u0086\5$\23\2\u0085\u0084\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088"+
		"\u0089\3\2\2\2\u0089\u008a\b\3\1\2\u008a\u008c\3\2\2\2\u008bk\3\2\2\2"+
		"\u008bl\3\2\2\2\u008bm\3\2\2\2\u008bn\3\2\2\2\u008br\3\2\2\2\u008bv\3"+
		"\2\2\2\u008b|\3\2\2\2\u008b\u0083\3\2\2\2\u008c\5\3\2\2\2\u008d\u008e"+
		"\5\b\5\2\u008e\7\3\2\2\2\u008f\u0095\5\n\6\2\u0090\u0091\5\n\6\2\u0091"+
		"\u0092\5 \21\2\u0092\u0093\5\\/\2\u0093\u0095\3\2\2\2\u0094\u008f\3\2"+
		"\2\2\u0094\u0090\3\2\2\2\u0095\t\3\2\2\2\u0096\u009b\5\f\7\2\u0097\u0098"+
		"\7{\2\2\u0098\u009a\5\f\7\2\u0099\u0097\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\13\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u00a3\5\16\b\2\u009f\u00a0\7z\2\2\u00a0\u00a2\5\16\b\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\r\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00ab\5\20\t\2\u00a7\u00a8"+
		"\t\2\2\2\u00a8\u00aa\5\20\t\2\u00a9\u00a7\3\2\2\2\u00aa\u00ad\3\2\2\2"+
		"\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\17\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\u00b3\5\22\n\2\u00af\u00b0\t\3\2\2\u00b0\u00b2\5\22\n\2"+
		"\u00b1\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4"+
		"\3\2\2\2\u00b4\21\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00bb\5\24\13\2\u00b7"+
		"\u00b8\t\4\2\2\u00b8\u00ba\5\24\13\2\u00b9\u00b7\3\2\2\2\u00ba\u00bd\3"+
		"\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00c9\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c3\5\24\13\2\u00bf\u00c0\t\5\2\2\u00c0\u00c2\5"+
		"\24\13\2\u00c1\u00bf\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3"+
		"\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\b\n"+
		"\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00b6\3\2\2\2\u00c8\u00be\3\2\2\2\u00c9"+
		"\23\3\2\2\2\u00ca\u00cf\5\26\f\2\u00cb\u00cc\t\6\2\2\u00cc\u00ce\5\26"+
		"\f\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\f\1"+
		"\2\u00d3\u00e0\5\32\16\2\u00d4\u00d5\7h\2\2\u00d5\u00e0\5\26\f\6\u00d6"+
		"\u00e0\5\30\r\2\u00d7\u00d9\5\"\22\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"\u00dd\5\26\f\4\u00dd\u00de\b\f\1\2\u00de\u00e0\3\2\2\2\u00df\u00d2\3"+
		"\2\2\2\u00df\u00d4\3\2\2\2\u00df\u00d6\3\2\2\2\u00df\u00d8\3\2\2\2\u00e0"+
		"\u00eb\3\2\2\2\u00e1\u00e3\f\3\2\2\u00e2\u00e4\5\"\22\2\u00e3\u00e2\3"+
		"\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\b\f\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00e1\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\27\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\t\7\2\2\u00ef\u00f0\5N(\2"+
		"\u00f0\u00f1\7[\2\2\u00f1\u00f2\5\34\17\2\u00f2\u00f3\7\\\2\2\u00f3\31"+
		"\3\2\2\2\u00f4\u010b\5\4\3\2\u00f5\u00f6\7\u0090\2\2\u00f6\u00f7\7[\2"+
		"\2\u00f7\u00f8\5\6\4\2\u00f8\u00f9\7\\\2\2\u00f9\u010b\3\2\2\2\u00fa\u00fb"+
		"\7\u0090\2\2\u00fb\u00fd\7Y\2\2\u00fc\u00fe\5\36\20\2\u00fd\u00fc\3\2"+
		"\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u010b\7Z\2\2\u0100"+
		"\u0101\7\u0090\2\2\u0101\u010b\t\b\2\2\u0102\u0103\5$\23\2\u0103\u0105"+
		"\7Y\2\2\u0104\u0106\5\36\20\2\u0105\u0104\3\2\2\2\u0105\u0106\3\2\2\2"+
		"\u0106\u0107\3\2\2\2\u0107\u0108\7Z\2\2\u0108\u0109\b\16\1\2\u0109\u010b"+
		"\3\2\2\2\u010a\u00f4\3\2\2\2\u010a\u00f5\3\2\2\2\u010a\u00fa\3\2\2\2\u010a"+
		"\u0100\3\2\2\2\u010a\u0102\3\2\2\2\u010b\33\3\2\2\2\u010c\u0111\5\n\6"+
		"\2\u010d\u010e\5\b\5\2\u010e\u010f\b\17\1\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010c\3\2\2\2\u0110\u010d\3\2\2\2\u0111\35\3\2\2\2\u0112\u0113\5^\60"+
		"\2\u0113\37\3\2\2\2\u0114\u0115\t\t\2\2\u0115!\3\2\2\2\u0116\u0126\5 "+
		"\21\2\u0117\u0126\7_\2\2\u0118\u0126\7`\2\2\u0119\u0126\7a\2\2\u011a\u0126"+
		"\7b\2\2\u011b\u0126\7c\2\2\u011c\u0126\7k\2\2\u011d\u0126\7j\2\2\u011e"+
		"\u0126\7y\2\2\u011f\u0126\7v\2\2\u0120\u0126\7w\2\2\u0121\u0126\7x\2\2"+
		"\u0122\u0126\7y\2\2\u0123\u0126\7z\2\2\u0124\u0126\7{\2\2\u0125\u0116"+
		"\3\2\2\2\u0125\u0117\3\2\2\2\u0125\u0118\3\2\2\2\u0125\u0119\3\2\2\2\u0125"+
		"\u011a\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u011c\3\2\2\2\u0125\u011d\3\2"+
		"\2\2\u0125\u011e\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u0126#\3\2\2\2\u0127\u0128\t\n\2\2\u0128%\3\2\2\2\u0129\u0132\5."+
		"\30\2\u012a\u0132\5\60\31\2\u012b\u0132\5\64\33\2\u012c\u0132\5> \2\u012d"+
		"\u0132\5,\27\2\u012e\u0132\5(\25\2\u012f\u0132\5*\26\2\u0130\u0132\5J"+
		"&\2\u0131\u0129\3\2\2\2\u0131\u012a\3\2\2\2\u0131\u012b\3\2\2\2\u0131"+
		"\u012c\3\2\2\2\u0131\u012d\3\2\2\2\u0131\u012e\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0130\3\2\2\2\u0132\'\3\2\2\2\u0133\u0134\7\u008c\2\2\u0134"+
		"\u0135\7Y\2\2\u0135\u0136\5\34\17\2\u0136\u0137\7Z\2\2\u0137)\3\2\2\2"+
		"\u0138\u0139\7\u008b\2\2\u0139\u013a\7Y\2\2\u013a\u013b\7\6\2\2\u013b"+
		"\u013c\7~\2\2\u013c\u013d\7\u0090\2\2\u013d\u013e\7Z\2\2\u013e+\3\2\2"+
		"\2\u013f\u0146\7\21\2\2\u0140\u0146\7\33\2\2\u0141\u0143\7>\2\2\u0142"+
		"\u0144\5\34\17\2\u0143\u0142\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0146\3"+
		"\2\2\2\u0145\u013f\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0146"+
		"\u0147\3\2\2\2\u0147\u014e\7\u0084\2\2\u0148\u0149\7>\2\2\u0149\u014a"+
		"\5N(\2\u014a\u014b\7\u0084\2\2\u014b\u014c\b\27\1\2\u014c\u014e\3\2\2"+
		"\2\u014d\u0145\3\2\2\2\u014d\u0148\3\2\2\2\u014e-\3\2\2\2\u014f\u0151"+
		"\5\6\4\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\7\u0084\2\2\u0153/\3\2\2\2\u0154\u0156\7]\2\2\u0155\u0157\5\62"+
		"\32\2\u0156\u0155\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158"+
		"\u0166\7^\2\2\u0159\u015b\7]\2\2\u015a\u015c\5\62\32\2\u015b\u015a\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u0166\b\31\1\2\u015e"+
		"\u0160\7]\2\2\u015f\u0161\5\62\32\2\u0160\u015f\3\2\2\2\u0160\u0161\3"+
		"\2\2\2\u0161\u0162\3\2\2\2\u0162\u0163\7^\2\2\u0163\u0164\7^\2\2\u0164"+
		"\u0166\b\31\1\2\u0165\u0154\3\2\2\2\u0165\u0159\3\2\2\2\u0165\u015e\3"+
		"\2\2\2\u0166\61\3\2\2\2\u0167\u0169\5&\24\2\u0168\u0167\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\63\3\2\2"+
		"\2\u016c\u0170\5\66\34\2\u016d\u016f\58\35\2\u016e\u016d\3\2\2\2\u016f"+
		"\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2"+
		"\2\2\u0172\u0170\3\2\2\2\u0173\u0175\5:\36\2\u0174\u0173\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\65\3\2\2\2\u0176\u0177\7.\2\2\u0177\u0178\7Y\2\2"+
		"\u0178\u0179\5<\37\2\u0179\u017b\7Z\2\2\u017a\u017c\7\u008d\2\2\u017b"+
		"\u017a\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017e\5\60"+
		"\31\2\u017e\u0194\3\2\2\2\u017f\u0180\7.\2\2\u0180\u0181\7Y\2\2\u0181"+
		"\u0183\5<\37\2\u0182\u0184\7\u008d\2\2\u0183\u0182\3\2\2\2\u0183\u0184"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\5\60\31\2\u0186\u0187\b\34\1"+
		"\2\u0187\u0194\3\2\2\2\u0188\u0189\7.\2\2\u0189\u018a\7Y\2\2\u018a\u018b"+
		"\5<\37\2\u018b\u018c\7Z\2\2\u018c\u018e\7Z\2\2\u018d\u018f\7\u008d\2\2"+
		"\u018e\u018d\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191"+
		"\5\60\31\2\u0191\u0192\b\34\1\2\u0192\u0194\3\2\2\2\u0193\u0176\3\2\2"+
		"\2\u0193\u017f\3\2\2\2\u0193\u0188\3\2\2\2\u0194\67\3\2\2\2\u0195\u0196"+
		"\7#\2\2\u0196\u0197\7.\2\2\u0197\u0198\7Y\2\2\u0198\u0199\5<\37\2\u0199"+
		"\u019b\7Z\2\2\u019a\u019c\7\u008d\2\2\u019b\u019a\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019e\5\60\31\2\u019e\u01b6\3\2\2\2"+
		"\u019f\u01a0\7#\2\2\u01a0\u01a1\7.\2\2\u01a1\u01a2\7Y\2\2\u01a2\u01a4"+
		"\5<\37\2\u01a3\u01a5\7\u008d\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2"+
		"\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\5\60\31\2\u01a7\u01a8\b\35\1\2\u01a8"+
		"\u01b6\3\2\2\2\u01a9\u01aa\7#\2\2\u01aa\u01ab\7.\2\2\u01ab\u01ac\7Y\2"+
		"\2\u01ac\u01ad\5<\37\2\u01ad\u01ae\7Z\2\2\u01ae\u01b0\7Z\2\2\u01af\u01b1"+
		"\7\u008d\2\2\u01b0\u01af\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2\3\2\2"+
		"\2\u01b2\u01b3\5\60\31\2\u01b3\u01b4\b\35\1\2\u01b4\u01b6\3\2\2\2\u01b5"+
		"\u0195\3\2\2\2\u01b5\u019f\3\2\2\2\u01b5\u01a9\3\2\2\2\u01b69\3\2\2\2"+
		"\u01b7\u01b9\7#\2\2\u01b8\u01ba\7\u008d\2\2\u01b9\u01b8\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\5\60\31\2\u01bc;\3\2\2"+
		"\2\u01bd\u01be\5\34\17\2\u01be=\3\2\2\2\u01bf\u01c0\7+\2\2\u01c0\u01c1"+
		"\5B\"\2\u01c1\u01c2\t\13\2\2\u01c2\u01c3\7\u008a\2\2\u01c3\u01c4\5\34"+
		"\17\2\u01c4\u01e7\3\2\2\2\u01c5\u01c6\7X\2\2\u01c6\u01c7\5B\"\2\u01c7"+
		"\u01c8\t\13\2\2\u01c8\u01c9\7\u008a\2\2\u01c9\u01ca\5\34\17\2\u01ca\u01e7"+
		"\3\2\2\2\u01cb\u01cc\7X\2\2\u01cc\u01cd\7Y\2\2\u01cd\u01ce\5<\37\2\u01ce"+
		"\u01cf\7Z\2\2\u01cf\u01d0\5&\24\2\u01d0\u01e7\3\2\2\2\u01d1\u01d2\7 \2"+
		"\2\u01d2\u01d3\5&\24\2\u01d3\u01d4\7X\2\2\u01d4\u01d5\7Y\2\2\u01d5\u01d6"+
		"\5<\37\2\u01d6\u01d7\7Z\2\2\u01d7\u01d8\7\u0084\2\2\u01d8\u01e7\3\2\2"+
		"\2\u01d9\u01da\7+\2\2\u01da\u01db\7Y\2\2\u01db\u01dd\5@!\2\u01dc\u01de"+
		"\5<\37\2\u01dd\u01dc\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\3\2\2\2\u01df"+
		"\u01e1\7\u0084\2\2\u01e0\u01e2\5\6\4\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01e4\7Z\2\2\u01e4\u01e5\5&\24\2\u01e5"+
		"\u01e7\3\2\2\2\u01e6\u01bf\3\2\2\2\u01e6\u01c5\3\2\2\2\u01e6\u01cb\3\2"+
		"\2\2\u01e6\u01d1\3\2\2\2\u01e6\u01d9\3\2\2\2\u01e7?\3\2\2\2\u01e8\u01eb"+
		"\5.\30\2\u01e9\u01eb\5J&\2\u01ea\u01e8\3\2\2\2\u01ea\u01e9\3\2\2\2\u01eb"+
		"A\3\2\2\2\u01ec\u01f2\5\6\4\2\u01ed\u01ef\5L\'\2\u01ee\u01ed\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f2\5V,\2\u01f1\u01ec\3\2\2"+
		"\2\u01f1\u01ee\3\2\2\2\u01f2C\3\2\2\2\u01f3\u01f5\5F$\2\u01f4\u01f3\3"+
		"\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7"+
		"E\3\2\2\2\u01f8\u01fc\5J&\2\u01f9\u01fc\5R*\2\u01fa\u01fc\5H%\2\u01fb"+
		"\u01f8\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb\u01fa\3\2\2\2\u01fcG\3\2\2\2"+
		"\u01fd\u01fe\7\u0084\2\2\u01feI\3\2\2\2\u01ff\u0201\5L\'\2\u0200\u01ff"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0204\5V,\2\u0203"+
		"\u0202\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7\u0084"+
		"\2\2\u0206K\3\2\2\2\u0207\u0209\t\f\2\2\u0208\u0207\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020d\5N(\2\u020b\u020c\7[\2\2\u020c"+
		"\u020e\7\\\2\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020eM\3\2\2\2"+
		"\u020f\u0210\t\r\2\2\u0210O\3\2\2\2\u0211\u0218\7\u0090\2\2\u0212\u0219"+
		"\5`\61\2\u0213\u0215\7[\2\2\u0214\u0216\5\34\17\2\u0215\u0214\3\2\2\2"+
		"\u0215\u0216\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\7\\\2\2\u0218\u0212"+
		"\3\2\2\2\u0218\u0213\3\2\2\2\u0218\u0219\3\2\2\2\u0219Q\3\2\2\2\u021a"+
		"\u021c\7\u008e\2\2\u021b\u021a\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d"+
		"\3\2\2\2\u021d\u021e\5L\'\2\u021e\u021f\5P)\2\u021f\u0220\5\60\31\2\u0220"+
		"\u0223\3\2\2\2\u0221\u0223\5T+\2\u0222\u021b\3\2\2\2\u0222\u0221\3\2\2"+
		"\2\u0223S\3\2\2\2\u0224\u0226\7\u008e\2\2\u0225\u0224\3\2\2\2\u0225\u0226"+
		"\3\2\2\2\u0226\u0228\3\2\2\2\u0227\u0229\5L\'\2\u0228\u0227\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\7\u008f\2\2\u022b\u022c"+
		"\7Y\2\2\u022c\u022d\7Z\2\2\u022d\u022e\5\60\31\2\u022eU\3\2\2\2\u022f"+
		"\u0234\5X-\2\u0230\u0231\7~\2\2\u0231\u0233\5X-\2\u0232\u0230\3\2\2\2"+
		"\u0233\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235W\3"+
		"\2\2\2\u0236\u0234\3\2\2\2\u0237\u0239\5P)\2\u0238\u023a\5Z.\2\u0239\u0238"+
		"\3\2\2\2\u0239\u023a\3\2\2\2\u023aY\3\2\2\2\u023b\u023c\7i\2\2\u023c\u023d"+
		"\5\\/\2\u023d[\3\2\2\2\u023e\u023f\5\b\5\2\u023f]\3\2\2\2\u0240\u0245"+
		"\5\\/\2\u0241\u0242\7~\2\2\u0242\u0244\5\\/\2\u0243\u0241\3\2\2\2\u0244"+
		"\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246_\3\2\2\2"+
		"\u0247\u0245\3\2\2\2\u0248\u024a\7Y\2\2\u0249\u024b\5b\62\2\u024a\u0249"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024d\7Z\2\2\u024d"+
		"a\3\2\2\2\u024e\u0253\5d\63\2\u024f\u0250\7~\2\2\u0250\u0252\5d\63\2\u0251"+
		"\u024f\3\2\2\2\u0252\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2"+
		"\2\2\u0254c\3\2\2\2\u0255\u0253\3\2\2\2\u0256\u0257\5L\'\2\u0257\u025a"+
		"\5P)\2\u0258\u0259\7i\2\2\u0259\u025b\5\\/\2\u025a\u0258\3\2\2\2\u025a"+
		"\u025b\3\2\2\2\u025be\3\2\2\2Eg\u0080\u0087\u008b\u0094\u009b\u00a3\u00ab"+
		"\u00b3\u00bb\u00c3\u00c8\u00cf\u00da\u00df\u00e5\u00eb\u00fd\u0105\u010a"+
		"\u0110\u0125\u0131\u0143\u0145\u014d\u0150\u0156\u015b\u0160\u0165\u016a"+
		"\u0170\u0174\u017b\u0183\u018e\u0193\u019b\u01a4\u01b0\u01b5\u01b9\u01dd"+
		"\u01e1\u01e6\u01ea\u01ee\u01f1\u01f6\u01fb\u0200\u0203\u0208\u020d\u0215"+
		"\u0218\u021b\u0222\u0225\u0228\u0234\u0239\u0245\u024a\u0253\u025a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}