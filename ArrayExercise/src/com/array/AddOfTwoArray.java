package com.array;

public class AddOfTwoArray {
	
	public static int addTwoArray(int a[],int b[]) {
	System.out.println("********************");	
int c[]=new int[a.length];
	for(int i=0;i<a.length;i++) {
		c[i]=a[i]+b[i];
	}
	for(int i=0;i<a.length;i++) {
		System.out.print(c[i]+" ");
	}
	System.out.println();
	System.out.println("----------------------");
		return 0;
		
	}
	
	public static void main(String[] args) {
		int a[]= {7,8,9,10,45};
		int b[]= {8,8,7,12,13};
		int c[]=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		addTwoArray(a, b);
		ConcatinationOfTwoArray ca=new ConcatinationOfTwoArray();
		ca.twoArrayConcat(a, b);
		
	}

}
