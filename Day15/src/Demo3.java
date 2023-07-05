
/*define a class Player
 	with
		int playerid
		String name
		int runs
		String countryname

		define
			parameterized constructor and getter methods

create 10 players and store them inside a list.

using java8 stream api:




*/
import java.util.*;
class Player
{
	int playerid;
	String Name;
	int run;
	String Countryname;
	/**
	 * @param playerid
	 * @param name
	 * @param run
	 * @param countryname
	 */
	public Player(int playerid, String name, int run, String countryname) {
		super();
		this.playerid = playerid;
		Name = name;
		this.run = run;
		Countryname = countryname;
	}
	
}
public class Demo3
{
	public static void main(String[]args)
	{
		Player p1=new Player(8,"jaddu",2500,"INDIA");
		Player p2=new Player(55,"Wanrner",5500,"AUS");
		Player p3=new Player(17,"Du pleasis",4800,"RSA");
		Player p4=new Player(18,"Virat",9500,"INDIA");
		Player p5=new Player(31,"S Smith",7500,"AUS");
		Player p6=new Player(71,"babar",6500,"PAKISTHAN");
		Player p7=new Player(95,"Rashid",1500,"AFS");
		Player p8=new Player(88,"POLLARD",6000,"WI");
		Player p9=new Player(75,"BROOK",3700,"ENG");
		Player p10=new Player(45,"Rohit",8500,"INDIA");
		
		List <Player>l1=new ArrayList();
		l1.add(p1);
		l1.add(p2);
		l1.add(p3);
		l1.add(p4);
		l1.add(p5);
		l1.add(p6);
		l1.add(p7);
		l1.add(p8);
		l1.add(p9);
		l1.add(p10);
		
		System.out.println(l1);

		/*1) display all the players representing "India".

	hint:- use "filter" to check players representing "India" and "forEach" method in order to print them.*/
		l1.stream().filter(s ->s.mapToString().sort());
		
/*2) find out how many players have scored more than 5000 runs.

	hint:- use "filter" to check players scored more than 5000 runs and "count" method to count them.*/
		
	}
}