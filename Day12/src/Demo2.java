/*2) on the developer side:
	create a generic class which can accept any type
		with setters , getters and toString methods.
	create necessary jar files and  documentation.

on client side 
	create the object of above generic class and invoke its setters , getters and display the object.*/

public class Demo2 <t>
{
    private int num;
    private String name;
   
	public int getNum() 
	{
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

@Override
	public String toString() {
		return "Demo2 [num=" + num + ", name=" + name + "]";
	}

	//	public void setVal(String string) {
//		// TODO Auto-generated method stub
//		
//	}
	public static void main(String[] args) {
		Demo2<String> g1=new Demo2<String>();
		g1.setName("Hello Generic");
		System.out.println(g1.getName());

		Demo2<Integer>g2=new Demo2<Integer>();
		g2.setNum(100);
		System.out.println(g2.getNum());
	}

}
