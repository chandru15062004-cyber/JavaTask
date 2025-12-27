package org.company;
import org.client.Client;
public class Company extends Client{
	public void companyName() {
	System.out.println("WIPRO");
}
	public static void main(String[] args) {
		Company Info=new Company();
		Info.clientName();
		Info.companyName();
		
	}
}