//14) display prime numbers from 2 to 20

public class Demo14
{
	public static void main(String args[])
	{
	 int no; 
     for(no=2;no<=20;no++){
     int x= no,  flag=0;;
     int i=1 ;
     for(i=1;i<=no;++i)
     {   if(x%i==0)
         flag++;
     }
     if (flag==2)
     System.out.println(no);
     }
}
}


