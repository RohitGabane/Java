//2) create a multi-threaded application by using Thread pool.create 2 threads. 
//each thread should display numbers from 1 to 10. [ make sure while one thread executes , 
// other thread should not interfere ]
//Also when first thread displays nos. from 1 to 5 it should released the lock 
//and allow other thread to display nos. from 1 to 5 and then previous thread will display nos.
//from 6 to 10 and so on.
import java.util.concurrent.*;
class myapp implements Runnable
{
	public void run()
	{
		perform();
	}
	void perform()
	{
	for(int i=1;i<=10;i++)
	{
		System.out.println("Hello\t"+i+"\t"+Thread.currentThread());
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
   }
}
public class Demo2
{
	public static void main(String args[])
	{
		myapp m1=new myapp();
		myapp m2=new myapp();
		ExecutorService exec=Executors.newCachedThreadPool();

		for(int i=1;i<5;i++)
		{
			exec.execute(new myapp());
		}
System.out.println("After submitting tasks");


		System.out.println("After for loop");
		exec.execute(new myapp());
		exec.shutdown(); // if u don't invoke, then jvm will not shutdown
		System.out.println("done");
		// exec.execute(new myapp()); don't give any task after shutdown
		
	}
}	
/*
shutdown() prevents new tasks from being submitted to that Executor. The current thread ( e.g. main thread  ) will continue to run all tasks submitted before shutdown() was called. 
*/
//		exec.shutdown(); // if u don't invoke, then jvm will not shutdown
//		System.out.println("done");
		// exec.execute(new myapp()); don't give any task after shutdown
		



/*import java.util.concurrent.*;
class myapp implements Runnable
{
	public void run()
	{
		perform();
	}
	void perform()
	{
	for(int i=0;i<5;i++)
	{
		System.out.println("Hello\t"+i

+"\t"+Thread.currentThread());
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException ie)
		{
			System.out.println(ie);
		}
	}
	}
}
public class ExecutorDemo1
{
	public static void main(String args[])
	{
		ExecutorService 

exec=Executors.newCachedThreadPool();

		for(int i=0;i<3;i++)
		{
			exec.execute(new myapp());
		}
System.out.println("After submitting tasks");


		System.out.println("After for loop");
		exec.execute(new myapp());

/*
shutdown() prevents new tasks from being submitted to that Executor. The current thread ( e.g. main thread  ) will continue to run all tasks submitted before shutdown() was called. 
*/
//		exec.shutdown(); // if u don't invoke, then jvm will not shutdown
//		System.out.println("done");
		// exec.execute(new myapp()); don't give any task after shutdown
		

