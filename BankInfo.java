package org.bank;

public class BankInfo extends AxisBank {
	public void saving() {
		System.out.println("Current");
	}
	public void fixed() {
		System.out.println("0 balance");
	}
	public static void main(String[] args) {
		BankInfo Bank=new BankInfo();
		Bank.deposit();
		Bank.fixed();
		Bank.saving();
	}

}
