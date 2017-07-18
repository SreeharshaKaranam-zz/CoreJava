package com.wordpress.sreeharshasite;

import java.util.Arrays;

public class ArrayList<T> {

	private int size=0;
	private Object[] array;
	
	public int getSize() {
		return size;
	}
	
	/*initializing the object array with size 10*/
	public ArrayList()
	{
		this.array=new Object[10];
	}

	public void add(Object obj)
	{
		/*if the existing array size is less than 5 then a new array copying
		 all the existing elements with the double length of that array is created*/
		if(array.length-size<=5)
		{
			increaseSize();
		}
		array[size++]=obj;
				
	}
	
	/*if the existing array size is less than 5 then a new array copying
	 all the existing elements with the double length of that array is created*/
	 
	public void increaseSize()
	{
		
		array=Arrays.copyOf(array,array.length*2);
		System.out.println("Object array length after size increase "+array.length);
	}
	
	public Object get(int index)
	{
		/*if index is beyond the array size exception is thrown*/
		if(size<index)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		/*if index value is negative  exception is thrown*/
		else if (index<0)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			return array[index];
		}
	}
	
	public void remove(int index)
	{
		/*if index is beyond the array size exception is thrown*/
		if(index>size)
		{
			throw new ArrayIndexOutOfBoundsException();
		}
		/*if index value is negative  exception is thrown*/
		else if(index<0)
		{
			
			throw new ArrayIndexOutOfBoundsException();
		}
		else
		{
			array[index]=null;
			int tmp=index;
			/*moving all the elements position one index up*/
			while(tmp<size)
			{
				array[tmp]=array[tmp+1];
				array[tmp+1]=null;
				tmp++;
			}
			size--;
		}
	}
	
	public void print(ArrayList<T> list)
	{
		for(int i=0;i<list.getSize();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
}
