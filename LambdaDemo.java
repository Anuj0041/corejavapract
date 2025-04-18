package learning.lambda;
interface Reading1{
	void read();
}
public class LambdaDemo 
{
	public static void main(String[] args)
	{
	//Reading1 r=()->{
		//read method body
		//System.out.println("Reading Book");
	//};
		Reading1 r=()->System.out.println("Reading Book");
			r.read();//calling Interface method
	}

}
