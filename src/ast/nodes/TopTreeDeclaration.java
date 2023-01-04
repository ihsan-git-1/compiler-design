package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<TopTreeDeclarationAbstractChild> children;
	
	public TopTreeDeclaration() {
		this.children = new ArrayList<>();
	}
	
	public void addChildren(TopTreeDeclarationAbstractChild c) {
		children.add(c);
	}
}
