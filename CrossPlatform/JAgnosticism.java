
public class JAgnosticism 
{
	public static String operatingSystemName() 
	{
		return System.getProperty("os.name");
	}
	
	
	public static String computername() throws java.net.UnknownHostException 
	{
	    	java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
	    	return localMachine.getHostName();
	}
	
	
	
//	public static String computername()
//	{
//		String hostname;
//		try 
//		{
//			java.net.InetAddress address;
//			address = java.net.InetAddress.getLocalHost();
//			hostname = address.getHostName();
//		}
//		catch (java.net.UnknownHostException ex)
//		{
//			hostname = "Unknown";
//		}
//		return hostname;
//	}
	
	public static String username() 
	{
	    	return System.getProperty("user.name");
	}
	
	public static Boolean operatingSystemIs64Bit() 
	{
		boolean is64bit = false;
		if (System.getProperty("os.name").contains("Windows")) 
		{
		    is64bit = (System.getenv("ProgramFiles(x86)") != null);
		} 
		else 
		{
		    is64bit = (System.getProperty("os.arch").indexOf("64") != -1);
		}
		return is64bit;
	}
	
	
}
