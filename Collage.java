package org.collage;

public class Collage extends Hostel {
	public void collageName() {
		System.out.println("SVPP");
	}
	public void collageCode() {
		System.out.println("SVPCET");
	}
	public void collageRank() {
		System.out.println("100000");
	}
	public static void main(String[] args) {
		Collage C=new Collage();
		C.deptName();
		C.studentName();
		C.studentDept();
		C.collageName();
		C.collageCode();
		C.collageRank();
		
	}

}
