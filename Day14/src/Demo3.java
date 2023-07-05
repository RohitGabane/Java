/*3) define a functional interface "MyInterface" with an abstract method "void fun()"
define a class Demo with two functions "static void perform" and main.
from main function pass lambda expression, collect it in "perform" method and invoke "fun()" function.*/
interface MyInterface
{
	void fun();
}

public class Demo3
{
    static void perform(MyInterface ref)
    {
    	System.out.println("in static display " +ref.getClass().getName());
    }
	public static void main(String[] args) 
	{
	 
	 Demo3.perform(()->{return;});
	 System.out.println("done");
	}
}
