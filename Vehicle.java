package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void all() {
		System.out.println("4");
	}
	public static void main(String[] args) {
		FourWheeler A=new FourWheeler();
		A.four();
		ThreeWheeler B=new ThreeWheeler();
		B.three();
		TwoWheeler C=new TwoWheeler();
		C.two();
		Vehicle D=new Vehicle();
		D.all();
		
		
		
	}

}
