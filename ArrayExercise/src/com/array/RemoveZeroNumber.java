package com.array;

public class RemoveZeroNumber {
	public static void main(String[] args) {
		int a[] = { 1, 2, 0, 3, 0, 0, 4, 0, 5 };
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]!=0) {
				System.out.print(a[i]+",");
			}
			

		}
		
		

	}

}
