package com.demo.test;

import java.util.Scanner;

import com.demo.hashing.MyHashingLinkList;

public class TestHashingLinkList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=7;
		MyHashingLinkList[] hashtable=new MyHashingLinkList[num];
		for(int i=0;i<hashtable.length;i++) {
			hashtable[i]=new MyHashingLinkList();
		}
		
		displayhashTable(hashtable);
		int choice=0;
		do {
		System.out.println("1. Add data \n 2. Search data\n 3. delete data\n 4. exit\n choioce: ");
		choice=sc.nextInt();
        switch(choice) {
        case 1->{
        	System.out.println("enter number");
        	int val=sc.nextInt();
        	adddataInHashTable(hashtable, val);
        	displayhashTable(hashtable);
        }
        
        case 2->{
        	System.out.println("enter number");
        	int val=sc.nextInt();
        	boolean status=searchdata(hashtable, val);
        	if(status) {
        		System.out.println("number found");
        	}else {
        		System.out.println("number not found");
        	}
        }
        
        case 3->{
        	System.out.println("enter number");
        	int val=sc.nextInt();
        	boolean status=deleteFromHashTable(hashtable, val);
        	if(status) {
        		System.out.println("number deleted");
        		
        	}else {
        		System.out.println("number not deleted");
        	}
        	displayhashTable(hashtable);
        }
        
        
        case 4->{
    		System.out.println("Thank you for hashing....");
    		sc.close();
    	}
        default->System.out.println("Wrong choice....");
        }
		}while(choice!=4);
		
	}

	private static void adddataInHashTable(MyHashingLinkList[] hashtable, int data) {
		int bucket=data%hashtable.length;
		hashtable[bucket].addNode(data);
		
	}
	private static boolean deleteFromHashTable(MyHashingLinkList[] hashtable, int data) {
		int bucket=data%hashtable.length;
		return hashtable[bucket].deleteData(data);
		
	}
	
	private static boolean searchdata(MyHashingLinkList[] hashtable, int data) {
		int bucket=data%hashtable.length;
		return hashtable[bucket].search(data);
	}
	private static void displayhashTable(MyHashingLinkList[] hashtable) {
		for(int i=0;i<hashtable.length;i++) {
			System.out.print(i+"--->");
			hashtable[i].display();
			System.out.println();
		}
		System.out.println("--------------------------------------");
	}
	

}
