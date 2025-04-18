package learning.collections;
import java.util.*;
public class TreeSet_FetchData {
public static void main(String[] args) 
{
	TreeSet<String>cityCode=new TreeSet();
	cityCode.add("lko");
	cityCode.add("vns");
	cityCode.add("Bbk");
	cityCode.add("Pbh");
	for(String code:cityCode)
	{
		System.out.println("City Code is "+code);
	}
	//fetching data using Iterator<<interface>>
	System.out.println("---Data fetching Using Iterator Interface---");
	Iterator<String> it=cityCode.iterator();//assign reference of the TreeSet to iterator
	while(it.hasNext()==true) //it will check for item existence in the collection
		
	{
		String cd= it.next();
		if(cd.equals("lko"))
			it.remove();
		System.out.println("city code using iterator "+cd);
	}
	System.out.println(cityCode);
}
}
