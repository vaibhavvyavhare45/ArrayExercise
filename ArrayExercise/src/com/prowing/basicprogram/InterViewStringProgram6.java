package com.prowing.basicprogram;

public class InterViewStringProgram6 {
	public static void main(String[] args) {
		String s = "va3ib2ha5v45";
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {

			} else {
				System.out.print(ch[i]);
			}
		}
	}
}
