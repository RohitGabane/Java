// define "MyException" as a checked exception.
//
//define a class "Demo" with 
//	public void show1(), public void show2() , public void show3() and main functions.
//
//inside "show3()" accept a number and if it is greater than 10 raise "MyException" else display the number.
//	[ this method shouldn't handle the exception]
//
//main() function should call "show1()" , 
//show1() function should call "show2()",
//show2() function should call "show3()"
//
//show2() should not handle the exception but show1() should handle.

import java.util.Scanner;


public class Demo3 {
	
	public void show1() 
	{
		 try 
		 {
	            show2();
	     } 
		 catch (MyException aa) 
		 {
	            System.out.println(aa.getMessage());
	     }
		
	}
	
	public void show2() throws MyException 
	{
		show3();
	}
	
	public void show3() throws MyException
	{
		Scanner sc = new Scanner( System.in);
		System.out.println("Please Enter a valid number");
		int num = sc.nextInt();
		if (num > 10)
		{
			throw new MyException("Number is Greater Than 10");
		}
		else
		{
			System.out.println(num);
		}
	}
	public static void main (String[] args)
	{
		Demo3 d1 = new Demo3();
        d1.show1();
	}

}


 class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}

}
