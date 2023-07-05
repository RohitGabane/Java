/*3)	Define a class “Check” in which declare member variables using  different accessibility modifiers 
 * i.e.  <default>, private ,public and protected.   Define a function “disp”  which should be public. 
 *  Define a class “CheckDemo” in which you will write “main()” function. 
 *  Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.*/
class Clock
{
	private int var=5;
	
	/**
	 * @return the var
	 */
	public int getVar(int var) {
		return var;
	}

	/**
	 * @param var the var to set
	 */
	public void setVar(int var) {
		this.var = var;
	}

	int var1=6;
	protected int var2=9;
	public int var3=7;
	
	public void disp()
	{
		System.out.println("access");
	}
}
public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     Clock c=new Clock();
     c.disp();
     System.out.println(c.var1);
     System.out.println(c.var2);
     System.out.println(c.var3);
//     System.out.println(c.var);
    // c.setVar(25);
    // c.getVar(63);
     System.out.println(c.getVar(25));


	}

}
