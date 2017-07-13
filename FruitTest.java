package com.wordpress.sreeharshasite;
import java.util.Arrays;


public class FruitTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Fruit[] fruits=new Fruit[5];
		Fruit fruit1=new Fruit("Banana",20);
		Fruit fruit2=new Fruit("Banana",50);
		Fruit fruit3=new Fruit("Apple",20);
		Fruit fruit4=new Fruit("Apple",40);
		Fruit fruit5=new Fruit("Guava",20);
		
		fruits[0]=fruit1;
		fruits[1]=fruit2;
		fruits[2]=fruit3;
		fruits[3]=fruit4;
		fruits[4]=fruit5;
		
		
		
		//Arrays.sort(fruits);
		Arrays.sort(fruits,Fruit.fruitNameComparator);
		
		int i=0;
		
		for(Fruit fr:fruits)
		{
			
			System.out.println("Name:"+fr.getFruitName()+"--"+"Quantity:"+fr.getQuantity());
		}
		
		
	}

}
