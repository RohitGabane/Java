//1) create a multi-threaded application by using  "extends Thread " method.create 2 threads.
//they should display characters from A to J.

public class Demo1 extends Thread 
{
    public void run()
    {
    	    for(char c = 'A'; c <= 'J'; ++c)
    	      System.out.print(c + " ");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t1=new Thread();
        Thread t2=new Thread();
        t1.start();
        t2.start();
	}

	
}
