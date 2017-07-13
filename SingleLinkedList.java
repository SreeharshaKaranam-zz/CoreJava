package com.wordpress.sreeharshasite;
public class SingleLinkedList
 
{
 
Node head;
 
public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

int size=0;

/* to add the node at the start of the linked list*/
public void addAtStart(int data)
 
{
 
Node currNode=new Node(data);
 
currNode.nextNode=head;
 
head=currNode;
 
size++;
 
}
 
public int deleteAtStart()
 
{
 
Node currNode=head;
 
int data=currNode.data;
 
head=currNode.nextNode;
 
size--;
 
return data;
 
}
 
public void addAtEnd(int data)
 
{

	/* if node is empty then element to be added at start */
if(head==null)
 
{
 
addAtStart(data);
 
}
 
Node newNode=new Node(data);
 
Node currNode=head;
 
while(currNode.nextNode!=null)
 
{
 
currNode=currNode.nextNode;
 
}
 
currNode.nextNode=newNode;
 
size++;
 
}
 
public int deleteAtEnd()
 
{
 
if(head.nextNode==null)
 
{
 
deleteAtStart();
 
}
 
else
 
{
 
Node currNode=head;

/* need to get the last but one node to make it as the end */
while(currNode.nextNode.nextNode!=null)
 
{
 
currNode=currNode.nextNode.nextNode;
 
}
 
int data=currNode.nextNode.data;
 
currNode.nextNode=null;
 
size--;
 
return data;
 
}
 
return -1;
 
}
 
public void addAtPosition(int data,int position)
 
{
 
Node newNode=new Node(data);
 
int index=1;
 
Node currNode=head;
 
Node prevNode=null;

if(position>=(getSize()+1))
{
	
	System.out.println("Position is invalid/greater than size");
}

else
{	
if(position==1)
 
{
 
newNode.nextNode=head;
 
head=newNode;
 
size++;
 
}
 
else
 
{
 
while(currNode!=null)
 
{
 

 /* to get the previous node of the index */
if(index==position-1)
 
{
 
prevNode=currNode;
 
}
 
currNode=currNode.nextNode;
 
index++;
 
if(index==position)
 
{
 
newNode.nextNode=currNode;
 
prevNode.nextNode=newNode;
 
size++;
 
}
}
 
}
 
}
}
 
public int search(int data)
 
{
 
Node currNode=head;
 
int index=1;
 
while(currNode!=null)
 
{
 
if(currNode.data==data)
 
{
 
return index;
 
}
 
else
 
currNode=currNode.nextNode;
 
index++;
 
}
 
return -1;
 
}
 
public void displayNodes()
 
{
 
Node currNode=head;
 
while(currNode!=null)
 
{
 
System.out.println("Data:"+currNode.data);
 
currNode=currNode.nextNode;
 
}
 
}

public void displayNode(Node n)

{
 
Node currNode=n;
 

System.out.println("Display Node:"+currNode.data);
 
 
}

public void reverseList(Node head){
	
	Node currNode=head;
	System.out.println("Head data:"+currNode.data);
	while(currNode.nextNode!=null)
	{
		currNode=currNode.nextNode;
		
	}
	displayNode(currNode);
}
}