/*-

create Array of Beverages class and store all the child classes objects.
now traverse the array and invoke all the functions.*/
abstract class Beverages {

	// Defined
	public void addMilk() {
		System.out.println("addmilk");

	}

	// abstract
	abstract void addIngredients();
}
class Coffee extends Beverages
{
	void addIngredients()
	{
		System.out.println("coffee");
		
	}
//	public void addMilk() {
//		System.out.println("addmilk");
//
//	}

	// addMilk inherited
}
class Tea extends Beverages
{
	void addIngredients()
	{
		System.out.println("tea");
	}
	// addMilk inherited
}
class FruitJuice extends Beverages
{
	void addIngredients()
	{
		System.out.println("Fruitjuice");
	}
	// addMilk inherited
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Beverages b=new FruitJuice();
//		b.addIngredients();
//		b.addMilk();
		Beverages[] arr=new Beverages[3];
		arr[0]=new FruitJuice();
		arr[1]=new Coffee();
		arr[2]=new Tea();
		
		for(int i=0;i<3;i++)
		{
			arr[i].addMilk();
			arr[i].addIngredients();

		}


	}

}
