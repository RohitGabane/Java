/*6) Define interface "A" with "disp1()" method.
Derive from "A", interface "B" with "disp2" method.
Derive class "C" , from "B".
Instantiate class "C" and call its members as well as derived from parent interfaces.*/
interface A
{
	public void disp1();
	
}
interface B extends A
{
	public void disp2();
	
}

 class C implements B
{
	public void disp3()
	{
		System.out.println("In class c");
	}

	public void disp1() 
	{
		System.out.println("Hello...1");
	}

	
	public void disp2() 
	{
		System.out.println("Hello...2");

	}
}
public class Demo6 
{

	public static void main(String[] args)
	{
     C c1=new C();
     c1.disp3();
     c1.disp1();
     c1.disp2();

	}

}
