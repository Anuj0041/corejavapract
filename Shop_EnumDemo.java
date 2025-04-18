package learning.enums;

public class Shop_EnumDemo {
	public static void main(String[] args) 
	{
		System.out.println("--------Available sizes are--------");
		System.out.println("size is "+Size.MEDIUM+"and value is "+Size.MEDIUM.getvalue());
		System.out.println("size is "+Size.SMALL+"and value "+Size.SMALL.getvalue());
		System.out.println("size is "+Size.LARGE+"and value "+Size.LARGE.getvalue());
	
	for(Size s:Size.values())//return array of containg enum  values
		
	{
		System.out.println(s);
		System.out.println(s.getvalue());//user defined method
		System.out.println(s.ordinal());
	}
	
	
	
	}

}
