package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	
	public ImageDeclaration(dart_parse.ImageDeclarationContext ctx, String str) {
		super(ctx);
		this.str=str;
	}
	
	@Override
	public String toString() {
		return
				getLineString()+"Image Declaration src = "+str+ " parent "+getParent()
						+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT;
	}
}
