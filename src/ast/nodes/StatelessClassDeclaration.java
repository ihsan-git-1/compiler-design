package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatelessClassDeclaration extends AllClassesDeclarationAbstractChild {

List<DartDeclaration> dartDeclarationList;
BuildMethodDeclaration methodDecleration;
String name;

	public StatelessClassDeclaration(String name,BuildMethodDeclaration methodDecleration,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.name = name;
		this.dartDeclarationList = new ArrayList<>();
		this.methodDecleration = methodDecleration;
	}
	
	public void addChildren(DartDeclaration variable) {
		dartDeclarationList.add(variable);
	}
	
	public List<DartDeclaration> getDartDeclarationList() {
		return dartDeclarationList;
	}

	public void setDartDeclarationList(List<DartDeclaration> list) {
		this.dartDeclarationList = list;
	}


	@Override
	public String toString() {
		return  "Stateless Class Declaration Name "+name + " line: "+ getLine() + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ dartDeclarationList
				+"\n"
				+methodDecleration
				+"\n"
				;
	}
}
