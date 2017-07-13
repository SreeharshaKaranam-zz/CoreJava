package com.wordpress.sreeharshasite;

public class Pattern3 {

	static int oddCounter=1;
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					
					System.out.print(oddCounter+"  ");
					oddCounter=oddCounter+2;
				}
				else 
				{
					if(oddCounter>9)
					System.out.print(oddCounter+" ");
					else
					System.out.print(oddCounter+"  ");	
					oddCounter=oddCounter+2;
					
				}
				
			}
			System.out.println();
		}

	}

}
