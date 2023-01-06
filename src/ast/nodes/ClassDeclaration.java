package ast.nodes;

import java.util.List;
import java.util.ArrayList;

public class ClassDeclaration extends AllClassesDeclarationAbstractChild {
	List<DartVariablesDeclaration> dartVariablesDeclarationList;
	String name;

	public List<DartVariablesDeclaration> getDartVariablesDeclarationList() {
		return dartVariablesDeclarationList;
	}

	public void setDartVariablesDeclarationList(List<DartVariablesDeclaration> dartVariablesDeclarationList) {
		this.dartVariablesDeclarationList = dartVariablesDeclarationList;
	}

	public ClassDeclaration() {
		this.dartVariablesDeclarationList =new ArrayList<>();
	}
	public  ClassDeclaration(String name){
		this.name = name;
		this.dartVariablesDeclarationList =new ArrayList<>();
	}
	
	public void addChildren(DartVariablesDeclaration variable) {
		dartVariablesDeclarationList.add(variable);
	}
	
	@Override
	public String toString() {
		return  "Class "
				+name
				+dartVariablesDeclarationList
				;
	}
}
