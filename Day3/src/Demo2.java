//2) accept a number and display whether it is divisible by 7 or not.
import java.util.Scanner;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a%7==0)
        {
        	System.out.println("It is divisibal by 7");
        }
        else
        {
        	System.out.println("It is not divisible by 7");
        }
	}

}
