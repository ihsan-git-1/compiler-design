package ast.variables;

import ast.NodeType;
import ast.nodes.Node;
import gen.dart_parse;

public class MultiplyExpression extends Node {
    NumberClass value;

    public NumberClass getValue() {
        return value;
    }

    public void setValue(NumberClass value) {
        this.value = value;
    }

    public MultiplyExpression(dart_parse.MultiplyExpressionContext ctx, NumberClass value) {
        super(ctx);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Multiply Expression: "+value +" line: " + getLine() + "parent "+ getParent()
                +" Child Count =  "+getChildCount()+" Type = "+ NodeType.MULTIPLYEXPRESSION+"\n"
                ;
    }
}
