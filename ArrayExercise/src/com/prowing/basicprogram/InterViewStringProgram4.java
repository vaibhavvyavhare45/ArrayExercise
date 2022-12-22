package com.prowing.basicprogram;

public class InterViewStringProgram4 {
	public static void main(String[] args) {
		String s1="Vaibhav@2019";
		char[] ch=s1.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++) {
			if (Character.isDigit(ch[i])) {
				count++;	
			}
			
		
		}
		System.out.println(count);
		
		
	}
	

}
