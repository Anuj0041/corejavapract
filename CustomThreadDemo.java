package learning.multithreading;

public class CustomThreadDemo 
{
	public static void main(String[] args)
	
	{
		System.out.println("Execution of Main Thread");
		Thread t=Thread.currentThread();//returns the reference of thread
		
		String name=t.getName();//returns the name of the thread
		
		System.out.println("Thread Name is "+name);
		
		 int priority=t.getPriority();//return the priority		
		 
		 System.out.println("priority of Main thread is "+priority);
		
		
		
		CustomThread newThread=new CustomThread();//object
		
		newThread.setName("Custom");
		
		newThread.start();//thread will be in Runnable state and waiting for CPU
	
		System.out.println("task of Main Thread");}

}
class CustomThread extends Thread


{
public void run() //overriding run method

{
	//define the task of thread
	String name="Anuj";
	
	System.out.println("thread Name is "+getName());
	
	for(int i=0;i<name.length();i++) {
		
		char c=name.charAt(i);
		
		System.out.println(c+" ");
		
		try {
			
			Thread.sleep(1000);
		}
		
		catch(InterruptedException ie)
		
		{
			ie.printStackTrace();
		}
		
		
		
	}
	
}
	
	
	
	
	
}