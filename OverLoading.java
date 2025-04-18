package learning.oops;

public class OverLoading {
	void add(int x,int y)
	{
		System.out.println("sum of two numbers is "+(x+y));
		
	}
	void add(int a,float b) {//two parameter method
		System.out.println("sum of one int and one float is"+(a+b));
	}
void add(float x, float y, float z)
{
	System.out.println("sum of three floats is"+(x+y+z));
		
	}
public static void main(String[] args) {
	OverLoading ol=new OverLoading();
	ol.add(2, 3);
	ol.add(2, 3.4f);//int and float
	ol.add(3.0f, 2.5f,1.6f);
	ol.add(5, 3);//int and float
	//type promotion -> if exat matching method not found and 
	//higher data type method are present then it will call that method
	//and smaller value gets converted into bigger data type value
	
}
}

