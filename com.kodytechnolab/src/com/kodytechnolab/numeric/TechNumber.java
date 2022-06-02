package com.kodytechnolab.numeric;

import java.util.Scanner;
/**
 * Objective: Given number is Tech Number Or Not
 * Example :: 2025 is Tech Number because 20+25=45 and 45*45=2025
 * Developer: ankur 
 * Date : 01/06/2022
 */
public class TechNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int reminder = 0;
		int sum = 0;
		int number = 0;
		// Copy of Number and First part of Orignal Number
		int number1 = 0;
		// Second part of Orignal Number
		int number2 = 0; 
		int i = 0;
		int count = 0; // Count the digit

		System.out.println("Enter a number: ");
		number = sc.nextInt();
		number1 = number;
		
		// count the digit of Number
		String str = String.valueOf(number);
		count = Integer.valueOf(str.length());
		
		int[] arr = new int[count];
		
		if (count % 2 == 0) {
		
			// Store in array one by one digit
			while (number > 0) {
				reminder = number % 10;
				arr[i] = reminder;
				i++;
				number = number / 10;
			}
			
			number = number1;
			number1 = number2 = 0;
			i = (arr.length - 1);
			// store in number1 and number2
			
			for (int j = (arr.length / 2) - 1; j >= 0; j--) {
				number1 = (number1 * 10) + arr[j];
				number2 = (number2 * 10) + arr[i];
				i--;
			}
			
			sum = number1 + number2;
			
			if ((sum * sum) == number)
				System.out.println("Tech number");
			else
				System.out.println("Not a Tech Number");
		} else
			System.out.println("Not a Tech Number");
	}
}
