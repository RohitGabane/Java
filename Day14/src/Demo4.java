/*4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
define a class "CalcDemo" with main method.
inside main using lambda create an implementation of "Calculator" , invoke "multiply()" 
method and display its result.*/
interface Calculator 
{
	int multiply(int a,int b);
}
public class Demo4 {

	public static void main(String[] args) 
	{
		Calculator ref2=(int a,int b)->{ return +(a+b);};
		ref2.multiply(10, 52);
		System.out.println("Addition of two num is: " +ref2.multiply(10, 52));
		System.out.println("Implementation class name is\t"+ref2.getClass().getName());
	}

}
