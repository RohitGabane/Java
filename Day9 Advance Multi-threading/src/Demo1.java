//1) create a multi-threaded application by using Thread pool.create 2 threads. 
//each thread should display characters from A to J. [ make sure while one thread executes ,
//other thread should not interfere ]
import java.util.concurrent.*;
class ronny implements Runnable
{
	
	
	public void run()
	{
		
		perform();
	}
	void perform()
	{
		   synchronized(ronny.class)
		   {
		    	  char c;

		    	    for(c = 'A'; c <= 'J'; ++c)
		    	      System.out.print(c + " ");
		   }
	}
}
public class Demo1
{
	public static void main(String args[])
	{
		ExecutorService exec=Executors.newFixedThreadPool(1);
		ExecutorService exec1=Executors.newFixedThreadPool(1);

			exec.execute(new ronny());
			exec1.execute(new ronny());
		
System.out.println("After submitting tasks");


		exec.shutdown();
	}
}	
