package com.demo.queue;

public class MyQueue {
		
	Node front , rear ;
	class Node{
		int data ;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	public MyQueue() {
		this.front = null;
		this.rear = null;
	}
	
	public void enqueue(int val) {
		Node newnode = new Node(val);
		if(rear==null) {
			front=newnode;
			rear = newnode;
		}else {
			rear.next=newnode;
			rear=newnode;
//            rear.next=null;
		}
		
	}
	
	public boolean isEmpty() {
		return front==null && rear == null;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
	
		}else {
			Node temp =front;
		     front=front.next;
		     if (front == null) { 
	                rear = null; 
	            }
			return temp.data;
		}
		return -1;
	}
}
