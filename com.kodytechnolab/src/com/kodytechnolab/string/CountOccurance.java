package com.kodytechnolab.string;

import java.util.Scanner;

/**
 * 
 * @Objective :Write a Java Program to count the occurrence of 
 * 			   the given character in a string
 * @author ankur
 * @Date Jun 7, 2022
 */
public class CountOccurance {

	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word :");
		word = sc.next();
		System.out.println("Enter a Character For count in word :\n");
		char Character=sc.next().trim().charAt(0);
		char[] arrWord= word.trim().toCharArray();
		int count=0;
		for(int i=0;i<arrWord.length;i++)
			if(arrWord[i]==Character)
				count++;
		if(count==0)
			System.out.println("Character is not present in the word");
		else
			System.out.println("Character is "+count+" time occur in the word");
		
	}

}
