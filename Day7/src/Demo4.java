/*

 in all these classes "createUIComponent()" method must be defined in such a way that whatever type is passed as per
  this it must return a specific UIComponent. e.g. if "button" is passed , it should return "Button" class object   or
   if "textfield" is passed , it should return "TextField" class object.

create a class UIComponentCreatorDemo with main function
inside main function
	create objects of WindowsUIComponentCreator, LinuxUIComponentCreator 
	and MacUIComponentCreator classes and invoke 
	"createUIComponent()" ,"add()" and "show()" methods.*/
class UIComponent
{
	void add()
	 {
		 
	 }
	void show()
	 {
		 return;
	 }
}
 class Button extends UIComponent
{
	
	 void show()
	 {
		 return;
	 }
}
class TextField extends UIComponent
{
	 void show()
	 {
		 return;
	 }
}
class CheckBox extends UIComponent
{
}
abstract class UIComponentCreator
{
	public void show(String type)
	{
		UIComponent comp=createUIComponent(type);
		add(comp);
	}
	public void add(UIComponent component)
	{
		System.out.println("Added the component\t"+component);
	}
	public abstract UIComponent createUIComponent(String type);
}
class WindowsUIComponentCreator extends UIComponentCreator
{

	@Override
	public UIComponent createUIComponent(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	 void createUIComponent()
	 {
		 System.out.println("WindowsUIComponentCreator createUIComponent ");

	 }
	
}
class LinuxUIComponentCreator extends UIComponentCreator
{

	@Override
	public UIComponent createUIComponent(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	 void createUIComponent()
	 {
		 System.out.println("LinuxUIComponentCreator createUIComponent ");

	 }
	
}
class MacUIComponentCreator extends UIComponentCreator
{

	@Override
	public UIComponent createUIComponent(String type) {
		// TODO Auto-generated method stub
		return null;
	}
	 void createUIComponent()
	 {
		 System.out.println("MacUIComponentCreator createUIComponent ");
	 }
	
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindowsUIComponentCreator W1=new WindowsUIComponentCreator();
		LinuxUIComponentCreator L1=new LinuxUIComponentCreator();
		MacUIComponentCreator M1=new MacUIComponentCreator();
		W1.createUIComponent();
		L1.createUIComponent();
		M1.createUIComponent();
//		Button button = new Button();
//		button.show();
	}

}
