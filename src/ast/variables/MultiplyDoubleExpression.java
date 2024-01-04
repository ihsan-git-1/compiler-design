package ast.variables;

import ast.NodeType;
import ast.nodes.Node;
import gen.dart_parse;

public class MultiplyDoubleExpression extends Node {
	NumberDoubleClass value;

	public NumberDoubleClass getValue() {
		return value;
	}

	public void setValue(NumberDoubleClass value) {
		this.value = value;
	}

	public MultiplyDoubleExpression(dart_parse.MultiplyDoubleExpressionContext ctx, NumberDoubleClass value) {
		super(ctx);
		this.value = value;
	}

	@Override
	public String toString() {
		return getLineString()+"Multiply Double Expression: "+value + "parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.MULTIPLYDOUBLEEXPRESSION+"\n";
	}
}
