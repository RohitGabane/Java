/*OOPS_1)create a class "Shape" with 2 attributes, "width" and "height". Make sure one can not access these attributes directly.
provide accessor methods on these attributes and allow them to call from outside of your class.*/

 class Shape
{
	public double width;
	public double height;
	
	public Shape(double height,double width)
	{
		
		height=5.65;
		this.height=height;
		this.width=width;
		
	}
	
	
}
public class Demo1
{
	public static void main(String[]args)
	{
		Shape s=new Shape(10,6.5);
		System.out.println(s.height);
		System.out.println(s.width);

	}
}

