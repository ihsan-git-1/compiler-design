package ast.variables;

import ast.nodes.Node;

public class StringDeclaration extends Identifier implements assignment{
	String name;
	public StringDeclaration(String name , int line, String parent,String type,int childCount) {
		super(line, parent, type, childCount);
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "String Declaration: " +name+" line: "+ getLine() + " parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				;
	}
}
