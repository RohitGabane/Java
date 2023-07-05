/*5) on the developer side 
create checked exception "ResourceNotAllocatedException"

create a class
create necessary jar file and documentation

on the client side
public class Demo with main function

	inside main function, create object of "MyResource" and invoke "disp()" method.


*/
class MyResource implements AutoCloseable
{
	public MyResource(int capacity) throws ResourceNotAllocatedException
	{
		if(capacity>100)
		{
			throw new ResourceNotAllocatedException("not sufficient space");
		}
	}
    void disp()
    {
    	System.out.println("successful");
    }
	@Override
	public void close()  
	{
		System.out.println("resource is closed");
		
	}
}


class ResourceNotAllocatedException extends Exception
{
	public ResourceNotAllocatedException(String msg)
	{
		super(msg);
	}

}





public class Demo5 {

	public static void main(String[] args) {
		
		try
		{
			MyResource s1 = new MyResource(500);
			s1.disp();
		}
		catch(ResourceNotAllocatedException re)
		{
			System.out.println(re.getMessage());
		}
		
		
		
	}

}




