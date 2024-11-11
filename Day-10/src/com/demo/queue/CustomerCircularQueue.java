package com.demo.queue;

import java.util.Arrays;

import com.demo.beans.Customer;

public class CustomerCircularQueue {
    Customer [] carr;
    int front ;
    int rear;
	public CustomerCircularQueue() {
		carr=new Customer[10];
		front=-1;
		rear=-1;
	}
	public CustomerCircularQueue(int size) {
		carr=new Customer[size];
		front=-1;
		rear=-1;
	}
    
	public boolean isFull() {
		if(front==0 && rear==carr.length-1)
			return true;
		if(front==rear+1)
			return true;
		return false;
	}
	public boolean isEmpty() {
		return front==-1;
	}
    
	public void enqueue(Customer val) {
	if(isFull()) {
		System.out.println("queue is full");
	}else {
		front =0;
		rear=(rear+1) % carr.length;
		carr[rear++]=val;
	}
	}
	
	public Customer dequeue() {
		if(isEmpty()) {
			System.out.println("queue is Empty");
		}else {
			Customer n = carr[front];
			if(front==rear) {
				front=-1;
				rear=-1;
			}
			else {
			front = (front+1)% carr.length;
			}
			System.out.println(Arrays.toString(carr));
			return n;
			 
		}
		System.out.println(Arrays.toString(carr));
		return null;
	}
}
