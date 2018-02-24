public class JAgnosticism 
{
	public static String operatingsystemName() 
	{
		return System.getProperty("os.name");
	}
	
	public static Boolean environmentIs64Bit() 
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
