/*5) define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
create an implementation of "Runnable" using lambda expression which will invoke "disp()" 
method of "Display" class.
create 2 threads and pass above created "Runnable" implementation to these threads.
make sure while one thread is executing other thread will not interfere.*/

class Display
{
	synchronized void display()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i +Thread.currentThread().getName());
		}
	}
}
public class Demo5 {

	public static void main(String[] args) 
	{
      Display d1=new Display();
      Runnable ref=()->{d1.display();};
      System.out.println("implementation of runnable" +ref.getClass().getName());
      
      Thread t1=new Thread(()->{d1.display();},"first thread");
      Thread t2=new Thread(()->{d1.display();},"first thread");
      t1.start();
      t2.start();

	}

}
