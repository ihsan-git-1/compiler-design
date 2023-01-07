package ast.variables;

public class NumberClass extends AbstractNumberClass{
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NumberClass(int num, int line, String parent) {
		super(line, parent);
		this.num = num;
	}
	
	public String toString() {
		return  Integer.valueOf(num).toString();	//todo what should i do here
	}
}
