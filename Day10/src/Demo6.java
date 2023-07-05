
import java.lang.reflect.Method;

public class Demo6
{
	public static void main(String args[])
	{
		Class c=null;
		try {
			c= Class.forName(args[0]);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method []arr1 = c.getDeclaredMethods();
		for(Method m:arr1) {
			System.out.print(m);
			System.out.println();
		}
	}
}
