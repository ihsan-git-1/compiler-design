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

	public ClassDeclaration(int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.dartVariablesDeclarationList =new ArrayList<>();
	}
	public  ClassDeclaration(String name,int line,String parent,String type,int childCount){
		super(line,parent, type, childCount);
		this.name = name;
		this.dartVariablesDeclarationList =new ArrayList<>();
	}
	
	public void addChildren(DartVariablesDeclaration variable) {
		dartVariablesDeclarationList.add(variable);
	}
	
	@Override
	public String toString() {
		return  "Class Declaration Name is "+name+"line: "+getLine()+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"+
				dartVariablesDeclarationList
				;
	}
}
