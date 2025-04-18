package learning.inheritance;

public class FinalDemo {

  }
class Person
  {
  public final void greet()
  {
	  System.out.println("Namste");
	  
  }
  }
class Employee extends Person

    {
	//public void greet()//cannot override in sub class because it is final
	//{
		
	//}
	
	
}
