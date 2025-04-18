package learning.collections;
import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args)
	{
	ArrayList<String> nameList=new ArrayList<>();//type safe ArrayList
	nameList.add("Scoot");
	nameList.add("Smith");
	nameList.add("Scoot");
	nameList.add("Joy");
	System.out.println(nameList);
	//fetch individual element
	for(int i=0;i<nameList.size();i++) {
		String name=nameList.get(i);//fetch the value from given index position
		System.out.println(name.toUpperCase());
		
		
		
	}
	System.out.println("Another way to fetch Data from ArrayList");
	for(String name:nameList)
	{
		System.out.println(name.toLowerCase());
	}
	
	nameList.add(2,"Mike");
	System.out.println(nameList);
	
	
	nameList.remove("Mike");
	System.out.println("After Removal ArrayList "+nameList);
	
	System.out.println("Removal of all Scotts");
	for(int i=0;i<nameList.size();i++)
	{
		String name=nameList.get(i);
		if(name.equalsIgnoreCase("scott"))
			//nameList.remove(name);//to remove all scotts from the list
		nameList.set(i, "scottTiger");//to edit data
		
		
	}
	System.out.println(nameList);
		
	
	
	
	
	
	
	}

}
