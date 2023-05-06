package ast.nodes;

import ast.NodeType;
import ast.variables.NumberClass;
import gen.dart_parse;

public class EdgeInsistAll extends Node{
	NumberClass number;
	
	public EdgeInsistAll(dart_parse.EdgeInsistAllContext ctx, NumberClass number) {
		super(ctx);
		this.number = number;
	}
	
	@Override
	public String toString() {

		return getLineString() + "Edge Insist All " + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.OBJECT +"\n"
				+number.toString()
				;
	}
}
