package com.demo.test;

import com.demo.queue.MyCircularQueue;

public class TestCircularQueue {

	public static void main(String[] args) {
		
		MyCircularQueue cqlst = new MyCircularQueue();
		cqlst.enqueue(12);
		cqlst.enqueue(22);
		cqlst.enqueue(44);
		cqlst.enqueue(232);
		
		while(!cqlst.isEmpty()) {
			System.out.println(cqlst.dequeue());
		}

	}

}
