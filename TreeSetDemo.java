package learning.collections;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args)
	{
		TreeSet<String>courseSet=new TreeSet<>();
		
		courseSet.add("Java");
		
		courseSet.add("Python");
		
		courseSet.add("Android");
		courseSet.add("Android");
		courseSet.add("Mern");
		courseSet.add("SpringBoot");
		System.out.println(courseSet);
		TreeSet<Integer>RollNumberSet=new TreeSet<>();
	
		RollNumberSet.add(20);
		RollNumberSet.add(20);
		RollNumberSet.add(3);
		RollNumberSet.add(120);
		
		RollNumberSet.add(7);
		System.out.println(RollNumberSet);
		
		
	}

}
