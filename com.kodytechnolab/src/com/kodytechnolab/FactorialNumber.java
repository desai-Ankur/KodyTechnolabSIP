package com.kodytechnolab;

import java.util.Scanner;


public class FactorialNumber {
	
	//For Calculate Factorial
	static void factorial(int number) {
		double fact=1;
		for(int i=number;i>0;i--)
			fact=fact*i;
		System.out.println("Factorial Is :"+fact);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Factorial Number\nEnter a Number: ");
		FactorialNumber.factorial(sc.nextInt());
	}
}
