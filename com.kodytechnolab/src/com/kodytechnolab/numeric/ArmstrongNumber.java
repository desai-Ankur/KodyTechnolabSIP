package com.kodytechnolab.numeric;

import java.util.Scanner;
/**
 * 
 * @Objective :Write a program to find the Armstrong 
 * 				Number of a given number.
 * @author ankur
 * @Date Jun 2, 2022
 */

public class ArmstrongNumber {

	// For Find Armstrong Number
	void armstrong(int Number) {

		int ans = 1;
		// Count digit of Number
		int count = 0; 
		int sum = 0;
		// Reminder of Number
		int reminder = 0; 
		// Copy of Number
		int dummy = Number; 
		
		// For Count digit of Number
		while (dummy != 0) {
			reminder = dummy % 10;
			count++;
			dummy = dummy / 10;
		}

		dummy = Number;
		// for Calculate Armstrong
		while (dummy != 0) {
			reminder = dummy % 10;
			ans = 1;
			
			for (int i = 0; i < count; i++)
				ans = reminder * ans;
			
			sum = sum + ans;
			dummy = dummy / 10;
		}

		if (sum == Number)
			System.out.println(Number + " Is Armstrong Number.");
		else
			System.out.println(Number + "Is not Armstrong Number.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArmstrongNumber ArmstrongNumberObject = new ArmstrongNumber();
		System.out.println("Enter a number :");
		ArmstrongNumberObject.armstrong(sc.nextInt());
	}
}
