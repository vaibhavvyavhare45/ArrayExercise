package com.prowing.basicprogram;

import java.util.Scanner;

public class IsAPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 1; i < t; i++) {// this looop is by 10^4//this root is root n iterate
			int n = sc.nextInt();

			int count = 0;
			for (int div = 2; div*div <= n; div++) {// this loop is looping by 10^n
				if (n % div == 0) {
					count++;
						break; 
				}
			}
			if (count == 0) {
				System.out.println("is a prime number");
			} else {
				System.out.println("is not a prime number");
			}

		}

	}

}
