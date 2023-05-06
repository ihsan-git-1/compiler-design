package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class DartDeclaration extends Node
		implements StatementAbstractChild {
	DartDeclarationAbstractChild dartDeclarationAbstractChild;

	public DartDeclaration(dart_parse.DartDeclarationContext ctx, DartDeclarationAbstractChild dartDeclarationAbstractChild) {
		super(ctx);
		this.dartDeclarationAbstractChild = dartDeclarationAbstractChild;
	}

	@Override
	public String toString() {
		return getLineString()+"Dart Variable Declaration: " + " parent: " + getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT +"\n"
				+ dartDeclarationAbstractChild;
	}
}
