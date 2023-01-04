package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<ClassDeclaration> topTreeChildren;

	public List<ClassDeclaration> getTopTreeChildren() {
		return topTreeChildren;
	}

	public void setTopTreeChildren(List<ClassDeclaration> topTreeChildren) {
		this.topTreeChildren = topTreeChildren;
	}

	public TopTreeDeclaration() {
		this.topTreeChildren = new ArrayList<>();
	}
	//Todo : return to top class
	//TopTreeDeclarationAbstractChild
	public void addChildren(ClassDeclaration c) {
		topTreeChildren.add(c);
	}

	@Override
	public String toString() {
		return  "Page{" +
				"TopTreeDeclarationList" + topTreeChildren +
				"}";
	}
}
