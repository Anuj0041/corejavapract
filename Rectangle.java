package learning.oops;

public class Rectangle {
	float width,height;//instance variables global variable
	String color;
	
	String colour;
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle();//object of rectangle class
		//r is the reference variables of rectangle class object
		
		//new key word is used for dynamic memory allocation
		
		// object are always created at run time
		System.out.println(r.width);// object of rectangle class
		System.out.println("Height is "+r.height);
		System.out.println("Colour of Rectangle "+r.colour);
		
		//another object of rectangle class
		

}
}
