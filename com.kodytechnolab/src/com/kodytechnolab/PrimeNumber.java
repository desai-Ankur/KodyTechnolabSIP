package com.kodytechnolab;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int count=0;
		int size=0;
		System.out.println("Prime Number ");
		System.out.println("Enter a size :");
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		//Calculate Prime Number 
		for(int j=2;j<=size;j++) {	
			for(int i=2;i<=j;i++) {
				if(j%i==0)
					count++; // How many time divide the value 
			}
			if(count==1)
				System.out.print(j+" ");
			count=0;
		}
	}
}
