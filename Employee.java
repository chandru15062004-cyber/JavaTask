package org.emp;

public class Employee {
	public void empId(String Name) {
		System.out.println("Your Name is: "+Name);
	}
	public void empId(int PhoneNo) {
		System.out.println("Your Phone No. is: "+PhoneNo);
	}
	public void empId(float salary) {
		System.out.println("Credited amount is: "+salary);
	}
	public static void main(String[] args) {
		Employee Z=new Employee();
		Z.empId("Chandru");
		Z.empId(01234656);
		Z.empId(28000.0f);
	}

}

