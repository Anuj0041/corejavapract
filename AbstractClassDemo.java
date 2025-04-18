package learning.inheritance;

public class AbstractClassDemo {
	public static void main(String[] args) {
		//Shape s=new Shape(); error
		//creating object of sub class (Rectangle)
		Rectangle r=new Rectangle(10,4);
		r.setDim("Green", "2D");//calling method of super class
		r.area();
		r.getDim();//calling method of super class
		r.display();//calling method of subclass
	}

    }

abstract class Shape
     {
	private String color,shape,dimesion;
public Shape()
     {
	System.out.println("In Shape class constructor");
     }
	public abstract void area();
	public abstract void volume();
	public void setDim(String color,String dimension)
	{
		this.color=color;
		this.dimesion=dimension;
	}
	public void getDim() {
		System.out.println("color of " + dimesion +"shape is "+ color);
	}
	
    }
class Rectangle extends Shape{
	private int width,height;
	
	public Rectangle(int width,int height)
	{
		this.width=width;
		this.height=height;
	}
	public void area()//method overriding
	{
		int a=width*height;
		System.out.println("Area of Rectangle is "+a);
		
		
	}
	public void volume()
	{
		//blank body method overriding
	}
	public void display()
	{
		System.out.println("Rectangle width and height is "+width+" " +height);
	}
    }
//Cuboid class override all methods
