package ast.variables;

import ast.nodes.Node;

public class BooleanValueClass extends Node {
	boolean value;
	
	public BooleanValueClass(boolean value, int line, String parent) {
		super(line, parent);
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Bool " + value + " line: "+getLine()+" parent: "+getParent();
	}
}
