//reules
parser grammar dart_parse;
options { tokenVocab=dart_lexar; }

// declare start code
topTreeDeclaration :
    classDeclaration*
    ;

classDeclaration :
    CLASS NAME
    classExtender?
    CRLY_BRKT_OP
    declaration*
    CRLY_BRKT_CL
;
classExtender:
STATELESS
|STATEFULL
;
declaration:
integerDeclaration
|stringDeclaration
|boolDeclaration
;

integerDeclaration:
INT
NAME
ASSIGN
NUMBER
SEMICOLON
;
stringDeclaration:
STRING
NAME
ASSIGN
STRING_LINE
SEMICOLON
;
boolDeclaration:
BOOL
NAME
ASSIGN
booleans
SEMICOLON
;
booleans:
TRUE
|FALSE
;








