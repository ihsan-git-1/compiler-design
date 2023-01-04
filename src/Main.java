import  ast.nodes.*;
import  ast.variables.*;
import gen.dart_parse;
import gen.dart_lexar;
import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org. antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import static org.antlr.v4. runtime. CharStreams. fromFileName;

public class Main {
    public static void main(String[] args) throws IOException {

        String source = "myLanguage. txt";
        CharStream cs = fromFileName (source);
        dart_lexar lexer = new dart_lexar (cs);
        CommonTokenStream token = new CommonTokenStream(lexer);
        MyLanquageParser parser = new MyLanquageParser (token);
        ParseTree tree = parser -page (
                Paqe doc = (Paqe) new BaseVisitor().visit(tree);
    }

}