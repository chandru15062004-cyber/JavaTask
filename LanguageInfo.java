package org.lang;

public class LanguageInfo extends StateDetails{
	public void southIndia() {
		System.out.println("South");
	}
	public void northIndia() {
		System.out.println("North");
	}
	public static void main(String[] args) {
		LanguageInfo N=new LanguageInfo();
		N.tamilLanguage();
		N.hindiLanguage();
		N.southIndia();
		N.northIndia();	
	}

}
