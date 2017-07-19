package com.wordpress.sreeharshasite;

import java.util.Arrays;

public class Stack<T> {
	
	private int size=0;
	private Object[] array;
	private static final int INITIAL_CAPACITY=10;

	public Stack()
	{
		
		this.array=new Object[INITIAL_CAPACITY];
		
	}
	
	public void push(Object obj)
	{
		/*To check if the capacity of the array is reached , 
		 * if yes then length of the array is doubled
		 */
		if(array.length==size)
		{
			ensureCapacity();
		}
		array[size]=obj;
		size++;
		
	}
	
	/*Removing the last element in the list */
	public void pop()
	{
		if(size<=0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			array[size-1]=null;
			size--;
		}
	}
	/*Creating a new array while copying the old elements
	 *  in the array and increasing the length twice*/
	public void ensureCapacity()
	{
		
		array=Arrays.copyOf(array, array.length*2);
		System.out.println("Size capacity after increase-"+array.length);
	}
	public void print()
	{
		
		for(int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
