package learning.oops;

public class CircleDemo {
	float radius;
	public static void main(String[] args) {
		
		CircleDemo c=new CircleDemo();
		c.setRadius(2);
		c.area();
		c.circumference();
		c.getRadius();
		
	}
		void setRadius(float r) {
			radius =r;
			}
		 void area() {
			float area =3.14f*radius*radius ;
			 System.out.println("Area: " + area);
			
		}
		public void circumference() {
			float circumference = 2*3.14f*radius;
			System.out.println("circumference: " + circumference);
		
	
	}	
		
		
		void getRadius()
		{
			
			System.out.println("radius is "+radius);
		}

}	



