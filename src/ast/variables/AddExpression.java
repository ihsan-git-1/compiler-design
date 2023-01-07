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
		return "Add expression: " +"value: "+value.num+ " line: " + getLine() + " parent: " + getParent()+"\n" + value;
	}
}
