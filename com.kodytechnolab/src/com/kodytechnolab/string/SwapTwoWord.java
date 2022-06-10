package com.kodytechnolab.string;

import java.util.Scanner;

/**
 * 
 * @Objective Write a program to swap two strings without using 
 * 			   the third variable.
 * @author ankur
 * @Date Jun 7, 2022
 */
public class SwapTwoWord {

	public static void main(String[] args) {
		// User input store
		String wordFirst;
		String wordSecond;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Word :");
		wordFirst = sc.next();
		System.out.println("Enter a Second Word :");
		wordSecond = sc.next();
		
		//Befor Swap Value
		System.out.println("Befor a swap value :");
		System.out.println("First Word  " + wordFirst );
		System.out.println("Second Word " + wordSecond);
		
		//Length of first word
		int len = wordFirst.length();
		//Concate word
		wordFirst = wordFirst + wordSecond;
		wordSecond = wordFirst.substring(0, len);
		wordFirst = wordFirst.substring(len, wordFirst.length());
		
		//After Swap Value
		System.out.println("After a swap value :");
		System.out.println("First Word  " + wordFirst );
		System.out.println("Second Word " + wordSecond);
	}
}
