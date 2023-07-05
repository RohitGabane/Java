/*1) define your exception class by name "MyArithException"
(MyArithException.java) as checked exception.
define class "Calculator"   (Calculator.java)
In this class define a function,which will accept an int and return double of it.
e.g int caldouble(int)
This function will check an int which is passed to it
It will raise the  exception if 0 is passed or negative passed
in case of 0 caller of this method should get error message
"Zero not allowed" 
in case of negative caller of this method should get error message
"negative not allowed"
In case of positive value it should simply return the double value.
	[ this method shouldn't handle the exception]*/

import java.util.Scanner; 

class MyArithException extends Exception
{
	public MyArithException(String message)
	{
        super(message);
    }
	
}

class Calculator 
{
    
    public int caldouble(int num) throws MyArithException 
    {
        if (num == 0)
        {
            throw new MyArithException("Zero not allowed");
        }
        else if (num < 0) 
        {
            throw new MyArithException("Negative not allowed");
        }
        else
        {
            return num * 2;
        }
    }
}

public class Demo1
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        Calculator calculator = new Calculator();
        
        try 
        {
            int result = calculator.caldouble(num);
            System.out.println("Double of " + num + " is " + result);
        } 
        catch (MyArithException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}
