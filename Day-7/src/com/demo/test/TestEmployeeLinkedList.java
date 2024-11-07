package com.demo.test;

import com.demo.beans.Employee;
import com.demo.linkedlist.EmployeeLinkedList;

public class TestEmployeeLinkedList {
	public static void main(String[] args) {
		
		EmployeeLinkedList emplst = new EmployeeLinkedList();
		emplst.addNode(new Employee(01,"VG","Pune"));
		emplst.addNode(new Employee(02,"Kalbhut","pulgaon"));
		emplst.addNode(new Employee(01 ,"Sk","Pune"));
		emplst.addNode(new Employee(01,"Dk","pulgaon"));
//		emplst.displayData();
//		emplst.searchById(2);
//		emplst.searchById(22);
		emplst.deleteById(1);
		emplst.displayData();

	}
}
