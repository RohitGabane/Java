package Method_referance_demo;
/*2) define a functional interface "Third" with an abstract method "void show(int num)".
define a class "Sample" with a method "void disp(int num)"
inside main function create a method reference for "Third" 
and invoke "disp" of "Sample" by passing a value "500".*/
interface Third
{
	void show(int num);
}
class sample
{
	void disp(int num)
	{
		System.out.println("in disp method");
	}
}
public class Demo2 {

	public static void main(String[] args)
	{
     sample s1=new sample();
     Third ref=s1::disp;
     System.out.println("implementation " +ref.getClass().getName());
     ref.show(500);
     
	}

}
