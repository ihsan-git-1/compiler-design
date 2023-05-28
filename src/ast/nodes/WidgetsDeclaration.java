package ast.nodes;

import ast.NodeType;
import gen.dart_parse;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.dart_parseBaseVisitorChild;

import static visitors.dart_parseBaseVisitorChild.getChildFromParent;

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
			builder.append("<div style='padding:"+((PaddingDeclaration) widgetAbstractChild).paddingPropertyDeclaration.edgeInsistAll.number.getNum()+"px;' >\n");
			builder.append(widgetAbstractChild.generate_code());
			builder.append("</div>\n");
		}
		if(widgetAbstractChild instanceof RowColumnDeclaration
			|| widgetAbstractChild instanceof ExpandedDeclaration
				|| widgetAbstractChild instanceof ScaffoldDeclaration
					|| widgetAbstractChild instanceof ContainerDeclaration
						|| widgetAbstractChild instanceof MaterialButtonDeclaration
		){
			builder.append(widgetAbstractChild.generate_code());
		}

		if(widgetAbstractChild instanceof TextDeclaration){
			builder.append("<p >"+((TextDeclaration) widgetAbstractChild).getStrLine() +"</p>\n");
		}

		if(widgetAbstractChild instanceof ImageDeclaration) {
			String height,width;
			if(((ImageDeclaration) widgetAbstractChild).getHeight()==0){
				height="auto";
			}else{
				height=Integer.toString(((ImageDeclaration) widgetAbstractChild).getHeight());
			}

			if(((ImageDeclaration) widgetAbstractChild).getWidth()==0){
				width="auto";
			}else{
				width=Integer.toString(((ImageDeclaration) widgetAbstractChild).getWidth());
			}
			builder.append("<img height ="+height +" width ="+width+" src="+((ImageDeclaration) widgetAbstractChild).getStr()+" >\n");
		}

		return builder.toString();
	}
}
