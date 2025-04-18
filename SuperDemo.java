package learning.inheritance;

public class SuperDemo {
	public static void main(String[] args) {
		Bike b=new Bike();
				b.setVehicle("Black","Honda",100000);
				b.setBike("Petrol","50KM/Hour", 125);
				b.display();
	}

}

class Vehicle
{
	String color,company;
	double price;
	String accessories="Toolkit,firstAidBox";
	

	void setVehicle(String color,String company,double price)
	{
		this.color=color;
		this.company=company;
		this.price=price;
	}
	void display()
	{
		System.out.println("color is " + color + "company name is " + "and price is" +price);
	}
}
class Bike extends Vehicle
{
	private String accessories="Helmet";
	private String type,mileage;
	private int capacity;
	public void setBike(String type,String mileage,int capacity)
	{
		this.type=type;
		this.mileage=mileage;
		this.capacity=capacity;
	}
	void display()
	{
		super.display();//it is used to call super call method in sub class
		System.out.println("It is "+type +"Bike and its mileage is"+mileage+" and its capacity is "+capacity);
		System.out.println("accessories we provide "+accessories+super.accessories);
}
}

