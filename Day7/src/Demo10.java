//create a class "Demo" with "disp()" which can take variable number of int arguments 
//and display the sum of all numbers passed to it.
//invoke "disp()" from main function.
public class Demo10 {
	 void disp(int a,int b)
	{
		int sum=0;
		sum=a+b;
		System.out.println(sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo10 d=new Demo10();
		System.out.println(".................");
        d.disp(84,48);
	}

}
