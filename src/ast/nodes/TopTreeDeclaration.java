package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<AllClassesDeclaration> children;
	
	public TopTreeDeclaration() {
		this.children = new ArrayList<>();
	}
	
	public void addChildren(AllClassesDeclaration c) {
		children.add(c);
	}
}
