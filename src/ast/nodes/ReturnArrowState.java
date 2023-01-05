package ast.nodes;

public class ReturnArrowState extends ReturnStateTypesAbstractChild {
	String name;
	
	public ReturnArrowState(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name;
	}
}
