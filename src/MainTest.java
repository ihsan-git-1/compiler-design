import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import visitors.dart_parseBaseVisitorChild;

import java.nio.file.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private static final String input_postfix = ".txt";
    private static final String expected_output_postfix = ".expected";

    @BeforeEach
    public void setup(){
        dart_parseBaseVisitorChild.semanticErrors = new ArrayList<>();
        dart_parseBaseVisitorChild.scopeNames = new ArrayList<>();
        dart_parseBaseVisitorChild.varialbeNames = new ArrayList<>();
        dart_parseBaseVisitorChild.scopes=new Stack<>();
        dart_parseBaseVisitorChild.index=1;
    }

    //Declarations

    @Test
    public void declarations_Boolean_assign() throws IOException {
        String dir = "src/tests/declarations/Boolean/assign";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void declarations_Double_assign() throws IOException {
        String dir = "src/tests/declarations/Double/assign";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void declarations_Integer_assign() throws IOException {
        String dir = "src/tests/declarations/Integer/assign";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }
    @Test
    public void declarations_String_assign() throws IOException {
        String dir = "src/tests/declarations/String/assign";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    //Semantic Errors
    @Test
    public void semantic_errors_undefined_variable() throws IOException {
        String dir = "src/tests/semantic_errors/undefined_variable";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void semantic_errors_mismatch_variable() throws IOException {
        String dir = "src/tests/semantic_errors/mismatch_variable";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void semantic_errors_undefined_class() throws IOException {
        String dir = "src/tests/semantic_errors/undefined_class";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void semantic_errors_already_defined_variables() throws IOException {
        String dir = "src/tests/semantic_errors/already_defined_variables";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void semantic_errors_string_condition() throws IOException {
        String dir = "src/tests/semantic_errors/string_condition";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void semantic_errors_double_property() throws IOException {
        String dir = "src/tests/semantic_errors/double_property";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }





    //Evaluations

    @Test
    public void evaluations_test1() throws IOException {
        String dir = "src/tests/evaluations/test1";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }
    @Test
    public void evaluations_test2() throws IOException {
        String dir = "src/tests/evaluations/test2";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void evaluations_test3() throws IOException {
        String dir = "src/tests/evaluations/test3";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void evaluations_test4() throws IOException {
        String dir = "src/tests/evaluations/test4";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }
    @Test
    public void evaluations_test5() throws IOException {
        String dir = "src/tests/evaluations/test5";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void evaluations_test6() throws IOException {
        String dir = "src/tests/evaluations/test6";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }
    @Test
    public void evaluations_test7() throws IOException {
        String dir = "src/tests/evaluations/test7";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    //Scopes
    @Test
    public void scopes_test1() throws IOException {
        String dir = "src/tests/scopes_test/test1";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void scopes_test2() throws IOException {
        String dir = "src/tests/scopes_test/test2";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }
}