package com.kodytechnolab.numeric;

import java.util.Scanner;
/**
 * 
 * @Objective Write a program to find the 
 * 			  Neon Number of a given number. 
 * @author ankur
 * @Date Jun 2, 2022
 */

public class NeonNumber {
	public static void main(String[] args) {
		int number = 0;
		// Sum of Digit
		int sum = 0; 
		// Copy of Number
		int number1 = 0; 
		// Reminder of Number
		int reminder; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Neon Number\nEnter a number : ");
		number = sc.nextInt();
		number1 = number * number;
		
		// Sum of Digit
		while (number1 > 0) {
			reminder = number1 % 10;
			sum = reminder + sum;
			number1 = number1 / 10;
		}
		
		if (sum == number)
			System.out.println(number + " is Neon Number ");
		else
			System.out.println(number + " is Not Neon Number ");
	}
}
