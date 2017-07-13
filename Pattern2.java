package com.wordpress.sreeharshasite;

public class Pattern2 {

	static int counter=1;
	public static void main(String[] args) {
		
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
				System.out.print(counter+" ");
				counter++;
				}
				else
				{
				System.out.print((counter)+" ");
				counter++;
				}
			}
			System.out.println();
		}

	}

}
