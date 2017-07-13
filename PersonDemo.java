package com.wordpress.sreeharshasite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PersonDemo {

	
	public static void main(String[] args) {
		
		
		Person p1=new Person("728963","Harsha","12ABG158","ABC78945");
		Person p2=new Person("158963","Ravi","01ACG158","DEF78945");
		Person p3=new Person("328963","Rajesh","32ABG158","ADC78945");
		Person p4=new Person("128963","Abhi","32ABG158","ADC78945");
		List<Person> personList=new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		
		Collections.sort(personList);
		
		for(Person per:personList)
		{
			
			System.out.println("SSN--"+per.getSSN()+"--"+"Name::"+per.getName());
		}
		
	}

}
