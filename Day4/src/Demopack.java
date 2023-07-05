class Check{
	int fun1=10;
	public int fun2=20;
	private int fun3=30;
	protected int fun4=40;
	
	 int Getfun3() {
		return fun3;		
		}
	 public void disp() {
		 System.out.println("Inside public display");
	 }
	 
	
	
}
public class Demopack {

	public static void main(String[] args) {
		
		Check c=new Check();
		System.out.println(c.fun1);
		System.out.println(c.fun2);
		//System.out.println(c.fun3);  
		//private fun3 is not directly accessible
		System.out.println(c.fun4);
		System.out.println(c.Getfun3());
		c.disp();
		
	}

}
