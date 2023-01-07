package ast.nodes;

import ast.variables.NumberClass;

public class WidthPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild {
	NumberClass number ;
	
	public WidthPropertyDeclaration(NumberClass number,int line ,String parent,String type , int childCount) {
		super(line,parent,type,childCount);
		this.number = number;
	}

	@Override
	public String toString() {
		return "Width Property width = "+number.toString()+" Declaration line: "+getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
	}
}
