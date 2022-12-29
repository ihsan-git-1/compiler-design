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
SQR_BRKT_OP:
'['
    ;
SQR_BRKT_CL:
']'
    ;
// operators
SEMICOLON:';';
COMMA:',';
COLON:':';
PLUS: '+';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';
DOT: '.';



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
LIST :
'List'
;
EXTENDS:
'extends'
;
RETURN:
'return'
;
ALL:
'all'
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
WIDGET:
'Widget'
;
BUILD:
'build'
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
MATERIALAPP:
'MaterialApp'
;
HOME:
'home'
;
SCAFFOLD:
'Scaffold'
;
PADDING:
'Padding'
;
PADDINGSMALL:
'padding'
;
EDGEINSETS:
'EdgeInsets'
;
ROW:
'Row'
;
COLUMN:
'Column'
;
IMAGE:
'Image'
;
BODY:
'body'
;
TEXT:
'Text'
;
NETWORK:
'network'
;
CHILDREN:
'children'
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
OVERRIDE
 : '@' ~[\r\n]* -> skip
 ;
PRIVATE
 : '_' ~[\r\n]* -> skip
 ;
WS : [ \t\n\r]+ -> skip ;
