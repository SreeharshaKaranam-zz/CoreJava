package com.wordpress.sreeharshasite;

import java.util.Scanner;

public class Pattern7 {
	
 static int oddCounter=1;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows=sc.nextInt();
		
		int counter=0;
		for(int i=1;i<=rows;i++)
		{

			counter=i;
			while(counter<=rows)
			{
				
				System.out.print(" ");
				counter++;
			}
			
			for(int j=1;j<=oddCounter;j++)
			{
			if(oddCounter==1)	
	           System.out.print(j);
			else
				System.out.print(i);
				
			}
			
			System.out.println();
			oddCounter=oddCounter+2;
		}
		
		sc.close();
		
	}

}
