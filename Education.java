package org.edu;

public class Education extends Medicine{
	public void ug() {
		System.out.println("UG");
	}
	public void pg() {
		System.out.println("PG");
	}
	public static void main(String[] args) {
		Education ED=new Education();
		ED.bE();
		ED.bTech();
		ED.phySiyo();
		ED.dental();
		ED.mbbs();
		ED.bsc();
		ED.bED();
		ED.bA();
		ED.bBA();
		ED.ug();
		ED.pg();
	}
	

}
