//tokens

lexer grammar dart_lexar;

CLASS:
'class'
	;

FOR:
'for';

IF:
'if';

ELSEIF:
'else if';

ELSE:
'else';

WHILE:
'while';
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
MINUS: '-';
MULTY:'*';
DIVIDE:'/';
EQUAL: '==';
ASSIGN: '=';
NOTEQUAL: '!=';
GRATEREQUAL: '<=';
NULL: 'null';
LESSEQUAL: '>=';
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
DOUBLE:
'double'
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
FINAL:
'final'
;
CONST:
'const'
;
VAR:
'var'
;
VOID:
'void'
;
FUNCTION:
'Function'
;

SETSTATE:
'setState'
;
STRING_LINE:
 '"' ( ~[\\"] | '\\' . )* '"'
  |'\'' ( ~[\\"] | '\\' . )* '\''
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
ONPRESSED:
'onPressed'
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
DYNAMIC:
'dynamic'
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
[a-zA-Z-+]+
    ;
NUMBERDOUBLE : [0-9]+ '.' [0-9]+ ;
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

