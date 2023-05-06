package ast.variables;

import ast.NodeType;
import gen.dart_parse;

public class AddExpression extends NumericTermAbstractChild<Double> {
	public NumberClass value;
	public Double getValue() {
		return super.getValue();
	}

	public void setValue(Double value) {
		super.setValue(value);
	}

	public AddExpression(dart_parse.AddExpressionContext ctx, NumberClass value) {
		super(ctx);
		this.value = value;
		setValue((double) value.num);
	}

	@Override
	public String toString() {
		return getLineString()+"Add expression: " +"value: "+value.num + " parent: " + getParent()+
				" Child Count =  "+getChildCount()+" Type = "+ NodeType.INT +"\n"
				+ value;
	}
}
