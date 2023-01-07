package ast.variables;

import ast.nodes.Node;

public class AddExpression extends Node {
	NumberClass value;


	public AddExpression(NumberClass value, int line, String parent) {
		super(line, parent);
		this.value = value;

	}

	@Override
	public String toString() {
		return "add expression: "+ value + " line: " + getLine() + " parent: " + getParent();
	}
}
