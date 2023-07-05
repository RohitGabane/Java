/*1) accept 10 numbers from user and add them inside the ArrayList.

using ListIterator display all the numbers bidirectionally.*/
import java.util.Scanner;
import java.util.*;

public class Demo1 
{
    public static void main(String[] args) 
    {

    	List<Integer> mylist = new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
    	for(int i=1; i<=10; i++)
    	{
    	    mylist.add(sc.nextInt());
    	}
    	System.out.println(mylist);
    	sc.close();
    	//using iterator method
    	System.out.println("Using Iterator");
		Iterator<Integer> itr=mylist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
    }
}