package com.demo.test;


import com.demo.Linkedlist.DoublycircularLinkedList;

public class TestDoublyCircularLinkedlist {

	public static void main(String[] args) {
		DoublycircularLinkedList dclist=new DoublycircularLinkedList();
		dclist.addNode(20);
		dclist.addNode(30);
		dclist.addNode(40);
		dclist.addNode(10);
		dclist.addNode(15);
		dclist.displayData();
		dclist.deleteByPosition(2);
		dclist.displayData();

	}

}
