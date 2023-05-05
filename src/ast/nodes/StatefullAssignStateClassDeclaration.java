package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class StatefullAssignStateClassDeclaration extends Node{
	String name;
	ReturnStateTypes types;
	
	public StatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx, String name, ReturnStateTypes types) {
		super(ctx);
		this.types = types;
		this.name = name;
	}
	
	@Override
	public String toString() {

		return  getLineString()+"StatefullAssignStateClassDeclaration Name " +name  + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.CLASS+"\n"
				+types
				;
	}
}
