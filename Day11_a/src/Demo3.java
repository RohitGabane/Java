//3) write a file copy program using byte streams.
//( FileOutputStream and FileInputStream )
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3 {

    public static void main(String[] args) {
        String sourceFilePath = "Sourcr_file.txt";
        String targetFilePath = "target.txt";

        try (FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
             FileOutputStream fileOutputStream = new FileOutputStream(targetFilePath)) {

            // Create a byte array to read data from the source file
            byte[] buffer = new byte[1024];

            // Read data from the source file and write it to the target file
            int bytesRead;
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the file.");
            e.printStackTrace();
        }
    }
}
