/*1)create a customer class with following attributes
	custid
	custname
	address
	age
create one instance of it and store it in a file. (Serialization).
now open a file, read the object and read its contents . (Deserialization)*/
import java.io.*;
//import java.io.*;
class Myclass implements Serializable
{
	private int custid=10;
	private String custName="ronny";
	private String address="Dharashiv";
	private int age=22;

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
public class Demo1 
{
	public static void main(String[] args)throws Exception 
	{
		Myclass m1=new Myclass();
        System.out.println("custname : " + m1.getCustName() +  
                "    age : " + m1.getAge() + "  address : " + m1.getAddress() + "  Custid: " + m1.getCustid()); 
        FileOutputStream fos=new FileOutputStream("abcd.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);  
         oos.writeObject(m1);
         //Deserilization
         FileInputStream fis=new FileInputStream("abcd.txt");
         ObjectInputStream ois=new ObjectInputStream(fis);  
         Myclass ref=(Myclass)ois.readObject();
         System.out.println("custname : " + m1.getCustName() +  
                 "    age : " + m1.getAge() + "  address: "+m1.getAddress() + "  Custid: " +m1.getCustid()); 


	}

}
