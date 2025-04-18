package learning.inheritance;

public class MultiLevelDemo {
	public static void main(String[] args) {
		Laptop laptop=new Laptop();
		laptop.setDevice("HP",125000.00);
		laptop.setDigital("Touchscreen", "1TB");
		laptop.setLaptop("Windows","coreI7");
		laptop.show();
	}
	

}
class Device{
	private String company;
	private double price;
	public void setDevice(String company,double price)
	
	{
this.company=company;
this.price=price;
}
public void show()
{
	System.out.println("company Name is "+company+"and price is "+price);
}
}
class digitalDevice extends Device
{
	private String screenType,storage;
	public void setDigital(String screenType,String storage)
	{
		this.screenType=screenType;
		this.storage=storage;
	}
	public void show()
	{
		super.show();
		System.out.println("screen type is "+screenType+" and storage is "+storage);
	}
}
class Laptop extends digitalDevice
{
	private String os,processor;
	public void setLaptop(String os,String processor)
	{
		this.os=os;
		this.processor=processor;
		
	}
	public void show()
	{ 
		Class c=getClass();//it will return class name with package Name
		String name=c.getSimpleName();//it will return only class name
		System.out.println(name +"Description are as follows");
		//System.out.println(getClass().getSimpleName()+"Description are as follows);
		super.show();
	System.out.println("os Name is "+os+" and processor is "+processor);
	}
}
