package com.kodytechnolab.numeric;

import java.util.Scanner;
/**
 * @Objective
 * Given an integer, n, perform the following conditional
   actions:
 * If n  is odd, print Weird
 * If n  is even and in the inclusive range of  2 to 5 ,
       print Not Weird
 * If n  is even and in the inclusive range of  6 to 20 , 
       print Weird
 * If n  is even and greater than 20, print Not Weird
 *
 * Input Format
 * A single line containing a positive integer, n.
 *
 * output Format
 * Print Weird if the number is weird; otherwise, print 
   Not Weird.
 *
 * Sample Input 
 * 3
 *
 * Sample Output 
 * Weird
 *   
 * @author ankur
 * @Date Jun 2, 2022
 */
public class EvenOrOdd {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 // User input
		int number = 0;
		System.out.println("Enter a Number : ");
		number = sc.nextInt();
		
		// Number is Even or Odd
		if (number % 2 == 0) {
			if ((number <= 5 && number >= 2) || number >= 20)
				System.out.println("Not Weird");
			if (number <= 20 && number >= 6)
				System.out.println("Weird");
		} else
			System.out.println("Weird");
		
	}
}
