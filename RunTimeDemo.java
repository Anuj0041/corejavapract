package learning.inheritance;

public class RunTimeDemo {
public static void main(String[] args) {
	Cab c=null;
	OlaCab ola=new OlaCab();
	c=ola;//run time polymorphism
	c.fair();
	//c.tracking();cannot access sub class explicit method with super class variable
	ola.tracking();// can access with sub class reference variable
	InDrive in=new InDrive();
	c=in;
	c.fair();
	Uber uber=new Uber();
	c=uber;
	c.fair();
	
}
}
 abstract class Cab
{
	abstract void fair();
}
 class OlaCab extends Cab{
	 public void tracking()
	 {
		 System.out.println("tracking via GPS");
	 }
	 public void fair()
	 {
		System.out.println("15 Rs Per km"); 
	 }
 }
class InDrive extends Cab
 {
	 public void fair()
	 {
		 System.out.println("make your own bid to set the fair");
	 }
 }
class Uber extends Cab{
	public void fair() {
		System.out.println("10 Rs per km");
	}
}
