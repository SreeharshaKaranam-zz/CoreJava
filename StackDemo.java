package com.wordpress.sreeharshasite;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
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
		Integer firstElement=(Integer) stack.peek();
		System.out.println("Element at the first position in the stack "+firstElement);
		stack.push(130);
		System.out.println("Elements in the Stack After Push");
		stack.print();
	}

}
