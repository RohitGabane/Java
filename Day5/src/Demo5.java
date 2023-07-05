/*5) create abstract class Shape. declare "draw()" function as abstract. 
 * From this class define "Triangle","Polygon" and "Circle" .
create an array of Shape having 3 elements.
store child objects into this array . and call
their draw function.*/
abstract class Shape
{
	abstract void draw();

}
class Triangle extends Shape
{

	
	void draw() {
		System.out.println("Inside Triangle");
		
	}

}
class Polygon extends Shape
{

	void draw() {
		System.out.println("Inside Polygon");
		
	}

}
class Circle extends Shape
{

	void draw() {
		System.out.println("Inside Circle");
		
	}

}
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Shape arr[]=new Shape[3];
      arr[0]=new Triangle();
      arr[1]=new Polygon();
      arr[2]=new Circle();
      
      for(int i=0;i<arr.length;i++)
      {
    	 // if(arr[i] )
    	  arr[i].draw();
      }

	}

}
