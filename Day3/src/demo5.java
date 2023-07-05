/*5) accept a number and display its table using 
	while
	do... while
	for
*/
import java.util.Scanner;
public class demo5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=sc.nextInt();
		  int p;
			for(int i=1;i<=10;i++)
				
			{
				p=num*i;
				System.out.println(num+"*"+i+"="+p);
			}
		

	}

}

