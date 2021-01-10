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
		RULE_elseStatement = 29, RULE_condition = 30, RULE_iterationStatement = 31, 
		RULE_forInitStatement = 32, RULE_iterationInit = 33, RULE_declaration = 34, 
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
			"scanStatement", "jumpStatement", "badReturn", "expressionStatement", 
			"compoundStatement", "statementSeq", "selectionStatement", "ifStatement", 
			"elseIfStatement", "elseStatement", "condition", "iterationStatement", 
			"forInitStatement", "iterationInit", "declaration", "emptyDeclaration", 
			"simpleDeclaration", "declSpecifierSeq", "typeSpecifier", "declarator", 
			"functionDefinition", "mainFunction", "initDeclaratorList", "initDeclarator", 
			"initializer", "initializerClause", "initializerList", "parametersAndQualifiers", 
			"parameterDeclarationClause", "parameterDeclaration"
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
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Function - 64)) | (1L << (Main - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(102);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(100);
					declaration();
					}
					break;
				case 2:
					{
					setState(101);
					statement();
					}
					break;
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
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
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
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
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(This);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(Identifier);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(112);
				match(LeftParen);
				setState(113);
				expression();
				setState(114);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(118);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(116);
					match(Identifier);
					}
					break;
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
					{
					setState(117);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(122); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(122);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Identifier:
							{
							setState(120);
							match(Identifier);
							}
							break;
						case IntegerLiteral:
						case CharacterLiteral:
						case FloatingLiteral:
						case StringLiteral:
						case BooleanLiteral:
							{
							setState(121);
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
					setState(124); 
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
			setState(129);
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
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				logicalOrExpression();
				setState(133);
				assignmentOperator();
				setState(134);
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
			setState(138);
			logicalAndExpression();
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(OrOr);
					setState(140);
					logicalAndExpression();
					}
					} 
				}
				setState(145);
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
			setState(146);
			equalityExpression();
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147);
					match(AndAnd);
					setState(148);
					equalityExpression();
					}
					} 
				}
				setState(153);
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
			setState(154);
			relationalExpression();
			setState(159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(155);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(156);
					relationalExpression();
					}
					} 
				}
				setState(161);
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
			setState(162);
			additiveExpression();
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(163);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Less) | (1L << Greater) | (1L << LessEqual) | (1L << GreaterEqual))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(164);
					additiveExpression();
					}
					} 
				}
				setState(169);
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
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				multiplicativeExpression();
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(172);
						multiplicativeExpression();
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				multiplicativeExpression();
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(179);
						_la = _input.LA(1);
						if ( !(((((_la - 40)) & ~0x3f) == 0 && ((1L << (_la - 40)) & ((1L << (Plus - 40)) | (1L << (Minus - 40)) | (1L << (PlusPlus - 40)) | (1L << (MinusMinus - 40)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						multiplicativeExpression();
						}
						} 
					}
					setState(185);
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
			setState(190);
			unaryExpression(0);
			setState(195);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(192);
					unaryExpression(0);
					}
					} 
				}
				setState(197);
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
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
			case This:
			case LeftParen:
			case Identifier:
				{
				setState(199);
				postfixExpression();
				}
				break;
			case Not:
				{
				setState(200);
				match(Not);
				setState(201);
				unaryExpression(4);
				}
				break;
			case Create:
			case New:
				{
				setState(202);
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
				setState(204); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(203);
						binaryOperator();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(206); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(208);
				unaryExpression(2);
				 notifyErrorListeners("redundant binary operator. Missing operand"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(223);
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
					setState(213);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(215); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(214);
							binaryOperator();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(217); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					 notifyErrorListeners("redundant binary operator. Missing operand"); 
					}
					} 
				}
				setState(225);
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
			setState(226);
			_la = _input.LA(1);
			if ( !(_la==Create || _la==New) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(227);
			typeSpecifier();
			setState(228);
			match(LeftBracket);
			setState(229);
			constantExpression();
			setState(230);
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
			setState(260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				match(Identifier);
				setState(234);
				match(LeftBracket);
				setState(235);
				expression();
				setState(236);
				match(RightBracket);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(238);
				match(Identifier);
				setState(239);
				match(LeftParen);
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(240);
					expressionList();
					}
				}

				setState(243);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(244);
				match(Identifier);
				setState(245);
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
				setState(248);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(246);
					match(Identifier);
					}
					break;
				case IntegerLiteral:
				case CharacterLiteral:
				case FloatingLiteral:
				case StringLiteral:
				case BooleanLiteral:
					{
					setState(247);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(255); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(250);
						match(LeftParen);
						setState(252);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
							{
							setState(251);
							expressionList();
							}
						}

						setState(254);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(257); 
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
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				logicalOrExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
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
			setState(268);
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
			setState(270);
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
			setState(287);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(272);
				assignmentOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(Plus);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(Minus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(275);
				match(Star);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(276);
				match(Div);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(277);
				match(Mod);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(278);
				match(Greater);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(279);
				match(Less);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(280);
				match(GreaterEqual);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(281);
				match(Equal);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(282);
				match(NotEqual);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(283);
				match(LessEqual);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(284);
				match(GreaterEqual);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(285);
				match(AndAnd);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(286);
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
			setState(289);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral))) != 0)) ) {
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
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(293);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(294);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(295);
				jumpStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(296);
				printStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(297);
				scanStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(298);
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
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(301);
				match(Print);
				setState(302);
				match(LeftParen);
				setState(303);
				constantExpression();
				setState(304);
				match(RightParen);
				setState(305);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				match(Print);
				setState(308);
				match(LeftParen);
				setState(310); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(309);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(312); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(314);
				constantExpression();
				setState(315);
				match(RightParen);
				setState(316);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(Print);
				setState(320);
				match(LeftParen);
				setState(321);
				constantExpression();
				setState(322);
				match(RightParen);
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					match(RightParen);
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(328);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(331);
				match(Print);
				setState(332);
				constantExpression();
				setState(334); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(333);
					match(RightParen);
					}
					}
					setState(336); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(338);
				match(Semi);
				 notifyErrorListeners("missing open parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(341);
				match(Print);
				setState(343); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(342);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(345); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(347);
				constantExpression();
				setState(348);
				match(Semi);
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(351);
				match(Print);
				setState(352);
				constantExpression();
				setState(353);
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
			setState(411);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				match(Scan);
				setState(359);
				match(LeftParen);
				setState(360);
				match(StringLiteral);
				setState(361);
				match(Comma);
				setState(362);
				match(Identifier);
				setState(363);
				match(RightParen);
				setState(364);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(Scan);
				setState(366);
				match(LeftParen);
				setState(368); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(367);
					match(LeftParen);
					}
					}
					setState(370); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(372);
				match(StringLiteral);
				setState(373);
				match(Comma);
				setState(374);
				match(Identifier);
				setState(375);
				match(RightParen);
				setState(376);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(378);
				match(Scan);
				setState(379);
				match(LeftParen);
				setState(380);
				match(StringLiteral);
				setState(381);
				match(Comma);
				setState(382);
				match(Identifier);
				setState(383);
				match(RightParen);
				setState(385); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(384);
					match(RightParen);
					}
					}
					setState(387); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(389);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(391);
				match(Scan);
				setState(392);
				match(StringLiteral);
				setState(393);
				match(Comma);
				setState(394);
				match(Identifier);
				setState(395);
				match(RightParen);
				setState(396);
				match(Semi);
				 notifyErrorListeners("missing open parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(Scan);
				setState(399);
				match(LeftParen);
				setState(400);
				match(StringLiteral);
				setState(401);
				match(Comma);
				setState(402);
				match(Identifier);
				setState(403);
				match(Semi);
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(405);
				match(Scan);
				setState(406);
				match(StringLiteral);
				setState(407);
				match(Comma);
				setState(408);
				match(Identifier);
				setState(409);
				match(Semi);
				 notifyErrorListeners("missing parentheses"); 
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
			setState(426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(419);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
					{
					setState(413);
					match(Break);
					}
					break;
				case Continue:
					{
					setState(414);
					match(Continue);
					}
					break;
				case Return:
					{
					setState(415);
					match(Return);
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
						{
						setState(416);
						constantExpression();
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(421);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(Return);
				setState(423);
				badReturn();
				setState(424);
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
			setState(428);
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
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(431);
				expression();
				}
			}

			setState(434);
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
			setState(472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				match(LeftBrace);
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(437);
					statementSeq();
					}
				}

				setState(440);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(442); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(441);
						match(LeftBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(444); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(447);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(446);
					statementSeq();
					}
					break;
				}
				 notifyErrorListeners("missing closing curly brace"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				match(LeftBrace);
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(451);
					statementSeq();
					}
				}

				setState(454);
				match(RightBrace);
				setState(456); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(455);
						match(RightBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(458); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("too many closing curly braces"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				match(LeftBrace);
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
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Create) | (1L << Do) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << New) | (1L << Return) | (1L << Short) | (1L << String) | (1L << This) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Semi - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(467);
					statementSeq();
					}
				}

				setState(470);
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
			setState(475); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(474);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(477); 
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
			setState(479);
			ifStatement();
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(480);
					elseIfStatement();
					}
					} 
				}
				setState(485);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(486);
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
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				match(If);
				setState(490);
				match(LeftParen);
				setState(491);
				condition();
				setState(492);
				match(RightParen);
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(493);
					match(Then);
					}
				}

				setState(496);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				match(If);
				setState(499);
				condition();
				setState(501); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(500);
					match(RightParen);
					}
					}
					setState(503); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(506);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(505);
					match(Then);
					}
				}

				setState(508);
				compoundStatement();
				 notifyErrorListeners("missing opening parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				match(If);
				setState(513); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(512);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(515); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(517);
				condition();
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(518);
					match(Then);
					}
				}

				setState(521);
				compoundStatement();
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(524);
				match(If);
				setState(525);
				match(LeftParen);
				setState(526);
				condition();
				setState(527);
				match(RightParen);
				setState(529); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(528);
					match(RightParen);
					}
					}
					setState(531); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(533);
					match(Then);
					}
				}

				setState(536);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(539);
				match(If);
				setState(540);
				match(LeftParen);
				setState(542); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(541);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(544); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(546);
				condition();
				setState(547);
				match(RightParen);
				setState(549);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(548);
					match(Then);
					}
				}

				setState(551);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(554);
				match(If);
				setState(555);
				condition();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(556);
					match(Then);
					}
				}

				setState(559);
				compoundStatement();
				 notifyErrorListeners("missing parentheses"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(562);
				match(If);
				setState(563);
				match(LeftParen);
				setState(564);
				condition();
				setState(565);
				match(RightParen);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(566);
					match(Then);
					}
				}

				 notifyErrorListeners("missing conditional statement body"); 
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
			setState(662);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(573);
				match(Else);
				setState(574);
				match(If);
				setState(575);
				match(LeftParen);
				setState(576);
				condition();
				setState(577);
				match(RightParen);
				setState(579);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(578);
					match(Then);
					}
				}

				setState(581);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(583);
				match(Else);
				setState(584);
				match(If);
				setState(585);
				condition();
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
				 notifyErrorListeners("missing opening parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				match(Else);
				setState(598);
				match(If);
				setState(600); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(599);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(602); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(604);
				condition();
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(605);
					match(Then);
					}
				}

				setState(608);
				compoundStatement();
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(611);
				match(Else);
				setState(612);
				match(If);
				setState(613);
				match(LeftParen);
				setState(614);
				condition();
				setState(615);
				match(RightParen);
				setState(617); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(616);
					match(RightParen);
					}
					}
					setState(619); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(621);
					match(Then);
					}
				}

				setState(624);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(627);
				match(Else);
				setState(628);
				match(If);
				setState(629);
				match(LeftParen);
				setState(631); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(630);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(633); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(635);
				condition();
				setState(636);
				match(RightParen);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(637);
					match(Then);
					}
				}

				setState(640);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(643);
				match(Else);
				setState(644);
				match(If);
				setState(645);
				condition();
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(646);
					match(Then);
					}
				}

				setState(649);
				compoundStatement();
				 notifyErrorListeners("missing parentheses"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(652);
				match(Else);
				setState(653);
				match(If);
				setState(654);
				match(LeftParen);
				setState(655);
				condition();
				setState(656);
				match(RightParen);
				setState(658);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(657);
					match(Then);
					}
				}

				 notifyErrorListeners("missing conditional statement body"); 
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
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				match(Else);
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(665);
					match(Then);
					}
				}

				setState(668);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(669);
				match(Else);
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(670);
					match(Then);
					}
				}

				 notifyErrorListeners("missing conditional statement body"); 
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
		enterRule(_localctx, 60, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
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
		enterRule(_localctx, 62, RULE_iterationStatement);
		int _la;
		try {
			int _alt;
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(678);
				match(For);
				setState(679);
				iterationInit();
				setState(680);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(681);
				match(To);
				setState(682);
				constantExpression();
				setState(683);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(685);
				match(While);
				setState(686);
				iterationInit();
				setState(687);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(688);
				match(To);
				setState(689);
				constantExpression();
				setState(690);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(692);
				match(While);
				setState(693);
				match(LeftParen);
				setState(694);
				condition();
				setState(695);
				match(RightParen);
				setState(696);
				compoundStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(698);
				match(Do);
				setState(699);
				compoundStatement();
				setState(700);
				match(While);
				setState(701);
				match(LeftParen);
				setState(702);
				condition();
				setState(703);
				match(RightParen);
				setState(704);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(706);
				match(For);
				setState(707);
				match(LeftParen);
				{
				setState(708);
				forInitStatement();
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(709);
					condition();
					}
				}

				setState(712);
				match(Semi);
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(713);
					expression();
					}
				}

				}
				setState(716);
				match(RightParen);
				setState(717);
				compoundStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(719);
				match(While);
				setState(720);
				match(LeftParen);
				setState(721);
				condition();
				setState(722);
				match(RightParen);
				 notifyErrorListeners("missing while loop body"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(725);
				match(While);
				setState(726);
				condition();
				setState(727);
				compoundStatement();
				 notifyErrorListeners("missing parentheses"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(730);
				match(While);
				setState(731);
				condition();
				setState(733); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(732);
					match(RightParen);
					}
					}
					setState(735); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(737);
				compoundStatement();
				 notifyErrorListeners("missing opening parenthesis"); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(740);
				match(While);
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
					_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(746);
				condition();
				setState(747);
				compoundStatement();
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(750);
				match(While);
				setState(751);
				match(LeftParen);
				setState(753); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(752);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(755); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(757);
				condition();
				setState(758);
				match(RightParen);
				setState(759);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(762);
				match(While);
				setState(763);
				match(LeftParen);
				setState(764);
				condition();
				setState(765);
				match(RightParen);
				setState(767); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(766);
					match(RightParen);
					}
					}
					setState(769); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(771);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(774);
				match(Do);
				setState(775);
				match(While);
				setState(776);
				match(LeftParen);
				setState(777);
				condition();
				setState(778);
				match(RightParen);
				setState(779);
				match(Semi);
				 notifyErrorListeners("missing do while loop body"); 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(782);
				match(Do);
				setState(783);
				compoundStatement();
				setState(784);
				match(While);
				setState(785);
				condition();
				setState(786);
				match(Semi);
				 notifyErrorListeners("missing parentheses"); 
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(789);
				match(Do);
				setState(790);
				compoundStatement();
				setState(791);
				match(While);
				setState(792);
				condition();
				setState(794); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(793);
					match(RightParen);
					}
					}
					setState(796); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(798);
				match(Semi);
				 notifyErrorListeners("missing opening parenthesis"); 
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(801);
				match(Do);
				setState(802);
				compoundStatement();
				setState(803);
				match(While);
				setState(805); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(804);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(807); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(809);
				condition();
				setState(810);
				match(Semi);
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(813);
				match(Do);
				setState(814);
				compoundStatement();
				setState(815);
				match(While);
				setState(816);
				match(LeftParen);
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
				match(RightParen);
				setState(824);
				match(Semi);
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(827);
				match(Do);
				setState(828);
				compoundStatement();
				setState(829);
				match(While);
				setState(830);
				match(LeftParen);
				setState(831);
				condition();
				setState(832);
				match(RightParen);
				setState(834); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(833);
					match(RightParen);
					}
					}
					setState(836); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(838);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(841);
				match(For);
				setState(842);
				match(LeftParen);
				{
				setState(843);
				forInitStatement();
				setState(845);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(844);
					condition();
					}
				}

				setState(847);
				match(Semi);
				setState(849);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(848);
					expression();
					}
				}

				}
				setState(851);
				match(RightParen);
				 notifyErrorListeners("missing for loop body"); 
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(854);
				match(For);
				{
				setState(855);
				forInitStatement();
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(856);
					condition();
					}
				}

				setState(859);
				match(Semi);
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(860);
					expression();
					}
				}

				}
				setState(863);
				compoundStatement();
				 notifyErrorListeners("missing parentheses"); 
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(866);
				match(For);
				{
				setState(867);
				forInitStatement();
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(868);
					condition();
					}
				}

				setState(871);
				match(Semi);
				setState(873);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(872);
					expression();
					}
				}

				}
				setState(876); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(875);
					match(RightParen);
					}
					}
					setState(878); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(880);
				compoundStatement();
				 notifyErrorListeners("missing opening parenthesis"); 
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(883);
				match(For);
				setState(885); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(884);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(887); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(889);
				forInitStatement();
				setState(891);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(890);
					condition();
					}
				}

				setState(893);
				match(Semi);
				setState(895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(894);
					expression();
					}
				}

				}
				setState(897);
				compoundStatement();
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(900);
				match(For);
				setState(901);
				match(LeftParen);
				setState(903); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(902);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(905); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				{
				setState(907);
				forInitStatement();
				setState(909);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(908);
					condition();
					}
				}

				setState(911);
				match(Semi);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(912);
					expression();
					}
				}

				}
				setState(915);
				match(RightParen);
				setState(916);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(919);
				match(For);
				setState(920);
				match(LeftParen);
				{
				setState(921);
				forInitStatement();
				setState(923);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(922);
					condition();
					}
				}

				setState(925);
				match(Semi);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral) | (1L << Create) | (1L << New) | (1L << This) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal) | (1L << NotEqual) | (1L << LessEqual) | (1L << GreaterEqual))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(926);
					expression();
					}
				}

				}
				setState(929);
				match(RightParen);
				setState(931); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(930);
					match(RightParen);
					}
					}
					setState(933); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(935);
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
		enterRule(_localctx, 64, RULE_forInitStatement);
		try {
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				expressionStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(941);
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
		enterRule(_localctx, 66, RULE_iterationInit);
		int _la;
		try {
			setState(949);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(944);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(945);
					declSpecifierSeq();
					}
				}

				setState(948);
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
		enterRule(_localctx, 68, RULE_declaration);
		try {
			setState(954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				functionDefinition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(953);
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
			setState(956);
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
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
				{
				setState(958);
				declSpecifierSeq();
				}
			}

			setState(962);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << StringLiteral) | (1L << BooleanLiteral))) != 0) || _la==Identifier) {
				{
				setState(961);
				initDeclaratorList();
				}
			}

			setState(964);
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
			setState(967);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const || _la==Final) {
				{
				setState(966);
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

			setState(969);
			typeSpecifier();
			setState(972);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket) {
				{
				setState(970);
				match(LeftBracket);
				setState(971);
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
			setState(974);
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
		enterRule(_localctx, 78, RULE_declarator);
		try {
			setState(986);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(976);
				match(Identifier);
				setState(978);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(977);
					parametersAndQualifiers();
					}
					break;
				}
				}
				break;
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case StringLiteral:
			case BooleanLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(980);
				literal();
				setState(982);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
				case 1:
					{
					setState(981);
					parametersAndQualifiers();
					}
					break;
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
		enterRule(_localctx, 80, RULE_functionDefinition);
		int _la;
		try {
			setState(1003);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(989);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(988);
					match(Function);
					}
				}

				setState(991);
				declSpecifierSeq();
				setState(992);
				declarator();
				setState(993);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				mainFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(996);
					match(Function);
					}
				}

				setState(999);
				declSpecifierSeq();
				setState(1000);
				declarator();
				 notifyErrorListeners("missing function body"); 
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
		enterRule(_localctx, 82, RULE_mainFunction);
		int _la;
		try {
			setState(1097);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1006);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1005);
					match(Function);
					}
				}

				setState(1009);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1008);
					declSpecifierSeq();
					}
				}

				setState(1011);
				match(Main);
				setState(1012);
				match(LeftParen);
				setState(1013);
				match(RightParen);
				setState(1014);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1016);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1015);
					match(Function);
					}
				}

				setState(1019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1018);
					declSpecifierSeq();
					}
				}

				setState(1021);
				match(Main);
				 notifyErrorListeners("missing function body"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1024);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1023);
					match(Function);
					}
				}

				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1026);
					declSpecifierSeq();
					}
				}

				setState(1029);
				match(Main);
				setState(1030);
				compoundStatement();
				 notifyErrorListeners("missing parentheses"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1033);
					match(Function);
					}
				}

				setState(1037);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1036);
					declSpecifierSeq();
					}
				}

				setState(1039);
				match(Main);
				setState(1041); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1040);
					match(RightParen);
					}
					}
					setState(1043); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(1045);
				compoundStatement();
				 notifyErrorListeners("missing opening parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1049);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1048);
					match(Function);
					}
				}

				setState(1052);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1051);
					declSpecifierSeq();
					}
				}

				setState(1054);
				match(Main);
				setState(1056); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1055);
					match(LeftParen);
					}
					}
					setState(1058); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1060);
				compoundStatement();
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1064);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1063);
					match(Function);
					}
				}

				setState(1067);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1066);
					declSpecifierSeq();
					}
				}

				setState(1069);
				match(Main);
				setState(1070);
				match(LeftParen);
				setState(1072); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1071);
					match(LeftParen);
					}
					}
					setState(1074); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1076);
				match(RightParen);
				setState(1077);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1081);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(1080);
					match(Function);
					}
				}

				setState(1084);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1083);
					declSpecifierSeq();
					}
				}

				setState(1086);
				match(Main);
				setState(1087);
				match(LeftParen);
				setState(1088);
				match(RightParen);
				setState(1090); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1089);
					match(RightParen);
					}
					}
					setState(1092); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(1094);
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
		enterRule(_localctx, 84, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			initDeclarator();
			setState(1104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1100);
				match(Comma);
				setState(1101);
				initDeclarator();
				}
				}
				setState(1106);
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
			setState(1107);
			declarator();
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(1108);
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
			setState(1111);
			match(Assign);
			setState(1112);
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
			setState(1114);
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
			setState(1116);
			initializerClause();
			setState(1121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(1117);
				match(Comma);
				setState(1118);
				initializerClause();
				}
				}
				setState(1123);
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
		enterRule(_localctx, 94, RULE_parametersAndQualifiers);
		int _la;
		try {
			int _alt;
			setState(1160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				match(LeftParen);
				setState(1126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1125);
					parameterDeclarationClause();
					}
				}

				setState(1128);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1129);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1132); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(1135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1134);
					parameterDeclarationClause();
					}
					break;
				}
				 notifyErrorListeners("missing closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1138);
				match(LeftParen);
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1139);
					parameterDeclarationClause();
					}
				}

				setState(1142);
				match(RightParen);
				setState(1144); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1143);
						match(RightParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1146); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,144,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1149);
				match(LeftParen);
				setState(1151); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1150);
					match(LeftParen);
					}
					}
					setState(1153); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(1156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Final) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(1155);
					parameterDeclarationClause();
					}
				}

				setState(1158);
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
		enterRule(_localctx, 96, RULE_parameterDeclarationClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			parameterDeclaration();
			setState(1167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1163);
					match(Comma);
					setState(1164);
					parameterDeclaration();
					}
					} 
				}
				setState(1169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			declSpecifierSeq();
			{
			setState(1171);
			declarator();
			setState(1174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				{
				setState(1172);
				match(Assign);
				setState(1173);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u049b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2\3\2"+
		"\7\2i\n\2\f\2\16\2l\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3y\n\3\3\3\3\3\6\3}\n\3\r\3\16\3~\3\3\5\3\u0082\n\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u008b\n\5\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13\6"+
		"\3\7\3\7\3\7\7\7\u0098\n\7\f\7\16\7\u009b\13\7\3\b\3\b\3\b\7\b\u00a0\n"+
		"\b\f\b\16\b\u00a3\13\b\3\t\3\t\3\t\7\t\u00a8\n\t\f\t\16\t\u00ab\13\t\3"+
		"\n\3\n\3\n\7\n\u00b0\n\n\f\n\16\n\u00b3\13\n\3\n\3\n\3\n\7\n\u00b8\n\n"+
		"\f\n\16\n\u00bb\13\n\3\n\3\n\5\n\u00bf\n\n\3\13\3\13\3\13\7\13\u00c4\n"+
		"\13\f\13\16\13\u00c7\13\13\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00cf\n\f\r\f\16"+
		"\f\u00d0\3\f\3\f\3\f\5\f\u00d6\n\f\3\f\3\f\6\f\u00da\n\f\r\f\16\f\u00db"+
		"\3\f\3\f\7\f\u00e0\n\f\f\f\16\f\u00e3\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f4\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\5\16\u00fb\n\16\3\16\3\16\5\16\u00ff\n\16\3\16\6\16\u0102\n"+
		"\16\r\16\16\16\u0103\3\16\5\16\u0107\n\16\3\17\3\17\3\17\3\17\5\17\u010d"+
		"\n\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0122\n\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u012e\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\6\25\u0139\n\25\r\25\16\25\u013a\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\6\25\u0147\n\25\r\25\16\25\u0148\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\6\25\u0151\n\25\r\25\16\25\u0152\3\25\3\25\3\25\3"+
		"\25\3\25\6\25\u015a\n\25\r\25\16\25\u015b\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0167\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\6\26\u0173\n\26\r\26\16\26\u0174\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\6\26\u0184\n\26\r\26\16\26\u0185"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u019e\n\26\3\27\3\27\3\27"+
		"\3\27\5\27\u01a4\n\27\5\27\u01a6\n\27\3\27\3\27\3\27\3\27\3\27\5\27\u01ad"+
		"\n\27\3\30\3\30\3\30\3\31\5\31\u01b3\n\31\3\31\3\31\3\32\3\32\5\32\u01b9"+
		"\n\32\3\32\3\32\6\32\u01bd\n\32\r\32\16\32\u01be\3\32\5\32\u01c2\n\32"+
		"\3\32\3\32\3\32\5\32\u01c7\n\32\3\32\3\32\6\32\u01cb\n\32\r\32\16\32\u01cc"+
		"\3\32\3\32\3\32\6\32\u01d2\n\32\r\32\16\32\u01d3\3\32\5\32\u01d7\n\32"+
		"\3\32\3\32\5\32\u01db\n\32\3\33\6\33\u01de\n\33\r\33\16\33\u01df\3\34"+
		"\3\34\7\34\u01e4\n\34\f\34\16\34\u01e7\13\34\3\34\5\34\u01ea\n\34\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u01f1\n\35\3\35\3\35\3\35\3\35\3\35\6\35\u01f8"+
		"\n\35\r\35\16\35\u01f9\3\35\5\35\u01fd\n\35\3\35\3\35\3\35\3\35\3\35\6"+
		"\35\u0204\n\35\r\35\16\35\u0205\3\35\3\35\5\35\u020a\n\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\6\35\u0214\n\35\r\35\16\35\u0215\3\35\5\35"+
		"\u0219\n\35\3\35\3\35\3\35\3\35\3\35\3\35\6\35\u0221\n\35\r\35\16\35\u0222"+
		"\3\35\3\35\3\35\5\35\u0228\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0230"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u023a\n\35\3\35\3\35"+
		"\5\35\u023e\n\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0246\n\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\6\36\u024e\n\36\r\36\16\36\u024f\3\36\5\36\u0253"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\6\36\u025b\n\36\r\36\16\36\u025c\3"+
		"\36\3\36\5\36\u0261\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\6\36\u026c\n\36\r\36\16\36\u026d\3\36\5\36\u0271\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\6\36\u027a\n\36\r\36\16\36\u027b\3\36\3\36\3\36\5"+
		"\36\u0281\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u028a\n\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0295\n\36\3\36\3\36\5\36"+
		"\u0299\n\36\3\37\3\37\5\37\u029d\n\37\3\37\3\37\3\37\5\37\u02a2\n\37\3"+
		"\37\5\37\u02a5\n\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02c9\n!\3!\3"+
		"!\5!\u02cd\n!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\6!\u02e0"+
		"\n!\r!\16!\u02e1\3!\3!\3!\3!\3!\6!\u02e9\n!\r!\16!\u02ea\3!\3!\3!\3!\3"+
		"!\3!\3!\6!\u02f4\n!\r!\16!\u02f5\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\6!\u0302"+
		"\n!\r!\16!\u0303\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\3!\3!\6!\u031d\n!\r!\16!\u031e\3!\3!\3!\3!\3!\3!\3!\6!\u0328"+
		"\n!\r!\16!\u0329\3!\3!\3!\3!\3!\3!\3!\3!\3!\6!\u0335\n!\r!\16!\u0336\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\6!\u0345\n!\r!\16!\u0346\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u0350\n!\3!\3!\5!\u0354\n!\3!\3!\3!\3!\3!\3!\5!\u035c\n"+
		"!\3!\3!\5!\u0360\n!\3!\3!\3!\3!\3!\3!\5!\u0368\n!\3!\3!\5!\u036c\n!\3"+
		"!\6!\u036f\n!\r!\16!\u0370\3!\3!\3!\3!\3!\6!\u0378\n!\r!\16!\u0379\3!"+
		"\3!\5!\u037e\n!\3!\3!\5!\u0382\n!\3!\3!\3!\3!\3!\3!\6!\u038a\n!\r!\16"+
		"!\u038b\3!\3!\5!\u0390\n!\3!\3!\5!\u0394\n!\3!\3!\3!\3!\3!\3!\3!\3!\5"+
		"!\u039e\n!\3!\3!\5!\u03a2\n!\3!\3!\6!\u03a6\n!\r!\16!\u03a7\3!\3!\3!\5"+
		"!\u03ad\n!\3\"\3\"\5\"\u03b1\n\"\3#\3#\5#\u03b5\n#\3#\5#\u03b8\n#\3$\3"+
		"$\3$\5$\u03bd\n$\3%\3%\3&\5&\u03c2\n&\3&\5&\u03c5\n&\3&\3&\3\'\5\'\u03ca"+
		"\n\'\3\'\3\'\3\'\5\'\u03cf\n\'\3(\3(\3)\3)\5)\u03d5\n)\3)\3)\5)\u03d9"+
		"\n)\3)\3)\5)\u03dd\n)\3*\5*\u03e0\n*\3*\3*\3*\3*\3*\3*\5*\u03e8\n*\3*"+
		"\3*\3*\3*\5*\u03ee\n*\3+\5+\u03f1\n+\3+\5+\u03f4\n+\3+\3+\3+\3+\3+\5+"+
		"\u03fb\n+\3+\5+\u03fe\n+\3+\3+\3+\5+\u0403\n+\3+\5+\u0406\n+\3+\3+\3+"+
		"\3+\3+\5+\u040d\n+\3+\5+\u0410\n+\3+\3+\6+\u0414\n+\r+\16+\u0415\3+\3"+
		"+\3+\3+\5+\u041c\n+\3+\5+\u041f\n+\3+\3+\6+\u0423\n+\r+\16+\u0424\3+\3"+
		"+\3+\3+\5+\u042b\n+\3+\5+\u042e\n+\3+\3+\3+\6+\u0433\n+\r+\16+\u0434\3"+
		"+\3+\3+\3+\3+\5+\u043c\n+\3+\5+\u043f\n+\3+\3+\3+\3+\6+\u0445\n+\r+\16"+
		"+\u0446\3+\3+\3+\5+\u044c\n+\3,\3,\3,\7,\u0451\n,\f,\16,\u0454\13,\3-"+
		"\3-\5-\u0458\n-\3.\3.\3.\3/\3/\3\60\3\60\3\60\7\60\u0462\n\60\f\60\16"+
		"\60\u0465\13\60\3\61\3\61\5\61\u0469\n\61\3\61\3\61\6\61\u046d\n\61\r"+
		"\61\16\61\u046e\3\61\5\61\u0472\n\61\3\61\3\61\3\61\5\61\u0477\n\61\3"+
		"\61\3\61\6\61\u047b\n\61\r\61\16\61\u047c\3\61\3\61\3\61\6\61\u0482\n"+
		"\61\r\61\16\61\u0483\3\61\5\61\u0487\n\61\3\61\3\61\5\61\u048b\n\61\3"+
		"\62\3\62\3\62\7\62\u0490\n\62\f\62\16\62\u0493\13\62\3\63\3\63\3\63\3"+
		"\63\5\63\u0499\n\63\3\63\2\3\26\64\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bd\2\16\3\2>?\4\2\64\65"+
		"@A\3\2*+\4\2*+DE\3\2,.\4\2\17\17\32\32\3\2DE\4\2\63\63\66:\3\2\3\7\3\2"+
		"NO\4\2\r\r\24\24\n\2\b\b\n\n\21\21\25\25\30\31\34\34\36\36\"\"\2\u054c"+
		"\2j\3\2\2\2\4\u0081\3\2\2\2\6\u0083\3\2\2\2\b\u008a\3\2\2\2\n\u008c\3"+
		"\2\2\2\f\u0094\3\2\2\2\16\u009c\3\2\2\2\20\u00a4\3\2\2\2\22\u00be\3\2"+
		"\2\2\24\u00c0\3\2\2\2\26\u00d5\3\2\2\2\30\u00e4\3\2\2\2\32\u0106\3\2\2"+
		"\2\34\u010c\3\2\2\2\36\u010e\3\2\2\2 \u0110\3\2\2\2\"\u0121\3\2\2\2$\u0123"+
		"\3\2\2\2&\u012d\3\2\2\2(\u0166\3\2\2\2*\u019d\3\2\2\2,\u01ac\3\2\2\2."+
		"\u01ae\3\2\2\2\60\u01b2\3\2\2\2\62\u01da\3\2\2\2\64\u01dd\3\2\2\2\66\u01e1"+
		"\3\2\2\28\u023d\3\2\2\2:\u0298\3\2\2\2<\u02a4\3\2\2\2>\u02a6\3\2\2\2@"+
		"\u03ac\3\2\2\2B\u03b0\3\2\2\2D\u03b7\3\2\2\2F\u03bc\3\2\2\2H\u03be\3\2"+
		"\2\2J\u03c1\3\2\2\2L\u03c9\3\2\2\2N\u03d0\3\2\2\2P\u03dc\3\2\2\2R\u03ed"+
		"\3\2\2\2T\u044b\3\2\2\2V\u044d\3\2\2\2X\u0455\3\2\2\2Z\u0459\3\2\2\2\\"+
		"\u045c\3\2\2\2^\u045e\3\2\2\2`\u048a\3\2\2\2b\u048c\3\2\2\2d\u0494\3\2"+
		"\2\2fi\5F$\2gi\5&\24\2hf\3\2\2\2hg\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2"+
		"\2km\3\2\2\2lj\3\2\2\2mn\7\2\2\3n\3\3\2\2\2o\u0082\5$\23\2p\u0082\7\37"+
		"\2\2q\u0082\7V\2\2rs\7$\2\2st\5\6\4\2tu\7%\2\2u\u0082\3\2\2\2vy\7V\2\2"+
		"wy\5$\23\2xv\3\2\2\2xw\3\2\2\2y|\3\2\2\2z}\7V\2\2{}\5$\23\2|z\3\2\2\2"+
		"|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\b\3\1\2\u0081o\3\2\2\2\u0081p\3\2\2\2\u0081q\3\2\2\2\u0081r\3\2\2\2\u0081"+
		"x\3\2\2\2\u0082\5\3\2\2\2\u0083\u0084\5\b\5\2\u0084\7\3\2\2\2\u0085\u008b"+
		"\5\n\6\2\u0086\u0087\5\n\6\2\u0087\u0088\5 \21\2\u0088\u0089\5\\/\2\u0089"+
		"\u008b\3\2\2\2\u008a\u0085\3\2\2\2\u008a\u0086\3\2\2\2\u008b\t\3\2\2\2"+
		"\u008c\u0091\5\f\7\2\u008d\u008e\7C\2\2\u008e\u0090\5\f\7\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\13\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0099\5\16\b\2\u0095\u0096\7B\2"+
		"\2\u0096\u0098\5\16\b\2\u0097\u0095\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\r\3\2\2\2\u009b\u0099\3\2\2\2"+
		"\u009c\u00a1\5\20\t\2\u009d\u009e\t\2\2\2\u009e\u00a0\5\20\t\2\u009f\u009d"+
		"\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\17\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a9\5\22\n\2\u00a5\u00a6\t\3\2"+
		"\2\u00a6\u00a8\5\22\n\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\21\3\2\2\2\u00ab\u00a9\3\2\2"+
		"\2\u00ac\u00b1\5\24\13\2\u00ad\u00ae\t\4\2\2\u00ae\u00b0\5\24\13\2\u00af"+
		"\u00ad\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2"+
		"\2\2\u00b2\u00bf\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b9\5\24\13\2\u00b5"+
		"\u00b6\t\5\2\2\u00b6\u00b8\5\24\13\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3"+
		"\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bc\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bc\u00bd\b\n\1\2\u00bd\u00bf\3\2\2\2\u00be\u00ac\3\2"+
		"\2\2\u00be\u00b4\3\2\2\2\u00bf\23\3\2\2\2\u00c0\u00c5\5\26\f\2\u00c1\u00c2"+
		"\t\6\2\2\u00c2\u00c4\5\26\f\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2"+
		"\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\25\3\2\2\2\u00c7\u00c5"+
		"\3\2\2\2\u00c8\u00c9\b\f\1\2\u00c9\u00d6\5\32\16\2\u00ca\u00cb\7\62\2"+
		"\2\u00cb\u00d6\5\26\f\6\u00cc\u00d6\5\30\r\2\u00cd\u00cf\5\"\22\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\5\26\f\4\u00d3\u00d4\b\f\1\2\u00d4"+
		"\u00d6\3\2\2\2\u00d5\u00c8\3\2\2\2\u00d5\u00ca\3\2\2\2\u00d5\u00cc\3\2"+
		"\2\2\u00d5\u00ce\3\2\2\2\u00d6\u00e1\3\2\2\2\u00d7\u00d9\f\3\2\2\u00d8"+
		"\u00da\5\"\22\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\b\f\1\2\u00de"+
		"\u00e0\3\2\2\2\u00df\u00d7\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\27\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5"+
		"\t\7\2\2\u00e5\u00e6\5N(\2\u00e6\u00e7\7&\2\2\u00e7\u00e8\5\34\17\2\u00e8"+
		"\u00e9\7\'\2\2\u00e9\31\3\2\2\2\u00ea\u0107\5\4\3\2\u00eb\u00ec\7V\2\2"+
		"\u00ec\u00ed\7&\2\2\u00ed\u00ee\5\6\4\2\u00ee\u00ef\7\'\2\2\u00ef\u0107"+
		"\3\2\2\2\u00f0\u00f1\7V\2\2\u00f1\u00f3\7$\2\2\u00f2\u00f4\5\36\20\2\u00f3"+
		"\u00f2\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0107\7%"+
		"\2\2\u00f6\u00f7\7V\2\2\u00f7\u0107\t\b\2\2\u00f8\u00fb\7V\2\2\u00f9\u00fb"+
		"\5$\23\2\u00fa\u00f8\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb\u0101\3\2\2\2\u00fc"+
		"\u00fe\7$\2\2\u00fd\u00ff\5\36\20\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3"+
		"\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0102\7%\2\2\u0101\u00fc\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\b\16\1\2\u0106\u00ea\3\2\2\2\u0106\u00eb\3\2\2\2\u0106"+
		"\u00f0\3\2\2\2\u0106\u00f6\3\2\2\2\u0106\u00fa\3\2\2\2\u0107\33\3\2\2"+
		"\2\u0108\u010d\5\n\6\2\u0109\u010a\5\b\5\2\u010a\u010b\b\17\1\2\u010b"+
		"\u010d\3\2\2\2\u010c\u0108\3\2\2\2\u010c\u0109\3\2\2\2\u010d\35\3\2\2"+
		"\2\u010e\u010f\5^\60\2\u010f\37\3\2\2\2\u0110\u0111\t\t\2\2\u0111!\3\2"+
		"\2\2\u0112\u0122\5 \21\2\u0113\u0122\7*\2\2\u0114\u0122\7+\2\2\u0115\u0122"+
		"\7,\2\2\u0116\u0122\7-\2\2\u0117\u0122\7.\2\2\u0118\u0122\7\65\2\2\u0119"+
		"\u0122\7\64\2\2\u011a\u0122\7A\2\2\u011b\u0122\7>\2\2\u011c\u0122\7?\2"+
		"\2\u011d\u0122\7@\2\2\u011e\u0122\7A\2\2\u011f\u0122\7B\2\2\u0120\u0122"+
		"\7C\2\2\u0121\u0112\3\2\2\2\u0121\u0113\3\2\2\2\u0121\u0114\3\2\2\2\u0121"+
		"\u0115\3\2\2\2\u0121\u0116\3\2\2\2\u0121\u0117\3\2\2\2\u0121\u0118\3\2"+
		"\2\2\u0121\u0119\3\2\2\2\u0121\u011a\3\2\2\2\u0121\u011b\3\2\2\2\u0121"+
		"\u011c\3\2\2\2\u0121\u011d\3\2\2\2\u0121\u011e\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0120\3\2\2\2\u0122#\3\2\2\2\u0123\u0124\t\n\2\2\u0124%\3\2"+
		"\2\2\u0125\u012e\5\60\31\2\u0126\u012e\5\62\32\2\u0127\u012e\5\66\34\2"+
		"\u0128\u012e\5@!\2\u0129\u012e\5,\27\2\u012a\u012e\5(\25\2\u012b\u012e"+
		"\5*\26\2\u012c\u012e\5J&\2\u012d\u0125\3\2\2\2\u012d\u0126\3\2\2\2\u012d"+
		"\u0127\3\2\2\2\u012d\u0128\3\2\2\2\u012d\u0129\3\2\2\2\u012d\u012a\3\2"+
		"\2\2\u012d\u012b\3\2\2\2\u012d\u012c\3\2\2\2\u012e\'\3\2\2\2\u012f\u0130"+
		"\7R\2\2\u0130\u0131\7$\2\2\u0131\u0132\5\34\17\2\u0132\u0133\7%\2\2\u0133"+
		"\u0134\7J\2\2\u0134\u0167\3\2\2\2\u0135\u0136\7R\2\2\u0136\u0138\7$\2"+
		"\2\u0137\u0139\7$\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5\34\17\2"+
		"\u013d\u013e\7%\2\2\u013e\u013f\7J\2\2\u013f\u0140\b\25\1\2\u0140\u0167"+
		"\3\2\2\2\u0141\u0142\7R\2\2\u0142\u0143\7$\2\2\u0143\u0144\5\34\17\2\u0144"+
		"\u0146\7%\2\2\u0145\u0147\7%\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2"+
		"\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b"+
		"\7J\2\2\u014b\u014c\b\25\1\2\u014c\u0167\3\2\2\2\u014d\u014e\7R\2\2\u014e"+
		"\u0150\5\34\17\2\u014f\u0151\7%\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3"+
		"\2\2\2\u0152\u0150\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0155\7J\2\2\u0155\u0156\b\25\1\2\u0156\u0167\3\2\2\2\u0157\u0159\7R"+
		"\2\2\u0158\u015a\7$\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015e\5\34"+
		"\17\2\u015e\u015f\7J\2\2\u015f\u0160\b\25\1\2\u0160\u0167\3\2\2\2\u0161"+
		"\u0162\7R\2\2\u0162\u0163\5\34\17\2\u0163\u0164\7J\2\2\u0164\u0165\b\25"+
		"\1\2\u0165\u0167\3\2\2\2\u0166\u012f\3\2\2\2\u0166\u0135\3\2\2\2\u0166"+
		"\u0141\3\2\2\2\u0166\u014d\3\2\2\2\u0166\u0157\3\2\2\2\u0166\u0161\3\2"+
		"\2\2\u0167)\3\2\2\2\u0168\u0169\7Q\2\2\u0169\u016a\7$\2\2\u016a\u016b"+
		"\7\6\2\2\u016b\u016c\7F\2\2\u016c\u016d\7V\2\2\u016d\u016e\7%\2\2\u016e"+
		"\u019e\7J\2\2\u016f\u0170\7Q\2\2\u0170\u0172\7$\2\2\u0171\u0173\7$\2\2"+
		"\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0177\7\6\2\2\u0177\u0178\7F\2\2\u0178"+
		"\u0179\7V\2\2\u0179\u017a\7%\2\2\u017a\u017b\7J\2\2\u017b\u019e\b\26\1"+
		"\2\u017c\u017d\7Q\2\2\u017d\u017e\7$\2\2\u017e\u017f\7\6\2\2\u017f\u0180"+
		"\7F\2\2\u0180\u0181\7V\2\2\u0181\u0183\7%\2\2\u0182\u0184\7%\2\2\u0183"+
		"\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0183\3\2\2\2\u0185\u0186\3\2"+
		"\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7J\2\2\u0188\u019e\b\26\1\2\u0189"+
		"\u018a\7Q\2\2\u018a\u018b\7\6\2\2\u018b\u018c\7F\2\2\u018c\u018d\7V\2"+
		"\2\u018d\u018e\7%\2\2\u018e\u018f\7J\2\2\u018f\u019e\b\26\1\2\u0190\u0191"+
		"\7Q\2\2\u0191\u0192\7$\2\2\u0192\u0193\7\6\2\2\u0193\u0194\7F\2\2\u0194"+
		"\u0195\7V\2\2\u0195\u0196\7J\2\2\u0196\u019e\b\26\1\2\u0197\u0198\7Q\2"+
		"\2\u0198\u0199\7\6\2\2\u0199\u019a\7F\2\2\u019a\u019b\7V\2\2\u019b\u019c"+
		"\7J\2\2\u019c\u019e\b\26\1\2\u019d\u0168\3\2\2\2\u019d\u016f\3\2\2\2\u019d"+
		"\u017c\3\2\2\2\u019d\u0189\3\2\2\2\u019d\u0190\3\2\2\2\u019d\u0197\3\2"+
		"\2\2\u019e+\3\2\2\2\u019f\u01a6\7\t\2\2\u01a0\u01a6\7\16\2\2\u01a1\u01a3"+
		"\7\33\2\2\u01a2\u01a4\5\34\17\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2"+
		"\2\u01a4\u01a6\3\2\2\2\u01a5\u019f\3\2\2\2\u01a5\u01a0\3\2\2\2\u01a5\u01a1"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ad\7J\2\2\u01a8\u01a9\7\33\2\2\u01a9"+
		"\u01aa\5.\30\2\u01aa\u01ab\7J\2\2\u01ab\u01ad\3\2\2\2\u01ac\u01a5\3\2"+
		"\2\2\u01ac\u01a8\3\2\2\2\u01ad-\3\2\2\2\u01ae\u01af\5N(\2\u01af\u01b0"+
		"\b\30\1\2\u01b0/\3\2\2\2\u01b1\u01b3\5\6\4\2\u01b2\u01b1\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b5\7J\2\2\u01b5\61\3\2\2\2"+
		"\u01b6\u01b8\7(\2\2\u01b7\u01b9\5\64\33\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9"+
		"\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01db\7)\2\2\u01bb\u01bd\7(\2\2\u01bc"+
		"\u01bb\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2"+
		"\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01c2\5\64\33\2\u01c1\u01c0\3\2\2\2\u01c1"+
		"\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01db\b\32\1\2\u01c4\u01c6\7"+
		"(\2\2\u01c5\u01c7\5\64\33\2\u01c6\u01c5\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7"+
		"\u01c8\3\2\2\2\u01c8\u01ca\7)\2\2\u01c9\u01cb\7)\2\2\u01ca\u01c9\3\2\2"+
		"\2\u01cb\u01cc\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce"+
		"\3\2\2\2\u01ce\u01db\b\32\1\2\u01cf\u01d1\7(\2\2\u01d0\u01d2\7(\2\2\u01d1"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2"+
		"\2\2\u01d4\u01d6\3\2\2\2\u01d5\u01d7\5\64\33\2\u01d6\u01d5\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7)\2\2\u01d9\u01db\b\32"+
		"\1\2\u01da\u01b6\3\2\2\2\u01da\u01bc\3\2\2\2\u01da\u01c4\3\2\2\2\u01da"+
		"\u01cf\3\2\2\2\u01db\63\3\2\2\2\u01dc\u01de\5&\24\2\u01dd\u01dc\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df\u01e0\3\2\2\2\u01e0\65"+
		"\3\2\2\2\u01e1\u01e5\58\35\2\u01e2\u01e4\5:\36\2\u01e3\u01e2\3\2\2\2\u01e4"+
		"\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e9\3\2"+
		"\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01ea\5<\37\2\u01e9\u01e8\3\2\2\2\u01e9"+
		"\u01ea\3\2\2\2\u01ea\67\3\2\2\2\u01eb\u01ec\7\27\2\2\u01ec\u01ed\7$\2"+
		"\2\u01ed\u01ee\5> \2\u01ee\u01f0\7%\2\2\u01ef\u01f1\7S\2\2\u01f0\u01ef"+
		"\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3\5\62\32\2"+
		"\u01f3\u023e\3\2\2\2\u01f4\u01f5\7\27\2\2\u01f5\u01f7\5> \2\u01f6\u01f8"+
		"\7%\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9"+
		"\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\7S\2\2\u01fc\u01fb\3\2"+
		"\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u01ff\5\62\32\2\u01ff"+
		"\u0200\b\35\1\2\u0200\u023e\3\2\2\2\u0201\u0203\7\27\2\2\u0202\u0204\7"+
		"$\2\2\u0203\u0202\3\2\2\2\u0204\u0205\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u0209\5> \2\u0208\u020a\7S\2"+
		"\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u020c"+
		"\5\62\32\2\u020c\u020d\b\35\1\2\u020d\u023e\3\2\2\2\u020e\u020f\7\27\2"+
		"\2\u020f\u0210\7$\2\2\u0210\u0211\5> \2\u0211\u0213\7%\2\2\u0212\u0214"+
		"\7%\2\2\u0213\u0212\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0213\3\2\2\2\u0215"+
		"\u0216\3\2\2\2\u0216\u0218\3\2\2\2\u0217\u0219\7S\2\2\u0218\u0217\3\2"+
		"\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\5\62\32\2\u021b"+
		"\u021c\b\35\1\2\u021c\u023e\3\2\2\2\u021d\u021e\7\27\2\2\u021e\u0220\7"+
		"$\2\2\u021f\u0221\7$\2\2\u0220\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224\u0225\5>"+
		" \2\u0225\u0227\7%\2\2\u0226\u0228\7S\2\2\u0227\u0226\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\5\62\32\2\u022a\u022b\b\35\1"+
		"\2\u022b\u023e\3\2\2\2\u022c\u022d\7\27\2\2\u022d\u022f\5> \2\u022e\u0230"+
		"\7S\2\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\5\62\32\2\u0232\u0233\b\35\1\2\u0233\u023e\3\2\2\2\u0234\u0235"+
		"\7\27\2\2\u0235\u0236\7$\2\2\u0236\u0237\5> \2\u0237\u0239\7%\2\2\u0238"+
		"\u023a\7S\2\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u023c\b\35\1\2\u023c\u023e\3\2\2\2\u023d\u01eb\3\2\2\2\u023d"+
		"\u01f4\3\2\2\2\u023d\u0201\3\2\2\2\u023d\u020e\3\2\2\2\u023d\u021d\3\2"+
		"\2\2\u023d\u022c\3\2\2\2\u023d\u0234\3\2\2\2\u023e9\3\2\2\2\u023f\u0240"+
		"\7\22\2\2\u0240\u0241\7\27\2\2\u0241\u0242\7$\2\2\u0242\u0243\5> \2\u0243"+
		"\u0245\7%\2\2\u0244\u0246\7S\2\2\u0245\u0244\3\2\2\2\u0245\u0246\3\2\2"+
		"\2\u0246\u0247\3\2\2\2\u0247\u0248\5\62\32\2\u0248\u0299\3\2\2\2\u0249"+
		"\u024a\7\22\2\2\u024a\u024b\7\27\2\2\u024b\u024d\5> \2\u024c\u024e\7%"+
		"\2\2\u024d\u024c\3\2\2\2\u024e\u024f\3\2\2\2\u024f\u024d\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0252\3\2\2\2\u0251\u0253\7S\2\2\u0252\u0251\3\2"+
		"\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0255\5\62\32\2\u0255"+
		"\u0256\b\36\1\2\u0256\u0299\3\2\2\2\u0257\u0258\7\22\2\2\u0258\u025a\7"+
		"\27\2\2\u0259\u025b\7$\2\2\u025a\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c"+
		"\u025a\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u0260\5>"+
		" \2\u025f\u0261\7S\2\2\u0260\u025f\3\2\2\2\u0260\u0261\3\2\2\2\u0261\u0262"+
		"\3\2\2\2\u0262\u0263\5\62\32\2\u0263\u0264\b\36\1\2\u0264\u0299\3\2\2"+
		"\2\u0265\u0266\7\22\2\2\u0266\u0267\7\27\2\2\u0267\u0268\7$\2\2\u0268"+
		"\u0269\5> \2\u0269\u026b\7%\2\2\u026a\u026c\7%\2\2\u026b\u026a\3\2\2\2"+
		"\u026c\u026d\3\2\2\2\u026d\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0270"+
		"\3\2\2\2\u026f\u0271\7S\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0272\3\2\2\2\u0272\u0273\5\62\32\2\u0273\u0274\b\36\1\2\u0274\u0299"+
		"\3\2\2\2\u0275\u0276\7\22\2\2\u0276\u0277\7\27\2\2\u0277\u0279\7$\2\2"+
		"\u0278\u027a\7$\2\2\u0279\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u0279"+
		"\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027d\3\2\2\2\u027d\u027e\5> \2\u027e"+
		"\u0280\7%\2\2\u027f\u0281\7S\2\2\u0280\u027f\3\2\2\2\u0280\u0281\3\2\2"+
		"\2\u0281\u0282\3\2\2\2\u0282\u0283\5\62\32\2\u0283\u0284\b\36\1\2\u0284"+
		"\u0299\3\2\2\2\u0285\u0286\7\22\2\2\u0286\u0287\7\27\2\2\u0287\u0289\5"+
		"> \2\u0288\u028a\7S\2\2\u0289\u0288\3\2\2\2\u0289\u028a\3\2\2\2\u028a"+
		"\u028b\3\2\2\2\u028b\u028c\5\62\32\2\u028c\u028d\b\36\1\2\u028d\u0299"+
		"\3\2\2\2\u028e\u028f\7\22\2\2\u028f\u0290\7\27\2\2\u0290\u0291\7$\2\2"+
		"\u0291\u0292\5> \2\u0292\u0294\7%\2\2\u0293\u0295\7S\2\2\u0294\u0293\3"+
		"\2\2\2\u0294\u0295\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0297\b\36\1\2\u0297"+
		"\u0299\3\2\2\2\u0298\u023f\3\2\2\2\u0298\u0249\3\2\2\2\u0298\u0257\3\2"+
		"\2\2\u0298\u0265\3\2\2\2\u0298\u0275\3\2\2\2\u0298\u0285\3\2\2\2\u0298"+
		"\u028e\3\2\2\2\u0299;\3\2\2\2\u029a\u029c\7\22\2\2\u029b\u029d\7S\2\2"+
		"\u029c\u029b\3\2\2\2\u029c\u029d\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a5"+
		"\5\62\32\2\u029f\u02a1\7\22\2\2\u02a0\u02a2\7S\2\2\u02a1\u02a0\3\2\2\2"+
		"\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u02a5\b\37\1\2\u02a4\u029a"+
		"\3\2\2\2\u02a4\u029f\3\2\2\2\u02a5=\3\2\2\2\u02a6\u02a7\5\34\17\2\u02a7"+
		"?\3\2\2\2\u02a8\u02a9\7\26\2\2\u02a9\u02aa\5D#\2\u02aa\u02ab\t\13\2\2"+
		"\u02ab\u02ac\7P\2\2\u02ac\u02ad\5\34\17\2\u02ad\u02ae\5\62\32\2\u02ae"+
		"\u03ad\3\2\2\2\u02af\u02b0\7#\2\2\u02b0\u02b1\5D#\2\u02b1\u02b2\t\13\2"+
		"\2\u02b2\u02b3\7P\2\2\u02b3\u02b4\5\34\17\2\u02b4\u02b5\5\62\32\2\u02b5"+
		"\u03ad\3\2\2\2\u02b6\u02b7\7#\2\2\u02b7\u02b8\7$\2\2\u02b8\u02b9\5> \2"+
		"\u02b9\u02ba\7%\2\2\u02ba\u02bb\5\62\32\2\u02bb\u03ad\3\2\2\2\u02bc\u02bd"+
		"\7\20\2\2\u02bd\u02be\5\62\32\2\u02be\u02bf\7#\2\2\u02bf\u02c0\7$\2\2"+
		"\u02c0\u02c1\5> \2\u02c1\u02c2\7%\2\2\u02c2\u02c3\7J\2\2\u02c3\u03ad\3"+
		"\2\2\2\u02c4\u02c5\7\26\2\2\u02c5\u02c6\7$\2\2\u02c6\u02c8\5B\"\2\u02c7"+
		"\u02c9\5> \2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9\u02ca\3\2\2"+
		"\2\u02ca\u02cc\7J\2\2\u02cb\u02cd\5\6\4\2\u02cc\u02cb\3\2\2\2\u02cc\u02cd"+
		"\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce\u02cf\7%\2\2\u02cf\u02d0\5\62\32\2"+
		"\u02d0\u03ad\3\2\2\2\u02d1\u02d2\7#\2\2\u02d2\u02d3\7$\2\2\u02d3\u02d4"+
		"\5> \2\u02d4\u02d5\7%\2\2\u02d5\u02d6\b!\1\2\u02d6\u03ad\3\2\2\2\u02d7"+
		"\u02d8\7#\2\2\u02d8\u02d9\5> \2\u02d9\u02da\5\62\32\2\u02da\u02db\b!\1"+
		"\2\u02db\u03ad\3\2\2\2\u02dc\u02dd\7#\2\2\u02dd\u02df\5> \2\u02de\u02e0"+
		"\7%\2\2\u02df\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\5\62\32\2\u02e4\u02e5\b"+
		"!\1\2\u02e5\u03ad\3\2\2\2\u02e6\u02e8\7#\2\2\u02e7\u02e9\7$\2\2\u02e8"+
		"\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02e8\3\2\2\2\u02ea\u02eb\3\2"+
		"\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\5> \2\u02ed\u02ee\5\62\32\2\u02ee"+
		"\u02ef\b!\1\2\u02ef\u03ad\3\2\2\2\u02f0\u02f1\7#\2\2\u02f1\u02f3\7$\2"+
		"\2\u02f2\u02f4\7$\2\2\u02f3\u02f2\3\2\2\2\u02f4\u02f5\3\2\2\2\u02f5\u02f3"+
		"\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f8\5> \2\u02f8"+
		"\u02f9\7%\2\2\u02f9\u02fa\5\62\32\2\u02fa\u02fb\b!\1\2\u02fb\u03ad\3\2"+
		"\2\2\u02fc\u02fd\7#\2\2\u02fd\u02fe\7$\2\2\u02fe\u02ff\5> \2\u02ff\u0301"+
		"\7%\2\2\u0300\u0302\7%\2\2\u0301\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u0305\3\2\2\2\u0305\u0306\5\62"+
		"\32\2\u0306\u0307\b!\1\2\u0307\u03ad\3\2\2\2\u0308\u0309\7\20\2\2\u0309"+
		"\u030a\7#\2\2\u030a\u030b\7$\2\2\u030b\u030c\5> \2\u030c\u030d\7%\2\2"+
		"\u030d\u030e\7J\2\2\u030e\u030f\b!\1\2\u030f\u03ad\3\2\2\2\u0310\u0311"+
		"\7\20\2\2\u0311\u0312\5\62\32\2\u0312\u0313\7#\2\2\u0313\u0314\5> \2\u0314"+
		"\u0315\7J\2\2\u0315\u0316\b!\1\2\u0316\u03ad\3\2\2\2\u0317\u0318\7\20"+
		"\2\2\u0318\u0319\5\62\32\2\u0319\u031a\7#\2\2\u031a\u031c\5> \2\u031b"+
		"\u031d\7%\2\2\u031c\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031c\3\2"+
		"\2\2\u031e\u031f\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0321\7J\2\2\u0321"+
		"\u0322\b!\1\2\u0322\u03ad\3\2\2\2\u0323\u0324\7\20\2\2\u0324\u0325\5\62"+
		"\32\2\u0325\u0327\7#\2\2\u0326\u0328\7$\2\2\u0327\u0326\3\2\2\2\u0328"+
		"\u0329\3\2\2\2\u0329\u0327\3\2\2\2\u0329\u032a\3\2\2\2\u032a\u032b\3\2"+
		"\2\2\u032b\u032c\5> \2\u032c\u032d\7J\2\2\u032d\u032e\b!\1\2\u032e\u03ad"+
		"\3\2\2\2\u032f\u0330\7\20\2\2\u0330\u0331\5\62\32\2\u0331\u0332\7#\2\2"+
		"\u0332\u0334\7$\2\2\u0333\u0335\7$\2\2\u0334\u0333\3\2\2\2\u0335\u0336"+
		"\3\2\2\2\u0336\u0334\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0338\3\2\2\2\u0338"+
		"\u0339\5> \2\u0339\u033a\7%\2\2\u033a\u033b\7J\2\2\u033b\u033c\b!\1\2"+
		"\u033c\u03ad\3\2\2\2\u033d\u033e\7\20\2\2\u033e\u033f\5\62\32\2\u033f"+
		"\u0340\7#\2\2\u0340\u0341\7$\2\2\u0341\u0342\5> \2\u0342\u0344\7%\2\2"+
		"\u0343\u0345\7%\2\2\u0344\u0343\3\2\2\2\u0345\u0346\3\2\2\2\u0346\u0344"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u0348\3\2\2\2\u0348\u0349\7J\2\2\u0349"+
		"\u034a\b!\1\2\u034a\u03ad\3\2\2\2\u034b\u034c\7\26\2\2\u034c\u034d\7$"+
		"\2\2\u034d\u034f\5B\"\2\u034e\u0350\5> \2\u034f\u034e\3\2\2\2\u034f\u0350"+
		"\3\2\2\2\u0350\u0351\3\2\2\2\u0351\u0353\7J\2\2\u0352\u0354\5\6\4\2\u0353"+
		"\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0356\7%"+
		"\2\2\u0356\u0357\b!\1\2\u0357\u03ad\3\2\2\2\u0358\u0359\7\26\2\2\u0359"+
		"\u035b\5B\"\2\u035a\u035c\5> \2\u035b\u035a\3\2\2\2\u035b\u035c\3\2\2"+
		"\2\u035c\u035d\3\2\2\2\u035d\u035f\7J\2\2\u035e\u0360\5\6\4\2\u035f\u035e"+
		"\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0362\5\62\32\2"+
		"\u0362\u0363\b!\1\2\u0363\u03ad\3\2\2\2\u0364\u0365\7\26\2\2\u0365\u0367"+
		"\5B\"\2\u0366\u0368\5> \2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036b\7J\2\2\u036a\u036c\5\6\4\2\u036b\u036a\3\2"+
		"\2\2\u036b\u036c\3\2\2\2\u036c\u036e\3\2\2\2\u036d\u036f\7%\2\2\u036e"+
		"\u036d\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2"+
		"\2\2\u0371\u0372\3\2\2\2\u0372\u0373\5\62\32\2\u0373\u0374\b!\1\2\u0374"+
		"\u03ad\3\2\2\2\u0375\u0377\7\26\2\2\u0376\u0378\7$\2\2\u0377\u0376\3\2"+
		"\2\2\u0378\u0379\3\2\2\2\u0379\u0377\3\2\2\2\u0379\u037a\3\2\2\2\u037a"+
		"\u037b\3\2\2\2\u037b\u037d\5B\"\2\u037c\u037e\5> \2\u037d\u037c\3\2\2"+
		"\2\u037d\u037e\3\2\2\2\u037e\u037f\3\2\2\2\u037f\u0381\7J\2\2\u0380\u0382"+
		"\5\6\4\2\u0381\u0380\3\2\2\2\u0381\u0382\3\2\2\2\u0382\u0383\3\2\2\2\u0383"+
		"\u0384\5\62\32\2\u0384\u0385\b!\1\2\u0385\u03ad\3\2\2\2\u0386\u0387\7"+
		"\26\2\2\u0387\u0389\7$\2\2\u0388\u038a\7$\2\2\u0389\u0388\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u0389\3\2\2\2\u038b\u038c\3\2\2\2\u038c\u038d\3\2"+
		"\2\2\u038d\u038f\5B\"\2\u038e\u0390\5> \2\u038f\u038e\3\2\2\2\u038f\u0390"+
		"\3\2\2\2\u0390\u0391\3\2\2\2\u0391\u0393\7J\2\2\u0392\u0394\5\6\4\2\u0393"+
		"\u0392\3\2\2\2\u0393\u0394\3\2\2\2\u0394\u0395\3\2\2\2\u0395\u0396\7%"+
		"\2\2\u0396\u0397\5\62\32\2\u0397\u0398\b!\1\2\u0398\u03ad\3\2\2\2\u0399"+
		"\u039a\7\26\2\2\u039a\u039b\7$\2\2\u039b\u039d\5B\"\2\u039c\u039e\5> "+
		"\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u039f\3\2\2\2\u039f\u03a1"+
		"\7J\2\2\u03a0\u03a2\5\6\4\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2\3\2\2\2\u03a2"+
		"\u03a3\3\2\2\2\u03a3\u03a5\7%\2\2\u03a4\u03a6\7%\2\2\u03a5\u03a4\3\2\2"+
		"\2\u03a6\u03a7\3\2\2\2\u03a7\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a9"+
		"\3\2\2\2\u03a9\u03aa\5\62\32\2\u03aa\u03ab\b!\1\2\u03ab\u03ad\3\2\2\2"+
		"\u03ac\u02a8\3\2\2\2\u03ac\u02af\3\2\2\2\u03ac\u02b6\3\2\2\2\u03ac\u02bc"+
		"\3\2\2\2\u03ac\u02c4\3\2\2\2\u03ac\u02d1\3\2\2\2\u03ac\u02d7\3\2\2\2\u03ac"+
		"\u02dc\3\2\2\2\u03ac\u02e6\3\2\2\2\u03ac\u02f0\3\2\2\2\u03ac\u02fc\3\2"+
		"\2\2\u03ac\u0308\3\2\2\2\u03ac\u0310\3\2\2\2\u03ac\u0317\3\2\2\2\u03ac"+
		"\u0323\3\2\2\2\u03ac\u032f\3\2\2\2\u03ac\u033d\3\2\2\2\u03ac\u034b\3\2"+
		"\2\2\u03ac\u0358\3\2\2\2\u03ac\u0364\3\2\2\2\u03ac\u0375\3\2\2\2\u03ac"+
		"\u0386\3\2\2\2\u03ac\u0399\3\2\2\2\u03adA\3\2\2\2\u03ae\u03b1\5\60\31"+
		"\2\u03af\u03b1\5J&\2\u03b0\u03ae\3\2\2\2\u03b0\u03af\3\2\2\2\u03b1C\3"+
		"\2\2\2\u03b2\u03b8\5\6\4\2\u03b3\u03b5\5L\'\2\u03b4\u03b3\3\2\2\2\u03b4"+
		"\u03b5\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b8\5V,\2\u03b7\u03b2\3\2\2"+
		"\2\u03b7\u03b4\3\2\2\2\u03b8E\3\2\2\2\u03b9\u03bd\5J&\2\u03ba\u03bd\5"+
		"R*\2\u03bb\u03bd\5H%\2\u03bc\u03b9\3\2\2\2\u03bc\u03ba\3\2\2\2\u03bc\u03bb"+
		"\3\2\2\2\u03bdG\3\2\2\2\u03be\u03bf\7J\2\2\u03bfI\3\2\2\2\u03c0\u03c2"+
		"\5L\'\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c4\3\2\2\2\u03c3"+
		"\u03c5\5V,\2\u03c4\u03c3\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c6\3\2\2"+
		"\2\u03c6\u03c7\7J\2\2\u03c7K\3\2\2\2\u03c8\u03ca\t\f\2\2\u03c9\u03c8\3"+
		"\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cb\3\2\2\2\u03cb\u03ce\5N(\2\u03cc"+
		"\u03cd\7&\2\2\u03cd\u03cf\7\'\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2"+
		"\2\2\u03cfM\3\2\2\2\u03d0\u03d1\t\r\2\2\u03d1O\3\2\2\2\u03d2\u03d4\7V"+
		"\2\2\u03d3\u03d5\5`\61\2\u03d4\u03d3\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03dd\3\2\2\2\u03d6\u03d8\5$\23\2\u03d7\u03d9\5`\61\2\u03d8\u03d7\3\2"+
		"\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da\u03db\b)\1\2\u03db"+
		"\u03dd\3\2\2\2\u03dc\u03d2\3\2\2\2\u03dc\u03d6\3\2\2\2\u03ddQ\3\2\2\2"+
		"\u03de\u03e0\7T\2\2\u03df\u03de\3\2\2\2\u03df\u03e0\3\2\2\2\u03e0\u03e1"+
		"\3\2\2\2\u03e1\u03e2\5L\'\2\u03e2\u03e3\5P)\2\u03e3\u03e4\5\62\32\2\u03e4"+
		"\u03ee\3\2\2\2\u03e5\u03ee\5T+\2\u03e6\u03e8\7T\2\2\u03e7\u03e6\3\2\2"+
		"\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03ea\5L\'\2\u03ea\u03eb"+
		"\5P)\2\u03eb\u03ec\b*\1\2\u03ec\u03ee\3\2\2\2\u03ed\u03df\3\2\2\2\u03ed"+
		"\u03e5\3\2\2\2\u03ed\u03e7\3\2\2\2\u03eeS\3\2\2\2\u03ef\u03f1\7T\2\2\u03f0"+
		"\u03ef\3\2\2\2\u03f0\u03f1\3\2\2\2\u03f1\u03f3\3\2\2\2\u03f2\u03f4\5L"+
		"\'\2\u03f3\u03f2\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f4\u03f5\3\2\2\2\u03f5"+
		"\u03f6\7U\2\2\u03f6\u03f7\7$\2\2\u03f7\u03f8\7%\2\2\u03f8\u044c\5\62\32"+
		"\2\u03f9\u03fb\7T\2\2\u03fa\u03f9\3\2\2\2\u03fa\u03fb\3\2\2\2\u03fb\u03fd"+
		"\3\2\2\2\u03fc\u03fe\5L\'\2\u03fd\u03fc\3\2\2\2\u03fd\u03fe\3\2\2\2\u03fe"+
		"\u03ff\3\2\2\2\u03ff\u0400\7U\2\2\u0400\u044c\b+\1\2\u0401\u0403\7T\2"+
		"\2\u0402\u0401\3\2\2\2\u0402\u0403\3\2\2\2\u0403\u0405\3\2\2\2\u0404\u0406"+
		"\5L\'\2\u0405\u0404\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407"+
		"\u0408\7U\2\2\u0408\u0409\5\62\32\2\u0409\u040a\b+\1\2\u040a\u044c\3\2"+
		"\2\2\u040b\u040d\7T\2\2\u040c\u040b\3\2\2\2\u040c\u040d\3\2\2\2\u040d"+
		"\u040f\3\2\2\2\u040e\u0410\5L\'\2\u040f\u040e\3\2\2\2\u040f\u0410\3\2"+
		"\2\2\u0410\u0411\3\2\2\2\u0411\u0413\7U\2\2\u0412\u0414\7%\2\2\u0413\u0412"+
		"\3\2\2\2\u0414\u0415\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416"+
		"\u0417\3\2\2\2\u0417\u0418\5\62\32\2\u0418\u0419\b+\1\2\u0419\u044c\3"+
		"\2\2\2\u041a\u041c\7T\2\2\u041b\u041a\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041e\3\2\2\2\u041d\u041f\5L\'\2\u041e\u041d\3\2\2\2\u041e\u041f\3\2"+
		"\2\2\u041f\u0420\3\2\2\2\u0420\u0422\7U\2\2\u0421\u0423\7$\2\2\u0422\u0421"+
		"\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0422\3\2\2\2\u0424\u0425\3\2\2\2\u0425"+
		"\u0426\3\2\2\2\u0426\u0427\5\62\32\2\u0427\u0428\b+\1\2\u0428\u044c\3"+
		"\2\2\2\u0429\u042b\7T\2\2\u042a\u0429\3\2\2\2\u042a\u042b\3\2\2\2\u042b"+
		"\u042d\3\2\2\2\u042c\u042e\5L\'\2\u042d\u042c\3\2\2\2\u042d\u042e\3\2"+
		"\2\2\u042e\u042f\3\2\2\2\u042f\u0430\7U\2\2\u0430\u0432\7$\2\2\u0431\u0433"+
		"\7$\2\2\u0432\u0431\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0432\3\2\2\2\u0434"+
		"\u0435\3\2\2\2\u0435\u0436\3\2\2\2\u0436\u0437\7%\2\2\u0437\u0438\5\62"+
		"\32\2\u0438\u0439\b+\1\2\u0439\u044c\3\2\2\2\u043a\u043c\7T\2\2\u043b"+
		"\u043a\3\2\2\2\u043b\u043c\3\2\2\2\u043c\u043e\3\2\2\2\u043d\u043f\5L"+
		"\'\2\u043e\u043d\3\2\2\2\u043e\u043f\3\2\2\2\u043f\u0440\3\2\2\2\u0440"+
		"\u0441\7U\2\2\u0441\u0442\7$\2\2\u0442\u0444\7%\2\2\u0443\u0445\7%\2\2"+
		"\u0444\u0443\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u0444\3\2\2\2\u0446\u0447"+
		"\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\5\62\32\2\u0449\u044a\b+\1\2"+
		"\u044a\u044c\3\2\2\2\u044b\u03f0\3\2\2\2\u044b\u03fa\3\2\2\2\u044b\u0402"+
		"\3\2\2\2\u044b\u040c\3\2\2\2\u044b\u041b\3\2\2\2\u044b\u042a\3\2\2\2\u044b"+
		"\u043b\3\2\2\2\u044cU\3\2\2\2\u044d\u0452\5X-\2\u044e\u044f\7F\2\2\u044f"+
		"\u0451\5X-\2\u0450\u044e\3\2\2\2\u0451\u0454\3\2\2\2\u0452\u0450\3\2\2"+
		"\2\u0452\u0453\3\2\2\2\u0453W\3\2\2\2\u0454\u0452\3\2\2\2\u0455\u0457"+
		"\5P)\2\u0456\u0458\5Z.\2\u0457\u0456\3\2\2\2\u0457\u0458\3\2\2\2\u0458"+
		"Y\3\2\2\2\u0459\u045a\7\63\2\2\u045a\u045b\5\\/\2\u045b[\3\2\2\2\u045c"+
		"\u045d\5\b\5\2\u045d]\3\2\2\2\u045e\u0463\5\\/\2\u045f\u0460\7F\2\2\u0460"+
		"\u0462\5\\/\2\u0461\u045f\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2"+
		"\2\2\u0463\u0464\3\2\2\2\u0464_\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u0468"+
		"\7$\2\2\u0467\u0469\5b\62\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u048b\7%\2\2\u046b\u046d\7$\2\2\u046c\u046b\3\2\2"+
		"\2\u046d\u046e\3\2\2\2\u046e\u046c\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0471"+
		"\3\2\2\2\u0470\u0472\5b\62\2\u0471\u0470\3\2\2\2\u0471\u0472\3\2\2\2\u0472"+
		"\u0473\3\2\2\2\u0473\u048b\b\61\1\2\u0474\u0476\7$\2\2\u0475\u0477\5b"+
		"\62\2\u0476\u0475\3\2\2\2\u0476\u0477\3\2\2\2\u0477\u0478\3\2\2\2\u0478"+
		"\u047a\7%\2\2\u0479\u047b\7%\2\2\u047a\u0479\3\2\2\2\u047b\u047c\3\2\2"+
		"\2\u047c\u047a\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047e\3\2\2\2\u047e\u048b"+
		"\b\61\1\2\u047f\u0481\7$\2\2\u0480\u0482\7$\2\2\u0481\u0480\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u0481\3\2\2\2\u0483\u0484\3\2\2\2\u0484\u0486\3\2"+
		"\2\2\u0485\u0487\5b\62\2\u0486\u0485\3\2\2\2\u0486\u0487\3\2\2\2\u0487"+
		"\u0488\3\2\2\2\u0488\u0489\7%\2\2\u0489\u048b\b\61\1\2\u048a\u0466\3\2"+
		"\2\2\u048a\u046c\3\2\2\2\u048a\u0474\3\2\2\2\u048a\u047f\3\2\2\2\u048b"+
		"a\3\2\2\2\u048c\u0491\5d\63\2\u048d\u048e\7F\2\2\u048e\u0490\5d\63\2\u048f"+
		"\u048d\3\2\2\2\u0490\u0493\3\2\2\2\u0491\u048f\3\2\2\2\u0491\u0492\3\2"+
		"\2\2\u0492c\3\2\2\2\u0493\u0491\3\2\2\2\u0494\u0495\5L\'\2\u0495\u0498"+
		"\5P)\2\u0496\u0497\7\63\2\2\u0497\u0499\5\\/\2\u0498\u0496\3\2\2\2\u0498"+
		"\u0499\3\2\2\2\u0499e\3\2\2\2\u0098hjx|~\u0081\u008a\u0091\u0099\u00a1"+
		"\u00a9\u00b1\u00b9\u00be\u00c5\u00d0\u00d5\u00db\u00e1\u00f3\u00fa\u00fe"+
		"\u0103\u0106\u010c\u0121\u012d\u013a\u0148\u0152\u015b\u0166\u0174\u0185"+
		"\u019d\u01a3\u01a5\u01ac\u01b2\u01b8\u01be\u01c1\u01c6\u01cc\u01d3\u01d6"+
		"\u01da\u01df\u01e5\u01e9\u01f0\u01f9\u01fc\u0205\u0209\u0215\u0218\u0222"+
		"\u0227\u022f\u0239\u023d\u0245\u024f\u0252\u025c\u0260\u026d\u0270\u027b"+
		"\u0280\u0289\u0294\u0298\u029c\u02a1\u02a4\u02c8\u02cc\u02e1\u02ea\u02f5"+
		"\u0303\u031e\u0329\u0336\u0346\u034f\u0353\u035b\u035f\u0367\u036b\u0370"+
		"\u0379\u037d\u0381\u038b\u038f\u0393\u039d\u03a1\u03a7\u03ac\u03b0\u03b4"+
		"\u03b7\u03bc\u03c1\u03c4\u03c9\u03ce\u03d4\u03d8\u03dc\u03df\u03e7\u03ed"+
		"\u03f0\u03f3\u03fa\u03fd\u0402\u0405\u040c\u040f\u0415\u041b\u041e\u0424"+
		"\u042a\u042d\u0434\u043b\u043e\u0446\u044b\u0452\u0457\u0463\u0468\u046e"+
		"\u0471\u0476\u047c\u0483\u0486\u048a\u0491\u0498";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}