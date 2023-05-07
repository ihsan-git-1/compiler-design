import org.junit.jupiter.api.Test;
import java.nio.file.*;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    String input_postfix = ".txt";
    String expected_output_postfix = ".expected";

    @Test
    public void navigation_test() throws IOException {
        String dir = "src/tests/declarations/navigation_test/test";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void evaluations_errors_test() throws IOException {
        String dir = "src/tests/evaluations/errors_test";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

    @Test
    public void evaluations_errors_test2() throws IOException {
        String dir = "src/tests/evaluations/errors_test2";
        Path filePath = Path.of(dir+expected_output_postfix);
        String content = Files.readString(filePath);
        assertEquals(content, Main.func(dir+input_postfix));
    }

}