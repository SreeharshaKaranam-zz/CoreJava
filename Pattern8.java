package com.wordpress.sreeharshasite;

public class Pattern8 {
	

	public static void main(String[] args) {
		
		
		for(int i=1;i<=7;i++)
		{
			
			for(int j=7;j>0;j--)
			{
				if(i<j)
				{
				System.out.print(1+" ");
				}
				else
				{
					
					System.out.print(i+" ");
				}
			}
			
			System.out.println();
		}
	}

}
