
/**
 * 
 * References:
 * 
 *  
 *  https://stackoverflow.com/questions/1856565/how-do-you-determine-32-or-64-bit-architecture-of-windows-using-java
 * 
 */

public class Agnosticism 
{
	public static void main(String[] ARGS) 
	{
		String os = operatingSystem();
		System.out.println(os);
		
		if(os.contains("Windows"))
		{
			System.out.print("Windows: True");
		}
		else
		{
			System.out.println("Windows: False");
		}	
		if(environmentIs64Bit()) 
		{
			System.out.println("64 bit: True");
		}
		else 
		{
			System.out.println("64 bit: False");
		}
	}
	
	public static String operatingSystem() 
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
