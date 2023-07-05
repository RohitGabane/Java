/*8)	Define a parent class with one function. Define child class with the function having same name as of parent class function, but having different argument.*/

class Sport
{
	int num=10;
	public void print()
	{
		System.out.println("The ovrriden num is:"+num);
	}
}
class Circket extends Sport 
{
	int num1=20;
	public void print(int num1)
	{
		this.num1=num1;
		System.out.println("The ovrridding num is:"+num1);
	}
}
public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circket a=new Circket();
       a.print();
	}

}