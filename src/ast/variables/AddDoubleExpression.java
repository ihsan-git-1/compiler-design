package ast.variables;


import ast.NodeType;
import gen.dart_parse;

public class AddDoubleExpression extends NumericTermAbstractChild<Double> {
    public NumberDoubleClass value;
    @Override
    public Double getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Double value) {
        super.setValue(value);
    }

    public AddDoubleExpression(dart_parse.AddDoubleExpressionContext ctx, NumberDoubleClass value) {
        super(ctx);
        this.value = value;
        setValue(value.num);
    }

    @Override
    public String toString() {
        return getLineString()+"Add Double Expression: " + value.num + " parent " + getParent() + " Child Count =  " + getChildCount() + " Type = " + NodeType.DOUBLE + "\n" + value;
    }
}
