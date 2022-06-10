package com.kodytechnolab.string;

import java.util.Scanner;

/**
 * 
 * @Objective  Write a program to remove given characters from the 
 * 			   string. (removing character 'a' from the inputString
 *             'Java' the result will be: Jv)
 * @author ankur
 * @Date Jun 7, 2022
 */
public class RemoveCharacter {

	public static void main(String[] args) {
		String word;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word :");
		word = sc.next();
		
		System.out.println("Enter a Character For Remove in word :");
		String removeCharacter=sc.next();
		
		//Remove character 
		char Character=removeCharacter.trim().charAt(0);
		//Orignal word to Character Array
		char[] arrWord= word.trim().toCharArray();
		word="";
		
		//word in character find and that character skip  
		for(int i=0;i<arrWord.length;i++) {	
			if(arrWord[i]==Character)
				continue;
			word=word+arrWord[i];
		}
		System.out.println("word after Remove Character \n"+word);
	}

}
