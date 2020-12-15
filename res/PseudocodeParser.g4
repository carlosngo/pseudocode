parser grammar PseudocodeParser;

import PseudocodeLexer;

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
	unaryExpression
    | multiplicativeExpression (
		(Star | Div | Mod) multiplicativeExpression
	)*;

unaryExpression:
	postfixExpression
	| (PlusPlus | MinusMinus | unaryOperator) unaryExpression;

postfixExpression:
	primaryExpression
	| postfixExpression LeftBracket (expression | bracedInitList) RightBracket // arrays?
	| postfixExpression LeftParen expressionList? RightParen
	| postfixExpression (PlusPlus | MinusMinus);

initializerClause: assignmentExpression | bracedInitList;

initializerList:
	initializerClause (
		Comma initializerClause
	)*;

expressionList: initializerList;

bracedInitList: LeftBrace (initializerList Comma?)? RightBrace;

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

