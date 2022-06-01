package com.kodytechnolab;
import java.util.Scanner;

public class KeithNumber {

	public static void main(String[] args) {
		int number=0;
		int sum=0;		
		int number1=0;  //Copy of Number
		int reminder;	//Reminder of Number
		int i=0;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number: ");
		number=sc.nextInt();
		number1=number;
		
		//Digit Count
		while(number>0)
		{
			reminder=number%10;
			count++;
			number=number/10;
		}
		int[] arr=new int[count];
		number=number1;
		//Add in array 
		while(number>0)
		{
			reminder=number%10;
			arr[i]=reminder;
			i++;
			number=number/10;
		}
		while(sum<number1)
		{	
				sum=0;
				// sum of array value
				for(int k=0;k<count;k++)
					sum=sum+arr[k];
				//array in all value swap  
				for(int k=count-1;k>=0;k--)
				{
					if(k==0)
						break;
					arr[k]=arr[k-1];
				}
				arr[0]=sum;
		}
		if(sum==number1)
			System.out.println(number1+" is Keith Number");
		else
			System.out.println(number1+"is not Keith Number");
	}

}
