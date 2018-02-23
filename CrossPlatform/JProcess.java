import java.io.IOException;

/*
 * @author NicholasJ
 *
 * references:
 *	
 *	https://stackoverflow.com/questions/3634853/how-to-create-a-directory-in-java
 *	https://stackoverflow.com/questions/1319286/using-runtime-exec-in-java
 *	https://stackoverflow.com/questions/19005410/check-if-some-exe-program-is-running-on-the-windows
 *
 *
 *	[ ] Works on windows
 *	[ ] Works on linux
 *
 *	Windows examples:
 *
 *		java JProcess "Start" "C:\Windows\System32\notepad.exe";
 *		java JProcess "Stop" "C:\Windows\System32\notepad.exe";
 *
 *       Linux examples:
 *       
 *     java JProcess "Start" "";
 *     java JProcess "Stop" "";  
 *
 *
 *
 */

public class JProcess 
{
	public static void main(String[] ARGS) throws IOException, InterruptedException
	{
		String action, obj;
		
		try 
		{
			action = ARGS[0];
			obj   = ARGS[1];
		} 
		catch (Exception e) 
		{
			printHelp();
			System.exit(0);
		}
		finally
		{
			action = ARGS[0];
			obj = ARGS[1];
			
			if (action.isEmpty()) 
			{
				printHelp();
				System.exit(0);
			}
			else if(obj.isEmpty()) 
			{
				printHelp();
				System.exit(0);
			}
			else 
			{
				switch (action) 
				{
					case "Start":
						processStart(obj);
						System.exit(0);
						break;

					case "Stop":
						processStop(obj);
						System.exit(0);
						break;
					
					case "Exists":
						processExists(obj);
						System.exit(0);
						break;
					
					case "?":
						printHelp();
						System.exit(0);
						break;
						
					default:
						printHelp();
						System.exit(0);
						break;
				}
			}
		}
		
		
		
		
		
//		if(ARGS[0] == "Start")
//		{
//			if (ARGS[1].isEmpty())
//			{
//				processStart(ARGS[1]);
//			}
//			else 
//			{
//				System.out.println("");
//			}
//		}
//		else if(ARGS[1] == "Stop")
//		{
//
//		}
//		else if(ARGS[2] == "Exists")
//		{
//
//		}
//		else
//		{
//
//		}
	}


	private static void printHelp() 
	{
		String help = "aaaaaaaaaaaaaaaaaaaaaaaaaaa" +
							 "bbbbbbbbbbbbbbbbbbbbbbbbb" +
							 "cccccccccccccccccccccccccccccccc" +
							 "ddddddddddddddddddddddddd";
		
		System.out.println(help);
	}


	public static boolean processExists(String processName) throws java.io.IOException, java.lang.InterruptedException
	{
		java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder("tasklist.exe");
		java.lang.Process process = pb.start();
		String tasksList = (process.getInputStream()).toString();
		return tasksList.contains(processName);
	}
	
	public static void processStart(String path) throws java.io.IOException
	{
		ProcessBuilder proc = new ProcessBuilder(path);
		proc.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		proc.start();
	}
	
	public static void processStop(String processname) throws java.io.IOException 
	{
		Runtime.getRuntime().exec("taskkill /F /IM "+ processname);
	}
}
