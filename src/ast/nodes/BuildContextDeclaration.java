package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class BuildContextDeclaration extends Node{
	String name;
	
	public BuildContextDeclaration(String name,dart_parse.BuildContextDeclarationContext ctx) {
		super(ctx);
		this.name=name;
	}
	
	public String toString() {
		return getLineString()+" BuildContext Name "+name + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT;
	}
}
