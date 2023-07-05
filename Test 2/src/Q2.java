import java.util.*;

public class Q2 
{
    public static void main(String[] args)
    {
    	 int a,b;	 
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter First number: ");
        a=sc.nextInt();
        
        System.out.println("Enter Second number: ");
        b=sc.nextInt();
        
       int flag=1;
       for(int i=1;(i<=a)&&(i<=b);i++)
       {
        if((a%i==0)&&(b%i==0))
        flag=i;
       }
       System.out.println("hcf: "+flag);

    }
 }
