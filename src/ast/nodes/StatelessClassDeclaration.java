package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatelessClassDeclaration extends AllClassesDeclarationAbstractChild {

List<DartVariablesDeclaration> children;
BuildMethodDeclaration methodDecleration;
String name;

	public StatelessClassDeclaration(BuildMethodDeclaration methodDecleration) {
		this.children=new ArrayList<>();
		this.methodDecleration=methodDecleration;
	}
	
	public void addChildren(DartVariablesDeclaration variable) {
		children.add(variable);
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
