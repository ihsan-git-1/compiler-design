package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class MaterialButtonDeclaration extends WidgetAbstractChild {

	OnPressedPropertyDeclaration onPressedPropertyDeclaration;
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public MaterialButtonDeclaration(dart_parse.MaterialButtonDeclarationContext ctx, OnPressedPropertyDeclaration onPressedPropertyDeclaration, ChildPropertyDeclaration childPropertyDeclaration) {
		super(ctx);
		this.onPressedPropertyDeclaration = onPressedPropertyDeclaration;
		this.childPropertyDeclaration = childPropertyDeclaration;
	}

	@Override
	public String toString() {
		return getLineString()+"MaterialButton " + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT +"\n"
				+childPropertyDeclaration
				+onPressedPropertyDeclaration
				;
	}
}
