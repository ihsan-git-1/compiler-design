import ast.nodes.*;
import Splitter.*;
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
import static ast.AppConstant.addExtraFileAfterBuild;
import static org.antlr.v4.runtime.CharStreams.fromFileName;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    static String input_postfix = ".txt";
    static String expected_output_postfix = ".expected";

    private static String readFileToString(String filePath) throws Exception {
        Path path = Path.of(filePath);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes, StandardCharsets.UTF_8);
    }
    public static void main(String[] args) throws IOException {
        String dir = "src/tests/code_generation/setStateTest";
        String input = dir + input_postfix;
        String expected = dir + expected_output_postfix;
        String fileContent="";
        try {
            fileContent = readFileToString(input);
        } catch (Exception e) {}
        ArrayList<String> names = Splitter.split(fileContent);


//      writeFile(expected, func(input));


        for(String name : names){
            String _dir = "src/tests/code_generation/"+name+".dart";
            System.out.println(func(_dir));
        }

        addExtraFileAfterBuild();

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
            dart_parseBaseVisitorChild.emptySemanticErrors();

            return output.toString();
        }

        output.append("\n*********** AST ************\n\n");
        output.append(doc).append("\n");
        output.append("\n*********** SYMBOL TABLE ************\n\n");

        for (String s : dart_parseBaseVisitorChild.scopeNames) {
            output.append(s).append("\n");
        }
        dart_parseBaseVisitorChild.emptyScopeNames();
        output.append("\n");
        for (String s : dart_parseBaseVisitorChild.varialbeNames) {
            output.append(s).append("\n");
        }
        dart_parseBaseVisitorChild.emptyVariableName();

        generateHtmlCode(doc,dir);

        return output.toString();
    }

    public static void generateHtmlCode(TopTreeDeclaration topTreeDeclaration,String dir) {
        try {
            String fileName = extractFileName(dir);
            String generatedCodePath = "src/CodeGeneration/"+fileName+".html";

            FileWriter myWriter = new FileWriter(generatedCodePath);

            myWriter.write(topTreeDeclaration.generate_code());
            myWriter.close();

            //openHtmlFile(generatedCodePath);
        } catch (IOException e) {}
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

    private  static String extractFileName(String filePath) {
        int lastSlashIndex = filePath.lastIndexOf('/');
        int dotIndex = filePath.lastIndexOf('.');
        if (lastSlashIndex != -1 && dotIndex != -1 && lastSlashIndex < dotIndex) {
            return filePath.substring(lastSlashIndex + 1, dotIndex);
        }
        return null; // Return null if extraction is not possible
    }
}