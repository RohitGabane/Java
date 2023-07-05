/*2) create a class "Vehicle", define a method "public void start()" in it.
 *  From this class derive a class FourWheeler.
 *   How will u override "start()" method of parent class ?
*/
class Vehicle
{
	public void Start()
	{
		System.out.println("Vehicle Start");
	}
}
class FourWheeler extends Vehicle
{
	public void Start()
	{
		System.out.println("Car Start");

	}
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWheeler f=new FourWheeler();
		f.Start();

	}

}
