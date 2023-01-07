package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class ContainerDeclaration extends WidgetAbstractChild{
	List<ContainerPropertiesDeclaration> containerDeclarationList;
	
	public ContainerDeclaration(int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.containerDeclarationList = new ArrayList<>();
	}

	public List<ContainerPropertiesDeclaration> getContainerDeclarationList() {
		return containerDeclarationList;
	}

	public void setContainerDeclarationList(List<ContainerPropertiesDeclaration> containerDeclarationList) {
		this.containerDeclarationList = containerDeclarationList;
	}

	@Override
	public String toString() {
		return "Container line:"+getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"+
				getContainerDeclarationList()
				;
	}
}
