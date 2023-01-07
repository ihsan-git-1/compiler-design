package ast.nodes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DartListStringDeclaration extends DartAllListsDeclarationAbstractChild{
	public String name;
	public List<String> itemsList = new ArrayList<>();
	
	public DartListStringDeclaration(String name,int line ,String parent) {
		super(line,parent);
		this.name = name;
	}
	
	public List<String> getListItem(){
		return itemsList;
	}
	
	public void setItemsList(List<String> list) {
		this.itemsList =  list;
	}

	public void printList(List<String> list){
		for(String item:list){
			System.out.print(item);
			System.out.print(" ");
		}
	}

	@Override
	public String toString() {
		String var = "Dart String List "+ name + " line: "+getLine() + " parent "+getParent();
		System.out.print(var);
		System.out.print(" List Items are ");
		printList(this.itemsList);
		return  "" ;
	}




}
