package org.bike;

public class Bike {
	public void cost(String name) {
		System.out.println("Your Price is : "+name);
	}
	public void speed(String name) {
		System.out.println("your acceleration is : "+name);
		
	}
	public static void main(String[] args) {
		Bike S=new Bike();
		S.cost("ss");
		S.speed("ser");
	}

}
