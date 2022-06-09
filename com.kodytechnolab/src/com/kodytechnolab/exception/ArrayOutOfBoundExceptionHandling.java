package com.kodytechnolab.exception;

import java.util.Scanner;

public class ArrayOutOfBoundExceptionHandling {
	
	public static void add() throws NullPointerException
	{
		String nm=null;
		
		if(nm.equals("hello"))
			System.out.println(nm);
	}
	public static void main(String[] args) {//throws NullPointerException {
		add();
		try {
			
		}
		catch(Exception e) {
			String s=new String();
			System.out.println("Your value is "+s);
		}
		/*try {
			
		}
		catch(Exception e) {
			String s=new String();
			System.out.println("Your value is "+s);
		}
		finally {
			System.out.println("Finally Executed");
		}*/
	}

}
