package ast.variables;

import ast.nodes.Node;
import org.antlr.v4.runtime.ParserRuleContext;

public abstract class NumericTermAbstractChild<T> extends Node {
    protected T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NumericTermAbstractChild(ParserRuleContext parserRuleContext) {
        super(parserRuleContext);
    }
}
