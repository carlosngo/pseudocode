parser grammar PseudocodeParser;

import PseudocodeLexer;

primaryExpression:
	literal+
	| This
	| LeftParen expression RightParen
	| idExpression
	| lambdaExpression;

equalityExpression:
	relationalExpression (
		(Equal | NotEqual) relationalExpression
	)*;

assignmentExpression:
	conditionalExpression
	| logicalOrExpression assignmentOperator initializerClause;

assignmentOperator:
	Assign
	| StarAssign
	| DivAssign
	| ModAssign
	| PlusAssign
	| MinusAssign
	| RightShiftAssign
	| LeftShiftAssign
	| AndAssign
	| XorAssign
	| OrAssign;

expression: assignmentExpression (Comma assignmentExpression)*;

literal:
	IntegerLiteral
	| CharacterLiteral
	| FloatingLiteral
	| StringLiteral
	| BooleanLiteral
	| PointerLiteral
	| UserDefinedLiteral;


