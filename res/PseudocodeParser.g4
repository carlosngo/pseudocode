parser grammar PseudocodeParser;

options {
	tokenVocab = PseudocodeLexer;
}

init: declarationseq? EOF;

// Expressions

primaryExpression:
	literal
	| This
	| Identifier
	| LeftParen expression RightParen
	| LeftParen expression { notifyErrorListeners("expected closing parenthesis"); }
	| LeftParen LeftParen expression RightParen { notifyErrorListeners("redundant opening parenthesis"); }
	| LeftParen expression RightParen RightParen { notifyErrorListeners("redundant closing parentheses"); }
	| Identifier Identifier+ { notifyErrorListeners("expected double quotes or operators"); }
	| literal literal+ { notifyErrorListeners("expected double quotes or operators"); }
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
	| Identifier LeftBracket LeftBracket expression RightBracket { notifyErrorListeners("redundant opening bracket"); }
	| Identifier LeftBracket expression RightBracket RightBracket { notifyErrorListeners("redundant closing bracket"); }
	| Identifier LeftBracket expression { notifyErrorListeners("expecting closing bracket"); }
	| Identifier expression RightBracket { notifyErrorListeners("expecting opening bracket"); }
	| Identifier LeftParen expressionList? RightParen // function call
	| Identifier LeftParen LeftParen expressionList? RightParen { notifyErrorListeners("redundant opening parenthesis"); }
	| Identifier LeftParen expressionList? RightParen RightParen { notifyErrorListeners("redundant closing parenthesis"); }
	| Identifier LeftParen expressionList? { notifyErrorListeners("expecting closing parenthesis"); }
	| Identifier expressionList? RightParen { notifyErrorListeners("expecting opening parenthesis"); }
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
    Print LeftParen constantExpression RightParen
    | Print LeftParen LeftParen constantExpression RightParen { notifyErrorListeners("redundant open parenthesis"); }
    | Print LeftParen constantExpression RightParen RightParen{ notifyErrorListeners("redundant closing parenthesis"); }
    | Print constantExpression RightParen { notifyErrorListeners("expected open parenthesis"); }
    | Print LeftParen constantExpression { notifyErrorListeners("expected closing parenthesis"); }
    | Print constantExpression { notifyErrorListeners("expected parentheses"); };


scanStatement:
    Scan LeftParen StringLiteral Comma Identifier RightParen
    |Scan LeftParen LeftParen StringLiteral Comma Identifier RightParen { notifyErrorListeners("redundant open parenthesis"); }
    |Scan LeftParen StringLiteral Comma Identifier RightParen RightParen { notifyErrorListeners("redundant closing parenthesis"); }
    |Scan StringLiteral Comma Identifier RightParen { notifyErrorListeners("expected open parenthesis"); }
    |Scan StringLiteral Comma Identifier { notifyErrorListeners("expected parentheses"); }
    |Scan LeftParen StringLiteral Comma Identifier { notifyErrorListeners("expected closing parenthesis"); };

jumpStatement:
	(
		Break
		| Continue
		| Return (constantExpression)?
	) Semi
	| Return typeSpecifier Semi { notifyErrorListeners("expected expression as return value"); }
	;

expressionStatement: expression? Semi;

// Compound Statement Start

compoundStatement: LeftBrace statementSeq? RightBrace
    | LeftBrace LeftBrace statementSeq? RightBrace { notifyErrorListeners("redundant opening curly brace"); }
    | LeftBrace statementSeq? { notifyErrorListeners("expected closing curly brace"); }
    | LeftBrace statementSeq? RightBrace RightBrace { notifyErrorListeners("redundant closing curly braces"); }
    ;

statementSeq: statement+;

// Compound Statement End

// Conditional Start

selectionStatement:
    ifStatement elseIfStatement* elseStatement?;

ifStatement:
    If LeftParen condition RightParen Then? compoundStatement
    | If condition RightParen Then? compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    | If LeftParen condition Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | If LeftParen condition RightParen RightParen Then? compoundStatement { notifyErrorListeners("redundant closing parenthesis"); }
    | If LeftParen LeftParen condition RightParen Then? compoundStatement { notifyErrorListeners("redundant opening parenthesis"); };

elseIfStatement:
    Else If LeftParen condition RightParen Then? compoundStatement
    | Else If LeftParen LeftParen condition RightParen Then? compoundStatement { notifyErrorListeners("redundant opening parenthesis"); }
    | Else If condition RightParen Then? compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    | Else If LeftParen condition Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Else If LeftParen condition RightParen RightParen Then? compoundStatement { notifyErrorListeners("redundant closing parenthesis"); };

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
	| While condition RightParen statement { notifyErrorListeners("expected opening parenthesis"); }
	| While LeftParen condition statement { notifyErrorListeners("expected closing parenthesis"); }
	| While LeftParen LeftParen condition RightParen statement { notifyErrorListeners("redundant opening parenthesis"); }
	| While LeftParen condition RightParen RightParen statement { notifyErrorListeners("redundant closing parenthesis"); }
	| Do statement While LeftParen condition RightParen Semi
	| Do statement While condition RightParen Semi { notifyErrorListeners("expected opening parenthesis"); }
	| Do statement While LeftParen condition Semi  { notifyErrorListeners("expected closing parenthesis"); }
	| Do statement While LeftParen LeftParen condition RightParen Semi { notifyErrorListeners("redundant opening parenthesis"); }
	| Do statement While LeftParen condition RightParen RightParen Semi { notifyErrorListeners("redundant closing parenthesis"); }
	| For LeftParen (
		forInitStatement condition? Semi expression?
	) RightParen statement
	| For (
    	forInitStatement condition? Semi expression?
    ) RightParen statement { notifyErrorListeners("expected opening parenthesis"); }
    | For LeftParen (
    	forInitStatement condition? Semi expression?
    ) statement { notifyErrorListeners("expected closing parenthesis"); }
    | For LeftParen LeftParen (
        forInitStatement condition? Semi expression?
    ) RightParen statement { notifyErrorListeners("redundant opening parenthesis"); }
    | For LeftParen (
            forInitStatement condition? Semi expression?
    ) RightParen RightParen statement { notifyErrorListeners("redundant closing parenthesis"); };

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
		| LeftBracket LeftBracket constantExpression? RightBracket { notifyErrorListeners("redundant opening bracket"); }
		| LeftBracket constantExpression? { notifyErrorListeners("expected closing bracket"); }
		| LeftBracket constantExpression? RightBracket RightBracket { notifyErrorListeners("redundant closing bracket"); }
	)?;

// Declaration End

// Function Start

functionDefinition:
    Function? declSpecifierSeq declarator compoundStatement
    | mainFunction;

mainFunction:
    Function? declSpecifierSeq? Main LeftParen RightParen compoundStatement
    |Function? declSpecifierSeq? Main RightParen compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    |Function? declSpecifierSeq? Main LeftParen compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    |Function? declSpecifierSeq? Main LeftParen LeftParen RightParen compoundStatement { notifyErrorListeners("redundant opening parenthesis"); }
    |Function? declSpecifierSeq? Main LeftParen RightParen RightParen compoundStatement { notifyErrorListeners("redundant closing parenthesis"); };

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
	LeftParen parameterDeclarationClause? RightParen
	|LeftParen parameterDeclarationClause? { notifyErrorListeners("expected closing parenthesis"); }
	|LeftParen parameterDeclarationClause? RightParen RightParen { notifyErrorListeners("redundant closing parenthesis"); }
	|LeftParen LeftParen parameterDeclarationClause? RightParen { notifyErrorListeners("redundant opening parenthesis"); };

parameterDeclarationClause:
	parameterDeclaration (Comma parameterDeclaration)*;

parameterDeclaration:
	declSpecifierSeq (
		declarator (
			Assign initializerClause
		)?
	);

// Parameters End