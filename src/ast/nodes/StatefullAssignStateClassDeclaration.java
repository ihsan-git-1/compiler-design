package ast.nodes;

public class StatefullAssignStateClassDeclaration {
	String name;
	ReturnStateTypes types;
	
	public StatefullAssignStateClassDeclaration(ReturnStateTypes types,String name) {
		this.types = types;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
