package com.demo.test;

import com.demo.stack.MyListStack;

public class TestListStack {

	public static void main(String[] args) {
		
		MyListStack st = new MyListStack();
		
		st.push(12);
		st.push(11);
		st.push(7);
		
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
           System.out.println("end");
	}

}
