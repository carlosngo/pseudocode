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
	public static final int
		RULE_init = 0, RULE_primaryExpression = 1, RULE_expression = 2, RULE_assignmentExpression = 3, 
		RULE_logicalOrExpression = 4, RULE_logicalAndExpression = 5, RULE_equalityExpression = 6, 
		RULE_relationalExpression = 7, RULE_additiveExpression = 8, RULE_multiplicativeExpression = 9, 
		RULE_unaryExpression = 10, RULE_createExpression = 11, RULE_postfixExpression = 12, 
		RULE_constantExpression = 13, RULE_expressionList = 14, RULE_assignmentOperator = 15, 
		RULE_binaryOperator = 16, RULE_literal = 17, RULE_statement = 18, RULE_printStatement = 19, 
		RULE_scanStatement = 20, RULE_jumpStatement = 21, RULE_badReturn = 22, 
		RULE_expressionStatement = 23, RULE_compoundStatement = 24, RULE_statementSeq = 25, 
		RULE_selectionStatement = 26, RULE_ifStatement = 27, RULE_elseIfStatement = 28, 
		RULE_elseStatement = 29, RULE_condition = 30, RULE_comparisonOperator = 31, 
		RULE_iterationStatement = 32, RULE_forInitStatement = 33, RULE_iterationInit = 34, 
		RULE_badIteration = 35, RULE_declaration = 36, RULE_emptyDeclaration = 37, 
		RULE_simpleDeclaration = 38, RULE_declSpecifierSeq = 39, RULE_badConst = 40, 
		RULE_typeSpecifier = 41, RULE_declarator = 42, RULE_functionDefinition = 43, 
		RULE_mainFunction = 44, RULE_initDeclaratorList = 45, RULE_initDeclarator = 46, 
		RULE_initializer = 47, RULE_initializerClause = 48, RULE_initializerList = 49, 
		RULE_parametersAndQualifiers = 50, RULE_parameterDeclarationClause = 51, 
		RULE_parameterDeclaration = 52;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "primaryExpression", "expression", "assignmentExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"createExpression", "postfixExpression", "constantExpression", "expressionList", 
			"assignmentOperator", "binaryOperator", "literal", "statement", "printStatement", 
			"scanStatement", "jumpStatement", "badReturn", "expressionStatement", 
			"compoundStatement", "statementSeq", "selectionStatement", "ifStatement", 
			"elseIfStatement", "elseStatement", "condition", "comparisonOperator", 
			"iterationStatement", "forInitStatement", "iterationInit", "badIteration", 
			"declaration", "emptyDeclaration", "simpleDeclaration", "declSpecifierSeq", 
			"badConst", "typeSpecifier", "declarator", "functionDefinition", "mainFunction", 
			"initDeclaratorList", "initDeclarator", "initializer", "initializerClause", 
			"initializerList", "parametersAndQualifiers", "parameterDeclarationClause", 
			"parameterDeclaration"
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
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Function - 64)) | (1L << (Main - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(106);
					declaration();
					}
					break;
				case 2:
					{
					setState(107);
					statement();
					}
					break;
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
		public TerminalNode Colon() { return getToken(PseudocodeParser.Colon, 0); }
		public TerminalNode IntegerLiteral() { return getToken(PseudocodeParser.IntegerLiteral, 0); }
		public TerminalNode Not() { return getToken(PseudocodeParser.Not, 0); }
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(This);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				match(LeftParen);
				setState(119);
				expression();
				setState(120);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				match(LeftParen);
				setState(123);
				expression();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(126);
				match(LeftParen);
				setState(127);
				expression();
				setState(128);
				match(RightParen);
				setState(129);
				match(RightParen);
				 notifyErrorListeners("too many closing parentheses"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(134);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(132);
					match(Identifier);
					}
					break;
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case BadFloatingLiteral:
				case StringLiteral:
				case BadStringLiteral:
				case BooleanLiteral:
					{
					setState(133);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(138); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(138);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Identifier:
							{
							setState(136);
							match(Identifier);
							}
							break;
						case IntegerLiteral:
						case CharacterLiteral:
						case FloatingLiteral:
						case BadFloatingLiteral:
						case StringLiteral:
						case BadStringLiteral:
						case BooleanLiteral:
							{
							setState(137);
							literal();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(140); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("expected double quotes or operators"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(143);
				match(Identifier);
				setState(144);
				match(Identifier);
				setState(145);
				match(Colon);
				setState(146);
				match(IntegerLiteral);
				setState(147);
				match(Not);
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
			setState(151);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				logicalOrExpression();
				setState(155);
				assignmentOperator();
				setState(156);
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
			setState(160);
			logicalAndExpression();
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(161);
					match(OrOr);
					setState(162);
					logicalAndExpression();
					}
					} 
				}
				setState(167);
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
			setState(168);
			equalityExpression();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					match(AndAnd);
					setState(170);
					equalityExpression();
					}
					} 
				}
				setState(175);
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
			setState(176);
			relationalExpression();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(178);
					relationalExpression();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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
			setState(184);
			additiveExpression();
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					_la = _input.LA(1);
					if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (Less - 53)) | (1L << (Greater - 53)) | (1L << (LessEqual - 53)) | (1L << (GreaterEqual - 53)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(186);
					additiveExpression();
					}
					} 
				}
				setState(191);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				multiplicativeExpression();
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(193);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(194);
						multiplicativeExpression();
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				multiplicativeExpression();
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(201);
						_la = _input.LA(1);
						if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (Plus - 43)) | (1L << (Minus - 43)) | (1L << (PlusPlus - 43)) | (1L << (MinusMinus - 43)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						multiplicativeExpression();
						}
						} 
					}
					setState(207);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
			setState(212);
			unaryExpression(0);
			setState(217);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(213);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(214);
					unaryExpression(0);
					}
					} 
				}
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		public BinaryOperatorContext binaryOperator;
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
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case BadFloatingLiteral:
			case StringLiteral:
			case BadStringLiteral:
			case BooleanLiteral:
			case This:
			case LeftParen:
			case Identifier:
				{
				setState(221);
				postfixExpression();
				}
				break;
			case Not:
				{
				setState(222);
				match(Not);
				setState(223);
				unaryExpression(4);
				}
				break;
			case Create:
			case New:
				{
				setState(224);
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
			case Comma:
				{
				setState(225);
				((UnaryExpressionContext)_localctx).binaryOperator = binaryOperator();
				setState(226);
				unaryExpression(2);
				 notifyErrorListeners("redundant binary operator: '" + (((UnaryExpressionContext)_localctx).binaryOperator!=null?_input.getText(((UnaryExpressionContext)_localctx).binaryOperator.start,((UnaryExpressionContext)_localctx).binaryOperator.stop):null) + "'"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(237);
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
					setState(231);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(232);
					((UnaryExpressionContext)_localctx).binaryOperator = binaryOperator();
					 notifyErrorListeners("redundant binary operator: '" + (((UnaryExpressionContext)_localctx).binaryOperator!=null?_input.getText(((UnaryExpressionContext)_localctx).binaryOperator.start,((UnaryExpressionContext)_localctx).binaryOperator.stop):null) + "'"); 
					}
					} 
				}
				setState(239);
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
			setState(240);
			_la = _input.LA(1);
			if ( !(_la==Create || _la==New) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(241);
			typeSpecifier();
			setState(242);
			match(LeftBracket);
			setState(243);
			constantExpression();
			setState(244);
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public List<ExpressionListContext> expressionList() {
			return getRuleContexts(ExpressionListContext.class);
		}
		public ExpressionListContext expressionList(int i) {
			return getRuleContext(ExpressionListContext.class,i);
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
			int _alt;
			setState(296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(Identifier);
				setState(248);
				match(LeftBracket);
				setState(249);
				expression();
				setState(250);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				match(Identifier);
				setState(253);
				match(LeftParen);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(254);
					expressionList();
					}
				}

				setState(257);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(258);
				match(Identifier);
				setState(259);
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
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(260);
					match(Identifier);
					}
					break;
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case BadFloatingLiteral:
				case StringLiteral:
				case BadStringLiteral:
				case BooleanLiteral:
					{
					setState(261);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(269); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(264);
						match(LeftParen);
						setState(266);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(265);
							expressionList();
							}
						}

						setState(268);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(271); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("redundant parentheses"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				match(Identifier);
				setState(275);
				match(LeftParen);
				setState(276);
				match(LeftParen);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(277);
					expressionList();
					}
				}

				setState(280);
				match(RightParen);
				 notifyErrorListeners("redundant opening parenthesis"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				match(Identifier);
				setState(283);
				match(LeftParen);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(284);
					expressionList();
					}
				}

				setState(287);
				match(RightParen);
				setState(288);
				match(RightParen);
				 notifyErrorListeners("redundant closing parenthesis"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(290);
				match(Identifier);
				setState(291);
				match(LeftParen);
				setState(293);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(292);
					expressionList();
					}
					break;
				}
				 notifyErrorListeners("expecting closing parenthesis"); 
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
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			logicalOrExpression();
			}
		}
		catch (RecognitionException re) {
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
			setState(300);
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
			setState(302);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Assign) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign))) != 0)) ) {
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
		public TerminalNode Comma() { return getToken(PseudocodeParser.Comma, 0); }
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				assignmentOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(Plus);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				match(Minus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(307);
				match(Star);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(308);
				match(Div);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(309);
				match(Mod);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(310);
				match(Greater);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
				match(Less);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(312);
				match(GreaterEqual);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(313);
				match(Equal);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(314);
				match(NotEqual);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(315);
				match(LessEqual);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(316);
				match(GreaterEqual);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(317);
				match(AndAnd);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(318);
				match(OrOr);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(319);
				match(Comma);
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
		public TerminalNode BadStringLiteral() { return getToken(PseudocodeParser.BadStringLiteral, 0); }
		public TerminalNode BadFloatingLiteral() { return getToken(PseudocodeParser.BadFloatingLiteral, 0); }
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
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(IntegerLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(323);
				match(CharacterLiteral);
				}
				break;
			case FloatingLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(324);
				match(FloatingLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(325);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(326);
				match(BooleanLiteral);
				}
				break;
			case BadStringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(327);
				match(BadStringLiteral);
				 notifyErrorListeners("expected closing double quotes"); 
				}
				break;
			case BadFloatingLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(329);
				match(BadFloatingLiteral);
				 notifyErrorListeners("expected floating suffix"); 
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
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				jumpStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(339);
				scanStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(340);
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
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
		int _la;
		try {
			int _alt;
			setState(383);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(Print);
				setState(344);
				match(LeftParen);
				setState(345);
				constantExpression();
				setState(346);
				match(RightParen);
				setState(347);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(Print);
				setState(350);
				match(LeftParen);
				setState(352); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(351);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(354); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(356);
				constantExpression();
				setState(357);
				match(RightParen);
				setState(358);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				match(Print);
				setState(362);
				match(LeftParen);
				setState(363);
				constantExpression();
				setState(364);
				match(RightParen);
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(365);
					match(RightParen);
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(370);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(373);
				match(Print);
				setState(375); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(374);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(377); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(379);
				constantExpression();
				setState(380);
				match(Semi);
				 notifyErrorListeners("expected closing parenthesis"); 
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

	public static class ScanStatementContext extends ParserRuleContext {
		public TerminalNode Scan() { return getToken(PseudocodeParser.Scan, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
		public TerminalNode StringLiteral() { return getToken(PseudocodeParser.StringLiteral, 0); }
		public TerminalNode Comma() { return getToken(PseudocodeParser.Comma, 0); }
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
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
		int _la;
		try {
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(Scan);
				setState(386);
				match(LeftParen);
				setState(387);
				match(StringLiteral);
				setState(388);
				match(Comma);
				setState(389);
				match(Identifier);
				setState(390);
				match(RightParen);
				setState(391);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(Scan);
				setState(393);
				match(LeftParen);
				setState(395); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(394);
					match(LeftParen);
					}
					}
					setState(397); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(399);
				match(StringLiteral);
				setState(400);
				match(Comma);
				setState(401);
				match(Identifier);
				setState(402);
				match(RightParen);
				setState(403);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(405);
				match(Scan);
				setState(406);
				match(LeftParen);
				setState(407);
				match(StringLiteral);
				setState(408);
				match(Comma);
				setState(409);
				match(Identifier);
				setState(410);
				match(RightParen);
				setState(412); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(411);
					match(RightParen);
					}
					}
					setState(414); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(416);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(418);
				match(Scan);
				setState(419);
				match(LeftParen);
				setState(420);
				match(StringLiteral);
				setState(421);
				match(Comma);
				setState(422);
				match(Identifier);
				setState(423);
				match(Semi);
				 notifyErrorListeners("expected closing parenthesis"); 
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

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public TerminalNode Break() { return getToken(PseudocodeParser.Break, 0); }
		public TerminalNode Continue() { return getToken(PseudocodeParser.Continue, 0); }
		public TerminalNode Return() { return getToken(PseudocodeParser.Return, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public BadReturnContext badReturn() {
			return getRuleContext(BadReturnContext.class,0);
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
			setState(440);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(427);
					match(Break);
					}
					break;
				case Continue:
					{
					setState(428);
					match(Continue);
					}
					break;
				case Return:
					{
					setState(429);
					match(Return);
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
						{
						setState(430);
						constantExpression();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(435);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				match(Return);
				setState(437);
				badReturn();
				setState(438);
				match(Semi);
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

	public static class BadReturnContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public BadReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterBadReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitBadReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitBadReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BadReturnContext badReturn() throws RecognitionException {
		BadReturnContext _localctx = new BadReturnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_badReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			typeSpecifier();
			 notifyErrorListeners("expected expression as return value"); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 46, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(445);
				expression();
				}
			}

			setState(448);
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
		public List<TerminalNode> LeftBrace() { return getTokens(PseudocodeParser.LeftBrace); }
		public TerminalNode LeftBrace(int i) {
			return getToken(PseudocodeParser.LeftBrace, i);
		}
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
		enterRule(_localctx, 48, RULE_compoundStatement);
		int _la;
		try {
			int _alt;
			setState(486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				match(LeftBrace);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(451);
					statementSeq();
					}
				}

				setState(454);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(456); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(455);
						match(LeftBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(458); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(461);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(460);
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
				setState(464);
				match(LeftBrace);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(465);
					statementSeq();
					}
				}

				setState(468);
				match(RightBrace);
				setState(470); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(469);
						match(RightBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(472); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("too many closing curly braces"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(475);
				match(LeftBrace);
				setState(477); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(476);
						match(LeftBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(479); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(481);
					statementSeq();
					}
				}

				setState(484);
				match(RightBrace);
				 notifyErrorListeners("redundant opening curly brace"); 
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
		enterRule(_localctx, 50, RULE_statementSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(488);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(491); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 52, RULE_selectionStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(493);
			ifStatement();
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(494);
					elseIfStatement();
					}
					} 
				}
				setState(499);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(501);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(500);
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
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
		enterRule(_localctx, 54, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(503);
				match(If);
				setState(504);
				match(LeftParen);
				setState(505);
				condition();
				setState(506);
				match(RightParen);
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(507);
					match(Then);
					}
				}

				setState(510);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				match(If);
				setState(514); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(513);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(516); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(518);
				condition();
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(519);
					match(Then);
					}
				}

				setState(522);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(If);
				setState(526);
				match(LeftParen);
				setState(527);
				condition();
				setState(528);
				match(RightParen);
				setState(530); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(529);
					match(RightParen);
					}
					}
					setState(532); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(535);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(534);
					match(Then);
					}
				}

				setState(537);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				match(If);
				setState(541);
				match(LeftParen);
				setState(543); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(542);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(545); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(547);
				condition();
				setState(548);
				match(RightParen);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(549);
					match(Then);
					}
				}

				setState(552);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
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
		enterRule(_localctx, 56, RULE_elseIfStatement);
		int _la;
		try {
			int _alt;
			setState(613);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				match(Else);
				setState(558);
				match(If);
				setState(559);
				match(LeftParen);
				setState(560);
				condition();
				setState(561);
				match(RightParen);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(562);
					match(Then);
					}
				}

				setState(565);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(Else);
				setState(568);
				match(If);
				setState(570); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(569);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(572); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(574);
				condition();
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(575);
					match(Then);
					}
				}

				setState(578);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				match(Else);
				setState(582);
				match(If);
				setState(583);
				match(LeftParen);
				setState(584);
				condition();
				setState(585);
				match(RightParen);
				setState(587); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(586);
					match(RightParen);
					}
					}
					setState(589); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(591);
					match(Then);
					}
				}

				setState(594);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(597);
				match(Else);
				setState(598);
				match(If);
				setState(599);
				match(LeftParen);
				setState(601); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(600);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(603); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(605);
				condition();
				setState(606);
				match(RightParen);
				setState(608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(607);
					match(Then);
					}
				}

				setState(610);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
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
		enterRule(_localctx, 58, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			match(Else);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Then) {
				{
				setState(616);
				match(Then);
				}
			}

			setState(619);
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
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<TerminalNode> Identifier() { return getTokens(PseudocodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudocodeParser.Identifier, i);
		}
		public List<TerminalNode> BooleanLiteral() { return getTokens(PseudocodeParser.BooleanLiteral); }
		public TerminalNode BooleanLiteral(int i) {
			return getToken(PseudocodeParser.BooleanLiteral, i);
		}
		public List<TerminalNode> OrOr() { return getTokens(PseudocodeParser.OrOr); }
		public TerminalNode OrOr(int i) {
			return getToken(PseudocodeParser.OrOr, i);
		}
		public List<TerminalNode> AndAnd() { return getTokens(PseudocodeParser.AndAnd); }
		public TerminalNode AndAnd(int i) {
			return getToken(PseudocodeParser.AndAnd, i);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
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
		enterRule(_localctx, 60, RULE_condition);
		int _la;
		try {
			setState(640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(621);
				logicalOrExpression();
				setState(622);
				comparisonOperator();
				setState(623);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				_la = _input.LA(1);
				if ( !(_la==BooleanLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BooleanLiteral || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (AndAnd - 67)) | (1L << (OrOr - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					{
					setState(629);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OrOr:
						{
						setState(626);
						match(OrOr);
						}
						break;
					case BooleanLiteral:
					case Identifier:
						{
						}
						break;
					case AndAnd:
						{
						setState(628);
						match(AndAnd);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(631);
					_la = _input.LA(1);
					if ( !(_la==BooleanLiteral || _la==Identifier) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(636);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(637);
				assignmentExpression();
				notifyErrorListeners("expected comparison operator"); 
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

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode Equal() { return getToken(PseudocodeParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(PseudocodeParser.NotEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(PseudocodeParser.GreaterEqual, 0); }
		public TerminalNode LessEqual() { return getToken(PseudocodeParser.LessEqual, 0); }
		public TerminalNode Greater() { return getToken(PseudocodeParser.Greater, 0); }
		public TerminalNode Less() { return getToken(PseudocodeParser.Less, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(642);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (Less - 53)) | (1L << (Greater - 53)) | (1L << (Equal - 53)) | (1L << (NotEqual - 53)) | (1L << (LessEqual - 53)) | (1L << (GreaterEqual - 53)))) != 0)) ) {
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PseudocodeParser.For, 0); }
		public IterationInitContext iterationInit() {
			return getRuleContext(IterationInitContext.class,0);
		}
		public TerminalNode To() { return getToken(PseudocodeParser.To, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Up() { return getToken(PseudocodeParser.Up, 0); }
		public TerminalNode Down() { return getToken(PseudocodeParser.Down, 0); }
		public TerminalNode While() { return getToken(PseudocodeParser.While, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public TerminalNode Do() { return getToken(PseudocodeParser.Do, 0); }
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public ForInitStatementContext forInitStatement() {
			return getRuleContext(ForInitStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BadIterationContext badIteration() {
			return getRuleContext(BadIterationContext.class,0);
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
		enterRule(_localctx, 64, RULE_iterationStatement);
		int _la;
		try {
			int _alt;
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(644);
				match(For);
				setState(645);
				iterationInit();
				setState(646);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(647);
				match(To);
				setState(648);
				constantExpression();
				setState(649);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(651);
				match(While);
				setState(652);
				iterationInit();
				setState(653);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(654);
				match(To);
				setState(655);
				constantExpression();
				setState(656);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(658);
				match(While);
				setState(659);
				match(LeftParen);
				setState(660);
				condition();
				setState(661);
				match(RightParen);
				setState(662);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(664);
				match(Do);
				setState(665);
				compoundStatement();
				setState(666);
				match(While);
				setState(667);
				match(LeftParen);
				setState(668);
				condition();
				setState(669);
				match(RightParen);
				setState(670);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(672);
				match(For);
				setState(673);
				match(LeftParen);
				{
				setState(674);
				forInitStatement();
				setState(676);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(675);
					condition();
					}
				}

				setState(678);
				match(Semi);
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(679);
					expression();
					}
				}

				}
				setState(682);
				match(RightParen);
				setState(683);
				compoundStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(685);
				match(While);
				setState(686);
				iterationInit();
				setState(687);
				badIteration();
				setState(688);
				constantExpression();
				setState(689);
				compoundStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(691);
				match(While);
				setState(693); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(692);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(695); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(697);
				condition();
				setState(698);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(701);
				match(While);
				setState(702);
				match(LeftParen);
				setState(704); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(703);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(706); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,73,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(708);
				condition();
				setState(709);
				match(RightParen);
				setState(710);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(713);
				match(While);
				setState(714);
				match(LeftParen);
				setState(715);
				condition();
				setState(716);
				match(RightParen);
				setState(718); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(717);
					match(RightParen);
					}
					}
					setState(720); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(722);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(725);
				match(Do);
				setState(726);
				compoundStatement();
				setState(727);
				match(While);
				setState(729); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(728);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(731); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(733);
				condition();
				setState(734);
				match(Semi);
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(737);
				match(Do);
				setState(738);
				compoundStatement();
				setState(739);
				match(While);
				setState(740);
				match(LeftParen);
				setState(742); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(741);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(744); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(746);
				condition();
				setState(747);
				match(RightParen);
				setState(748);
				match(Semi);
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(751);
				match(Do);
				setState(752);
				compoundStatement();
				setState(753);
				match(While);
				setState(754);
				match(LeftParen);
				setState(755);
				condition();
				setState(756);
				match(RightParen);
				setState(758); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(757);
					match(RightParen);
					}
					}
					setState(760); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(762);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(765);
				match(For);
				setState(766);
				iterationInit();
				setState(767);
				badIteration();
				setState(768);
				constantExpression();
				setState(769);
				compoundStatement();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(771);
				match(For);
				setState(773); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(772);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(775); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(777);
				forInitStatement();
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(778);
					condition();
					}
				}

				setState(781);
				match(Semi);
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(782);
					expression();
					}
				}

				}
				setState(785);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(788);
				match(For);
				setState(789);
				match(LeftParen);
				setState(791); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(790);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(793); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(795);
				forInitStatement();
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(796);
					condition();
					}
				}

				setState(799);
				match(Semi);
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(800);
					expression();
					}
				}

				}
				setState(803);
				match(RightParen);
				setState(804);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(807);
				match(For);
				setState(808);
				match(LeftParen);
				{
				setState(809);
				forInitStatement();
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(810);
					condition();
					}
				}

				setState(813);
				match(Semi);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(814);
					expression();
					}
				}

				}
				setState(817);
				match(RightParen);
				setState(819); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(818);
					match(RightParen);
					}
					}
					setState(821); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(823);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
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
		enterRule(_localctx, 66, RULE_forInitStatement);
		try {
			setState(830);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(828);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(829);
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
		enterRule(_localctx, 68, RULE_iterationInit);
		try {
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(834);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(833);
					declSpecifierSeq();
					}
					break;
				}
				setState(836);
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

	public static class BadIterationContext extends ParserRuleContext {
		public TerminalNode Up() { return getToken(PseudocodeParser.Up, 0); }
		public TerminalNode Down() { return getToken(PseudocodeParser.Down, 0); }
		public TerminalNode To() { return getToken(PseudocodeParser.To, 0); }
		public TerminalNode StringLiteral() { return getToken(PseudocodeParser.StringLiteral, 0); }
		public BadIterationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badIteration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterBadIteration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitBadIteration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitBadIteration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BadIterationContext badIteration() throws RecognitionException {
		BadIterationContext _localctx = new BadIterationContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_badIteration);
		int _la;
		try {
			setState(844);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Up:
			case Down:
				enterOuterAlt(_localctx, 1);
				{
				setState(839);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case To:
				enterOuterAlt(_localctx, 2);
				{
				setState(840);
				match(To);
				 notifyErrorListeners("expected up/down to"); 
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(842);
				match(StringLiteral);
				 notifyErrorListeners("enclosed up to"); 
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
		enterRule(_localctx, 72, RULE_declaration);
		try {
			setState(849);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(846);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(847);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(848);
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
		enterRule(_localctx, 74, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
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
		enterRule(_localctx, 76, RULE_simpleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(853);
				declSpecifierSeq();
				}
				break;
			}
			setState(857);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0) || _la==Identifier) {
				{
				setState(856);
				initDeclaratorList();
				}
			}

			setState(859);
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
		public BadConstContext badConst() {
			return getRuleContext(BadConstContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_declSpecifierSeq);
		int _la;
		try {
			setState(877);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Bool:
			case Char:
			case Const:
			case Double:
			case Final:
			case Float:
			case Int:
			case Long:
			case Short:
			case String:
			case Void:
				enterOuterAlt(_localctx, 1);
				{
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Const || _la==Final) {
					{
					setState(861);
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

				setState(864);
				typeSpecifier();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(865);
					match(LeftBracket);
					setState(866);
					match(RightBracket);
					}
				}

				}
				break;
			case Badconst:
				enterOuterAlt(_localctx, 2);
				{
				setState(869);
				badConst();
				setState(870);
				typeSpecifier();
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftBracket) {
					{
					setState(871);
					match(LeftBracket);
					setState(872);
					match(RightBracket);
					}
				}

				 notifyErrorListeners("misspelled constant declaration, use 'constant'"); 
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

	public static class BadConstContext extends ParserRuleContext {
		public TerminalNode Badconst() { return getToken(PseudocodeParser.Badconst, 0); }
		public BadConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterBadConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitBadConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitBadConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BadConstContext badConst() throws RecognitionException {
		BadConstContext _localctx = new BadConstContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_badConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(Badconst);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 82, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(881);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) ) {
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
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
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
		enterRule(_localctx, 84, RULE_declarator);
		int _la;
		try {
			setState(896);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(883);
				match(Identifier);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(884);
					parametersAndQualifiers();
					}
				}

				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case BadFloatingLiteral:
			case StringLiteral:
			case BadStringLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(887);
				literal();
				setState(889);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(888);
					parametersAndQualifiers();
					}
				}

				 notifyErrorListeners("expected identifier as declarator"); 
				}
				break;
			case Bool:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case String:
			case Void:
				enterOuterAlt(_localctx, 3);
				{
				setState(893);
				typeSpecifier();
				 notifyErrorListeners("expected identifier, found data type"); 
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
		enterRule(_localctx, 86, RULE_functionDefinition);
		int _la;
		try {
			setState(906);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(899);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(898);
					match(Function);
					}
				}

				setState(901);
				declSpecifierSeq();
				setState(902);
				declarator();
				setState(903);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
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
		enterRule(_localctx, 88, RULE_mainFunction);
		int _la;
		try {
			setState(992);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(908);
					match(Function);
					}
				}

				setState(912);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(911);
					declSpecifierSeq();
					}
				}

				setState(914);
				match(Main);
				setState(915);
				match(LeftParen);
				setState(916);
				match(RightParen);
				setState(917);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(918);
					match(Function);
					}
				}

				setState(922);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(921);
					declSpecifierSeq();
					}
				}

				setState(924);
				match(Main);
				setState(925);
				compoundStatement();
				 notifyErrorListeners("expected parentheses"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(929);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(928);
					match(Function);
					}
				}

				setState(932);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(931);
					declSpecifierSeq();
					}
				}

				setState(934);
				match(Main);
				setState(936); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(935);
					match(RightParen);
					}
					}
					setState(938); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(940);
				compoundStatement();
				 notifyErrorListeners("expected opening parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(944);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(943);
					match(Function);
					}
				}

				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(946);
					declSpecifierSeq();
					}
				}

				setState(949);
				match(Main);
				setState(951); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(950);
					match(LeftParen);
					}
					}
					setState(953); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(955);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(958);
					match(Function);
					}
				}

				setState(962);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(961);
					declSpecifierSeq();
					}
				}

				setState(964);
				match(Main);
				setState(965);
				match(LeftParen);
				setState(967); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(966);
					match(LeftParen);
					}
					}
					setState(969); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(971);
				match(RightParen);
				setState(972);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(976);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(975);
					match(Function);
					}
				}

				setState(979);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(978);
					declSpecifierSeq();
					}
				}

				setState(981);
				match(Main);
				setState(982);
				match(LeftParen);
				setState(983);
				match(RightParen);
				setState(985); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(984);
					match(RightParen);
					}
					}
					setState(987); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(989);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
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
		enterRule(_localctx, 90, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(994);
			initDeclarator();
			setState(999);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(995);
				match(Comma);
				setState(996);
				initDeclarator();
				}
				}
				setState(1001);
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
		enterRule(_localctx, 92, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			declarator();
			setState(1004);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1003);
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
		enterRule(_localctx, 94, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(Assign);
			setState(1007);
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
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
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
		enterRule(_localctx, 96, RULE_initializerClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1009);
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
		enterRule(_localctx, 98, RULE_initializerList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			initializerClause();
			setState(1016);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1012);
					match(Comma);
					setState(1013);
					initializerClause();
					}
					} 
				}
				setState(1018);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,123,_ctx);
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
		public List<TerminalNode> LeftParen() { return getTokens(PseudocodeParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(PseudocodeParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
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
		enterRule(_localctx, 100, RULE_parametersAndQualifiers);
		int _la;
		try {
			int _alt;
			setState(1055);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1019);
				match(LeftParen);
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1020);
					parameterDeclarationClause();
					}
				}

				setState(1023);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1025); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1024);
					match(LeftParen);
					}
					}
					setState(1027); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1030);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1029);
					parameterDeclarationClause();
					}
				}

				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1033);
				match(LeftParen);
				setState(1035);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1034);
					parameterDeclarationClause();
					}
				}

				setState(1037);
				match(RightParen);
				setState(1039); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1038);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1041); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1044);
				match(LeftParen);
				setState(1046); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1045);
					match(LeftParen);
					}
					}
					setState(1048); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Badconst) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1050);
					parameterDeclarationClause();
					}
				}

				setState(1053);
				match(RightParen);
				 notifyErrorListeners("too many opening parenthesis"); 
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
		enterRule(_localctx, 102, RULE_parameterDeclarationClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1057);
			parameterDeclaration();
			setState(1062);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1058);
					match(Comma);
					setState(1059);
					parameterDeclaration();
					}
					} 
				}
				setState(1064);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,132,_ctx);
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
		enterRule(_localctx, 104, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			declSpecifierSeq();
			{
			setState(1066);
			declarator();
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1067);
				match(Assign);
				setState(1068);
				initializerClause();
				}
				break;
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u0432\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3\u0089\n\3\3\3\3\3\6\3\u008d\n\3\r\3\16\3\u008e\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\5\3\u0098\n\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\5\5\u00a1\n\5\3\6"+
		"\3\6\3\6\7\6\u00a6\n\6\f\6\16\6\u00a9\13\6\3\7\3\7\3\7\7\7\u00ae\n\7\f"+
		"\7\16\7\u00b1\13\7\3\b\3\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\t\3"+
		"\t\3\t\7\t\u00be\n\t\f\t\16\t\u00c1\13\t\3\n\3\n\3\n\7\n\u00c6\n\n\f\n"+
		"\16\n\u00c9\13\n\3\n\3\n\3\n\7\n\u00ce\n\n\f\n\16\n\u00d1\13\n\3\n\3\n"+
		"\5\n\u00d5\n\n\3\13\3\13\3\13\7\13\u00da\n\13\f\13\16\13\u00dd\13\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e8\n\f\3\f\3\f\3\f\3\f\7\f\u00ee"+
		"\n\f\f\f\16\f\u00f1\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u0102\n\16\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u0109\n\16\3\16\3\16\5\16\u010d\n\16\3\16\6\16\u0110\n\16\r\16\16\16"+
		"\u0111\3\16\3\16\3\16\3\16\3\16\5\16\u0119\n\16\3\16\3\16\3\16\3\16\3"+
		"\16\5\16\u0120\n\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0128\n\16\3\16"+
		"\5\16\u012b\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0143\n\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014e\n\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0158\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\6\25\u0163\n\25\r\25\16\25\u0164\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u0171\n\25\r\25\16\25\u0172\3\25"+
		"\3\25\3\25\3\25\3\25\6\25\u017a\n\25\r\25\16\25\u017b\3\25\3\25\3\25\3"+
		"\25\5\25\u0182\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\6\26\u018e\n\26\r\26\16\26\u018f\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\6\26\u019f\n\26\r\26\16\26\u01a0\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ac\n\26\3\27\3\27\3\27\3\27"+
		"\5\27\u01b2\n\27\5\27\u01b4\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01bb\n"+
		"\27\3\30\3\30\3\30\3\31\5\31\u01c1\n\31\3\31\3\31\3\32\3\32\5\32\u01c7"+
		"\n\32\3\32\3\32\6\32\u01cb\n\32\r\32\16\32\u01cc\3\32\5\32\u01d0\n\32"+
		"\3\32\3\32\3\32\5\32\u01d5\n\32\3\32\3\32\6\32\u01d9\n\32\r\32\16\32\u01da"+
		"\3\32\3\32\3\32\6\32\u01e0\n\32\r\32\16\32\u01e1\3\32\5\32\u01e5\n\32"+
		"\3\32\3\32\5\32\u01e9\n\32\3\33\6\33\u01ec\n\33\r\33\16\33\u01ed\3\34"+
		"\3\34\7\34\u01f2\n\34\f\34\16\34\u01f5\13\34\3\34\5\34\u01f8\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u01ff\n\35\3\35\3\35\3\35\3\35\6\35\u0205\n"+
		"\35\r\35\16\35\u0206\3\35\3\35\5\35\u020b\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\6\35\u0215\n\35\r\35\16\35\u0216\3\35\5\35\u021a\n\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u0222\n\35\r\35\16\35\u0223\3\35\3"+
		"\35\3\35\5\35\u0229\n\35\3\35\3\35\3\35\5\35\u022e\n\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\5\36\u0236\n\36\3\36\3\36\3\36\3\36\3\36\6\36\u023d\n"+
		"\36\r\36\16\36\u023e\3\36\3\36\5\36\u0243\n\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\6\36\u024e\n\36\r\36\16\36\u024f\3\36\5\36\u0253"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u025c\n\36\r\36\16\36\u025d"+
		"\3\36\3\36\3\36\5\36\u0263\n\36\3\36\3\36\3\36\5\36\u0268\n\36\3\37\3"+
		"\37\5\37\u026c\n\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u0278\n \3 \7"+
		" \u027b\n \f \16 \u027e\13 \3 \3 \3 \5 \u0283\n \3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u02a7\n\"\3\"\3\"\5\"\u02ab"+
		"\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u02b8\n\"\r\"\16"+
		"\"\u02b9\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u02c3\n\"\r\"\16\"\u02c4\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u02d1\n\"\r\"\16\"\u02d2\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u02dc\n\"\r\"\16\"\u02dd\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\6\"\u02e9\n\"\r\"\16\"\u02ea\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u02f9\n\"\r\"\16\"\u02fa\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0308\n\"\r\"\16\"\u0309\3\"\3\""+
		"\5\"\u030e\n\"\3\"\3\"\5\"\u0312\n\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u031a"+
		"\n\"\r\"\16\"\u031b\3\"\3\"\5\"\u0320\n\"\3\"\3\"\5\"\u0324\n\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u032e\n\"\3\"\3\"\5\"\u0332\n\"\3\"\3\""+
		"\6\"\u0336\n\"\r\"\16\"\u0337\3\"\3\"\3\"\5\"\u033d\n\"\3#\3#\5#\u0341"+
		"\n#\3$\3$\5$\u0345\n$\3$\5$\u0348\n$\3%\3%\3%\3%\3%\5%\u034f\n%\3&\3&"+
		"\3&\5&\u0354\n&\3\'\3\'\3(\5(\u0359\n(\3(\5(\u035c\n(\3(\3(\3)\5)\u0361"+
		"\n)\3)\3)\3)\5)\u0366\n)\3)\3)\3)\3)\5)\u036c\n)\3)\3)\5)\u0370\n)\3*"+
		"\3*\3+\3+\3,\3,\5,\u0378\n,\3,\3,\5,\u037c\n,\3,\3,\3,\3,\3,\5,\u0383"+
		"\n,\3-\5-\u0386\n-\3-\3-\3-\3-\3-\5-\u038d\n-\3.\5.\u0390\n.\3.\5.\u0393"+
		"\n.\3.\3.\3.\3.\3.\5.\u039a\n.\3.\5.\u039d\n.\3.\3.\3.\3.\3.\5.\u03a4"+
		"\n.\3.\5.\u03a7\n.\3.\3.\6.\u03ab\n.\r.\16.\u03ac\3.\3.\3.\3.\5.\u03b3"+
		"\n.\3.\5.\u03b6\n.\3.\3.\6.\u03ba\n.\r.\16.\u03bb\3.\3.\3.\3.\5.\u03c2"+
		"\n.\3.\5.\u03c5\n.\3.\3.\3.\6.\u03ca\n.\r.\16.\u03cb\3.\3.\3.\3.\3.\5"+
		".\u03d3\n.\3.\5.\u03d6\n.\3.\3.\3.\3.\6.\u03dc\n.\r.\16.\u03dd\3.\3.\3"+
		".\5.\u03e3\n.\3/\3/\3/\7/\u03e8\n/\f/\16/\u03eb\13/\3\60\3\60\5\60\u03ef"+
		"\n\60\3\61\3\61\3\61\3\62\3\62\3\63\3\63\3\63\7\63\u03f9\n\63\f\63\16"+
		"\63\u03fc\13\63\3\64\3\64\5\64\u0400\n\64\3\64\3\64\6\64\u0404\n\64\r"+
		"\64\16\64\u0405\3\64\5\64\u0409\n\64\3\64\3\64\3\64\5\64\u040e\n\64\3"+
		"\64\3\64\6\64\u0412\n\64\r\64\16\64\u0413\3\64\3\64\3\64\6\64\u0419\n"+
		"\64\r\64\16\64\u041a\3\64\5\64\u041e\n\64\3\64\3\64\5\64\u0422\n\64\3"+
		"\65\3\65\3\65\7\65\u0427\n\65\f\65\16\65\u042a\13\65\3\66\3\66\3\66\3"+
		"\66\5\66\u0430\n\66\3\66\2\3\26\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\17\3\2AB\4\2\67"+
		"8CD\3\2-.\4\2-.GH\3\2/\61\4\2\22\22\35\35\3\2GH\4\2\66\669=\4\2\t\tYY"+
		"\4\2\678AD\3\2QR\4\2\17\17\27\27\n\2\n\n\f\f\24\24\30\30\33\34\37\37!"+
		"!%%\2\u04cd\2p\3\2\2\2\4\u0097\3\2\2\2\6\u0099\3\2\2\2\b\u00a0\3\2\2\2"+
		"\n\u00a2\3\2\2\2\f\u00aa\3\2\2\2\16\u00b2\3\2\2\2\20\u00ba\3\2\2\2\22"+
		"\u00d4\3\2\2\2\24\u00d6\3\2\2\2\26\u00e7\3\2\2\2\30\u00f2\3\2\2\2\32\u012a"+
		"\3\2\2\2\34\u012c\3\2\2\2\36\u012e\3\2\2\2 \u0130\3\2\2\2\"\u0142\3\2"+
		"\2\2$\u014d\3\2\2\2&\u0157\3\2\2\2(\u0181\3\2\2\2*\u01ab\3\2\2\2,\u01ba"+
		"\3\2\2\2.\u01bc\3\2\2\2\60\u01c0\3\2\2\2\62\u01e8\3\2\2\2\64\u01eb\3\2"+
		"\2\2\66\u01ef\3\2\2\28\u022d\3\2\2\2:\u0267\3\2\2\2<\u0269\3\2\2\2>\u0282"+
		"\3\2\2\2@\u0284\3\2\2\2B\u033c\3\2\2\2D\u0340\3\2\2\2F\u0347\3\2\2\2H"+
		"\u034e\3\2\2\2J\u0353\3\2\2\2L\u0355\3\2\2\2N\u0358\3\2\2\2P\u036f\3\2"+
		"\2\2R\u0371\3\2\2\2T\u0373\3\2\2\2V\u0382\3\2\2\2X\u038c\3\2\2\2Z\u03e2"+
		"\3\2\2\2\\\u03e4\3\2\2\2^\u03ec\3\2\2\2`\u03f0\3\2\2\2b\u03f3\3\2\2\2"+
		"d\u03f5\3\2\2\2f\u0421\3\2\2\2h\u0423\3\2\2\2j\u042b\3\2\2\2lo\5J&\2m"+
		"o\5&\24\2nl\3\2\2\2nm\3\2\2\2or\3\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2"+
		"rp\3\2\2\2st\7\2\2\3t\3\3\2\2\2u\u0098\5$\23\2v\u0098\7\"\2\2w\u0098\7"+
		"Y\2\2xy\7\'\2\2yz\5\6\4\2z{\7(\2\2{\u0098\3\2\2\2|}\7\'\2\2}~\5\6\4\2"+
		"~\177\b\3\1\2\177\u0098\3\2\2\2\u0080\u0081\7\'\2\2\u0081\u0082\5\6\4"+
		"\2\u0082\u0083\7(\2\2\u0083\u0084\7(\2\2\u0084\u0085\b\3\1\2\u0085\u0098"+
		"\3\2\2\2\u0086\u0089\7Y\2\2\u0087\u0089\5$\23\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008d\7Y\2\2\u008b\u008d\5$\23"+
		"\2\u008c\u008a\3\2\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0098\b\3\1\2\u0091"+
		"\u0092\7Y\2\2\u0092\u0093\7Y\2\2\u0093\u0094\7L\2\2\u0094\u0095\7\3\2"+
		"\2\u0095\u0096\7\65\2\2\u0096\u0098\b\3\1\2\u0097u\3\2\2\2\u0097v\3\2"+
		"\2\2\u0097w\3\2\2\2\u0097x\3\2\2\2\u0097|\3\2\2\2\u0097\u0080\3\2\2\2"+
		"\u0097\u0088\3\2\2\2\u0097\u0091\3\2\2\2\u0098\5\3\2\2\2\u0099\u009a\5"+
		"\b\5\2\u009a\7\3\2\2\2\u009b\u00a1\5\n\6\2\u009c\u009d\5\n\6\2\u009d\u009e"+
		"\5 \21\2\u009e\u009f\5b\62\2\u009f\u00a1\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0"+
		"\u009c\3\2\2\2\u00a1\t\3\2\2\2\u00a2\u00a7\5\f\7\2\u00a3\u00a4\7F\2\2"+
		"\u00a4\u00a6\5\f\7\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\13\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00af\5\16\b\2\u00ab\u00ac\7E\2\2\u00ac\u00ae\5\16\b\2\u00ad\u00ab\3"+
		"\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\r\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b7\5\20\t\2\u00b3\u00b4\t\2\2"+
		"\2\u00b4\u00b6\5\20\t\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\17\3\2\2\2\u00b9\u00b7\3\2\2"+
		"\2\u00ba\u00bf\5\22\n\2\u00bb\u00bc\t\3\2\2\u00bc\u00be\5\22\n\2\u00bd"+
		"\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\21\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c7\5\24\13\2\u00c3"+
		"\u00c4\t\4\2\2\u00c4\u00c6\5\24\13\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00d5\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00cf\5\24\13\2\u00cb\u00cc\t\5\2\2\u00cc\u00ce\5"+
		"\24\13\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\b\n"+
		"\1\2\u00d3\u00d5\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d4\u00ca\3\2\2\2\u00d5"+
		"\23\3\2\2\2\u00d6\u00db\5\26\f\2\u00d7\u00d8\t\6\2\2\u00d8\u00da\5\26"+
		"\f\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\25\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\b\f\1"+
		"\2\u00df\u00e8\5\32\16\2\u00e0\u00e1\7\65\2\2\u00e1\u00e8\5\26\f\6\u00e2"+
		"\u00e8\5\30\r\2\u00e3\u00e4\5\"\22\2\u00e4\u00e5\5\26\f\4\u00e5\u00e6"+
		"\b\f\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00e0\3\2\2\2\u00e7"+
		"\u00e2\3\2\2\2\u00e7\u00e3\3\2\2\2\u00e8\u00ef\3\2\2\2\u00e9\u00ea\f\3"+
		"\2\2\u00ea\u00eb\5\"\22\2\u00eb\u00ec\b\f\1\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00e9\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\27\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\t\7\2\2\u00f3\u00f4"+
		"\5T+\2\u00f4\u00f5\7)\2\2\u00f5\u00f6\5\34\17\2\u00f6\u00f7\7*\2\2\u00f7"+
		"\31\3\2\2\2\u00f8\u012b\5\4\3\2\u00f9\u00fa\7Y\2\2\u00fa\u00fb\7)\2\2"+
		"\u00fb\u00fc\5\6\4\2\u00fc\u00fd\7*\2\2\u00fd\u012b\3\2\2\2\u00fe\u00ff"+
		"\7Y\2\2\u00ff\u0101\7\'\2\2\u0100\u0102\5\36\20\2\u0101\u0100\3\2\2\2"+
		"\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u012b\7(\2\2\u0104\u0105"+
		"\7Y\2\2\u0105\u012b\t\b\2\2\u0106\u0109\7Y\2\2\u0107\u0109\5$\23\2\u0108"+
		"\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109\u010f\3\2\2\2\u010a\u010c\7\'"+
		"\2\2\u010b\u010d\5\36\20\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u0110\7(\2\2\u010f\u010a\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\u012b\b\16\1\2\u0114\u0115\7Y\2\2\u0115\u0116\7\'\2\2\u0116\u0118\7\'"+
		"\2\2\u0117\u0119\5\36\20\2\u0118\u0117\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011b\7(\2\2\u011b\u012b\b\16\1\2\u011c\u011d\7Y"+
		"\2\2\u011d\u011f\7\'\2\2\u011e\u0120\5\36\20\2\u011f\u011e\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7(\2\2\u0122\u0123\7(\2"+
		"\2\u0123\u012b\b\16\1\2\u0124\u0125\7Y\2\2\u0125\u0127\7\'\2\2\u0126\u0128"+
		"\5\36\20\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2"+
		"\u0129\u012b\b\16\1\2\u012a\u00f8\3\2\2\2\u012a\u00f9\3\2\2\2\u012a\u00fe"+
		"\3\2\2\2\u012a\u0104\3\2\2\2\u012a\u0108\3\2\2\2\u012a\u0114\3\2\2\2\u012a"+
		"\u011c\3\2\2\2\u012a\u0124\3\2\2\2\u012b\33\3\2\2\2\u012c\u012d\5\n\6"+
		"\2\u012d\35\3\2\2\2\u012e\u012f\5d\63\2\u012f\37\3\2\2\2\u0130\u0131\t"+
		"\t\2\2\u0131!\3\2\2\2\u0132\u0143\5 \21\2\u0133\u0143\7-\2\2\u0134\u0143"+
		"\7.\2\2\u0135\u0143\7/\2\2\u0136\u0143\7\60\2\2\u0137\u0143\7\61\2\2\u0138"+
		"\u0143\78\2\2\u0139\u0143\7\67\2\2\u013a\u0143\7D\2\2\u013b\u0143\7A\2"+
		"\2\u013c\u0143\7B\2\2\u013d\u0143\7C\2\2\u013e\u0143\7D\2\2\u013f\u0143"+
		"\7E\2\2\u0140\u0143\7F\2\2\u0141\u0143\7I\2\2\u0142\u0132\3\2\2\2\u0142"+
		"\u0133\3\2\2\2\u0142\u0134\3\2\2\2\u0142\u0135\3\2\2\2\u0142\u0136\3\2"+
		"\2\2\u0142\u0137\3\2\2\2\u0142\u0138\3\2\2\2\u0142\u0139\3\2\2\2\u0142"+
		"\u013a\3\2\2\2\u0142\u013b\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2"+
		"\2\2\u0142\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0141\3\2\2\2\u0143#\3\2\2\2\u0144\u014e\7\3\2\2\u0145\u014e\7\4\2\2"+
		"\u0146\u014e\7\5\2\2\u0147\u014e\7\7\2\2\u0148\u014e\7\t\2\2\u0149\u014a"+
		"\7\b\2\2\u014a\u014e\b\23\1\2\u014b\u014c\7\6\2\2\u014c\u014e\b\23\1\2"+
		"\u014d\u0144\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u0146\3\2\2\2\u014d\u0147"+
		"\3\2\2\2\u014d\u0148\3\2\2\2\u014d\u0149\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"%\3\2\2\2\u014f\u0158\5\60\31\2\u0150\u0158\5\62\32\2\u0151\u0158\5\66"+
		"\34\2\u0152\u0158\5B\"\2\u0153\u0158\5,\27\2\u0154\u0158\5(\25\2\u0155"+
		"\u0158\5*\26\2\u0156\u0158\5N(\2\u0157\u014f\3\2\2\2\u0157\u0150\3\2\2"+
		"\2\u0157\u0151\3\2\2\2\u0157\u0152\3\2\2\2\u0157\u0153\3\2\2\2\u0157\u0154"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0156\3\2\2\2\u0158\'\3\2\2\2\u0159"+
		"\u015a\7U\2\2\u015a\u015b\7\'\2\2\u015b\u015c\5\34\17\2\u015c\u015d\7"+
		"(\2\2\u015d\u015e\7M\2\2\u015e\u0182\3\2\2\2\u015f\u0160\7U\2\2\u0160"+
		"\u0162\7\'\2\2\u0161\u0163\7\'\2\2\u0162\u0161\3\2\2\2\u0163\u0164\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\5\34\17\2\u0167\u0168\7(\2\2\u0168\u0169\7M\2\2\u0169\u016a\b\25"+
		"\1\2\u016a\u0182\3\2\2\2\u016b\u016c\7U\2\2\u016c\u016d\7\'\2\2\u016d"+
		"\u016e\5\34\17\2\u016e\u0170\7(\2\2\u016f\u0171\7(\2\2\u0170\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\7M\2\2\u0175\u0176\b\25\1\2\u0176\u0182\3\2"+
		"\2\2\u0177\u0179\7U\2\2\u0178\u017a\7\'\2\2\u0179\u0178\3\2\2\2\u017a"+
		"\u017b\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017e\5\34\17\2\u017e\u017f\7M\2\2\u017f\u0180\b\25\1\2\u0180"+
		"\u0182\3\2\2\2\u0181\u0159\3\2\2\2\u0181\u015f\3\2\2\2\u0181\u016b\3\2"+
		"\2\2\u0181\u0177\3\2\2\2\u0182)\3\2\2\2\u0183\u0184\7T\2\2\u0184\u0185"+
		"\7\'\2\2\u0185\u0186\7\7\2\2\u0186\u0187\7I\2\2\u0187\u0188\7Y\2\2\u0188"+
		"\u0189\7(\2\2\u0189\u01ac\7M\2\2\u018a\u018b\7T\2\2\u018b\u018d\7\'\2"+
		"\2\u018c\u018e\7\'\2\2\u018d\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\7\7\2\2\u0192"+
		"\u0193\7I\2\2\u0193\u0194\7Y\2\2\u0194\u0195\7(\2\2\u0195\u0196\7M\2\2"+
		"\u0196\u01ac\b\26\1\2\u0197\u0198\7T\2\2\u0198\u0199\7\'\2\2\u0199\u019a"+
		"\7\7\2\2\u019a\u019b\7I\2\2\u019b\u019c\7Y\2\2\u019c\u019e\7(\2\2\u019d"+
		"\u019f\7(\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\7M\2\2\u01a3"+
		"\u01ac\b\26\1\2\u01a4\u01a5\7T\2\2\u01a5\u01a6\7\'\2\2\u01a6\u01a7\7\7"+
		"\2\2\u01a7\u01a8\7I\2\2\u01a8\u01a9\7Y\2\2\u01a9\u01aa\7M\2\2\u01aa\u01ac"+
		"\b\26\1\2\u01ab\u0183\3\2\2\2\u01ab\u018a\3\2\2\2\u01ab\u0197\3\2\2\2"+
		"\u01ab\u01a4\3\2\2\2\u01ac+\3\2\2\2\u01ad\u01b4\7\13\2\2\u01ae\u01b4\7"+
		"\21\2\2\u01af\u01b1\7\36\2\2\u01b0\u01b2\5\34\17\2\u01b1\u01b0\3\2\2\2"+
		"\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01ad\3\2\2\2\u01b3\u01ae"+
		"\3\2\2\2\u01b3\u01af\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01bb\7M\2\2\u01b6"+
		"\u01b7\7\36\2\2\u01b7\u01b8\5.\30\2\u01b8\u01b9\7M\2\2\u01b9\u01bb\3\2"+
		"\2\2\u01ba\u01b3\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb-\3\2\2\2\u01bc\u01bd"+
		"\5T+\2\u01bd\u01be\b\30\1\2\u01be/\3\2\2\2\u01bf\u01c1\5\6\4\2\u01c0\u01bf"+
		"\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\7M\2\2\u01c3"+
		"\61\3\2\2\2\u01c4\u01c6\7+\2\2\u01c5\u01c7\5\64\33\2\u01c6\u01c5\3\2\2"+
		"\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01e9\7,\2\2\u01c9\u01cb"+
		"\7+\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc"+
		"\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01d0\5\64\33\2\u01cf\u01ce\3"+
		"\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01e9\b\32\1\2\u01d2"+
		"\u01d4\7+\2\2\u01d3\u01d5\5\64\33\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3"+
		"\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\7,\2\2\u01d7\u01d9\7,\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dc\3\2\2\2\u01dc\u01e9\b\32\1\2\u01dd\u01df\7+\2\2\u01de"+
		"\u01e0\7+\2\2\u01df\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01df\3\2"+
		"\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e4\3\2\2\2\u01e3\u01e5\5\64\33\2\u01e4"+
		"\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7\7,"+
		"\2\2\u01e7\u01e9\b\32\1\2\u01e8\u01c4\3\2\2\2\u01e8\u01ca\3\2\2\2\u01e8"+
		"\u01d2\3\2\2\2\u01e8\u01dd\3\2\2\2\u01e9\63\3\2\2\2\u01ea\u01ec\5&\24"+
		"\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee"+
		"\3\2\2\2\u01ee\65\3\2\2\2\u01ef\u01f3\58\35\2\u01f0\u01f2\5:\36\2\u01f1"+
		"\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2"+
		"\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f8\5<\37\2\u01f7"+
		"\u01f6\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8\67\3\2\2\2\u01f9\u01fa\7\32\2"+
		"\2\u01fa\u01fb\7\'\2\2\u01fb\u01fc\5> \2\u01fc\u01fe\7(\2\2\u01fd\u01ff"+
		"\7V\2\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200"+
		"\u0201\5\62\32\2\u0201\u022e\3\2\2\2\u0202\u0204\7\32\2\2\u0203\u0205"+
		"\7\'\2\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u020a\5> \2\u0209\u020b\7V\2"+
		"\2\u020a\u0209\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020d"+
		"\5\62\32\2\u020d\u020e\b\35\1\2\u020e\u022e\3\2\2\2\u020f\u0210\7\32\2"+
		"\2\u0210\u0211\7\'\2\2\u0211\u0212\5> \2\u0212\u0214\7(\2\2\u0213\u0215"+
		"\7(\2\2\u0214\u0213\3\2\2\2\u0215\u0216\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u021a\7V\2\2\u0219\u0218\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\5\62\32\2\u021c"+
		"\u021d\b\35\1\2\u021d\u022e\3\2\2\2\u021e\u021f\7\32\2\2\u021f\u0221\7"+
		"\'\2\2\u0220\u0222\7\'\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0226\5>"+
		" \2\u0226\u0228\7(\2\2\u0227\u0229\7V\2\2\u0228\u0227\3\2\2\2\u0228\u0229"+
		"\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5\62\32\2\u022b\u022c\b\35\1"+
		"\2\u022c\u022e\3\2\2\2\u022d\u01f9\3\2\2\2\u022d\u0202\3\2\2\2\u022d\u020f"+
		"\3\2\2\2\u022d\u021e\3\2\2\2\u022e9\3\2\2\2\u022f\u0230\7\25\2\2\u0230"+
		"\u0231\7\32\2\2\u0231\u0232\7\'\2\2\u0232\u0233\5> \2\u0233\u0235\7(\2"+
		"\2\u0234\u0236\7V\2\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0238\5\62\32\2\u0238\u0268\3\2\2\2\u0239\u023a\7\25\2"+
		"\2\u023a\u023c\7\32\2\2\u023b\u023d\7\'\2\2\u023c\u023b\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023c\3\2\2\2\u023e\u023f\3\2\2\2\u023f\u0240\3\2"+
		"\2\2\u0240\u0242\5> \2\u0241\u0243\7V\2\2\u0242\u0241\3\2\2\2\u0242\u0243"+
		"\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\5\62\32\2\u0245\u0246\b\36\1"+
		"\2\u0246\u0268\3\2\2\2\u0247\u0248\7\25\2\2\u0248\u0249\7\32\2\2\u0249"+
		"\u024a\7\'\2\2\u024a\u024b\5> \2\u024b\u024d\7(\2\2\u024c\u024e\7(\2\2"+
		"\u024d\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u0253\7V\2\2\u0252\u0251\3\2\2\2\u0252"+
		"\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\5\62\32\2\u0255\u0256\b"+
		"\36\1\2\u0256\u0268\3\2\2\2\u0257\u0258\7\25\2\2\u0258\u0259\7\32\2\2"+
		"\u0259\u025b\7\'\2\2\u025a\u025c\7\'\2\2\u025b\u025a\3\2\2\2\u025c\u025d"+
		"\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\5> \2\u0260\u0262\7(\2\2\u0261\u0263\7V\2\2\u0262\u0261\3\2\2\2"+
		"\u0262\u0263\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0265\5\62\32\2\u0265\u0266"+
		"\b\36\1\2\u0266\u0268\3\2\2\2\u0267\u022f\3\2\2\2\u0267\u0239\3\2\2\2"+
		"\u0267\u0247\3\2\2\2\u0267\u0257\3\2\2\2\u0268;\3\2\2\2\u0269\u026b\7"+
		"\25\2\2\u026a\u026c\7V\2\2\u026b\u026a\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u026d\3\2\2\2\u026d\u026e\5\62\32\2\u026e=\3\2\2\2\u026f\u0270\5\n\6"+
		"\2\u0270\u0271\5@!\2\u0271\u0272\5\n\6\2\u0272\u0283\3\2\2\2\u0273\u027c"+
		"\t\n\2\2\u0274\u0278\7F\2\2\u0275\u0278\3\2\2\2\u0276\u0278\7E\2\2\u0277"+
		"\u0274\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0276\3\2\2\2\u0278\u0279\3\2"+
		"\2\2\u0279\u027b\t\n\2\2\u027a\u0277\3\2\2\2\u027b\u027e\3\2\2\2\u027c"+
		"\u027a\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u0283\3\2\2\2\u027e\u027c\3\2"+
		"\2\2\u027f\u0280\5\b\5\2\u0280\u0281\b \1\2\u0281\u0283\3\2\2\2\u0282"+
		"\u026f\3\2\2\2\u0282\u0273\3\2\2\2\u0282\u027f\3\2\2\2\u0283?\3\2\2\2"+
		"\u0284\u0285\t\13\2\2\u0285A\3\2\2\2\u0286\u0287\7\31\2\2\u0287\u0288"+
		"\5F$\2\u0288\u0289\t\f\2\2\u0289\u028a\7S\2\2\u028a\u028b\5\34\17\2\u028b"+
		"\u028c\5\62\32\2\u028c\u033d\3\2\2\2\u028d\u028e\7&\2\2\u028e\u028f\5"+
		"F$\2\u028f\u0290\t\f\2\2\u0290\u0291\7S\2\2\u0291\u0292\5\34\17\2\u0292"+
		"\u0293\5\62\32\2\u0293\u033d\3\2\2\2\u0294\u0295\7&\2\2\u0295\u0296\7"+
		"\'\2\2\u0296\u0297\5> \2\u0297\u0298\7(\2\2\u0298\u0299\5\62\32\2\u0299"+
		"\u033d\3\2\2\2\u029a\u029b\7\23\2\2\u029b\u029c\5\62\32\2\u029c\u029d"+
		"\7&\2\2\u029d\u029e\7\'\2\2\u029e\u029f\5> \2\u029f\u02a0\7(\2\2\u02a0"+
		"\u02a1\7M\2\2\u02a1\u033d\3\2\2\2\u02a2\u02a3\7\31\2\2\u02a3\u02a4\7\'"+
		"\2\2\u02a4\u02a6\5D#\2\u02a5\u02a7\5> \2\u02a6\u02a5\3\2\2\2\u02a6\u02a7"+
		"\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa\7M\2\2\u02a9\u02ab\5\6\4\2\u02aa"+
		"\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ad\7("+
		"\2\2\u02ad\u02ae\5\62\32\2\u02ae\u033d\3\2\2\2\u02af\u02b0\7&\2\2\u02b0"+
		"\u02b1\5F$\2\u02b1\u02b2\5H%\2\u02b2\u02b3\5\34\17\2\u02b3\u02b4\5\62"+
		"\32\2\u02b4\u033d\3\2\2\2\u02b5\u02b7\7&\2\2\u02b6\u02b8\7\'\2\2\u02b7"+
		"\u02b6\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02b7\3\2\2\2\u02b9\u02ba\3\2"+
		"\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02bc\5> \2\u02bc\u02bd\5\62\32\2\u02bd"+
		"\u02be\b\"\1\2\u02be\u033d\3\2\2\2\u02bf\u02c0\7&\2\2\u02c0\u02c2\7\'"+
		"\2\2\u02c1\u02c3\7\'\2\2\u02c2\u02c1\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\5>"+
		" \2\u02c7\u02c8\7(\2\2\u02c8\u02c9\5\62\32\2\u02c9\u02ca\b\"\1\2\u02ca"+
		"\u033d\3\2\2\2\u02cb\u02cc\7&\2\2\u02cc\u02cd\7\'\2\2\u02cd\u02ce\5> "+
		"\2\u02ce\u02d0\7(\2\2\u02cf\u02d1\7(\2\2\u02d0\u02cf\3\2\2\2\u02d1\u02d2"+
		"\3\2\2\2\u02d2\u02d0\3\2\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4"+
		"\u02d5\5\62\32\2\u02d5\u02d6\b\"\1\2\u02d6\u033d\3\2\2\2\u02d7\u02d8\7"+
		"\23\2\2\u02d8\u02d9\5\62\32\2\u02d9\u02db\7&\2\2\u02da\u02dc\7\'\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2"+
		"\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\5> \2\u02e0\u02e1\7M\2\2\u02e1\u02e2"+
		"\b\"\1\2\u02e2\u033d\3\2\2\2\u02e3\u02e4\7\23\2\2\u02e4\u02e5\5\62\32"+
		"\2\u02e5\u02e6\7&\2\2\u02e6\u02e8\7\'\2\2\u02e7\u02e9\7\'\2\2\u02e8\u02e7"+
		"\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb"+
		"\u02ec\3\2\2\2\u02ec\u02ed\5> \2\u02ed\u02ee\7(\2\2\u02ee\u02ef\7M\2\2"+
		"\u02ef\u02f0\b\"\1\2\u02f0\u033d\3\2\2\2\u02f1\u02f2\7\23\2\2\u02f2\u02f3"+
		"\5\62\32\2\u02f3\u02f4\7&\2\2\u02f4\u02f5\7\'\2\2\u02f5\u02f6\5> \2\u02f6"+
		"\u02f8\7(\2\2\u02f7\u02f9\7(\2\2\u02f8\u02f7\3\2\2\2\u02f9\u02fa\3\2\2"+
		"\2\u02fa\u02f8\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd"+
		"\7M\2\2\u02fd\u02fe\b\"\1\2\u02fe\u033d\3\2\2\2\u02ff\u0300\7\31\2\2\u0300"+
		"\u0301\5F$\2\u0301\u0302\5H%\2\u0302\u0303\5\34\17\2\u0303\u0304\5\62"+
		"\32\2\u0304\u033d\3\2\2\2\u0305\u0307\7\31\2\2\u0306\u0308\7\'\2\2\u0307"+
		"\u0306\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u030b\3\2\2\2\u030b\u030d\5D#\2\u030c\u030e\5> \2\u030d\u030c"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\7M\2\2\u0310"+
		"\u0312\5\6\4\2\u0311\u0310\3\2\2\2\u0311\u0312\3\2\2\2\u0312\u0313\3\2"+
		"\2\2\u0313\u0314\5\62\32\2\u0314\u0315\b\"\1\2\u0315\u033d\3\2\2\2\u0316"+
		"\u0317\7\31\2\2\u0317\u0319\7\'\2\2\u0318\u031a\7\'\2\2\u0319\u0318\3"+
		"\2\2\2\u031a\u031b\3\2\2\2\u031b\u0319\3\2\2\2\u031b\u031c\3\2\2\2\u031c"+
		"\u031d\3\2\2\2\u031d\u031f\5D#\2\u031e\u0320\5> \2\u031f\u031e\3\2\2\2"+
		"\u031f\u0320\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0323\7M\2\2\u0322\u0324"+
		"\5\6\4\2\u0323\u0322\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0325\3\2\2\2\u0325"+
		"\u0326\7(\2\2\u0326\u0327\5\62\32\2\u0327\u0328\b\"\1\2\u0328\u033d\3"+
		"\2\2\2\u0329\u032a\7\31\2\2\u032a\u032b\7\'\2\2\u032b\u032d\5D#\2\u032c"+
		"\u032e\5> \2\u032d\u032c\3\2\2\2\u032d\u032e\3\2\2\2\u032e\u032f\3\2\2"+
		"\2\u032f\u0331\7M\2\2\u0330\u0332\5\6\4\2\u0331\u0330\3\2\2\2\u0331\u0332"+
		"\3\2\2\2\u0332\u0333\3\2\2\2\u0333\u0335\7(\2\2\u0334\u0336\7(\2\2\u0335"+
		"\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0335\3\2\2\2\u0337\u0338\3\2"+
		"\2\2\u0338\u0339\3\2\2\2\u0339\u033a\5\62\32\2\u033a\u033b\b\"\1\2\u033b"+
		"\u033d\3\2\2\2\u033c\u0286\3\2\2\2\u033c\u028d\3\2\2\2\u033c\u0294\3\2"+
		"\2\2\u033c\u029a\3\2\2\2\u033c\u02a2\3\2\2\2\u033c\u02af\3\2\2\2\u033c"+
		"\u02b5\3\2\2\2\u033c\u02bf\3\2\2\2\u033c\u02cb\3\2\2\2\u033c\u02d7\3\2"+
		"\2\2\u033c\u02e3\3\2\2\2\u033c\u02f1\3\2\2\2\u033c\u02ff\3\2\2\2\u033c"+
		"\u0305\3\2\2\2\u033c\u0316\3\2\2\2\u033c\u0329\3\2\2\2\u033dC\3\2\2\2"+
		"\u033e\u0341\5\60\31\2\u033f\u0341\5N(\2\u0340\u033e\3\2\2\2\u0340\u033f"+
		"\3\2\2\2\u0341E\3\2\2\2\u0342\u0348\5\6\4\2\u0343\u0345\5P)\2\u0344\u0343"+
		"\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0348\5\\/\2\u0347"+
		"\u0342\3\2\2\2\u0347\u0344\3\2\2\2\u0348G\3\2\2\2\u0349\u034f\t\f\2\2"+
		"\u034a\u034b\7S\2\2\u034b\u034f\b%\1\2\u034c\u034d\7\7\2\2\u034d\u034f"+
		"\b%\1\2\u034e\u0349\3\2\2\2\u034e\u034a\3\2\2\2\u034e\u034c\3\2\2\2\u034f"+
		"I\3\2\2\2\u0350\u0354\5N(\2\u0351\u0354\5X-\2\u0352\u0354\5L\'\2\u0353"+
		"\u0350\3\2\2\2\u0353\u0351\3\2\2\2\u0353\u0352\3\2\2\2\u0354K\3\2\2\2"+
		"\u0355\u0356\7M\2\2\u0356M\3\2\2\2\u0357\u0359\5P)\2\u0358\u0357\3\2\2"+
		"\2\u0358\u0359\3\2\2\2\u0359\u035b\3\2\2\2\u035a\u035c\5\\/\2\u035b\u035a"+
		"\3\2\2\2\u035b\u035c\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035e\7M\2\2\u035e"+
		"O\3\2\2\2\u035f\u0361\t\r\2\2\u0360\u035f\3\2\2\2\u0360\u0361\3\2\2\2"+
		"\u0361\u0362\3\2\2\2\u0362\u0365\5T+\2\u0363\u0364\7)\2\2\u0364\u0366"+
		"\7*\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0370\3\2\2\2\u0367"+
		"\u0368\5R*\2\u0368\u036b\5T+\2\u0369\u036a\7)\2\2\u036a\u036c\7*\2\2\u036b"+
		"\u0369\3\2\2\2\u036b\u036c\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u036e\b)"+
		"\1\2\u036e\u0370\3\2\2\2\u036f\u0360\3\2\2\2\u036f\u0367\3\2\2\2\u0370"+
		"Q\3\2\2\2\u0371\u0372\7\20\2\2\u0372S\3\2\2\2\u0373\u0374\t\16\2\2\u0374"+
		"U\3\2\2\2\u0375\u0377\7Y\2\2\u0376\u0378\5f\64\2\u0377\u0376\3\2\2\2\u0377"+
		"\u0378\3\2\2\2\u0378\u0383\3\2\2\2\u0379\u037b\5$\23\2\u037a\u037c\5f"+
		"\64\2\u037b\u037a\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\3\2\2\2\u037d"+
		"\u037e\b,\1\2\u037e\u0383\3\2\2\2\u037f\u0380\5T+\2\u0380\u0381\b,\1\2"+
		"\u0381\u0383\3\2\2\2\u0382\u0375\3\2\2\2\u0382\u0379\3\2\2\2\u0382\u037f"+
		"\3\2\2\2\u0383W\3\2\2\2\u0384\u0386\7W\2\2\u0385\u0384\3\2\2\2\u0385\u0386"+
		"\3\2\2\2\u0386\u0387\3\2\2\2\u0387\u0388\5P)\2\u0388\u0389\5V,\2\u0389"+
		"\u038a\5\62\32\2\u038a\u038d\3\2\2\2\u038b\u038d\5Z.\2\u038c\u0385\3\2"+
		"\2\2\u038c\u038b\3\2\2\2\u038dY\3\2\2\2\u038e\u0390\7W\2\2\u038f\u038e"+
		"\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391\u0393\5P)\2\u0392"+
		"\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\7X"+
		"\2\2\u0395\u0396\7\'\2\2\u0396\u0397\7(\2\2\u0397\u03e3\5\62\32\2\u0398"+
		"\u039a\7W\2\2\u0399\u0398\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039c\3\2"+
		"\2\2\u039b\u039d\5P)\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2\2\u039d\u039e"+
		"\3\2\2\2\u039e\u039f\7X\2\2\u039f\u03a0\5\62\32\2\u03a0\u03a1\b.\1\2\u03a1"+
		"\u03e3\3\2\2\2\u03a2\u03a4\7W\2\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2"+
		"\2\2\u03a4\u03a6\3\2\2\2\u03a5\u03a7\5P)\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7"+
		"\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03aa\7X\2\2\u03a9\u03ab\7(\2\2\u03aa"+
		"\u03a9\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03aa\3\2\2\2\u03ac\u03ad\3\2"+
		"\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03af\5\62\32\2\u03af\u03b0\b.\1\2\u03b0"+
		"\u03e3\3\2\2\2\u03b1\u03b3\7W\2\2\u03b2\u03b1\3\2\2\2\u03b2\u03b3\3\2"+
		"\2\2\u03b3\u03b5\3\2\2\2\u03b4\u03b6\5P)\2\u03b5\u03b4\3\2\2\2\u03b5\u03b6"+
		"\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\7X\2\2\u03b8\u03ba\7\'\2\2\u03b9"+
		"\u03b8\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03b9\3\2\2\2\u03bb\u03bc\3\2"+
		"\2\2\u03bc\u03bd\3\2\2\2\u03bd\u03be\5\62\32\2\u03be\u03bf\b.\1\2\u03bf"+
		"\u03e3\3\2\2\2\u03c0\u03c2\7W\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2"+
		"\2\2\u03c2\u03c4\3\2\2\2\u03c3\u03c5\5P)\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5"+
		"\3\2\2\2\u03c5\u03c6\3\2\2\2\u03c6\u03c7\7X\2\2\u03c7\u03c9\7\'\2\2\u03c8"+
		"\u03ca\7\'\2\2\u03c9\u03c8\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03c9\3\2"+
		"\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u03ce\7(\2\2\u03ce"+
		"\u03cf\5\62\32\2\u03cf\u03d0\b.\1\2\u03d0\u03e3\3\2\2\2\u03d1\u03d3\7"+
		"W\2\2\u03d2\u03d1\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4"+
		"\u03d6\5P)\2\u03d5\u03d4\3\2\2\2\u03d5\u03d6\3\2\2\2\u03d6\u03d7\3\2\2"+
		"\2\u03d7\u03d8\7X\2\2\u03d8\u03d9\7\'\2\2\u03d9\u03db\7(\2\2\u03da\u03dc"+
		"\7(\2\2\u03db\u03da\3\2\2\2\u03dc\u03dd\3\2\2\2\u03dd\u03db\3\2\2\2\u03dd"+
		"\u03de\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e0\5\62\32\2\u03e0\u03e1\b"+
		".\1\2\u03e1\u03e3\3\2\2\2\u03e2\u038f\3\2\2\2\u03e2\u0399\3\2\2\2\u03e2"+
		"\u03a3\3\2\2\2\u03e2\u03b2\3\2\2\2\u03e2\u03c1\3\2\2\2\u03e2\u03d2\3\2"+
		"\2\2\u03e3[\3\2\2\2\u03e4\u03e9\5^\60\2\u03e5\u03e6\7I\2\2\u03e6\u03e8"+
		"\5^\60\2\u03e7\u03e5\3\2\2\2\u03e8\u03eb\3\2\2\2\u03e9\u03e7\3\2\2\2\u03e9"+
		"\u03ea\3\2\2\2\u03ea]\3\2\2\2\u03eb\u03e9\3\2\2\2\u03ec\u03ee\5V,\2\u03ed"+
		"\u03ef\5`\61\2\u03ee\u03ed\3\2\2\2\u03ee\u03ef\3\2\2\2\u03ef_\3\2\2\2"+
		"\u03f0\u03f1\7\66\2\2\u03f1\u03f2\5b\62\2\u03f2a\3\2\2\2\u03f3\u03f4\5"+
		"\34\17\2\u03f4c\3\2\2\2\u03f5\u03fa\5b\62\2\u03f6\u03f7\7I\2\2\u03f7\u03f9"+
		"\5b\62\2\u03f8\u03f6\3\2\2\2\u03f9\u03fc\3\2\2\2\u03fa\u03f8\3\2\2\2\u03fa"+
		"\u03fb\3\2\2\2\u03fbe\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fd\u03ff\7\'\2\2"+
		"\u03fe\u0400\5h\65\2\u03ff\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401"+
		"\3\2\2\2\u0401\u0422\7(\2\2\u0402\u0404\7\'\2\2\u0403\u0402\3\2\2\2\u0404"+
		"\u0405\3\2\2\2\u0405\u0403\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0408\3\2"+
		"\2\2\u0407\u0409\5h\65\2\u0408\u0407\3\2\2\2\u0408\u0409\3\2\2\2\u0409"+
		"\u040a\3\2\2\2\u040a\u0422\b\64\1\2\u040b\u040d\7\'\2\2\u040c\u040e\5"+
		"h\65\2\u040d\u040c\3\2\2\2\u040d\u040e\3\2\2\2\u040e\u040f\3\2\2\2\u040f"+
		"\u0411\7(\2\2\u0410\u0412\7(\2\2\u0411\u0410\3\2\2\2\u0412\u0413\3\2\2"+
		"\2\u0413\u0411\3\2\2\2\u0413\u0414\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0422"+
		"\b\64\1\2\u0416\u0418\7\'\2\2\u0417\u0419\7\'\2\2\u0418\u0417\3\2\2\2"+
		"\u0419\u041a\3\2\2\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u041d"+
		"\3\2\2\2\u041c\u041e\5h\65\2\u041d\u041c\3\2\2\2\u041d\u041e\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0420\7(\2\2\u0420\u0422\b\64\1\2\u0421\u03fd\3\2"+
		"\2\2\u0421\u0403\3\2\2\2\u0421\u040b\3\2\2\2\u0421\u0416\3\2\2\2\u0422"+
		"g\3\2\2\2\u0423\u0428\5j\66\2\u0424\u0425\7I\2\2\u0425\u0427\5j\66\2\u0426"+
		"\u0424\3\2\2\2\u0427\u042a\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2"+
		"\2\2\u0429i\3\2\2\2\u042a\u0428\3\2\2\2\u042b\u042c\5P)\2\u042c\u042f"+
		"\5V,\2\u042d\u042e\7\66\2\2\u042e\u0430\5b\62\2\u042f\u042d\3\2\2\2\u042f"+
		"\u0430\3\2\2\2\u0430k\3\2\2\2\u0088np\u0088\u008c\u008e\u0097\u00a0\u00a7"+
		"\u00af\u00b7\u00bf\u00c7\u00cf\u00d4\u00db\u00e7\u00ef\u0101\u0108\u010c"+
		"\u0111\u0118\u011f\u0127\u012a\u0142\u014d\u0157\u0164\u0172\u017b\u0181"+
		"\u018f\u01a0\u01ab\u01b1\u01b3\u01ba\u01c0\u01c6\u01cc\u01cf\u01d4\u01da"+
		"\u01e1\u01e4\u01e8\u01ed\u01f3\u01f7\u01fe\u0206\u020a\u0216\u0219\u0223"+
		"\u0228\u022d\u0235\u023e\u0242\u024f\u0252\u025d\u0262\u0267\u026b\u0277"+
		"\u027c\u0282\u02a6\u02aa\u02b9\u02c4\u02d2\u02dd\u02ea\u02fa\u0309\u030d"+
		"\u0311\u031b\u031f\u0323\u032d\u0331\u0337\u033c\u0340\u0344\u0347\u034e"+
		"\u0353\u0358\u035b\u0360\u0365\u036b\u036f\u0377\u037b\u0382\u0385\u038c"+
		"\u038f\u0392\u0399\u039c\u03a3\u03a6\u03ac\u03b2\u03b5\u03bb\u03c1\u03c4"+
		"\u03cb\u03d2\u03d5\u03dd\u03e2\u03e9\u03ee\u03fa\u03ff\u0405\u0408\u040d"+
		"\u0413\u041a\u041d\u0421\u0428\u042f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}