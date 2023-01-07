package ast.nodes;

public class ContainerPropertiesDeclaration extends Node {
	ContainerPropertiesDeclarationAbstractChild containerPropertiesDeclarationAbstractChild;
	
	public ContainerPropertiesDeclaration(ContainerPropertiesDeclarationAbstractChild child,int line ,String parent) {
		super(line,parent);
		this.containerPropertiesDeclarationAbstractChild = child;
	}

	@Override
	public String toString() {
		return "Container Property Declaration line: "+getLine()+" parent "+getParent()
				+containerPropertiesDeclarationAbstractChild.toString();
	}
}
