package com.array;

public class CompareTwoArr {
	public static boolean compareTwoArr(int a[], int b[]) {

		if (a == b)
			return true;

		if (a == null || b == null)
			return false;

		if (a.length != b.length)
			for (int i = 0; i < a.length; i++)
				if (a[i] != b[i])
					return false;

		return true;
	}

	public static void main(String[] args) {
		int a[] = { 2, 7, 58, 7, 3, 7, 8 };
		int b[] = { 2, 7, 58, 7, 3, 7, 8, 9 };
		System.out.println(compareTwoArr(a, b));
	}
}