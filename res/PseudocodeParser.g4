parser grammar PseudocodeParser;

options {
	tokenVocab = PseudocodeLexer;
}

// Expressions

primaryExpression:
	literal+
	| This
	| LeftParen expression RightParen
	| Identifier;

expression: assignmentExpression (Comma assignmentExpression)*;

assignmentExpression:
	logicalOrExpression assignmentOperator initializerClause;

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
	| (PlusPlus | MinusMinus | unaryOperator) unaryExpression;

postfixExpression:
	primaryExpression
	| postfixExpression LeftBracket (expression | bracedInitList) RightBracket // arrays?
	| postfixExpression LeftParen expressionList? RightParen
	| postfixExpression (PlusPlus | MinusMinus);

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

constSeq: Const+;

// Statements

statement:
    expressionStatement
    | compoundStatement
    | selectionStatement
    | iterationStatement
	| simpleDeclaration;

expressionStatement: expression? Semi;

// Compound Statement Start

compoundStatement: LeftBrace statementSeq? RightBrace;

statementSeq: statement+;

// Compound Statement End

// Conditional Start

selectionStatement:
	If LeftParen condition RightParen statement (Else statement)?;

condition:
	expression
	| declSpecifierSeq declarator (
		Assign initializerClause
		| bracedInitList
	);

// Conditional End

// Iteration Start

iterationStatement:
	While LeftParen condition RightParen statement
	| Do statement While LeftParen expression RightParen Semi
	| For LeftParen (
		forInitStatement condition? Semi expression?
	) RightParen statement;

forInitStatement: expressionStatement | simpleDeclaration;

// Iteration End

// Declaration Start

simpleDeclaration:
	declSpecifierSeq? initDeclaratorList? Semi;

declSpecifierSeq: declSpecifier+;

declSpecifier:
    Char
	| Bool
	| Short
	| Int
	| Long
	| Signed
	| Unsigned
	| Float
	| Double
	| Void
	| Auto
    | Const;

declarator:
	Identifier
	| declarator (
		parametersAndQualifiers
		| LeftBracket constantExpression? RightBracket
	);

// Declaration End

// Initialization Start

initDeclaratorList: initDeclarator (Comma initDeclarator)*;

initDeclarator: declarator initializer?;

initializer:
	braceOrEqualInitializer
	| LeftParen expressionList RightParen;

braceOrEqualInitializer:
	Assign initializerClause
	| bracedInitList;

initializerClause: assignmentExpression | bracedInitList;

initializerList:
	initializerClause (
		Comma initializerClause
	)*;

bracedInitList: LeftBrace (initializerList Comma?)? RightBrace;

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