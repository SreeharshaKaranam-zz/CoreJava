package com.wordpress.sreeharshasite;
import java.util.Comparator;


public class Fruit implements Comparable<Fruit> {


	private String fruitName;
	
	private int quantity;
	
	
	public Fruit(String fruitName,int quantity)
	{
		super();
		this.fruitName=fruitName;
		this.quantity=quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}


	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int compareTo(Fruit fruit1) {
		
		return (this.getQuantity()-fruit1.getQuantity());
		
	}


	public static Comparator<Fruit> fruitNameComparator =new Comparator<Fruit>()
			{
		
		public int compare(Fruit f1,Fruit f2)
		{
			
			String fruitName1=f1.getFruitName().toUpperCase();
			String fruitName2=f2.getFruitName().toUpperCase();
			
			return fruitName1.compareTo(fruitName2);
			
		}
		
			};
			
	

}
