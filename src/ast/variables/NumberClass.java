package ast.variables;

public class NumberClass extends AbstractNumberClass{
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public NumberClass(int num, int line, String parent,String type,int childCount) {
		super(line, parent, type, childCount);
		this.num = num;
	}
	
	public String toString() {
		return  "number class: value: "+ num + " line: "+getLine() + " parent: "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
	}
}
