package com.demo.Linkedlist;

public class CircularLinkedList {

	Node head,tail;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next=null;
		}
		
		
	}
	public CircularLinkedList() {
		head=null;
		tail=null;
	}
	
	public void  addNode(int val) {
		Node newnode = new Node(val);
		if(head==null) {
			head=newnode;
			tail=newnode;
		}else {
			tail.next=newnode;
		   tail=newnode;
		}
		tail.next=head;
		
	}
	
	public void addByPosition(int val , int pos) {
		if(head==null) {
			System.out.println("List is empty");
		}else {
			Node newnode = new Node(val);
			if(pos==1) {
				newnode.next=head;
				head = newnode;
				tail.next=newnode;
			}else {
				Node temp = head;
				int i = 1;
				for(;temp.next!=head && i<=pos-2;i++) {
					temp=temp.next;
				}
				if(i>pos-2) {
					if(temp.next==head) {
						tail=newnode;
					}
					newnode.next=temp.next;
					temp.next=newnode;
				}else {
					System.out.println("Position is out of beyond limit");
				}
			}
		}
	}    
}
