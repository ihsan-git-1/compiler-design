package ast.variables;

import ast.nodes.Node;

public class MultiplyExpression extends Node {
    NumberClass value;

    public NumberClass getValue() {
        return value;
    }

    public void setValue(NumberClass value) {
        this.value = value;
    }

    public MultiplyExpression(NumberClass value, int line, String parent) {
        super(line, parent);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Multiply Expression: "+value +" line: " + getLine() + "parent "+ getParent()+"\n"
                ;
    }
}
