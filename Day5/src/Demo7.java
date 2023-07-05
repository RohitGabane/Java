/*7) Define class "Parent1" with some data.
Define interface "Parent2" with some methods.
Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.*/
class Parent1
{
	
}
interface Parent2
{
	abstract void disp1();
	abstract void print();
}
class child extends Parent1
{
	public void disp2()
	{
		System.out.println("child 1 class");
	}
}
class child2 implements Parent2
{

	public void disp1() 
	{
		System.out.println("disp child  class");

	}

	public void print() 
	{
		System.out.println("print child 2 class");
	}
	
}
public class Demo7 {

	public static void main(String[] args)
	{
      child2 c=new child2();
      c.disp1();
      c.print();
      //c.disp2();
	}

}
