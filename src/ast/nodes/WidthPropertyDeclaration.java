package ast.nodes;

import ast.NodeType;
import ast.variables.NumberClass;
import gen.dart_parse;

public class WidthPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild {
	NumberClass number ;
	
	public WidthPropertyDeclaration(dart_parse.WidthPropertyDeclarationContext ctx, NumberClass number) {
		super(ctx);
		this.number = number;
	}

	@Override
	public String toString() {
		return getLineString()+"Width Property ," + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY+"\n"
				+number;
	}
}
