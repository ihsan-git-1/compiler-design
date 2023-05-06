package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class StatefullSecondBody extends Node{
	List<DartDeclaration> dartDeclarationList;
	BuildMethodDeclaration methodDecleration;
	String name;
	String stateName;
	
	public StatefullSecondBody(dart_parse.StfulSecondBodyContext ctx, String name, String stateName, BuildMethodDeclaration methodDecleration) {
		super(ctx);
		this.name=name;
		this.stateName=stateName;
		this.methodDecleration=methodDecleration;
		this.dartDeclarationList =new ArrayList<>();
	}

	public List<DartDeclaration> getDartDeclarationList() {
		return dartDeclarationList;
	}

	
	@Override
	public String toString() {
		return  getLineString()+"Statefull Second Body Name "+name +" State <"+stateName+">" + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.CLASS +"\n"
				+methodDecleration +"\n"
				;
	}
}
