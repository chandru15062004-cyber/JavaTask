package org.bank;

public class AxisBank extends BankInfo {
	public void deposit(float money) {
		super.deposit(money);
	}
	public static void main(String[] args) {
		AxisBank Z=new AxisBank();
		Z.fixed(45.2f);
		Z.saving(1326.1f);
		Z.deposit(2000.0f);
	}

}
