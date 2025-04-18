package learning.collections;
import java.util.*;
public class Student_TreeSet {
	public static void main(String[] args) 
	{
		RollNumberComparator rc=new RollNumberComparator();
		TreeSet<Student>studentSet=new TreeSet<>(rc);//paramterised
		Student s=new Student();
		s.setName("Scott");
		s.setRollnumber("101");
		
		studentSet.add(s);//adding one object
		
		Student s1=new Student();
		s.setName("Scott");
		s.setRollnumber("102");
		studentSet.add(s1);//adding another object
		System.out.println(studentSet);
		for(Student st:studentSet) 
		{
			System.out.println("studentName is "+st.getName());
			System.out.println("StudentRollNumber is "+st.getRollnumber());
		}
		
		
	}

}
