	public static void main(String[] args) 
	{
		java.io.Console cnsl = null;
	    String alpha = null;
	    String password = null;
	    try
	    {
	         cnsl = System.console();
	         if (cnsl != null) 
	         {
	            alpha = cnsl.readLine("Username: ");
	            char[] pwd = cnsl.readPassword("Password: ");
	            System.out.println("Name is: " + alpha);
	            password = new String(pwd);
	            //System.out.println("Password is: " + pwd.toString());
	            System.out.println("Password is: " + password);
	         } 
	         
	    } 
	    catch(Exception ex)
	    {
	         ex.printStackTrace();      
	    }
	}
