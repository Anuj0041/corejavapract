package learning.multithreading;

public class DaemonThreadDemo {
	public static void main(String[] args) {
		
		
		
		CustomDaemonThread ct=new CustomDaemonThread();//new thread
		ct.setName("Daemon");
		ct.setDaemon(true);//to create dameon thread
		
		ct.start();
		System.out.println("Main Thread Task");
		for(int i=1;i<=110;i++) {
			System.out.println(i);
	}
	}

}
class CustomDaemonThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=30;i++) 
		{
		System.out.println(i+getName());	
		}
	}
}
