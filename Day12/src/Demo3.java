/*3) create LinkedList with the values 10,20,30 and 40.
display it.
now insert 500 in the beginning.
	insert 400 at 2nd position.
	add 1000 at the end.
display the list again.*/
import java.util.*;
public class Demo3 
{
	public static void main(String[] args) {
     	List <Integer>l=new LinkedList<Integer>();
     	l.add(10);
     	l.add(20);
     	l.add(30);
     	l.add(40);
		System.out.println("Original contents of l  "+l);
		((LinkedList<Integer>)l).addFirst(500);
     	l.add(1,400);
		((LinkedList<Integer>)l).addLast(1000);
		System.out.println("After all contents of l  "+l);





	}

}
