package com.kodytechnolab.pattern;
/**
 * 
 * @Objective Enter size and print Pascal Traingle.
 *         1 
 *        1 1 
 *       1 2 1 
 *      1 3 3 1 
 *     1 4 6 4 1 
 *    1 5 10 10 5 1 
 *   1 6 15 20 15 6 1 
 *  1 7 21 35 35 21 7 1 
 * 1 8 28 56 70 56 28 8 1 
 *1 9 36 84 126 126 84 36 9 1 
 * @author ankur
 * @Date Jun 10, 2022
 */
public class PascalTraingle {
	public static void main(String[] args) {
		
		//size for pattern
		int size=10;
		//for before value store
		int[] arr=new int[20];
		//for current value print
		int[] sum=new int[20];
		for(int i=0;i<size;i++) {
			//Space Print
			for(int k=size;k>i;k--)
				System.out.print(" ");	
			
			//Row vise value print
			for(int j=0;j<=i;j++) 
				//for every row first value 
				if(j==0)
				{
					arr[j]=1;
					sum[j]=1;
					System.out.print(sum[j]+" ");
				}
				else
				{
					sum[j]=arr[j-1]+arr[j];
					System.out.print(sum[j]+" ");
				}
				
			
			//Sum value to Array store 
			//sum value all blank
			for(int m=0;m<=i;m++)
			{	
				arr[m]=sum[m];
				sum[m]=0;
			}
			System.out.println();
		}
	}
}
