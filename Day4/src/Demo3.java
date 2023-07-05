//6)	Show the example of hierarchical inheritance with constructor invocation.
class Name
{
	int num=15;
	public void disp1()
	{
		System.out.println("The number is="+num);
	}
	Name()
	{
		System.out.println("Inner base no-argu contruction");
	}
}
class Ronny extends Name
{
	int num1=20;
	public void disp2()
	{
		System.out.println("The number is="+num1);
	}
	Ronny()
	{
		System.out.println("Inner child no-argu contruction");
	}
}
class Ronny1 extends Name
{
	int num2=20;
	public void disp3()
	{
		System.out.println("The number is="+num2);
	}
	Ronny1()
	{
		System.out.println("Inner sub-child no-argu contruction");
	}
	
	
}
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ronny1 b=new Ronny1();
		Ronny b1=new Ronny();
		b1.disp2();
        b.disp1();
        b.disp3();

	}

}