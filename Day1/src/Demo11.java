//8) solve following pattern programs:

public class Demo11 {
	public static void main(String[]args)
	{
		   int i,j,s;

	        for(i=1;i<=5;i++){
	            for(s=1;s<=5-i;s++)
	            System.out.print(" ");
	            for(j=1;j<=i;j++)
	            System.out.print("* ");

	            System.out.println();
	        }

	}

}
