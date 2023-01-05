package ast.nodes;

public class FunctionReturnState extends ReturnStateTypesAbstractChild {
	String name;
	
	public FunctionReturnState(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
}

