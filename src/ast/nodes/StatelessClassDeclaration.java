package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class StatelessClassDeclaration extends AllClassesDeclarationAbstractChild {

List<DartVariablesDeclaration> dartVariablesDeclarationList;
BuildMethodDeclaration methodDecleration;
String name;

	public StatelessClassDeclaration(String name,BuildMethodDeclaration methodDecleration,int line,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.name = name;
		this.dartVariablesDeclarationList = new ArrayList<>();
		this.methodDecleration = methodDecleration;
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
		return  "Stateless Class Declaration Name "+name + " line: "+ getLine() + " parent "+ getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+dartVariablesDeclarationList
				+"\n"
				+methodDecleration
				+"\n"
				;
	}
}
