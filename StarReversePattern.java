package com.wordpress.sreeharshasite;

public class StarReversePattern {

	
	public static void main(String[] args) {
		 int sum=12;
		for(int i=1;i<=6;i++)
		{
			
			for(int j=sum;j>0;j--)
			{
				
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			
			System.out.println();
			sum=sum-2;
		}
	}

}
