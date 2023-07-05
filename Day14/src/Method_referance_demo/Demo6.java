package Method_referance_demo;
/*6) define a functional interface "Seventh" with an abstract method "void fun(int k)".
define a class "Sample" with parameterized constructor with the message "inside parameterized constructor of Sample\t"+k .
inside main function instantiate "Sample" by passing value "200" using method reference to "Seventh"*/
interface seventh
{
	void fun(int k);
}
class sample2
{
	public sample2(int k)
	{
		System.out.println("inside parameterise constructor: "+k);
	}
}
public class Demo6 {

	public static void main(String[] args)
	{
       seventh ref=sample2::new;
       System.out.println("implementation is : " +ref.getClass().getName());
       ref.fun(200);
	}

}
