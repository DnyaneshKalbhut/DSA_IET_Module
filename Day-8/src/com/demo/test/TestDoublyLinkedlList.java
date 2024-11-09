package com.demo.test;

import com.demo.Linkedlist.DoublyLinkedList;

public class TestDoublyLinkedlList {

	public static void main(String[] args) {
		
		DoublyLinkedList dl = new DoublyLinkedList();
		
		dl.addNode(5);
		dl.addNode(67);
		dl.addNode(69);
//		dl.displayNode();
		dl.addByPosition(23, 2);
		dl.afterKey(34, 67);
		dl.displayNode();
		System.out.println();
		System.out.println("Reverse order");
		dl.displayReverseOrder();
	}

}
