/*2) using RandomAccessFile class create a file.
accept a message from user and write in a file.
now read the message which u have stored in a file.
now again accept a message and write in a file at the end of existing message.
now read the entire content of file . ( u should be able to read both the messages now)*/
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Create a new file using RandomAccessFile
        try {
            RandomAccessFile file = new RandomAccessFile("messages.txt", "rw");
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
            return;
        }

        // Accept a message from the user and write it to the file
        System.out.println("Enter a message to write to the file:");
        String message = sc.nextLine();

        try {
            RandomAccessFile file = new RandomAccessFile("messages.txt", "rw");
            file.writeBytes(message);
            System.out.println("Message written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
            return;
        }

        // Read the message from the file
        try {
            RandomAccessFile file = new RandomAccessFile("messages.txt", "r");
            String fileContent = file.readLine();
            System.out.println("Message read from file: " + fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
            return;
        }

        // Append another message to the end of the existing message
        System.out.println("Enter another message to append to the file:");
        String anotherMessage = sc.nextLine();

        try {
            RandomAccessFile file = new RandomAccessFile("messages.txt", "rw");
            long fileLength = file.length();
            file.seek(fileLength);
            file.writeBytes(anotherMessage);
            System.out.println("Message appended to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
            return;
        }

        // Read the entire content of the file
        try {
            RandomAccessFile file = new RandomAccessFile("messages.txt", "r");
            String fileContent = file.readLine();
            System.out.println("File content: " + fileContent);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            return;
        }
        
    }
}
