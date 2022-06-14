package com.kodytechnolab.array;
import java.util.Scanner;
public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Arow=2,Acol=3,Brow=3,Bcol=2;
		int [][] a=new int[Arow][Acol];
		int [][] b=new int[Brow][Bcol];
		int [][] ans=new int[Arow][Bcol];
		
		if(Arow==Bcol)
		{
			System.out.println("For A Enter a number ");
			for(int i=0;i<Arow;i++)
				for(int j=0;j<Acol;j++)
					a[i][j]=sc.nextInt();
	
			System.out.println("For B Enter a number :");
			for(int i=0;i<Brow;i++)
				for(int j=0;j<Bcol;j++)
					b[i][j]=sc.nextInt();
				
			System.out.println("For A :");
			for(int i=0;i<Arow;i++)
			{
				for(int j=0;j<Acol;j++)
					System.out.print(a[i][j]+" ");
				System.out.println();
			}
			System.out.println("For B :");
			for(int i=0;i<Brow;i++)
			{
				for(int j=0;j<Bcol;j++)
					System.out.print(b[i][j]+" ");
				System.out.println();
			}
			int k=0,sum=0;
			for(int i=0;i<Arow;i++)
				for(int j=0;j<Bcol;j++)
				{
					sum=0;
					k=0;
					for(int l=0;l<Acol;l++)
					{
						sum=sum+(a[i][k]*b[k][j]);
						k++;
					}
					ans[i][j]=sum;
				}
			
			System.out.println("For Ans :");
			for(int i=0;i<Arow;i++)
			{
				for(int j=0;j<Bcol;j++)
					System.out.print(ans[i][j]+" ");
				
				System.out.println();
			}
		}
		else
			System.out.println("You enter a wrong size of matrix");
		
	}

}
