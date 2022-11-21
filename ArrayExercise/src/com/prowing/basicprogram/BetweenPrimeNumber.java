package com.prowing.basicprogram;

import java.util.Scanner;

public class BetweenPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low = sc.nextInt();
		int max = sc.nextInt();
		for (int n = low; n <= max; n++) {
			int count = 0;
			for (int div = 2; div * div <= n; div++) {
				if (n % div == 0) {
					count++;
					break;
				}
			}

			if (count == 0) {
				System.out.println(n);
			}
		}

	}

}
