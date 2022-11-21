package com.prowing.basicprogram;

import java.util.Scanner;

public class CountNumberOfDIGIT {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a long digit number: ");
		int n=sc.nextInt();
		//String s=String.valueOf(n);
//		String s=Integer.toString(n);
//		System.out.println(s.length());
		
		int dig=0;
		while(n!=0) {
			n=n/10;
			dig++;
			
		}
		
		System.out.println(dig);
	}

}
