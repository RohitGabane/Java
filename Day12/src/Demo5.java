/*5) create a class "MyClass".
create 5 different objects of it.
add them in a ArrayList.
store ArrayList in file.
Now open a file, read ArrayList and display all objects.*/
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;
 
public class Demo5 {

	public static void main(String[] args) 
	{
		List<String>l=new ArrayList<String>();
      Demo5 d1=new Demo5();
      Demo5 d2=new Demo5();
      Demo5 d3=new Demo5();
      Demo5 d4=new Demo5();
      Demo5 d5=new Demo5();
      l.add("Hi");
      l.add("Hi Hello");
      l.add("Hi Good ");
      l.add("Hi Good Night");
      System.out.println("Arraylist given is\t"+l);
      FileOutputStream fos = null;
	try {
		fos = new FileOutputStream("F:\\TODAY.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      try {
		ObjectOutputStream out = new ObjectOutputStream(fos);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      Demo5 object1 = d1;
	}
	}
     
