package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ScaffoldDeclaration extends WidgetAbstractChild {
	BodyPropertyDeclaration bodyPropertyDeclaration;
	
	public ScaffoldDeclaration(dart_parse.ScaffoldDeclarationContext ctx, BodyPropertyDeclaration bodyPropertyDeclaration) {
		super(ctx);
		this.bodyPropertyDeclaration = bodyPropertyDeclaration;
	}

	@Override
	public String toString() {
		return getLineString()+"Scaffold Declaration "+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT+"\n"
				+bodyPropertyDeclaration
				;
	}

	@Override
	public String generate_code(){
		StringBuilder builder = new StringBuilder();
		builder.append("<div class='container'>\n");
		builder.append(bodyPropertyDeclaration.generate_code());
		builder.append("</div>\n");
		return builder.toString();

	}
}
