package com.java.namegenerator;

import java.util.Random;

public class RefactoredNameGenerator {
	private String[] beginning;
	private String[] middle;
	private String[] end;
	private Random random;
	
	public RefactoredNameGenerator() {
		this.random = new Random();
		initializeArraysForNordicNames();
	}
	
	public RefactoredNameGenerator(long seed) {
		this.random = new Random(seed);
		initializeArraysForIndianNames();
	}
	
	
	public void initializeArraysForNordicNames(){
		this.beginning = new String[] {"Kr", "Ca", "Ra", "Mrok", "Cru",
				"Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol","Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
				"Mar", "Luk"};
		this.middle = new String[] {"air", "ir", "mi", "sor", "mee", "clo","red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
				"marac", "zoir", "slamar", "salmar", "urak"};
		this.end = new String[] {"d", "ed", "ark", "arc", "es", "er", "der","tron", "med", "ure", "zur", "cred", "mur"};
	}

	public void initializeArraysForIndianNames(){
	    this.beginning = new String[] {"De", "Aka", "Raj", "Ary", "Sun", "Jay", "Vij", "Aar", "Dev", "Adi"};
	    this.middle = new String[] {"deep", "san", "par", "prem", "raj", "ran", "kul", "kum", "vid", "shiv"};
	    this.end = new String[] {"ak", "it", "ar", "ant", "sh", "an", "en", "aj", "esh"};
	}


	
	public String generateName() {
		return beginning[random.nextInt(beginning.length)] + middle[random.nextInt(middle.length)] + end[random.nextInt(end.length)];
	}
	
	public static void main(String[] args) {
		
		RefactoredNameGenerator generator =  new RefactoredNameGenerator();
		for(int i=0; i<5; i++) {
			System.out.println(generator.generateName());
		}
		
		System.out.println("Reproducable sequence");
		RefactoredNameGenerator reproducableGenerator = new RefactoredNameGenerator(1234);
		for(int i=0; i<5; i++) {
			System.out.println(reproducableGenerator.generateName());
		}
	}
}











