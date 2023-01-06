package ast.nodes;

public class PaddingPropertyDeclaration {
	EdgeInsistAll edgeInsistAll;
	
	public PaddingPropertyDeclaration(EdgeInsistAll edgeInsistAll) {
		this.edgeInsistAll=edgeInsistAll;
	}

	@Override
	public String toString() {
		return "padding : "
				+ edgeInsistAll
				;
	}
}
