package ast.variables;

public class AddExpression extends NumericTermAbstractChild<Double> {
	public NumberClass value;
	public Double getValue() {
		return super.getValue();
	}

	public void setValue(Double value) {
		super.setValue(value);
	}

	public AddExpression(NumberClass value, int line, String parent, String type, int childCount) {
		super(line, parent, type, childCount);
		this.value = value;
		setValue((double) value.num);
	}

	@Override
	public String toString() {
		return "Add expression: " +"value: "+value.num+ " line: " + getLine() + " parent: " + getParent()+
				" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ value;
	}
}
