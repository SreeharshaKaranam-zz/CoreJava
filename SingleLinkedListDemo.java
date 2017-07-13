package com.wordpress.sreeharshasite;
public class SingleLinkedListDemo
 
{
public static void main(String[] args)
 
{
 
SingleLinkedList sll=new SingleLinkedList();
 
sll.addAtStart(10);
 
sll.addAtStart(8);
 
sll.addAtStart(6);
 
sll.addAtStart(4);
 
sll.addAtEnd(12);

sll.addAtPosition(7, 2);
 
sll.displayNodes(); 
sll.reverseList(sll.head);
}
}