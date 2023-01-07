package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullSecondBody extends Node{
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	BuildMethodDeclaration methodDecleration;
	String name;
	String stateName;
	
	public StatefullSecondBody(String name,String stateName,BuildMethodDeclaration methodDecleration,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
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
		return  "Statefull Second Body Name "+name + " line: "+getLine() + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+stateName +"\n"
				+methodDecleration +"\n"
				;
	}
}
