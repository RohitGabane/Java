import java.util.*;
import java.io.*;

/*8) Define a class "Employee" with following members
empid, empname, desig, basic.
Define a parameterised constructor which will take all these values while creating an instance.
Also define "disp()" method which will display all these details.
create 4 employees and save them in "ArrayList".
Now save this "ArrayList" in a file.
Open file , read "ArrayList" , traverse ArrayList and call "disp()" for all the objects.*/
class Employee implements Serializable
{
	private int empid;
	private String empname;
	private String design;
	/**
	 * @param empid
	 * @param empname
	 * @param design
	 */
	public Employee(int empid, String empname, String design) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.design = design;
	}
	
	
	
	
}
public class Demo8 {

	public static void main(String[] args) throws Exception 
	{
		Demo8 d1=new Demo8();
      Employee e1=new Employee(1,"Ronny","Senior");
      Employee e2=new Employee(2,"Ronny1","Senior1");
      Employee e3=new Employee(3,"Ronny2","Senior2");
      Employee e4=new Employee(4,"Ronny3","Senior3");

      List<Employee> l1=new ArrayList<Employee>();
       l1.add(e1);
       l1.add(e2);
       l1.add(e3);
       l1.add(e4);
       System.out.println(l1);
       
       FileOutputStream fos=new FileOutputStream("abc.txt");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       Demo8.writeObject(l1);
      
	}

}
