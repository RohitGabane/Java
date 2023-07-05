/*Question

define a class Student 
	rollno
	name
	age
	marks

	parameterized constructor 
	getter methods

	create 5 objects and store them inside list.

	using java8 stream api:
	
	*/
import java.util.*;
class Student
{
	int rollno;
	String name;
	int age;
	double marks;
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
	/**
	 * @return the marks
	 */
	public double getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(double marks) {
		this.marks = marks;
	}
	/**
	 * @param rollno
	 * @param name
	 * @param age
	 * @param marks
	 */
	public Student(int rollno, String name, int age, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	
	
}
public class Demo2 {

	public static void main(String[] args)
	{
		Student s1=new Student(1,"Ronny",22,53.25);
		Student s2=new Student(7,"Ronny1",32,93.25);
		Student s3=new Student(8,"sonny2",34,43.25);
		Student s4=new Student(9,"wonny3",24,63.25);
		Student s5=new Student(5,"sonny4",27,73.25);

         List<Student>l1=new ArrayList<>();
         l1.add(s1);
         l1.add(s2);
         l1.add(s3);
         l1.add(s4);
         l1.add(s5);
         
         System.out.println(l1);

		/*1) find out name starts with 's'

		hint:- use "filter" to check names start with "s" and "forEach" method to display all those names.
*/
         l1.stream().filter((i) -> i.startsWith("s")).forEach(System.out::println));
         System.out.println("Names start with s " +l1);
         /*2) how many students got more than 70

		hint: use "filter" and "count"*/
         l1.stream().filter(i -> i.getMarks()>70).count();
         System.out.println("Student more than 70 is: " +l1);
        /*

	3) how many students in between age 22 and 25

		hint: use "filter" and "count"*/ 
         l1.stream().filter((t) ->t.)
         
         

	}

}
