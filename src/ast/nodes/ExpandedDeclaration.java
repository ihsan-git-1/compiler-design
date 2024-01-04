package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ExpandedDeclaration extends WidgetAbstractChild {
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public ExpandedDeclaration(dart_parse.ExpandedDeclarationContext ctx, ChildPropertyDeclaration childPropertyDeclaration) {
		super(ctx);
		this.childPropertyDeclaration=childPropertyDeclaration;
	}

	@Override
	public String toString() {

		return getLineString()+"Expanded "+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT +"\n"
				+childPropertyDeclaration;
	}

	@Override
	public String generate_code() {
		return childPropertyDeclaration.generate_code();
	}
}
