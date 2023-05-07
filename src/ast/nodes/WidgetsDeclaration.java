package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class WidgetsDeclaration extends Node{
	WidgetAbstractChild widgetAbstractChild;
	public WidgetsDeclaration(dart_parse.WidgetsDeclarationContext ctx, WidgetAbstractChild widgetAbstractChild) {
		super(ctx);
		this.widgetAbstractChild = widgetAbstractChild;
	}

	@Override
	public String toString() {
		return getLineString()+"Widget Declaration "+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.WIDGET+"\n"+
				widgetAbstractChild.toString();
	}
	public String generate_code(){

		StringBuilder builder= new StringBuilder();
		if (widgetAbstractChild instanceof PaddingDeclaration){
			builder.append("<div style='padding:"+((PaddingDeclaration) widgetAbstractChild).paddingPropertyDeclaration.edgeInsistAll.number.getNum()+"px;' class='row'>\n");
		}
		builder.append(widgetAbstractChild.generate_code());
		builder.append("</div>\n");
		return builder.toString();
	}
}
