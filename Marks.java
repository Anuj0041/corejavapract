package learning.coreprogrms;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Marks in Hindi");
		int hi=sc.nextInt();
		
		System.out.println("Enter Marks in English");
		int eng=sc.nextInt();
		
		System.out.println("Enter Marks in Math");
		int mt=sc.nextInt();
		
		System.out.println("Enter your Name");
		String name=sc.nextLine();
		
		sc.nextLine();
		
		float avgMarks=(float)(hi+eng+mt)/3;
		System.out.println(name+" your average marks is "+avgMarks);
		sc.close();
		
	}

}
