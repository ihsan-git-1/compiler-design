package ast.nodes;

import ast.AppConstant;
import ast.NodeType;
import gen.dart_parse;

import javax.json.Json;
import javax.json.JsonObject;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	int height,width;
	String navigation, pressedURL,pressedVariable,dataVariable,dataJson;

	public ImageDeclaration(dart_parse.ImageDeclarationContext ctx, String str,int height,int width,String navigation,String pressedURL,String pressedVariable,String dataVariable,String dataJson) {
		super(ctx);
		this.str=str;
		this.height=height;
		this.width=width;
		this.navigation=navigation;
		this.pressedURL =pressedURL;
		this.pressedVariable=pressedVariable;
		this.dataVariable=dataVariable;
		this.dataJson=dataJson;

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


		String navOnClick="",setState = "",htmlDataVariable="",htmlTextDataVariable="";


		if(!navigation.isEmpty()){
			if(!AppConstant.getExtraFiles().contains("<script src='Navigation.js'></script>\n")){
				AppConstant.addExtraFile("<script src='Navigation.js'></script>\n");
			}

			navOnClick = " onclick=navigateToScreen("+ navigation +")";
		}
		if(!pressedURL.isEmpty()){
			if(!AppConstant.getExtraFiles().contains("<script src='State.js'></script>\n")) {
				AppConstant.addExtraFile("<script src='State.js'></script>\n");
			}
			setState = " onclick=setState("+pressedURL+",'"+pressedVariable+"')";
		}


		if(!dataVariable.isEmpty()){
			htmlDataVariable = " data-variable='"+dataVariable+"'";
		}

		if(!dataJson.isEmpty()){
			dataJson = " data-json='"+dataJson+"'";
		}



		return "<img height ="+htmlHeight
				+" width ="+htmlWidth
				+" src="+str
				+ navOnClick
				+ setState
				+ htmlDataVariable
				+ dataJson
				+">\n" ;
	}
}
