/*4) create two classes

	Engine
		private int speed
		private String type
			setters and getters
	Car
		private Engine engine;
		private String modelname;
			setters and getters
define class "Demo" with main
	inside main create object of Car and then pass Engine to its setEngine method.
	now serialize this object of Car and deserialize it.*/
import java.io.*;
import java.util.*;
class Engine implements Serializable
{
	private int speed=100;
	private String type="turbo";
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engine [speed=" + speed + ", type=" + type + "]";
	}
	
	
}
class Car implements Serializable
{
	private Engine engine;
	private String modelname="audi e01";
	/**
	 * @return the engine
	 */
	public Engine getEngine() {
		return engine;
	}
	/**
	 * @param engine the engine to set
	 */
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	/**
	 * @return the modelname
	 */
	public String getModelname() 
   {
		return modelname;
	}
	/**
	 * @param modelname the modelname to set
	 */
	public void setModelname(String modelname) {
		this.modelname = modelname;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", modelname=" + modelname + "]";
	}
	
	
}
public class Demo4 
{

	public static void main(String[] args)throws Exception
	{
		Car c1=new Car();
		Engine e1=new Engine();
		c1.setEngine(e1);
		System.out.println(c1);
		System.out.println("Engine: "+c1.getModelname() + " SetEngine: " +c1.getEngine());
		FileOutputStream fos=new FileOutputStream("D:\\adcdd.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c1);
		
		FileInputStream fis=new FileInputStream("D:\\adcdd.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		 Car ref=(Car)ois.readObject();		
			System.out.println(ref);

		

	}

}
