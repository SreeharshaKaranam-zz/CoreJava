package com.wordpress.sreeharshasite;
import java.lang.reflect.Field;
import java.util.Arrays;


public class SubstringDemo {

	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		String str="Hello Substring";
		String substr=str.substring(3);
		
		System.out.println("Original:"+str);
		System.out.println("Substring:"+substr);
		
		Field innerCharArr=String.class.getDeclaredField("value");
		innerCharArr.setAccessible(true);
		char[] chars=(char[]) innerCharArr.get(str);
		System.out.println("Original:"+Arrays.toString(chars));
		
		chars=(char[]) innerCharArr.get(substr);
		System.out.println("Substring:"+Arrays.toString(chars));
		
		
	}

}
