package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	int height,width;
	String navigation;

	public ImageDeclaration(dart_parse.ImageDeclarationContext ctx, String str,int height,int width,String navigation) {
		super(ctx);
		this.str=str;
		this.height=height;
		this.width=width;
		this.navigation=navigation;
	}

	public String getStr(){
		return this.str;
	}

	public int getHeight(){
		return this.height;
	}

	public int getWidth(){
		return this.width;
	}

	public String getNavigation(){
		return this.navigation;
	}
	@Override
	public String toString() {
		return
				getLineString()+"Image Declaration src = "+str+ " parent "+getParent()
						+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT;
	}
}
