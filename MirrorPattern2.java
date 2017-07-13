package com.wordpress.sreeharshasite;

public class MirrorPattern2 {

	public static void main(String[] args)
	
	{
		
		for(int i=1;i<=4;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(j+" ");
				sum=sum+j;
			}
			
			System.out.print(sum+" ");
			
			for(int k=i;k>0;k--)
			{
				
				System.out.print(k+" ");
			}
			
			System.out.println();
		}

	}

}
