package com.kodytechnolab;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		System.out.println("Enter a size: ");
		Scanner sc=new Scanner(System.in);
		//size for pattern
		int size=sc.nextInt();
		//i for column in pattern
		//First part in pattern
		for(int i=1;i<=size;i++){
			//k for space in pattern
			for(int k=1;k<i;k++)
				System.out.print(" ");
			//j for Row in pattern
			for(int j=i;j<=size;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		//Second part in pattern
		for(int i=(size-1);i>=1;i--){
			for(int k=1;k<i;k++)
				System.out.print(" ");
			for(int j=i;j<=size;j++)
				System.out.print(j+" ");
			
			System.out.println();
		}	
	}
}
