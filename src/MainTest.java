import org.junit.jupiter.api.Test;
import java.nio.file.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String input_postfix = ".txt";
    String expected_output_postfix = ".expected";

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





    //Evaluations

    @Test
    public void evaluations_test1() throws IOException {
        String dir = "src/tests/evaluations/test1";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }
}