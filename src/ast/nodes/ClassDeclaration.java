package ast.nodes;

import java.util.List;
import java.util.ArrayList;

public class ClassDeclaration extends AllClassesDeclarationAbstractChild {
	List<DartDeclaration> dartDeclarationList;
	String name;

	public List<DartDeclaration> getDartDeclarationList() {
		return dartDeclarationList;
	}

	public void setDartDeclarationList(List<DartDeclaration> dartDeclarationList) {
		this.dartDeclarationList = dartDeclarationList;
	}

	public ClassDeclaration(int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.dartDeclarationList =new ArrayList<>();
	}
	public  ClassDeclaration(String name,int line,String parent,String type,int childCount){
		super(line,parent, type, childCount);
		this.name = name;
		this.dartDeclarationList =new ArrayList<>();
	}
	
	public void addChildren(DartDeclaration variable) {
		dartDeclarationList.add(variable);
	}
	
	@Override
	public String toString() {
		return  "Class Declaration Name is "+name+", line: "+getLine()+", parent "+getParent()
				+", Child Count =  "+getChildCount()+", Type = "+getType()+"\n"+
				dartDeclarationList
				;
	}
}
