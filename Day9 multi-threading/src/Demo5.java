//5) create 2 threads
//	one thread will display 1 to 50
//	second thread will display 50 to 1
//both the threads should start simultaneously.
//
//(use implements method)



 class Ascending implements Runnable{
	Monitor obj;
	int flag=1;
	Ascending(Monitor obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		int i=1;
		while(flag!=50)
		{
			flag=obj.ascending(i++);
		}
	}
}

class Descending implements Runnable {
	Monitor obj;
	int num;
	Descending(Monitor obj)
	{
		this.obj=obj;
	}
	public void run()
	{
		while(num!=50)
		{
			num=obj.descending();
		}
	}
}



 class Monitor {
	int t;
	boolean value_set;
	synchronized public int ascending(int k)
	{
		while(value_set)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
			}
		}
		t=k;
		
		System.out.println("Increment  "+t);
		notifyAll();
		value_set=true;
		
		return t;
		
	}
	synchronized public int descending( )
	{
		while(!value_set)
		{
			try
			{
				wait();
			}
			catch(InterruptedException ie)
			{
			}
		}
		value_set=false;
		System.out.println("Decrement  "+(51-t));
		notifyAll();
		return t;
	}
}




public class Demo5 {

	public static void main(String[] args) {
		Monitor m1 = new Monitor();
		Ascending a1 = new Ascending(m1);
		Descending d1 = new Descending(m1);
		
		Thread t1 = new Thread(a1);
		t1.setName("Increment thread");
		Thread t2 = new Thread(d1);
		t2.setName("Decrement thread");
		
		t1.start();
		t2.start();
	}

}
