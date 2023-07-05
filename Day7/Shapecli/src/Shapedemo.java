import Shapepack.Circle;
import Shapepack.Rect;
import Shapepack.Shape;
import Shapepack.Triangle;

public class Shapedemo {
	public static void perform(Shape ref)
	{
		ref.draw();
	}
	public static void main(String args[])
	{
		perform(new Triangle());
		perform(new Rect());
		perform(new Circle());

	}

}
