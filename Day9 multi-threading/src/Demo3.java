//3) create 3 threads in such a way that while one thread is executing,
//2 threads cannot interfere. they should display output "Exec  0" to "Exec 5".

public class Demo3 implements Runnable
{
    public void run()
    {
    	for(int i=0;i<=5;i++)
		{	
			System.out.println("Exec  "+i);
		}
    }
	public static void main(String[] args) {
         Demo3 ob=new Demo3();
		Thread t1=new Thread(ob);
        Thread t2=new Thread();
        Thread t3=new Thread();
        t1.start();
        t2.start();
        t3.start();

	}

}
