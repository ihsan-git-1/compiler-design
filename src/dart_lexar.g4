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
ANGLE_BRKT_OP:
'<'
    ;
ANGLE_BRKT_CL:
'>'
    ;
BRKT_OP:
'('
    ;
BRKT_CL:
')'
    ;

// operators
SEMICOLON:';';
COMMA:',';
COLON:':';
PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';



// dart variabels data types
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
RETURN:
'return'
;
STRING_LINE:
 '"' ( ~[\\"] | '\\' . )* '"'
 ;


 // flutter variabels data types

BUILDCONTEXT:
'BuildContext'
;
STATE:
'State'
;
CREATE:
'create'
;
CREATESTATE:
'createState'
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
WIDTH:
'width'
;
HEIGHT:
'height'
;
COLOR:
'color'
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
