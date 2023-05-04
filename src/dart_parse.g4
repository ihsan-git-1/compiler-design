//reules
parser grammar dart_parse;
options {tokenVocab=dart_lexar;}

// base declarations start code
topTreeDeclaration :
    (allClassesDeclaration
    |dartDeclaration)*
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
    dartDeclaration*
    CRLY_BRKT_CL
    ;

statelessClassDeclaration :
    CLASS
    NAME
    STATELESS
    CRLY_BRKT_OP
    dartDeclaration*
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
    dartDeclaration*
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
    dartDeclaration*
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
    dartDeclaration*
    RETURN
    widgetsDeclaration
    SEMICOLON
    CRLY_BRKT_CL
    ;


// dart declarations
dartDeclaration:
    variable
    |function
    |dartAllListsDeclaration
    |navigation
    ;
// getx navigation
navigation:
GET
BRKT_OP
STRING_LINE
BRKT_CL
SEMICOLON
;
// dart int, string, bool

variable:
    (FINAL | CONST)?
    (integerDeclarationLine
    |stringDeclarationLine
    |booleanDeclarationLine
    |doubleDeclarationLine)
    SEMICOLON
    ;

integerDeclarationLine:
    INT
    (integerDeclaration | integerDeclarationAssignment)
    (COMMA (integerDeclaration | integerDeclarationAssignment))*
    ;

integerDeclaration:
    NAME
    ;

integerDeclarationAssignment:
    NAME
    ASSIGN
    addExpression
    ;

integerAssignment:
    NAME
    ASSIGN
    addExpression
    SEMICOLON
    ;

doubleDeclarationLine:
    DOUBLE
    (doubleDeclaration | doubleDeclarationAssignment)
    (COMMA (doubleDeclaration | doubleDeclarationAssignment))*
    ;

doubleDeclaration:
    NAME
    ;

doubleDeclarationAssignment:
    NAME
    ASSIGN
    addDoubleExpression
    ;

doubleAssignment:
    NAME
    ASSIGN
    addDoubleExpression
    SEMICOLON
    ;

stringDeclarationLine:
    STRING
    (stringDeclaration | stringDeclarationAssignment)
    (COMMA (stringDeclaration | stringDeclarationAssignment))*
    ;

stringDeclaration:
    NAME
    ;

stringDeclarationAssignment:
    NAME
    ASSIGN
    STRING_LINE
    ;

stringAssignment:
    NAME
    ASSIGN
    STRING_LINE
    SEMICOLON
    ;

booleanDeclarationLine:
    BOOL
    (booleanDeclaration | booleanDeclarationAssignment)
    (COMMA (booleanDeclaration | booleanDeclarationAssignment))*
    ;

booleanDeclaration:
    NAME
    ;

booleanDeclarationAssignment:
    NAME
    ASSIGN
    booleans
    ;

booleanAssignment:
    NAME
    ASSIGN
    booleans
    SEMICOLON
    ;

addExpression
    :   multiplyExpression (('+'|'-') multiplyExpression)*
    ;

multiplyExpression
    :   number (('*' | '/') number)*
    ;

addDoubleExpression
    :   multiplyDoubleExpression (('+'|'-') multiplyDoubleExpression)*
    ;

multiplyDoubleExpression
    :   (number|numberDouble) (('*' | '/') (number|numberDouble))*
    ;

booleans:
    TRUE
    |FALSE
    ;

booleanOperation:
    (number|numberDouble|NAME)
    (EQUAL | NOTEQUAL | ANGLE_BRKT_CL | ANGLE_BRKT_OP | GTE | LTE)
    (number|numberDouble|NAME)
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
    )?
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
    (number
    (COMMA number)*
    )?
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
    )?
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
    |scaffoldDeclaration
    |paddingDeclaration
    |rowColumnDeclaration
    |textDeclaration
    |imageDeclaration
;

expandedDeclaration:
    EXPANDED
    BRKT_OP
    childPropertyDeclaration
    COMMA?
    BRKT_CL
    ;
paddingDeclaration:
    PADDING
    BRKT_OP
   ((paddingPropertyDeclaration COMMA
     childPropertyDeclaration)
    |(
    childPropertyDeclaration COMMA
    paddingPropertyDeclaration
    ))
    COMMA?
    BRKT_CL
    ;

scaffoldDeclaration:
    SCAFFOLD
    BRKT_OP
    bodyPropertyDeclaration
    COMMA?
    BRKT_CL
    ;

textDeclaration:
    TEXT
    BRKT_OP
    STRING_LINE
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
    onPressedPropertyDeclaration
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
rowColumnDeclaration:
    (ROW|COLUMN)
    BRKT_OP
    childrenPropertyDeclaration
    COMMA?
    BRKT_CL
    COMMA?
    ;
imageDeclaration:
    IMAGE
    DOT
    NETWORK
    BRKT_OP
    (NAME|STRING_LINE)
    BRKT_CL
    ;



// flutter widgets properties declaration


conatinerPropertiesDeclaration:
    heightPropertyDeclaration
    |widthPropertyDeclaration
    |childPropertyDeclaration
    ;

paddingPropertyDeclaration:
    PADDINGSMALL
    COLON
    edgeInsistAll
    ;
edgeInsistAll:
    EDGEINSETS
    DOT
    ALL
    BRKT_OP
    number
    BRKT_CL
    ;

// todo add set state
onPressedPropertyDeclaration:
    ONPRESSED
    COLON
    BRKT_OP
    BRKT_CL
    CRLY_BRKT_OP
    (statement|setStatePressedDeclaration)*
    CRLY_BRKT_CL
    COMMA
    ;

setStatePressedDeclaration:
    SETSTATE
    BRKT_OP
    BRKT_OP
    BRKT_CL
    CRLY_BRKT_OP
    statement*
    CRLY_BRKT_CL
    BRKT_CL
    SEMICOLON
    ;

heightPropertyDeclaration:
    HEIGHT
    COLON
    number
    ;

widthPropertyDeclaration:
    WIDTH
    COLON
    number
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

childrenPropertyDeclaration:
    CHILDREN
    COLON
    SQR_BRKT_OP
    (widgetsDeclaration
    (COMMA widgetsDeclaration)*)?
    COMMA?
    SQR_BRKT_CL
    ;
bodyPropertyDeclaration:
    BODY
    COLON
    widgetsDeclaration
    ;

buildContextDeclaration:
    BUILDCONTEXT
    NAME
    ;
number:
NUMBER
;
numberDouble:
NUMBERDOUBLE
;



/// dart statements

ifStatement:
    IF
    BRKT_OP
    conditionExpr
    BRKT_CL
    block
    ((ELSEIF BRKT_OP conditionExpr BRKT_CL block)* (ELSE block))?
    (ELSE block)?
    ;

whileStatement:
    WHILE
    BRKT_OP
    conditionExpr
    BRKT_CL
    block
    ;


block:
    CRLY_BRKT_OP
    statement*
    CRLY_BRKT_CL
    ;

functionBody:
    CRLY_BRKT_OP
    statement*
    returnStatement
    CRLY_BRKT_CL
   ;
returnStatement:
    RETURN
    expression
    SEMICOLON;

function:
    functionType? NAME '(' parameters? ')' functionBody
    ;
functionType:
    (STRING | INT | DOUBLE| BOOL| VAR| VOID)
    ;

parameters:
    dartDeclaration (',' dartDeclaration)* COMMA?
    ;

assignment:
    integerAssignment
    |doubleAssignment
    |booleanAssignment
    |stringAssignment
    ;

statement:
    dartDeclaration
    |ifStatement
    |forStatement
    |whileStatement
    |assignment
    ;

forStatement:
    FOR
    BRKT_OP
    variable?
    conditionExpr?
    SEMICOLON
    variableAssignment?
    BRKT_CL
    block;


variableAssignment:
    integerDeclarationAssignment
    |stringDeclarationAssignment
    |booleanDeclarationAssignment
    |doubleDeclarationAssignment;

// example on a condition : ((3.3>=3) || false) && (4>=a) ==> (no errors)

conditionExpr : andExpr (OR andExpr)*;

andExpr :binaryExpr (AND binaryExpr)* ;

binaryExpr: term ((EQUAL | NOTEQUAL) term)* ;

term: numericExpr| BRKT_OP conditionExpr BRKT_CL | booleans;

numericExpr: numericTerm (LTE | GTE | EQUAL | NOTEQUAL|ANGLE_BRKT_CL|ANGLE_BRKT_OP) numericTerm;

numericTerm:addExpression|addDoubleExpression|identifier;

prefixUnaryOperator : INC | DEC | NOT;

postfixUnaryOperator: INC | DEC;

expression :  prefixUnaryOperator expression
           | expression postfixUnaryOperator
           | addExpression postfixUnaryOperator
           | functionCall
           | conditionExpr
           | numericTerm
           | '(' expression ')'
           ;

literal : INT | DOUBLE | STRING | TRUE | FALSE | NULL ;

identifier :
    integerDeclaration
    | doubleDeclaration
    | stringDeclaration
    | booleanDeclaration;

functionCall : identifier '(' arguments? ')' ;

arguments : expression (',' expression)* ;

