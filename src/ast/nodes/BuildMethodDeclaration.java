package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class BuildMethodDeclaration extends Node{
	BuildContextDeclaration context;
	List<DartDeclaration> dartDeclaration;
	WidgetsDeclaration widgets;
	
	public BuildMethodDeclaration(WidgetsDeclaration widgets, BuildContextDeclaration context, dart_parse.BuildMethodDeclarationContext ctx) {
		super(ctx);
		dartDeclaration = new ArrayList<>();
		this.widgets = widgets;
		this.context = context;
	}

	public List<DartDeclaration> getDartDeclarations() {
		return dartDeclaration;
	}


	@Override
	public String toString() {
		return getLineString()+"Build Method Declaration " + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.FUNCTION+"\n"
				+context
				+ dartDeclaration +"\n"
				+widgets+"\n"

				;
	}
}
