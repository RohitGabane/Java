 class Artist {
	public void perform() {
		System.out.println("Inside Artist");
	}
}


 class Actor extends Artist {
	public void perform() {
		System.out.println("Inside actor");
	}
	void changeGateUp()
	{
		System.out.println("as per the role demands");
	}

}


 class Musician extends Artist {
	public void perform() {
		System.out.println("Inside musician");
	}
}
 class Singer extends Artist {
 	public void perform() {
 		System.out.println("Inside Singer");
 	}
 }

 public class Demo4{
 	public static void main(String []args) {
 		Artist []arr = new Artist[3];
 		arr[0]=new Actor();
 		arr[1]=new Singer();
 		arr[2]=new Musician();
 		
 		for(int i=0;i<=2;i++) {
 			arr[i].perform();
 			if(arr[i] instanceof Actor) {
 				Actor obj = (Actor)arr[i];
 				obj.changeGateUp();
 			}
 		}
 	}
 }

