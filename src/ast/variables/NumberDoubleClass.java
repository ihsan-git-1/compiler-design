package ast.variables;

public class NumberDoubleClass extends AbstractNumberClass{
	double num;

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

	public NumberDoubleClass(double num, int line, String parent,String type,int childCount) {
		super(line, parent, type, childCount);
		this.num = num;
	}
	
	public String toString() {
		return  "Number Double Class: "+"num= " +num + " line: "+ getLine() + " parent: "+ getParent()+
				" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
	}
}
