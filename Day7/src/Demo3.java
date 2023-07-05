/*
create abstract class "Shape" with
	a contract "draw()" and concrete behaviour "show()"

create 3 child classes
	Triangle, Rectangle and Circle

define a class "ShapeDemo" with main
inside main create an array of "Shape" of 3 elements. Store all the child class objects inside the array, 
traverse it and invoke "draw()" and "show()" methods polymorphically.*
 * 
 */

/**
 * @author Admin
 *
 */
abstract class Shape
{
	abstract void draw();
	void Show()
	{
		System.out.println("Show");
	}
}	
class Triangle extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Triangle Draw");
	}
	
}
class Rectangle extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle Draw");

		
	}
	
}
class Circle extends Shape
{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle Draw");

	}
	
}
public class Demo3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Beverages b=new FruitJuice();
//		b.addIngredients();
//		b.addMilk();
		Shape[] arr=new Shape[3];
		arr[0]=new Triangle();
		arr[1]=new Rectangle();
		arr[2]=new Circle();
		
		for(int i=0;i<3;i++)
		{
			arr[i].Show();
			arr[i].draw();

		}


	}

}
