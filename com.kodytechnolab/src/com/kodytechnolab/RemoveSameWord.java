package com.kodytechnolab;
import java.util.Scanner;

public class RemoveSameWord {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		String[] str=new String[10];
		int sentence;
		System.out.println("Enter a number of sentence: ");
		sentence=Integer.parseInt(sc.nextLine());
		
		for(int i=0;i<sentence;i++) {
			System.out.println("Enter a Sentence: ");
			str[i]=sc.nextLine();
		}
		
		String[] split=new String[10];
		String[] ans=new String[10];
		int l=0;
		for(int j=0;j<sentence;j++)
		{
			split=str[j].split(" ");
			String Sentence1="";
			for(int k=0;k<split.length;k++)
				for(int i=k+1;i<split.length;i++)
					if(split[k].equalsIgnoreCase(split[i]))
						split[i]="Ignore";
					else
						continue;		
			for(int k=0;k<split.length;k++)
					if(split[k].equals("Ignore"))
						continue;
					else
						Sentence1=Sentence1+split[k]+" ";
			ans[j]=Sentence1;
			System.out.println("");
		}
		System.out.println("Remove duplicate after look like:");
		for(int j=0;j<sentence;j++)
			System.out.println(ans[j]);
	}
}
