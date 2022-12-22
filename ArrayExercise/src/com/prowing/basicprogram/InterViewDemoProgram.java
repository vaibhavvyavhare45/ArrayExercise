package com.prowing.basicprogram;

public class InterViewDemoProgram {
	void m1() {
		
	}
	public static void main(String[] args) {
		int result=8;
		forEach:while(result>7) {
			result++;
			do {
				result--;
			}while(result>5);
			break forEach;
		}
		System.out.println(result);
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
