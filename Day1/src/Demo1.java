import java.util.Scanner;

//1) accept two numbers and add them.
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("The first number is");
		int a=sc.nextInt();
		System.out.println("The second number is");
		int b=sc.nextInt();
		int sum=a+b;
       System.out.println("Addition of two no is:"+sum);
	}

}
