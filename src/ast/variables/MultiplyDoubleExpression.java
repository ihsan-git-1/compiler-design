package ast.variables;

public class MultiplyDoubleExpression {
	AbstractNumberClass left;
	AbstractNumberClass right;
	String operation;
	
	public MultiplyDoubleExpression(AbstractNumberClass left){
		this.left=left;
	}
	
	public MultiplyDoubleExpression(AbstractNumberClass left,AbstractNumberClass right,String operation){
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
