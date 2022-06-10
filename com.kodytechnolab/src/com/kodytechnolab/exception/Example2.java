package com.kodytechnolab.exception;
class Test
{
	static void genException() 
	{
		try
		{
			System.out.println(" try ");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1.getMessage());
		}
		
		try
		{
			System.out.println("Befor exceptin.");//1
			throw new NullPointerException("Hello");
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			throw new ArrayIndexOutOfBoundsException("array ");
		}
		finally
		{
			System.out.println("Test Finally");
		}
	}
}
public class Example2 {

	public static void main(String[] args) {
		//try {
			Test.genException();
	/*	}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+ " Main");
			try
			{
				throw new ArithmeticException("arithmetic");
			}
			catch(Exception e1)
			{
				System.out.println("arith  Ex2"+e1.getMessage());
				//throw new ArrayIndexOutOfBoundsException("Example2 error");
			}
			//throw new ArithmeticException("arithmetic");
		}
		finally
		{
			System.out.println("Example2 Finally");
		}*/
		
		System.out.println("After catch stmt");//6
	}

}
