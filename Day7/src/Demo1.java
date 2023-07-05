/*public abstract class Course
{
	public void start()
	{
		// start process
	}
	public abstract double getFee();
	public abstract void evaluate();
}

define child classes of above abstract class
	DACDBDACourse extends Course
	MSCitCourse extends Course

show late binding with the help of "perform()" method.*/
abstract class Course
{
	public void start()
	{
		// start process
		System.out.println("start Process");
	}
	public abstract double getFee();
	public abstract void evaluate();
}

 class DACDBDACourse extends Course
{

	@Override
	public double getFee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void evaluate() {
		// TODO Auto-generated method stub
		System.out.println("Dacdbd Process");

		
	}
	
}
	class MSCitCourse extends Course
	{

		@Override
		public double getFee() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void evaluate() {
			// TODO Auto-generated method stub
			System.out.println("evaluat msc Process");

		}
	
	}

 

public class Demo1 {
	static void perform(Course ref)
	{
		ref.evaluate();
		ref.getFee();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new MSCitCourse());
		perform(new DACDBDACourse());

	}

}
