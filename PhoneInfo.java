package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("Redmi K50i");
	}
	private void phoneImeiNum() {
		System.out.println("JGH6564444454546");
	}
	private void camera() {
		System.out.println("64 MP");
	}
	private void storage() {
		System.out.println("512 GB");
	}
	private void osName() {
		System.out.println("android");
	}
	public static void main(String[] args) {
		PhoneInfo Mobile=new PhoneInfo();
		Mobile.phoneName();
		Mobile.phoneImeiNum();
		Mobile.camera();
		Mobile.storage();
		Mobile.osName();
	}
}
