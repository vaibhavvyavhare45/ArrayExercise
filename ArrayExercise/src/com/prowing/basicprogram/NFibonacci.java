package com.prowing.basicprogram;

import java.util.Scanner;
public class NFibonacci {
	public static void main(String[] args) {
//		int n1=0,n2=1,count=10;
//		System.out.println(n1+" "+n2);
//		for(int i=2;i<count;i++) {
//			int n3=n1+n2;	
//			System.out.println(""+n3);
//			n1=n2;
//			n2=n3;
//		}
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the range of fibonacci series: ");
		int num=sc.nextInt();
		int n1=0,n2 = 1,n3;
		//System.out.println(n1+" "+n2);
		for(int i=1;i<=num;i++) {
			System.out.println(""+n1);
			n3=n1+n2;
			
			n1=n2;
			n2=n3;
			
		}
		
	}

}
