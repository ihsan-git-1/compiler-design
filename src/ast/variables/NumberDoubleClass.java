package ast.variables;

import ast.NodeType;
import gen.dart_parse;

public class NumberDoubleClass extends AbstractNumberClass{
	double num;

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public NumberDoubleClass(dart_parse.MultiplyDoubleExpressionContext ctx, double num) {
		super(ctx);
		this.num = num;
	}
	public NumberDoubleClass(dart_parse.AddDoubleExpressionContext ctx, double num) {
		super(ctx);
		this.num = num;
	}
	public NumberDoubleClass(dart_parse.NumberDoubleContext ctx, double num) {
		super(ctx);
		this.num = num;
	}
	
	public String toString() {
		return  getLineString()+"Number Double Class: "+"num= " +num + " parent: "+ getParent()+
				" Child Count =  "+getChildCount()+" Type = "+ NodeType.NUMBERDOUBLE+"\n";
	}
}
