package learning.oops;

public class ProductDemo {
	public static void main(String[] args)
	{
		Product pr=new Product();
		pr.setProduct("Laptop", "hP", 80000);
		pr.discount();
		pr.getproduct();
		System.out.println("    ");
		Product pr1=new Product();
		pr1.setProduct("Pen", "Parker", 600);
		pr1.discount();
		pr1.getproduct();
		System.out.println("  ");
		Product pr2=new Product();
		pr2.setProduct("Headphone","Boat" , 1000);
		pr2.discount();
		pr2.getproduct();
	}

}
