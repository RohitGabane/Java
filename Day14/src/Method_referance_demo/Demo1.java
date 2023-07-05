package Method_referance_demo;
/*1) define a functional interface "First" with an abstract method "void disp1()".
define a class "Second" with a method "void fun1()"
inside main function create a method reference for "First" and invoke "fun1" of "Second"*/
interface Ronny
{
	void disp();
}
class ronny1
{
	void fun1()
	{
		System.out.println("in fun method");
	}
}
public class Demo1 {
	public static void main(String[] args)
	{
       ronny1 r1=new ronny1();
       Ronny ref=r1::fun1;
       System.out.println("implementation of " +ref.getClass().getName());
       ref.disp();
	}

}
