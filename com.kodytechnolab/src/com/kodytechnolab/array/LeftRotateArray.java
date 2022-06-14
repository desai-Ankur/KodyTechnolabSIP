package com.kodytechnolab.array;

import java.util.Scanner;

public class LeftRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int size=sc.nextInt();
		int[] number=new int[size];
		System.out.println("Enter a Array value :");
		for(int i=0;i<size;i++)
			number[i]=sc.nextInt();
		
		System.out.println("Enter a How much Left shift:");
		int left=sc.nextInt();
		int temp=0;
		
		for(int i=0;i<left;i++)
		{
			temp=number[0];
			for(int j=0;j<size;j++)
			{
				number[j]=number[j+1];
				if(j==size-2)
					break;
			}
			number[size-1]=temp;
		}
		for(int i=0;i<size;i++)
			System.out.println(number[i]);
	}

}
