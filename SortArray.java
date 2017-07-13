package com.wordpress.sreeharshasite;
import java.util.Arrays;


public class SortArray {

	
	public static void main(String[] args) {
		
		String[] fruits=new String[] {"Banana","Apple","Guava"};
		
		Arrays.sort(fruits);
		
		for(int i=0;i<fruits.length;i++)
		{
			
			System.out.println("Fruits size:"+fruits[i]);
		}
		

	}

}
