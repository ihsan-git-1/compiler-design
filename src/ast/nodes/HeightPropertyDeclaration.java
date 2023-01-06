package ast.nodes;

import ast.variables.NumberClass;

public class HeightPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild{
	NumberClass number ;
	
	public HeightPropertyDeclaration(NumberClass number) {
		this.number = number;
	}
	
	@Override
	public String toString() {

		return "height : "
				+number.toString()
				;
	}
}
