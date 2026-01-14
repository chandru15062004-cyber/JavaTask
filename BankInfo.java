package org.bank;

public class BankInfo {
	public void saving(float money) {
		
		System.out.println("Your savings is : "+money);
	}
	public void fixed(float money) {
		System.out.println("Your fixed amount is : "+money);
	}
	public void deposit(float money) {
		System.out.println("Your deposition is : "+money);
	}
	public static void main(String[] args) {
		BankInfo M=new BankInfo();
		M.saving(1326.1f);
		M.fixed(45.2f);
		M.deposit(1000.0f);
	}

}
