public static String username() 
{
    	return System.getProperty("user.name");
}

public static String computername() throws java.net.UnknownHostException 
{
    	java.net.InetAddress localMachine = java.net.InetAddress.getLocalHost();
    	return localMachine.getHostName();
}
