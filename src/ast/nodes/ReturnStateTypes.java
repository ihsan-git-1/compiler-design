package ast.nodes;

public class ReturnStateTypes {
	String name;
	
	public ReturnStateTypes(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name+"();";
	}
}
