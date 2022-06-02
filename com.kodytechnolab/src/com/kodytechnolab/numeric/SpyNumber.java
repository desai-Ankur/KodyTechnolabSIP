package com.kodytechnolab.numeric;

import java.util.Scanner;

/**
 * 
 * @Objective :Write a program to find the Spy Number 
 * 				of a given number.
 * @author ankur
 * @Date Jun 2, 2022
 */

public class SpyNumber {
	public static void main(String[] args) {
		
		int number = 0;
		// sum of digit
		int sum = 0;
		// Multiplication of digit
		int multiply = 1;
		// Reminder of Number
		int reminder;
		// Copy of Number
		int dummy;

		Scanner sc = new Scanner(System.in);
		System.out.println("Spy Number\nEnter a number : ");
		number = sc.nextInt();
		dummy = number;

		// Calculate Spy Number
		while (dummy > 0) {
			reminder = dummy % 10;
			sum = reminder + sum;
			multiply = reminder * multiply;
			dummy = dummy / 10;
		}

		if (sum == multiply)
			System.out.println(number + " is Spy Number ");
		else
			System.out.println(number + " is Not Spy Number ");
	}
}
