package learning.multithreading;

public class ThreadDemo {
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException ie) 
			{
				ie.printStackTrace();
			}
		}
		
	}

}
//to store data tempory in the memory to perform various operation
//Array-> similar data type elements ,ststic in nature(size fixed)
//ArrayList->growable in nature{unsafe collection, type safe colllection
//object get(int index)
//E get(int index)->fetch
//boolean add(E)->add object,Element->class