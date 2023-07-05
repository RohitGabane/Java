/*6) create a HashMap.
store  prn no. and students name of 10 students inside the HashMap.
display it using iterator.*/
import java.util.*;
import java.util.Map.Entry;
public class Demo6
{
	public static void main(String[] args) {
     Map<Integer,String>h=new HashMap<Integer,String>();
        h.put(1,"Ronny");
		h.put(2,"tiger");
		h.put(3,"Virat");
		h.put(4,"Ms-Dhoni");
		h.put(5,"Suresh");
		h.put(6,"Ravindra");
		h.put(7,"Rishab");
		h.put(8,"Rohit");
		h.put(9,"Ishan");
		h.put(10,"Shubhman");
		Set<Entry<Integer,String>> set=h.entrySet();
//		set<Entry<
		// get an iterator
		Iterator<Entry<Integer,String>> itr=set.iterator();
		// display elements
		while(itr.hasNext())
		{
			Map.Entry<Integer,String> me=(Entry<Integer,String>)itr.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());
		}
//		System.out.println();
	}

}
