package Method_referance_demo;
/*7) define a class "Student" with name and age as member variables, parameterized
 *  constructor , setters , getters and "toString" method. 
define a functional interface "MyInterface" with an abstract method "void show(Student ref)"
inside main function 
a) create an instance of "Student" class by passing "Vijay" and '20' values.
b) create method reference for "MyInterface" and display the instance of "Student" class created above.*/
class student5
{
	String name;
	int age;
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
	
	public student5(String name , int k)
	{
		this.setAge(k);
		this.setName(name);
		System.out.println("inside parameterise constructor: " +"name: " +name + " age:"  + k);
	}
	
	@Override
	public String toString() {
		return "student5  [name=" + name + ", age=" + age + "]";
	}
	
}
interface myinterface
{
	void show(student5 ref);
}
public class Demo7 {

	public static void main(String[] args) 
	{
       student5 s2=new student5("ronny" , 22);
       System.out.println(s2);
       myinterface ref=student5::toString;
       ref.show(s2);
	}

}
