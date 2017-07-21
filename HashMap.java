package com.wordpress.sreeharshasite;

public class HashMap<K, V> {
	
	private final static int INITIAL_CAPACITY=5;
	
	private Entry<K,V>[] entry=null;
	
	public HashMap()
	{
		
		this.entry=new Entry[INITIAL_CAPACITY];
	}
	
	public void put(K newKey,V newValue)
	{
		if(newKey==null)
		{
			return;
		}
		int hash=hash(newKey);
		
		Entry<K,V> newEntry=new Entry<K,V>(newKey,newValue,null);
		
		if(entry[hash]==null)
		{
			entry[hash]=newEntry;
		}
		else
		{
			 Entry<K,V> previous=null;
			 Entry<K,V> current=entry[hash];
			 while(current!=null)
			 {
				 if(current.key.equals(newKey))
				 {
				 if(previous==null)
				 {
					 newEntry.next=current.next;
					entry[hash]=newEntry;
					return;
				 }
				 else
				 {
					 newEntry.next=current.next;
					 previous.next=newEntry;
					 return;
				 }
				 
				 }
				 previous=current;
				 current=current.next;
			 }
			 previous.next=newEntry;
		}
		
		
	}

	public int hash(K key)
	{
		
		return (Math.abs(key.hashCode())%INITIAL_CAPACITY);
	}
}
