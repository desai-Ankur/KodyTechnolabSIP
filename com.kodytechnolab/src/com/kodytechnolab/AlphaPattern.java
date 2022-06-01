package com.kodytechnolab;
import java.util.Scanner;

public class AlphaPattern {
	public static void main(String[] args) {
		//ch for printing Alpha character
		char ch=65;
		System.out.println("Enter a size for pattern: ");
		Scanner sc=new Scanner(System.in);
		//size for pattern
		int size=sc.nextInt();
		//i for column in pattern
		//First part in pattern
		for (int i=0;i<=(size/2);i++) {
			//j for Row in pattern
			for(int j=0;j<=(size);j++) {
				if(((size/2)-i)==j || j==((size/2)+i))
					System.out.print(ch);
				else
					System.out.print(" ");
			}
			System.out.println();
			ch++;
		}	
		ch--;
		//Second part in pattern
		for (int i=1;i<=(size/2);i++) {
			ch--;
			for(int j=0;j<=(size);j++) {
				if(i==j || j==(size-i))
					System.out.print(ch);
				else
					System.out.print(" ");
			}
			System.out.println();
		}	
	}

}
