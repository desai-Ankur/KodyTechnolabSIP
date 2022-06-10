package com.kodytechnolab.exception;
class Test1 
{
	static void add()  
	{
		try{
			//System.out.println("Hello");
			int arr[]=new int[4];
			//arr[5]=6;
			throw new ArithmeticException("Arith ");
			//throw new ArrayIndexOutOfBoundsException("Hlllllll");
		}
		catch(ArrayIndexOutOfBoundsException  | ArithmeticException | NullPointerException  e1)
		{	
			System.out.println(e1.getMessage());
			
		}
	}
}
public class Example3  {
	
	public static void main(String[] args) {// throws ArrayIndexOutOfBoundsException {
		
	
		Test1.add();
			System.out.println("Hello");
			int arr[]=new int[4];
			arr[5]=6;
			
		//	ArrayIndexOutOfBoundsException e=new ArrayIndexOutOfBoundsException("Helloo");
			
		//	System.out.print(e.getMessage()+"\n");
			//throw e;
			
	}

}
