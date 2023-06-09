import ast.nodes.*;
import gen.*;

import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import visitors.NodesVisitor;

import java.io.FileWriter;

import visitors.dart_parseBaseVisitorChild;

import java.awt.*;
import java.io.File;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    static String input_postfix = ".txt";
    static String expected_output_postfix = ".expected";

    public static void main(String[] args) throws IOException {
        String dir = "src/tests/semantic_errors/undefined_variable";
        String input = dir + input_postfix;
        String expected = dir + expected_output_postfix;
//        writeFile(expected, func(input));     //create a .expected file to store the expected output of the tree

        System.out.println(func(input));    //print to console
    }

    public static String func(String dir) throws IOException {

        StringBuilder output = new StringBuilder();
        CharStream cs = fromFileName(dir);
        dart_lexar lexer = new dart_lexar(cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        dart_parse parser = new dart_parse(token);
        ParseTree tree = parser.topTreeDeclaration();
        TokenStream tokenStream = token;
        TopTreeDeclaration doc = (TopTreeDeclaration) new NodesVisitor(tokenStream).visit(tree);

        if (dart_parseBaseVisitorChild.semanticErrors.size() > 0) {
            for (String error : dart_parseBaseVisitorChild.semanticErrors) {
                output.append(error).append("\n");
            }
            return output.toString();
        }

        output.append("\n*********** AST ************\n\n");
        output.append(doc).append("\n");
        output.append("\n*********** SYMBOL TABLE ************\n\n");

        for (String s : dart_parseBaseVisitorChild.scopeNames) {
            output.append(s).append("\n");
        }
        output.append("\n");
        for (String s : dart_parseBaseVisitorChild.varialbeNames) {
            output.append(s).append("\n");
        }

        // html generator
        generateHtmlCode(doc);

        return output.toString();
    }

    public static void generateHtmlCode(TopTreeDeclaration topTreeDeclaration) {
        try {
            String generatedCodePath = "src/CodeGeneration/test.html";

            FileWriter myWriter = new FileWriter(generatedCodePath);

            myWriter.write(topTreeDeclaration.generate_code());
            myWriter.close();

            // launch the html file
            //openHtmlFile(generatedCodePath);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void openHtmlFile(String directory) {

        File htmlFile = new File(directory);

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (htmlFile.exists()) {
                try {
                    // Open the URL in the default browser
                    desktop.browse(htmlFile.toURI());

                } catch (IOException e) {
                    System.out.println("Can't launch html files");
                }
            } else {
                System.out.println("file not found");
            }
        }
    }

    public static void writeFile(String dir, String content) {
        try {
            FileWriter myWriter = new FileWriter(dir);
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}