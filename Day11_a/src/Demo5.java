/*5) accept as many as numbers from user till he presses "0"  and write these 
numbers in a file. Now Open a file and read these numbers. 
( Hint :- use Scanner class for input, FileOutputStream, DataOutputStream, 
FileInputStream , DataInputStream)
FileInputStream fis=new FileInputStream("d:\\abc.txt");
DataInputStream dis=new DataInputStream(fis);

while(dis.available()!=0)
{
	S.o.p(dis.readInt());
}*/
import java.util.*;
import java.io.*;

public class Demo5 {

    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in);
             FileOutputStream fos = new FileOutputStream("ty.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {

            // Accept numbers from the user and write them to the file
            System.out.println("Enter numbers (press 0 to stop):");
            while (sc.hasNextInt()) {
                int number = sc.nextInt();
                if (number == 0) {
                    break;
                }
                dos.writeInt(number);
            }

            System.out.println("Numbers written to file successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("ty.txt");
             DataInputStream dis = new DataInputStream(fis)) {

            // Read numbers from the file and display them
            System.out.println("Numbers read from file:");
            while (dis.available() > 0) {
                int number = dis.readInt();
                System.out.println(number);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading from file.");
            e.printStackTrace();
        }
    }
}

