/*Question:

	define a class "Order" with:

	enum Type
	{
		BUY,SELL;
	}
	private int quantity;
	private double price;
	private Type type;

	
	define setter and getter methods for all the fields.

	create 5 objects of this class and stored them inside list.

	using stream api:

	1) count how many orders are for "SELL"

		hint:- use "filter" method of stream to check whether type is SELL and "count" method to count.

	2) calculate sum of all the prices

		hint:- use "mapToDouble" method of stream to convert price of each and every object
		 and "sum" method to calculate total of all the prices.

	3) calculate sum of all the quantities.

		hint:- use "mapToInt" method of stream to convert qty of each and every object and 
		"sum" method to calculate total of all the quantities.*/
import java.util.*;
class Order
{
	private int quantity;
	private double price;
	private Type type;
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the type
	 */
	public Type getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Type type) {
		this.type = type;
	}
	/**
	 * @param quantity
	 * @param price
	 * @param type
	 */
	public Order(int quantity, double price, Type type) {
		super();
		this.quantity = quantity;
		this.price = price;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Order [quantity=" + quantity + ", price=" + price + ", type=" + type + "]";
	}	
}
public class Demo1 
{
	
	public static void main(String[]args)
	{

	Order o1=new Order(1,72.33,Type.BUY );
	Order o2=new Order(2,92.33,Type.SELL);
	Order o3=new Order(3,252.33,Type.BUY);
	Order o4=new Order(4,592.33,Type.SELL);
	
	List<Order>l1=new ArrayList<>();
	l1.add(o1);
	l1.add(o2);
	l1.add(o3);
	l1.add(o4);
	System.out.println("Defore sorting : " +l1);
     /*1) count how many orders are for "SELL"

		hint:- use "filter" method of stream to check whether type is SELL and "count" method to count.
*/
	l1.stream().filter(r -> r.getType().equals(Type.SELL)).count();
	System.out.println("There are oreder sell is :  " +l1);
//	2) calculate sum of all the prices
//
//	hint:- use "mapToDouble" method of stream to convert price of each and every object
//	 and "sum" method to calculate total of all the prices.
	l1.stream().mapToDouble(t -> t.getPrice()).sum();
	System.out.println("There are sum of all prices :  " +l1);

	/*3) calculate sum of all the quantities.

		hint:- use "mapToInt" method of stream to convert qty of each and every object and 
		"sum" method to calculate total of all the quantities.*/
	l1.stream().mapToInt(t -> t.getQuantity()).sum();
	System.out.println("There are sum of all Quantities :  " +l1);

	
//	System.out.println(l1);
	}

}