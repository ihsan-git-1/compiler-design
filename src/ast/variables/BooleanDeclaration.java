package ast.variables;


import ast.NodeType;
import gen.dart_parse;

public class BooleanDeclaration extends Identifier implements assignment {
	String name;
	public BooleanDeclaration(dart_parse.BooleanDeclarationContext ctx, String name) {
		super(ctx);
		this.name=name;
	}

	@Override
	public String toString() {
		return getLineString()+"Boolean Declaration: " +name+ " parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.BOOLEANDECLARATION;
	}
}
