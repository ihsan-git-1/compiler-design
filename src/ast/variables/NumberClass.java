package ast.variables;

public class NumberClass extends AbstractNumberClass{
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NumberClass(int num) {
		this.num = num;
	}
	
	public String toString() {
		return  Integer.valueOf(num).toString();
	}
}
