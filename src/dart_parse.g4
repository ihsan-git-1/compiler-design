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
    CLASS
    NAME
    CRLY_BRKT_OP
    dartVariabelsDeclaration*
    CRLY_BRKT_CL
    ;

statelessClassDeclaration :
    CLASS
    NAME
    STATELESS
    CRLY_BRKT_OP
    dartVariabelsDeclaration*
    buildMethodDeclaration
    CRLY_BRKT_CL
    ;

statefullClassDeclaration :
    stfulFirstBody
    stfulSecondBody
    ;

stfulFirstBody:
    CLASS
    NAME
    STATEFULL
    CRLY_BRKT_OP
    dartVariabelsDeclaration*
    statefullAssignStateClassDeclaration
    CRLY_BRKT_CL
;

stfulSecondBody:
    CLASS
    NAME
    EXTENDS
    STATE
    ANGLE_BRKT_OP
    NAME
    ANGLE_BRKT_CL
    CRLY_BRKT_OP
    dartVariabelsDeclaration*
    buildMethodDeclaration
    CRLY_BRKT_CL
;

statefullAssignStateClassDeclaration:
    STATE
    ANGLE_BRKT_OP
    NAME
    ANGLE_BRKT_CL
    CREATESTATE
    BRKT_OP
    BRKT_CL
    returnStateTypes
    ;

returnStateTypes:
    returnArrowState
    |functionReturnState
    ;

functionReturnState:
    CRLY_BRKT_OP
    RETURN
    NAME
    BRKT_OP
    BRKT_CL
    SEMICOLON
    CRLY_BRKT_CL
    ;

returnArrowState:
    ASSIGN
    ANGLE_BRKT_CL
    NAME
    BRKT_OP
    BRKT_CL
    SEMICOLON
    ;

buildMethodDeclaration:
    WIDGET
    BUILD
    BRKT_OP
    buildContextDeclaration
    BRKT_CL
    CRLY_BRKT_OP
    dartVariabelsDeclaration*
    RETURN
    widgetsDeclaration+
    SEMICOLON
    CRLY_BRKT_CL
;


// top tree body declarations
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
    |dartAllListsDeclaration
    ;

// dart int, string, bool
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

// dart List<int>, List<String>, List<bool>

dartAllListsDeclaration:
dartListStringDeclaration
|dartListIntDeclaration
|dartListBoolDeclaration
;
dartListStringDeclaration :
LIST
(ANGLE_BRKT_OP
STRING
ANGLE_BRKT_CL)?
NAME
ASSIGN
SQR_BRKT_OP
(STRING_LINE
(COMMA STRING_LINE)*
)*
COMMA?
SQR_BRKT_CL
SEMICOLON
;
dartListIntDeclaration :
LIST
(ANGLE_BRKT_OP
INT
ANGLE_BRKT_CL)?
NAME
ASSIGN
SQR_BRKT_OP
(NUMBER
(COMMA NUMBER)*
)*
COMMA?
SQR_BRKT_CL
SEMICOLON
;
dartListBoolDeclaration :
LIST
(ANGLE_BRKT_OP
BOOL
ANGLE_BRKT_CL)?
NAME
ASSIGN
SQR_BRKT_OP
(booleans
(COMMA booleans)*
)*
COMMA?
SQR_BRKT_CL
SEMICOLON
;


// flutter declaration

widgetsDeclaration:
    conatinerDeclaration
    |expandedDeclaration
    |materialButtonDeclaration
    |materialAppDeclaration
;

expandedDeclaration:
    EXPANDED
    BRKT_OP
    childPropertyDeclaration
    COMMA?
    BRKT_CL
;

materialAppDeclaration:
    MATERIALAPP
    BRKT_OP
    homePropertyDeclaration
    COMMA?
    BRKT_CL
;

materialButtonDeclaration:
    MATERIALBUTTON
    BRKT_OP
    childPropertyDeclaration
    COMMA?
    BRKT_CL
;

conatinerDeclaration:
    CONTAINER
    BRKT_OP
    conatinerPropertiesDeclaration?
    (COMMA conatinerPropertiesDeclaration)*
    COMMA?
    BRKT_CL
    ;




// flutter widgets properties declaration


conatinerPropertiesDeclaration:
    heightPropertyDeclaration
    |widthPropertyDeclaration
    |childPropertyDeclaration
    ;

heightPropertyDeclaration:
    HEIGHT
    COLON
    NUMBER
    ;

widthPropertyDeclaration:
    WIDTH
    COLON
    NUMBER
    ;

homePropertyDeclaration:
    HOME
    COLON
    NAME
    BRKT_OP
    BRKT_CL
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










