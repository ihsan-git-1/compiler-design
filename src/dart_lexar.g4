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
BRKT_OP:
'('
    ;
BRKT_CL:
')'
    ;

// operators
SEMICOLON:';';
COLON:':';
PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';


// variabels data types
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

// widgets and widgets properties
CONTAINER:
'Container'
;
EXPANDED:
'Expanded'
;
MATERIALBUTTON:
'MaterialButton'
;
CHILD:
'child'
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
