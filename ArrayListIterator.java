package com.wordpress.sreeharshasite;

import java.util.Arrays;

public class ArrayListIterator<T> implements Iterable<T>{

	private int size=0;
	private Object[] array;
	private int currPos=-1;
	
	public int getSize() {
		return size;
	}
	
	/*initializing the object array with size 10*/
	public ArrayListIterator()
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
	
	public void print(ArrayListIterator<T> list)
	{
		for(int i=0;i<list.getSize();i++)
		{
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}

	

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>();
	}
	
	private class MyIterator<T> implements Iterator<T>
	{
		
		@Override
		public boolean hasNext() {
			
			if(size>0 && currPos!=size-1)
			{
				currPos++;
				return true;
			}
			else
			{
			currPos=-1;
			return false;
			}
		}

		@Override
		public Object next() {
			
			return array[currPos];
		}

		@Override
		public void remove(Object obj) {
			// TODO Auto-generated method stub
			remove(obj);
		}
				
	}
	
}
