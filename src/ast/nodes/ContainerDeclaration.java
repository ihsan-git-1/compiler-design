package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class ContainerDeclaration extends WidgetAbstractChild{
	List<ContainerPropertiesDeclaration> containerDeclarationList;
	
	public ContainerDeclaration() {
		this.containerDeclarationList = new ArrayList<>();
	}
	
	public void addChildren(ContainerPropertiesDeclaration propertyDeclaration) {
		containerDeclarationList.add(propertyDeclaration);
	}
	
	public List<ContainerPropertiesDeclaration> getContainerPropertiesDeclartionList() {
		return containerDeclarationList;
	}

	public void setContainerPropertiesDeclartionList(List<ContainerPropertiesDeclaration> list) {
		this.containerDeclarationList = list;
	}
	
}
