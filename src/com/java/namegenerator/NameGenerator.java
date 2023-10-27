package com.java.namegenerator;

import java.util.Random;

public class NameGenerator {
	private static String[] beginning = {"Kr", "Ca", "Ra", "Mrok", "Cru",
			"Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
			"Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
			"Mar", "Luk"};
	private static String[] middle = {"air", "ir", "mi", "sor", "mee", "clo",
			"red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
			"marac", "zoir", "slamar", "salmar", "urak"};
	private static String[] end = {"d", "ed", "ark", "arc", "es", "er", "der",
			"tron", "med", "ure", "zur", "cred", "mur" };
	
	private static Random random = new Random();
	
	public static String generateName() {
		return beginning[random.nextInt(beginning.length)] + middle[random.nextInt(middle.length)] + end[random.nextInt(end.length)];
	}
	
	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			System.out.println(generateName());
		}
	}
}
