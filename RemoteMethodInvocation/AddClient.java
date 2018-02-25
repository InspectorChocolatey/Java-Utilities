import java.rmi.*;

/**
 * @author Nicholas
 * 
 * -Implements the client side of this distributed application.
 * 
 * -Requires three command line arguments:
 * 		0.) server ip address 
 * 		1.) first number to be added
 * 		2.) second number to be added
 *
 */

public class AddClient 
{
	public static void main(String[] args) 
	{
		try 
		{
			String addServerURL = "rmi://" + args[0] + "/AddServer";
			AddServerIntf addServerIntf = (AddServerIntf)Naming.lookup(addServerURL);
			
			java.lang.System.out.println("The first number is: " + args[1]);
			double d1 = java.lang.Double.valueOf(args[1]).doubleValue();
			java.lang.System.out.println("The second number is: " + args[2]);
			double d2 = java.lang.Double.valueOf(args[2]).doubleValue();
			java.lang.System.out.println("The sum is: " + AddServerIntf.add(d1, d2));
		} 
		catch (Exception e) 
		{
			java.lang.System.out.println("Exception: " + e.getMessage());
		}
	}
}
