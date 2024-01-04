package ast.nodes;

import ast.AppConstant;
import ast.NodeType;
import ast.navigation.OnPressedArguments;
import gen.dart_parse;

public class ImageDeclaration extends WidgetAbstractChild {
	String str;
	int height,width;
	OnPressedArguments argumentsStruct;
	String pressedURL,pressedVariable,dataVariable,dataJson;

	public ImageDeclaration(dart_parse.ImageDeclarationContext ctx, String str,int height,int width,OnPressedArguments argumentsStruct,String pressedURL,String pressedVariable,String dataVariable,String dataJson) {
		super(ctx);
		this.str=str;
		this.height=height;
		this.width=width;
		this.argumentsStruct=argumentsStruct;
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

		try {
			if (argumentsStruct.arguments.size() >= 3) {

				if (!AppConstant.getExtraFiles().contains("<script src='Navigation.js'></script>\n")) {
					AppConstant.addExtraFile("<script src='Navigation.js'></script>\n");
				}
				navOnClick = " onclick='navigateToScreen(\"" + argumentsStruct.arguments.get(0) +"\"," + argumentsStruct.arguments.get(1) + ',' + argumentsStruct.arguments.get(2) + ")'";
				AppConstant.addNavigationScriptAfterBuild = argumentsStruct.arguments.get(0);
			}
		}catch(Exception e){}

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
