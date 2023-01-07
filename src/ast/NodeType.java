package ast;

public enum NodeType {

    TOPTREEDECLARATION("toptreedeclaration"),
    BOOLEAN("boolean"),
    BOOLEANDECLARATION("boolean declaration"),
    STATEMENTDECLARATION("statement declaration"),
    MULTIPLYDOUBLEEXPRESSION("multiplication expression (type double)"),
    ADDDOUBLEEXPRESSION("addition expression (type double)"),
    ADDEXPRESSION("addition expression (type integer)"),
    MULTIPLYEXPRESSION("multiplication expression (type integer)"),
    NUMBER("value (type integer)"),
    DOUBLEDECLARATION("variable declaration (type double)"),
    INTEGERDECLARATION("variable declaration (type integer)"),
    VARIABLE("variable (generic type)"),
    NUMBERDOUBLE("value (type double)"),
    STRINGDECLARATION("string declaration"),
    FUNCTION("function"),
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
