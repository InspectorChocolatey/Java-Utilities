package crestomathy;

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
 */

public class JProcess 
{
	public static void main(String[] ARGS)
	{
		if(ARGS[0] == "Start")
		{
			if (!)
			{
				
			}
		}
		else if(ARGS[1] == "Stop")
		{

		}
		else if(ARGS[2] == "Exists")
		{

		}
		else
		{

		}
	}


	public static boolean existsProcess(String processName) throws java.io.IOException, java.lang.InterruptedException
	{
		java.lang.ProcessBuilder pb = new java.lang.ProcessBuilder("tasklist.exe");
		java.lang.Process process = pb.start();
		String tasksList = (process.getInputStream()).toString();
		return tasksList.contains(processName);
	}
	
	public static void startProcess(String path) throws java.io.IOException
	{
		ProcessBuilder proc = new ProcessBuilder(path);
		proc.redirectOutput(ProcessBuilder.Redirect.INHERIT);
		proc.start();
	}
	
	public static void stopProcess(String processname) throws java.io.IOException 
	{
		Runtime.getRuntime().exec("taskkill /F /IM "+ processname);
	}
}
