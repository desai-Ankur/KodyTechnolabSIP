package com.kodytechnolab;
import java.util.Scanner;

public class RemoveSameWord {
	public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);	
		int size;
		System.out.println("Enter a number of sentence: ");
		size=Integer.parseInt(sc.nextLine());
		String[] sentence=new String[size];
		//User input a sentence
		for(int i=0;i<size;i++) {
			System.out.println("Enter a Sentence: ");
			sentence[i]=sc.nextLine();
		}
		
		String[] split=new String[size];
		String[] ans=new String[size];
		int l=0;
		
		for(int j=0;j<size;j++)
		{
			//one by one sentence split
			split=sentence[j].split(" ");
			String Sentence1="";
			for(int k=0;k<split.length;k++)
				// split word compare 
				for(int i=k+1;i<split.length;i++)
					// if match then replace to ignore
					if(split[k].equalsIgnoreCase(split[i]))
						split[i]="Ignore";
					else
						continue;		
			// if ignore word then skip and another word then store
			for(int k=0;k<split.length;k++)
					if(split[k].equals("Ignore"))
						continue;
					else
						Sentence1=Sentence1+split[k]+" ";
			ans[j]=Sentence1;
			System.out.println("");
		}
		System.out.println("Remove duplicate after look like:");
		for(int j=0;j<size;j++)
			System.out.println(ans[j]);
	}
}
