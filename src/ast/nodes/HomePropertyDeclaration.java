package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class HomePropertyDeclaration extends Node{
	String name;
	
	public HomePropertyDeclaration(dart_parse.HomePropertyDeclarationContext ctx, String name ) {
		super(ctx);
		this.name=name;
	}
	
	@Override
	public String toString() {
		return getLineString()+"Home Property Declaration Name  "+name + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY;
	}
}
