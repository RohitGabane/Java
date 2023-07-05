//Revision_3) 
//create 4 classes A,B,C,D with member functions Afun(),Bfun(),Cfun() and Dfun() respectively.
//now define "Demo" class with main function. Inside main function create array of Object 
//class which will store instances of above mentioned classes. Traverse through this array 
//and call "Cfun()" of class C only.
class A{

	public void Afun(){
		System.out.println("A");
	}
}
class B{
	public void Bfun(){
		System.out.println("B");
	}
}
class C{
	public void Cfun(){
		System.out.println("C");
	}
}
class D{
	public void Dfun(){
		System.out.println("D");
	}
}

public class Demo3{
	public static void main(String []args) {
		Object []arr = new Object[4];
		arr[0]=new A();
		arr[1]=new B();
		arr[2]=new C();
		arr[3]=new D();
		
		for(int i=0;i<=3;i++) {
			if(arr[i] instanceof C) {
				C obj = (C)arr[i];
				obj.Cfun();
			}
		}
	}
}

