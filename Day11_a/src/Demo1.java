/*1)accept 10 characters from a user ( use Scanner).
store these 10 characters in a file. (FileWriter)
Now open a file and read all these characters*/
import java.io.*;

import java.util.*;
	

	/**
	 * 
	 */

public class Demo1 implements Serializable {

	
	public static void main(String[] args)
	{
		  Demo1 d1=new Demo1();	
		  try (Scanner sc = new Scanner(System.in)) {
			char[] array = new char[10];
			   System.out.println("Enter 10 characters");
			   for(int i = 0; i < array.length; i++){
			       array[i] = sc.next().charAt(0);
			   }
		}
		   try
	        {  
	            //Saving of object in a file
	            FileOutputStream fos = new FileOutputStream("F:\\TODAY.txt");
	            ObjectOutputStream out = new ObjectOutputStream(fos);
	             
	            // Method for serialization of object
	            out.writeObject(d1);
	             
	            out.close();
	            fos.close();
	             
	            System.out.println("Object has been serialized");
	 
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	 
	 
	        Demo1 object1 = d1;
	 
	        // Deserialization
	        try
	        {  
	            // Reading the object from a file
				FileInputStream file = new FileInputStream("F:\\TODAY.txt");
	            ObjectInputStream in = new ObjectInputStream(file);
	             
	            // Method for deserialization of object
	            object1 = (Demo1)in.readObject();
	             
	            in.close();
	            file.close();
	             
	            System.out.println("Object has been deserialized ");
	            System.out.println("a = " + d1);
//	            System.out.println("b = " + object1.b);
	        }
	         
	        catch(IOException ex)
	        {
	            System.out.println("IOException is caught");
	        }
	         
	        catch(ClassNotFoundException ex)
	        {
	            System.out.println("ClassNotFoundException is caught");
	        }
	 
	    }
	
	}

	



