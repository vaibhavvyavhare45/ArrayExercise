package com.array;

public class MissingNumArray {
	public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,8,9};//find one missing number
	
		int n=a.length+1;
	int sumN=(n*(n+1))/2;
	int sum=0;
	for(int i=0;i<a.length;i++){
		sum=sum+a[i];
	}
	
	System.out.println(sumN-sum);
		
	}
	

}
