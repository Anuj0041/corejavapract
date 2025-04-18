package learning.interfaces;

public class TransActionDemo {
	public static void main(String[] args) {
		Payments.paymentRule();
		Employee e= new Employee();
		e.mode();
		User u=new User();
		
		u.mode();
		System.out.println(Payments.COUNTRY);
		
	}

}
class Employee implements Payments{
	

public void mode()
{
	System.out.println("Using Net Baking of "+COUNTRY);
}
public void paymentDetails()//default method overriding
{
	System.out.println("Purpose of transaction");
}
}
class User implements Payments{
	public void mode() {
		System.out.println("Using UPI");
	}
}
