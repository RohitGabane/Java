/*1) Create a multi-level inheritance , instantiate the child class and observe constructor
 *  invocation.Also show, if needed how will u invoke parent class constructor from child class ?
*/
class Team
{
	Team(int num1)//using super keyword call the parent class const from child class
	{
		System.out.println("The parent Default Constructor:"+num1);
	}
}
class Captain extends Team
{
	Captain(int num)
	{
		super(17);
		System.out.println("The child class Parameteric constructor"+num);
	}
}
class ViceCaptain extends Captain
{
	ViceCaptain(int num2)
	{
		super(25);
		System.out.println("The Default construtor");
	}
}
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Captain v1=new Captain(55);
	}

}
