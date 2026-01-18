package org.phone;

public class InternalStorage {
	private void internType() {
		System.out.println("512 GB");
	}
	public static void main(String[] args) {
		InternalStorage x=new InternalStorage();
		x.internType();
		ExternalStorage y=new ExternalStorage();
		y.exterType();
		
		
	}

}
