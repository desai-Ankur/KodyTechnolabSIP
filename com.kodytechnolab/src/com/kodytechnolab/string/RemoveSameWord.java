package com.kodytechnolab.string;

import java.util.Scanner;
/**
 * 
 * @Objective Remove same word in sentence. 
 * 			  Take input about how many sentence  
 * 			  user  will enter  
 * 
 * Sample Input
 * Enter number of sentence  : 5
 * Goodbye bye bye world world world
 * Sam went went to to to his business
 * Reya is is the the best player in eye eye game
 * in inthe
 * Hello hello Ab aB
 *
 * Sample Output
 * Goodbye bye world
 * Sam went to his business
 * Reya is the best player in eye game
 * in inthe
 * Hello Ab
 * 
 * @author ankur
 * @Date Jun 2, 2022
 */

public class RemoveSameWord {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//Toatl sentence store
		int sentenceSize;
		
		System.out.println("Enter a number of sentence: ");
		sentenceSize = Integer.parseInt(sc.nextLine());
		
		String[] sentence = new String[sentenceSize];
		
		// User input a sentence
		for (int i = 0; i < sentenceSize; i++) {
			System.out.println("Enter a Sentence: ");
			sentence[i] = sc.nextLine();
		}
		
		//one by one sentence split
		String[] split = new String[sentenceSize];
		//remove after sentence store in ans
		String[] ans = new String[sentenceSize];
		int l = 0;

		for (int j = 0; j < sentenceSize; j++) {
			
			// one by one sentence split
			split = sentence[j].split(" ");
			String Sentence1 = "";
			
			for (int k = 0; k < split.length; k++)
			
				// split word compare
				for (int i = k + 1; i < split.length; i++)
				
					// if match then replace to ignore
					if (split[k].equalsIgnoreCase(split[i]))
						split[i] = "Ignore";
					else
						continue;
			// if ignore word then skip and another word then store
			for (int k = 0; k < split.length; k++)
				
				if (split[k].equals("Ignore"))
					continue;
				else
					Sentence1 = Sentence1 + split[k] + " ";
			
			ans[j] = Sentence1;
			System.out.println("");
		}
		
		System.out.println("Remove duplicate after look like:");
		for (int j = 0; j < sentenceSize; j++)
			System.out.println(ans[j]);
	}
}
