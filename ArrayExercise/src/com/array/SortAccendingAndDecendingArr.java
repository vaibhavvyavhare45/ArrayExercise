package com.array;

public class SortAccendingAndDecendingArr {
public static int sortAcending(int a[]) {
	int i,j,temp=0;
	for( i=0;i<a.length;i++) {
		for(j=i;j<a.length;j++) {
			if(a[i]>a[j]) { 
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
	}
	System.out.println();
	
	System.out.println("***********************");
	for( i=0;i<a.length;i++) {
		System.out.print(a[i]+"  ");
	}
	return 0;
	
}
public static int sortDecending(int a[]) {
	int i,j,temp=0;
	for( i=0;i<a.length;i++) {
		for(j=i;j<a.length;j++) {
			if(a[i]<a[j]) { 
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			}
	}
	System.out.println();
	
	System.out.println("-----------------------");
	for( i=0;i<a.length;i++) {
		System.out.print(a[i]+"  ");
	}
	return 0;
	
}
public static void main(String[] args) {
	int a[]= {44,89,78,45,12,7};
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+"  ");
	}
	sortAcending(a);
	sortDecending(a);
	
	
}
}
