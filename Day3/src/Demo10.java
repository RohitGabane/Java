//10) accept 5 numbers in an array and display their sum.
import java.util.Scanner;
public class Demo10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr= new int[5];
		
		System.out.println("Enter elements");
		int i,sum=0;
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println();
		for(i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of elment = "+sum);
	}

}
