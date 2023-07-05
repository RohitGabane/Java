/*2) Person class implements Serializable with
	private String name
	private int age
		getters and setters
		parameterized constructor
Student extends Person
	private int rollno
		getter and setters
		parameterized constructor accepting name,age and rollno
			pass name and age to the super constructor
Demo class with main
	create one object of Student, write it inside file and then read.*/
import java.util.*;
import java.io.*;

class person implements Serializable
{
	private String name;
	private int age;
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
	/**
	 * @param name
	 * @param age
	 */
	public person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}
class Student extends person
{
	private int rollno=7;

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
	 * @param name
	 * @param age
	 * @param rollno
	 */
	public Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}

}
public class Demo2 
{

	public static void main(String[] args)throws Exception
	{
     Student s1=new Student("sandy",55,10);
     System.out.println("name : " + s1.getName() +  
             "    age : " + s1.getAge()+ " rollno : " +s1.getRollno()); 

     FileOutputStream fos=new FileOutputStream("abcd1.txt");
     ObjectOutputStream oos=new ObjectOutputStream(fos);  
      oos.writeObject(s1);
      //Deserilization
      FileInputStream fis=new FileInputStream("abcd1.txt");
      ObjectInputStream ois=new ObjectInputStream(fis);  
      Student ref=(Student)ois.readObject();
     
      System.out.println("name : " + s1.getName() +  
              "    age : " + s1.getAge()+ " rollno : " +s1.getRollno()); 
      
	}

}
