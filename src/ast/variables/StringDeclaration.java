package ast.variables;

import ast.NodeType;
import ast.nodes.Node;
import gen.dart_parse;

public class StringDeclaration extends Identifier implements assignment{
	String name;
	public StringDeclaration(dart_parse.StringDeclarationContext ctx, String name) {
		super(ctx);
		this.name=name;
	}
	
	@Override
	public String toString() {
		return getLineString()+"String Declaration: " +name+" parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.TOPTREEDECLARATION+"\n"
				;
	}
}
