import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Splitter {

    public static ArrayList<String> split(String javaCode) throws IOException {

        ArrayList<String>names=new ArrayList<>();
        String[] lines = javaCode.trim().split("\n");
        int classCount = 0;
        int splitIndex = -1;

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i].trim();
            if (line.startsWith("class")) {
                classCount++;
                if (classCount == 3) {
                    splitIndex = i;
                    break;
                }
            }
        }

        if (splitIndex != -1) {
            String upperPart = String.join("\n", java.util.Arrays.copyOfRange(lines, 0, splitIndex));
            String lowerPart = String.join("\n", java.util.Arrays.copyOfRange(lines, splitIndex, lines.length));

            // Extract the class name from the line starting with "class"
            String upperFileName = "src/tests/code_generation/"+getClassName(lines[0]) + ".dart";
            String lowerFileName = "src/tests/code_generation/"+getClassName(lines[splitIndex]) + ".dart";

            names.add(getClassName(lines[0]));
            names.add(getClassName(lines[splitIndex]));

            Path upperPath = Paths.get(upperFileName);
            Path lowerPath = Paths.get(lowerFileName);

//            Files.createFile(upperPath);
//            Files.createFile(lowerPath);

            try {
                BufferedWriter upperWriter = new BufferedWriter(new FileWriter(upperFileName));
                upperWriter.write(upperPart);
                upperWriter.close();

                BufferedWriter lowerWriter = new BufferedWriter(new FileWriter(lowerFileName));
                lowerWriter.write(lowerPart);
                lowerWriter.close();

                //System.out.println("Java code split into " + upperFileName + " and " + lowerFileName + " successfully.");
            } catch (IOException e) {}
        } else {
            names.add(getClassName(lines[0]));
            String FileName = "src/tests/code_generation/"+getClassName(lines[0]) + ".dart";
            names.add(getClassName(lines[0]));
            Path FilePath = Paths.get(FileName);

            try {
                BufferedWriter upperWriter = new BufferedWriter(new FileWriter(FileName));
                upperWriter.write(javaCode);
                upperWriter.close();

            } catch (IOException e) {}
        }

        return names;
    }

    private static String getClassName(String line) {
        return line.trim().split(" ")[1];
    }
}