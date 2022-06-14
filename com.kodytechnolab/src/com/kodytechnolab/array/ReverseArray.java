package com.kodytechnolab.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int size=sc.nextInt();
		int[] number=new int[size];
		System.out.println("Enter a value :");
		for(int i=0;i<size;i++)
			number[i]=sc.nextInt();
		
		for(int i=size-1;i>=0;i--)
			System.out.println(number[i]);
	}

}
