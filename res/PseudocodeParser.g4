parser grammar PseudocodeParser;

options {
	tokenVocab = PseudocodeLexer;
}

init: (declaration | statement)* EOF;

// Expressions

primaryExpression:
	literal
	| Identifier
	| LeftParen expression RightParen
	| LeftParen expression { notifyErrorListeners("expected closing parenthesis"); }
	| LeftParen expression RightParen RightParen { notifyErrorListeners("too many closing parentheses"); }
	| (Identifier | literal) (Identifier | literal)+ { notifyErrorListeners("expected double quotes or operators"); }
//	| Identifier Identifier Colon IntegerLiteral Not { notifyErrorListeners("expected double quotes or operators"); }
	;

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
	| binaryOperator unaryExpression { notifyErrorListeners("redundant binary operator: '" + $binaryOperator.text + "'"); }
	| unaryExpression binaryOperator { notifyErrorListeners("redundant binary operator: '" + $binaryOperator.text + "'"); }
	;

createExpression:
    (Create | New) typeSpecifier LeftBracket expression RightBracket;

postfixExpression:
	primaryExpression
	| arrayAccess // arrays?
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
    assignmentStatement
    | compoundStatement
    | selectionStatement
    | iterationStatement
    | breakStatement
    | continueStatement
    | returnStatement
    | printStatement
    | scanStatement
    | functionCallStatement
	| simpleDeclaration;

assignmentStatement:
    (Identifier | arrayAccess) ((assignmentOperator expression) | (PlusPlus | MinusMinus)) Semi
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

returnStatement:
    Return (expression)? Semi
    | Return badReturn Semi
    ;

breakStatement:
    Break Semi
    ;

continueStatement:
    Continue Semi
    ;

functionCallStatement:
    functionCall Semi
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
    If LeftParen expression RightParen Then compoundStatement
    | If LeftParen+ expression Then compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | If LeftParen expression RightParen RightParen+ Then compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | If LeftParen LeftParen+ expression RightParen Then compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    ;

elseIfStatement:
    Else If LeftParen expression RightParen Then compoundStatement
    | Else If LeftParen+ expression Then compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Else If LeftParen expression RightParen RightParen+ Then compoundStatement { notifyErrorListeners("too many closing parenthesis"); }
    | Else If LeftParen LeftParen+ expression RightParen Then compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    ;

elseStatement:
    Else Then compoundStatement
    ;

// Conditional End

// Iteration Start

iterationStatement:
    For iterationInit (Up | Down) To expression compoundStatement
    | While iterationInit (Up | Down) To expression compoundStatement
	| Do compoundStatement While iterationInit (Up | Down) To expression Semi

    | While iterationInit badIteration expression compoundStatement
    | For iterationInit badIteration expression compoundStatement
    | Do compoundStatement While iterationInit badIteration expression Semi;

iterationInit:
    variableSpecifier? Identifier (Assign expression)?;

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
	Const? variableSpecifier initDeclaratorList Semi
	;

arrayDeclaration:
    Const? arraySpecifier Identifier Assign createExpression Semi
    ;

declSpecifier:
    variableSpecifier
    | arraySpecifier
    | constantSpecifier
//    | badConst typeSpecifier (LeftBracket RightBracket)? { notifyErrorListeners("misspelled constant declaration, use 'constant'"); }
    ;

variableSpecifier:
    typeSpecifier
    ;

arraySpecifier:
    typeSpecifier LeftBracket RightBracket
    ;

constantSpecifier:
    Const (variableSpecifier | arraySpecifier)
    ;

//badConst: Badconst;

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

functionCall: Identifier LeftParen expressionList? RightParen
    ;

functionDefinition:
    Function? declSpecifier Identifier parametersAndQualifiers compoundStatement
    | mainFunction
    ;

mainFunction:
    Function? declSpecifier? Main LeftParen RightParen compoundStatement
    | Function? declSpecifier? Main compoundStatement { notifyErrorListeners("expected parentheses"); }
    | Function? declSpecifier? Main RightParen+ compoundStatement { notifyErrorListeners("expected opening parenthesis"); }
    | Function? declSpecifier? Main LeftParen+ compoundStatement { notifyErrorListeners("expected closing parenthesis"); }
    | Function? declSpecifier? Main LeftParen LeftParen+ RightParen compoundStatement { notifyErrorListeners("too many opening parenthesis"); }
    | Function? declSpecifier? Main LeftParen RightParen RightParen+ compoundStatement { notifyErrorListeners("too many closing parenthesis"); };

// Function End

// Initialization Start

initDeclaratorList: initDeclarator (Comma initDeclarator)*;

initDeclarator: Identifier initializer?;

initializer:
	Assign expression;

initializerList:
	expression (
		Comma expression
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
	declSpecifier Identifier;

// Parameters End