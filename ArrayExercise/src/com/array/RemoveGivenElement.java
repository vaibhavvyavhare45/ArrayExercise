package com.array;

import java.util.Scanner;

public class RemoveGivenElement extends RemoveDuplicateElement {
public static void removeElement(int a[]) {
	System.out.println("---------------------------");
		  for(int i=0;i<a.length;i++){
				System.out.print(a[i]+"  ");
			}
		  System.out.println();
		  Scanner sc=new Scanner(System.in);
			System.out.print("Enter removing element: ");
			int n=sc.nextInt();
		
		  
		  for(int i=0;i<a.length;i++) {
			int count=0;
			
				if(a[i]==n) 
					count++;
				
			
			if(count<1) 
				System.out.print(" "+a[i]);
			
		  }
		  
		   
	  }
		
}

