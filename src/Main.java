import ast.SymbolTableObject;
import ast.nodes.*;
import gen.*;
import java.io.IOException;
import java.util.Map;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "src/test2.txt";
        CharStream cs = fromFileName(source);

        dart_lexar lexer = new dart_lexar(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        dart_parse parser = new dart_parse(token);

        ParseTree tree = parser.topTreeDeclaration();
        TopTreeDeclaration doc = (TopTreeDeclaration) new NodesVisitor().visit(tree);
        System.out.println("\n*********** AST ************\n");
        System.out.println(doc);

        System.out.println("\n*********** SYMBOL TABLE ************\n");
        for (Map.Entry<String, SymbolTableObject> mapElement : dart_parseBaseVisitor.symbolTable.entrySet()) {

            // Printing mark corresponding to string entries
            System.out.println("Identifier " + mapElement.getKey() + ", Type " + mapElement.getValue().type +
                    ", Value " + mapElement.getValue().value);
        }
    }

}