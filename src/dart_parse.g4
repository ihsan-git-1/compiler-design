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










