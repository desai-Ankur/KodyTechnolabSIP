package com.kodytechnolab.string;

import java.util.Scanner;

/**
 * 
 * @Objective Write a Java Program to Check if two strings are anagrams 
 * 			  of each other. (String 1 = Army and String 2 = mary then it 
 * 			  should return true)
 * @author ankur
 * @Date Jun 7, 2022
 */
public class AnagramsWord {

	public static void main(String[] args) {
		//Count the same character in both word
		int count=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Word:");
		String firstWord=sc.next();
		System.out.println("Enter a Second Word:");
		String secondWord=sc.next();
		
		//For comaprision
		char[] arrFirst=firstWord.trim().toLowerCase().toCharArray();
		char[] arrSecond=secondWord.trim().toLowerCase().toCharArray();
		
		//Same word Length
		if(firstWord.length()==secondWord.length()){	
			for(int i=0;i<arrFirst.length;i++)
				for(int j=0;j<arrSecond.length;j++)
					if(arrFirst[i]==arrSecond[j]) {	
						arrSecond[j]=' ';
						count++;
						break;
					}
			//same 
		  if(count==firstWord.length())
			  System.out.println("Both words are Anagrams.");
		  else
			  System.out.println("Words are not Anagrams");
		}
		else
			System.out.println("Two word are Not same Length.");
	}

}
