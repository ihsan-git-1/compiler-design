package ast.nodes;

import ast.variables.NumberClass;

public class EdgeInsistAll {
	NumberClass number;
	
	public EdgeInsistAll(NumberClass number) {
		this.number = number;
	}
	
	@Override
	public String toString() {

		return "EdgeInsist.all("
				+number.toString()
				+")"
				;
	}
}
