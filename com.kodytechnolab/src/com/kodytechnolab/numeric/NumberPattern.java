package com.kodytechnolab.numeric;

public class NumberPattern {
	
	public static void main(String[] args) {
		int k=0,size=6,rem=0,c=0,count=0;
		long ans;
		int[] arr1=new int[20];
		for(int i=0;i<=size;i++)
		{
			int[] arr=new int[20];
			ans=1;
			c=0;
			count=0;
			for(int l=0;l<i;l++)
				ans=ans*11;
			while(ans>0)
			{
				rem=(int) (ans%10);
				arr[c]=rem;
				c++;
				ans=ans/10;
			}
			for(int j=c;j>=0;j--)
			{
				arr1[count]=arr[j];
				count++;
			}
			for(k=size;k>i;k--)
				System.out.print(" ");
			for(int g=0;g<arr.length;g++)
				arr[g]=arr1[g];
			for(int j=1;j<=i+1;j++)
				System.out.print(arr[j]+" ");		
			System.out.println();
		}
	}
}

