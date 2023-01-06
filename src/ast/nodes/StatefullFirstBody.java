package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatefullFirstBody {
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	StatefullAssignStateClassDeclaration dec;
	String name;
	
	public StatefullFirstBody(StatefullAssignStateClassDeclaration dec) {
		this.dec=dec;
		this.dartVariablesDeclarationList=new ArrayList<>();
	}
	
	public void addChildren(DartVariablesDeclaration variable) {
		dartVariablesDeclarationList.add(variable);
	}
	
	public List<DartVariablesDeclaration> getDartVariablesDeclarationList() {
		return dartVariablesDeclarationList;
	}

	public void setDartVariablesDeclarationList(List<DartVariablesDeclaration> list) {
		this.dartVariablesDeclarationList = list;
	}
	
	@Override
	public String toString() {
		return  name;
	}
}
