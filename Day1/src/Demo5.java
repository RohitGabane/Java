//5) accept two numbers and check whether first number is greater or second number is greater or they are equal.
import java.util.Scanner;
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("The first number is");
		int a=sc.nextInt();
		System.out.println("The second number is");
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println("The first number is greater");

		}
		else if(a<b)
		{
			System.out.println("The second number is greater");

		}
		else
		{
			System.out.println("Number is Equal");
		}
	
         
	}

}
