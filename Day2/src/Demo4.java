/*OOPS_4) Define a class "DemoOb". 
create an instance of it.
now create a reference and assign the reference created in the above statement.
	Discuss what happens?
Now since u have 2 references, take one of the reference and assign a new instance of the class.
	Discuss what happens?
(For ur discussion, write necessary comments in the program)*/
class DemoOb
{
//	private int num;
//	private int num1;
}
public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoOb ref1=new DemoOb();
		DemoOb ref2=ref1;//2 referances
		ref2=new DemoOb();
		System.out.println(ref2);

	}

}
