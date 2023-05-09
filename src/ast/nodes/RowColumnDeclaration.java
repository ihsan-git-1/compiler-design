package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class RowColumnDeclaration extends WidgetAbstractChild {
	String name;
	ChildrenPropertyDeclaration childrenPropertyDeclaration;
	
	public RowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx, String name, ChildrenPropertyDeclaration childrenPropertyDeclaration) {
		super(ctx);
		this.name = name;
		this.childrenPropertyDeclaration=childrenPropertyDeclaration;
	}

	@Override
	public String toString() {

		return getLineString()+"Row Column Declaration Name " +name+ " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.WIDGET +"\n"
				+childrenPropertyDeclaration;
	}

	@Override
	public String generate_code() {

		StringBuilder builder= new StringBuilder();
		String type="";
		if (this.name.equals("Column")) {
			type="col";
		}else if(this.name.equals("Row")){
			type="row";
		}

		builder.append("<div class='"+type+"'>\n");
		builder.append(childrenPropertyDeclaration.generate_code());
		builder.append("</div>\n");
		return builder.toString();
	}
}
