package learning.oops;

public class Employee {
	String name,dept;
	float salary;
	void setEmployee(String name,String dept,float salary)
	{
		//this ->refers to current instance object
		this.name=name;
		this.dept=dept;
		this.salary=salary;
	}
void showEmployee()
{
System.out.println("Employee name is "+name);
System.out.println("Dept name is "+dept);
System.out.println("Salary is "+salary);

}
void grossSal()
{
	float da=salary*.10f;
	float hra=salary*.20f;
	float pf=salary*.12f;
	
	float gross=salary+hra+da-pf;
	System.out.println("gross salary is "+gross);
	
	
}

public static void main(String[] args)
{
     Employee emp=new Employee();
     emp.setEmployee("Scott", "CSE", 50000);
     emp.showEmployee();//current object is being identified with respect to method
     emp.grossSal();
}

}

