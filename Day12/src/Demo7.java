/*7) create a hierarchy as follows
	interface Game- play() method
	Derive at least 3 classes from it. ( Cricket, Chess and Football )
Now Create generic class which can take Game type (i.e. any sub type of Game) as parameter.
In this class try to call the play() method of the class which is passed to it.*/
interface Game
{
   void play();	
}
class Circket implements Game
{
	@Override
	public void play() 
	{
		System.out.println("in circket play");		
	}
	
}
class Chess implements Game
{
	@Override
	public void play() 
	{
		System.out.println("in Chess play");
	}
}
class Football implements Game
{
	@Override
	public void play() 
	{
		System.out.println("in Football play");
	}
	
}
class common<T extends Game>
{
	T ob;
	public common(T ob)
	{
		this.ob=ob;
	}
	public void Function()
	{
		ob.play();
	}
}
public class Demo7 {

	public static void main(String[] args) 
	{
		common<Football> c1=new common<Football>(new Football());
		c1.Function();
		common<Chess> c2=new common<Chess>(new Chess());
		c2.Function();
		common<Circket> c3=new common<Circket>(new Circket());
		c3.Function();

	}

}
