package com.wordpress.sreeharshasite;

public class HashSetDemo {

	
	public static void main(String[] args) {
		
		HashSet<String> hashset=new HashSet<String>();
		boolean value=hashset.add("John");
		System.out.println("Element add status "+value);
		value=hashset.add("Ravi");
		System.out.println("Element add status "+value);
		value=hashset.add("Alex");
		System.out.println("Element add status "+value);
		value=hashset.add("Jacob");
		System.out.println("Element add status "+value);
		value=hashset.add("John");
		System.out.println("Element add status "+value);
		value=hashset.remove("John");
		System.out.println("Is element available to remove "+value);
		value=hashset.remove("John");
		System.out.println("Is element available to remove "+value);
	}

}
