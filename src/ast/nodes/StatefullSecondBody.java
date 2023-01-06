package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullSecondBody {
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	BuildMethodDeclaration methodDecleration;
	String name;
	
	public StatefullSecondBody(BuildMethodDeclaration methodDecleration) {
		this.methodDecleration=methodDecleration;
		this.dartVariablesDeclarationList=new ArrayList<>();
	}
	
	public void addChildren(DartVariablesDeclaration variable) {
		dartVariablesDeclarationList.add(variable);
	}
	
	public List<DartVariablesDeclaration> getDartVariablesDeclarationList() {
		return dartVariablesDeclarationList;
	}

	public void setDartVariablesDeclarationList(List<DartVariablesDeclaration> list) {
		this.dartVariablesDeclarationList = list;
	}
	
	
	@Override
	public String toString() {
		return  name;
	}
}
