lexer grammar Pseudocode;

// Keywords
Else: 'else';

For: 'for';

If: 'if';

Return: 'return';

This: 'this';

While: 'while';

Up: 'up';

To: 'to';

LeftParen: '(';

RightParen: ')';

LeftBracket: '[';

RightBracket: ']';

LeftBrace: '{';

RightBrace: '}';

Plus: '+';

Minus: '-';

Star: '*';

Div: '/';

Not: '!';

Assign: '=';

Less: '<';

Greater: '>';

Equal: '==';

NotEqual: '!=';

LessEqual: '<=';

GreaterEqual: '>=';

AndAnd: '&&';

OrOr: '||';

PlusPlus: '++';

MinusMinus: '--';

Comma: ',';

Semi: ';';

Dot: '.';

Whitespace: [ \t]+ -> skip;

Newline: ('\r' '\n'? | '\n') -> skip;

BlockComment: '/*' .*? '*/' -> skip;

LineComment: '//' ~ [\r\n]* -> skip;

Main: 'main';

Void: 'void';

Func: 'func';

Scan: 'scan';

Print: 'print' ;

// Data Types and Structures

IntegerLiteral:
    DecimalLiteral Integersuffix?;

BooleanLiteral: False_ | True_;

FloatingLiteral:
    Fractionalconstant Floatingsuffix?
    | Digitsequence Floatingsuffix?;

// Integer business

Integersuffix:
    Unsignedsuffix Longsuffix?
    | Unsignedsuffix Longlongsuffix?
    | Longsuffix Unsignedsuffix?
    | Longlongsuffix Unsignedsuffix?;

DecimalLiteral: NONZERODIGIT ('\''? DIGIT)*;

fragment Unsignedsuffix: [uU];

fragment Longsuffix: [lL];

fragment Longlongsuffix: 'll' | 'LL';

fragment NONZERODIGIT: [1-9];

// Boolean business

False_: 'false';
True_: 'true';

// Floating business

fragment Fractionalconstant:
    Digitsequence? '.' Digitsequence
    | Digitsequence '.';

fragment Floatingsuffix: [flFL];

fragment Digitsequence: DIGIT ('\''? DIGIT)*;

fragment SIGN: [+-];

// ID

Identifier:
//	Identifiernondigit | Identifier Identifiernondigit | Identifier DIGIT
	Identifiernondigit (Identifiernondigit | DIGIT)*;

fragment Identifiernondigit: NONDIGIT;

fragment DIGIT: [0-9];

fragment NONDIGIT: [a-zA-Z_];


