package ast;

public enum NodeType {

    TOPTREEDECLARATION("top tree declaration"),
    BOOLEAN("boolean"),
    BOOLEANDECLARATION("boolean declaration"),
    STATEMENT("statement"),
    MULTIPLYDOUBLEEXPRESSION("multiplication expression (type double)"),
    ADDDOUBLEEXPRESSION("addition expression (type double)"),
    ADDEXPRESSION("addition expression (type integer)"),
    MULTIPLYEXPRESSION("multiplication expression (type integer)"),
    NUMBER("value (type integer)"),
    DOUBLEDECLARATION("variable declaration (type double)"),
    INTEGERDECLARATION("variable declaration (type integer)"),
    INTEGERASSIGNMENT("variable assignment (type integer)"),
    INTEGERDECLARATIONASSIGNMENT("variable declaration assignment (type integer)"),
    DOUBLEDECLARATIONASSIGNMENT("variable declaration assignment (type double)"),
    BOOLEANDECLARATIONASSIGNMENT("variable declaration assignment (type boolean)"),
    STRINGDECLARATIONASSIGNMENT("variable declaration assignment (type string)"),
    DOUBLEASSIGNMENT("variable assignment (type double)"),
    STRINGASSIGNMENT("variable assignment (type string)"),
    BOOLEANASSIGNMENT("variable assignment (type boolean)"),
    INTEGERDECLARATIONLINE("variable declaration line (type integer)"),
    DOUBLEDECLARATIONLINE("variable declaration line (type double)"),
    BOOLEANDECLARATIONLINE("variable declaration line (type boolean)"),
    STRINGDECLARATIONLINE("variable declaration line (type string)"),
    VARIABLE("variable (generic type)"),
    Navigation("navigation (generic type)"),

    NUMBERDOUBLE("value (type double)"),
    STRINGDECLARATION("string declaration"),
    FUNCTION("function"),
    FUNCTIONBODY("function body"),
    RETURNSTATEMENT("return statement"),
    CLASS("class"),
    WIDGET("widget"),
    PROPERTY("property"),
    BOOL("bool"),
    STRING("string"),
    INT("int"),
    DOUBLE("double"),
    OBJECT("object"),
    CONDITION("condition"),
    BLOCK("block"),
    RETURN("return"),
    CONTAINER("container"),
    ROW("row"),
    COLUMN("column"),
    LIST("list");
    private final String text;

    NodeType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
