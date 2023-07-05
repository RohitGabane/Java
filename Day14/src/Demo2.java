/*2) define a functional interface "Second" with an abstract method "void disp4()".

define a class Demo with main function.
inside main function create two implementations of "Second" using lambda expression and display their names.*/
interface Second
{
	void disp4();
}
public class Demo2 
{
	public static void main(String[] args) 
	{
      System.out.println("First implementation");
      
      Second ref=()->{System.out.println("in main implementation");};
      ref.disp4();
      System.out.println("implementation of class\t" +ref.getClass().getName());
      
      System.out.println("Second implementation");

      Second ref1=()->{System.out.println("in main implementation");};
      ref1.disp4();
      System.out.println("implementation of class\t" +ref1.getClass().getName());
	}

}
