package ast.variables;

import ast.nodes.Node;
import ast.nodes.TermAbstractChild;

public class BooleanValueClass extends TermAbstractChild {
	public boolean value;
	
	public BooleanValueClass(boolean value, int line, String parent, String type, int childCount) {
		super(line, parent, type, childCount);
		this.value = value;
	}

	public boolean getBool(){
		return value;
	}
	
	@Override
	public String toString() {
		return "Bool " + value + " line: "+getLine()+" Parent: "+getParent()+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n";
	}
}
