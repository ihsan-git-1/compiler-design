package ast;

public enum NodeType {

    TOPTREEDECLARATION("toptreedeclaration"),
    FUNCTION("function"),
    CLASS("class"),
    WIDGET("widget"),

    BOOL("bool"),
    STRING("string"),
    INT("int"),
    DOUBLE("double");

    private final String text;

    NodeType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

}
