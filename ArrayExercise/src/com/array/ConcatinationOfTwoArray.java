package com.array;

import java.util.Arrays;

public class ConcatinationOfTwoArray extends AddOfTwoArray {
	public int twoArrayConcat(int a[], int b[]) {
		int length = a.length + b.length;
		int r[] = new int[length];
		int pos = 0;
		for (int i : a) {
			r[pos] = i;
			pos++;

		}
		for (int j : b) {
			r[pos] = j;
			pos++;

		}
		System.out.println(Arrays.toString(r));
		System.out.println();
		return 0;
	}

}
