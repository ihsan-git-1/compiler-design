package ast.nodes;

public class ContainerPropertiesDeclaration extends Node {
	ContainerPropertiesDeclarationAbstractChild containerPropertiesDeclarationAbstractChild;
	
	public ContainerPropertiesDeclaration(ContainerPropertiesDeclarationAbstractChild child,int line ,String parent,String type,int childCount) {
		super(line,parent, type, childCount);
		this.containerPropertiesDeclarationAbstractChild = child;
	}

	@Override
	public String toString() {
		return "Container Property Declaration line: "+getLine()+" parent "+getParent()+"\n"
				+containerPropertiesDeclarationAbstractChild.toString();
	}
}
