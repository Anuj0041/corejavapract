package learning.coreprogrms;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name=sc.nextLine();
		System.out.println("Enter your course");
		String course=sc.next();//will accept string before delimetere is space 
		System.out.println(name+"you have taken admission in "+course);
		System.out.println("This is for comment");
		System.out.println("this is another comment");
		sc.close();
		
		
	}

}
