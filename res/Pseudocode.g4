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

// Digits

fragment DIGIT: [0-9];

// Function stuff

Entryfunction:
    MAIN Whitespace? PARAMS LeftBrace RightBrace
    ;

Voidfunction:
    FUNC VOID Whitespace? FUNCNAME PARAMS LeftBrace RightBrace
    ;

Nonvoidfunction:
    FUNC VARTYPE Whitespace? FUNCNAME PARAMS LeftBrace RETURN RETURNTYPES RightBrace
    ;

Functioncall:
    FUNCNAME PARAMS Semi
    | VAR Equal FUNCNAME PARAMS Semi
    | VARTYPE VAR Equal FUNCNAME PARAMS Semi
    ;

fragment FUNCNAME:
    VAR
    ;
fragment MAIN: 'main';

fragment VOID: 'void';

fragment FUNC: 'func';

fragment RETURN: 'return';

fragment PARAMS:
    LeftParen Whitespace? RightParen
    |LeftParen (VARTYPE VAR Whitespace? ','? Whitespace?) RightParen
    ;

fragment RETURNTYPES:
    VAR
    | Functioncall
    | IntegerLiteral
    | BooleanLiteral
    | FloatingLiteral
    | EQUATION
    ;

// Input output stuff
Inputfunction:
    SCAN LeftParen STRING ',' VAR RightParen Semi //scan("Blahblah", blah);
    ;

Outputfunction:
    PRINT LeftParen STRING RightParen Semi //print("Blah blah blah")
    | PRINT LeftParen (STRING Whitespace '+'VAR('+' Whitespace)?)+ STRING* RightParen Semi //print("Blahblah" +blah); | print("Blahblah" +blah+ "Blahblah" +blah); | print("Blahblah" +blah+ "Blahblah");
    | PRINT LeftParen (STRING? Whitespace? '+' EQUATION '+'?)+ RightParen Semi//complicated prints with equations
    ;

fragment SCAN: 'scan';

fragment PRINT: 'print' ;
