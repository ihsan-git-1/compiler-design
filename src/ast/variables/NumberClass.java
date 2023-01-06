package ast.variables;

public class NumberClass extends AbstractNumberClass{
	double num;

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public NumberClass(double num) {
		this.num = num;
	}
	
	public String toString() {
		return  Double.valueOf(num).toString();
	}
}
