/*4) on the developer side create following checked exception:
	InvalidLengthException
create necessary jar file and documentation.

on client side

public class Authenticator
	with
a parameterized constructor which takes String as a password.
this class also will have "done()" method with "successful authentication" message.
Parameterized constructor should check the length of the password passed if it is less than 5 or more that 9 , it should raise "InvalidLengthException" 
	[ constructor shouldn't handle the exception]

create a class "Demo" with main
	inside main function create the object of "Authenticator" class and invoke "done()" method.*/

 class InvalidLengthException extends Exception
{
	public InvalidLengthException(String msg)
	{
		super(msg);
		
	}

}

public class Demo4 
{
    public static void main(String[] args) 
    {
        try 
        {
            Authenticator auth = new Authenticator("abhirajsurve");
            auth.done();
        } 
        catch (InvalidLengthException e) 
        {
            System.out.println(e.getMessage());
        }
    }
}




 class Authenticator 
{
    private String password;
    
    
    public Authenticator(String password) throws InvalidLengthException 
    {
        if (password.length() < 5 || password.length() > 9)
        {
            throw new InvalidLengthException("Password length must be between 5 and 9 characters.");
        }
        this.password = password;
    }
    
    public void done()
    {
        System.out.println("Successful authentication.");
    }
}