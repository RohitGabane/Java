/*2) on the developer side create an exception:
	NumberNotDivisibleBySevenException
	as a checked exception

create necessary jar and documentation.

on client side
	public class MyMath class with 
		public void disp(int num)
this disp() method will check if the number passed is not divisible by 7 , it will raise "NumberNotDivisibleBySevenException" or else it will simply display the number passed.
	[ this method shouldn't handle the exception]

	public class Demo
		main function 
		invoke "disp()" of "MyMath" class.*/
 class NumberNotDivisibleBySevenException extends Exception
{
	public NumberNotDivisibleBySevenException (String message)
	{
		super(message);
	}

}





public class Demo2 {
	public static void main(String [] args)
	{
		
	MyMath m1 = new MyMath();
	
	try
	{
		m1.disp(19);
	}
	catch(NumberNotDivisibleBySevenException aa)
	{
		System.out.println(aa.getMessage());
	}
	
	}
	

}



 class MyMath 
{
	public void disp(int num) throws NumberNotDivisibleBySevenException
	{
		if(num % 7!=0)
		{
			throw new NumberNotDivisibleBySevenException("Number is not divisible by 7");
			
		}
		else
		{
			System.out.println(num);
		}
	}

}
