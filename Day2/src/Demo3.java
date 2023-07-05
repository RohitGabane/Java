/*
OOPS_3) Define a class "Emp" with private static member "int cnt".
How will u make sure that outsiders can read the value of cnt ?*/
class Emp
{
	private static int cnt;
	public int readval()
	{
		return cnt;
	
	}

}
public class Demo3{ 
	
    public static void main(String args[])
	 {
		 Emp ref=new Emp();
		 System.out.println(ref.readval());
	 }
 }
	 //Emp ref= new Emp();
	// System.out.println(ref.readval());
	// System.out.println(ref.readval());

