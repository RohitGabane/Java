//7)	Define a parent and a child class . Now explain function overriding with Example.

class Person
{
	int num=10;
	public void print()
	{
		System.out.println("The ovrriden num is:"+num);
	}
}
class Anna extends Person 
{
	int num1=20;
	public void print()
	{
		System.out.println("The ovrridding num is:"+num1);
	}
}
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Anna a=new Anna();
       a.print();
	}

}
