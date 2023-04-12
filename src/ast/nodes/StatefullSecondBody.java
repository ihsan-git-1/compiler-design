package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullSecondBody extends Node{
	List<DartDeclaration> dartDeclarationList;
	BuildMethodDeclaration methodDecleration;
	String name;
	String stateName;
	
	public StatefullSecondBody(String name,String stateName,BuildMethodDeclaration methodDecleration,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
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
		return  "Statefull Second Body Name "+name +" State <"+stateName+">"+ " line: "+getLine() + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+methodDecleration +"\n"
				;
	}
}
