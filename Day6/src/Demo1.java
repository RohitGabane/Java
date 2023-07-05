/*public interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
public interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}

public class WindowGUIApp implements MouseHandler,WindowHandler
{
}
public class GUIDemo
{
	main()
	{
		create the object of WindowGUIApp and invoke all the methods
	}
}*/
 interface MouseHandler
{
	void mouseClicked();
	void mousePressed();
	void mouseReleased();
}
 interface WindowHandler
{
	void windowClosing();
	void windowClosed();
}
class WindowGUIApp implements MouseHandler,WindowHandler
 {

	
	public void windowClosing() 
	{
		System.out.println("please windowClosing");
	}
	public void windowClosed() 
	{
		System.out.println("please windowClosed");

	}
	public void mouseClicked()
	{
		System.out.println("please mouseClicked");

	}
	public void mousePressed()
	{
		System.out.println("please mousePressed");

	}
	public void mouseReleased() 
	{
		System.out.println("please mouseReleased");

	}
	public void disp1()
	{
		System.out.println("hello.....");
	}
 }
public class Demo1 {

	public static void main(String[] args) {
		WindowGUIApp w=new WindowGUIApp();
		w.mouseClicked();
		w.mousePressed();
		w.mouseReleased();
		w.windowClosing();
		w.windowClosed();
		w.disp1();
	}

}
