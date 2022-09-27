package com.array;

public class PrintMissingNumber {
	public static void findMissingNumber(int n[]) {
		//take maximum length as last number in array
		int m[]=new int[n[n.length-1]];
		int k=0;
			if(n[0]!=1) {
				for(int i=1;i<n[0];i++) {
					m[k]=i;
					k++;
				}
			}
			for (int i=0;i<n.length-1;i++) {
			    
			    int j=i+1;
			    int difference=n[j]-n[i] ;
			            
			            
			   if(difference!=1){
			        
			  for (int x=1;x<difference;x++) {
			 
			          m[k] = n[i] + x;
			           k++;
			    break;
			  	}
			            
			 }
			 
			        
			System.out.println("missing numbers in array ::");
			        
			for (int l = 0; l < k ; l++) {
			    System.out.println( m[l]+" ");
			}}
	}
public static void main(String[] args) {
	int a[]= {12,3,4,10,15,17,20};
	findMissingNumber(a);
}
	
}
