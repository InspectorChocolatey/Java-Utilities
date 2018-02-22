import java.lang.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

	public static String hostname()
	{
		String hostname;
		try 
		{
			java.net.InetAddress address;
			address = java.net.InetAddress.getLocalHost();
			hostname = address.getHostName();
		}
		catch (UnknownHostException ex)
		{
			hostname = "Unknown";
		}
		return hostname;
	}
