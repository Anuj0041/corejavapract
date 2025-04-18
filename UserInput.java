package learning.coreprogrms;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Name");
		String name=sc.nextLine();//will accept string along with space
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("hello "+name+ " you are "+age+"years old");
		if(age>=18)
			System.out.println(name+ "you can do registration on web site");
		else
			System.out.println(name+" wait for few more years");
		sc.close();		
	}

}
