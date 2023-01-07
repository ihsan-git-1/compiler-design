package ast.variables;

import ast.nodes.Node;

public class BooleanValueClass extends Node {
	boolean value;
	
	public BooleanValueClass(boolean value, int line, String parent, String type, int childCount) {
		super(line, parent, type, childCount);
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "Bool " + value + " line: "+getLine()+" Parent: "+getParent()+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
	}
}
