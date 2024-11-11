package com.demo.queue;

public class MyArrayQueue {
	int [] data;
	int front;
	int rear ;
	public MyArrayQueue() {
		data = new int [10];
		front = 0 ;
		rear = 0;
	}
	public MyArrayQueue(int size) {
		super();
		data = new int[size];
		this.front = 0;
		this.rear = 0;
	} 
	
	public boolean isEmpty() {
		return rear == front ; 
	}
	
	public boolean isFull() {
		return rear == data.length;
	}
	
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("queue is full");
		}else {
			data[rear++]=val;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue is empty");
		}
		else {
			int n = data[front];
			front ++;
			return n ; 
		}
		return -1 ; 
	}
}


