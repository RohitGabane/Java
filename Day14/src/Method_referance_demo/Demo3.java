package Method_referance_demo;
/*3) define a functional interface "Fifth" with an abstract method "int add(int a,int b)"
define a class Math1 with a method "int calc(int a,int b)" 

inside main function invoke "calc" method with the help of
	a) lamdba expression
	b) method reference*/
interface Fifth
{
	int add(int a,int b);
}
class math
{
	int calc(int a,int b)
	{
		System.out.println("inside math");
		return 0;
		
	}
}
public class Demo3 {

	public static void main(String[] args) 
	{
        math m1=new math();

		//lambda expession
        Fifth ref3=(int a,int b)->{return +(a-b);};
        ref3.add(55, 95);
		System.out.println("inside lambda expression : " +ref3.getClass().getName());

        Fifth ref1=(int a,int b)->{return m1.calc(25, 65);};
		ref1.add(55, 87);
		
//		method referance
		
          Fifth ref=m1::calc;
          System.out.println("implementation method ref : " +ref.getClass().getName());
          ref.add(25, 85);
	}

}
