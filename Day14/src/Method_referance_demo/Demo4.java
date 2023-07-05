package Method_referance_demo;
/*4) define a functional interface "Sixth" with an abstract method "void disp5()".
define a class "Sample" with a static method "void fun1()"
inside main function create a method reference for "Sixth" and invoke "fun1" of "Sample"
*/
interface Sixth
{
	void disp8();
}
class Sample1
{
	static void fun1()
	{
		System.out.println("inside static function");
	}
}
public class Demo4 
{
	public static void main(String[] args) 
	{
      Sixth ref=Sample1::fun1;
      System.out.println("implementation is : " +ref.getClass().getName());
      ref.disp8();
	}

}
