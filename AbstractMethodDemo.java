package learning.inheritance;



public class AbstractMethodDemo {
	public static void main(String[] args) {
	OrthopedicDoctor ortho=new OrthopedicDoctor();
	ortho.treatment();
	Neurologist neuro=new Neurologist();
	neuro.treatment();
	}

}
abstract class Doctor
{
	public abstract void treatment();
	
}
class OrthopedicDoctor extends Doctor

{
	public void treatment()
	{
		System.out.println("provide treatment for Bones");
		
	}
	
}
class Neurologist extends Doctor
{
	public void treatment()
	{
		System.out.println("provide treatment for Brain and nervous system");
	}
	public void operation()
	{
		//blank body definition
	}
}
