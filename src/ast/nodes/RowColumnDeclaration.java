package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class RowColumnDeclaration extends WidgetAbstractChild {
	String name;
	ChildrenPropertyDeclaration childrenPropertyDeclaration;

	int numOfChildren;
	
	public RowColumnDeclaration(dart_parse.RowColumnDeclarationContext ctx, String name,int numOfChildren, ChildrenPropertyDeclaration childrenPropertyDeclaration) {
		super(ctx);
		this.name = name;
		this.numOfChildren=numOfChildren;
		this.childrenPropertyDeclaration=childrenPropertyDeclaration;
	}

	public int getNumOfChildren(){
		return this.numOfChildren;
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
		int numOfChildren=0;


		if(this.name.equals("Row")){
			type="row";
			builder.append("<div class='"+type+"'>\n");
			builder.append(childrenPropertyDeclaration.generate_code());
			builder.append("</div>\n");
		}else{
			type="col-"+12/getNumOfChildren();
			builder.append("<div class='"+type+"'>\n");
			builder.append(childrenPropertyDeclaration.generate_code());
			builder.append("</div>\n");
		}

		return builder.toString();
	}
}
