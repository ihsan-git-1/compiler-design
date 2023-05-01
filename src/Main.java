import ast.Scope;
import ast.SymbolTableObject;
import ast.nodes.*;
import gen.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodesVisitor;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "src/tests/declarations/Integer/assign.txt";
        CharStream cs = fromFileName(source);
        dart_lexar lexer = new dart_lexar(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        dart_parse parser = new dart_parse(token);
        ParseTree tree = parser.topTreeDeclaration();
        TokenStream tokenStream = token;
        TopTreeDeclaration doc = (TopTreeDeclaration) new NodesVisitor(tokenStream).visit(tree);



        if(dart_parseBaseVisitorChild.semanticErrors.size()>0) {
            for (String error : dart_parseBaseVisitorChild.semanticErrors) {
                System.err.println(error);
            }
            return ;
        }

        System.out.println("\n*********** AST ************\n");
        System.out.println(doc);
        System.out.println("\n*********** SYMBOL TABLE ************\n");
        for (String s: dart_parseBaseVisitorChild.scopeNames ){
            System.out.println(s);

        }
        System.out.println();
        for (String s: dart_parseBaseVisitorChild.varialbeNames ){
            System.out.println(s);

        }


    }

}