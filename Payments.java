package learning.interfaces;

public interface Payments {
	String COUNTRY="INDIA";
	public void mode();
	public static void paymentRule()
	{
		System.out.println("Only Online transaction can be processed");
		System.out.println("Indian currency accepted only");
	}
	default void paymentDetails()
	{
		
	}

}
