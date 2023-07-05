interface PizzaIngredientFactory
{
	public void createDough();
	public void createSauce();
	public void createCheese();
	public void createPepperoni();
	public  void createClams();
	
}
class USPizzaIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public void createDough() 
	{
		System.out.println("USPizzaIngredientFactory createDough");
	}

	@Override
	public void createSauce() 
	{
		System.out.println("USPizzaIngredientFactory createSauce");

	}

	@Override
	public void createCheese()
	{
		System.out.println("USPizzaIngredientFactory createCheese");

	}

	@Override
	public void createPepperoni() 
	{
		System.out.println("USPizzaIngredientFactory createPepperoni");

	}

	@Override
	public void createClams() {
		System.out.println("USPizzaIngredientFactory createClams");

		
	}


	
}
class IndianPizzaIngredientFactory implements PizzaIngredientFactory
{

	@Override
	public void createDough() 
	{
		System.out.println("IndianPizzaIngredientFactory createDough");

	}

	@Override
	public void createSauce() 
	{
		System.out.println("IndianPizzaIngredientFactory createSauce");

	}

	@Override
	public void createCheese()
	{
		// TODO Auto-generated method stub
		System.out.println("IndianPizzaIngredientFactory createCheese");

	}

	@Override
	public void createPepperoni() 
	{
		System.out.println("IndianPizzaIngredientFactory createPepperoni");

	}

	@Override
	public void createClams() {
		System.out.println("IndianPizzaIngredientFactory createClams");

	}
	
}

public class Demo7 {

	public static void main(String[] args) {
		PizzaIngredientFactory[] arr=new PizzaIngredientFactory[2];
		for(int i=0;i<arr.length;i++)
		arr[0]=new IndianPizzaIngredientFactory();
		arr[1]=new USPizzaIngredientFactory();
		
		
		for(int j=0;j<arr.length;j++)
		{
			arr[j].createClams();
			arr[j].createPepperoni();
			arr[j].createSauce();
			arr[j].createCheese();
			arr[j].createDough();


		}

	}

}

