package ast.nodes;

public class ContainerPropertiesDeclaration {
	ContainerPropertiesDeclarationAbstractChild containerPropertiesDeclarationAbstractChild;
	
	public ContainerPropertiesDeclaration(ContainerPropertiesDeclarationAbstractChild child) {
		this.containerPropertiesDeclarationAbstractChild = child;
	}

	@Override
	public String toString() {
		return containerPropertiesDeclarationAbstractChild.toString();
	}
}
