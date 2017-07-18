package com.wordpress.sreeharshasite;

import java.util.HashMap;

public class HashSet<T> {
	
	private transient HashMap<T,Object> map;
	/*a dummy object is stored as value in the hashmap with the value stored as the key */
	private final static Object PRESENT=new Object();
	
	/*Hashset internally creates an object for hashmap*/
	public HashSet ()
	{
		map=new HashMap<T,Object>();
		
	}
	
	/* returns true if the object to be added is not present in the hashmap
	   false if object is present*/
	public boolean add(T obj)
	{
		
		return (map.put(obj, PRESENT)==null);
	}	
	
	/* returns true if the object to be removed is  present in the hashmap
	 * if object is not present*/
	public boolean remove(T obj)
	{
		 return map.remove(obj)==PRESENT;
	}

}
