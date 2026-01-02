package org.cont;

public class ConstructorChaining {
	public ConstructorChaining() {
		this(1234,12.0f);
		System.out.println("Finnaly the constructor chaining is succesfully executed");
	}
	public ConstructorChaining(int i,float f) {
		this("njfsh",132.0f);
		System.out.println("your account no. is: "+i+"\n"+"Your withdraw is : "+f);
		
}
	public ConstructorChaining(String j,float k) {
		this(12.00);
		System.out.println("your City is: "+j+"\n"+"Your deposition is : "+k);
		
	}
		public ConstructorChaining(double g) {
			this(135.0f,"hgf");
			System.out.println("your accounr has : "+g+"rupess");
			
		}	
			public ConstructorChaining(float s,String h) {
				this("hsufh");
				System.out.println("your salary is: "+s+"\n"+"Your bike name is : "+h);
			}	
				public ConstructorChaining(String z) {
					System.out.println("your name is: "+z);
				}
	public static void main(String[] args) {
		Asdf D=new Asdf();
	}
}

