public class JAgnosticism 
{
	public static String operatingSystem() 
	{
		return System.getProperty("os.name");
	}
	
	public static String computername() throws java.net.UnknownHostException 
	{
	    	java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
	    	return localMachine.getHostName();
	}
	
	public static String username() 
	{
	    	return System.getProperty("user.name");
	}
	
	public static Boolean systemIs64Bit() 
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
