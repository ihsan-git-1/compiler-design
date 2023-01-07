package ast.nodes;

public class HomePropertyDeclaration extends Node{
	String name;
	
	public HomePropertyDeclaration(String name,int line ,String parent) {
		super(line,parent);
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "Home Property Declaration Name  "+name+ " line: "+getLine() + " parent "+ getParent();
	}
}
