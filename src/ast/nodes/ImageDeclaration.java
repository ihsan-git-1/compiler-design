package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	int height,width;
	String navigation, pressedURL,pressedVariable,dataVariable;

	public ImageDeclaration(dart_parse.ImageDeclarationContext ctx, String str,int height,int width,String navigation,String pressedURL,String pressedVariable,String dataVariable) {
		super(ctx);
		this.str=str;
		this.height=height;
		this.width=width;
		this.navigation=navigation;
		this.pressedURL =pressedURL;
		this.pressedVariable=pressedVariable;
		this.dataVariable=dataVariable;

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

	public String getSetStateURL(){
		return this.pressedURL;
	}

	public String getSetStateVariable(){
		return this.pressedVariable;
	}

	public String getDataVariable(){return this.dataVariable;}
	@Override
	public String toString() {
		return
				getLineString()+"Image Declaration src = "+str+ " parent "+getParent()
						+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT;
	}
}
