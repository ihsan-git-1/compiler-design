package ast.nodes;

public class BuildContextDeclaration {
	String name;
	
	public BuildContextDeclaration(String name) {
		this.name=name;
	}
	
	public String toString() {
		return "BuildContext "+name;
	}
}
