package ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class ContainerDeclaration extends WidgetAbstractChild{
	List<ContainerPropertiesDeclaration> containerDeclarationList;
	
	public ContainerDeclaration() {
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
		return "Container(\n"
				+getContainerDeclarationList()
				+"\n )"
				;
	}
}
