package learning.multithreading;

public class EvenOddThread {
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Main Thread execution");
		EvenOdd evenThread=new EvenOdd();
		evenThread.setName("Even");
		evenThread.start();
		evenThread.join();//to capture the CPU
		boolean b=evenThread.isAlive();//check live or dead
		System.out.println(b);
		EvenOdd oddThread=new EvenOdd();
		oddThread.setName("Odd");
		oddThread.start();
		System.out.println("Main Thread execution end");
	}
	
	}
class EvenOdd extends Thread
{
	public void run() 
	{
		String name=getName();
		System.out.println(name);
		for(int i=1;i<=20;i++) {
		if(name.equals("Even") && i%2==0)
		{
			System.out.println(i+" "+name);
		}
		if(name.equalsIgnoreCase("odd") &&i%2!=0)
			
		{
			System.out.println(i+" "+name);
		}
	}
	
	
}}//for loop close

















