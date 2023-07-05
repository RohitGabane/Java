/*8) Define a class "base1" with only parameterized constructor.
Derive a class "sub1" from "base1". This class should have following constructors
	a) Default
	b) one parameter
	c) two parameter
Now try to instantiate "sub1" , using any of the above mentioned constructors.*/
class base1
{
	base1(int num)
	{
		System.out.println("Default"+num);
	}
}
class Sub1 extends base1
{
	Sub1()
	{ super(10);
		System.out.println("default");
	}
	Sub1(int num1)
	{ super(20);
		System.out.println("default"+num1);
	}
	Sub1(int num2,int num3)
	{   super(95);
		System.out.println("default"+num2 +" "+num3);
	}
	
}
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Sub1 s=new Sub1(95);
	}

}
