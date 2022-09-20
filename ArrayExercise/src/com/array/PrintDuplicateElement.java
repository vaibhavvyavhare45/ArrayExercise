package com.array;



import java.util.Arrays;

public class PrintDuplicateElement {
	public  static int printDuplicate(int a[]) {
		System.out.print("\n print duplicate");
		System.out.println();
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
				System.out.print(" "+a[i]);	
				}
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		int a[]= {7,8,7,9,4,7,2,8};
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}	
		printDuplicate(a);
	}

}
