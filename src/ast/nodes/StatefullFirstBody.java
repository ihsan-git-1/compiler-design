package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullFirstBody extends Node{
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	StatefullAssignStateClassDeclaration dec;
	String name;
	
	public StatefullFirstBody(String name,StatefullAssignStateClassDeclaration dec,int line,String parent) {
		super(line,parent);
		this.name = name;
		this.dec = dec;
		this.dartVariablesDeclarationList=new ArrayList<>();
	}

	public List<DartVariablesDeclaration> getDartVariablesDeclarationList() {
		return dartVariablesDeclarationList;
	}

	@Override
	public String toString() {

		return  "\nStatefull First Body Name  " +name + " line "+getLine() + " parent "+getParent()
				+dartVariablesDeclarationList+"\n"
				+dec+"\n"
				;
	}
}
