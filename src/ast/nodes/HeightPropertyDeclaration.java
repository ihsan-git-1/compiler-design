package ast.nodes;

import ast.NodeType;
import ast.variables.NumberClass;
import gen.dart_parse;

public class HeightPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild{
	NumberClass number ;
	
	public HeightPropertyDeclaration(dart_parse.HeightPropertyDeclarationContext ctx, NumberClass number) {
		super(ctx);
		this.number = number;
	}
	
	@Override
	public String toString() {

		return getLineString()+"Height Property Declaration "+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY+"\n"
				+number
				;
	}
}
