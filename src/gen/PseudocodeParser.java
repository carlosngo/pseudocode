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
		RULE_declaration = 35, RULE_emptyDeclaration = 36, RULE_simpleDeclaration = 37, 
		RULE_declSpecifierSeq = 38, RULE_typeSpecifier = 39, RULE_declarator = 40, 
		RULE_functionDefinition = 41, RULE_mainFunction = 42, RULE_initDeclaratorList = 43, 
		RULE_initDeclarator = 44, RULE_initializer = 45, RULE_initializerClause = 46, 
		RULE_initializerList = 47, RULE_parametersAndQualifiers = 48, RULE_parameterDeclarationClause = 49, 
		RULE_parameterDeclaration = 50;
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
			"iterationStatement", "forInitStatement", "iterationInit", "declaration", 
			"emptyDeclaration", "simpleDeclaration", "declSpecifierSeq", "typeSpecifier", 
			"declarator", "functionDefinition", "mainFunction", "initDeclaratorList", 
			"initDeclarator", "initializer", "initializerClause", "initializerList", 
			"parametersAndQualifiers", "parameterDeclarationClause", "parameterDeclaration"
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
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Function - 64)) | (1L << (Main - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(104);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(102);
					declaration();
					}
					break;
				case 2:
					{
					setState(103);
					statement();
					}
					break;
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
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
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				match(This);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				match(LeftParen);
				setState(115);
				expression();
				setState(116);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				match(LeftParen);
				setState(119);
				expression();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(122);
				match(LeftParen);
				setState(123);
				expression();
				setState(124);
				match(RightParen);
				setState(125);
				match(RightParen);
				 notifyErrorListeners("too many closing parentheses"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(130);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(128);
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
					setState(129);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(134); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
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
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(136); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(141);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				logicalOrExpression();
				setState(145);
				assignmentOperator();
				setState(146);
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
			setState(150);
			logicalAndExpression();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(OrOr);
					setState(152);
					logicalAndExpression();
					}
					} 
				}
				setState(157);
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
			setState(158);
			equalityExpression();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(AndAnd);
					setState(160);
					equalityExpression();
					}
					} 
				}
				setState(165);
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
			setState(166);
			relationalExpression();
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(168);
					relationalExpression();
					}
					} 
				}
				setState(173);
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
			setState(174);
			additiveExpression();
			setState(179);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					_la = _input.LA(1);
					if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (Less - 52)) | (1L << (Greater - 52)) | (1L << (LessEqual - 52)) | (1L << (GreaterEqual - 52)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(176);
					additiveExpression();
					}
					} 
				}
				setState(181);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				multiplicativeExpression();
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(183);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						multiplicativeExpression();
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				multiplicativeExpression();
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						_la = _input.LA(1);
						if ( !(((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (Plus - 42)) | (1L << (Minus - 42)) | (1L << (PlusPlus - 42)) | (1L << (MinusMinus - 42)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						multiplicativeExpression();
						}
						} 
					}
					setState(197);
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
			setState(202);
			unaryExpression(0);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(204);
					unaryExpression(0);
					}
					} 
				}
				setState(209);
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
			setState(223);
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
				setState(211);
				postfixExpression();
				}
				break;
			case Not:
				{
				setState(212);
				match(Not);
				setState(213);
				unaryExpression(4);
				}
				break;
			case Create:
			case New:
				{
				setState(214);
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
				setState(216); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(215);
						binaryOperator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(218); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(220);
				unaryExpression(2);
				 notifyErrorListeners("redundant binary operator. Missing operand"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnaryExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unaryExpression);
					setState(225);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(227); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(226);
							binaryOperator();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(229); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					 notifyErrorListeners("redundant binary operator. Missing operand"); 
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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
			setState(238);
			_la = _input.LA(1);
			if ( !(_la==Create || _la==New) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(239);
			typeSpecifier();
			setState(240);
			match(LeftBracket);
			setState(241);
			constantExpression();
			setState(242);
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
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				match(Identifier);
				setState(246);
				match(LeftBracket);
				setState(247);
				expression();
				setState(248);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(Identifier);
				setState(251);
				match(LeftParen);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(252);
					expressionList();
					}
				}

				setState(255);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(Identifier);
				setState(257);
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
				setState(260);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(258);
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
					setState(259);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(267); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(262);
						match(LeftParen);
						setState(264);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(263);
							expressionList();
							}
						}

						setState(266);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(269); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
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
			setState(280);
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
			setState(282);
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				assignmentOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(Plus);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(286);
				match(Minus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				match(Star);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(288);
				match(Div);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(289);
				match(Mod);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(290);
				match(Greater);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(291);
				match(Less);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(292);
				match(GreaterEqual);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(293);
				match(Equal);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(294);
				match(NotEqual);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(295);
				match(LessEqual);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(296);
				match(GreaterEqual);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(297);
				match(AndAnd);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(298);
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
			setState(310);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(IntegerLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(CharacterLiteral);
				}
				break;
			case FloatingLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(303);
				match(FloatingLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(305);
				match(BooleanLiteral);
				}
				break;
			case BadStringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(306);
				match(BadStringLiteral);
				 notifyErrorListeners("expected closing double quotes"); 
				}
				break;
			case BadFloatingLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
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
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316);
				jumpStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318);
				scanStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(319);
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
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(Print);
				setState(323);
				match(LeftParen);
				setState(324);
				constantExpression();
				setState(325);
				match(RightParen);
				setState(326);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328);
				match(Print);
				setState(329);
				match(LeftParen);
				setState(331); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(330);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(333); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(335);
				constantExpression();
				setState(336);
				match(RightParen);
				setState(337);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(Print);
				setState(341);
				match(LeftParen);
				setState(342);
				constantExpression();
				setState(343);
				match(RightParen);
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(344);
					match(RightParen);
					}
					}
					setState(347); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(349);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(352);
				match(Print);
				setState(353);
				constantExpression();
				setState(355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(354);
					match(RightParen);
					}
					}
					setState(357); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(359);
				match(Semi);
				 notifyErrorListeners("expected open parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(362);
				match(Print);
				setState(364); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(363);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(366); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(368);
				constantExpression();
				setState(369);
				match(Semi);
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(372);
				match(Print);
				setState(373);
				constantExpression();
				setState(374);
				match(Semi);
				 notifyErrorListeners("expected parentheses"); 
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
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(Scan);
				setState(380);
				match(LeftParen);
				setState(381);
				match(StringLiteral);
				setState(382);
				match(Comma);
				setState(383);
				match(Identifier);
				setState(384);
				match(RightParen);
				setState(385);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(386);
				match(Scan);
				setState(387);
				match(LeftParen);
				setState(389); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(388);
					match(LeftParen);
					}
					}
					setState(391); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(393);
				match(StringLiteral);
				setState(394);
				match(Comma);
				setState(395);
				match(Identifier);
				setState(396);
				match(RightParen);
				setState(397);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(399);
				match(Scan);
				setState(400);
				match(LeftParen);
				setState(401);
				match(StringLiteral);
				setState(402);
				match(Comma);
				setState(403);
				match(Identifier);
				setState(404);
				match(RightParen);
				setState(406); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(405);
					match(RightParen);
					}
					}
					setState(408); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(410);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(412);
				match(Scan);
				setState(413);
				match(StringLiteral);
				setState(414);
				match(Comma);
				setState(415);
				match(Identifier);
				setState(416);
				match(RightParen);
				setState(417);
				match(Semi);
				 notifyErrorListeners("expected open parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(419);
				match(Scan);
				setState(420);
				match(LeftParen);
				setState(421);
				match(StringLiteral);
				setState(422);
				match(Comma);
				setState(423);
				match(Identifier);
				setState(424);
				match(Semi);
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(426);
				match(Scan);
				setState(427);
				match(StringLiteral);
				setState(428);
				match(Comma);
				setState(429);
				match(Identifier);
				setState(430);
				match(Semi);
				 notifyErrorListeners("expected parentheses"); 
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
			setState(447);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(434);
					match(Break);
					}
					break;
				case Continue:
					{
					setState(435);
					match(Continue);
					}
					break;
				case Return:
					{
					setState(436);
					match(Return);
					setState(438);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
						{
						setState(437);
						constantExpression();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(442);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				match(Return);
				setState(444);
				badReturn();
				setState(445);
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
			setState(449);
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
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(452);
				expression();
				}
			}

			setState(455);
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
			setState(493);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				match(LeftBrace);
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(458);
					statementSeq();
					}
				}

				setState(461);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(462);
						match(LeftBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(465); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(467);
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
				setState(471);
				match(LeftBrace);
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(472);
					statementSeq();
					}
				}

				setState(475);
				match(RightBrace);
				setState(477); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(476);
						match(RightBrace);
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
				 notifyErrorListeners("too many closing curly braces"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				match(LeftBrace);
				setState(484); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(483);
						match(LeftBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(486); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(488);
					statementSeq();
					}
				}

				setState(491);
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
			setState(496); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(495);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(498); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
			setState(500);
			ifStatement();
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(501);
					elseIfStatement();
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(507);
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
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(510);
				match(If);
				setState(511);
				match(LeftParen);
				setState(512);
				condition();
				setState(513);
				match(RightParen);
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(514);
					match(Then);
					}
				}

				setState(517);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(519);
				match(If);
				setState(520);
				condition();
				setState(522); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(521);
					match(RightParen);
					}
					}
					setState(524); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(526);
					match(Then);
					}
				}

				setState(529);
				compoundStatement();
				 notifyErrorListeners("expected opening parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(532);
				match(If);
				setState(534); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(533);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(536); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(538);
				condition();
				setState(540);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(539);
					match(Then);
					}
				}

				setState(542);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(545);
				match(If);
				setState(546);
				match(LeftParen);
				setState(547);
				condition();
				setState(548);
				match(RightParen);
				setState(550); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(549);
					match(RightParen);
					}
					}
					setState(552); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(554);
					match(Then);
					}
				}

				setState(557);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(560);
				match(If);
				setState(561);
				match(LeftParen);
				setState(563); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(562);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(565); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(567);
				condition();
				setState(568);
				match(RightParen);
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(569);
					match(Then);
					}
				}

				setState(572);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(575);
				match(If);
				setState(576);
				condition();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(577);
					match(Then);
					}
				}

				setState(580);
				compoundStatement();
				 notifyErrorListeners("expected parentheses"); 
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
			setState(664);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				match(Else);
				setState(586);
				match(If);
				setState(587);
				match(LeftParen);
				setState(588);
				condition();
				setState(589);
				match(RightParen);
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(590);
					match(Then);
					}
				}

				setState(593);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(Else);
				setState(596);
				match(If);
				setState(597);
				condition();
				setState(599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(598);
					match(RightParen);
					}
					}
					setState(601); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(603);
					match(Then);
					}
				}

				setState(606);
				compoundStatement();
				 notifyErrorListeners("expected opening parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(609);
				match(Else);
				setState(610);
				match(If);
				setState(612); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(611);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(614); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(616);
				condition();
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(617);
					match(Then);
					}
				}

				setState(620);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(623);
				match(Else);
				setState(624);
				match(If);
				setState(625);
				match(LeftParen);
				setState(626);
				condition();
				setState(627);
				match(RightParen);
				setState(629); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(628);
					match(RightParen);
					}
					}
					setState(631); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(633);
					match(Then);
					}
				}

				setState(636);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(639);
				match(Else);
				setState(640);
				match(If);
				setState(641);
				match(LeftParen);
				setState(643); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(642);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(645); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(647);
				condition();
				setState(648);
				match(RightParen);
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(649);
					match(Then);
					}
				}

				setState(652);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(655);
				match(Else);
				setState(656);
				match(If);
				setState(657);
				condition();
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(658);
					match(Then);
					}
				}

				setState(661);
				compoundStatement();
				 notifyErrorListeners("expected parentheses"); 
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
			setState(666);
			match(Else);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Then) {
				{
				setState(667);
				match(Then);
				}
			}

			setState(670);
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
		enterRule(_localctx, 60, RULE_condition);
		int _la;
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(672);
				logicalOrExpression();
				setState(673);
				comparisonOperator();
				setState(674);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==BooleanLiteral || _la==Identifier) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BooleanLiteral || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (AndAnd - 66)) | (1L << (OrOr - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(680);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OrOr:
						{
						setState(677);
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
						setState(679);
						match(AndAnd);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(682);
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
					setState(687);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(688);
				constantExpression();
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
			setState(693);
			_la = _input.LA(1);
			if ( !(((((_la - 52)) & ~0x3f) == 0 && ((1L << (_la - 52)) & ((1L << (Less - 52)) | (1L << (Greater - 52)) | (1L << (Equal - 52)) | (1L << (NotEqual - 52)) | (1L << (LessEqual - 52)) | (1L << (GreaterEqual - 52)))) != 0)) ) {
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
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(695);
				match(For);
				setState(696);
				iterationInit();
				setState(697);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(698);
				match(To);
				setState(699);
				constantExpression();
				setState(700);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(702);
				match(While);
				setState(703);
				iterationInit();
				setState(704);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(705);
				match(To);
				setState(706);
				constantExpression();
				setState(707);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				match(While);
				setState(710);
				match(LeftParen);
				setState(711);
				condition();
				setState(712);
				match(RightParen);
				setState(713);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				match(Do);
				setState(716);
				compoundStatement();
				setState(717);
				match(While);
				setState(718);
				match(LeftParen);
				setState(719);
				condition();
				setState(720);
				match(RightParen);
				setState(721);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(723);
				match(For);
				setState(724);
				match(LeftParen);
				{
				setState(725);
				forInitStatement();
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(726);
					condition();
					}
				}

				setState(729);
				match(Semi);
				setState(731);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(730);
					expression();
					}
				}

				}
				setState(733);
				match(RightParen);
				setState(734);
				compoundStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(736);
				match(While);
				setState(737);
				iterationInit();
				setState(740);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Up:
				case Down:
					{
					setState(738);
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
					{
					setState(739);
					match(To);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(742);
				constantExpression();
				setState(743);
				compoundStatement();
				 notifyErrorListeners("expected up/down to"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(746);
				match(While);
				setState(747);
				condition();
				setState(748);
				compoundStatement();
				 notifyErrorListeners("expected parentheses"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(751);
				match(While);
				setState(752);
				condition();
				setState(754); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(753);
					match(RightParen);
					}
					}
					setState(756); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(758);
				compoundStatement();
				 notifyErrorListeners("expected opening parenthesis"); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(761);
				match(While);
				setState(763); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(762);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(765); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(767);
				condition();
				setState(768);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(771);
				match(While);
				setState(772);
				match(LeftParen);
				setState(774); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(773);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(776); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(778);
				condition();
				setState(779);
				match(RightParen);
				setState(780);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(783);
				match(While);
				setState(784);
				match(LeftParen);
				setState(785);
				condition();
				setState(786);
				match(RightParen);
				setState(788); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(787);
					match(RightParen);
					}
					}
					setState(790); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(792);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(795);
				match(Do);
				setState(796);
				compoundStatement();
				setState(797);
				match(While);
				setState(798);
				condition();
				setState(799);
				match(Semi);
				 notifyErrorListeners("expected parentheses"); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(802);
				match(Do);
				setState(803);
				compoundStatement();
				setState(804);
				match(While);
				setState(805);
				condition();
				setState(807); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(806);
					match(RightParen);
					}
					}
					setState(809); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(811);
				match(Semi);
				 notifyErrorListeners("expected opening parenthesis"); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(814);
				match(Do);
				setState(815);
				compoundStatement();
				setState(816);
				match(While);
				setState(818); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(817);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(820); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(822);
				condition();
				setState(823);
				match(Semi);
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(826);
				match(Do);
				setState(827);
				compoundStatement();
				setState(828);
				match(While);
				setState(829);
				match(LeftParen);
				setState(831); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(830);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(833); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(835);
				condition();
				setState(836);
				match(RightParen);
				setState(837);
				match(Semi);
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(840);
				match(Do);
				setState(841);
				compoundStatement();
				setState(842);
				match(While);
				setState(843);
				match(LeftParen);
				setState(844);
				condition();
				setState(845);
				match(RightParen);
				setState(847); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(846);
					match(RightParen);
					}
					}
					setState(849); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(851);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(854);
				match(For);
				setState(855);
				iterationInit();
				setState(858);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Up:
				case Down:
					{
					setState(856);
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
					{
					setState(857);
					match(To);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(860);
				constantExpression();
				setState(861);
				compoundStatement();
				 notifyErrorListeners("expected up/down to"); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(864);
				match(For);
				{
				setState(865);
				forInitStatement();
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(866);
					condition();
					}
				}

				setState(869);
				match(Semi);
				setState(871);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(870);
					expression();
					}
				}

				}
				setState(873);
				compoundStatement();
				 notifyErrorListeners("expected parentheses"); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(876);
				match(For);
				{
				setState(877);
				forInitStatement();
				setState(879);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(878);
					condition();
					}
				}

				setState(881);
				match(Semi);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(882);
					expression();
					}
				}

				}
				setState(886); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(885);
					match(RightParen);
					}
					}
					setState(888); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(890);
				compoundStatement();
				 notifyErrorListeners("expected opening parenthesis"); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(893);
				match(For);
				setState(895); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(894);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(897); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(899);
				forInitStatement();
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(900);
					condition();
					}
				}

				setState(903);
				match(Semi);
				setState(905);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(904);
					expression();
					}
				}

				}
				setState(907);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(910);
				match(For);
				setState(911);
				match(LeftParen);
				setState(913); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(912);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(915); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(917);
				forInitStatement();
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(918);
					condition();
					}
				}

				setState(921);
				match(Semi);
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(922);
					expression();
					}
				}

				}
				setState(925);
				match(RightParen);
				setState(926);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(929);
				match(For);
				setState(930);
				match(LeftParen);
				{
				setState(931);
				forInitStatement();
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(932);
					condition();
					}
				}

				setState(935);
				match(Semi);
				setState(937);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(936);
					expression();
					}
				}

				}
				setState(939);
				match(RightParen);
				setState(941); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(940);
					match(RightParen);
					}
					}
					setState(943); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(945);
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
			setState(952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(950);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(951);
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
		int _la;
		try {
			setState(959);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(955);
					declSpecifierSeq();
					}
				}

				setState(958);
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
		enterRule(_localctx, 70, RULE_declaration);
		try {
			setState(964);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(961);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(962);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(963);
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
		enterRule(_localctx, 72, RULE_emptyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(966);
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
		enterRule(_localctx, 74, RULE_simpleDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
				{
				setState(968);
				declSpecifierSeq();
				}
			}

			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral))) != 0) || _la==Identifier) {
				{
				setState(971);
				initDeclaratorList();
				}
			}

			setState(974);
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
		enterRule(_localctx, 76, RULE_declSpecifierSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(977);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const || _la==Final) {
				{
				setState(976);
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

			setState(979);
			typeSpecifier();
			setState(982);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(980);
				match(LeftBracket);
				setState(981);
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
		enterRule(_localctx, 78, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(984);
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
		enterRule(_localctx, 80, RULE_declarator);
		int _la;
		try {
			setState(996);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(986);
				match(Identifier);
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(987);
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
				setState(990);
				literal();
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(991);
					parametersAndQualifiers();
					}
				}

				 notifyErrorListeners("expected identifier as declarator"); 
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
		enterRule(_localctx, 82, RULE_functionDefinition);
		int _la;
		try {
			setState(1006);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(998);
					match(Function);
					}
				}

				setState(1001);
				declSpecifierSeq();
				setState(1002);
				declarator();
				setState(1003);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1005);
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
		enterRule(_localctx, 84, RULE_mainFunction);
		int _la;
		try {
			setState(1092);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1008);
					match(Function);
					}
				}

				setState(1012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1011);
					declSpecifierSeq();
					}
				}

				setState(1014);
				match(Main);
				setState(1015);
				match(LeftParen);
				setState(1016);
				match(RightParen);
				setState(1017);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1018);
					match(Function);
					}
				}

				setState(1022);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1021);
					declSpecifierSeq();
					}
				}

				setState(1024);
				match(Main);
				setState(1025);
				compoundStatement();
				 notifyErrorListeners("expected parentheses"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1029);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1028);
					match(Function);
					}
				}

				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1031);
					declSpecifierSeq();
					}
				}

				setState(1034);
				match(Main);
				setState(1036); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1035);
					match(RightParen);
					}
					}
					setState(1038); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(1040);
				compoundStatement();
				 notifyErrorListeners("expected opening parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1044);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1043);
					match(Function);
					}
				}

				setState(1047);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1046);
					declSpecifierSeq();
					}
				}

				setState(1049);
				match(Main);
				setState(1051); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1050);
					match(LeftParen);
					}
					}
					setState(1053); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1055);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1059);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1058);
					match(Function);
					}
				}

				setState(1062);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1061);
					declSpecifierSeq();
					}
				}

				setState(1064);
				match(Main);
				setState(1065);
				match(LeftParen);
				setState(1067); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1066);
					match(LeftParen);
					}
					}
					setState(1069); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1071);
				match(RightParen);
				setState(1072);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1075);
					match(Function);
					}
				}

				setState(1079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1078);
					declSpecifierSeq();
					}
				}

				setState(1081);
				match(Main);
				setState(1082);
				match(LeftParen);
				setState(1083);
				match(RightParen);
				setState(1085); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1084);
					match(RightParen);
					}
					}
					setState(1087); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(1089);
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
		enterRule(_localctx, 86, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			initDeclarator();
			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1095);
				match(Comma);
				setState(1096);
				initDeclarator();
				}
				}
				setState(1101);
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
		enterRule(_localctx, 88, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1102);
			declarator();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1103);
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
		enterRule(_localctx, 90, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(Assign);
			setState(1107);
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
		enterRule(_localctx, 92, RULE_initializerClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
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
		enterRule(_localctx, 94, RULE_initializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1111);
			initializerClause();
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1112);
				match(Comma);
				setState(1113);
				initializerClause();
				}
				}
				setState(1118);
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
		enterRule(_localctx, 96, RULE_parametersAndQualifiers);
		int _la;
		try {
			int _alt;
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1119);
				match(LeftParen);
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1120);
					parameterDeclarationClause();
					}
				}

				setState(1123);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1124);
					match(LeftParen);
					}
					}
					setState(1127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1129);
					parameterDeclarationClause();
					}
				}

				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1133);
				match(LeftParen);
				setState(1135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1134);
					parameterDeclarationClause();
					}
				}

				setState(1137);
				match(RightParen);
				setState(1139); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1138);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1141); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1144);
				match(LeftParen);
				setState(1146); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1145);
					match(LeftParen);
					}
					}
					setState(1148); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1150);
					parameterDeclarationClause();
					}
				}

				setState(1153);
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
		enterRule(_localctx, 98, RULE_parameterDeclarationClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1157);
			parameterDeclaration();
			setState(1162);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1158);
					match(Comma);
					setState(1159);
					parameterDeclaration();
					}
					} 
				}
				setState(1164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
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
		enterRule(_localctx, 100, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			declSpecifierSeq();
			{
			setState(1166);
			declarator();
			setState(1169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				{
				setState(1167);
				match(Assign);
				setState(1168);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3a\u0496\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\3\2\3\2\7\2k\n\2\f\2\16\2n\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0085\n\3\3\3\3"+
		"\3\6\3\u0089\n\3\r\3\16\3\u008a\3\3\5\3\u008e\n\3\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\5\5\u0097\n\5\3\6\3\6\3\6\7\6\u009c\n\6\f\6\16\6\u009f\13\6\3"+
		"\7\3\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\b\3\b\3\b\7\b\u00ac\n\b"+
		"\f\b\16\b\u00af\13\b\3\t\3\t\3\t\7\t\u00b4\n\t\f\t\16\t\u00b7\13\t\3\n"+
		"\3\n\3\n\7\n\u00bc\n\n\f\n\16\n\u00bf\13\n\3\n\3\n\3\n\7\n\u00c4\n\n\f"+
		"\n\16\n\u00c7\13\n\3\n\3\n\5\n\u00cb\n\n\3\13\3\13\3\13\7\13\u00d0\n\13"+
		"\f\13\16\13\u00d3\13\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00db\n\f\r\f\16\f"+
		"\u00dc\3\f\3\f\3\f\5\f\u00e2\n\f\3\f\3\f\6\f\u00e6\n\f\r\f\16\f\u00e7"+
		"\3\f\3\f\7\f\u00ec\n\f\f\f\16\f\u00ef\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0100\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0107\n\16\3\16\3\16\5\16\u010b\n\16\3\16\6\16\u010e\n"+
		"\16\r\16\16\16\u010f\3\16\5\16\u0113\n\16\3\17\3\17\3\17\3\17\5\17\u0119"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u012e\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u0139\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0143\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\6\25"+
		"\u014e\n\25\r\25\16\25\u014f\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\6\25\u015c\n\25\r\25\16\25\u015d\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\6\25\u0166\n\25\r\25\16\25\u0167\3\25\3\25\3\25\3\25\3\25\6\25\u016f"+
		"\n\25\r\25\16\25\u0170\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5"+
		"\25\u017c\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26"+
		"\u0188\n\26\r\26\16\26\u0189\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\6\26\u0199\n\26\r\26\16\26\u019a\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01b3\n\26\3\27\3\27\3\27\3\27\5\27\u01b9"+
		"\n\27\5\27\u01bb\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01c2\n\27\3\30\3"+
		"\30\3\30\3\31\5\31\u01c8\n\31\3\31\3\31\3\32\3\32\5\32\u01ce\n\32\3\32"+
		"\3\32\6\32\u01d2\n\32\r\32\16\32\u01d3\3\32\5\32\u01d7\n\32\3\32\3\32"+
		"\3\32\5\32\u01dc\n\32\3\32\3\32\6\32\u01e0\n\32\r\32\16\32\u01e1\3\32"+
		"\3\32\3\32\6\32\u01e7\n\32\r\32\16\32\u01e8\3\32\5\32\u01ec\n\32\3\32"+
		"\3\32\5\32\u01f0\n\32\3\33\6\33\u01f3\n\33\r\33\16\33\u01f4\3\34\3\34"+
		"\7\34\u01f9\n\34\f\34\16\34\u01fc\13\34\3\34\5\34\u01ff\n\34\3\35\3\35"+
		"\3\35\3\35\3\35\5\35\u0206\n\35\3\35\3\35\3\35\3\35\3\35\6\35\u020d\n"+
		"\35\r\35\16\35\u020e\3\35\5\35\u0212\n\35\3\35\3\35\3\35\3\35\3\35\6\35"+
		"\u0219\n\35\r\35\16\35\u021a\3\35\3\35\5\35\u021f\n\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\6\35\u0229\n\35\r\35\16\35\u022a\3\35\5\35\u022e"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u0236\n\35\r\35\16\35\u0237\3"+
		"\35\3\35\3\35\5\35\u023d\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0245"+
		"\n\35\3\35\3\35\3\35\5\35\u024a\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0252\n\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u025a\n\36\r\36\16\36\u025b"+
		"\3\36\5\36\u025f\n\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u0267\n\36\r"+
		"\36\16\36\u0268\3\36\3\36\5\36\u026d\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\6\36\u0278\n\36\r\36\16\36\u0279\3\36\5\36\u027d\n\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u0286\n\36\r\36\16\36\u0287\3"+
		"\36\3\36\3\36\5\36\u028d\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u0296\n\36\3\36\3\36\3\36\5\36\u029b\n\36\3\37\3\37\5\37\u029f\n\37\3"+
		"\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \5 \u02ab\n \3 \7 \u02ae\n \f \16 \u02b1"+
		"\13 \3 \3 \3 \5 \u02b6\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u02da\n\"\3\"\3\"\5\"\u02de\n\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\5\"\u02e7\n\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\6\"\u02f5\n\"\r\"\16\"\u02f6\3\"\3\"\3\"\3\"\3\"\6\"\u02fe\n\""+
		"\r\"\16\"\u02ff\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0309\n\"\r\"\16\"\u030a"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0317\n\"\r\"\16\"\u0318"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u032a"+
		"\n\"\r\"\16\"\u032b\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0335\n\"\r\"\16\""+
		"\u0336\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0342\n\"\r\"\16\"\u0343"+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0352\n\"\r\"\16"+
		"\"\u0353\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u035d\n\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0366\n\"\3\"\3\"\5\"\u036a\n\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u0372\n\"\3\"\3\"\5\"\u0376\n\"\3\"\6\"\u0379\n\"\r\"\16\"\u037a\3"+
		"\"\3\"\3\"\3\"\3\"\6\"\u0382\n\"\r\"\16\"\u0383\3\"\3\"\5\"\u0388\n\""+
		"\3\"\3\"\5\"\u038c\n\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u0394\n\"\r\"\16\""+
		"\u0395\3\"\3\"\5\"\u039a\n\"\3\"\3\"\5\"\u039e\n\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\5\"\u03a8\n\"\3\"\3\"\5\"\u03ac\n\"\3\"\3\"\6\"\u03b0\n\""+
		"\r\"\16\"\u03b1\3\"\3\"\3\"\5\"\u03b7\n\"\3#\3#\5#\u03bb\n#\3$\3$\5$\u03bf"+
		"\n$\3$\5$\u03c2\n$\3%\3%\3%\5%\u03c7\n%\3&\3&\3\'\5\'\u03cc\n\'\3\'\5"+
		"\'\u03cf\n\'\3\'\3\'\3(\5(\u03d4\n(\3(\3(\3(\5(\u03d9\n(\3)\3)\3*\3*\5"+
		"*\u03df\n*\3*\3*\5*\u03e3\n*\3*\3*\5*\u03e7\n*\3+\5+\u03ea\n+\3+\3+\3"+
		"+\3+\3+\5+\u03f1\n+\3,\5,\u03f4\n,\3,\5,\u03f7\n,\3,\3,\3,\3,\3,\5,\u03fe"+
		"\n,\3,\5,\u0401\n,\3,\3,\3,\3,\3,\5,\u0408\n,\3,\5,\u040b\n,\3,\3,\6,"+
		"\u040f\n,\r,\16,\u0410\3,\3,\3,\3,\5,\u0417\n,\3,\5,\u041a\n,\3,\3,\6"+
		",\u041e\n,\r,\16,\u041f\3,\3,\3,\3,\5,\u0426\n,\3,\5,\u0429\n,\3,\3,\3"+
		",\6,\u042e\n,\r,\16,\u042f\3,\3,\3,\3,\3,\5,\u0437\n,\3,\5,\u043a\n,\3"+
		",\3,\3,\3,\6,\u0440\n,\r,\16,\u0441\3,\3,\3,\5,\u0447\n,\3-\3-\3-\7-\u044c"+
		"\n-\f-\16-\u044f\13-\3.\3.\5.\u0453\n.\3/\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\61\7\61\u045d\n\61\f\61\16\61\u0460\13\61\3\62\3\62\5\62\u0464\n\62\3"+
		"\62\3\62\6\62\u0468\n\62\r\62\16\62\u0469\3\62\5\62\u046d\n\62\3\62\3"+
		"\62\3\62\5\62\u0472\n\62\3\62\3\62\6\62\u0476\n\62\r\62\16\62\u0477\3"+
		"\62\3\62\3\62\6\62\u047d\n\62\r\62\16\62\u047e\3\62\5\62\u0482\n\62\3"+
		"\62\3\62\5\62\u0486\n\62\3\63\3\63\3\63\7\63\u048b\n\63\f\63\16\63\u048e"+
		"\13\63\3\64\3\64\3\64\3\64\5\64\u0494\n\64\3\64\2\3\26\65\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^"+
		"`bdf\2\17\3\2@A\4\2\66\67BC\3\2,-\4\2,-FG\3\2.\60\4\2\21\21\34\34\3\2"+
		"FG\4\2\65\658<\4\2\t\tXX\4\2\66\67@C\3\2PQ\4\2\17\17\26\26\n\2\n\n\f\f"+
		"\23\23\27\27\32\33\36\36  $$\2\u0547\2l\3\2\2\2\4\u008d\3\2\2\2\6\u008f"+
		"\3\2\2\2\b\u0096\3\2\2\2\n\u0098\3\2\2\2\f\u00a0\3\2\2\2\16\u00a8\3\2"+
		"\2\2\20\u00b0\3\2\2\2\22\u00ca\3\2\2\2\24\u00cc\3\2\2\2\26\u00e1\3\2\2"+
		"\2\30\u00f0\3\2\2\2\32\u0112\3\2\2\2\34\u0118\3\2\2\2\36\u011a\3\2\2\2"+
		" \u011c\3\2\2\2\"\u012d\3\2\2\2$\u0138\3\2\2\2&\u0142\3\2\2\2(\u017b\3"+
		"\2\2\2*\u01b2\3\2\2\2,\u01c1\3\2\2\2.\u01c3\3\2\2\2\60\u01c7\3\2\2\2\62"+
		"\u01ef\3\2\2\2\64\u01f2\3\2\2\2\66\u01f6\3\2\2\28\u0249\3\2\2\2:\u029a"+
		"\3\2\2\2<\u029c\3\2\2\2>\u02b5\3\2\2\2@\u02b7\3\2\2\2B\u03b6\3\2\2\2D"+
		"\u03ba\3\2\2\2F\u03c1\3\2\2\2H\u03c6\3\2\2\2J\u03c8\3\2\2\2L\u03cb\3\2"+
		"\2\2N\u03d3\3\2\2\2P\u03da\3\2\2\2R\u03e6\3\2\2\2T\u03f0\3\2\2\2V\u0446"+
		"\3\2\2\2X\u0448\3\2\2\2Z\u0450\3\2\2\2\\\u0454\3\2\2\2^\u0457\3\2\2\2"+
		"`\u0459\3\2\2\2b\u0485\3\2\2\2d\u0487\3\2\2\2f\u048f\3\2\2\2hk\5H%\2i"+
		"k\5&\24\2jh\3\2\2\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2"+
		"nl\3\2\2\2op\7\2\2\3p\3\3\2\2\2q\u008e\5$\23\2r\u008e\7!\2\2s\u008e\7"+
		"X\2\2tu\7&\2\2uv\5\6\4\2vw\7\'\2\2w\u008e\3\2\2\2xy\7&\2\2yz\5\6\4\2z"+
		"{\b\3\1\2{\u008e\3\2\2\2|}\7&\2\2}~\5\6\4\2~\177\7\'\2\2\177\u0080\7\'"+
		"\2\2\u0080\u0081\b\3\1\2\u0081\u008e\3\2\2\2\u0082\u0085\7X\2\2\u0083"+
		"\u0085\5$\23\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2"+
		"\2\2\u0086\u0089\7X\2\2\u0087\u0089\5$\23\2\u0088\u0086\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008c\3\2\2\2\u008c\u008e\b\3\1\2\u008dq\3\2\2\2\u008dr\3\2"+
		"\2\2\u008ds\3\2\2\2\u008dt\3\2\2\2\u008dx\3\2\2\2\u008d|\3\2\2\2\u008d"+
		"\u0084\3\2\2\2\u008e\5\3\2\2\2\u008f\u0090\5\b\5\2\u0090\7\3\2\2\2\u0091"+
		"\u0097\5\n\6\2\u0092\u0093\5\n\6\2\u0093\u0094\5 \21\2\u0094\u0095\5^"+
		"\60\2\u0095\u0097\3\2\2\2\u0096\u0091\3\2\2\2\u0096\u0092\3\2\2\2\u0097"+
		"\t\3\2\2\2\u0098\u009d\5\f\7\2\u0099\u009a\7E\2\2\u009a\u009c\5\f\7\2"+
		"\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\13\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a5\5\16\b\2\u00a1"+
		"\u00a2\7D\2\2\u00a2\u00a4\5\16\b\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\r\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00ad\5\20\t\2\u00a9\u00aa\t\2\2\2\u00aa\u00ac\5\20\t\2"+
		"\u00ab\u00a9\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae"+
		"\3\2\2\2\u00ae\17\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b5\5\22\n\2\u00b1"+
		"\u00b2\t\3\2\2\u00b2\u00b4\5\22\n\2\u00b3\u00b1\3\2\2\2\u00b4\u00b7\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\21\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b8\u00bd\5\24\13\2\u00b9\u00ba\t\4\2\2\u00ba\u00bc\5"+
		"\24\13\2\u00bb\u00b9\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\u00cb\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c5\5\24"+
		"\13\2\u00c1\u00c2\t\5\2\2\u00c2\u00c4\5\24\13\2\u00c3\u00c1\3\2\2\2\u00c4"+
		"\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2"+
		"\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\b\n\1\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00b8\3\2\2\2\u00ca\u00c0\3\2\2\2\u00cb\23\3\2\2\2\u00cc\u00d1\5\26\f"+
		"\2\u00cd\u00ce\t\6\2\2\u00ce\u00d0\5\26\f\2\u00cf\u00cd\3\2\2\2\u00d0"+
		"\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\25\3\2\2"+
		"\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\b\f\1\2\u00d5\u00e2\5\32\16\2\u00d6"+
		"\u00d7\7\64\2\2\u00d7\u00e2\5\26\f\6\u00d8\u00e2\5\30\r\2\u00d9\u00db"+
		"\5\"\22\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2"+
		"\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\5\26\f\4\u00df\u00e0"+
		"\b\f\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00d4\3\2\2\2\u00e1\u00d6\3\2\2\2\u00e1"+
		"\u00d8\3\2\2\2\u00e1\u00da\3\2\2\2\u00e2\u00ed\3\2\2\2\u00e3\u00e5\f\3"+
		"\2\2\u00e4\u00e6\5\"\22\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ea\b\f"+
		"\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e3\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\27\3\2\2\2\u00ef\u00ed\3\2\2"+
		"\2\u00f0\u00f1\t\7\2\2\u00f1\u00f2\5P)\2\u00f2\u00f3\7(\2\2\u00f3\u00f4"+
		"\5\34\17\2\u00f4\u00f5\7)\2\2\u00f5\31\3\2\2\2\u00f6\u0113\5\4\3\2\u00f7"+
		"\u00f8\7X\2\2\u00f8\u00f9\7(\2\2\u00f9\u00fa\5\6\4\2\u00fa\u00fb\7)\2"+
		"\2\u00fb\u0113\3\2\2\2\u00fc\u00fd\7X\2\2\u00fd\u00ff\7&\2\2\u00fe\u0100"+
		"\5\36\20\2\u00ff\u00fe\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0101\u0113\7\'\2\2\u0102\u0103\7X\2\2\u0103\u0113\t\b\2\2\u0104\u0107"+
		"\7X\2\2\u0105\u0107\5$\23\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010d\3\2\2\2\u0108\u010a\7&\2\2\u0109\u010b\5\36\20\2\u010a\u0109\3"+
		"\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\7\'\2\2\u010d"+
		"\u0108\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0111\3\2\2\2\u0111\u0113\b\16\1\2\u0112\u00f6\3\2\2\2\u0112"+
		"\u00f7\3\2\2\2\u0112\u00fc\3\2\2\2\u0112\u0102\3\2\2\2\u0112\u0106\3\2"+
		"\2\2\u0113\33\3\2\2\2\u0114\u0119\5\n\6\2\u0115\u0116\5\b\5\2\u0116\u0117"+
		"\b\17\1\2\u0117\u0119\3\2\2\2\u0118\u0114\3\2\2\2\u0118\u0115\3\2\2\2"+
		"\u0119\35\3\2\2\2\u011a\u011b\5`\61\2\u011b\37\3\2\2\2\u011c\u011d\t\t"+
		"\2\2\u011d!\3\2\2\2\u011e\u012e\5 \21\2\u011f\u012e\7,\2\2\u0120\u012e"+
		"\7-\2\2\u0121\u012e\7.\2\2\u0122\u012e\7/\2\2\u0123\u012e\7\60\2\2\u0124"+
		"\u012e\7\67\2\2\u0125\u012e\7\66\2\2\u0126\u012e\7C\2\2\u0127\u012e\7"+
		"@\2\2\u0128\u012e\7A\2\2\u0129\u012e\7B\2\2\u012a\u012e\7C\2\2\u012b\u012e"+
		"\7D\2\2\u012c\u012e\7E\2\2\u012d\u011e\3\2\2\2\u012d\u011f\3\2\2\2\u012d"+
		"\u0120\3\2\2\2\u012d\u0121\3\2\2\2\u012d\u0122\3\2\2\2\u012d\u0123\3\2"+
		"\2\2\u012d\u0124\3\2\2\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2\2\2\u012d"+
		"\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e#\3\2\2\2\u012f\u0139"+
		"\7\3\2\2\u0130\u0139\7\4\2\2\u0131\u0139\7\5\2\2\u0132\u0139\7\7\2\2\u0133"+
		"\u0139\7\t\2\2\u0134\u0135\7\b\2\2\u0135\u0139\b\23\1\2\u0136\u0137\7"+
		"\6\2\2\u0137\u0139\b\23\1\2\u0138\u012f\3\2\2\2\u0138\u0130\3\2\2\2\u0138"+
		"\u0131\3\2\2\2\u0138\u0132\3\2\2\2\u0138\u0133\3\2\2\2\u0138\u0134\3\2"+
		"\2\2\u0138\u0136\3\2\2\2\u0139%\3\2\2\2\u013a\u0143\5\60\31\2\u013b\u0143"+
		"\5\62\32\2\u013c\u0143\5\66\34\2\u013d\u0143\5B\"\2\u013e\u0143\5,\27"+
		"\2\u013f\u0143\5(\25\2\u0140\u0143\5*\26\2\u0141\u0143\5L\'\2\u0142\u013a"+
		"\3\2\2\2\u0142\u013b\3\2\2\2\u0142\u013c\3\2\2\2\u0142\u013d\3\2\2\2\u0142"+
		"\u013e\3\2\2\2\u0142\u013f\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\'\3\2\2\2\u0144\u0145\7T\2\2\u0145\u0146\7&\2\2\u0146\u0147"+
		"\5\34\17\2\u0147\u0148\7\'\2\2\u0148\u0149\7L\2\2\u0149\u017c\3\2\2\2"+
		"\u014a\u014b\7T\2\2\u014b\u014d\7&\2\2\u014c\u014e\7&\2\2\u014d\u014c"+
		"\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\3\2\2\2\u0151\u0152\5\34\17\2\u0152\u0153\7\'\2\2\u0153\u0154\7"+
		"L\2\2\u0154\u0155\b\25\1\2\u0155\u017c\3\2\2\2\u0156\u0157\7T\2\2\u0157"+
		"\u0158\7&\2\2\u0158\u0159\5\34\17\2\u0159\u015b\7\'\2\2\u015a\u015c\7"+
		"\'\2\2\u015b\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d"+
		"\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7L\2\2\u0160\u0161\b\25"+
		"\1\2\u0161\u017c\3\2\2\2\u0162\u0163\7T\2\2\u0163\u0165\5\34\17\2\u0164"+
		"\u0166\7\'\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0165\3\2"+
		"\2\2\u0167\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\7L\2\2\u016a"+
		"\u016b\b\25\1\2\u016b\u017c\3\2\2\2\u016c\u016e\7T\2\2\u016d\u016f\7&"+
		"\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2\2\2\u0170"+
		"\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\5\34\17\2\u0173\u0174\7"+
		"L\2\2\u0174\u0175\b\25\1\2\u0175\u017c\3\2\2\2\u0176\u0177\7T\2\2\u0177"+
		"\u0178\5\34\17\2\u0178\u0179\7L\2\2\u0179\u017a\b\25\1\2\u017a\u017c\3"+
		"\2\2\2\u017b\u0144\3\2\2\2\u017b\u014a\3\2\2\2\u017b\u0156\3\2\2\2\u017b"+
		"\u0162\3\2\2\2\u017b\u016c\3\2\2\2\u017b\u0176\3\2\2\2\u017c)\3\2\2\2"+
		"\u017d\u017e\7S\2\2\u017e\u017f\7&\2\2\u017f\u0180\7\7\2\2\u0180\u0181"+
		"\7H\2\2\u0181\u0182\7X\2\2\u0182\u0183\7\'\2\2\u0183\u01b3\7L\2\2\u0184"+
		"\u0185\7S\2\2\u0185\u0187\7&\2\2\u0186\u0188\7&\2\2\u0187\u0186\3\2\2"+
		"\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b"+
		"\3\2\2\2\u018b\u018c\7\7\2\2\u018c\u018d\7H\2\2\u018d\u018e\7X\2\2\u018e"+
		"\u018f\7\'\2\2\u018f\u0190\7L\2\2\u0190\u01b3\b\26\1\2\u0191\u0192\7S"+
		"\2\2\u0192\u0193\7&\2\2\u0193\u0194\7\7\2\2\u0194\u0195\7H\2\2\u0195\u0196"+
		"\7X\2\2\u0196\u0198\7\'\2\2\u0197\u0199\7\'\2\2\u0198\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2"+
		"\2\2\u019c\u019d\7L\2\2\u019d\u01b3\b\26\1\2\u019e\u019f\7S\2\2\u019f"+
		"\u01a0\7\7\2\2\u01a0\u01a1\7H\2\2\u01a1\u01a2\7X\2\2\u01a2\u01a3\7\'\2"+
		"\2\u01a3\u01a4\7L\2\2\u01a4\u01b3\b\26\1\2\u01a5\u01a6\7S\2\2\u01a6\u01a7"+
		"\7&\2\2\u01a7\u01a8\7\7\2\2\u01a8\u01a9\7H\2\2\u01a9\u01aa\7X\2\2\u01aa"+
		"\u01ab\7L\2\2\u01ab\u01b3\b\26\1\2\u01ac\u01ad\7S\2\2\u01ad\u01ae\7\7"+
		"\2\2\u01ae\u01af\7H\2\2\u01af\u01b0\7X\2\2\u01b0\u01b1\7L\2\2\u01b1\u01b3"+
		"\b\26\1\2\u01b2\u017d\3\2\2\2\u01b2\u0184\3\2\2\2\u01b2\u0191\3\2\2\2"+
		"\u01b2\u019e\3\2\2\2\u01b2\u01a5\3\2\2\2\u01b2\u01ac\3\2\2\2\u01b3+\3"+
		"\2\2\2\u01b4\u01bb\7\13\2\2\u01b5\u01bb\7\20\2\2\u01b6\u01b8\7\35\2\2"+
		"\u01b7\u01b9\5\34\17\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01b4\3\2\2\2\u01ba\u01b5\3\2\2\2\u01ba\u01b6\3\2\2\2\u01bb"+
		"\u01bc\3\2\2\2\u01bc\u01c2\7L\2\2\u01bd\u01be\7\35\2\2\u01be\u01bf\5."+
		"\30\2\u01bf\u01c0\7L\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01ba\3\2\2\2\u01c1"+
		"\u01bd\3\2\2\2\u01c2-\3\2\2\2\u01c3\u01c4\5P)\2\u01c4\u01c5\b\30\1\2\u01c5"+
		"/\3\2\2\2\u01c6\u01c8\5\6\4\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2"+
		"\u01c8\u01c9\3\2\2\2\u01c9\u01ca\7L\2\2\u01ca\61\3\2\2\2\u01cb\u01cd\7"+
		"*\2\2\u01cc\u01ce\5\64\33\2\u01cd\u01cc\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01cf\3\2\2\2\u01cf\u01f0\7+\2\2\u01d0\u01d2\7*\2\2\u01d1\u01d0\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6"+
		"\3\2\2\2\u01d5\u01d7\5\64\33\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2"+
		"\u01d7\u01d8\3\2\2\2\u01d8\u01f0\b\32\1\2\u01d9\u01db\7*\2\2\u01da\u01dc"+
		"\5\64\33\2\u01db\u01da\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd\3\2\2\2"+
		"\u01dd\u01df\7+\2\2\u01de\u01e0\7+\2\2\u01df\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01f0\b\32\1\2\u01e4\u01e6\7*\2\2\u01e5\u01e7\7*\2\2\u01e6\u01e5\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u01eb\3\2\2\2\u01ea\u01ec\5\64\33\2\u01eb\u01ea\3\2\2\2\u01eb\u01ec\3"+
		"\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ee\7+\2\2\u01ee\u01f0\b\32\1\2\u01ef"+
		"\u01cb\3\2\2\2\u01ef\u01d1\3\2\2\2\u01ef\u01d9\3\2\2\2\u01ef\u01e4\3\2"+
		"\2\2\u01f0\63\3\2\2\2\u01f1\u01f3\5&\24\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\65\3\2\2\2\u01f6"+
		"\u01fa\58\35\2\u01f7\u01f9\5:\36\2\u01f8\u01f7\3\2\2\2\u01f9\u01fc\3\2"+
		"\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd\u01ff\5<\37\2\u01fe\u01fd\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\67\3\2\2\2\u0200\u0201\7\31\2\2\u0201\u0202\7&\2\2\u0202\u0203"+
		"\5> \2\u0203\u0205\7\'\2\2\u0204\u0206\7U\2\2\u0205\u0204\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0208\5\62\32\2\u0208\u024a\3"+
		"\2\2\2\u0209\u020a\7\31\2\2\u020a\u020c\5> \2\u020b\u020d\7\'\2\2\u020c"+
		"\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2"+
		"\2\2\u020f\u0211\3\2\2\2\u0210\u0212\7U\2\2\u0211\u0210\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214\5\62\32\2\u0214\u0215\b"+
		"\35\1\2\u0215\u024a\3\2\2\2\u0216\u0218\7\31\2\2\u0217\u0219\7&\2\2\u0218"+
		"\u0217\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u0218\3\2\2\2\u021a\u021b\3\2"+
		"\2\2\u021b\u021c\3\2\2\2\u021c\u021e\5> \2\u021d\u021f\7U\2\2\u021e\u021d"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u0221\5\62\32\2"+
		"\u0221\u0222\b\35\1\2\u0222\u024a\3\2\2\2\u0223\u0224\7\31\2\2\u0224\u0225"+
		"\7&\2\2\u0225\u0226\5> \2\u0226\u0228\7\'\2\2\u0227\u0229\7\'\2\2\u0228"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2"+
		"\2\2\u022b\u022d\3\2\2\2\u022c\u022e\7U\2\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\5\62\32\2\u0230\u0231\b"+
		"\35\1\2\u0231\u024a\3\2\2\2\u0232\u0233\7\31\2\2\u0233\u0235\7&\2\2\u0234"+
		"\u0236\7&\2\2\u0235\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0235\3\2"+
		"\2\2\u0237\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\5> \2\u023a\u023c"+
		"\7\'\2\2\u023b\u023d\7U\2\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u023f\5\62\32\2\u023f\u0240\b\35\1\2\u0240\u024a"+
		"\3\2\2\2\u0241\u0242\7\31\2\2\u0242\u0244\5> \2\u0243\u0245\7U\2\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\5\62"+
		"\32\2\u0247\u0248\b\35\1\2\u0248\u024a\3\2\2\2\u0249\u0200\3\2\2\2\u0249"+
		"\u0209\3\2\2\2\u0249\u0216\3\2\2\2\u0249\u0223\3\2\2\2\u0249\u0232\3\2"+
		"\2\2\u0249\u0241\3\2\2\2\u024a9\3\2\2\2\u024b\u024c\7\24\2\2\u024c\u024d"+
		"\7\31\2\2\u024d\u024e\7&\2\2\u024e\u024f\5> \2\u024f\u0251\7\'\2\2\u0250"+
		"\u0252\7U\2\2\u0251\u0250\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0254\5\62\32\2\u0254\u029b\3\2\2\2\u0255\u0256\7\24\2\2\u0256"+
		"\u0257\7\31\2\2\u0257\u0259\5> \2\u0258\u025a\7\'\2\2\u0259\u0258\3\2"+
		"\2\2\u025a\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025e\3\2\2\2\u025d\u025f\7U\2\2\u025e\u025d\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u0260\3\2\2\2\u0260\u0261\5\62\32\2\u0261\u0262\b\36\1\2\u0262"+
		"\u029b\3\2\2\2\u0263\u0264\7\24\2\2\u0264\u0266\7\31\2\2\u0265\u0267\7"+
		"&\2\2\u0266\u0265\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0266\3\2\2\2\u0268"+
		"\u0269\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\5> \2\u026b\u026d\7U\2"+
		"\2\u026c\u026b\3\2\2\2\u026c\u026d\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u026f"+
		"\5\62\32\2\u026f\u0270\b\36\1\2\u0270\u029b\3\2\2\2\u0271\u0272\7\24\2"+
		"\2\u0272\u0273\7\31\2\2\u0273\u0274\7&\2\2\u0274\u0275\5> \2\u0275\u0277"+
		"\7\'\2\2\u0276\u0278\7\'\2\2\u0277\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u027d\7U"+
		"\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"\u027f\5\62\32\2\u027f\u0280\b\36\1\2\u0280\u029b\3\2\2\2\u0281\u0282"+
		"\7\24\2\2\u0282\u0283\7\31\2\2\u0283\u0285\7&\2\2\u0284\u0286\7&\2\2\u0285"+
		"\u0284\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0285\3\2\2\2\u0287\u0288\3\2"+
		"\2\2\u0288\u0289\3\2\2\2\u0289\u028a\5> \2\u028a\u028c\7\'\2\2\u028b\u028d"+
		"\7U\2\2\u028c\u028b\3\2\2\2\u028c\u028d\3\2\2\2\u028d\u028e\3\2\2\2\u028e"+
		"\u028f\5\62\32\2\u028f\u0290\b\36\1\2\u0290\u029b\3\2\2\2\u0291\u0292"+
		"\7\24\2\2\u0292\u0293\7\31\2\2\u0293\u0295\5> \2\u0294\u0296\7U\2\2\u0295"+
		"\u0294\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0298\5\62"+
		"\32\2\u0298\u0299\b\36\1\2\u0299\u029b\3\2\2\2\u029a\u024b\3\2\2\2\u029a"+
		"\u0255\3\2\2\2\u029a\u0263\3\2\2\2\u029a\u0271\3\2\2\2\u029a\u0281\3\2"+
		"\2\2\u029a\u0291\3\2\2\2\u029b;\3\2\2\2\u029c\u029e\7\24\2\2\u029d\u029f"+
		"\7U\2\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a1\5\62\32\2\u02a1=\3\2\2\2\u02a2\u02a3\5\n\6\2\u02a3\u02a4\5@!\2"+
		"\u02a4\u02a5\5\n\6\2\u02a5\u02b6\3\2\2\2\u02a6\u02af\t\n\2\2\u02a7\u02ab"+
		"\7E\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02ab\7D\2\2\u02aa\u02a7\3\2\2\2\u02aa"+
		"\u02a8\3\2\2\2\u02aa\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac\u02ae\t\n"+
		"\2\2\u02ad\u02aa\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af"+
		"\u02b0\3\2\2\2\u02b0\u02b6\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b3\5\34"+
		"\17\2\u02b3\u02b4\b \1\2\u02b4\u02b6\3\2\2\2\u02b5\u02a2\3\2\2\2\u02b5"+
		"\u02a6\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b6?\3\2\2\2\u02b7\u02b8\t\13\2\2"+
		"\u02b8A\3\2\2\2\u02b9\u02ba\7\30\2\2\u02ba\u02bb\5F$\2\u02bb\u02bc\t\f"+
		"\2\2\u02bc\u02bd\7R\2\2\u02bd\u02be\5\34\17\2\u02be\u02bf\5\62\32\2\u02bf"+
		"\u03b7\3\2\2\2\u02c0\u02c1\7%\2\2\u02c1\u02c2\5F$\2\u02c2\u02c3\t\f\2"+
		"\2\u02c3\u02c4\7R\2\2\u02c4\u02c5\5\34\17\2\u02c5\u02c6\5\62\32\2\u02c6"+
		"\u03b7\3\2\2\2\u02c7\u02c8\7%\2\2\u02c8\u02c9\7&\2\2\u02c9\u02ca\5> \2"+
		"\u02ca\u02cb\7\'\2\2\u02cb\u02cc\5\62\32\2\u02cc\u03b7\3\2\2\2\u02cd\u02ce"+
		"\7\22\2\2\u02ce\u02cf\5\62\32\2\u02cf\u02d0\7%\2\2\u02d0\u02d1\7&\2\2"+
		"\u02d1\u02d2\5> \2\u02d2\u02d3\7\'\2\2\u02d3\u02d4\7L\2\2\u02d4\u03b7"+
		"\3\2\2\2\u02d5\u02d6\7\30\2\2\u02d6\u02d7\7&\2\2\u02d7\u02d9\5D#\2\u02d8"+
		"\u02da\5> \2\u02d9\u02d8\3\2\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\3\2\2"+
		"\2\u02db\u02dd\7L\2\2\u02dc\u02de\5\6\4\2\u02dd\u02dc\3\2\2\2\u02dd\u02de"+
		"\3\2\2\2\u02de\u02df\3\2\2\2\u02df\u02e0\7\'\2\2\u02e0\u02e1\5\62\32\2"+
		"\u02e1\u03b7\3\2\2\2\u02e2\u02e3\7%\2\2\u02e3\u02e6\5F$\2\u02e4\u02e7"+
		"\t\f\2\2\u02e5\u02e7\7R\2\2\u02e6\u02e4\3\2\2\2\u02e6\u02e5\3\2\2\2\u02e7"+
		"\u02e8\3\2\2\2\u02e8\u02e9\5\34\17\2\u02e9\u02ea\5\62\32\2\u02ea\u02eb"+
		"\b\"\1\2\u02eb\u03b7\3\2\2\2\u02ec\u02ed\7%\2\2\u02ed\u02ee\5> \2\u02ee"+
		"\u02ef\5\62\32\2\u02ef\u02f0\b\"\1\2\u02f0\u03b7\3\2\2\2\u02f1\u02f2\7"+
		"%\2\2\u02f2\u02f4\5> \2\u02f3\u02f5\7\'\2\2\u02f4\u02f3\3\2\2\2\u02f5"+
		"\u02f6\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\3\2"+
		"\2\2\u02f8\u02f9\5\62\32\2\u02f9\u02fa\b\"\1\2\u02fa\u03b7\3\2\2\2\u02fb"+
		"\u02fd\7%\2\2\u02fc\u02fe\7&\2\2\u02fd\u02fc\3\2\2\2\u02fe\u02ff\3\2\2"+
		"\2\u02ff\u02fd\3\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0302"+
		"\5> \2\u0302\u0303\5\62\32\2\u0303\u0304\b\"\1\2\u0304\u03b7\3\2\2\2\u0305"+
		"\u0306\7%\2\2\u0306\u0308\7&\2\2\u0307\u0309\7&\2\2\u0308\u0307\3\2\2"+
		"\2\u0309\u030a\3\2\2\2\u030a\u0308\3\2\2\2\u030a\u030b\3\2\2\2\u030b\u030c"+
		"\3\2\2\2\u030c\u030d\5> \2\u030d\u030e\7\'\2\2\u030e\u030f\5\62\32\2\u030f"+
		"\u0310\b\"\1\2\u0310\u03b7\3\2\2\2\u0311\u0312\7%\2\2\u0312\u0313\7&\2"+
		"\2\u0313\u0314\5> \2\u0314\u0316\7\'\2\2\u0315\u0317\7\'\2\2\u0316\u0315"+
		"\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0319\3\2\2\2\u0319"+
		"\u031a\3\2\2\2\u031a\u031b\5\62\32\2\u031b\u031c\b\"\1\2\u031c\u03b7\3"+
		"\2\2\2\u031d\u031e\7\22\2\2\u031e\u031f\5\62\32\2\u031f\u0320\7%\2\2\u0320"+
		"\u0321\5> \2\u0321\u0322\7L\2\2\u0322\u0323\b\"\1\2\u0323\u03b7\3\2\2"+
		"\2\u0324\u0325\7\22\2\2\u0325\u0326\5\62\32\2\u0326\u0327\7%\2\2\u0327"+
		"\u0329\5> \2\u0328\u032a\7\'\2\2\u0329\u0328\3\2\2\2\u032a\u032b\3\2\2"+
		"\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032e"+
		"\7L\2\2\u032e\u032f\b\"\1\2\u032f\u03b7\3\2\2\2\u0330\u0331\7\22\2\2\u0331"+
		"\u0332\5\62\32\2\u0332\u0334\7%\2\2\u0333\u0335\7&\2\2\u0334\u0333\3\2"+
		"\2\2\u0335\u0336\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337"+
		"\u0338\3\2\2\2\u0338\u0339\5> \2\u0339\u033a\7L\2\2\u033a\u033b\b\"\1"+
		"\2\u033b\u03b7\3\2\2\2\u033c\u033d\7\22\2\2\u033d\u033e\5\62\32\2\u033e"+
		"\u033f\7%\2\2\u033f\u0341\7&\2\2\u0340\u0342\7&\2\2\u0341\u0340\3\2\2"+
		"\2\u0342\u0343\3\2\2\2\u0343\u0341\3\2\2\2\u0343\u0344\3\2\2\2\u0344\u0345"+
		"\3\2\2\2\u0345\u0346\5> \2\u0346\u0347\7\'\2\2\u0347\u0348\7L\2\2\u0348"+
		"\u0349\b\"\1\2\u0349\u03b7\3\2\2\2\u034a\u034b\7\22\2\2\u034b\u034c\5"+
		"\62\32\2\u034c\u034d\7%\2\2\u034d\u034e\7&\2\2\u034e\u034f\5> \2\u034f"+
		"\u0351\7\'\2\2\u0350\u0352\7\'\2\2\u0351\u0350\3\2\2\2\u0352\u0353\3\2"+
		"\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\7L\2\2\u0356\u0357\b\"\1\2\u0357\u03b7\3\2\2\2\u0358\u0359\7\30"+
		"\2\2\u0359\u035c\5F$\2\u035a\u035d\t\f\2\2\u035b\u035d\7R\2\2\u035c\u035a"+
		"\3\2\2\2\u035c\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e\u035f\5\34\17\2"+
		"\u035f\u0360\5\62\32\2\u0360\u0361\b\"\1\2\u0361\u03b7\3\2\2\2\u0362\u0363"+
		"\7\30\2\2\u0363\u0365\5D#\2\u0364\u0366\5> \2\u0365\u0364\3\2\2\2\u0365"+
		"\u0366\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0369\7L\2\2\u0368\u036a\5\6"+
		"\4\2\u0369\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u036b\3\2\2\2\u036b"+
		"\u036c\5\62\32\2\u036c\u036d\b\"\1\2\u036d\u03b7\3\2\2\2\u036e\u036f\7"+
		"\30\2\2\u036f\u0371\5D#\2\u0370\u0372\5> \2\u0371\u0370\3\2\2\2\u0371"+
		"\u0372\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u0375\7L\2\2\u0374\u0376\5\6"+
		"\4\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\3\2\2\2\u0377"+
		"\u0379\7\'\2\2\u0378\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a\u0378\3\2"+
		"\2\2\u037a\u037b\3\2\2\2\u037b\u037c\3\2\2\2\u037c\u037d\5\62\32\2\u037d"+
		"\u037e\b\"\1\2\u037e\u03b7\3\2\2\2\u037f\u0381\7\30\2\2\u0380\u0382\7"+
		"&\2\2\u0381\u0380\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u0381\3\2\2\2\u0383"+
		"\u0384\3\2\2\2\u0384\u0385\3\2\2\2\u0385\u0387\5D#\2\u0386\u0388\5> \2"+
		"\u0387\u0386\3\2\2\2\u0387\u0388\3\2\2\2\u0388\u0389\3\2\2\2\u0389\u038b"+
		"\7L\2\2\u038a\u038c\5\6\4\2\u038b\u038a\3\2\2\2\u038b\u038c\3\2\2\2\u038c"+
		"\u038d\3\2\2\2\u038d\u038e\5\62\32\2\u038e\u038f\b\"\1\2\u038f\u03b7\3"+
		"\2\2\2\u0390\u0391\7\30\2\2\u0391\u0393\7&\2\2\u0392\u0394\7&\2\2\u0393"+
		"\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0393\3\2\2\2\u0395\u0396\3\2"+
		"\2\2\u0396\u0397\3\2\2\2\u0397\u0399\5D#\2\u0398\u039a\5> \2\u0399\u0398"+
		"\3\2\2\2\u0399\u039a\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u039d\7L\2\2\u039c"+
		"\u039e\5\6\4\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2"+
		"\2\2\u039f\u03a0\7\'\2\2\u03a0\u03a1\5\62\32\2\u03a1\u03a2\b\"\1\2\u03a2"+
		"\u03b7\3\2\2\2\u03a3\u03a4\7\30\2\2\u03a4\u03a5\7&\2\2\u03a5\u03a7\5D"+
		"#\2\u03a6\u03a8\5> \2\u03a7\u03a6\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9"+
		"\3\2\2\2\u03a9\u03ab\7L\2\2\u03aa\u03ac\5\6\4\2\u03ab\u03aa\3\2\2\2\u03ab"+
		"\u03ac\3\2\2\2\u03ac\u03ad\3\2\2\2\u03ad\u03af\7\'\2\2\u03ae\u03b0\7\'"+
		"\2\2\u03af\u03ae\3\2\2\2\u03b0\u03b1\3\2\2\2\u03b1\u03af\3\2\2\2\u03b1"+
		"\u03b2\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03b4\5\62\32\2\u03b4\u03b5\b"+
		"\"\1\2\u03b5\u03b7\3\2\2\2\u03b6\u02b9\3\2\2\2\u03b6\u02c0\3\2\2\2\u03b6"+
		"\u02c7\3\2\2\2\u03b6\u02cd\3\2\2\2\u03b6\u02d5\3\2\2\2\u03b6\u02e2\3\2"+
		"\2\2\u03b6\u02ec\3\2\2\2\u03b6\u02f1\3\2\2\2\u03b6\u02fb\3\2\2\2\u03b6"+
		"\u0305\3\2\2\2\u03b6\u0311\3\2\2\2\u03b6\u031d\3\2\2\2\u03b6\u0324\3\2"+
		"\2\2\u03b6\u0330\3\2\2\2\u03b6\u033c\3\2\2\2\u03b6\u034a\3\2\2\2\u03b6"+
		"\u0358\3\2\2\2\u03b6\u0362\3\2\2\2\u03b6\u036e\3\2\2\2\u03b6\u037f\3\2"+
		"\2\2\u03b6\u0390\3\2\2\2\u03b6\u03a3\3\2\2\2\u03b7C\3\2\2\2\u03b8\u03bb"+
		"\5\60\31\2\u03b9\u03bb\5L\'\2\u03ba\u03b8\3\2\2\2\u03ba\u03b9\3\2\2\2"+
		"\u03bbE\3\2\2\2\u03bc\u03c2\5\6\4\2\u03bd\u03bf\5N(\2\u03be\u03bd\3\2"+
		"\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c2\5X-\2\u03c1\u03bc"+
		"\3\2\2\2\u03c1\u03be\3\2\2\2\u03c2G\3\2\2\2\u03c3\u03c7\5L\'\2\u03c4\u03c7"+
		"\5T+\2\u03c5\u03c7\5J&\2\u03c6\u03c3\3\2\2\2\u03c6\u03c4\3\2\2\2\u03c6"+
		"\u03c5\3\2\2\2\u03c7I\3\2\2\2\u03c8\u03c9\7L\2\2\u03c9K\3\2\2\2\u03ca"+
		"\u03cc\5N(\2\u03cb\u03ca\3\2\2\2\u03cb\u03cc\3\2\2\2\u03cc\u03ce\3\2\2"+
		"\2\u03cd\u03cf\5X-\2\u03ce\u03cd\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d0"+
		"\3\2\2\2\u03d0\u03d1\7L\2\2\u03d1M\3\2\2\2\u03d2\u03d4\t\r\2\2\u03d3\u03d2"+
		"\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5\u03d8\5P)\2\u03d6"+
		"\u03d7\7(\2\2\u03d7\u03d9\7)\2\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2"+
		"\2\u03d9O\3\2\2\2\u03da\u03db\t\16\2\2\u03dbQ\3\2\2\2\u03dc\u03de\7X\2"+
		"\2\u03dd\u03df\5b\62\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u03e7"+
		"\3\2\2\2\u03e0\u03e2\5$\23\2\u03e1\u03e3\5b\62\2\u03e2\u03e1\3\2\2\2\u03e2"+
		"\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u03e5\b*\1\2\u03e5\u03e7\3\2"+
		"\2\2\u03e6\u03dc\3\2\2\2\u03e6\u03e0\3\2\2\2\u03e7S\3\2\2\2\u03e8\u03ea"+
		"\7V\2\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb"+
		"\u03ec\5N(\2\u03ec\u03ed\5R*\2\u03ed\u03ee\5\62\32\2\u03ee\u03f1\3\2\2"+
		"\2\u03ef\u03f1\5V,\2\u03f0\u03e9\3\2\2\2\u03f0\u03ef\3\2\2\2\u03f1U\3"+
		"\2\2\2\u03f2\u03f4\7V\2\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4"+
		"\u03f6\3\2\2\2\u03f5\u03f7\5N(\2\u03f6\u03f5\3\2\2\2\u03f6\u03f7\3\2\2"+
		"\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\7W\2\2\u03f9\u03fa\7&\2\2\u03fa\u03fb"+
		"\7\'\2\2\u03fb\u0447\5\62\32\2\u03fc\u03fe\7V\2\2\u03fd\u03fc\3\2\2\2"+
		"\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u0401\5N(\2\u0400\u03ff"+
		"\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\7W\2\2\u0403"+
		"\u0404\5\62\32\2\u0404\u0405\b,\1\2\u0405\u0447\3\2\2\2\u0406\u0408\7"+
		"V\2\2\u0407\u0406\3\2\2\2\u0407\u0408\3\2\2\2\u0408\u040a\3\2\2\2\u0409"+
		"\u040b\5N(\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u040c\3\2\2"+
		"\2\u040c\u040e\7W\2\2\u040d\u040f\7\'\2\2\u040e\u040d\3\2\2\2\u040f\u0410"+
		"\3\2\2\2\u0410\u040e\3\2\2\2\u0410\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412"+
		"\u0413\5\62\32\2\u0413\u0414\b,\1\2\u0414\u0447\3\2\2\2\u0415\u0417\7"+
		"V\2\2\u0416\u0415\3\2\2\2\u0416\u0417\3\2\2\2\u0417\u0419\3\2\2\2\u0418"+
		"\u041a\5N(\2\u0419\u0418\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b\3\2\2"+
		"\2\u041b\u041d\7W\2\2\u041c\u041e\7&\2\2\u041d\u041c\3\2\2\2\u041e\u041f"+
		"\3\2\2\2\u041f\u041d\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2\2\2\u0421"+
		"\u0422\5\62\32\2\u0422\u0423\b,\1\2\u0423\u0447\3\2\2\2\u0424\u0426\7"+
		"V\2\2\u0425\u0424\3\2\2\2\u0425\u0426\3\2\2\2\u0426\u0428\3\2\2\2\u0427"+
		"\u0429\5N(\2\u0428\u0427\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\3\2\2"+
		"\2\u042a\u042b\7W\2\2\u042b\u042d\7&\2\2\u042c\u042e\7&\2\2\u042d\u042c"+
		"\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u042d\3\2\2\2\u042f\u0430\3\2\2\2\u0430"+
		"\u0431\3\2\2\2\u0431\u0432\7\'\2\2\u0432\u0433\5\62\32\2\u0433\u0434\b"+
		",\1\2\u0434\u0447\3\2\2\2\u0435\u0437\7V\2\2\u0436\u0435\3\2\2\2\u0436"+
		"\u0437\3\2\2\2\u0437\u0439\3\2\2\2\u0438\u043a\5N(\2\u0439\u0438\3\2\2"+
		"\2\u0439\u043a\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043c\7W\2\2\u043c\u043d"+
		"\7&\2\2\u043d\u043f\7\'\2\2\u043e\u0440\7\'\2\2\u043f\u043e\3\2\2\2\u0440"+
		"\u0441\3\2\2\2\u0441\u043f\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0443\3\2"+
		"\2\2\u0443\u0444\5\62\32\2\u0444\u0445\b,\1\2\u0445\u0447\3\2\2\2\u0446"+
		"\u03f3\3\2\2\2\u0446\u03fd\3\2\2\2\u0446\u0407\3\2\2\2\u0446\u0416\3\2"+
		"\2\2\u0446\u0425\3\2\2\2\u0446\u0436\3\2\2\2\u0447W\3\2\2\2\u0448\u044d"+
		"\5Z.\2\u0449\u044a\7H\2\2\u044a\u044c\5Z.\2\u044b\u0449\3\2\2\2\u044c"+
		"\u044f\3\2\2\2\u044d\u044b\3\2\2\2\u044d\u044e\3\2\2\2\u044eY\3\2\2\2"+
		"\u044f\u044d\3\2\2\2\u0450\u0452\5R*\2\u0451\u0453\5\\/\2\u0452\u0451"+
		"\3\2\2\2\u0452\u0453\3\2\2\2\u0453[\3\2\2\2\u0454\u0455\7\65\2\2\u0455"+
		"\u0456\5^\60\2\u0456]\3\2\2\2\u0457\u0458\5\34\17\2\u0458_\3\2\2\2\u0459"+
		"\u045e\5^\60\2\u045a\u045b\7H\2\2\u045b\u045d\5^\60\2\u045c\u045a\3\2"+
		"\2\2\u045d\u0460\3\2\2\2\u045e\u045c\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"a\3\2\2\2\u0460\u045e\3\2\2\2\u0461\u0463\7&\2\2\u0462\u0464\5d\63\2\u0463"+
		"\u0462\3\2\2\2\u0463\u0464\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0486\7\'"+
		"\2\2\u0466\u0468\7&\2\2\u0467\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u0467\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046c\3\2\2\2\u046b\u046d\5d"+
		"\63\2\u046c\u046b\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046e\3\2\2\2\u046e"+
		"\u0486\b\62\1\2\u046f\u0471\7&\2\2\u0470\u0472\5d\63\2\u0471\u0470\3\2"+
		"\2\2\u0471\u0472\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\7\'\2\2\u0474"+
		"\u0476\7\'\2\2\u0475\u0474\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0475\3\2"+
		"\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u0486\b\62\1\2\u047a"+
		"\u047c\7&\2\2\u047b\u047d\7&\2\2\u047c\u047b\3\2\2\2\u047d\u047e\3\2\2"+
		"\2\u047e\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0481\3\2\2\2\u0480\u0482"+
		"\5d\63\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482\u0483\3\2\2\2\u0483"+
		"\u0484\7\'\2\2\u0484\u0486\b\62\1\2\u0485\u0461\3\2\2\2\u0485\u0467\3"+
		"\2\2\2\u0485\u046f\3\2\2\2\u0485\u047a\3\2\2\2\u0486c\3\2\2\2\u0487\u048c"+
		"\5f\64\2\u0488\u0489\7H\2\2\u0489\u048b\5f\64\2\u048a\u0488\3\2\2\2\u048b"+
		"\u048e\3\2\2\2\u048c\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048de\3\2\2\2"+
		"\u048e\u048c\3\2\2\2\u048f\u0490\5N(\2\u0490\u0493\5R*\2\u0491\u0492\7"+
		"\65\2\2\u0492\u0494\5^\60\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"g\3\2\2\2\u0095jl\u0084\u0088\u008a\u008d\u0096\u009d\u00a5\u00ad\u00b5"+
		"\u00bd\u00c5\u00ca\u00d1\u00dc\u00e1\u00e7\u00ed\u00ff\u0106\u010a\u010f"+
		"\u0112\u0118\u012d\u0138\u0142\u014f\u015d\u0167\u0170\u017b\u0189\u019a"+
		"\u01b2\u01b8\u01ba\u01c1\u01c7\u01cd\u01d3\u01d6\u01db\u01e1\u01e8\u01eb"+
		"\u01ef\u01f4\u01fa\u01fe\u0205\u020e\u0211\u021a\u021e\u022a\u022d\u0237"+
		"\u023c\u0244\u0249\u0251\u025b\u025e\u0268\u026c\u0279\u027c\u0287\u028c"+
		"\u0295\u029a\u029e\u02aa\u02af\u02b5\u02d9\u02dd\u02e6\u02f6\u02ff\u030a"+
		"\u0318\u032b\u0336\u0343\u0353\u035c\u0365\u0369\u0371\u0375\u037a\u0383"+
		"\u0387\u038b\u0395\u0399\u039d\u03a7\u03ab\u03b1\u03b6\u03ba\u03be\u03c1"+
		"\u03c6\u03cb\u03ce\u03d3\u03d8\u03de\u03e2\u03e6\u03e9\u03f0\u03f3\u03f6"+
		"\u03fd\u0400\u0407\u040a\u0410\u0416\u0419\u041f\u0425\u0428\u042f\u0436"+
		"\u0439\u0441\u0446\u044d\u0452\u045e\u0463\u0469\u046c\u0471\u0477\u047e"+
		"\u0481\u0485\u048c\u0493";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}