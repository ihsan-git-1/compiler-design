//tokens

lexer grammar dart_lexar;

CLASS:
'class'
	;

// brackets
CRLY_BRKT_OP:
'{'
    ;
CRLY_BRKT_CL:
'}'
    ;

// operators
SEMICOLON:
';';
PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';


// data types
INT :
'int'
;
STRING :
'String'
;
BOOL :
'bool'
;
EXTENDS:
'extends'
;
STRING_LINE:
 '"' ( ~[\\"] | '\\' . )* '"'
 ;


STATEFULL:
EXTENDS WS* 'StatefulWidget'
    ;
STATELESS:
EXTENDS WS* 'StatelessWidget'
    ;

TRUE:
'true'
;
FALSE:
'false'
;

NAME :
[a-zA-Z]+
    ;

NUMBER:
[0-9][0-9]*
;
COMMENT
 : '//' ~[\r\n]* -> skip
 ;
WS : [ \t\n\r]+ -> skip ;
