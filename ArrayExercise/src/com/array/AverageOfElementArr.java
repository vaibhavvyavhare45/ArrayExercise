package com.array;

public class AverageOfElementArr {
	public static double averageOfElement(double[] a) {
		double total=0;
		for (double number : a) {
			total+=number;
			
		}
		double avg=total/a.length;
		System.out.format("avrarage of array element:%.2f",avg);
		
		return 0;
		
		
	}
	public static void main(String[] args) {
		 double a[]= {14.5,7,4,89,7.5,6,7};
		 averageOfElement(a);
	}

}
