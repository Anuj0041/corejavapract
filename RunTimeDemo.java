package learning.interfaces;

public class RunTimeDemo {
	public static void main(String[] args) 
	{
		Teaching t=null;//interface reference variable
		MathsTeacher mt=new MathsTeacher("Scott");
		t=mt;//run time polymorphism
		t.teach("Hindi");
		//t.getName();error
		mt.getName();
		PhysicsTeacher pt=new PhysicsTeacher("Smith");
		t=pt;//Run time Polymorphism
		t.teach("English");
		pt.getName();
	}

}
class MathsTeacher implements Teaching
{
	private String name;
	public MathsTeacher(String name)
	{
		this.name=name;
		
	}
	public void teach (String medium)
	{
		System.out.println(name+" Teaches Maths in "+medium );
	}
	public void getName()
	{
		System.out.println("Teacher Name is " + name);
	}
}
class PhysicsTeacher implements Teaching
{
	private String name;
	public PhysicsTeacher(String name)
	{
		this.name=name;
		
	}
	public void teach (String medium)
	{
		System.out.println(name+" Teaches Physics in "+medium );
	}
	public void getName()
	{
		System.out.println("Teacher Name is " + name);
	}

public void labSessions()
{
	System.out.println(name + "takes lab for physics practicals");
}
}









