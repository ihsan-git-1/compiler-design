package ast.variables;

import ast.NodeType;
import ast.nodes.TermAbstractChild;
import gen.dart_parse;

public class BooleanValueClass extends TermAbstractChild<Boolean> {
	public boolean value;

	public BooleanValueClass(dart_parse.BooleansContext ctx, boolean value) {
		super(ctx,value);
		this.value = value;
	}
	public BooleanValueClass(dart_parse.DartListBoolDeclarationContext ctx, boolean value) {
		super(ctx,value);
		this.value = value;
	}

	public boolean getBool(){
		return value;
	}
	
	@Override
	public String toString() {
		return getLineString()+"Bool " + value +" Parent: "+getParent()+" Child Count =  "+getChildCount()+" Type = "+ NodeType.BOOLEAN+"\n";
	}
}
