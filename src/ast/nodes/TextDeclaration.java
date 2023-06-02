package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class TextDeclaration extends WidgetAbstractChild {
	String strline;
	
	public TextDeclaration(dart_parse.TextDeclarationContext ctx, String strline) {
		super(ctx);
		this.strline=strline;
	}


	@Override
	public String toString() {
		return getLineString()+"Text Declaration text = "+strline.toString()+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT+"\n";
	}

	@Override
	public String generate_code() {
		return "<p >"+ strline +"</p>\n";
	}
}
