package ast.variables;

public class NumberClass extends AbstractNumberClass{
	int num;
	
	public NumberClass(int num) {
		this.num = num;
	}
	
	public String toString() {
		return  Integer.valueOf(num).toString();
	}
}
