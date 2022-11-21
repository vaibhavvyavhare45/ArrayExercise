package com.prowing.basicprogram;

import java.util.Scanner;

public class BetweenTwoNumberPrimeNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		for(int i=n1;i<=n2;i++) {
			int count=0;
			//try to divide n and increase count
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					count++;
					break;
				}
			}
			
			
			if(count==0) {
				System.out.println(i);
			}
		}
	}

}
