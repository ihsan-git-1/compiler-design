package ast.nodes;

import gen.dart_parse;

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


	public TopTreeDeclaration(dart_parse.TopTreeDeclarationContext ctx) {
		super(ctx);
		this.topTreeClassesChildrenList = new ArrayList<>();
		this.topTreeDartVariablesChildrenList = new ArrayList<>();
	}



	@Override
	public String toString() {

		return getLineString() +"Top Tree Declaration "+" Child Count =  "+getChildCount()+" Type = "+getType()+ "\n"+
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
