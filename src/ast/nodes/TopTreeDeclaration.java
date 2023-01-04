package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<TopTreeDeclarationAbstractChild> topTreeChildrenList;
	public List<TopTreeDeclarationAbstractChild> getTopTreeChildrenList() {
		return topTreeChildrenList;
	}
	public void setTopTreeChildrenList(List<TopTreeDeclarationAbstractChild> topTreeChildrenList) {
		this.topTreeChildrenList = topTreeChildrenList;
	}

	public TopTreeDeclaration() {
		this.topTreeChildrenList = new ArrayList<>();
	}
	public void addChildren(TopTreeDeclarationAbstractChild c) {
		topTreeChildrenList.add(c);
	}

	@Override
	public String toString() {
		return  "Page{" +
				"\nTopTreeDeclarationList" + topTreeChildrenList +
				"\n}";
	}
}
