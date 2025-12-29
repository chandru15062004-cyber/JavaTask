package org.cons;

public class Cont {
	public Cont() {
		this(123456789l);
		System.out.println("Default Contructor");
	}
	public Cont(String Name,float Salary) {
		this(13.0f,1111.00);
		System.out.println("Your name is: "+Name+"\n"+"Your Salary is :"+Salary);
	}
	public Cont(long Phone) {
		this("CC",12.0f);
		System.out.println("Your No. is: "+Phone);
	}
	public Cont(float Hieght,double rank) {
		System.out.println("Your hieght is: "+Hieght+"\n"+"Your year is: "+rank);
	}
	public static void main(String[] args) {
		Cont D=new Cont();
	}
}
