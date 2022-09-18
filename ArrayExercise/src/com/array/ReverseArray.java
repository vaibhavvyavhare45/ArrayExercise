package com.array;

import java.util.Arrays;

public class ReverseArray {
	public static int reverseArray(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		int temp;
		int size=a.length;
		for(int i=0;i<size/2;i++) {
			temp=a[i];
			a[i]=a[size-1-i];
			a[size-1-i]=temp;
		}
		System.out.println();
		System.out.println("reverse element  in above array\n");
		System.out.println(Arrays.toString(a));
		return 0;
		
	}
	
	public static void main(String[] args) {
		int a[]= {7,8,14,12,17,2};
		reverseArray(a);
		
	}

}
