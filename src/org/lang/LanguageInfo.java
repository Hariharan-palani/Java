package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
	System.out.println("Tamil language speak in tamilnadu");
	}
public void englishLanguage() {
System.out.println("English speak all over the world");
}
public void hindiLanguage() {
System.out.println("Speak hindi in india ");	
}
public static void main(String[] args) {
LanguageInfo l=new LanguageInfo();
l.tamilLanguage();
l.englishLanguage();
l.hindiLanguage();
l.southIndia();
l.northIndian();
}
}
