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

	@Override
	public String toString() {
		return
				getLineString()+"Image Declaration src = "+str+ " parent "+getParent()
						+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT;
	}

	@Override
	public String generate_code() {
		String htmlHeight,htmlWidth;


		if(height == 0){
			htmlHeight="auto";
		}else{
			htmlHeight = Integer.toString(height);
		}

		if(width==0){
			htmlWidth="auto";
		}
		else{
			htmlWidth = Integer.toString(width);
		}


		String navOnClick="",setState = "",htmlDataVariable="";


		if(!navigation.isEmpty()){
			navOnClick = " onclick=navigateToScreen("+ navigation +")";
		}
		if(!pressedURL.isEmpty()){
			setState = " onclick=setState("+pressedURL+",'"+pressedVariable+"')";
		}
		if(!dataVariable.isEmpty()){
			htmlDataVariable = " data-variable='"+dataVariable+"'";
		}


		return "<img height ="+htmlHeight
				+" width ="+htmlWidth
				+" src="+str
				+ navOnClick
				+ setState
				+ htmlDataVariable
				+">\n" ;
	}
}
