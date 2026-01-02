package org.cons;

public class ParametarizedContstructor{
	public Cont() {
		this(123456789l);
		System.out.println("Default Contructor");
	}
	public ParametarizedContstructor(String Name,float Salary) {
		this(13.0f,1111.00);
		System.out.println("Your name is: "+Name+"\n"+"Your Salary is :"+Salary);
	}
	public ParametarizedContstructor(long Phone) {
		this("CC",12.0f);
		System.out.println("Your No. is: "+Phone);
	}
	public ParametarizedContstructor(float Hieght,double rank) {
		System.out.println("Your hieght is: "+Hieght+"\n"+"Your year is: "+rank);
	}
	public static void main(String[] args) {
		ParametarizedContstructor D=new ParametarizedContstructor();
	}
}

