package com.wordpress.sreeharshasite;

public class ArrayListIteratorDemo {

	
	public static void main(String[] args) {
		
		ArrayListIterator<Integer> list=new ArrayListIterator<Integer>();
		list.add(5);
		list.add(15);
		list.add(25);
		list.add(53);
		list.add(35);
		list.add(50);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			Integer element=(Integer) itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		list.remove(3);
		itr=list.iterator();
		while(itr.hasNext())
		{
			Integer element=(Integer) itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		list.add(23);
		list.add(33);
		list.add(5);
		list.add(15);
		list.add(25);
		list.add(53);
		list.add(35);
		list.add(50);
		list.add(5);
		list.add(15);
		list.add(25);
		list.add(53);
		list.add(35);
		list.add(50);
		itr=list.iterator();
		while(itr.hasNext())
		{
			Integer element=(Integer) itr.next();
			System.out.print(element+" ");
		}

	}

}
