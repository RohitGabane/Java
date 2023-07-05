/*Q.1) Create user defined checked exception "InvalidCredentialsException".
define a class "Login" with void accept(String user,String password) method. this accept should
check if user and password are not "scott" and "tiger" respectively, it should raise
"InvalidCredentialsException" saying that "invalid credentials have been entered" or else display a
message “Successful Login”. define a class "Demo" with main function. In this main function accept
username and password from the user and pass them to “accept()” method of “Login” class.*/
package m;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter user name : ");
		String user = sc.next();
		System.out.println("Enter the password : ");
		String password = sc.next();
		login l1 = new login();
		try {
			l1.accept(user, password);
		} catch (InvalidCredentialsException e) {

			e.printStackTrace();
		}

	}

}