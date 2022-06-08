package com.kodytechnolab.string;

import java.util.Scanner;

/**
 * 
 * @Objective Write a program for find entered word is 
 * 				Palindrome or Not
 * @author ankur
 * @Date Jun 8, 2022
 */
public class PalindromeString2 {
	public static void main(String[] args) {
		
		String word;
		//For reverse word store
		String dummyWord = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word: ");
		word = sc.next();
		
		// concate reverse in word to str2
		for (int i = word.length() - 1; i >= 0; i--) 
			dummyWord = dummyWord + word.charAt(i);
		
		if (word.equals(dummyWord))
			System.out.println(word + " Is a palindrome ");
		else
			System.out.println(word + " Is Not a palindrome");
	}
}
