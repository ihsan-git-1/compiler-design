package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class PaddingPropertyDeclaration extends Node{
	EdgeInsistAll edgeInsistAll;
	
	public PaddingPropertyDeclaration(dart_parse.PaddingPropertyDeclarationContext ctx, EdgeInsistAll edgeInsistAll) {
		super(ctx);
		this.edgeInsistAll=edgeInsistAll;
	}

	@Override
	public String toString() {
		return getLineString()+"Padding property Declaration " + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = " + NodeType.PROPERTY+"\n"
				+ edgeInsistAll
				;
	}
}
