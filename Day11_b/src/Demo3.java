/*3) Define a class "Student" with
	private int rollno and private String name and private int age;
	setters and getters

	create 2 objects of Student and write them inside filesystem and thereafter read both 
	the objects and display.*/
//import java.util.*;
import java.io.*;
class Emp implements Serializable
{
	private int rollno=10;
	private  String name="ronny";
	private int age=25;
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}
	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class Demo3
{
	public static void main(String[] args)throws Exception
	{
//		Student s1=new Student();
		Emp s1=new Emp();
		
	       System.out.println("First  object file writing");
	      System.out.println("name : " + s1.getName() +  
	             "    age : " + s1.getAge()+ " rollno : " +s1.getRollno());
	    
	    System.out.println("Second object file Writing");
	    Emp s2=new Emp();
	    System.out.println("name : " + s2.getName() +  
	             "    age : " + s2.getAge()+ " rollno : " +s2.getRollno()); 
	    
	     FileOutputStream fos=new FileOutputStream("abcd4.txt");
	     ObjectOutputStream oos=new ObjectOutputStream(fos);  
	      oos.writeObject(s1);
	      oos.writeObject(s2);
	      
	      //Deserilization
	      FileInputStream fis=new FileInputStream("abcd4.txt");
	      ObjectInputStream ois=new ObjectInputStream(fis);  
	      
	       s1=(Emp)ois.readObject();
	       System.out.println("First  object file Reading");
	       System.out.println("name : " + s1.getName() +  
		              "    age : " + s1.getAge()+ " rollno : " +s1.getRollno());
	       
	       System.out.println("Second object file reading");
	       s2=(Emp)ois.readObject();
	       System.out.println("name : " + s2.getName() +  
		             "    age : " + s2.getAge()+ " rollno : " +s2.getRollno());	
	}
}