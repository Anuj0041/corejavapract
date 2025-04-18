package learning.multithreading;

public class SynchronizationDemo {
	public static void main(String[] args) 
	{
		MultiplcationTable table=new MultiplcationTable();
		CalciThread calculator=new CalciThread(table,5);//create a new thread that is capturing multiplication as resource
	LaptopThread laptop=new LaptopThread(table,3);
	//create a new thread
	//that is capturing multiplication as resource
	calculator.setName("Casio");
	laptop.setName("HP");
	calculator.start();//thread is waiting for cpu
	laptop.start();//will be in runnable state
	
	}
	

		
	}

class MultiplcationTable
{
public synchronized 	void printTable(int num)//object locking synchronization
	{
		Thread t=Thread.currentThread();
		for(int i=1;i<=10;i++)
		{
			
			System.out.println(num+" * "+i+ " = "+(num*i)+t.getName());
		}
	}
	}
class CalciThread extends Thread
{
	MultiplcationTable table;
	private int number;
	public CalciThread(MultiplcationTable table,int number) {
		this.table=table;
		this.number=number;
	}
	public void run()
	{
		table.printTable(number);
	}
}
class LaptopThread extends Thread
{
	MultiplcationTable table;
	private int number;
	public LaptopThread(MultiplcationTable table,int number) {
		this.table=table;
		this.number=number;
	}
	public void run()
	{
		table.printTable(number);
	}
}
