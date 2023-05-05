package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class StatefullFirstBody extends Node{
	List<DartDeclaration> dartDeclarationList;
	StatefullAssignStateClassDeclaration dec;
	String name;
	
	public StatefullFirstBody(dart_parse.StfulFirstBodyContext ctx, String name, StatefullAssignStateClassDeclaration dec) {
		super(ctx);
		this.name = name;
		this.dec = dec;
		this.dartDeclarationList =new ArrayList<>();
	}

	public List<DartDeclaration> getDartDeclarationList() {
		return dartDeclarationList;
	}

	@Override
	public String toString() {

		return  getLineString()+"StateFull First Body Name  " +name + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.CLASS
				+ dartDeclarationList +"\n"
				+dec+"\n"
				;
	}
}
