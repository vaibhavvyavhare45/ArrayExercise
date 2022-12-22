package com.prowing.basicprogram;

public class InterViewStringProgram2 {
	public static void main(String[] args) {
		String s1 = "vaibhav@1996#";
		char[] a = s1.toCharArray();
		char[] a1 = s1.toCharArray();
		char[] a2 = s1.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (Character.isAlphabetic(a[i])) {
				System.out.print(a[i]);

			}

		}
		System.out.println();

		for (int i = 0; i < a1.length; i++) {
			if (Character.isDigit(a1[i]))
				System.out.print(a1[i]);
		}
		System.out.println();
		
		System.out.print(s1.charAt(7));
		System.out.println(s1.charAt(12));

	}

}
