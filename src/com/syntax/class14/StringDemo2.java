package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {

		String name="      Moreed      ";
		System.out.println(name);
		System.out.println(name.trim());
		String name2="Run Moreed";
		System.out.println(name2.toLowerCase().startsWith("Run"));
		System.out.println(name2.startsWith("Run"));
		System.out.println(name2.startsWith("Moreed"));
		System.out.println(name2.endsWith("Moreed"));
		System.out.println(name2.endsWith("d"));
		System.out.println(name2.contains("M"));
		System.out.println(name2.toLowerCase().contains("M"));
	}

}
