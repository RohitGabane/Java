//Revision_1) 
//Define a class “MyClass”. Define a class “Everything” and define a member function with 
//variable no. of argument inside it. Define  a class Demo1  and define main function in it. 
//From main function , call the function of class Everything and make sure you can pass any 
//arguments , it will take and display. It should even take instance of “MyClass” and display.
class myclass {
	public String toString() {
		return "myclass []";
	}
}

class Everything {
	public void disp(Object ...k) {
		for(int i=0;i<k.length;i++) {
			System.out.println(k[i]);
		}
	}
}

public class Demo1 {
	public static void main(String[] args) {
		Everything e1 = new Everything();
		e1.disp(10,"name",3.445,new myclass());
	}
}

