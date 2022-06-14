package com.kodytechnolab.array;

import java.util.Scanner;

public class FrequencyOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of array: ");
		int size=sc.nextInt();
		int[] number=new int[size];
		int count=0;
		int l=0;
		System.out.println("Enter a value :");
		for(int i=0;i<size;i++)
			number[i]=sc.nextInt();
		
		for(int i=0;i<size;i++) {
			count=0;
			for(int j=0;j<size;j++)
				if(number[i]==number[j]) {
					count++;
					l=j;
				}
			if(l==i)
				System.out.println(number[l]+" --> "+count);
		}
	}

}
