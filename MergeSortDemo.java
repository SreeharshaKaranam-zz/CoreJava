package com.wordpress.sreeharshasite;

public class MergeSortDemo {

	private int[] empIds;
	private int[] tempArray;
	
	public MergeSortDemo(int[] empIds,int size)
	{
		this.empIds=empIds;
		this.tempArray=new int[size];
		
	}
	
	public static void main(String[] args) {
		
		int[] empIds={10, 5, 87, 32, 14, 22};
		MergeSortDemo ms=new MergeSortDemo(empIds, empIds.length);
		ms.print(empIds);
		ms.split(0, empIds.length-1);
		ms.print(empIds);

	}
	
	public void split(int start, int end)
	{
		if(start<end)
		{
			int middle=start+(end-start)/2;
			split(start,middle);
			split(middle+1,end);
			merge(start,middle,end);
		}
		
	}

	public void merge(int start,int middle,int end)
	{
		
		for(int i=start;i<=end;i++)
		{
			tempArray[i]=empIds[i];
		}
		int i=start;
		int j=middle+1;
		int k=start;
		while(i<=middle && j<=end)
		{
			if(tempArray[i]<=tempArray[j])
			{
				empIds[k]=tempArray[i];
				i++;
			}
			else
			{
				empIds[k]=tempArray[j];
				j++;
			}
			k++;
			
		}
		while(i<=middle)
		{
			
			empIds[k]=tempArray[i];
			k++;
			i++;
		}
		
	}
	public void print(int[] empIds)
	{
		for(int i=0;i<empIds.length;i++)
		{
			System.out.print(empIds[i]+" ");
		}
		System.out.println();
	}
}
