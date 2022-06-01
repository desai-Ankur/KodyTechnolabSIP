package com.kodytechnolab;
import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=0;	//User input
		System.out.println("Enter a Number : ");
		number=sc.nextInt();
		//Number is Even or Odd
		if(number%2==0) {
			if(( number<=5 && number>=2) || number>=20)
				System.out.println("Not Weird");
			if(number<=20 && number>=6)
				System.out.println("Weird");
		}
		else
			System.out.println("Weird");
	}
}
