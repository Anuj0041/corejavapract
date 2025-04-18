package learning.enums;

public enum Size //Enum object cannot created out side
{

	SMALL(38),MEDIUM(40),LARGE(42);//invoking constructor
	int value;//instance variable
	private Size(int value)//constructor
	{
		System.out.println("in constructor");
		this.value=value;
	}
	public int getvalue()//return the value of Constants
	{
		return value;
	}
	
}
