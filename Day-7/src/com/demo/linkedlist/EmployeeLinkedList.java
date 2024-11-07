package com.demo.linkedlist;

import com.demo.beans.Employee;

public class EmployeeLinkedList {
	
	class Node{
		Employee data; 
		Node next;
		public Node(Employee data) {
			super();
			this.data = data;
			this.next=null;
		}
	}
	Node head ;
	public EmployeeLinkedList() {
		super();
		this.head = null;
	}
	
	public void addNode(Employee ob) {
		Node newnode = new Node(ob);
		if(head==null) {
			head=newnode;
		}else {
			Node temp = head ; 
			while(temp.next!=null) {
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	public void displayData(){
		Node temp = head;
		if(head!=null) {
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
			}
		}
	}

	public void searchById(int id){
		Node temp = head ; 
		while(temp.next!=null && temp.data.getEmpid()!=id) {
			temp = temp.next;
		}
		if(temp!=null && temp.data.getEmpid()==id) {
			System.out.println("ID FOUND --> ");
			System.out.println(temp.data);
		}else {
			System.out.println("ID not Founddddd");
		}
	}
	
	public void deleteById(int id){
		
		Node temp = head;
		if(head.data.getEmpid()==id) {
			head=temp.next;
			temp.next=null;
			temp=null;
		}else {
			Node prev=null;
			while(temp!= null && temp.data.getEmpid()!=id ) {
			prev=temp;
			temp=temp.next; 
			}
			if(temp!=null) {
				prev.next=temp.next;
				temp.next=null;
				temp=null;
				System.out.println("ID DELETED SUCCESSFULLY");
			}else {
				System.out.println("ID NOT FOUND");
			}
		}
	}
	

}
