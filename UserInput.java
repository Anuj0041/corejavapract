package learning.inputoutput;
import java.io.*;
public class UserInput {
	public static void main(String[] args)throws IOException
	
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Your Name");
	
	
	String name=br.readLine();
	System.out.println("Enter your age");
	String age=br.readLine();
		int a=Integer.parseInt(age);
		if(a>=18)
		{
			System.out.println(name +" you are elegible for job");
		}
		else {
			System.out.println(name +" you are not elegible for job");
		}
		br.close();
		
		
	}
     
    }
