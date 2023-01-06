package ast.nodes;

public class StatefullAssignStateClassDeclaration {
	String name;
	ReturnStateTypes types;
	
	public StatefullAssignStateClassDeclaration(String name,ReturnStateTypes types) {
		this.types = types;
		this.name = name;
	}
	
	@Override
	public String toString() {

		return  "State<" +name +">"
				+" createState()"
				+" => "
				+types
				;
	}
}
