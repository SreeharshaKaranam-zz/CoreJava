package com.wordpress.sreeharshasite;

public class StackSingleLinkedList<T> {
	
	int size=0;
	
	Node<T> headNode=null;
	
	public void push(int data)
	{
		Node<T> newHeadNode=new Node<T>(data);
		Node<T> currNode=headNode;
		
		if(currNode==null)
		{
			headNode=newHeadNode;
			size++;
		}
		else
		{
		if(currNode!=null)
		{
			if(currNode.nextNode==null)
			{
				newHeadNode.nextNode=currNode;
				currNode.nextNode=null;
				currNode=currNode.nextNode;
				headNode=newHeadNode;
				size++;
			}
			else
			{	
			newHeadNode.nextNode=currNode;
			currNode=null;
			headNode=newHeadNode;
			size++;
			}
		}
		
		}
		
	}

	public void pop()
	{
		Node<T> currNode=headNode;
		if(currNode==null)
		{
			return ;
		}
		else
		{	
		if(currNode.nextNode!=null)
		{
			
			headNode=currNode.nextNode;
			size--;
		}
		else
		{
			currNode=null;
			headNode=currNode;
			size--;
		}
		}
		
	}
	
	public Node<T> peek()
	{
		if(headNode==null)
		{
			return null;
		}
		else
		{
			return headNode;
		}
	}
	
	public void display()
	{
		Node<T> currNode=headNode;
		while(currNode!=null)
		{
			System.out.print(currNode.data+" ");
			currNode=currNode.nextNode;
			
		}
		System.out.println();
	}
}
