package com.array;

import java.util.Arrays;

public class SecondHighestNumber {
	public static int findSecondHighest(int a[]) {
		int i,j,temp;
		int size=a.length;
		for(i=0;i<size;i++) {
			for(j=i+1;j<size;j++) {
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}	
			
		}
		
		System.out.println("Second largest number is:"+a[size-2]);
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		int a[]={74,85,100,7,74,6};
		for(int i=0;i<a.length;i++) {
			System.out.print("  "+a[i]);
		}
		System.out.println();
		findSecondHighest(a);
	}

}
