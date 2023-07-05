/*9)	Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc.
 *  from “Shape” and override “draw()” function. Define a class “ShapeDemo” in which  write  main()  function. 
 *  In the main function create a reference to Shape class referring to any of the sub class. Using this reference, call “draw()” and check the result.*/
class Shape
{
	public void draw()
	{
		System.out.println("The overridden method");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("The overriding method 1");
	}
}
class Polygon extends Shape
{
	public void draw()
	{
		System.out.println("The overriding method 2");
	}
}
class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("The overriding method 3");
	}
}
public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s=new Shape();
		 s=new Rectangle();
		s.draw();
		//s.draw();

	}

}
