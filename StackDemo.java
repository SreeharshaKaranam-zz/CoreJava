package com.wordpress.sreeharshasite;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Object> stack=new Stack<Object>();
		stack.push(10);
		stack.push(9);
		stack.push(99);
		stack.push(70);
		stack.push(65);
		stack.push(47);
		stack.push(32);
		stack.push(23);
		stack.push(9);
		stack.push(76);
		stack.push(54);
		stack.push(45);
		stack.push(3);
		System.out.println("Elements in the Stack After Push");
		stack.print();
		stack.pop();
		System.out.println("Elements in the Stack After Pop");
		stack.print();
		stack.pop();
		System.out.println("Elements in the Stack After Pop");
		stack.print();
	}

}
