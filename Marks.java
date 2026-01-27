package org.results;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner Grade=new Scanner(System.in);
		
		System.out.println("Enter Student Id: ");
		int studentId = Grade.nextInt();
		System.out.println("Student Id is: "+studentId);
		
		Grade.nextLine();
		
		System.out.println("Enter Student Name");
		String StudentName = Grade.nextLine();
		System.out.println("Student name is : "+StudentName);
		
		System.out.println("Enter your mark1");
		short Mark1 = Grade.nextShort();
		System.out.println("Your mark1 is : "+Mark1);
		
		System.out.println("Enter the Mark2");
		short Mark2 = Grade.nextShort();
		System.out.println("Your mark2 is: "+Mark2);
		
		System.out.println("Enter the Mark3");
		short Mark3 = Grade.nextShort();
		System.out.println("Your mark3 is: "+Mark3);
		
		System.out.println("Enter the Mark4");
		short Mark4 = Grade.nextShort();
		System.out.println("Your mark4 is: "+Mark4);
		
		System.out.println("Enter the Mark5");
		short Mark5 = Grade.nextShort();
		System.out.println("Your mark5 is: "+Mark5);
		
		System.out.print("Your Toral Marks is : ");
		int Total=(Mark1+Mark2+Mark3+Mark4+Mark5);
		System.out.println(+Total);
		
		System.out.print("The Average Marks is: ");
		float Average=Total/5;
		System.out.println(Average);
		
	}
}
