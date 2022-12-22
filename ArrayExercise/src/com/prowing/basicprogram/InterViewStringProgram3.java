package com.prowing.basicprogram;

public class InterViewStringProgram3 {
	public static void main(String[] args) {
		String v = "Vaibhav@1996*";
		char[] ch = v.toCharArray();
		String s = "";
		String s1 = "";
		String s2 = "";
		for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				s = s + ch[i];

			} else if (Character.isDigit(ch[i])) {
				s1 = s1 + ch[i];
			} else {
				s2 = s2 + ch[i];
			}
		}

		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);

	}

}
