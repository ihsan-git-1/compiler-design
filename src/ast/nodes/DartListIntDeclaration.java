package ast.nodes;

import java.util.ArrayList;
import java.util.List;

import ast.variables.NumberClass;

public class DartListIntDeclaration extends DartAllListsDeclarationAbstractChild{
	String name;
	List<NumberClass> itemsList;
	
	public DartListIntDeclaration(String name,int line ,String parent) {
		super(line,parent);
		this.name = name;
	}
	
	public List<NumberClass> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<NumberClass> list) {
		this.itemsList =  list;
	}
	public void printList(List<NumberClass> list){
		for(NumberClass item:list){
			System.out.print(item.getNum());
			System.out.print(" ");
		}
	}

	@Override
	public String toString() {
		String var = "Dart Int List "+ name + "line:" +getLine()+" parent "+getParent();
		System.out.print(var);
		System.out.print(" List Items are ");
		printList(this.itemsList);
		return  "" ;
	}
}
