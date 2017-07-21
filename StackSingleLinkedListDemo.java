package com.wordpress.sreeharshasite;

public class StackSingleLinkedListDemo {

	public static void main(String[] args) {
		
		StackSingleLinkedList<Integer> sll=new StackSingleLinkedList<Integer>();
		sll.push(10);
		sll.push(20);
		sll.push(30);
		sll.push(40);
		sll.push(50);
		sll.push(10);
		System.out.println("After Insertion");
		sll.display();
		sll.pop();
		System.out.println("After Deletion");
		sll.display();
		sll.pop();
		System.out.println("After Deletion");
		sll.display();
		sll.pop();
		System.out.println("After Deletion");
		sll.display();
		Node<Integer> node=sll.peek();
		System.out.println("Head Node value is:"+node.data);
	}

}
