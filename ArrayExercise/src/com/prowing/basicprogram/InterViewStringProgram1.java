package com.prowing.basicprogram;

import java.util.Arrays;

public class InterViewStringProgram1 {
	public static void main(String[] args) {
		String s = "In@dia#";
		char[] a = s.toCharArray();
		char[] a1 = s.toCharArray();
		int temp = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			if (Character.isLetter(a[i])) {
				if (Character.isLetter(a1[temp])) {
					a1[temp] = a[i];
					temp++;
				} else {
					temp++;
					i++;
				}

			}

		}

		System.out.println(Arrays.toString(a1));

	}
}
