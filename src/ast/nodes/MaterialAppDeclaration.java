package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class MaterialAppDeclaration extends WidgetAbstractChild {
	HomePropertyDeclaration homePropertyDeclaration;
	
	public MaterialAppDeclaration(dart_parse.MaterialAppDeclarationContext ctx, HomePropertyDeclaration homePropertyDeclaration) {
		super(ctx);
		this.homePropertyDeclaration=homePropertyDeclaration;
	}

	@Override
	public String toString() {
		return getLineString()+"Material App Declaration "+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT+"\n"
				+homePropertyDeclaration
				;
	}
}
