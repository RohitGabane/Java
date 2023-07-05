/*1) accept marks from user. if marks are
	> 75  display "Distinction"
	> =60 and < =75 display "first class"
	> =45 and < 60 display "second class"
	>=35 and < 45 display "pass class"
	<35 display "fail"*/
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Demo11 d=new Demo11();
		d.main(args);
		System.out.println(d);
		
		
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
