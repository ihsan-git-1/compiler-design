package ast.nodes;

import java.util.ArrayList;
import java.util.List;

import ast.variables.BooleanValueClass;

public class DartListBoolDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<BooleanValueClass> itemsList;
	
	public DartListBoolDeclaration(String name,int line,String parent) {
		super(line,parent);
		this.name = name;
		this.itemsList=new ArrayList<>();
	}
	
	public List<BooleanValueClass> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<BooleanValueClass> list) {
		this.itemsList =  list;
	}

	public void printList(List<BooleanValueClass> list){
		for(BooleanValueClass item:list){
			System.out.print(item);
			System.out.print(" ");
		}
	}

	@Override
	public String toString() {
		String var = "Dart Bool List "+ name + " line: "+getLine()+" parent "+getParent()+" Child Count =  "+getChildCount()+" Type = "+getType();
		System.out.print(var);
		System.out.print(" List Items are ");
		printList(this.itemsList);
		return  "" ;
	}
}
