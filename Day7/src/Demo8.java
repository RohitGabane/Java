/*public class Course
{
	public void start()
	{
	}
	public void stop()
	{
	}
}
now define 3 child classes 
	DACDBDACourse,MSCit and Basic

inside "DACDBDACourse" class define one more method "public void orientation()"

define one more class "CourseDemo" with main function.
inside main function
	create an array of "Course" of 3 elements.
store all the child classes objects. Traverse the array and invoke "start()" and "stop()" 
of all the objects. Also invoke "orientation()" method wherever object of "DACDBDACourse" 
is present.*/
class Course
{
	public void start()
	{
		System.out.println("Course start");

	}
	public void stop()
	{
		System.out.println("Course stop");

	}
}
class DACDBDACourse extends Course
{
	public void orientation()
	{
		System.out.println("DACDBDACourse orientation");
	}
}
class Mscit extends Course
{
	
}
class Basic extends Course
{
	
}
public class Demo8 {
	public static void perform(Course ref)
	{
		if(ref instanceof DACDBDACourse)
		{
			DACDBDACourse d1=(DACDBDACourse)ref;
			d1.orientation();
		}
		ref.start();
		ref.stop();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course[] arr=new Course[3];
		perform(new DACDBDACourse());
		perform(new Mscit());
		perform(new Basic());
		//arr[0]=new DACDBDACourse();
		
		
	}

}
