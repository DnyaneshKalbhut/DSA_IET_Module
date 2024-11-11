package com.demo.stack;

public class MyListStack {
	
	Node top;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	public MyListStack() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		return top == null ;
	}
	
	public void push(int val) {
		Node newnode = new Node(val);
		if(top==null) {
		top = newnode;
		}else {
			newnode.next=top;
			top = newnode;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			Node temp = top ;
			top = temp.next;
			temp.next=null;
			return temp.data;
		}
		return -1 ;
	}
	
}
