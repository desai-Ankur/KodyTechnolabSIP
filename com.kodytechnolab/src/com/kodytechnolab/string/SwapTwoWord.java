package com.kodytechnolab.string;

import java.util.Scanner;

/**
 * 
 * @Objective Write a program to swap two strings without using the third
 *            variable.
 * @author ankur
 * @Date Jun 7, 2022
 */
public class SwapTwoWord {

	public static void main(String[] args) {
		String wordFirst;
		String wordSecond;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First Word :");
		wordFirst = sc.next();
		System.out.println("Enter a Second Word :");
		wordSecond = sc.next();
		
		System.out.println("Befor a swap value \n"+wordFirst+" "+wordSecond);
		int len=wordFirst.length();
		wordFirst=wordFirst+wordSecond;
		wordSecond=wordFirst.substring(0, len);
		wordFirst=wordFirst.substring(len,wordFirst.length());
		System.out.println("After a swap value \n"+wordFirst+" "+wordSecond);
	}
}
