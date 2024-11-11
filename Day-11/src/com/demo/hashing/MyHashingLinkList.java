package com.demo.hashing;

public class MyHashingLinkList {
	Node head;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next=null;
		}
	}
	public MyHashingLinkList() {
		this.head = null;
	}
	
	public void addNode(int val) {
		Node newnode = new Node(val);
		if(head==null) {
			head=newnode;
		}else {
			newnode.next=head;
			head=newnode;
		}
	}
	
	public void display() {
		if(head==null) {
			System.out.println("empty list");
		}else {
			Node temp = head;
			while(temp.next!=null) {
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println("null");
		}
	}
	
	public boolean deleteData(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp = head;
			if(head.data==val) {
				head=head.next;
			}else {
				Node prev = null ; 
				while(temp!=null && temp.data!=val) {
					prev=temp;
					temp=temp.next;
				}
				if(temp.data==val) {
					prev.next=temp.next;
				}
				else {
					return false;
				}
			}
			temp.next=null;
			temp=null;
			return true;
		}
	}
	
	public boolean search(int val) {
		if(head==null) {
			return false;
		}else {
			Node temp = head ;
			while(temp!=null && temp.data==val) {
				temp=temp.next;
			}
			if(temp!=null && temp.data==val) {
				return true;
			}else {
				return false;
			}
		
		}
	}

}
