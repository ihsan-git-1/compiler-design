package ast.nodes;

public class HomePropertyDeclaration {
	String name;
	
	public HomePropertyDeclaration(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "home : "+name+"(),";
	}
}
