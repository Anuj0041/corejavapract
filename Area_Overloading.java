package learning.oops;

public class Area_Overloading {
	
	void area(int side)
	{
		System.out.println("Area of Square is"+(side*side));
		
	}
	void area(int width,int height)
	{
		System.out.println("Area of Rectangle is"+(width*height));
		
	}
	void area(int base,float height)
	{
		System.out.println("Area of triangle is"+(.5f*base*height));
	}
	void area(float radius)
	{
		System.out.println("Area of circle is"+(3.14f* radius*radius));
		
	}
	public static void main(String[] args) {
		Area_Overloading ol=new Area_Overloading();
		ol.area(5.0f);//circle area
		ol.area(3);//square area
		ol.area(2,4.3f);//triangle area
		ol.area(3,5);//rectangle area
		
		
	}
}
