//6) accept a number and check whether it is divisible by 3 or not.
import java.util.Scanner;
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a%3==0)
        {
        	System.out.println("It is divisibal by 3");
        }
        else
        {
        	System.out.println("It is not divisible by 3");
        }
	}

}
