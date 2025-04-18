package learning.multithreading;

public class RunnableThreadDemo
{
	public static void main(String[] args)
	{
		ComputerLab lab=new ComputerLab();
		Runnable r=lab;//run time polymorphism with interface
		Thread printerThread=new Thread(r,"HP");
		printerThread.start();
		
		
	}
	

}
class ComputerLab implements Runnable

{
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println("Printer thread Name is "+t.getName());
		for(int i=1;i<10;i++)
		{
			System.out.println("file "+i);
		}
		
	}
	
	
	
	
	
}
