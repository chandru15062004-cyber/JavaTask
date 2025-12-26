package org.comp;

public class Desktop implements Hardware,SoftWare{
	public void deskmodel() {
		System.out.println("sfd");
	}
	public void hardwareResuorce() {
		System.out.println("sfffsf");
	}
	public void softwareResuorce() {
		System.out.println("ajjd");
	}
	public static void main(String[] args) {
		Desktop T=new Desktop();
		T.hardwareResuorce();
		T.softwareResuorce();
		T.deskmodel();
		
	}
	

}
