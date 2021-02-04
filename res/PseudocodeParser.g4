parser grammar PseudocodeParser;

options {
	tokenVocab = PseudocodeLexer;
}

init: (declaration | statement)* EOF;

// Expressions

primaryExpression:
	literal
	| variableName
	| LeftParen expression RightParen
	| LeftParen expression { notifyErrorListeners("expected closing parenthesis"); }
	| LeftParen expression RightParen RightParen { notifyErrorListeners("too many closing parentheses"); }
	| (Identifier | literal) (Identifier | literal)+ { notifyErrorListeners("expected double quotes or operators"); }
	| Identifier Identifier Colon IntegerLiteral Not { notifyErrorListeners("expected double quotes or operators"); }
	;

variableName: Identifier;

expression: logicalOrExpression
    ;

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
	| Minus unaryExpression
//	| binaryOperator unaryExpression { notifyErrorListeners("redundant binary operator: '" + $binaryOperator.text + "'"); }
	| unaryExpression binaryOperator { notifyErrorListeners("redundant binary operator: '" + $binaryOperator.text + "'"); }
	;

createExpression:
    (Create | New) typeSpecifier LeftBracket expression RightBracket;

postfixExpression:
	primaryExpression
	| arrayAccess
	| functionCall // function call
	| Identifier (PlusPlus | MinusMinus)
	| (Identifier | literal) (LeftParen expressionList? RightParen)+ { notifyErrorListeners("redundant parentheses"); }
    | Identifier LeftParen LeftParen expressionList? RightParen { notifyErrorListeners("redundant opening parenthesis"); }
    | Identifier LeftParen expressionList? RightParen RightParen { notifyErrorListeners("redundant closing parenthesis"); }
    | Identifier LeftParen expressionList? { notifyErrorListeners("expecting closing parenthesis"); }
	;

arrayAccess:
    Identifier LeftBracket expression RightBracket
    ;

functionCall:
    Identifier LeftParen expressionList? RightParen
    ;

expressionList:
	expression (
		Comma expression
	)*
	;

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
    assignmentStatement
    | compoundStatement
    | selectionStatement
    | iterationStatement
    | breakStatement
    | continueStatement
    | returnStatement
    | printStatement
    | scanStatement
	| simpleDeclaration
	| functionCallStatement
	| expressionStatement
	;

expressionStatement:
    badExpression Semi
    ;

badExpression:
    expression { notifyErrorListeners("unknown operation, expected assignment statement."); }
    ;

functionCallStatement:
    functionCall Semi
    ;

assignmentStatement:
    (variableName | arrayAccess) assignmentOperator expression Semi
    | badAssignment Semi
    ;

badAssignment:
    (variableName | arrayAccess) PlusPlus Plus { notifyErrorListeners("redundant +"); }
    ;

printStatement:
    Print LeftParen expression RightParen Semi
    | Print LeftParen LeftParen+ expression RightParen Semi { notifyErrorListeners("too many open parenthesis"); }
    | Print LeftParen expression RightParen RightParen+ Semi { notifyErrorListeners("too many closing parenthesis"); }
    | Print LeftParen+ expression Semi { notifyErrorListeners("expected closing parenthesis"); }
    ;

scanStatement:
    Scan LeftParen StringLiteral Comma Identifier RightParen Semi
    | Scan LeftParen LeftParen+ StringLiteral Comma Identifier RightParen Semi { notifyErrorListeners("too many open parenthesis"); }
    | Scan LeftParen StringLiteral Comma Identifier RightParen RightParen+ Semi { notifyErrorListeners("too many closing parenthesis"); }
    | Scan LeftParen StringLiteral Comma Identifier Semi { notifyErrorListeners("expected closing parenthesis"); }
    ;

breakStatement:
    Break Semi;

continueStatement:
    Continue Semi;

returnStatement:
    Return (expression)? Semi
    | Return badReturn Semi
    ;

badReturn:
    typeSpecifier  { notifyErrorListeners("expected expression as return storage"); }
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
    If LeftParen expression RightParen Then? compoundStatement
    | If LeftParen+ expression Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | If LeftParen expression RightParen RightParen+ Then? compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | If LeftParen LeftParen+ expression RightParen Then? compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    ;

elseIfStatement:
    Else If LeftParen expression RightParen Then? compoundStatement
    | Else If LeftParen+ expression Then? compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Else If LeftParen expression RightParen RightParen+ Then? compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | Else If LeftParen LeftParen+ expression RightParen Then? compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    ;

elseStatement:
    Else Then? compoundStatement
    ;

// Conditional End

// Iteration Start

iterationStatement:
    forStatement
    | whileStatement
    | doWhileStatement
    ;

forStatement:
    For iterationInit (Up | Down) To expression compoundStatement
    | For iterationInit badIteration expression compoundStatement
    ;

whileStatement:
    While iterationInit (Up | Down) To expression compoundStatement
    | While iterationInit badIteration expression compoundStatement
    ;

doWhileStatement:
    Do compoundStatement While iterationInit (Up | Down) To expression Semi
    | Do compoundStatement While iterationInit badIteration expression Semi
    ;

iterationInit:
    variableSpecifier? initDeclarator;

badIteration:
    (Up | Down) | To  { notifyErrorListeners("expected up/down to"); }
    | StringLiteral  { notifyErrorListeners("enclosed up to"); }
    ;
// Iteration End

// Declaration Start

declaration:
	simpleDeclaration
	| functionDefinition
	;

simpleDeclaration:
    variableDeclaration
    | arrayDeclaration
	;

variableDeclaration:
    variableSpecifier initDeclaratorList Semi
    ;

arrayDeclaration:
    arraySpecifier Identifier Assign createExpression Semi
    ;

declSpecifierSeq:
    variableSpecifier
    | arraySpecifier
//    | badConst (variableSpecifier | arraySpecifier) { notifyErrorListeners("misspelled constant declaration, use 'constant'"); }
    ;

variableSpecifier:
    (Const)? typeSpecifier;

arraySpecifier:
    (Const)? typeSpecifier LeftBracket RightBracket;

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

// Declaration End

// Function Start

functionDefinition:
    Function? declSpecifierSeq Identifier parametersAndQualifiers compoundStatement
    | mainFunction
    ;

mainFunction:
    Function? declSpecifierSeq? Main LeftParen RightParen compoundStatement
    | Function? declSpecifierSeq? Main LeftParen compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Function? declSpecifierSeq? Main LeftParen LeftParen+ RightParen compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    | Function? declSpecifierSeq? Main LeftParen RightParen RightParen+ compoundStatement { notifyErrorListeners("too many closing parenthesis"); };

// Function End

// Initialization Start

initDeclaratorList: initDeclarator (Comma initDeclarator)*;

initDeclarator: Identifier initializer?;

initializer:
	Assign expression;


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
	declSpecifierSeq Identifier
	;

// Parameters End