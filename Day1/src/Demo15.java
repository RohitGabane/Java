//8) solve following pattern programs:

public class Demo15
{
 public static void main(String[] args) 
 {
	 int i,j,s,c=3;
		 for(i=1;i<=4;i++)
		    {
	            for(s=1;s<=4-i;s++)
	            System.out.print(" ");
	            for(j=1;j<=i;j++)
	            System.out.print("* ");
	            System.out.println();
	          }    
	        for(i=1;i<=c;i++)
	           {
	            for(s=1;s<i+1;s++)
	            System.out.print(" ");
	            for(j=c;j>=i;j--)
	            System.out.print("* ");

	            System.out.println("");
	            }
	        
}}
