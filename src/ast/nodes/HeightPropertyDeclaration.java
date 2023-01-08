package ast.nodes;

import ast.variables.NumberClass;

public class HeightPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild{
	NumberClass number ;
	
	public HeightPropertyDeclaration(NumberClass number,int line ,String parent,String type,int childCount) {
		super(line,parent, type,childCount);
		this.number = number;
	}
	
	@Override
	public String toString() {

		return "Height Property Declaration line: "+getLine() +" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+number
				;
	}
}
