package ast.variables;

import ast.nodes.Node;

public class MultiplyDoubleExpression extends Node {
	NumberDoubleClass value;

	public NumberDoubleClass getValue() {
		return value;
	}

	public void setValue(NumberDoubleClass value) {
		this.value = value;
	}

	public MultiplyDoubleExpression(NumberDoubleClass value, int line, String parent) {
		super(line, parent);
		this.value = value;
	}

	@Override
	public String toString() {
		return "Multiply Double Expression: "+value +" line: " + getLine() + "parent "+ getParent()+"\n";
	}
}
