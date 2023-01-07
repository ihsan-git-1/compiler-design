package ast.variables;

import ast.nodes.Node;

public class AddDoubleExpression extends Node {
	NumberDoubleClass value;


	public AddDoubleExpression(NumberDoubleClass value, int line, String parent) {
		super(line,parent);
		this.value = value;
	}

	@Override
	public String toString() {
		return "Add Double Expression: "+value.num +" line: " + getLine() + " parent "+ getParent()+"\n" + value;
	}
}
