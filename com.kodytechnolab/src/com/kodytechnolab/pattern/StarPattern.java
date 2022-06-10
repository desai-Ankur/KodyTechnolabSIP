package com.kodytechnolab.pattern;

/**
 * 
 * @Objective Enter a size and print pattern according. 
 * Pattern:
 * 
 *            * 
 *            * *
 *            * * *
 *            * * * *
 *            * * * * * 
 *            * * * *
 *            * * *
 *            * *
 *            *
 * 
 * @author ankur
 * @Date Jun 10, 2022
 */
public class StarPattern {

	public static void main(String[] args) {
		//size for pattern row
		int size=5;
		int k=-1;
		
		//for row 
		for(int i=0;i<size*2;i++)
		{
			//Condition for Two part pattern
			if(i>=size)
				k--;
			else
				k++;
			//for column  
			for(int j=0;j<=k;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
