package learning.oops;

public class HasADemo {
	public static void main(String[] args) {
		Teacher t=new Teacher();
		t.setName("Scott");
		t.setSubject("java");
		School sc=new School();
		sc.setSchool("CMS",t);
		sc.getSchool();
	}

}
class Teacher
{
	String name,subject;
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{

return name;
	}

void setSubject(String subject)
{
	this.subject=subject;

}
String getSubject() {
	return subject;
 }
}
class School{
	Teacher teacher;
	String school_name;
	void setSchool(String school_name,Teacher teacher) {
		this.school_name=school_name;
		this.teacher=teacher;
	}
	void getSchool()
	{
		System.out.println("School Name is "+school_name);
	String tName= teacher.getName();
	System.out.println("Teacher name is "+tName);
	}
}