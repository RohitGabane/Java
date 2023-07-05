/*Interface Course
{
	void start();
	void stop();
}
now define 3 implementations: 
	DACDBDACourse,MSCit and Basic

inside "DACDBDACourse" class define one more method "public void orientation()"

define one more class "CourseDemo" with main function and "public static void show()" method.
from main function
	invoke "show()" method by passing object of any implementations and invoke "start()" 
and "stop()" methods. Also invoke "orientation()" method whenever object of "DACDBDACourse" 
is passed.*/
interface Course
{
	public void start();
	public void stop();
	
}
class DACDBDACourse implements Course
{
	public void orientation()
	{
		System.out.println("DACDBDACourse orientation");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("DACDBDACoursE");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("DACDBDACourse STOP");
	}
}
class Mscit implements Course
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("mscit ");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("mscit stop");
	}
	
}
class Basic implements Course
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("basic start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("basic stop");
	}
	
}
public class Demo9 
{
	public static void show(Course ref)
	{
		if(ref instanceof DACDBDACourse)
		{
			//DACDBDACourse d1=(DACDBDACourse)ref;
			((DACDBDACourse)ref).orientation();
		}
		ref.start();
		ref.stop();
		
	}
	public static void main(String[] args) {
		show(new DACDBDACourse());
		show(new Mscit());
		show(new Basic());
		
		
	}

}

