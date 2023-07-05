/*
OOPS_2) Define a class "MyClass" and make sure clients can instantiate it , 
a) without any argument
b) with one int argument
c) with two int arguments*/
class MyClass{
	public int a;
	public int b;
	
	 MyClass() {
	}

	 MyClass(int a) {
		this.a=a;
	}

	 MyClass(int a,int b) {
		this.a=a;
		this.b=b;
	}
}
	
	
public class Demo2 {

	public static void main(String[] args) {
		
		MyClass ob= new MyClass();//no argument
		System.out.println("Object 1 a= "+ob.a+" b ="+ob.b);
		
		MyClass ob2= new MyClass(20);//one argument
		System.out.println("Object 2 a= "+ob2.a+" b ="+ob2.b);
		
		MyClass ob3= new MyClass(50,70);//two argument
		System.out.println("Object 3 a= "+ob3.a+" b ="+ob3.b);

	}

}
