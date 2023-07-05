//3) accept a character and display (using if.. else ) whether it is vowel or not.
import java.util.Scanner;
public class demo3 {

	public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter a character");
	  char ch=sc.next().charAt(0);
	  if(ch=='a' || ch=='e' || ch=='u' || ch=='i' || ch=='o')
	  {
		  System.out.println("It is vowel:"+ch);
	  }
	  
	  else
	  {
		  System.out.println("It is not vowel:"+ch);

	  }

	}

}
