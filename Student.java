package learning.collections;

public class Student {
	public String toString()//overriding tostring method of super class object it is used to represent object in the from of string
	{
		return name +" "+rollnumber;
	}
	private String name,rollnumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber) {
		this.rollnumber = rollnumber;
	}

}
