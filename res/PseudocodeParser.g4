parser grammar PseudocodeParser;

options {
	tokenVocab = PseudocodeLexer;
}

init: declarationseq? EOF;

// Expressions

primaryExpression:
	literal+
	| This
	| LeftParen expression RightParen
	| Identifier;

expression: assignmentExpression;
//expression: assignmentExpression (Comma assignmentExpression)*;

assignmentExpression:
	logicalOrExpression
	| logicalOrExpression assignmentOperator initializerClause;

logicalOrExpression:
	logicalAndExpression (OrOr logicalAndExpression)*;

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
	)*;

multiplicativeExpression:
	unaryExpression (
		(Star | Div | Mod) unaryExpression
	)*;

unaryExpression:
	postfixExpression
	| (PlusPlus | MinusMinus | unaryOperator) unaryExpression
	| createExpression;

createExpression:
    (Create | New) typeSpecifier LeftBracket constantExpression RightBracket;

postfixExpression:
	primaryExpression
	| Identifier LeftBracket expression RightBracket // arrays?
	| Identifier LeftParen expressionList? RightParen // function call
	| Identifier (PlusPlus | MinusMinus);

constantExpression: logicalOrExpression;

expressionList: initializerList;

unaryOperator: Plus | Minus | Not;

assignmentOperator:
	Assign
	| StarAssign
	| DivAssign
	| ModAssign
	| PlusAssign
	| MinusAssign;

literal:
	IntegerLiteral
	| CharacterLiteral
	| FloatingLiteral
	| StringLiteral
	| BooleanLiteral
	| PointerLiteral
	| UserDefinedLiteral;

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
	) Semi;

expressionStatement: expression? Semi;

// Compound Statement Start

compoundStatement: LeftBrace statementSeq? RightBrace;

statementSeq: statement+;

// Compound Statement End

// Conditional Start

selectionStatement:
    ifStatement elseIfStatement* elseStatement?;

ifStatement:
    If LeftParen condition RightParen Then? compoundStatement;

elseIfStatement:
    Else If LeftParen condition RightParen Then? compoundStatement;

elseStatement:
    Else Then? compoundStatement;

condition:
	constantExpression;

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
	)?;

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

initializerClause: assignmentExpression;

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