
class First {
	public String toString() {
		return "First";
	}
}

class Second {
	public String toString() {
		return "Second";
	}
}

 class Third {
	public String toString() {
		return "Third";
	}
}
class Forth {
	public String toString() {
		return "Forth";
	}
}

public class Demo7 {
	public static Object returnObject(String s) {
		Object ob = null;
		
		try {
			Class c = Class.forName(s);
			ob=c.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return ob;
		
	}
	public static void main(String[] args) {
		Object ob = returnObject("devpack.Second");
		if(ob instanceof First) {
			First o1 = (First)ob;
			System.out.println(o1);
		}else if(ob instanceof Second) {
			Second o1 = (Second)ob;
			System.out.println(o1);
		}
		else if(ob instanceof Third){
			Third o1 = (Third)ob;
			System.out.println(o1);
		}else if(ob instanceof Forth) {
			Forth o1 = (Forth)ob;
			System.out.println(o1);
		}
	}
}

