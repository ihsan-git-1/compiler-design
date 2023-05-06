package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class ContainerDeclaration extends WidgetAbstractChild{
	List<ContainerPropertiesDeclaration> containerDeclarationList;
	
	public ContainerDeclaration(dart_parse.ConatinerDeclarationContext ctx) {
		super(ctx);
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
		return getLineString() + "Container :" + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.CONTAINER+"\n"+
				getContainerDeclarationList()
				;
	}
}
