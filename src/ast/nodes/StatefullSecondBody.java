package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullSecondBody {
	List<DartVariablesDeclaration> children;
	BuildMethodDeclaration methodDecleration;
	String name;
	
	public StatefullSecondBody(BuildMethodDeclaration methodDecleration) {
		this.methodDecleration=methodDecleration;
		this.children=new ArrayList<>();
	}
	
	public void addChildren(DartVariablesDeclaration variable) {
		children.add(variable);
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
