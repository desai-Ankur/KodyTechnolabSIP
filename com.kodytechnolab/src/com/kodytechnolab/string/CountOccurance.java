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
		word = sc.nextLine();
		System.out.println("Enter a Character For count in word :\n");
		char Character=sc.next().trim().charAt(0);
		
		//word to character array convert
		char[] arrWord= word.trim().toCharArray();
		
		//Count the character how many time occur
		int count=0;
		
		for(int i=0;i<arrWord.length;i++)
			if(arrWord[i]==Character)
				count++;
		//count is 0 means not present in word
		if(count==0)
			System.out.println("Character is not present in the word");
		else
			System.out.println("Character is "+count+" time occur in the word");
		
	}

}
