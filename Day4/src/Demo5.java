/*2)	Create a class with static and non-static member variables. Define static and non-static member functions.
 *  Create instance of this class and call both static and non-static member functions.*/
class Friend
{
	static int var=6;
	int var1=9;
	public static void print()
	{
		System.out.println("this is Static function");
	}
	public void print1()
	{
		System.out.println("this is non-Static function");

	}
}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Friend f1=new Friend();
      f1.print1();
      f1.print();
	}

}
