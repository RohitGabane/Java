//3) Go for Hierarchical inheritance, create instances of child class and observe
//constructor invocation.
class Country
{
	Country()
	{
		System.out.println("Default parent class ");
	}
}
class India extends Country
{
	public void dis1()
	{
		System.out.println("Hello'''''");
	}
	India()
	{
		System.out.println("Default Child1 class contructor ");

	}
}
class Pakistan extends Country
{
	public void dis2()
	{
		System.out.println("Hello World'''''");
	}
	Pakistan()
	{
		System.out.println("Default Child2 class contructor ");

	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pakistan p=new Pakistan();
		India i=new India();
		//p.dis2();
	}

}
