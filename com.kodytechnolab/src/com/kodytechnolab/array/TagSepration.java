package com.kodytechnolab.array;

import java.util.Scanner;

public class TagSepration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size: ");
		int size=Integer.parseInt(sc.nextLine());
		String[] sentence=new String[size];
		System.out.println("Enter a Sentence: ");
		for(int i=0;i<size;i++)
			sentence[i]=sc.nextLine();
		String ans=" ",ans2=" ";
		String[] ans1=new String [10];
		//Sentence Sepration
		for(int i=0;i<size;i++)
		{
			
			char[] sen=sentence[i].toCharArray();
			//character match
			for(int j=0;j<sen.length;j++)
			{
				
				if(sen[j]=='<')
				{
					for(int k=j;k<sen.length;k++)
					{
						ans=ans+sen[k];
						if(sen[j]=='>')
							break;
						j++;
					}
				}
				else
				{
					for(int k=j;k<sen.length;k++)
					{
						if(sen[j]!='<')
						{
							ans2=ans2+sen[k];
							j++;
						}
						break;
					}
				}
			}
			System.out.println(ans2 +"  "+ans);
		}
		
	}

}
