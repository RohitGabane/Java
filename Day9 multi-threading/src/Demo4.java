//4)create 2 threads. Write a program which displays number 1 to 10 using class lock. 
//[hint:- use "implements Runnable" and synchronized block]
public class Demo4 implements Runnable
{
	
	public void run()
	{
		synchronized(Demo4.class)
		{
			for(int i=0;i<=10;i++)
			{	
				System.out.println(i);
			}
		}
	}
	public static void main(String args[])
	{
		Demo4 ob=new Demo4();
		Thread t1=new Thread(ob);
		Thread t2=new Thread();
		t1.start();
		t2.start();
	}
}
