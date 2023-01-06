package ast.variables;

public class NumberDoubleClass extends AbstractNumberClass{
	double num;

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public NumberDoubleClass(double num) {
		this.num = num;
	}
	
	public String toString() {
		return  Double.valueOf(num).toString();
	}
}
