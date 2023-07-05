/*1) define a functional interface "First" with an abstract method "void disp1()" ,
 *  default method "void disp2()" and a static method "void disp3()"
 *  inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
also invoke "disp3()" method inside main.*/
interface First
{
	void disp1();
	default void disp2()
	{
		System.out.println("in default disp2");
	}
	static void disp3()
	{
		System.out.println("in static disp3");
	}
}
public class Demo1 {

	public static void main(String[] args)
	{
//		Demo1 d1=new Demo1();
      //using lambda function
		First ref=()->{System.out.println("in disp implementation");};
		ref.disp2();
		System.out.println("implementation of class\t" +ref.getClass().getName());
		
		First ref1=()->{System.out.println("in disp implementation");};
		ref1.disp1();
		System.out.println("implementation of class\t" +ref1.getClass().getName());
		First.disp3();
		
		
	}

}
