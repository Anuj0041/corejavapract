package learning.oops;

public class Rectangle_Method {
	float width,height;
	String color;
	void setDimension(float w,float h,String c)
	{//parameters
	//definition or body of the function
	
	width=w;//assigning values in the instance variables
	height=h;
	color=c;
	}
	void area()//IM
	{
		float a=width*height;
		System.out.println("Area of Rectangle is "+a);
	}
	
void peremeter() {
	float p =2*(width + height);
	System.out.println("Perimeter is" +p);
}
void getDimension() {
	System.out.println("width is "+width);
	System.out.println("height is "+height);
	System.out.println("color is "+color);
}
	
	
	
	
	public static void main(String[] args)
	{
		Rectangle_Method r=new Rectangle_Method();
		r.setDimension(2.3f, 2.0f, "Red");//calling instance method of Rectangle class
		r.area();
		r.peremeter();
		r.getDimension();
		
	}
}



