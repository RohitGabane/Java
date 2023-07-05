
class Person {
	private String name;
	private int age;
	
	public Person(String a,int b) throws VotingNotAllowedException {
		if(b<18) {
			throw new VotingNotAllowedException("Not applicable");
		}
		this.name = a;
		this.age=b;
	}
	public String toString() {
		return "Name = "+this.name+" & Age is "+this.age;
	}
}
class VotingNotAllowedException extends Exception {
	public VotingNotAllowedException(String s) {
		super(s);
	}
}

public class Demo5 {

	public static void main(String[] args) {
		try {
		Person obj = new Person("Vivek",26);
		System.out.println(obj);
		}
		catch(VotingNotAllowedException ve) {
			System.out.println(ve);
		}
	}
}
