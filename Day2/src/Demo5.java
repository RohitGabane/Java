/*OOPS_5) Define 3 classes A , B and C
in all these classes create static and nonstatic variables as well as methods.
	Now Define a class "Demo" ,in which define "main" function. From this main function try to access all the members of A ,B  and C.*/

class A
{
	private static int var;
	private int var2;
	
	public static void getA1()
	{
	
		System.out.println("inside Static"+var);
	}
	public void set1(int var2)
	{
		System.out.println("inside non Static");

		this.var2=var2;
	}
}
class B
{
	private static int var3=8;
	private int var4;
	
	public static void getA2()
	{
	
		System.out.println("inside Static"+var3);
	}
	public void set2(int var3)
	{
		System.out.println("inside non Static");
		this.var3=var3;
	}
}
 class c
{
	private static int var5=3;
	private int var6;

	public static void getA3()
	{
	System.out.println("inside Static"+var5);
	}
	public void set3(int var5)
	{
		System.out.println("inside non Static");
		this.var5=var5;
	}
}
public class Demo5 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		A a1=new A();
		B b1=new B();
		c c1=new c();
		//A.set1(5);
		A.getA1();
		B.getA2();
		c.getA3();
		a1.set1(44);
		b1.set2(80);
		c1.set3(66);

	}

}
