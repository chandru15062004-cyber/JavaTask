package org.edu;

public class Arts {
	public void bSc(String degree) {
		System.out.println("Your graduation is : "+degree);

}public void bEd(String degree) {
	System.out.println("Your graduation is : "+degree);
}
	public void bA(String degree) {
		System.out.println("Your graduation is : "+degree);
	}
		public void bBA(String degree) {
			System.out.println("Your graduation is : "+degree);
		}
		public void ug(String degree) {
			System.out.println("Your graduation is : "+degree);
		}
		public void pg(String degree) {
			System.out.println("Your graduation is : "+degree);
		}
		public static void main(String[] args) {
			Arts D=new Arts();
			
			D.bSc("Arts Group 1");
			D.bEd("Arts Group 2");
			D.bA("Arts Gruop 3");
			D.bBA("Arts Group 4");
			D.ug("Arts Group 5");
			D.pg("Arts Group 6");
			
		}
}

