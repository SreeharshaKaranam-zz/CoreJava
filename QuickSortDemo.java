package com.wordpress.sreeharshasite;

public class QuickSortDemo {
	
	private int[] empIds;
	
	public QuickSortDemo(int[] empIds)
	{
		this.empIds=empIds;	
	}

	
	public int[] getEmpIds() {
		return empIds;
	}


	public static void main(String[] args) {
		
        int[] empIds={8, 1, 3, 2, 6, 5, 7, 4, 12, 9, 11, 10, 14, 13, 15};
		QuickSortDemo qs=new QuickSortDemo(empIds);
		/*Before sort printing the elements in the array */
		System.out.println("Before Sort");
		qs.print(empIds);
		int start=0;
		int end=empIds.length-1; 
		qs.sort(empIds,start,end);
		/*After sort printing the elements in the array */
		System.out.println("After Sort");
		qs.print(empIds);
		
	}

	public void print(int[] empIds)
	{
		for(int i=0;i<empIds.length;i++)
		{
			System.out.print(empIds[i]+" ");
		}
		System.out.println();
	}
	
	public int partition(int[] empIds,int start,int end )
	{
		int left=start;
		int right=end;
		/*considering the middle element in the array as the pivot*/
		int pivot=empIds[(left+right)/2];
	
		/*until all the elements in the array are iterated */
		while(left<=right)
		{
			/* comparing the first half of the array with the pivot , iterating through the first half until the condition is met*/
			while(empIds[left]<pivot)
			{
				
				left++;
			}
			/* comparing the second half of the array with the pivot , iterating through the second half until the condition is met*/
			while(empIds[right]>pivot)
			{
				
				right--;
			}
			/*if the condition is met the elements are swapped */
			if(left<=right)
			{
				int temp=empIds[left];
				empIds[left]=empIds[right];
				empIds[right]=temp;
				left++;
				right--;
			}
			
		}
		System.out.println("Intermediate data display during sorting");
		print(empIds);
		return left;
		
	}
	
	public void sort(int[] empIds,int start,int end)
	{
		
		int index=partition(empIds,start,end);
		
		if(start<index-1)
		{
			sort(empIds,start,index-1);
		}
		
		if(index<end)
		{
			sort(empIds,index,end);
		}
		
	}
}
