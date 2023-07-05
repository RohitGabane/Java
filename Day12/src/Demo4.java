/*4) add 5 numbers inside CopyOnWriteArrayList and show how can you add one more number
 *  at the same time of traversal through its iterator.
*/
import java.util.*;
import java.util.concurrent.*;
public class Demo4 {

	public static void main(String[] args)
	{	
				List<Integer> l1= new CopyOnWriteArrayList<Integer>();
				l1.add(20);
				l1.add(25);
				l1.add(30);
				l1.add(35);
				l1.add(40);
				
				System.out.println("Before modification\t"+l1);
				Iterator<Integer> i =l1.iterator();
				while(i.hasNext())
				{
//					l1.add(500);

					System.out.println(i.next());
					l1.add(500);
				}
//				l1.add(500);
				System.out.println("After modification\t"+l1);
			
			}
		
	}


