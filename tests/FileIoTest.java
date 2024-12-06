import java.io.*;

public class FileloTest {
    public static void main(String[] args) {
        try {
            System.out.println("Starting tests...");

            // Test: Create a file and write content
            String filename = "testFile.txt";
            String content = "Hello, world!";
            FileIO.writeToFile(filename, content);

            // Test: Read content from file
            String readContent = FileIO.readFromFile(filename);
            System.out.println("Read Content: " + readContent);
            assert content.equals(readContent);

            // Test: Append content to file
            String appendContent = " Goodbye, world!";
            FileIO.appendToFile(filename, appendContent);

            // Verify appended content
            String finalContent = FileIO.readFromFile(filename);
            System.out.println("Final Content: " + finalContent);
            assert finalContent.equals(content + appendContent);

            System.out.println("All tests passed!");

        } catch (IOException e) {
            System.err.println("Test failed with error: " + e.getMessage());
        }
    }
}
