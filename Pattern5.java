package com.wordpress.sreeharshasite;

import java.util.Scanner;

public class Pattern5 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter the number till which to be printed");
		
		int num=sc.nextInt();
		
		for (int i=1;i<=num;i++)
		{
			
			for (int j=1;j<=i;j++)
			{
				
				System.out.print(j+" ");
			}
			System.out.println();
			if(i==num)
			{
			for(int k=i-1;k>0;k--)
			{
				for(int t=1;t<=k;t++)
				{	
				System.out.print(t+" ");
				}
				System.out.println();
			}
			}
		
		}
		sc.close();

	}

}
