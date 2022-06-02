package com.kodytechnolab.numeric;

import java.util.Scanner;
/**
 * Objective: 
 * Developer: ankur 
 * Date : 01/06/2022
 */
public class FactorialNumber {

	// For Calculate Factorial
	static void factorial(int number) {
		double fact = 1;
		for (int i = number; i > 0; i--)
			fact = fact * i;
		System.out.println("Factorial Is :" + fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial Number\nEnter a Number: ");
		FactorialNumber.factorial(sc.nextInt());
	}
}
