package learning.oops;

public class InstanceBlockDemo {
	public static void main(String[] args) {
		Pen p=new Pen();
	}
	

}
//iv,ib,constructor
class Pen
{
	String company="classMate", color="Black";
	{
	System.out.println("In instance block before "+company+color);
	company="Parker";
	color="red";
	System.out.println("In instance block pen details are "+company+ color);
	}
	Pen()
	{
		company="Houser";
		color="Blue";
		System.out.println("In constructor pen details are "+company+ color);
	}
	
}
