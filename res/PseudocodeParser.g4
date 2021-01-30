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
	| Identifier Identifier Colon IntegerLiteral Not { notifyErrorListeners("expected double quotes or operators"); }
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
	| binaryOperator unaryExpression { notifyErrorListeners("redundant binary operator: '" + $binaryOperator.text + "'"); }
	| unaryExpression binaryOperator { notifyErrorListeners("redundant binary operator: '" + $binaryOperator.text + "'"); }
	;

createExpression:
    (Create | New) typeSpecifier LeftBracket constantExpression RightBracket;

postfixExpression:
	primaryExpression
	| Identifier LeftBracket expression RightBracket // arrays?
	| Identifier LeftParen expressionList? RightParen // function call
	| Identifier (PlusPlus | MinusMinus)
	| (Identifier | literal) (LeftParen expressionList? RightParen)+ { notifyErrorListeners("redundant parentheses"); }
    | Identifier LeftParen LeftParen expressionList? RightParen { notifyErrorListeners("redundant opening parenthesis"); }
    | Identifier LeftParen expressionList? RightParen RightParen { notifyErrorListeners("redundant closing parenthesis"); }
    | Identifier LeftParen expressionList? { notifyErrorListeners("expecting closing parenthesis"); }
	;


constantExpression:
    logicalOrExpression
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
	| Comma
    ;

literal:
	IntegerLiteral
	| CharacterLiteral
	| FloatingLiteral
	| StringLiteral
	| BooleanLiteral
	| BadStringLiteral { notifyErrorListeners("expected closing double quotes"); }
	| BadFloatingLiteral { notifyErrorListeners("expected floating suffix"); }
	;

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
    Print LeftParen constantExpression RightParen Semi
    | Print LeftParen LeftParen+ constantExpression RightParen Semi { notifyErrorListeners("too many open parenthesis"); }
    | Print LeftParen constantExpression RightParen RightParen+ Semi { notifyErrorListeners("too many closing parenthesis"); }
    | Print LeftParen+ constantExpression Semi { notifyErrorListeners("expected closing parenthesis"); }
    ;

scanStatement:
    Scan LeftParen StringLiteral Comma Identifier RightParen Semi
    | Scan LeftParen LeftParen+ StringLiteral Comma Identifier RightParen Semi { notifyErrorListeners("too many open parenthesis"); }
    | Scan LeftParen StringLiteral Comma Identifier RightParen RightParen+ Semi { notifyErrorListeners("too many closing parenthesis"); }
    | Scan LeftParen StringLiteral Comma Identifier Semi { notifyErrorListeners("expected closing parenthesis"); }
    ;

jumpStatement:
	(
		Break
		| Continue
		| Return (constantExpression)?
	) Semi
	| Return badReturn Semi
	;

badReturn:
    typeSpecifier  { notifyErrorListeners("expected expression as return storage"); }
    ;

expressionStatement:
    expression? Semi
    ;

// Compound statement Start

compoundStatement:
    LeftBrace statementSeq? RightBrace
    | LeftBrace+ statementSeq? { notifyErrorListeners("expected closing curly brace"); }
    | LeftBrace statementSeq? RightBrace RightBrace+ { notifyErrorListeners("too many closing curly braces"); }
    | LeftBrace LeftBrace+ statementSeq? RightBrace { notifyErrorListeners("redundant opening curly brace"); }
	;

statementSeq: statement+;

// Compound statement End

// Conditional Start

selectionStatement:
    ifStatement elseIfStatement* elseStatement?;

ifStatement:
    If LeftParen condition RightParen Then compoundStatement
    | If LeftParen+ condition Then compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | If LeftParen condition RightParen RightParen+ Then compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | If LeftParen LeftParen+ condition RightParen Then compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    ;

elseIfStatement:
    Else If LeftParen condition RightParen Then? compoundStatement
    | Else If LeftParen+ condition Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Else If LeftParen condition RightParen RightParen+ Then? compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | Else If LeftParen LeftParen+ condition RightParen Then? compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    ;

elseStatement:
    Else Then? compoundStatement
    ;

condition:
    constantExpression
	;

// Conditional End

// Iteration Start

iterationStatement:
    For iterationInit (Up | Down) To constantExpression compoundStatement
    | While iterationInit (Up | Down) To constantExpression compoundStatement
	| Do compoundStatement While iterationInit (Up | Down) To constantExpression Semi

    | While iterationInit badIteration constantExpression compoundStatement
    | For iterationInit badIteration constantExpression compoundStatement
    | Do compoundStatement While iterationInit badIteration constantExpression Semi;

iterationInit:
    expression
    | declSpecifierSeq? initDeclaratorList;

badIteration:
    (Up | Down) | To  { notifyErrorListeners("expected up/down to"); }
    | StringLiteral  { notifyErrorListeners("enclosed up to"); }
    ;
// Iteration End

// Declaration Start

declaration:
	simpleDeclaration
	| functionDefinition
	| emptyDeclaration
	;

emptyDeclaration: Semi;

simpleDeclaration:
	declSpecifierSeq? initDeclaratorList? Semi
	;

declSpecifierSeq:
    (Const | Final)? typeSpecifier (LeftBracket RightBracket)?
    | badConst typeSpecifier (LeftBracket RightBracket)? { notifyErrorListeners("misspelled constant declaration, use 'constant'"); }
    ;

badConst: Badconst;

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
		// | LeftBracket constantExpression? RightBracket
	)?
	| literal (
        parametersAndQualifiers
        // | LeftBracket constantExpression? RightBracket
    )? { notifyErrorListeners("expected identifier as declarator"); }
	| typeSpecifier { notifyErrorListeners("expected identifier, found data type"); }
	;

// Declaration End

// Function Start

functionDefinition:
    Function? declSpecifierSeq declarator compoundStatement
    | mainFunction
    ;

mainFunction:
    Function? declSpecifierSeq? Main LeftParen RightParen compoundStatement
    | Function? declSpecifierSeq? Main compoundStatement { notifyErrorListeners("expected parentheses"); }
    | Function? declSpecifierSeq? Main RightParen+ compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    | Function? declSpecifierSeq? Main LeftParen+ compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Function? declSpecifierSeq? Main LeftParen LeftParen+ RightParen compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    | Function? declSpecifierSeq? Main LeftParen RightParen RightParen+ compoundStatement { notifyErrorListeners("too many closing parenthesis"); };

// Function End

// Initialization Start

initDeclaratorList: initDeclarator (Comma initDeclarator)*;

initDeclarator: declarator initializer?;

initializer:
	Assign initializerClause;

initializerClause: constantExpression
    ;

initializerList:
	initializerClause (
		Comma initializerClause
	)*;


// Initialization End

// Parameters Start

parametersAndQualifiers:
	LeftParen parameterDeclarationClause? RightParen
	| LeftParen+ parameterDeclarationClause? { notifyErrorListeners("expected closing parenthesis"); }
	| LeftParen parameterDeclarationClause? RightParen RightParen+ { notifyErrorListeners("too many closing parenthesis"); }
	| LeftParen LeftParen+ parameterDeclarationClause? RightParen { notifyErrorListeners("too many opening parenthesis"); };

parameterDeclarationClause:
	parameterDeclaration (Comma parameterDeclaration)*;

parameterDeclaration:
	declSpecifierSeq (
		declarator (
			Assign initializerClause
		)?
	);

// Parameters End