package com.wordpress.sreeharshasite;

import java.util.Scanner;

public class PatternA {


	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number of rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			int counter=1;
			for(int j=rows;j>0;j--)
			{
				
				if(i>=j)
				{
					System.out.print(counter+" ");
					counter++;
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=rows-1;i>0;i--)
		{
			int counter=rows-1;
			for(int j=1;j<=i;j++)
			{
				
				while(counter>=i)
				{
					System.out.print(" ");
					counter--;
				}
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
		sc.close();
	}

}
