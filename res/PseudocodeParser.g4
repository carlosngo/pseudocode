parser grammar PseudocodeParser;

options {
	tokenVocab = PseudocodeLexer;
}

init: (declaration | statement)* EOF;

// Expressions

primaryExpression:
	literal
	| This
	| Identifier
	| LeftParen expression RightParen
	| LeftParen expression { notifyErrorListeners("expected closing parenthesis"); }
	| LeftParen expression RightParen RightParen { notifyErrorListeners("too many closing parentheses"); }
	| (Identifier | literal) (Identifier | literal)+ { notifyErrorListeners("expected double quotes or operators"); }
	;

expression: assignmentExpression
    ;
//expression: assignmentExpression (Comma assignmentExpression)*;

assignmentExpression:
	logicalOrExpression
	| logicalOrExpression assignmentOperator initializerClause;

logicalOrExpression:
	logicalAndExpression (OrOr logicalAndExpression)*
    ;

logicalAndExpression:
	equalityExpression (AndAnd equalityExpression)*;

equalityExpression:
	relationalExpression (
		(Equal | NotEqual) relationalExpression
	)*;

relationalExpression:
	additiveExpression (
		(Less | Greater | LessEqual | GreaterEqual) additiveExpression
	)*;

additiveExpression:
	multiplicativeExpression (
		(Plus | Minus) multiplicativeExpression
	)*
	| multiplicativeExpression (
        (Plus | Minus | PlusPlus | MinusMinus) multiplicativeExpression
    )* { notifyErrorListeners("redundant +"); }
    ;

multiplicativeExpression:
	unaryExpression (
		(Star | Div | Mod) unaryExpression
	)*;

unaryExpression:
	postfixExpression
	| Not unaryExpression
	| createExpression
	| binaryOperator+ unaryExpression { notifyErrorListeners("redundant binary operator. Missing operand"); }
	| unaryExpression binaryOperator+ { notifyErrorListeners("redundant binary operator. Missing operand"); }
	;

createExpression:
    (Create | New) typeSpecifier LeftBracket constantExpression RightBracket;

postfixExpression:
	primaryExpression
	| Identifier LeftBracket expression RightBracket // arrays?
	| Identifier LeftParen expressionList? RightParen // function call
	| Identifier (PlusPlus | MinusMinus)
	| Identifier (LeftParen expressionList? RightParen)+ { notifyErrorListeners("redundant parentheses"); }
	| literal (LeftParen expressionList? RightParen)+ { notifyErrorListeners("redundant parentheses"); }
	;


constantExpression:
    logicalOrExpression
    | assignmentExpression { notifyErrorListeners("unexpected assignment operation"); }
    ;

expressionList: initializerList;

assignmentOperator:
	Assign
	| StarAssign
	| DivAssign
	| ModAssign
	| PlusAssign
	| MinusAssign;

binaryOperator:
    assignmentOperator
    | Plus
	| Minus
	| Star
	| Div
	| Mod
	| Greater
	| Less
	| GreaterEqual
	| Equal
	| NotEqual
	| LessEqual
	| GreaterEqual
	| AndAnd
	| OrOr
    ;

literal:
	IntegerLiteral
	| CharacterLiteral
	| FloatingLiteral
	| StringLiteral
	| BooleanLiteral;

// Statements

statement:
    expressionStatement
    | compoundStatement
    | selectionStatement
    | iterationStatement
    | jumpStatement
    | printStatement
    | scanStatement
	| simpleDeclaration;

printStatement:
    Print LeftParen constantExpression RightParen;

scanStatement:
    Scan LeftParen StringLiteral Comma Identifier RightParen;

jumpStatement:
	(
		Break
		| Continue
		| Return (constantExpression)?
	) Semi
	| Return badReturn Semi
	;

badReturn:
    typeSpecifier  { notifyErrorListeners("expected expression as return value"); }
    ;

expressionStatement: expression? Semi;

// Compound Statement Start

compoundStatement: LeftBrace statementSeq? RightBrace
    | LeftBrace+ statementSeq? { notifyErrorListeners("expected closing curly brace"); }
    | LeftBrace statementSeq? RightBrace RightBrace+ { notifyErrorListeners("too many closing curly braces"); }
    ;

statementSeq: statement+;

// Compound Statement End

// Conditional Start

selectionStatement:
    ifStatement elseIfStatement* elseStatement?;

ifStatement:
    If LeftParen condition RightParen Then? compoundStatement
    | If LeftParen condition Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | If LeftParen condition RightParen RightParen Then? compoundStatement { notifyErrorListeners("too many closing parentheses"); };

elseIfStatement:
    Else If LeftParen condition RightParen Then? compoundStatement
    | Else If LeftParen condition Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Else If LeftParen condition RightParen RightParen Then? compoundStatement { notifyErrorListeners("too many closing parentheses"); };

elseStatement:
    Else Then? compoundStatement;

condition:
	constantExpression
	;

// Conditional End

// Iteration Start

iterationStatement:
    For iterationInit (Up | Down) To constantExpression
    | While iterationInit (Up | Down) To constantExpression
	| While LeftParen condition RightParen statement
	| Do statement While LeftParen condition RightParen Semi
	| For LeftParen (
		forInitStatement condition? Semi expression?
	) RightParen statement;

forInitStatement: expressionStatement | simpleDeclaration;

iterationInit:
    expression
    | declSpecifierSeq? initDeclaratorList;

// Iteration End

// Declaration Start

declarationseq: declaration+;

declaration:
	simpleDeclaration
	| functionDefinition
	| emptyDeclaration
	;

emptyDeclaration: Semi;

simpleDeclaration:
	declSpecifierSeq? initDeclaratorList? Semi;

declSpecifierSeq: (Const | Final)? typeSpecifier (LeftBracket RightBracket)?;

typeSpecifier:
    (
        Char
        | Bool
        | Short
        | Int
        | Long
        | Float
        | Double
        | Void
        | String
    )
    ;

declarator:
	Identifier (
		parametersAndQualifiers
		| LeftBracket constantExpression? RightBracket
	)?
	| literal (
        parametersAndQualifiers
        | LeftBracket constantExpression? RightBracket
    )? { notifyErrorListeners("expected identifier as declarator"); }
	;

// Declaration End

// Function Start

functionDefinition:
    Function? declSpecifierSeq declarator compoundStatement
    | mainFunction;

mainFunction:
    Function? declSpecifierSeq? Main LeftParen RightParen compoundStatement;

// Function End

// Initialization Start

initDeclaratorList: initDeclarator (Comma initDeclarator)*;

initDeclarator: declarator initializer?;

initializer:
	Assign initializerClause;

initializerClause: assignmentExpression
    ;

initializerList:
	initializerClause (
		Comma initializerClause
	)*;


// Initialization End

// Parameters Start

parametersAndQualifiers:
	LeftParen parameterDeclarationClause? RightParen;

parameterDeclarationClause:
	parameterDeclaration (Comma parameterDeclaration)*;

parameterDeclaration:
	declSpecifierSeq (
		declarator (
			Assign initializerClause
		)?
	);

// Parameters End