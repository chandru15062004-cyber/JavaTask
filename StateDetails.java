package org.lang;

public class StateDetails {
	public void northState() {
		System.out.println("sf");
		}
	public void southstate() {
		System.out.println("sd");
	}
public static void main(String [] args) {
	LanguageInfo z=new LanguageInfo();
	z.tamilLanguage();
	z.englishLanguage();
	z.hindiLanguage();
	StateDetails x=new StateDetails();
	x.northState();
	x.southstate();
	
	
}
}
