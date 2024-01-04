package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class TextDeclaration extends WidgetAbstractChild {
	String strline,htmltextData;
	
	public TextDeclaration(dart_parse.TextDeclarationContext ctx, String strline,String textData) {
		super(ctx);
		this.strline=strline;
		this.htmltextData=textData;
	}


	@Override
	public String toString() {
		return getLineString()+"Text Declaration text = "+strline.toString()+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT+"\n";
	}

	@Override
	public String generate_code() {
		if(!htmltextData.isEmpty()){
			htmltextData = " data-"+htmltextData+"='"+htmltextData+"'";
		}
		return "<p "+htmltextData+">"+ strline +"</p>\n";
	}
}
