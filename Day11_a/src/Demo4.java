/*4) Write a file copy program using unicode character streams.
( FileWriter and FileReader */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

    public static void main(String[] args) {
        String sourceFilePath = "source4.txt";
        String targetFilePath = "target4.txt";

        try (FileReader fileReader = new FileReader(sourceFilePath);
             FileWriter fileWriter = new FileWriter(targetFilePath)) {

            // Create a char array to read data from the source file
            char[] buffer = new char[1024];

            // Read data from the source file and write it to the target file
            int charsRead;
            while ((charsRead = fileReader.read(buffer)) != -1) {
                fileWriter.write(buffer, 0, charsRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
