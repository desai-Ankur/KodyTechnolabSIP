package com.kodytechnolab;
import java.util.Scanner;

public class ArmstrongNumber {
	
	//For Find Armstrong Number
	void armstrong(int Number) {
		int ans=1;  
		int count=0; //Count digit of Number
		int sum=0;  
		int reminder=0; //Reminder of Number 
		int dummy=Number; //Copy of Number
		
		//For Count digit of Number
		while(dummy!=0) {
			reminder=dummy%10;
			count++;
			dummy=dummy/10;
		}
		
		dummy=Number;
		//for Calculate Armstrong
		while(dummy!=0) {
			reminder=dummy%10;
			ans=1;
			for(int i=0;i<count;i++)
				ans=reminder*ans;	
			sum=sum+ans;
			dummy=dummy/10;
		}
		
		if(sum==Number)
			System.out.println(Number+" Is Armstrong Number.");
		else
			System.out.println(Number+"Is not Armstrong Number.");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArmstrongNumber ArmstrongNumberObject=new ArmstrongNumber();
		System.out.println("Enter a number :");
		ArmstrongNumberObject.armstrong(sc.nextInt());
	}
}
