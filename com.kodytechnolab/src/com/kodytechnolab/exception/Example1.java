package com.kodytechnolab.exception;

public class Example1 {

	public static void main(String[] args) {
		int num[]=new int[4];
		try
		{
			System.out.println("Before exception is genereted");
			num[7]=10;
			System.out.println("this won't be displayed");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	System.out.println("index out of bound");}
		finally
		{
			System.out.println("Finally block");
		}
		
		System.out.println("After catch stmt");
	}

}
