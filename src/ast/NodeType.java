package ast;

public enum NodeType {

    TOPTREEDECLARATION("toptreedeclaration"),
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
    COLUMN("column");
    private final String text;

    NodeType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
