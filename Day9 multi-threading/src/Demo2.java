//1) create a multi-threaded application by using  "extends Thread " method.create 2 threads.
//they should display characters from A to J.
//2) above program  using "implements Runnable" method.

public class Demo2 implements Runnable
{
    public void run()
    {
    	  char c;

    	    for(c = 'A'; c <= 'J'; ++c)
    	      System.out.print(c + " ");
    }
	public static void main(String[] args) {
         Demo2 ob=new Demo2();
		Thread t1=new Thread(ob);
        Thread t2=new Thread(ob);
        t1.start();
        t2.start();
	}

}
