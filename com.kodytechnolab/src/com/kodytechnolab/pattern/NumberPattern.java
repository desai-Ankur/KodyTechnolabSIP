package com.kodytechnolab.pattern;

import java.util.Scanner;
/**
 * @Objective : Draw the below mentioned pattern:
 *		  1 2 3 4 5 6 7 
 *		   2 3 4 5 6 7 
 *	        3 4 5 6 7 
 *		     4 5 6 7 
 *		      5 6 7 
 *		       6 7 
 *		        7 
 *		       6 7 
 *		      5 6 7 
 *		     4 5 6 7 
 *		    3 4 5 6 7 
 *		   2 3 4 5 6 7 
 *		  1 2 3 4 5 6 7 
 *
 * @author ankur
 * @Date Jun 2, 2022
 */

public class NumberPattern {

	public static void main(String[] args) {
		
		System.out.println("Enter a size: ");
		Scanner sc = new Scanner(System.in);
		
		// size for pattern
		int size = sc.nextInt();
		
		// i for column in pattern
		// First part in pattern
		for (int i = 1; i <= size; i++) {
		
			// k for space in pattern
			for (int k = 1; k < i; k++)
				System.out.print(" ");
			
			// j for Row in pattern
			for (int j = i; j <= size; j++)
				System.out.print(j + " ");
			
			System.out.println();
		}
		
		// Second part in pattern
		for (int i = (size - 1); i >= 1; i--) {
		
			for (int k = 1; k < i; k++)
				System.out.print(" ");
			
			for (int j = i; j <= size; j++)
				System.out.print(j + " ");

			System.out.println();
		}
	}
}
