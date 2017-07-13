package com.wordpress.sreeharshasite;

public class DoubleLinkedList {
	
	int size=0;
	
	DLLNode headNode=null;
	
	DLLNode tailNode=null;

	public void addAtStart(int data)
	{
		
		DLLNode newNode=new DLLNode(data);
		
		DLLNode currNode=headNode;
		
		if(currNode==null)
		{
			headNode=newNode;
			size++;
		}
		else
		{	
		newNode.nextNode=headNode;
		headNode.prevNode=newNode;
		
		headNode=newNode;
		
		size++;
		}
	}
	
	public void addAtEnd(int data)
	{
		
		DLLNode newNode=new DLLNode(data);
		
		DLLNode currNode=headNode;
		
		if(currNode==null)
		{
			addAtStart(data);
		}
		else
		{	
		while(currNode.nextNode!=null)
		{
			currNode=currNode.nextNode;
			
		}
		currNode.nextNode=newNode;
		newNode.prevNode=currNode;
		size++;
		}
	}
	
	public int deleteAtStart()
	{
		
		DLLNode currNode=headNode;
		DLLNode nextNode;
		
		/* scenario 1:no nodes in the list */
		if(currNode==null)
		{
			System.out.println("No elements in the list to delete");
			return -1;
		}
		/* scenario 2:only one node in the list */
		else if(currNode.nextNode==null)
		{
			int data=currNode.data;
			headNode=null;
			size--;
			return data;
		}
		/*scenario 3:  More than one node in the list */
		else
		{
			int data=currNode.data;
			nextNode=currNode.nextNode;
			nextNode.prevNode=null;
			headNode=nextNode;
			size--;
			return data;
		}
		
	}
	
	public int deleteAtEnd()
	{
		
		DLLNode currNode=headNode;
		DLLNode prevNode=null;;
		
		/* scenario 1:no nodes in the list */
		if(currNode==null)
		{
			System.out.println("No elements in the list to delete");
			return -1;
		}
		/* scenario 2:only one node in the list */
		else if(currNode.nextNode==null)
		{
			deleteAtStart();
		}
		/* scenario 3: More than one node in the list */
		else
		{
			while(currNode.nextNode.nextNode!=null)
			{
				currNode=currNode.nextNode;
				
			}
			prevNode=currNode;
			int data=currNode.nextNode.data;
			prevNode.nextNode=null;
			size--;
			
			return data;
		}
		return -1;
		
	}
	
	public void addAtPosition(int data,int position)
	{
		/* scenario 1: position is beyond the node size */
		if((getSize()+2)<position)
		{
			System.out.println("Postion entered is invalid");
		}
		/* scenario 1: position is less than zero*/
		else if(position<1)
		{
			System.out.println("Postion entered is invalid");
		}
		else
		{	
		DLLNode currNode=headNode;
		DLLNode newNode=new DLLNode(data);
		DLLNode beforeNode=null;
		
		
		/* scenario 3:if the node to be added is in the first position */
		if(position==1)
		{
			addAtStart(data);
		}
		
		/* scenario 4:if the node to be added at the end */
		
		else if(position==getSize()+1)
		{
			
			addAtEnd(data);
		}
		
		else
		{	
		/* scenario 5: if the node to be added in between the linked list */
		int index=1;
		while(currNode!=null)
		{
			currNode=currNode.nextNode;
			index++;
			if(position==index)
			{
				beforeNode=currNode.prevNode;
				newNode.prevNode=currNode.prevNode;
				newNode.nextNode=currNode;
				currNode.prevNode=newNode;
				beforeNode.nextNode=newNode;
				size++;
				
			}
			
			
			
		}
		}
		}
		
		
	}
	public int getSize() {
		return size;
	}

	public void deleteAtPosition(int position)
	{
		/* scenario 1: position is beyond the node size */
		if((getSize()+1)<=position)
		{
			System.out.println("Postion entered is invalid");
		}
		/* scenario 1: position is less than zero*/
		else if(position<1)
		{
			System.out.println("Postion entered is invalid");
		}
		else
		{	
		DLLNode currNode=headNode;
		DLLNode beforeNode=null;
		DLLNode afterNode=null;
		
		
		/* scenario 3:if the node to be deleted is in the first position */
		if(position==1)
		{
			deleteAtStart();
		}
		
		/* scenario 4:if the node to be deleted at the end */
		
		else if(position==getSize())
		{
			
			deleteAtEnd();
		}
		
		else
		{	
		/* scenario 5: if the node to be added in between the linked list */
		int index=1;
		while(currNode!=null)
		{
			currNode=currNode.nextNode;
			index++;
			if(position==index)
			{
				beforeNode=currNode.prevNode;
				afterNode=currNode.nextNode;
				beforeNode.nextNode=afterNode;
				afterNode.prevNode=beforeNode;
				
				size--;
				
			}
			
			
			
		}
		}
		}
		
	}
	public void displayNodes()
	{
		
		DLLNode currNode=headNode;
		
		/*scenario: no nodes to display*/
		if(currNode==null)
		{
			
			System.out.println("No nodes to display");
		}
		else
		{	
			
		while(currNode!=null)
		{
			System.out.println("Data:"+currNode.data);
			currNode=currNode.nextNode;
			
		}
		}
		
	}
}
