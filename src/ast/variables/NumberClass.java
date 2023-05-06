package ast.variables;

import ast.NodeType;
import gen.dart_parse;

public class NumberClass extends AbstractNumberClass{
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NumberClass(dart_parse.NumberContext ctx, int num) {
		super(ctx);
		this.num = num;
	}
	public NumberClass(dart_parse.AddExpressionContext ctx, int num) {
		super(ctx);
		this.num = num;
	}

	public NumberClass(dart_parse.MultiplyExpressionContext ctx, int num) {
		super(ctx);
		this.num = num;
	}

	public String toString() {
		return  getLineString()+"number class: value: "+ num  + " parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.NUMBER+"\n";
	}
}
