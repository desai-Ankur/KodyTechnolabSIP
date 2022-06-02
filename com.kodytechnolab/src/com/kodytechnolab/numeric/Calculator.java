package com.kodytechnolab.numeric;

import java.util.Scanner;

/**
 * 
 * @Objective  Write a program to create a calculator and 
 * 			   while choosing a choice the user has to
 * 			   Enter a operator Number to do a operation 
 * 			   on the numbers. 
 * @author ankur
 * @Date Jun 2, 2022
 */
class Operation {
	
	void addition(int number1, int number2) {
		System.out.println("Addition is " + (number1 + number2));
	}

	void division(int number1, int number2) {

		if (number2 == 0)
			System.out.println("Divide by 0 is Not possible");
	   else 
			System.out.println("Division is " + (float) (number1 / number2));
	}

	void multiplication(int number1, int number2) {
		System.out.println("Multiplication is " + (number1 * number2));
	}

	void subtraction(int number1, int number2) {
		System.out.println("Subtraction is " + (number1 - number2));
	}
}

public class Calculator {
	public static void main(String[] args) {
		
		// Choice for user which operation perform
		int choice = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Simple Calculator");
		System.out.println("Enter a First Number: ");
		
		// For Operation first Number
		int number1 = sc.nextInt();
		
		System.out.println("Enter a Second Number: ");
		// For Operation second Number
		int number2 = sc.nextInt();
		
		while (choice != 5) {

			System.out.println("\n1.Addition\n2.Substraction\n3.Division\n4.Multiplication\n5.Exit");
			System.out.println("Choose a Operator:");
			choice = sc.nextInt();
			Operation operationObject = new Operation();
			
			switch (choice) {
			case 1:
				operationObject.addition(number1, number2);
				break;

			case 2:
				operationObject.subtraction(number1, number2);
				break;

			case 3:
				operationObject.division(number1, number2);
				break;

			case 4:
				operationObject.multiplication(number1, number2);
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong input");
			}
		}
	}
}
