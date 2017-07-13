package com.wordpress.sreeharshasite;
import java.util.Comparator;


public class PersonNameComparator implements Comparator<Person>{
	
	public int compare(Person p1,Person p2)
	{
	
		if(p1.getName().equals(p2.getName()))
				{
			
					return p1.getSSN().compareTo(p2.getSSN());
				}
		else
		return p1.getName().compareToIgnoreCase(p2.getName());
		
		
	}

}
