package org.cont;

public class Asdf {
	public Asdf() {
		this(1234,12.0f);
		System.out.println("Finnaly the constructor chaining is succesfully executed");
	}
	public Asdf(int i,float f) {
		this("njfsh",132.0f);
		System.out.println("your account no. is: "+i+"\n"+"Your withdraw is : "+f);
		
}
	public Asdf(String j,float k) {
		this(12.00);
		System.out.println("your City is: "+j+"\n"+"Your deposition is : "+k);
		
	}
		public Asdf(double g) {
			this(135.0f,"hgf");
			System.out.println("your accounr has : "+g+"rupess");
			
		}	
			public Asdf(float s,String h) {
				this("hsufh");
				System.out.println("your salary is: "+s+"\n"+"Your bike name is : "+h);
			}	
				public Asdf(String z) {
					System.out.println("your name is: "+z);
				}
	public static void main(String[] args) {
		Asdf D=new Asdf();
	}
}
