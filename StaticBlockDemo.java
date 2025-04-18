package learning.oops;

public class StaticBlockDemo 

{
	public static void main(String[] args) {
		
System.out.println(Passemger.TrainName);


Passemger.showTrain();
	}
	

}
class Passemger
{
	static String TrainName ="ABCD";//static variable,sb,static method
	
	static {
		//static block
		System.out.println("In static block before "+TrainName);
		TrainName="TejasExpress";
		System.out.println("In static block train name is "+TrainName);
		
	}
	static void showTrain()
	{
		System.out.println("In static block name is "+TrainName);
		
	}

}
