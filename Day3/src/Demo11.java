//11) accept 5 numbers in an array and sort them in ascending order.

import java.util.Scanner;
public class Demo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array list");
		 int arr[]=new int[5];
		 int t;
		 for(int i=0;i<arr.length;i++)
		 {
			 arr[i]=sc.nextInt();
		}
		 for(int i=0;i<arr.length;i++)

		 {
			 for(int j=i+1;j<arr.length;j++)
			 {
				 if(arr[i]>arr[j])
				 {
					 t=arr[i];
					 arr[i]=arr[j];
					 arr[j]=t;
				 }
			 }
			 

		 }
		 System.out.println("After sorting");
		 for(int i=0;i<arr.length;i++)
		 {
			 System.out.print(arr[i]+" ");
		}
	    
	}

}
