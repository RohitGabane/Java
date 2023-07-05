//1)	display a table of a particular number           
import java.util.Scanner;
public class demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int Num=sc.nextInt();
	     int p;
		for(int i=1;i<=10;i++)
			
		{
			p=Num*i;
			System.out.println(Num+"*"+i+"="+p);
		}
	}

}
