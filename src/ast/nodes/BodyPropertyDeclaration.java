package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class BodyPropertyDeclaration extends Node{
	WidgetsDeclaration widgetsDeclaration;
	
	public BodyPropertyDeclaration(dart_parse.BodyPropertyDeclarationContext ctx, WidgetsDeclaration widgetsDeclaration) {
		super(ctx);
		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return getLineString()+"Body Property Declaration"+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY+"\n"
				+ widgetsDeclaration;
	}

	@Override
	public String generate_code() {
		return widgetsDeclaration.generate_code();
	}
}
