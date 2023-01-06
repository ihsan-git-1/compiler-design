package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatelessClassDeclaration extends AllClassesDeclarationAbstractChild {

List<DartVariablesDeclaration> dartVariablesDeclarationList;
BuildMethodDeclaration methodDecleration;
String name;

	public StatelessClassDeclaration(BuildMethodDeclaration methodDecleration) {
		this.dartVariablesDeclarationList=new ArrayList<>();
		this.methodDecleration=methodDecleration;
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
