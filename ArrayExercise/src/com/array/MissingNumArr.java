package com.array;

public class MissingNumArr {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,6};
		int xor1=a[0];
		for(int i=1;i<a.length;i++) {
			xor1=xor1^a[i];
		}
		int xor2=1;
		for(int i=2;i<=6;i++) {
			xor2=xor2^i;
			
		}
		System.out.println("missing element in array: "+(xor1^xor2));
		
	}

}
