package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<AllClassesDeclarationAbstractChild> topTreeChildrenList;

	public List<AllClassesDeclarationAbstractChild> getTopTreeChildrenList() {
		return topTreeChildrenList;
	}

	public void setTopTreeChildrenList(List<AllClassesDeclarationAbstractChild> topTreeChildrenList) {
		this.topTreeChildrenList = topTreeChildrenList;
	}

	public TopTreeDeclaration() {
		this.topTreeChildrenList = new ArrayList<>();
	}
	
	public void addChildren(AllClassesDeclarationAbstractChild c) {
		topTreeChildrenList.add(c);
	}

	@Override
	public String toString() {
		return "Top Tree Declaration{"+
				topTreeChildrenList+
				"}";
	}
}
