grammar Pseudocode;

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

// Data Types and Structures

IntegerLiteral:
    DecimalLiteral Integersuffix?
    | OctalLiteral Integersuffix?
    | HexadecimalLiteral Integersuffix?
    | BinaryLiteral Integersuffix?;

BooleanLiteral: False_ | True_;

FloatingLiteral:
    Fractionalconstant Exponentpart? Floatingsuffix?
    | Digitsequence Exponentpart Floatingsuffix?;

// Integer business

Integersuffix:
    Unsignedsuffix Longsuffix?
    | Unsignedsuffix Longlongsuffix?
    | Longsuffix Unsignedsuffix?
    | Longlongsuffix Unsignedsuffix?;

DecimalLiteral: NONZERODIGIT ('\''? DIGIT)*;

OctalLiteral: '0' ('\''? OCTALDIGIT)*;

HexadecimalLiteral: ('0x' | '0X') HEXADECIMALDIGIT (
        '\''? HEXADECIMALDIGIT
    )*;

BinaryLiteral: ('0b' | '0B') BINARYDIGIT ('\''? BINARYDIGIT)*;

fragment Unsignedsuffix: [uU];

fragment Longsuffix: [lL];

fragment Longlongsuffix: 'll' | 'LL';

fragment NONZERODIGIT: [1-9];

fragment OCTALDIGIT: [0-7];

fragment HEXADECIMALDIGIT: [0-9a-fA-F];

fragment BINARYDIGIT: [01];

// Boolean business

False_: 'false';
True_: 'true';

// Floating business

fragment Fractionalconstant:
    Digitsequence? '.' Digitsequence
    | Digitsequence '.';

fragment Exponentpart:
    'e' SIGN? Digitsequence
    | 'E' SIGN? Digitsequence;

fragment Floatingsuffix: [flFL];

fragment Digitsequence: DIGIT ('\''? DIGIT)*;

fragment SIGN: [+-];

// Digits

fragment DIGIT: [0-9];
