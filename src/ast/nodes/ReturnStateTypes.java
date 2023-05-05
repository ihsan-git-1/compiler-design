package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ReturnStateTypes extends Node{
	String name;
	
	public ReturnStateTypes(String name, dart_parse.ReturnStateTypesContext ctx) {
		super(ctx);
		this.name = name;
	}

	@Override
	public String toString() {
		return "Return State Type Name "+ name + " line: "+ getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.BLOCK;
	}
}
