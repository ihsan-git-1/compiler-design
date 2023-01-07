package ast.nodes;

public class PaddingPropertyDeclaration extends Node{
	EdgeInsistAll edgeInsistAll;
	
	public PaddingPropertyDeclaration(EdgeInsistAll edgeInsistAll,int line ,String parent)
	{
		super(line,parent);
		this.edgeInsistAll=edgeInsistAll;
	}

	@Override
	public String toString() {
		return "Padding property Declaration line: "+getLine() + " parent "+getParent()+"\n"
				+ edgeInsistAll
				;
	}
}
