package ast.nodes;

public class BuildContextDeclaration extends Node{
	String name;
	
	public BuildContextDeclaration(String name,int line ,String parent) {
		super(line,parent);
		this.name=name;
	}
	
	public String toString() {
		return "BuildContext Name "+name + " line: "+getLine() + " parent "+getParent();
	}
}
