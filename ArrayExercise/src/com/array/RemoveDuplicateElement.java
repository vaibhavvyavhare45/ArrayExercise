package com.array;

import java.util.Arrays;

public class RemoveDuplicateElement {
	
	
  public static void removeDuplicate(int a[]) {
	  
	  for(int i=0;i<a.length;i++){
			System.out.print(a[i]+"  ");
		}
	  System.out.println();
	  System.out.print("**************************");
	  System.out.println();

	  int count;
	  
	  for(int i=0;i<a.length;i++) {
		count=0;
		for(int j=i+1;j<a.length;j++) {
			if(a[i]==a[j]) { 
				count++;
			}
		}
		if(count<1) 
			
			System.out.print(" "+a[i]);
		
	  }
	  System.out.println();
	     
  }
  
  
	    
	    public static void main(String[] args) {
			
	    	
	    	
		int a[]= {7,8,12,14,7,89,7,1};
		
	       removeDuplicate(a);
	       RemoveGivenElement.removeElement(a);
	      
	        
	}
}