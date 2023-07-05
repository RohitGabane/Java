//15) accept a number and display whether it is prime or not.
import java.util.*;
public class Demo15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=sc.nextInt();
		int i,flag=0;
        
        for(i=1;i<=no;++i)
        {   if(no%i==0)
            flag++;
        }
        if (flag==2)
        System.out.println("Prime number");
        else 
        System.out.println("Not Prime Number");
        }
}
