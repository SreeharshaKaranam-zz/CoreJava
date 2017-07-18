package com.wordpress.sreeharshasite;

public class DuplicateCheckArray {

	public static void main(String[] args)
	{
		DuplicateCheckArray dc=new DuplicateCheckArray();
		int a[]={5,55,43,49,78,52,55,99};
		dc.duplicateIntCheck(a);
		String[] names={"Ravi","Rajesh","Harsha","Abhi","latha","geetha","Ravi","Rani"};
		dc.duplicateStringCheck(names);
	}
	public void duplicateStringCheck(String[] names)
	{
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				
				if(names[i].equals(names[j]))
				{
					
					System.out.println("Duplicate found at the indexes: "+i+"  "+j);
					System.out.println("Duplicate Data is "+names[i]);
				}	
			}	
		}
		
	}
	public void duplicateIntCheck(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate found at the indexes: "+i+"  "+j);
					System.out.println("Duplicate Data is "+arr[i]);
				}
				
			}
			
		}
	}

}
