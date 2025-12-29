package org.com;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("15 Inches");
	}
	public static void main(String[] args) {
		Desktop D=new Desktop();
		D.computerMode();
		D.desktopSize();
	}

}
