package learning.collections;
import java.util.*;
public class ArrayListWrapper {
	public static void main(String[] args)
	{

		int x=30;
		
		ArrayList<Integer>numlist=new ArrayList<>();
		numlist.add(3);
		numlist.add(x);
		System.out.println(numlist);
		ArrayList<Double>priceList=new ArrayList<>();
		priceList.add(5000.99);
		priceList.add(6000.99);
		System.out.println(priceList);
		for(int i=0;i<priceList.size();i++) {
			double price= priceList.get(i);//auto unboxing
			price=price-100;
			System.out.println(price);
		}
	}

}
