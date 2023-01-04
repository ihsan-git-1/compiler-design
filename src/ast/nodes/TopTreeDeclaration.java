package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<TopTreeDeclarationAbstractChild> topTreeChildren;

	public List<TopTreeDeclarationAbstractChild> getTopTreeChildren() {
		return topTreeChildren;
	}

	public void setTopTreeChildren(List<TopTreeDeclarationAbstractChild> topTreeChildren) {
		this.topTreeChildren = topTreeChildren;
	}

	public TopTreeDeclaration() {
		this.topTreeChildren = new ArrayList<>();
	}
	//Todo : return to top class
	//TopTreeDeclarationAbstractChild
	public void addChildren(TopTreeDeclarationAbstractChild c) {
		topTreeChildren.add(c);
	}

	@Override
	public String toString() {
		return  "Page{" +
				"TopTreeDeclarationList" + topTreeChildren +
				"}";
	}
}
