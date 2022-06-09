package com.kodytechnolab.exception;

import java.util.Scanner;
public class NullPointerExceptionHandling {

	public static void main(String[] args) {
		try{
			Scanner sc =new Scanner(System.in);			
			System.out.println("Enter a name: ");
			String nm=null;
			//System.out.println(nm.length());
			//nm=sc.next();
			if(nm.equals("hello"))
				System.out.println(nm);
			
		}
		catch(NullPointerException e) {
			System.out.println("Your value is null");
		}
		finally {
			System.out.println("Finally Executed");
		}
	}

}
