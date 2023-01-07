package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullSecondBody extends Node{
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	BuildMethodDeclaration methodDecleration;
	String name;
	String stateName;
	
	public StatefullSecondBody(String name,String stateName,BuildMethodDeclaration methodDecleration,int line,String parent) {
		super(line,parent);
		this.name=name;
		this.stateName=stateName;
		this.methodDecleration=methodDecleration;
		this.dartVariablesDeclarationList=new ArrayList<>();
	}

	public List<DartVariablesDeclaration> getDartVariablesDeclarationList() {
		return dartVariablesDeclarationList;
	}

	
	@Override
	public String toString() {
		return  "\nStatefull Second Body Name "+name + " line "+getLine() + " parent "+ getParent()
				+stateName +"\n"
				+methodDecleration +"\n"
				;
	}
}
