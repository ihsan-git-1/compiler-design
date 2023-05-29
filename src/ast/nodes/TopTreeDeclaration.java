package ast.nodes;

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
		builder.append(
				"<!DOCTYPE html>\n<html lang=\'en\'>\n " +
				" <script>\n" +
				"function navigateToScreen(url) {\n" +
				"window.location.href\n" +
				"= \"second_page.html?image_url=\"+ encodeURIComponent(url);\n" +
				"}\n" +
				"</script>"
				+" <head>\n <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n <title>Compiler</title>\n  <meta charset=\'utf-8\'>\n  <style>\n  </style>\n </head>\n <body>\n");
		for(AllClassesDeclarationAbstractChild child : topTreeClassesChildrenList){
			builder.append(child.generate_code());
		}

		for(DartDeclaration child : topTreeDartDeclarationChildrenList){
			builder.append(child.generate_code());
		}
		builder.append("</body>\n<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n</html>");

		return builder.toString();

	}
}
