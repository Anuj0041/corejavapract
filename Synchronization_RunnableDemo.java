package learning.multithreading;

public class Synchronization_RunnableDemo {
	public static void main(String[] args) {
		Printer p=new Printer();
		Runnable r=null;
		CSLab lab=new CSLab(p, "JavaAssignment",5);
		r=lab;
		Thread t=new Thread(r,"BBDLab");//creating new Thread
		t.start();//runnable State
		//Thread t1=new Thread(new StaffRoom(p, "QqestionPaper",5),"BBDEC");
StaffRoom room=new StaffRoom(p, "QuestionPaper", 5);
r=room;
Thread t1=new Thread(r,"StaffRoom");
t1.start();
	}

}
class Printer
{
	public synchronized void print(String fileName,int copies) {
		Thread t=Thread.currentThread();
		String name=t.getName();
		for(int i=1;i<=copies;i++) 
		{
			System.out.println("Printed by "+name);
			System.out.println(fileName+i);
		}
	}
}

class CSLab implements Runnable
{
	private Printer printer;
	private String fileName;
	private int copy;
	public CSLab(Printer printer,String fileName,int copy)
	{
		this.printer=printer;
		this.fileName=fileName;
		this.copy=copy;
	}
	public void run()
	{
		printer.print(fileName, copy);
		
	}
	}
class StaffRoom implements Runnable
{
	private Printer printer;
	private String fileName;
	private int copy;
	public StaffRoom(Printer printer,String fileName,int copy)
	{
		this.printer=printer;
		this.fileName=fileName;
		this.copy=copy;
	}
	public void run()
	{
		printer.print(fileName, copy);
		
	}
	
	}