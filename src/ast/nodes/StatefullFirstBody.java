package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullFirstBody extends Node{
	List<DartDeclaration> dartDeclarationList;
	StatefullAssignStateClassDeclaration dec;
	String name;
	
	public StatefullFirstBody(String name,StatefullAssignStateClassDeclaration dec,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.name = name;
		this.dec = dec;
		this.dartDeclarationList =new ArrayList<>();
	}

	public List<DartDeclaration> getDartDeclarationList() {
		return dartDeclarationList;
	}

	@Override
	public String toString() {

		return  "Statefull First Body Name  " +name + " line: "+getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()
				+ dartDeclarationList +"\n"
				+dec+"\n"
				;
	}
}
