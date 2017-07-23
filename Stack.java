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
		/*if there are no objects add the element at the first index */
		if(size==0)
		{
			array[0]=obj;
			size++;
		}
		/*add the element at the zero index of the array*/
		else
		{	
		int index=size-1;
		
		while(index>=0)
		{
			Object temp=array[index];
			array[index+1]=temp;
			index--;
		}
		array[index+1]=obj;
		size++;
		
		}
		
	}
	
	/*Removing the first element in the list */
	public void pop()
	{
		if(size<=0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			int index=0;
			while(index<size-1)
			{
				array[index]=array[index+1];
				index++;
			}
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

	public Object peek()
	{
		int index=0;
		if(size>0)
			return array[index];
		else
			return null;
	}
}
