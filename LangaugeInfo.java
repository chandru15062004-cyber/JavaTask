package org.lang;

public class LangaugeInfo {
	public void tamilLangauge() {
		System.out.println("tamil");
	}
	public void englishLanguage() {
		System.out.println("English");
	}
	public void hindiLanguage() {
		System.out.println("hindi");
	}
public static class StateDetails{
	public void southIndia() {
		System.out.println("south");
	}
	public void northIndia() {
		System.out.println("north");
	}
}
public static void main(String[] args) {
	LangaugeInfo lang=new LangaugeInfo();
	lang.tamilLangauge();
	lang.englishLanguage();
	lang.hindiLanguage();
	StateDetails length=new StateDetails();
	length.southIndia();
	length.northIndia();
}
}
//If we want create a class inside a class then the creating method should be in public not in private
// Static is call the class anywhere in the program : public static class className{ 
//And also the bracket closed after finishing that class and before calling the  main method