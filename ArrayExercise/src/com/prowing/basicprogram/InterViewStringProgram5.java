package com.prowing.basicprogram;

public class InterViewStringProgram5 {
	public static void main(String[] args) {
		String s1="In#$dia";
		char[] ch=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			if (Character.isAlphabetic(ch[i])) {
				
			}
//			else if (Character.isDigit(ch[i])) {
//			 System.out.println(ch[i]);
//			}
			else {
				System.out.print(ch[i]);
			}
			
		}
	}

}
