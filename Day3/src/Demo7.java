//7) accept a number and display whether it is even , odd or zero.
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		if(num==0)
			System.out.println("The no. is Zero!!");
		else
		{	
			if(num%2==0)
				
			{
				System.out.println("The Entered number is even");
			}
			else
			{
				System.out.println("The Entered number is odd");
			}
		}

	}

}
