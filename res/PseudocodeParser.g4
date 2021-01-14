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
	| (Identifier | literal) (LeftParen expressionList? RightParen)+ { notifyErrorListeners("redundant parentheses"); }
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
    | Print constantExpression RightParen+ Semi { notifyErrorListeners("expected open parenthesis"); }
    | Print LeftParen+ constantExpression Semi { notifyErrorListeners("expected closing parenthesis"); }
    | Print constantExpression Semi { notifyErrorListeners("expected parentheses"); }
    ;

scanStatement:
    Scan LeftParen StringLiteral Comma Identifier RightParen Semi
    | Scan LeftParen LeftParen+ StringLiteral Comma Identifier RightParen Semi { notifyErrorListeners("too many open parenthesis"); }
    | Scan LeftParen StringLiteral Comma Identifier RightParen RightParen+ Semi { notifyErrorListeners("too many closing parenthesis"); }
    | Scan StringLiteral Comma Identifier RightParen Semi { notifyErrorListeners("expected open parenthesis"); }
    | Scan LeftParen StringLiteral Comma Identifier Semi { notifyErrorListeners("expected closing parenthesis"); }
    | Scan StringLiteral Comma Identifier Semi { notifyErrorListeners("expected parentheses"); }
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
    typeSpecifier  { notifyErrorListeners("expected expression as return value"); }
    ;

expressionStatement:
    expression? Semi
    ;

// Compound Statement Start

compoundStatement:
    LeftBrace statementSeq? RightBrace
    | LeftBrace+ statementSeq? { notifyErrorListeners("expected closing curly brace"); }
    | LeftBrace statementSeq? RightBrace RightBrace+ { notifyErrorListeners("too many closing curly braces"); }
    | LeftBrace LeftBrace+ statementSeq? RightBrace { notifyErrorListeners("redundant opening curly brace"); }
	;

statementSeq: statement+;

// Compound Statement End

// Conditional Start

selectionStatement:
    ifStatement elseIfStatement* elseStatement?;

ifStatement:
    If LeftParen condition RightParen Then? compoundStatement
    | If condition RightParen+ Then? compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    | If LeftParen+ condition Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | If LeftParen condition RightParen RightParen+ Then? compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | If LeftParen LeftParen+ condition RightParen Then? compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    | If condition Then? compoundStatement { notifyErrorListeners("expected parentheses"); }
    ;

elseIfStatement:
    Else If LeftParen condition RightParen Then? compoundStatement
    | Else If condition RightParen+ Then? compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    | Else If LeftParen+ condition Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Else If LeftParen condition RightParen RightParen+ Then? compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | Else If LeftParen LeftParen+ condition RightParen Then? compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    | Else If condition Then? compoundStatement { notifyErrorListeners("expected parentheses"); }
    ;

elseStatement:
    Else Then? compoundStatement
    ;

condition:
    logicalOrExpression comparisonOperator logicalOrExpression
    | (Identifier | BooleanLiteral) ((OrOr || AndAnd) (Identifier | BooleanLiteral))*
	| constantExpression {notifyErrorListeners("expected comparison operator"); }
	;

comparisonOperator:
    Equal
    | NotEqual
    | GreaterEqual
    | LessEqual
    | Greater
    | Less
    ;

// Conditional End

// Iteration Start

iterationStatement:
    For iterationInit (Up | Down) To constantExpression compoundStatement
    | While iterationInit (Up | Down) To constantExpression compoundStatement
	| While LeftParen condition RightParen compoundStatement
	| Do compoundStatement While LeftParen condition RightParen Semi
	| For LeftParen (
    		forInitStatement condition? Semi expression?
    	) RightParen compoundStatement

    | While iterationInit ((Up | Down) | To) constantExpression compoundStatement { notifyErrorListeners("expected up/down to"); }
    | While condition compoundStatement { notifyErrorListeners("expected parentheses"); }
	| While condition RightParen+ compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
	| While LeftParen+ condition compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
	| While LeftParen LeftParen+ condition RightParen compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
	| While LeftParen condition RightParen RightParen+ compoundStatement { notifyErrorListeners("too many closing parenthesis"); }

    | Do compoundStatement While condition Semi { notifyErrorListeners("expected parentheses"); }
	| Do compoundStatement While condition RightParen+ Semi { notifyErrorListeners("expected opening parenthesis"); }
	| Do compoundStatement While LeftParen+ condition Semi  { notifyErrorListeners("expected closing parenthesis"); }
	| Do compoundStatement While LeftParen LeftParen+ condition RightParen Semi { notifyErrorListeners("too many opening parenthesis"); }
	| Do compoundStatement While LeftParen condition RightParen RightParen+ Semi { notifyErrorListeners("too many closing parenthesis"); }

    | For iterationInit ((Up | Down) | To) constantExpression compoundStatement { notifyErrorListeners("expected up/down to"); }
    | For (
        forInitStatement condition? Semi expression?
    ) compoundStatement { notifyErrorListeners("expected parentheses"); }
	| For (
    	forInitStatement condition? Semi expression?
    ) RightParen+ compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    | For LeftParen+ (
    	forInitStatement condition? Semi expression?
    ) compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | For LeftParen LeftParen+ (
        forInitStatement condition? Semi expression?
    ) RightParen compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    | For LeftParen (
            forInitStatement condition? Semi expression?
    ) RightParen RightParen+ compoundStatement { notifyErrorListeners("too many closing parenthesis"); };

forInitStatement: expressionStatement | simpleDeclaration;

iterationInit:
    expression
    | declSpecifierSeq? initDeclaratorList;

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
		// | LeftBracket constantExpression? RightBracket
	)?
	| literal (
        parametersAndQualifiers
        // | LeftBracket constantExpression? RightBracket
    )? { notifyErrorListeners("expected identifier as declarator"); }
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