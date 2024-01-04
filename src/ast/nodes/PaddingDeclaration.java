package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class PaddingDeclaration extends WidgetAbstractChild {
	PaddingPropertyDeclaration paddingPropertyDeclaration;
	ChildPropertyDeclaration childPropertyDeclaration;
	
	public PaddingDeclaration(dart_parse.PaddingDeclarationContext ctx, PaddingPropertyDeclaration paddingProperty, ChildPropertyDeclaration childProperty) {
		super(ctx);
		this.paddingPropertyDeclaration=paddingProperty;
		this.childPropertyDeclaration=childProperty;
	}

	@Override
	public String toString() {
		return getLineString()+"Padding Declaration "+ " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT +"\n"
				+paddingPropertyDeclaration
				+childPropertyDeclaration
				;
	}

	@Override
	public String generate_code() {
		StringBuilder builder= new StringBuilder();
		builder.append("<div style='padding:"+paddingPropertyDeclaration.edgeInsistAll.number.getNum()+ "px;' >\n");
		builder.append(childPropertyDeclaration.generate_code());
		builder.append("</div>\n");
		return builder.toString();
	}
}
