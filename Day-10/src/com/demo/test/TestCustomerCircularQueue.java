package com.demo.test;

import com.demo.beans.Customer;
import com.demo.queue.CustomerCircularQueue;

public class TestCustomerCircularQueue {

	public static void main(String[] args) {
		
		CustomerCircularQueue ccq = new CustomerCircularQueue();
		
		ccq.enqueue(new Customer(01,"VG","pune"));
		ccq.enqueue(new Customer(01,"V","mh"));
		ccq.enqueue(new Customer(01,"DK","pulgaon"));
		ccq.enqueue(new Customer(01,"D","pune"));
		
		while(!ccq.isEmpty()) {
			System.out.println(ccq.dequeue());
		}

	}

}
