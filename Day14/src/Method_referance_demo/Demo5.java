package Method_referance_demo;
/*5) define a functional interface "Emp" with an abstract method "void show()".
define a class "MyClass" with default constructor with the message "inside default constructor of MyClass".
inside main function instantiate "MyClass" using method reference to "Emp"*/
interface Emp1
{
	void show();
}
class myclass
{
	public myclass()
	{
		System.out.println("inside Default constructor");
	}
}
public class Demo5 {

	public static void main(String[] args) 
	{
    	Emp1 ref=myclass::new;
    	System.out.println("implementation of : " +ref.getClass().getName());
    	ref.show();
	}

}
