package ast.nodes;

import java.util.List;
import java.util.ArrayList;

public class ClassDeclaration extends AllClassesDeclarationAbstractChild {
	List<DartVariablesDeclaration> children;
	String name;

	public ClassDeclaration() {
		this.children = new ArrayList<>();
	}

	public void addChildren(DartVariablesDeclaration variable) {
		children.add(variable);
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
