package learning.inheritance;

public class Constructor_Inheritance {
public static void main(String[] args) {
	Cub c=new Cub();
}
}
class Animal{

	public Animal()
	{
		System.out.println("In animal class");
	}
}
class Lion extends Animal{
	public Lion() {
		super();
System.out.println("In Lion class");
}
}
class Cub extends Lion 
{
public Cub()
{
	super();//is used to call super class constructor
System.out.println("In cub class");	

}
}
