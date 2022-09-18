package com.array;

//import java.util.Scanner;

public class SwapArrayElement {
	int a[]= {4,8,2,9,12,14};
	
	public  int swapElement() {
		for(int i=0;i<6;i++) {
			System.out.print(a[i]+"  ");
			
		}
		//System.out.print("\n**************************\n");
		for(int i=0;i<6;i++) {
			//if(a[0]<a[4]||a[0]>a[4]) {
				a[0]=a[0]+a[4];
				a[4]=a[0]-a[4];
				a[0]=a[0]-a[4];
				System.out.print("  "+a[i]);
			//}
		
		}
	return 0;	
	}

	public int adjustentEleSwap() {
		System.out.print("\n\t*****************************\n");
		for(int i=0;i<6;i++) {
			System.out.print(a[i]+"  ");
		}	
		for(int i=0;i<5;i+=2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
		}
		//System.out.print("\n\t************************************\n");
		for(int i=0;i<6;i++) {
			System.out.print("  "+a[i]);
		}
		return 0;
	}
	
	
		
	
	public static void main(String[] args) {
		
		
		SwapArrayElement s=new SwapArrayElement();
		s.swapElement();
		s. adjustentEleSwap();
		
		
	}

}
