package com.demo.Linkedlist;

public class DoublyLinkedList {

	class Node{
		int val;
		Node next;
		Node prev;
		
		Node(int val){
			super();
			this.val = val;
			prev=null;
			next=null;
		}
	}
	
	Node head;

	public DoublyLinkedList() {
		head=null;
	}
	
	public void addNode(int val) {
		Node newnode= new Node(val);
		if(head==null) {
			head = newnode;
		}else {
			Node temp = head;
			while(temp.next!=null) {
				temp=temp.next;
			}
                  temp.next=newnode;
                  newnode.prev=temp;
		}
		
	}
	
	
	public void afterKey(int val,int key) {
		if(head==null) {
			System.out.println("List is Empty");
		}
		else {
			Node newnode = new Node(val);
			Node temp = head;
			while(temp!=null && temp.val!=key) {
				temp=temp.next;
			}
			if(temp!=null) {
				newnode.next=temp.next;
				 newnode.prev=temp;
				 if(temp.next!=null) {
					 temp.next.prev=newnode;
				 }
				 temp.next=newnode;
			 }
		}
		
	}
	
	public void addByPosition(int val,int pos) {
		Node newnode = new Node(val);
		if(pos==1) {
			if(head==null) {
				head=newnode;
			}else {
				newnode.next=head.next;
				head.next=newnode;
				head=newnode;
			}
		}else {
			Node temp = head ; 
			for(int i = 0 ; i < pos -2  ; i++) {
				temp=temp.next;
			}
			if(temp==null) {
				System.out.println("Given position is beyong limit");
			}else {
				newnode.next=temp.next;
				if(temp.next!=null)
					temp.next.prev=newnode;
					newnode.prev=temp;
					temp.next=newnode;
			}
		}
	}
	
    public void displayNode() {
	    Node temp =head;
	    while(temp!=null ) {
	    	System.out.print(temp.val+" , ");
	    	temp=temp.next;
	    }
	}
    
    public void displayReverseOrder() {
    	Node temp =head;
	    while(temp.next!=null ) {
	    	temp=temp.next;
	    }
	    while(temp!=null) {
	    	System.out.print(temp.val+" , ");
	    	temp=temp.prev;
	    }
    }
}
