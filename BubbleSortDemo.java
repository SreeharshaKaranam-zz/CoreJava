package com.wordpress.sreeharshasite;

public class BubbleSortDemo {


	public static void main(String[] args) {
		
		int empIds[]={120,110,100,90,80,70};
		
		
		/* iterate through the array before sort and print it */
		System.out.println("Before Sort");
	    print(empIds);
		
		sort(empIds);
		/* iterate through the array after sort and print it */
		System.out.println("After Sort");
		 print(empIds);

	}
	
	public  static void sort(int empIds[])
	{
		/*it stores the intermediate data during swapping */
		
		int temp;
		
		/*length -1 because no need to compare the last element in the array */
		for(int i=empIds.length-1;i>0;i--)
		{
			/*j<i because after each iteration the largest element bubbles to the top */
			for(int j=0;j<i;j++)
			{
				
				if(empIds[j]>empIds[j+1])
				{
					temp=empIds[j];
					empIds[j]=empIds[j+1];
					
					empIds[j+1]=temp;
				}
				
			}
			System.out.println("Intermediate data during each iteration");
			print(empIds);
		}
		
	}
	
	public static void print(int[] empIds)
	{
		for(int i=0;i<empIds.length;i++)
		{
			
			System.out.print(empIds[i]+" ");
		}

		System.out.println();
	}

}
