package learning.collections;
import java.util.*;
public class RollNumberComparator implements Comparator<Student>
{

	public int compare(Student s1, Student s2) {
		String r1=s1.getRollnumber();
		String r2=s2.getRollnumber();
		
		int status= r1.compareTo(r2);//0'-1'1 compare To belongs to string class
		
		return status;
	}

}
