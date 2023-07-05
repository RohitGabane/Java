/*4)	Show the example of single level inheritance with constructor invocation.*/


class School
{
	int num=15;
	public void disp1()
	{
		System.out.println("The number is="+num);
	}
	School()
	{
		System.out.println("Inner base no-argu contruction");
	}
}
class jnv extends School
{
	int num1=20;
	public void disp2()
	{
		System.out.println("The number is="+num1);
	}
	jnv()
	{
		System.out.println("Inner child no-argu contruction");
	}
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jnv b=new jnv();
        b.disp1();
        b.disp2();
	}

}
