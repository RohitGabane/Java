//5)	Using ifЕЕ.else ifЕ.  Else,  display whether result is  fail, pass, second class , first class, Distinction etc.  
import java.util.Scanner;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the marks");  
	      float m= sc.nextFloat();

	      if(m>= 75)
	      System.out.println("Pass with Distinction");
	      else if(m>=60)
	      System.out.println("Pass with First Class");
	      else if(m>=50)
	      System.out.println("Pass with Second Class");
	      else if(m>=35)
	      System.out.println("Pass");
	      else
	      System.out.println("Failed");



	}

}
