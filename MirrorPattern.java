package com.wordpress.sreeharshasite;

public class MirrorPattern {

	
	public static void main(String[] args)
	{
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
			
				System.out.print(j+" ");
			}
			
			for(int k=i;k>0;k--)
			{
				
				System.out.print(k+" ");
				
				
			}
			
			System.out.println(" ");
		}


	}

}
