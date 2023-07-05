/*9) create int array of 5 elements and accept 5 values inside it. 
 Now accept one more number and check whether that number is there inside array or not.
*/
import java.util.Scanner;
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter array of 5 element");
         int arr[]=new int[5];
 
		
		System.out.println("Enter elements");
		int i;
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println();
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
