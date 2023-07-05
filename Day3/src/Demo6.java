//6) accept numbers and display as long as user does not enter 0.
import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
     
     while(true)
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter Number");
         int num= sc.nextInt();
    	 if(num==0)
    		 break;
     }
	}

}
