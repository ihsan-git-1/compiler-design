package CodeGeneration;

import org.antlr.v4.runtime.ParserRuleContext;

public class CodeGeneration {

    public String generateTopTreeDeclaration(ParserRuleContext ctx){
        StringBuilder html = new StringBuilder();

        html.append("<!doctype html>");
        html.append("<html lang='en'>");
        html.append("<head>");
        html.append("<meta charset='utf-8'>");
        html.append("<meta name='viewport' content='width=device-width, initial-scale=1'>");
        html.append("<title>Flutter Test</title>");
        html.append("</head>");
        html.append("<body>");

        html.append("</body>");
        html.append("</html>");

        return html.toString();

    }

}
