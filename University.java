package org.univ;

public class University {
	public void ug(String Name) {
		System.out.println("Your degree is : "+Name);
	}
	public void pg(String Name) {
		System.out.println("Your degree is : "+Name);
	}
	public static void main(String[] args) {
		University Z=new University();
		Z.ug("sf");
		Z.pg("ed");
	}

}
