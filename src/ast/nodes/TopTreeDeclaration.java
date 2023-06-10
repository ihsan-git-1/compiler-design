package ast.nodes;
import ast.AppConstant;
import gen.dart_parse;
import java.util.ArrayList;
import java.util.List;

public class TopTreeDeclaration extends Node{
	List<AllClassesDeclarationAbstractChild> topTreeClassesChildrenList;
	List<DartDeclaration> topTreeDartDeclarationChildrenList;


	public List<AllClassesDeclarationAbstractChild> getTopTreeClassesChildrenList() {

		return topTreeClassesChildrenList;
	}

	public List<DartDeclaration> getTopTreeDartDeclarationChildrenList() {

		return topTreeDartDeclarationChildrenList;
	}


	public TopTreeDeclaration(dart_parse.TopTreeDeclarationContext ctx) {
		super(ctx);
		this.topTreeClassesChildrenList = new ArrayList<>();
		this.topTreeDartDeclarationChildrenList = new ArrayList<>();
	}



	@Override
	public String toString() {

		return getLineString() +"Top Tree Declaration "+" Child Count =  "+getChildCount()+" Type = "+"Top Tree"+ "\n"+
				topTreeClassesChildrenList.toString()
						.replace(",", "")
						.replace("[", "")
						.replace("]", "")
						.trim() + " ,  "+
				topTreeDartDeclarationChildrenList.toString()
					.replace(",", "")
					.replace("[", "")
					.replace("]", "")
					.trim()

				;
	}

	@Override
	public String generate_code() {
		StringBuilder builder = new StringBuilder();

		builder.append(AppConstant.getHtmlHeader());

		for(AllClassesDeclarationAbstractChild child : topTreeClassesChildrenList){
			builder.append(child.generate_code());
		}

		for(DartDeclaration child : topTreeDartDeclarationChildrenList){
			builder.append(child.generate_code());
		}

		builder.append(AppConstant.getHtmlFooter());

		builder.append(AppConstant.getExtraFiles());

		AppConstant.emptyExtraFiles();
		builder.append("</html>\n");

		return builder.toString();

	}


}
