package ast.variables;

import ast.nodes.Node;

public class AddDoubleExpression extends Node {
	NumberDoubleClass value;


	public AddDoubleExpression(NumberDoubleClass value, int line, String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.value = value;
	}

	@Override
	public String toString() {
		return "Add Double Expression: "+value.num +" line: " + getLine() + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ value
				;
	}
}
