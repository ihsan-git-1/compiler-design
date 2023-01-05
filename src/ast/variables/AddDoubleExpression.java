package ast.variables;

public class AddDoubleExpression {
	MultiplyDoubleExpression left;
	MultiplyDoubleExpression right;
	String operation;
	
	public AddDoubleExpression(MultiplyDoubleExpression left){
		this.left=left;
	}
	
	public AddDoubleExpression(MultiplyDoubleExpression left,MultiplyDoubleExpression right,String operation){
		this.left=left;
		this.right=right;
		this.operation=operation;
	}
	
	@Override
	public String toString() {
		if(operation!="") {
			return  left.toString();
		}else {
			return  left.toString() + operation + right.toString();
		}
		
	}
}
