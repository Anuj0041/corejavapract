package learning.inputoutput;
import java.io.*;
public class TryWithResourceDemo {
public static void main(String[] args)
{
	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in));)
			
	{
		System.out.println("Enter radius of a circle");
		//String r=br.readLine();
		//double rd=Double.parseDouble(r);
		double radius=Double.parseDouble(br.readLine());
		double area=3.14*radius*radius;
		System.out.println("Area of the circle is "+area);
	}
	catch(IOException ie)
	{
		ie.printStackTrace();
	}
	
}
}
