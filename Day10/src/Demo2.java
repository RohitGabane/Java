//Revision_2)
//Define a class Sample with member variable “char ch” and a parameterized constructor. 
//Create some instances(at least 2) of this class by passing any alphabet.  Now achieve following tasks:
//
//a) when you print the reference it should be display the character which was passed during instantiation.
//b) if two instances have same character or an alphabet, their "equals()" should return true 
//		and obviously "hashCode()" also should be same.
class Sam {
	char ch;
	public Sam(char c) {
		this.ch=c;
	}
	public String toString() {
		return Character.toString(ch);
	}
	
	public boolean equals(Object ob) {
		if(ob instanceof Sam) {
			Sam s = (Sam)ob;
			return ch==s.ch;
		}else {
			return false;
		}
	}
	
	public int hashcode() {
		return Character.hashCode(ch);
	}
}

public class Demo2{
	public static void main(String []args) {
		Sam ob1 = new Sam('a');
		Sam ob2 = new Sam('a');
		System.out.println(ob1);
		System.out.println(ob2);
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashcode());
		System.out.println(ob2.hashcode());
	}
	
}
