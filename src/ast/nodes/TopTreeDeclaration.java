package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<AllClassesDeclarationAbstractChild> topTreeClassesChildrenList;
	List<DartDeclaration> topTreeDartVariablesChildrenList;


	public List<AllClassesDeclarationAbstractChild> getTopTreeClassesChildrenList() {

		return topTreeClassesChildrenList;
	}

	public List<DartDeclaration> getTopTreeDartVariablesChildrenList() {

		return topTreeDartVariablesChildrenList;
	}

	public void setTopTreeClassesChildrenList(List<AllClassesDeclarationAbstractChild> topTreeClassesChildrenList) {
		this.topTreeClassesChildrenList = topTreeClassesChildrenList;
	}

	public void setTopTreeDartVariablesChildrenList(List<DartDeclaration> topTreeDartVariablesChildrenList) {
		this.topTreeDartVariablesChildrenList = topTreeDartVariablesChildrenList;
	}

	public TopTreeDeclaration(int line,String parent,String type,int childCount) {
		super(line,parent,type,childCount);
		this.topTreeClassesChildrenList = new ArrayList<>();
		this.topTreeDartVariablesChildrenList = new ArrayList<>();
	}
	
	//public void addChildren(AllClassesDeclarationAbstractChild c) {
	//	topTreeClassesChildrenList.add(c);
	//}



	@Override
	public String toString() {

		return "Top Tree Declaration line: "+ getLine() +" Child Count =  "+getChildCount()+" Type = "+getType()+ "\n"+
				topTreeClassesChildrenList.toString()
						.replace(",", "")
						.replace("[", "")
						.replace("]", "")
						.trim() + " ,  "+
				topTreeDartVariablesChildrenList.toString()
					.replace(",", "")
					.replace("[", "")
					.replace("]", "")
					.trim()

				;
	}
}
