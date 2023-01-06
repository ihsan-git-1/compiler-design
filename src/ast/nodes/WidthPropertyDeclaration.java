package ast.nodes;

import ast.variables.NumberClass;

public class WidthPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild {
	NumberClass number ;
	
	public WidthPropertyDeclaration(NumberClass number) {
		this.number = number;
	}
	
	@Override
	public String toString() {

		return "width : "
				+number.toString();
	}
}
