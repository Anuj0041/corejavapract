package learning.oops;

public class ClassCalculation {
	void add (int n1,int n2)
	{
		System.out.println("addition of two numbers is "+(n1+n2));
		
	}
	void divide(int a,int b)
	{
		float result=(float) a/b;
		System.out.println("division of "+a +"and"+b+"is"+result);
	}
	public static void main(String[] args) {
		
	 {
		
	
			ClassCalculation c=new ClassCalculation();
			c.add(4,7);
			c.divide(4, 3);
		}
		
	}
	
}
