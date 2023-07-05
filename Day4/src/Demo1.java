/*1)	Define 2 classes “First” and “Second” with member variables , member functions and constructors of  your choice. 
 * Now define a class “Two” in which define main function . In main function create various instances of First and Second 
 *  and call their individual member functions.*/
class First
{
	int num=9;
	public void disp1()
	{
		System.out.println("hello");
	}
	First()
	{
		System.out.println("The Default in constructor in firstr class");
	}
}
class Second
{
	int num=9;
	public void disp2()
	{
		System.out.println("hello 2");
	}
	Second()
	{
		System.out.println("The Default in contructor in second class");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First f=new First();
		Second s=new Second();
		f.disp1();
		s.disp2();
	}

}
