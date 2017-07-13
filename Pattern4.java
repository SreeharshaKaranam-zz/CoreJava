package com.wordpress.sreeharshasite;

public class Pattern4 {

	static int evenCounter=2;
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				if(i==1)
				{
					System.out.print(evenCounter+"  ");
					evenCounter=evenCounter+2;
					
				}
				else
				{
					if(evenCounter>=10)
					System.out.print(evenCounter+" ");
					else
					System.out.print(evenCounter+"  ");	
					evenCounter=evenCounter+2;
					
				}
			}
			System.out.println();
		}

	}

}
