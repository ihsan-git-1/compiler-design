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
variabelsDeclaration
|widgetsDeclaration
;

widgetsDeclaration:
conatinerDeclaration
|widgetsWithRequiredChildDeclaration
;

widgetsWithRequiredChildDeclaration:

widgetsWithRequiredChildNames

BRKT_OP

childPropertyDeclaration

BRKT_CL
;

widgetsWithRequiredChildNames:
EXPANDED
|MATERIALBUTTON
;

conatinerDeclaration:
CONTAINER
BRKT_OP
childPropertyDeclaration?
BRKT_CL
;

childPropertyDeclaration:
CHILD
COLON
widgetsDeclaration
;

variabelsDeclaration:
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








