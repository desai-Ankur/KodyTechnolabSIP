package com.kodytechnolab.numeric;

import java.util.Scanner;
/**
 * Objective: 
 * Developer: ankur 
 * Date : 01/06/2022
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int number1 = 0;
		int number2 = 1;
		int number3 = 1;
		int size = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci Series ");
		System.out.println("Enter size :");
		size = sc.nextInt();
		
		// print first and second number
		System.out.print(number1 + " " + number2 + " ");
		
		// Calculate the Fibonacci Series
		for (int i = 2; i <= size; i++) {
			number3 = number1 + number2;
			if (number3 >= size)
				break;
			System.out.print(number3 + " ");
			number1 = number2;
			number2 = number3;
		}
	}
}
