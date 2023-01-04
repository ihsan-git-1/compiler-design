package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullFirstBody {
	List<DartVariablesDeclaration> children;
	StatefullAssignStateClassDeclaration dec;
	String name;
	
	public StatefullFirstBody(StatefullAssignStateClassDeclaration dec) {
		this.dec=dec;
		this.children=new ArrayList<>();
	}
	
	public void addChildren(DartVariablesDeclaration variable) {
		children.add(variable);
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
