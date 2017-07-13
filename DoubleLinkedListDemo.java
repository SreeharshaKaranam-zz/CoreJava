package com.wordpress.sreeharshasite;

public class DoubleLinkedListDemo {


	public static void main(String[] args) {
		
		DoubleLinkedList dll=new DoubleLinkedList();
		
		
		dll.addAtStart(24);
		dll.addAtStart(48);
		dll.addAtStart(72);
		dll.addAtStart(96);
		int data=dll.deleteAtStart();
		System.out.println("Deleted data is:"+data);
		dll.addAtEnd(120);
		data=dll.deleteAtEnd();
		System.out.println("Deleted data is:"+data);
		dll.addAtPosition(96, 1);
		dll.deleteAtPosition(6);
		dll.displayNodes();

	}

}
