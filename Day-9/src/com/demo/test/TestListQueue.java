package com.demo.test;

import com.demo.queue.MyQueue;

public class TestListQueue {

public static void main(String[] args) {
	MyQueue qlst = new MyQueue();
	qlst.enqueue(12);
	qlst.enqueue(112);
	qlst.enqueue(14);
	qlst.enqueue(1);
	
	while(!qlst.isEmpty()) {
		System.out.print(qlst.dequeue()+" , ");
	}
}
}
