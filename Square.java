package learning.oops;



public class Square {
	int side;
	Square()//default constructor ->no parameter
	{
		side=5;
		
	}
	void area()
	{
		System.out.println("Area of Square is "+(side*side));
	}
	void display()
	{
		System.out.println("side of square is "+side);
			
		}
	public static void main(String[] args) {
		Square s=new Square();//constructor calling at the time of object creations
	s.area();
	s.display();
	}
	
	}

