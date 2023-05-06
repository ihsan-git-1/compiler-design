package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

public class ContainerPropertiesDeclaration extends Node {
	ContainerPropertiesDeclarationAbstractChild containerPropertiesDeclarationAbstractChild;
	
	public ContainerPropertiesDeclaration(dart_parse.ConatinerPropertiesDeclarationContext ctx, ContainerPropertiesDeclarationAbstractChild child) {
		super(ctx);
		this.containerPropertiesDeclarationAbstractChild = child;
	}

	@Override
	public String toString() {
		return getLineString()+"Container Property Declaration "+" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY+"\n"
				+containerPropertiesDeclarationAbstractChild.toString();
	}
}
