package com.wordpress.sreeharshasite;

import java.util.Scanner;

public class Pattern6 {
	
	static int counter=1;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows=sc.nextInt();
		counter=rows;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=counter;j++)
			{
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			counter--;
			
		}
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j+" ");
				
			}
			
			System.out.println();
			
		}
		sc.close();
	}

}
