//reules
parser grammar dart_parse;
options { tokenVocab=dart_lexar; }

// base declarations start code
topTreeDeclaration :
    allClassesDeclaration*
    ;

allClassesDeclaration:
    classDeclaration
    |statefullClassDeclaration
    |statelessClassDeclaration
    ;

classDeclaration :
    CLASS NAME
    CRLY_BRKT_OP
    declaration*
    CRLY_BRKT_CL
    ;

statefullClassDeclaration :
    CLASS NAME
    STATEFULL
    CRLY_BRKT_OP
    declaration*
    CRLY_BRKT_CL
    ;

statelessClassDeclaration :
    CLASS NAME
    STATELESS
    CRLY_BRKT_OP
    declaration*
    CRLY_BRKT_CL
;

declaration:
dartVariabelsDeclaration
|widgetsDeclaration
|flutterVariabelsDeclaration
;

// dart declarations
dartVariabelsDeclaration:
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


// flutter declaration

widgetsDeclaration:
conatinerDeclaration
|expandedDeclaration
|materialButtonDeclaration
;

expandedDeclaration:
EXPANDED
BRKT_OP
childPropertyDeclaration
BRKT_CL
;

materialButtonDeclaration:
MATERIALBUTTON
BRKT_OP
childPropertyDeclaration
BRKT_CL
;

conatinerDeclaration:
CONTAINER
BRKT_OP
conatinerPropertiesDeclaration*
BRKT_CL
;

conatinerPropertiesDeclaration:
heightPropertyDeclaration
|widthPropertyDeclaration
|childPropertyDeclaration
;

heightPropertyDeclaration:
HEIGHT
COLON
NUMBER
COMMA
;

widthPropertyDeclaration:
WIDTH
COLON
NUMBER
COMMA
;

childPropertyDeclaration:
CHILD
COLON
widgetsDeclaration
;

flutterVariabelsDeclaration:
buildContextDeclaration
;

buildContextDeclaration:
BUILDCONTEXT
NAME
;










