// Generated from D:/Documents/La Salle/CMPILER/pseudocode/res\PseudocodeParser.g4 by ANTLR 4.9
package antlr;
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
		RULE_init = 0, RULE_primaryExpression = 1, RULE_variableName = 2, RULE_expression = 3, 
		RULE_logicalOrExpression = 4, RULE_logicalAndExpression = 5, RULE_equalityExpression = 6, 
		RULE_relationalExpression = 7, RULE_additiveExpression = 8, RULE_multiplicativeExpression = 9, 
		RULE_unaryExpression = 10, RULE_createExpression = 11, RULE_postfixExpression = 12, 
		RULE_arrayAccess = 13, RULE_functionCall = 14, RULE_expressionList = 15, 
		RULE_assignmentOperator = 16, RULE_binaryOperator = 17, RULE_literal = 18, 
		RULE_statement = 19, RULE_expressionStatement = 20, RULE_badExpression = 21, 
		RULE_functionCallStatement = 22, RULE_assignmentStatement = 23, RULE_badAssignment = 24, 
		RULE_printStatement = 25, RULE_scanStatement = 26, RULE_breakStatement = 27, 
		RULE_continueStatement = 28, RULE_returnStatement = 29, RULE_badReturn = 30, 
		RULE_compoundStatement = 31, RULE_statementSeq = 32, RULE_selectionStatement = 33, 
		RULE_ifStatement = 34, RULE_elseIfStatement = 35, RULE_elseStatement = 36, 
		RULE_iterationStatement = 37, RULE_forStatement = 38, RULE_whileStatement = 39, 
		RULE_doWhileStatement = 40, RULE_iterationInit = 41, RULE_badIteration = 42, 
		RULE_declaration = 43, RULE_simpleDeclaration = 44, RULE_variableDeclaration = 45, 
		RULE_arrayDeclaration = 46, RULE_declSpecifierSeq = 47, RULE_variableSpecifier = 48, 
		RULE_arraySpecifier = 49, RULE_badConst = 50, RULE_typeSpecifier = 51, 
		RULE_functionDefinition = 52, RULE_mainFunction = 53, RULE_initDeclaratorList = 54, 
		RULE_initDeclarator = 55, RULE_initializer = 56, RULE_parametersAndQualifiers = 57, 
		RULE_parameterDeclarationClause = 58, RULE_parameterDeclaration = 59;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "primaryExpression", "variableName", "expression", "logicalOrExpression", 
			"logicalAndExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "unaryExpression", 
			"createExpression", "postfixExpression", "arrayAccess", "functionCall", 
			"expressionList", "assignmentOperator", "binaryOperator", "literal", 
			"statement", "expressionStatement", "badExpression", "functionCallStatement", 
			"assignmentStatement", "badAssignment", "printStatement", "scanStatement", 
			"breakStatement", "continueStatement", "returnStatement", "badReturn", 
			"compoundStatement", "statementSeq", "selectionStatement", "ifStatement", 
			"elseIfStatement", "elseStatement", "iterationStatement", "forStatement", 
			"whileStatement", "doWhileStatement", "iterationInit", "badIteration", 
			"declaration", "simpleDeclaration", "variableDeclaration", "arrayDeclaration", 
			"declSpecifierSeq", "variableSpecifier", "arraySpecifier", "badConst", 
			"typeSpecifier", "functionDefinition", "mainFunction", "initDeclaratorList", 
			"initDeclarator", "initializer", "parametersAndQualifiers", "parameterDeclarationClause", 
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << String) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Function - 64)) | (1L << (Main - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(120);
					declaration();
					}
					break;
				case 2:
					{
					setState(121);
					statement();
					}
					break;
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(127);
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
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(PseudocodeParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(PseudocodeParser.RightParen, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(PseudocodeParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PseudocodeParser.Identifier, i);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				variableName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(LeftParen);
				setState(132);
				expression();
				setState(133);
				match(RightParen);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				match(LeftParen);
				setState(136);
				expression();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(LeftParen);
				setState(140);
				expression();
				setState(141);
				match(RightParen);
				setState(142);
				match(RightParen);
				 notifyErrorListeners("too many closing parentheses"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Identifier:
					{
					setState(145);
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
					setState(146);
					literal();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(151); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(151);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Identifier:
							{
							setState(149);
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
							setState(150);
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
					setState(153); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("expected double quotes or operators"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(156);
				match(Identifier);
				setState(157);
				match(Identifier);
				setState(158);
				match(Colon);
				setState(159);
				match(IntegerLiteral);
				setState(160);
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

	public static class VariableNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
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
		enterRule(_localctx, 6, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
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
			setState(168);
			logicalAndExpression();
			setState(173);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(169);
					match(OrOr);
					setState(170);
					logicalAndExpression();
					}
					} 
				}
				setState(175);
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
			setState(176);
			equalityExpression();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(AndAnd);
					setState(178);
					equalityExpression();
					}
					} 
				}
				setState(183);
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
			setState(184);
			relationalExpression();
			setState(189);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(185);
					_la = _input.LA(1);
					if ( !(_la==Equal || _la==NotEqual) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(186);
					relationalExpression();
					}
					} 
				}
				setState(191);
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
			setState(192);
			additiveExpression();
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					_la = _input.LA(1);
					if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & ((1L << (Less - 53)) | (1L << (Greater - 53)) | (1L << (LessEqual - 53)) | (1L << (GreaterEqual - 53)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(194);
					additiveExpression();
					}
					} 
				}
				setState(199);
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
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				multiplicativeExpression();
				setState(205);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(201);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
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
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				multiplicativeExpression();
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(209);
						_la = _input.LA(1);
						if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (Plus - 43)) | (1L << (Minus - 43)) | (1L << (PlusPlus - 43)) | (1L << (MinusMinus - 43)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(210);
						multiplicativeExpression();
						}
						} 
					}
					setState(215);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
			setState(220);
			unaryExpression(0);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Star) | (1L << Div) | (1L << Mod))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(222);
					unaryExpression(0);
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
			setState(236);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case CharacterLiteral:
			case FloatingLiteral:
			case BadFloatingLiteral:
			case StringLiteral:
			case BadStringLiteral:
			case BooleanLiteral:
			case LeftParen:
			case Identifier:
				{
				setState(229);
				postfixExpression();
				}
				break;
			case Not:
				{
				setState(230);
				match(Not);
				setState(231);
				unaryExpression(3);
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
				setState(232);
				((UnaryExpressionContext)_localctx).binaryOperator = binaryOperator();
				setState(233);
				unaryExpression(2);
				 notifyErrorListeners("redundant binary operator: '" + (((UnaryExpressionContext)_localctx).binaryOperator!=null?_input.getText(((UnaryExpressionContext)_localctx).binaryOperator.start,((UnaryExpressionContext)_localctx).binaryOperator.stop):null) + "'"); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnaryExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_unaryExpression);
					setState(238);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(239);
					((UnaryExpressionContext)_localctx).binaryOperator = binaryOperator();
					 notifyErrorListeners("redundant binary operator: '" + (((UnaryExpressionContext)_localctx).binaryOperator!=null?_input.getText(((UnaryExpressionContext)_localctx).binaryOperator.start,((UnaryExpressionContext)_localctx).binaryOperator.stop):null) + "'"); 
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(247);
			_la = _input.LA(1);
			if ( !(_la==Create || _la==New) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(248);
			typeSpecifier();
			setState(249);
			match(LeftBracket);
			setState(250);
			expression();
			setState(251);
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
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public TerminalNode PlusPlus() { return getToken(PseudocodeParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(PseudocodeParser.MinusMinus, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
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
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(253);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				arrayAccess();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(255);
				functionCall();
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
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
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
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("redundant parentheses"); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(272);
				match(Identifier);
				setState(273);
				match(LeftParen);
				setState(274);
				match(LeftParen);
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(275);
					expressionList();
					}
				}

				setState(278);
				match(RightParen);
				 notifyErrorListeners("redundant opening parenthesis"); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(280);
				match(Identifier);
				setState(281);
				match(LeftParen);
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(282);
					expressionList();
					}
				}

				setState(285);
				match(RightParen);
				setState(286);
				match(RightParen);
				 notifyErrorListeners("redundant closing parenthesis"); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(288);
				match(Identifier);
				setState(289);
				match(LeftParen);
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(290);
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

	public static class ArrayAccessContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public TerminalNode LeftBracket() { return getToken(PseudocodeParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(PseudocodeParser.RightBracket, 0); }
		public ArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAccessContext arrayAccess() throws RecognitionException {
		ArrayAccessContext _localctx = new ArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(Identifier);
			setState(297);
			match(LeftBracket);
			setState(298);
			expression();
			setState(299);
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

	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(PseudocodeParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(PseudocodeParser.RightParen, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(Identifier);
			setState(302);
			match(LeftParen);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
				{
				setState(303);
				expressionList();
				}
			}

			setState(306);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(PseudocodeParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PseudocodeParser.Comma, i);
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
		enterRule(_localctx, 30, RULE_expressionList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			expression();
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(309);
					match(Comma);
					setState(310);
					expression();
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 32, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
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
		enterRule(_localctx, 34, RULE_binaryOperator);
		try {
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				assignmentOperator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				match(Plus);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				match(Minus);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(Star);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(322);
				match(Div);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(323);
				match(Mod);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(324);
				match(Greater);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(325);
				match(Less);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(326);
				match(GreaterEqual);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(327);
				match(Equal);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(328);
				match(NotEqual);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(329);
				match(LessEqual);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(330);
				match(GreaterEqual);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(331);
				match(AndAnd);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(332);
				match(OrOr);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(333);
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
		enterRule(_localctx, 36, RULE_literal);
		try {
			setState(345);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(IntegerLiteral);
				}
				break;
			case CharacterLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				match(CharacterLiteral);
				}
				break;
			case FloatingLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				match(FloatingLiteral);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(339);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(BooleanLiteral);
				}
				break;
			case BadStringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(341);
				match(BadStringLiteral);
				 notifyErrorListeners("expected closing double quotes"); 
				}
				break;
			case BadFloatingLiteral:
				enterOuterAlt(_localctx, 7);
				{
				setState(343);
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
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
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
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
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
		enterRule(_localctx, 38, RULE_statement);
		try {
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(347);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				selectionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				iterationStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				breakStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				continueStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				returnStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(354);
				printStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(355);
				scanStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(356);
				simpleDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(357);
				functionCallStatement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(358);
				expressionStatement();
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
		public BadExpressionContext badExpression() {
			return getRuleContext(BadExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
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
		enterRule(_localctx, 40, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			badExpression();
			setState(362);
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

	public static class BadExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BadExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterBadExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitBadExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitBadExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BadExpressionContext badExpression() throws RecognitionException {
		BadExpressionContext _localctx = new BadExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_badExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			expression();
			 notifyErrorListeners("unknown operation, expected assignment statement."); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			functionCall();
			setState(368);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public BadAssignmentContext badAssignment() {
			return getRuleContext(BadAssignmentContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignmentStatement);
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(370);
					variableName();
					}
					break;
				case 2:
					{
					setState(371);
					arrayAccess();
					}
					break;
				}
				setState(374);
				assignmentOperator();
				setState(375);
				expression();
				setState(376);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				badAssignment();
				setState(379);
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

	public static class BadAssignmentContext extends ParserRuleContext {
		public TerminalNode PlusPlus() { return getToken(PseudocodeParser.PlusPlus, 0); }
		public TerminalNode Plus() { return getToken(PseudocodeParser.Plus, 0); }
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public ArrayAccessContext arrayAccess() {
			return getRuleContext(ArrayAccessContext.class,0);
		}
		public BadAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_badAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterBadAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitBadAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitBadAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BadAssignmentContext badAssignment() throws RecognitionException {
		BadAssignmentContext _localctx = new BadAssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_badAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(383);
				variableName();
				}
				break;
			case 2:
				{
				setState(384);
				arrayAccess();
				}
				break;
			}
			setState(387);
			match(PlusPlus);
			setState(388);
			match(Plus);
			 notifyErrorListeners("redundant +"); 
			}
		}
		catch (RecognitionException re) {
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 50, RULE_printStatement);
		int _la;
		try {
			int _alt;
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(Print);
				setState(392);
				match(LeftParen);
				setState(393);
				expression();
				setState(394);
				match(RightParen);
				setState(395);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(397);
				match(Print);
				setState(398);
				match(LeftParen);
				setState(400); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(399);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(402); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(404);
				expression();
				setState(405);
				match(RightParen);
				setState(406);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				match(Print);
				setState(410);
				match(LeftParen);
				setState(411);
				expression();
				setState(412);
				match(RightParen);
				setState(414); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(413);
					match(RightParen);
					}
					}
					setState(416); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(418);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(421);
				match(Print);
				setState(423); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(422);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(425); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(427);
				expression();
				setState(428);
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
		enterRule(_localctx, 52, RULE_scanStatement);
		int _la;
		try {
			setState(473);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(433);
				match(Scan);
				setState(434);
				match(LeftParen);
				setState(435);
				match(StringLiteral);
				setState(436);
				match(Comma);
				setState(437);
				match(Identifier);
				setState(438);
				match(RightParen);
				setState(439);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				match(Scan);
				setState(441);
				match(LeftParen);
				setState(443); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(442);
					match(LeftParen);
					}
					}
					setState(445); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(447);
				match(StringLiteral);
				setState(448);
				match(Comma);
				setState(449);
				match(Identifier);
				setState(450);
				match(RightParen);
				setState(451);
				match(Semi);
				 notifyErrorListeners("too many open parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(Scan);
				setState(454);
				match(LeftParen);
				setState(455);
				match(StringLiteral);
				setState(456);
				match(Comma);
				setState(457);
				match(Identifier);
				setState(458);
				match(RightParen);
				setState(460); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(459);
					match(RightParen);
					}
					}
					setState(462); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(464);
				match(Semi);
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				match(Scan);
				setState(467);
				match(LeftParen);
				setState(468);
				match(StringLiteral);
				setState(469);
				match(Comma);
				setState(470);
				match(Identifier);
				setState(471);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(PseudocodeParser.Break, 0); }
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			match(Break);
			setState(476);
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(PseudocodeParser.Continue, 0); }
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitContinueStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitContinueStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			match(Continue);
			setState(479);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(PseudocodeParser.Return, 0); }
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BadReturnContext badReturn() {
			return getRuleContext(BadReturnContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_returnStatement);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(481);
				match(Return);
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << LeftParen) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(482);
					expression();
					}
				}

				setState(485);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(Return);
				setState(487);
				badReturn();
				setState(488);
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
		enterRule(_localctx, 60, RULE_badReturn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			typeSpecifier();
			 notifyErrorListeners("expected expression as return storage"); 
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 62, RULE_compoundStatement);
		int _la;
		try {
			int _alt;
			setState(531);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(495);
				match(LeftBrace);
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << String) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(496);
					statementSeq();
					}
				}

				setState(499);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(501); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(500);
						match(LeftBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(503); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(506);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(505);
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
				setState(509);
				match(LeftBrace);
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << String) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(510);
					statementSeq();
					}
				}

				setState(513);
				match(RightBrace);
				setState(515); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(514);
						match(RightBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(517); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				 notifyErrorListeners("too many closing curly braces"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(520);
				match(LeftBrace);
				setState(522); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(521);
						match(LeftBrace);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(524); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << CharacterLiteral) | (1L << FloatingLiteral) | (1L << BadFloatingLiteral) | (1L << StringLiteral) | (1L << BadStringLiteral) | (1L << BooleanLiteral) | (1L << Bool) | (1L << Break) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Do) | (1L << Double) | (1L << Float) | (1L << For) | (1L << If) | (1L << Int) | (1L << Long) | (1L << Return) | (1L << Short) | (1L << String) | (1L << Void) | (1L << While) | (1L << LeftParen) | (1L << LeftBrace) | (1L << Plus) | (1L << Minus) | (1L << Star) | (1L << Div) | (1L << Mod) | (1L << Not) | (1L << Assign) | (1L << Less) | (1L << Greater) | (1L << PlusAssign) | (1L << MinusAssign) | (1L << StarAssign) | (1L << DivAssign) | (1L << ModAssign) | (1L << Equal))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (NotEqual - 64)) | (1L << (LessEqual - 64)) | (1L << (GreaterEqual - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Comma - 64)) | (1L << (Scan - 64)) | (1L << (Print - 64)) | (1L << (Identifier - 64)))) != 0)) {
					{
					setState(526);
					statementSeq();
					}
				}

				setState(529);
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
		enterRule(_localctx, 64, RULE_statementSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(534); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(533);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(536); 
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
		enterRule(_localctx, 66, RULE_selectionStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			ifStatement();
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(539);
					elseIfStatement();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(545);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 68, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(If);
				setState(549);
				match(LeftParen);
				setState(550);
				expression();
				setState(551);
				match(RightParen);
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(552);
					match(Then);
					}
				}

				setState(555);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(557);
				match(If);
				setState(559); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(558);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(561); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(563);
				expression();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(564);
					match(Then);
					}
				}

				setState(567);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(570);
				match(If);
				setState(571);
				match(LeftParen);
				setState(572);
				expression();
				setState(573);
				match(RightParen);
				setState(575); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(574);
					match(RightParen);
					}
					}
					setState(577); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(579);
					match(Then);
					}
				}

				setState(582);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				match(If);
				setState(586);
				match(LeftParen);
				setState(588); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(587);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(590); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(592);
				expression();
				setState(593);
				match(RightParen);
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(594);
					match(Then);
					}
				}

				setState(597);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 70, RULE_elseIfStatement);
		int _la;
		try {
			int _alt;
			setState(658);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(Else);
				setState(603);
				match(If);
				setState(604);
				match(LeftParen);
				setState(605);
				expression();
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
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(612);
				match(Else);
				setState(613);
				match(If);
				setState(615); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(614);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(617); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(619);
				expression();
				setState(621);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(620);
					match(Then);
					}
				}

				setState(623);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(626);
				match(Else);
				setState(627);
				match(If);
				setState(628);
				match(LeftParen);
				setState(629);
				expression();
				setState(630);
				match(RightParen);
				setState(632); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(631);
					match(RightParen);
					}
					}
					setState(634); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(636);
					match(Then);
					}
				}

				setState(639);
				compoundStatement();
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(642);
				match(Else);
				setState(643);
				match(If);
				setState(644);
				match(LeftParen);
				setState(646); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(645);
						match(LeftParen);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(648); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(650);
				expression();
				setState(651);
				match(RightParen);
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Then) {
					{
					setState(652);
					match(Then);
					}
				}

				setState(655);
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
		enterRule(_localctx, 72, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(Else);
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Then) {
				{
				setState(661);
				match(Then);
				}
			}

			setState(664);
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

	public static class IterationStatementContext extends ParserRuleContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
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
		enterRule(_localctx, 74, RULE_iterationStatement);
		try {
			setState(669);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case For:
				enterOuterAlt(_localctx, 1);
				{
				setState(666);
				forStatement();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				whileStatement();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 3);
				{
				setState(668);
				doWhileStatement();
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(PseudocodeParser.For, 0); }
		public IterationInitContext iterationInit() {
			return getRuleContext(IterationInitContext.class,0);
		}
		public TerminalNode To() { return getToken(PseudocodeParser.To, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Up() { return getToken(PseudocodeParser.Up, 0); }
		public TerminalNode Down() { return getToken(PseudocodeParser.Down, 0); }
		public BadIterationContext badIteration() {
			return getRuleContext(BadIterationContext.class,0);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_forStatement);
		int _la;
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(671);
				match(For);
				setState(672);
				iterationInit();
				setState(673);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(674);
				match(To);
				setState(675);
				expression();
				setState(676);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(678);
				match(For);
				setState(679);
				iterationInit();
				setState(680);
				badIteration();
				setState(681);
				expression();
				setState(682);
				compoundStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(PseudocodeParser.While, 0); }
		public IterationInitContext iterationInit() {
			return getRuleContext(IterationInitContext.class,0);
		}
		public TerminalNode To() { return getToken(PseudocodeParser.To, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Up() { return getToken(PseudocodeParser.Up, 0); }
		public TerminalNode Down() { return getToken(PseudocodeParser.Down, 0); }
		public BadIterationContext badIteration() {
			return getRuleContext(BadIterationContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whileStatement);
		int _la;
		try {
			setState(699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(686);
				match(While);
				setState(687);
				iterationInit();
				setState(688);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(689);
				match(To);
				setState(690);
				expression();
				setState(691);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(While);
				setState(694);
				iterationInit();
				setState(695);
				badIteration();
				setState(696);
				expression();
				setState(697);
				compoundStatement();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(PseudocodeParser.Do, 0); }
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode While() { return getToken(PseudocodeParser.While, 0); }
		public IterationInitContext iterationInit() {
			return getRuleContext(IterationInitContext.class,0);
		}
		public TerminalNode To() { return getToken(PseudocodeParser.To, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public TerminalNode Up() { return getToken(PseudocodeParser.Up, 0); }
		public TerminalNode Down() { return getToken(PseudocodeParser.Down, 0); }
		public BadIterationContext badIteration() {
			return getRuleContext(BadIterationContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_doWhileStatement);
		int _la;
		try {
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(701);
				match(Do);
				setState(702);
				compoundStatement();
				setState(703);
				match(While);
				setState(704);
				iterationInit();
				setState(705);
				_la = _input.LA(1);
				if ( !(_la==Up || _la==Down) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(706);
				match(To);
				setState(707);
				expression();
				setState(708);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				match(Do);
				setState(711);
				compoundStatement();
				setState(712);
				match(While);
				setState(713);
				iterationInit();
				setState(714);
				badIteration();
				setState(715);
				expression();
				setState(716);
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

	public static class IterationInitContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public VariableSpecifierContext variableSpecifier() {
			return getRuleContext(VariableSpecifierContext.class,0);
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
		enterRule(_localctx, 82, RULE_iterationInit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
				{
				setState(720);
				variableSpecifier();
				}
			}

			setState(723);
			initDeclarator();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 84, RULE_badIteration);
		int _la;
		try {
			setState(730);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Up:
			case Down:
				enterOuterAlt(_localctx, 1);
				{
				setState(725);
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
				setState(726);
				match(To);
				 notifyErrorListeners("expected up/down to"); 
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(728);
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
		enterRule(_localctx, 86, RULE_declaration);
		try {
			setState(734);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(732);
				simpleDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(733);
				functionDefinition();
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

	public static class SimpleDeclarationContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ArrayDeclarationContext arrayDeclaration() {
			return getRuleContext(ArrayDeclarationContext.class,0);
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
		enterRule(_localctx, 88, RULE_simpleDeclaration);
		try {
			setState(738);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(736);
				variableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(737);
				arrayDeclaration();
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableSpecifierContext variableSpecifier() {
			return getRuleContext(VariableSpecifierContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			variableSpecifier();
			setState(741);
			initDeclaratorList();
			setState(742);
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

	public static class ArrayDeclarationContext extends ParserRuleContext {
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(PseudocodeParser.Assign, 0); }
		public CreateExpressionContext createExpression() {
			return getRuleContext(CreateExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(PseudocodeParser.Semi, 0); }
		public ArrayDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterArrayDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitArrayDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitArrayDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDeclarationContext arrayDeclaration() throws RecognitionException {
		ArrayDeclarationContext _localctx = new ArrayDeclarationContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_arrayDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			arraySpecifier();
			setState(745);
			match(Identifier);
			setState(746);
			match(Assign);
			setState(747);
			createExpression();
			setState(748);
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
		public VariableSpecifierContext variableSpecifier() {
			return getRuleContext(VariableSpecifierContext.class,0);
		}
		public ArraySpecifierContext arraySpecifier() {
			return getRuleContext(ArraySpecifierContext.class,0);
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
		enterRule(_localctx, 94, RULE_declSpecifierSeq);
		try {
			setState(752);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(750);
				variableSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(751);
				arraySpecifier();
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

	public static class VariableSpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode Const() { return getToken(PseudocodeParser.Const, 0); }
		public VariableSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterVariableSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitVariableSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitVariableSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableSpecifierContext variableSpecifier() throws RecognitionException {
		VariableSpecifierContext _localctx = new VariableSpecifierContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_variableSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(754);
				match(Const);
				}
			}

			setState(757);
			typeSpecifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArraySpecifierContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(PseudocodeParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(PseudocodeParser.RightBracket, 0); }
		public TerminalNode Const() { return getToken(PseudocodeParser.Const, 0); }
		public ArraySpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arraySpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).enterArraySpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PseudocodeParserListener ) ((PseudocodeParserListener)listener).exitArraySpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PseudocodeParserVisitor ) return ((PseudocodeParserVisitor<? extends T>)visitor).visitArraySpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArraySpecifierContext arraySpecifier() throws RecognitionException {
		ArraySpecifierContext _localctx = new ArraySpecifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arraySpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Const) {
				{
				setState(759);
				match(Const);
				}
			}

			setState(762);
			typeSpecifier();
			setState(763);
			match(LeftBracket);
			setState(764);
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
		enterRule(_localctx, 100, RULE_badConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
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
		enterRule(_localctx, 102, RULE_typeSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
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

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclSpecifierSeqContext declSpecifierSeq() {
			return getRuleContext(DeclSpecifierSeqContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
		public ParametersAndQualifiersContext parametersAndQualifiers() {
			return getRuleContext(ParametersAndQualifiersContext.class,0);
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
		enterRule(_localctx, 104, RULE_functionDefinition);
		int _la;
		try {
			setState(779);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(771);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(770);
					match(Function);
					}
				}

				setState(773);
				declSpecifierSeq();
				setState(774);
				match(Identifier);
				setState(775);
				parametersAndQualifiers();
				setState(776);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(778);
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
		enterRule(_localctx, 106, RULE_mainFunction);
		int _la;
		try {
			setState(836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(781);
					match(Function);
					}
				}

				setState(785);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(784);
					declSpecifierSeq();
					}
				}

				setState(787);
				match(Main);
				setState(788);
				match(LeftParen);
				setState(789);
				match(RightParen);
				setState(790);
				compoundStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(792);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(791);
					match(Function);
					}
				}

				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(794);
					declSpecifierSeq();
					}
				}

				setState(797);
				match(Main);
				setState(798);
				match(LeftParen);
				setState(799);
				compoundStatement();
				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(803);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(802);
					match(Function);
					}
				}

				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(805);
					declSpecifierSeq();
					}
				}

				setState(808);
				match(Main);
				setState(809);
				match(LeftParen);
				setState(811); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(810);
					match(LeftParen);
					}
					}
					setState(813); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(815);
				match(RightParen);
				setState(816);
				compoundStatement();
				 notifyErrorListeners("too many opening parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Function) {
					{
					setState(819);
					match(Function);
					}
				}

				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(822);
					declSpecifierSeq();
					}
				}

				setState(825);
				match(Main);
				setState(826);
				match(LeftParen);
				setState(827);
				match(RightParen);
				setState(829); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(828);
					match(RightParen);
					}
					}
					setState(831); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				setState(833);
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
		enterRule(_localctx, 108, RULE_initDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			initDeclarator();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(839);
				match(Comma);
				setState(840);
				initDeclarator();
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

	public static class InitDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
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
		enterRule(_localctx, 110, RULE_initDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(846);
			match(Identifier);
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(847);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 112, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(850);
			match(Assign);
			setState(851);
			expression();
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 114, RULE_parametersAndQualifiers);
		int _la;
		try {
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(853);
				match(LeftParen);
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(854);
					parameterDeclarationClause();
					}
				}

				setState(857);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(859); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(858);
					match(LeftParen);
					}
					}
					setState(861); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(863);
					parameterDeclarationClause();
					}
				}

				 notifyErrorListeners("expected closing parenthesis"); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(867);
				match(LeftParen);
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(868);
					parameterDeclarationClause();
					}
				}

				setState(871);
				match(RightParen);
				setState(873); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(872);
					match(RightParen);
					}
					}
					setState(875); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==RightParen );
				 notifyErrorListeners("too many closing parenthesis"); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(878);
				match(LeftParen);
				setState(880); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(879);
					match(LeftParen);
					}
					}
					setState(882); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==LeftParen );
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Bool) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << String) | (1L << Void))) != 0)) {
					{
					setState(884);
					parameterDeclarationClause();
					}
				}

				setState(887);
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
		enterRule(_localctx, 116, RULE_parameterDeclarationClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(891);
			parameterDeclaration();
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(892);
				match(Comma);
				setState(893);
				parameterDeclaration();
				}
				}
				setState(898);
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
		public TerminalNode Identifier() { return getToken(PseudocodeParser.Identifier, 0); }
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
		enterRule(_localctx, 118, RULE_parameterDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(899);
			declSpecifierSeq();
			setState(900);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3b\u0389\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\7\2}\n\2\f\2\16\2\u0080\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u0096\n\3\3\3\3\3"+
		"\6\3\u009a\n\3\r\3\16\3\u009b\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00a5\n"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\7\6\u00ae\n\6\f\6\16\6\u00b1\13\6\3\7\3"+
		"\7\3\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\3\b\3\b\3\b\7\b\u00be\n\b\f\b"+
		"\16\b\u00c1\13\b\3\t\3\t\3\t\7\t\u00c6\n\t\f\t\16\t\u00c9\13\t\3\n\3\n"+
		"\3\n\7\n\u00ce\n\n\f\n\16\n\u00d1\13\n\3\n\3\n\3\n\7\n\u00d6\n\n\f\n\16"+
		"\n\u00d9\13\n\3\n\3\n\5\n\u00dd\n\n\3\13\3\13\3\13\7\13\u00e2\n\13\f\13"+
		"\16\13\u00e5\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00ef\n\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00f5\n\f\f\f\16\f\u00f8\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0107\n\16\3\16\3\16\5\16\u010b"+
		"\n\16\3\16\6\16\u010e\n\16\r\16\16\16\u010f\3\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0117\n\16\3\16\3\16\3\16\3\16\3\16\5\16\u011e\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u0126\n\16\3\16\5\16\u0129\n\16\3\17\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\5\20\u0133\n\20\3\20\3\20\3\21\3\21\3\21\7\21"+
		"\u013a\n\21\f\21\16\21\u013d\13\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u0151\n\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u015c\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u016a\n\25\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\5\31\u0177\n\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0180\n\31\3\32\3\32\5\32\u0184\n"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\6"+
		"\33\u0193\n\33\r\33\16\33\u0194\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\6\33\u01a1\n\33\r\33\16\33\u01a2\3\33\3\33\3\33\3\33\3\33\6"+
		"\33\u01aa\n\33\r\33\16\33\u01ab\3\33\3\33\3\33\3\33\5\33\u01b2\n\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\6\34\u01be\n\34\r\34"+
		"\16\34\u01bf\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\6\34\u01cf\n\34\r\34\16\34\u01d0\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01dc\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\5\37\u01e6\n\37\3\37\3\37\3\37\3\37\3\37\5\37\u01ed\n\37\3 \3 \3 \3!"+
		"\3!\5!\u01f4\n!\3!\3!\6!\u01f8\n!\r!\16!\u01f9\3!\5!\u01fd\n!\3!\3!\3"+
		"!\5!\u0202\n!\3!\3!\6!\u0206\n!\r!\16!\u0207\3!\3!\3!\6!\u020d\n!\r!\16"+
		"!\u020e\3!\5!\u0212\n!\3!\3!\5!\u0216\n!\3\"\6\"\u0219\n\"\r\"\16\"\u021a"+
		"\3#\3#\7#\u021f\n#\f#\16#\u0222\13#\3#\5#\u0225\n#\3$\3$\3$\3$\3$\5$\u022c"+
		"\n$\3$\3$\3$\3$\6$\u0232\n$\r$\16$\u0233\3$\3$\5$\u0238\n$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\6$\u0242\n$\r$\16$\u0243\3$\5$\u0247\n$\3$\3$\3$\3$\3$\3"+
		"$\6$\u024f\n$\r$\16$\u0250\3$\3$\3$\5$\u0256\n$\3$\3$\3$\5$\u025b\n$\3"+
		"%\3%\3%\3%\3%\3%\5%\u0263\n%\3%\3%\3%\3%\3%\6%\u026a\n%\r%\16%\u026b\3"+
		"%\3%\5%\u0270\n%\3%\3%\3%\3%\3%\3%\3%\3%\3%\6%\u027b\n%\r%\16%\u027c\3"+
		"%\5%\u0280\n%\3%\3%\3%\3%\3%\3%\3%\6%\u0289\n%\r%\16%\u028a\3%\3%\3%\5"+
		"%\u0290\n%\3%\3%\3%\5%\u0295\n%\3&\3&\5&\u0299\n&\3&\3&\3\'\3\'\3\'\5"+
		"\'\u02a0\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u02af\n(\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u02be\n)\3*\3*\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u02d1\n*\3+\5+\u02d4\n+\3+\3+\3,\3,\3,"+
		"\3,\3,\5,\u02dd\n,\3-\3-\5-\u02e1\n-\3.\3.\5.\u02e5\n.\3/\3/\3/\3/\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\5\61\u02f3\n\61\3\62\5\62\u02f6\n"+
		"\62\3\62\3\62\3\63\5\63\u02fb\n\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65"+
		"\3\65\3\66\5\66\u0306\n\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u030e\n"+
		"\66\3\67\5\67\u0311\n\67\3\67\5\67\u0314\n\67\3\67\3\67\3\67\3\67\3\67"+
		"\5\67\u031b\n\67\3\67\5\67\u031e\n\67\3\67\3\67\3\67\3\67\3\67\3\67\5"+
		"\67\u0326\n\67\3\67\5\67\u0329\n\67\3\67\3\67\3\67\6\67\u032e\n\67\r\67"+
		"\16\67\u032f\3\67\3\67\3\67\3\67\3\67\5\67\u0337\n\67\3\67\5\67\u033a"+
		"\n\67\3\67\3\67\3\67\3\67\6\67\u0340\n\67\r\67\16\67\u0341\3\67\3\67\3"+
		"\67\5\67\u0347\n\67\38\38\38\78\u034c\n8\f8\168\u034f\138\39\39\59\u0353"+
		"\n9\3:\3:\3:\3;\3;\5;\u035a\n;\3;\3;\6;\u035e\n;\r;\16;\u035f\3;\5;\u0363"+
		"\n;\3;\3;\3;\5;\u0368\n;\3;\3;\6;\u036c\n;\r;\16;\u036d\3;\3;\3;\6;\u0373"+
		"\n;\r;\16;\u0374\3;\5;\u0378\n;\3;\3;\5;\u037c\n;\3<\3<\3<\7<\u0381\n"+
		"<\f<\16<\u0384\13<\3=\3=\3=\3=\2\3\26>\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\f\3\2"+
		"AB\4\2\678CD\3\2-.\4\2-.GH\3\2/\61\4\2\22\22\35\35\3\2GH\4\2\66\669=\3"+
		"\2QR\n\2\n\n\f\f\24\24\30\30\33\34\37\37!!%%\2\u03ec\2~\3\2\2\2\4\u00a4"+
		"\3\2\2\2\6\u00a6\3\2\2\2\b\u00a8\3\2\2\2\n\u00aa\3\2\2\2\f\u00b2\3\2\2"+
		"\2\16\u00ba\3\2\2\2\20\u00c2\3\2\2\2\22\u00dc\3\2\2\2\24\u00de\3\2\2\2"+
		"\26\u00ee\3\2\2\2\30\u00f9\3\2\2\2\32\u0128\3\2\2\2\34\u012a\3\2\2\2\36"+
		"\u012f\3\2\2\2 \u0136\3\2\2\2\"\u013e\3\2\2\2$\u0150\3\2\2\2&\u015b\3"+
		"\2\2\2(\u0169\3\2\2\2*\u016b\3\2\2\2,\u016e\3\2\2\2.\u0171\3\2\2\2\60"+
		"\u017f\3\2\2\2\62\u0183\3\2\2\2\64\u01b1\3\2\2\2\66\u01db\3\2\2\28\u01dd"+
		"\3\2\2\2:\u01e0\3\2\2\2<\u01ec\3\2\2\2>\u01ee\3\2\2\2@\u0215\3\2\2\2B"+
		"\u0218\3\2\2\2D\u021c\3\2\2\2F\u025a\3\2\2\2H\u0294\3\2\2\2J\u0296\3\2"+
		"\2\2L\u029f\3\2\2\2N\u02ae\3\2\2\2P\u02bd\3\2\2\2R\u02d0\3\2\2\2T\u02d3"+
		"\3\2\2\2V\u02dc\3\2\2\2X\u02e0\3\2\2\2Z\u02e4\3\2\2\2\\\u02e6\3\2\2\2"+
		"^\u02ea\3\2\2\2`\u02f2\3\2\2\2b\u02f5\3\2\2\2d\u02fa\3\2\2\2f\u0300\3"+
		"\2\2\2h\u0302\3\2\2\2j\u030d\3\2\2\2l\u0346\3\2\2\2n\u0348\3\2\2\2p\u0350"+
		"\3\2\2\2r\u0354\3\2\2\2t\u037b\3\2\2\2v\u037d\3\2\2\2x\u0385\3\2\2\2z"+
		"}\5X-\2{}\5(\25\2|z\3\2\2\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3"+
		"\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\2\2\3\u0082\3\3"+
		"\2\2\2\u0083\u00a5\5&\24\2\u0084\u00a5\5\6\4\2\u0085\u0086\7\'\2\2\u0086"+
		"\u0087\5\b\5\2\u0087\u0088\7(\2\2\u0088\u00a5\3\2\2\2\u0089\u008a\7\'"+
		"\2\2\u008a\u008b\5\b\5\2\u008b\u008c\b\3\1\2\u008c\u00a5\3\2\2\2\u008d"+
		"\u008e\7\'\2\2\u008e\u008f\5\b\5\2\u008f\u0090\7(\2\2\u0090\u0091\7(\2"+
		"\2\u0091\u0092\b\3\1\2\u0092\u00a5\3\2\2\2\u0093\u0096\7Y\2\2\u0094\u0096"+
		"\5&\24\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u009a\7Y\2\2\u0098\u009a\5&\24\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\u00a5\b\3\1\2\u009e\u009f\7Y\2\2\u009f\u00a0\7Y\2"+
		"\2\u00a0\u00a1\7L\2\2\u00a1\u00a2\7\3\2\2\u00a2\u00a3\7\65\2\2\u00a3\u00a5"+
		"\b\3\1\2\u00a4\u0083\3\2\2\2\u00a4\u0084\3\2\2\2\u00a4\u0085\3\2\2\2\u00a4"+
		"\u0089\3\2\2\2\u00a4\u008d\3\2\2\2\u00a4\u0095\3\2\2\2\u00a4\u009e\3\2"+
		"\2\2\u00a5\5\3\2\2\2\u00a6\u00a7\7Y\2\2\u00a7\7\3\2\2\2\u00a8\u00a9\5"+
		"\n\6\2\u00a9\t\3\2\2\2\u00aa\u00af\5\f\7\2\u00ab\u00ac\7F\2\2\u00ac\u00ae"+
		"\5\f\7\2\u00ad\u00ab\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af"+
		"\u00b0\3\2\2\2\u00b0\13\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b7\5\16\b"+
		"\2\u00b3\u00b4\7E\2\2\u00b4\u00b6\5\16\b\2\u00b5\u00b3\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\r\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bf\5\20\t\2\u00bb\u00bc\t\2\2\2\u00bc\u00be\5"+
		"\20\t\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\17\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c7\5\22\n"+
		"\2\u00c3\u00c4\t\3\2\2\u00c4\u00c6\5\22\n\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\21\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00ca\u00cf\5\24\13\2\u00cb\u00cc\t\4\2\2\u00cc"+
		"\u00ce\5\24\13\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3"+
		"\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00dd\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2"+
		"\u00d7\5\24\13\2\u00d3\u00d4\t\5\2\2\u00d4\u00d6\5\24\13\2\u00d5\u00d3"+
		"\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db\b\n\1\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00ca\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dd\23\3\2\2\2\u00de\u00e3"+
		"\5\26\f\2\u00df\u00e0\t\6\2\2\u00e0\u00e2\5\26\f\2\u00e1\u00df\3\2\2\2"+
		"\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\25"+
		"\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\b\f\1\2\u00e7\u00ef\5\32\16\2"+
		"\u00e8\u00e9\7\65\2\2\u00e9\u00ef\5\26\f\5\u00ea\u00eb\5$\23\2\u00eb\u00ec"+
		"\5\26\f\4\u00ec\u00ed\b\f\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00e6\3\2\2\2"+
		"\u00ee\u00e8\3\2\2\2\u00ee\u00ea\3\2\2\2\u00ef\u00f6\3\2\2\2\u00f0\u00f1"+
		"\f\3\2\2\u00f1\u00f2\5$\23\2\u00f2\u00f3\b\f\1\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00f0\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\27\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\t\7\2\2\u00fa\u00fb"+
		"\5h\65\2\u00fb\u00fc\7)\2\2\u00fc\u00fd\5\b\5\2\u00fd\u00fe\7*\2\2\u00fe"+
		"\31\3\2\2\2\u00ff\u0129\5\4\3\2\u0100\u0129\5\34\17\2\u0101\u0129\5\36"+
		"\20\2\u0102\u0103\7Y\2\2\u0103\u0129\t\b\2\2\u0104\u0107\7Y\2\2\u0105"+
		"\u0107\5&\24\2\u0106\u0104\3\2\2\2\u0106\u0105\3\2\2\2\u0107\u010d\3\2"+
		"\2\2\u0108\u010a\7\'\2\2\u0109\u010b\5 \21\2\u010a\u0109\3\2\2\2\u010a"+
		"\u010b\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u010e\7(\2\2\u010d\u0108\3\2"+
		"\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0129\b\16\1\2\u0112\u0113\7Y\2\2\u0113\u0114\7\'"+
		"\2\2\u0114\u0116\7\'\2\2\u0115\u0117\5 \21\2\u0116\u0115\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\7(\2\2\u0119\u0129\b\16"+
		"\1\2\u011a\u011b\7Y\2\2\u011b\u011d\7\'\2\2\u011c\u011e\5 \21\2\u011d"+
		"\u011c\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\7("+
		"\2\2\u0120\u0121\7(\2\2\u0121\u0129\b\16\1\2\u0122\u0123\7Y\2\2\u0123"+
		"\u0125\7\'\2\2\u0124\u0126\5 \21\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0129\b\16\1\2\u0128\u00ff\3\2\2\2\u0128"+
		"\u0100\3\2\2\2\u0128\u0101\3\2\2\2\u0128\u0102\3\2\2\2\u0128\u0106\3\2"+
		"\2\2\u0128\u0112\3\2\2\2\u0128\u011a\3\2\2\2\u0128\u0122\3\2\2\2\u0129"+
		"\33\3\2\2\2\u012a\u012b\7Y\2\2\u012b\u012c\7)\2\2\u012c\u012d\5\b\5\2"+
		"\u012d\u012e\7*\2\2\u012e\35\3\2\2\2\u012f\u0130\7Y\2\2\u0130\u0132\7"+
		"\'\2\2\u0131\u0133\5 \21\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\7(\2\2\u0135\37\3\2\2\2\u0136\u013b\5\b\5\2"+
		"\u0137\u0138\7I\2\2\u0138\u013a\5\b\5\2\u0139\u0137\3\2\2\2\u013a\u013d"+
		"\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c!\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013e\u013f\t\t\2\2\u013f#\3\2\2\2\u0140\u0151\5\"\22\2"+
		"\u0141\u0151\7-\2\2\u0142\u0151\7.\2\2\u0143\u0151\7/\2\2\u0144\u0151"+
		"\7\60\2\2\u0145\u0151\7\61\2\2\u0146\u0151\78\2\2\u0147\u0151\7\67\2\2"+
		"\u0148\u0151\7D\2\2\u0149\u0151\7A\2\2\u014a\u0151\7B\2\2\u014b\u0151"+
		"\7C\2\2\u014c\u0151\7D\2\2\u014d\u0151\7E\2\2\u014e\u0151\7F\2\2\u014f"+
		"\u0151\7I\2\2\u0150\u0140\3\2\2\2\u0150\u0141\3\2\2\2\u0150\u0142\3\2"+
		"\2\2\u0150\u0143\3\2\2\2\u0150\u0144\3\2\2\2\u0150\u0145\3\2\2\2\u0150"+
		"\u0146\3\2\2\2\u0150\u0147\3\2\2\2\u0150\u0148\3\2\2\2\u0150\u0149\3\2"+
		"\2\2\u0150\u014a\3\2\2\2\u0150\u014b\3\2\2\2\u0150\u014c\3\2\2\2\u0150"+
		"\u014d\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u014f\3\2\2\2\u0151%\3\2\2\2"+
		"\u0152\u015c\7\3\2\2\u0153\u015c\7\4\2\2\u0154\u015c\7\5\2\2\u0155\u015c"+
		"\7\7\2\2\u0156\u015c\7\t\2\2\u0157\u0158\7\b\2\2\u0158\u015c\b\24\1\2"+
		"\u0159\u015a\7\6\2\2\u015a\u015c\b\24\1\2\u015b\u0152\3\2\2\2\u015b\u0153"+
		"\3\2\2\2\u015b\u0154\3\2\2\2\u015b\u0155\3\2\2\2\u015b\u0156\3\2\2\2\u015b"+
		"\u0157\3\2\2\2\u015b\u0159\3\2\2\2\u015c\'\3\2\2\2\u015d\u016a\5\60\31"+
		"\2\u015e\u016a\5@!\2\u015f\u016a\5D#\2\u0160\u016a\5L\'\2\u0161\u016a"+
		"\58\35\2\u0162\u016a\5:\36\2\u0163\u016a\5<\37\2\u0164\u016a\5\64\33\2"+
		"\u0165\u016a\5\66\34\2\u0166\u016a\5Z.\2\u0167\u016a\5.\30\2\u0168\u016a"+
		"\5*\26\2\u0169\u015d\3\2\2\2\u0169\u015e\3\2\2\2\u0169\u015f\3\2\2\2\u0169"+
		"\u0160\3\2\2\2\u0169\u0161\3\2\2\2\u0169\u0162\3\2\2\2\u0169\u0163\3\2"+
		"\2\2\u0169\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u0169"+
		"\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a)\3\2\2\2\u016b\u016c\5,\27\2"+
		"\u016c\u016d\7M\2\2\u016d+\3\2\2\2\u016e\u016f\5\b\5\2\u016f\u0170\b\27"+
		"\1\2\u0170-\3\2\2\2\u0171\u0172\5\36\20\2\u0172\u0173\7M\2\2\u0173/\3"+
		"\2\2\2\u0174\u0177\5\6\4\2\u0175\u0177\5\34\17\2\u0176\u0174\3\2\2\2\u0176"+
		"\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u0179\5\"\22\2\u0179\u017a\5"+
		"\b\5\2\u017a\u017b\7M\2\2\u017b\u0180\3\2\2\2\u017c\u017d\5\62\32\2\u017d"+
		"\u017e\7M\2\2\u017e\u0180\3\2\2\2\u017f\u0176\3\2\2\2\u017f\u017c\3\2"+
		"\2\2\u0180\61\3\2\2\2\u0181\u0184\5\6\4\2\u0182\u0184\5\34\17\2\u0183"+
		"\u0181\3\2\2\2\u0183\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7G"+
		"\2\2\u0186\u0187\7-\2\2\u0187\u0188\b\32\1\2\u0188\63\3\2\2\2\u0189\u018a"+
		"\7U\2\2\u018a\u018b\7\'\2\2\u018b\u018c\5\b\5\2\u018c\u018d\7(\2\2\u018d"+
		"\u018e\7M\2\2\u018e\u01b2\3\2\2\2\u018f\u0190\7U\2\2\u0190\u0192\7\'\2"+
		"\2\u0191\u0193\7\'\2\2\u0192\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0197\5\b\5\2\u0197"+
		"\u0198\7(\2\2\u0198\u0199\7M\2\2\u0199\u019a\b\33\1\2\u019a\u01b2\3\2"+
		"\2\2\u019b\u019c\7U\2\2\u019c\u019d\7\'\2\2\u019d\u019e\5\b\5\2\u019e"+
		"\u01a0\7(\2\2\u019f\u01a1\7(\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2"+
		"\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5"+
		"\7M\2\2\u01a5\u01a6\b\33\1\2\u01a6\u01b2\3\2\2\2\u01a7\u01a9\7U\2\2\u01a8"+
		"\u01aa\7\'\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\5\b\5\2\u01ae"+
		"\u01af\7M\2\2\u01af\u01b0\b\33\1\2\u01b0\u01b2\3\2\2\2\u01b1\u0189\3\2"+
		"\2\2\u01b1\u018f\3\2\2\2\u01b1\u019b\3\2\2\2\u01b1\u01a7\3\2\2\2\u01b2"+
		"\65\3\2\2\2\u01b3\u01b4\7T\2\2\u01b4\u01b5\7\'\2\2\u01b5\u01b6\7\7\2\2"+
		"\u01b6\u01b7\7I\2\2\u01b7\u01b8\7Y\2\2\u01b8\u01b9\7(\2\2\u01b9\u01dc"+
		"\7M\2\2\u01ba\u01bb\7T\2\2\u01bb\u01bd\7\'\2\2\u01bc\u01be\7\'\2\2\u01bd"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\7\7\2\2\u01c2\u01c3\7I\2\2\u01c3"+
		"\u01c4\7Y\2\2\u01c4\u01c5\7(\2\2\u01c5\u01c6\7M\2\2\u01c6\u01dc\b\34\1"+
		"\2\u01c7\u01c8\7T\2\2\u01c8\u01c9\7\'\2\2\u01c9\u01ca\7\7\2\2\u01ca\u01cb"+
		"\7I\2\2\u01cb\u01cc\7Y\2\2\u01cc\u01ce\7(\2\2\u01cd\u01cf\7(\2\2\u01ce"+
		"\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\7M\2\2\u01d3\u01dc\b\34\1\2\u01d4"+
		"\u01d5\7T\2\2\u01d5\u01d6\7\'\2\2\u01d6\u01d7\7\7\2\2\u01d7\u01d8\7I\2"+
		"\2\u01d8\u01d9\7Y\2\2\u01d9\u01da\7M\2\2\u01da\u01dc\b\34\1\2\u01db\u01b3"+
		"\3\2\2\2\u01db\u01ba\3\2\2\2\u01db\u01c7\3\2\2\2\u01db\u01d4\3\2\2\2\u01dc"+
		"\67\3\2\2\2\u01dd\u01de\7\13\2\2\u01de\u01df\7M\2\2\u01df9\3\2\2\2\u01e0"+
		"\u01e1\7\21\2\2\u01e1\u01e2\7M\2\2\u01e2;\3\2\2\2\u01e3\u01e5\7\36\2\2"+
		"\u01e4\u01e6\5\b\5\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e7"+
		"\3\2\2\2\u01e7\u01ed\7M\2\2\u01e8\u01e9\7\36\2\2\u01e9\u01ea\5> \2\u01ea"+
		"\u01eb\7M\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01e3\3\2\2\2\u01ec\u01e8\3\2"+
		"\2\2\u01ed=\3\2\2\2\u01ee\u01ef\5h\65\2\u01ef\u01f0\b \1\2\u01f0?\3\2"+
		"\2\2\u01f1\u01f3\7+\2\2\u01f2\u01f4\5B\"\2\u01f3\u01f2\3\2\2\2\u01f3\u01f4"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u0216\7,\2\2\u01f6\u01f8\7+\2\2\u01f7"+
		"\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2"+
		"\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01fd\5B\"\2\u01fc\u01fb\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe\u0216\b!\1\2\u01ff\u0201\7+\2"+
		"\2\u0200\u0202\5B\"\2\u0201\u0200\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0203"+
		"\3\2\2\2\u0203\u0205\7,\2\2\u0204\u0206\7,\2\2\u0205\u0204\3\2\2\2\u0206"+
		"\u0207\3\2\2\2\u0207\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2"+
		"\2\2\u0209\u0216\b!\1\2\u020a\u020c\7+\2\2\u020b\u020d\7+\2\2\u020c\u020b"+
		"\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f"+
		"\u0211\3\2\2\2\u0210\u0212\5B\"\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0213\3\2\2\2\u0213\u0214\7,\2\2\u0214\u0216\b!\1\2\u0215\u01f1"+
		"\3\2\2\2\u0215\u01f7\3\2\2\2\u0215\u01ff\3\2\2\2\u0215\u020a\3\2\2\2\u0216"+
		"A\3\2\2\2\u0217\u0219\5(\25\2\u0218\u0217\3\2\2\2\u0219\u021a\3\2\2\2"+
		"\u021a\u0218\3\2\2\2\u021a\u021b\3\2\2\2\u021bC\3\2\2\2\u021c\u0220\5"+
		"F$\2\u021d\u021f\5H%\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e"+
		"\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0225\5J&\2\u0224\u0223\3\2\2\2\u0224\u0225\3\2\2\2\u0225E\3\2\2\2\u0226"+
		"\u0227\7\32\2\2\u0227\u0228\7\'\2\2\u0228\u0229\5\b\5\2\u0229\u022b\7"+
		"(\2\2\u022a\u022c\7V\2\2\u022b\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c"+
		"\u022d\3\2\2\2\u022d\u022e\5@!\2\u022e\u025b\3\2\2\2\u022f\u0231\7\32"+
		"\2\2\u0230\u0232\7\'\2\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0231\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\5\b"+
		"\5\2\u0236\u0238\7V\2\2\u0237\u0236\3\2\2\2\u0237\u0238\3\2\2\2\u0238"+
		"\u0239\3\2\2\2\u0239\u023a\5@!\2\u023a\u023b\b$\1\2\u023b\u025b\3\2\2"+
		"\2\u023c\u023d\7\32\2\2\u023d\u023e\7\'\2\2\u023e\u023f\5\b\5\2\u023f"+
		"\u0241\7(\2\2\u0240\u0242\7(\2\2\u0241\u0240\3\2\2\2\u0242\u0243\3\2\2"+
		"\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\u0246\3\2\2\2\u0245\u0247"+
		"\7V\2\2\u0246\u0245\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"\u0249\5@!\2\u0249\u024a\b$\1\2\u024a\u025b\3\2\2\2\u024b\u024c\7\32\2"+
		"\2\u024c\u024e\7\'\2\2\u024d\u024f\7\'\2\2\u024e\u024d\3\2\2\2\u024f\u0250"+
		"\3\2\2\2\u0250\u024e\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252"+
		"\u0253\5\b\5\2\u0253\u0255\7(\2\2\u0254\u0256\7V\2\2\u0255\u0254\3\2\2"+
		"\2\u0255\u0256\3\2\2\2\u0256\u0257\3\2\2\2\u0257\u0258\5@!\2\u0258\u0259"+
		"\b$\1\2\u0259\u025b\3\2\2\2\u025a\u0226\3\2\2\2\u025a\u022f\3\2\2\2\u025a"+
		"\u023c\3\2\2\2\u025a\u024b\3\2\2\2\u025bG\3\2\2\2\u025c\u025d\7\25\2\2"+
		"\u025d\u025e\7\32\2\2\u025e\u025f\7\'\2\2\u025f\u0260\5\b\5\2\u0260\u0262"+
		"\7(\2\2\u0261\u0263\7V\2\2\u0262\u0261\3\2\2\2\u0262\u0263\3\2\2\2\u0263"+
		"\u0264\3\2\2\2\u0264\u0265\5@!\2\u0265\u0295\3\2\2\2\u0266\u0267\7\25"+
		"\2\2\u0267\u0269\7\32\2\2\u0268\u026a\7\'\2\2\u0269\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\3\2"+
		"\2\2\u026d\u026f\5\b\5\2\u026e\u0270\7V\2\2\u026f\u026e\3\2\2\2\u026f"+
		"\u0270\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\5@!\2\u0272\u0273\b%\1"+
		"\2\u0273\u0295\3\2\2\2\u0274\u0275\7\25\2\2\u0275\u0276\7\32\2\2\u0276"+
		"\u0277\7\'\2\2\u0277\u0278\5\b\5\2\u0278\u027a\7(\2\2\u0279\u027b\7(\2"+
		"\2\u027a\u0279\3\2\2\2\u027b\u027c\3\2\2\2\u027c\u027a\3\2\2\2\u027c\u027d"+
		"\3\2\2\2\u027d\u027f\3\2\2\2\u027e\u0280\7V\2\2\u027f\u027e\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\5@!\2\u0282\u0283\b%\1"+
		"\2\u0283\u0295\3\2\2\2\u0284\u0285\7\25\2\2\u0285\u0286\7\32\2\2\u0286"+
		"\u0288\7\'\2\2\u0287\u0289\7\'\2\2\u0288\u0287\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u0288\3\2\2\2\u028a\u028b\3\2\2\2\u028b\u028c\3\2\2\2\u028c"+
		"\u028d\5\b\5\2\u028d\u028f\7(\2\2\u028e\u0290\7V\2\2\u028f\u028e\3\2\2"+
		"\2\u028f\u0290\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\5@!\2\u0292\u0293"+
		"\b%\1\2\u0293\u0295\3\2\2\2\u0294\u025c\3\2\2\2\u0294\u0266\3\2\2\2\u0294"+
		"\u0274\3\2\2\2\u0294\u0284\3\2\2\2\u0295I\3\2\2\2\u0296\u0298\7\25\2\2"+
		"\u0297\u0299\7V\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a"+
		"\3\2\2\2\u029a\u029b\5@!\2\u029bK\3\2\2\2\u029c\u02a0\5N(\2\u029d\u02a0"+
		"\5P)\2\u029e\u02a0\5R*\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f"+
		"\u029e\3\2\2\2\u02a0M\3\2\2\2\u02a1\u02a2\7\31\2\2\u02a2\u02a3\5T+\2\u02a3"+
		"\u02a4\t\n\2\2\u02a4\u02a5\7S\2\2\u02a5\u02a6\5\b\5\2\u02a6\u02a7\5@!"+
		"\2\u02a7\u02af\3\2\2\2\u02a8\u02a9\7\31\2\2\u02a9\u02aa\5T+\2\u02aa\u02ab"+
		"\5V,\2\u02ab\u02ac\5\b\5\2\u02ac\u02ad\5@!\2\u02ad\u02af\3\2\2\2\u02ae"+
		"\u02a1\3\2\2\2\u02ae\u02a8\3\2\2\2\u02afO\3\2\2\2\u02b0\u02b1\7&\2\2\u02b1"+
		"\u02b2\5T+\2\u02b2\u02b3\t\n\2\2\u02b3\u02b4\7S\2\2\u02b4\u02b5\5\b\5"+
		"\2\u02b5\u02b6\5@!\2\u02b6\u02be\3\2\2\2\u02b7\u02b8\7&\2\2\u02b8\u02b9"+
		"\5T+\2\u02b9\u02ba\5V,\2\u02ba\u02bb\5\b\5\2\u02bb\u02bc\5@!\2\u02bc\u02be"+
		"\3\2\2\2\u02bd\u02b0\3\2\2\2\u02bd\u02b7\3\2\2\2\u02beQ\3\2\2\2\u02bf"+
		"\u02c0\7\23\2\2\u02c0\u02c1\5@!\2\u02c1\u02c2\7&\2\2\u02c2\u02c3\5T+\2"+
		"\u02c3\u02c4\t\n\2\2\u02c4\u02c5\7S\2\2\u02c5\u02c6\5\b\5\2\u02c6\u02c7"+
		"\7M\2\2\u02c7\u02d1\3\2\2\2\u02c8\u02c9\7\23\2\2\u02c9\u02ca\5@!\2\u02ca"+
		"\u02cb\7&\2\2\u02cb\u02cc\5T+\2\u02cc\u02cd\5V,\2\u02cd\u02ce\5\b\5\2"+
		"\u02ce\u02cf\7M\2\2\u02cf\u02d1\3\2\2\2\u02d0\u02bf\3\2\2\2\u02d0\u02c8"+
		"\3\2\2\2\u02d1S\3\2\2\2\u02d2\u02d4\5b\62\2\u02d3\u02d2\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d6\5p9\2\u02d6U\3\2\2\2\u02d7"+
		"\u02dd\t\n\2\2\u02d8\u02d9\7S\2\2\u02d9\u02dd\b,\1\2\u02da\u02db\7\7\2"+
		"\2\u02db\u02dd\b,\1\2\u02dc\u02d7\3\2\2\2\u02dc\u02d8\3\2\2\2\u02dc\u02da"+
		"\3\2\2\2\u02ddW\3\2\2\2\u02de\u02e1\5Z.\2\u02df\u02e1\5j\66\2\u02e0\u02de"+
		"\3\2\2\2\u02e0\u02df\3\2\2\2\u02e1Y\3\2\2\2\u02e2\u02e5\5\\/\2\u02e3\u02e5"+
		"\5^\60\2\u02e4\u02e2\3\2\2\2\u02e4\u02e3\3\2\2\2\u02e5[\3\2\2\2\u02e6"+
		"\u02e7\5b\62\2\u02e7\u02e8\5n8\2\u02e8\u02e9\7M\2\2\u02e9]\3\2\2\2\u02ea"+
		"\u02eb\5d\63\2\u02eb\u02ec\7Y\2\2\u02ec\u02ed\7\66\2\2\u02ed\u02ee\5\30"+
		"\r\2\u02ee\u02ef\7M\2\2\u02ef_\3\2\2\2\u02f0\u02f3\5b\62\2\u02f1\u02f3"+
		"\5d\63\2\u02f2\u02f0\3\2\2\2\u02f2\u02f1\3\2\2\2\u02f3a\3\2\2\2\u02f4"+
		"\u02f6\7\17\2\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\3"+
		"\2\2\2\u02f7\u02f8\5h\65\2\u02f8c\3\2\2\2\u02f9\u02fb\7\17\2\2\u02fa\u02f9"+
		"\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\5h\65\2\u02fd"+
		"\u02fe\7)\2\2\u02fe\u02ff\7*\2\2\u02ffe\3\2\2\2\u0300\u0301\7\20\2\2\u0301"+
		"g\3\2\2\2\u0302\u0303\t\13\2\2\u0303i\3\2\2\2\u0304\u0306\7W\2\2\u0305"+
		"\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0307\3\2\2\2\u0307\u0308\5`"+
		"\61\2\u0308\u0309\7Y\2\2\u0309\u030a\5t;\2\u030a\u030b\5@!\2\u030b\u030e"+
		"\3\2\2\2\u030c\u030e\5l\67\2\u030d\u0305\3\2\2\2\u030d\u030c\3\2\2\2\u030e"+
		"k\3\2\2\2\u030f\u0311\7W\2\2\u0310\u030f\3\2\2\2\u0310\u0311\3\2\2\2\u0311"+
		"\u0313\3\2\2\2\u0312\u0314\5`\61\2\u0313\u0312\3\2\2\2\u0313\u0314\3\2"+
		"\2\2\u0314\u0315\3\2\2\2\u0315\u0316\7X\2\2\u0316\u0317\7\'\2\2\u0317"+
		"\u0318\7(\2\2\u0318\u0347\5@!\2\u0319\u031b\7W\2\2\u031a\u0319\3\2\2\2"+
		"\u031a\u031b\3\2\2\2\u031b\u031d\3\2\2\2\u031c\u031e\5`\61\2\u031d\u031c"+
		"\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f\u0320\7X\2\2\u0320"+
		"\u0321\7\'\2\2\u0321\u0322\5@!\2\u0322\u0323\b\67\1\2\u0323\u0347\3\2"+
		"\2\2\u0324\u0326\7W\2\2\u0325\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326"+
		"\u0328\3\2\2\2\u0327\u0329\5`\61\2\u0328\u0327\3\2\2\2\u0328\u0329\3\2"+
		"\2\2\u0329\u032a\3\2\2\2\u032a\u032b\7X\2\2\u032b\u032d\7\'\2\2\u032c"+
		"\u032e\7\'\2\2\u032d\u032c\3\2\2\2\u032e\u032f\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u032f\u0330\3\2\2\2\u0330\u0331\3\2\2\2\u0331\u0332\7(\2\2\u0332"+
		"\u0333\5@!\2\u0333\u0334\b\67\1\2\u0334\u0347\3\2\2\2\u0335\u0337\7W\2"+
		"\2\u0336\u0335\3\2\2\2\u0336\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u033a"+
		"\5`\61\2\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b"+
		"\u033c\7X\2\2\u033c\u033d\7\'\2\2\u033d\u033f\7(\2\2\u033e\u0340\7(\2"+
		"\2\u033f\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341\u033f\3\2\2\2\u0341\u0342"+
		"\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0344\5@!\2\u0344\u0345\b\67\1\2\u0345"+
		"\u0347\3\2\2\2\u0346\u0310\3\2\2\2\u0346\u031a\3\2\2\2\u0346\u0325\3\2"+
		"\2\2\u0346\u0336\3\2\2\2\u0347m\3\2\2\2\u0348\u034d\5p9\2\u0349\u034a"+
		"\7I\2\2\u034a\u034c\5p9\2\u034b\u0349\3\2\2\2\u034c\u034f\3\2\2\2\u034d"+
		"\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034eo\3\2\2\2\u034f\u034d\3\2\2\2"+
		"\u0350\u0352\7Y\2\2\u0351\u0353\5r:\2\u0352\u0351\3\2\2\2\u0352\u0353"+
		"\3\2\2\2\u0353q\3\2\2\2\u0354\u0355\7\66\2\2\u0355\u0356\5\b\5\2\u0356"+
		"s\3\2\2\2\u0357\u0359\7\'\2\2\u0358\u035a\5v<\2\u0359\u0358\3\2\2\2\u0359"+
		"\u035a\3\2\2\2\u035a\u035b\3\2\2\2\u035b\u037c\7(\2\2\u035c\u035e\7\'"+
		"\2\2\u035d\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u035d\3\2\2\2\u035f"+
		"\u0360\3\2\2\2\u0360\u0362\3\2\2\2\u0361\u0363\5v<\2\u0362\u0361\3\2\2"+
		"\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u037c\b;\1\2\u0365\u0367"+
		"\7\'\2\2\u0366\u0368\5v<\2\u0367\u0366\3\2\2\2\u0367\u0368\3\2\2\2\u0368"+
		"\u0369\3\2\2\2\u0369\u036b\7(\2\2\u036a\u036c\7(\2\2\u036b\u036a\3\2\2"+
		"\2\u036c\u036d\3\2\2\2\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u036f"+
		"\3\2\2\2\u036f\u037c\b;\1\2\u0370\u0372\7\'\2\2\u0371\u0373\7\'\2\2\u0372"+
		"\u0371\3\2\2\2\u0373\u0374\3\2\2\2\u0374\u0372\3\2\2\2\u0374\u0375\3\2"+
		"\2\2\u0375\u0377\3\2\2\2\u0376\u0378\5v<\2\u0377\u0376\3\2\2\2\u0377\u0378"+
		"\3\2\2\2\u0378\u0379\3\2\2\2\u0379\u037a\7(\2\2\u037a\u037c\b;\1\2\u037b"+
		"\u0357\3\2\2\2\u037b\u035d\3\2\2\2\u037b\u0365\3\2\2\2\u037b\u0370\3\2"+
		"\2\2\u037cu\3\2\2\2\u037d\u0382\5x=\2\u037e\u037f\7I\2\2\u037f\u0381\5"+
		"x=\2\u0380\u037e\3\2\2\2\u0381\u0384\3\2\2\2\u0382\u0380\3\2\2\2\u0382"+
		"\u0383\3\2\2\2\u0383w\3\2\2\2\u0384\u0382\3\2\2\2\u0385\u0386\5`\61\2"+
		"\u0386\u0387\7Y\2\2\u0387y\3\2\2\2i|~\u0095\u0099\u009b\u00a4\u00af\u00b7"+
		"\u00bf\u00c7\u00cf\u00d7\u00dc\u00e3\u00ee\u00f6\u0106\u010a\u010f\u0116"+
		"\u011d\u0125\u0128\u0132\u013b\u0150\u015b\u0169\u0176\u017f\u0183\u0194"+
		"\u01a2\u01ab\u01b1\u01bf\u01d0\u01db\u01e5\u01ec\u01f3\u01f9\u01fc\u0201"+
		"\u0207\u020e\u0211\u0215\u021a\u0220\u0224\u022b\u0233\u0237\u0243\u0246"+
		"\u0250\u0255\u025a\u0262\u026b\u026f\u027c\u027f\u028a\u028f\u0294\u0298"+
		"\u029f\u02ae\u02bd\u02d0\u02d3\u02dc\u02e0\u02e4\u02f2\u02f5\u02fa\u0305"+
		"\u030d\u0310\u0313\u031a\u031d\u0325\u0328\u032f\u0336\u0339\u0341\u0346"+
		"\u034d\u0352\u0359\u035f\u0362\u0367\u036d\u0374\u0377\u037b\u0382";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}