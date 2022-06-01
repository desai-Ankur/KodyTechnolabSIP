package com.kodytechnolab;
import java.util.Scanner;

public class SpyNumber {
	public static void main(String[] args) {
		int number=0;
		int sum=0;         //sum of digit
		int multiply=1;    //Multiplication of digit
		int reminder;      //Reminder of Number
		int dummy;		   //Copy of Number
		Scanner sc=new Scanner(System.in);
		System.out.println("Spy Number\nEnter a number : ");
		number=sc.nextInt();
		dummy=number;
		// Calculate Spy Number
		while(dummy>0) {
			reminder=dummy%10;
			sum=reminder+sum;
			multiply=reminder*multiply;
			dummy=dummy/10;
		}
		if(sum==multiply)
			System.out.println(number +" is Spy Number ");
		else
			System.out.println(number +" is Not Spy Number ");
	}
}
