grammar DartVariables;

variable
    :   (FINAL | const | var)? type identifier ('=' expression)?
    ;

final
    :   'final'
    ;

const
    :   'const'
    ;

var
    :   'var'
    ;

type
    :   qualifiedType
    |   'dynamic'
    ;

qualifiedType
    :   identifier ('.' identifier)*
    ;

identifier
    :   ID
    ;

expression
    :   addExpression
    ;

addExpression
    :   multiplyExpression (('+' | '-') multiplyExpression)*
    ;

multiplyExpression
    :   primary (('*' | '/') primary)*
    ;

primary
    :   INT
    |   stringLiteral
    |   booleanLiteral
    |   '(' expression ')'
    |   identifier
    ;

stringLiteral:
STRING_LINE
    ;
STRING_LINE:
 '"' ( ~[\\"] | '\\' . )* '"'
 |'\'' ( ~[\\"] | '\\' . )* '\''
 ;

booleanLiteral
    :   'true'
    |   'false'
    ;

INT  :   [0-9]+ ;
ID   :   [a-zA-Z_][a-zA-Z0-9_]* ;
WS   :   [ \t\r\n]+ -> skip ;
