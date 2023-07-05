//8) create int array of 5 elements and accept 5 values inside it. Now display all the numbers of array.
import java.util.Scanner;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter Size of array");
       //int n= sc.nextInt();
       int arr[]=new int[5];
       
       for(int i=0; i<5; i++)
       {
 
    	   arr[i]=sc.nextInt();
       }
       for(int i=0; i<5; i++)
       {
    	   System.out.println(arr[i]);
       }
	}

}
