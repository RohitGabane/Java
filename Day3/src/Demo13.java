//13) accept 6 characters in an array and toggle them [ only if they are alphabets ]

import java.util.*;
public class Demo13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] arr = new char[6];
		int i;
		System.out.println("Enter character elements");
		for(i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
			}
		
		for(i=0;i<arr.length;i++) {
			if(arr[i]>=65 && arr[i]<=90)
				arr[i]+=32;
			else if(arr[i]>=97 && arr[i]<=122)
				arr[i]-=32;
		}
		
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			}
	}

}
