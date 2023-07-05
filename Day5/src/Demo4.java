/*4) Create a class "Top1" with "disp1()" method.
From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
Now show how will u achieve dynamic polymorphism.*/
class Top1
{
	public void disp1()
	{
		System.out.println("in top 1");
	}
}
class Bottom1 extends Top1
{
	public void disp1()
	{
		System.out.println("In bottom1");
	}
}
class Bottom2 extends Top1
{
	public void disp1()
	{
		System.out.println("In bottom2");
	}
}
class Bottom3 extends Top1
{
	public void disp1()
	{
		System.out.println("In bottom3");
	}
}

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bottom1 b=new Bottom1();
       b.disp1();
       Top1 t=new Top1();
       t.disp1();
	}

}
