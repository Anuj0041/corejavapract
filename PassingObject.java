package learning.oops;

public class PassingObject {
	public static void main(String[] args) {
		Bike b=new Bike();//independent object
		b.setBike("OLA", "White");
		Person p=new Person();
		p.setInfo("Scott", b);
p.getInfo();
	}

}
class Bike
{
	String company,color;
	void setBike(String company,String color)
	{
		this.company=company;
		this.color=color;
		
	}
	void getBike()
	{
		System.out.println("color and company of the bike is "+color+" "+company);
	}
}

class Person
{
	String name;
	Bike b;
	
	void setInfo(String name,Bike b)
	{
		this.name=name;
		this.b=b;
		
	}
	void getInfo()
	{
		System.out.println("name is "+name);
		System.out.println(b);//hash code of the Bike class objects
		b.getBike();
	}
}