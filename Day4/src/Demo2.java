//5)	Show the example of multi-level inheritance with constructor invocation.
class fruit
{
	int num=15;
	public void disp1()
	{
		System.out.println("The number is="+num);
	}
	fruit()
	{
		System.out.println("Inner base no-argu contruction");
	}
}
class banana extends fruit
{
	int num1=20;
	public void disp2()
	{
		System.out.println("The number is="+num1);
	}
	banana()
	{
		System.out.println("Inner child no-argu contruction");
	}
}
class bananapeal extends banana
{
	int num2=20;
	public void disp3()
	{
		System.out.println("The number is="+num2);
	}
	bananapeal()
	{
		System.out.println("Inner sub-child no-argu contruction");
	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        bananapeal b=new bananapeal();
        b.disp1();
        b.disp2();
        b.disp3();

	}

}
