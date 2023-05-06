package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class DartAllListsDeclaration extends DartDeclarationAbstractChild {

	DartAllListsDeclarationAbstractChild dartAllListsDeclarationAbstractChild;
	
	public DartAllListsDeclaration(dart_parse.DartAllListsDeclarationContext ctx,DartAllListsDeclarationAbstractChild child) {
		super(ctx);
		this.dartAllListsDeclarationAbstractChild=child;
	}

	@Override
	public String toString() {
		return getLineString()+"DartAllListsDeclaration: " + dartAllListsDeclarationAbstractChild +
				", col: " + col +
				", type: " + NodeType.LIST + '\'' +
				", childCount:" + childCount +
				", parent: " + parent + '\n';
	}
}
