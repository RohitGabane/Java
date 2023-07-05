package m;

class login{
	public void accept(String user, String password) throws InvalidCredentialsException 
	{
		if (user.equals("scott") && password.equals("tiger")) 
		{
			throw new InvalidCredentialsException("invalid credentials have been entered...");
		} 
		else
		{
			System.out.println("Successful Login");
		}
	}

}
