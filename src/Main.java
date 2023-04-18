import ast.Scope;
import ast.SymbolTableObject;
import ast.nodes.*;
import gen.*;
import java.io.IOException;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodesVisitor;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "src/tests/test2.txt";
        CharStream cs = fromFileName(source);
        dart_lexar lexer = new dart_lexar(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        dart_parse parser = new dart_parse(token);
        ParseTree tree = parser.topTreeDeclaration();
        TopTreeDeclaration doc = (TopTreeDeclaration) new NodesVisitor().visit(tree);

        if(dart_parseBaseVisitorChild.semanticErrors.size()>0) {
            for (String error : dart_parseBaseVisitorChild.semanticErrors) {
                System.err.println(error);
            }
            return ;
        }
        System.out.println("\n*********** AST ************\n");
        System.out.println(doc);
        System.out.println("\n*********** SYMBOL TABLE ************\n");
        for (Scope s: dart_parseBaseVisitorChild.scopes ){
            System.out.println(" { Scope Name : "+s.getScopeName()+"  ");

            for (Map.Entry<String, SymbolTableObject> mapElement : s.getSymbolMap().entrySet()) {
                System.out.println("Identifier " + mapElement.getKey() + ", Type " + mapElement.getValue().type +
                        ", Value " + mapElement.getValue().value);
            }

            if (s.getParent()!=null)
                System.out.println("\n the parent is  "+s.getParent().getScopeName()+" } \n");
            else
                System.out.println("\n not found parent  } \n");

        }
    }

}