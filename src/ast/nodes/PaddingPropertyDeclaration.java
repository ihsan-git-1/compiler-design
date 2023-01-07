package ast.nodes;

public class PaddingPropertyDeclaration extends Node{
	EdgeInsistAll edgeInsistAll;
	
	public PaddingPropertyDeclaration(EdgeInsistAll edgeInsistAll,int line ,String parent,String type,int childCount)
	{
		super(line,parent, type,childCount);
		this.edgeInsistAll=edgeInsistAll;
	}

	@Override
	public String toString() {
		return "Padding property Declaration line: "+getLine() + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				+ edgeInsistAll
				;
	}
}
