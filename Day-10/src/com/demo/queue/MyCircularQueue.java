package com.demo.queue;

import java.util.Arrays;

public class MyCircularQueue {

	int[]arr;
	int front;
	int rear;
	public MyCircularQueue() {
		arr=new int[10];
		front=-1;
		rear=-1;
	}
	public MyCircularQueue(int size) {
		arr=new int[size];
		front=-1;
		rear=-1;
	}
	
	
	public boolean isFull() {
		if(front==0 && rear == arr.length-1) {
			return true;
		}else if(front==rear+1) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		return front==-1;
	}
	
	public void enqueue(int val) {
		if(isFull()) {
			System.out.println("queue is full");
		}
		
		if(front==-1) {
			front=0;
		}else {
			rear=(rear+1)%arr.length;
			arr[rear]=val;
		}
	}
	
	public int dequeue() {
		
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else{
			int n= arr[front];
			
			if(front==rear) {
				front=-1;
				rear=-1;
			}else {
				front = (front+1) % arr.length;
			}
			System.out.println(Arrays.toString(arr));
			return n;
		}
		
		
		System.out.println(Arrays.toString(arr));
		return -1;
		
	}
}
