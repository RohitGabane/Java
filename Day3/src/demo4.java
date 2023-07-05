/*4) accept 2 numbers and a character as operator ( + , - ,* , / , % ). Perform arithmetic according to the character entered.
*/
import java.util.Scanner;
public class demo4 
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter first Number");
	  double a=sc.nextDouble();
	  System.out.println("Enter second number");
	  double b=sc.nextDouble();
	  
	  System.out.println("Enter Charcter");
	  char ch=sc.next().charAt(0);
	  
	  switch(ch)
	  {
	  case '+':
	  System.out.println("Addition of two number is:"+(a+b));
	      break;
	 
	  case '-':
	  System.out.println("Substraction of two number is:"+(a-b));
      break;

	 
	  case '*':
	  System.out.println("Multiplication of two number is:"+(a*b));
      break;

	  case '/':
	  System.out.println("Dividing of two number is:"+(a/b));
      break;
      
      default:
    	  System.out.println("enter wrong character");

	  }

	  
  }
}
