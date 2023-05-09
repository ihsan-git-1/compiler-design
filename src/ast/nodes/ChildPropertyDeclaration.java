package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ChildPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild{
	WidgetsDeclaration widgetsDeclaration;
	
	public ChildPropertyDeclaration(dart_parse.ChildPropertyDeclarationContext ctx, WidgetsDeclaration widgetsDeclaration) {
		super(ctx);
		this.widgetsDeclaration=widgetsDeclaration;
	}

	@Override
	public String toString() {
		return getLineString()+"Child Property Declaration "+" parent " +getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY+"\n"
				+widgetsDeclaration;
	}

	@Override
	public String generate_code() {
		return widgetsDeclaration.generate_code();
	}
}
