package com.kodytechnolab.string;

import java.util.Scanner;

/**
 * 
 * @Objective Write a Java Program to reverse a string without using any inbuilt
 *            function
 * @author ankur
 * @Date Jun 7, 2022
 */
public class ReverseWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// For User Input
		System.out.println("Enter a Word");
		String word = sc.nextLine();
		//Reverse Word store
		String arr = new String();
		for (int i = word.length() - 1; i >= 0; i--) 
			arr = arr + word.charAt(i);
		System.out.print(arr);
	}
}
