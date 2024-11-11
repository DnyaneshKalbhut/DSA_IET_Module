package com.demo.test;

import com.demo.stack.MyStack;

public class TestCharStack {

	public static void main(String[] args) {
		MyStack st=new MyStack(20);
		String s="This is string";
		System.out.println("before");
		System.out.println(s);
		for(int i=0;i<s.length();i++) {
			if(!st.isFull())
				st.push(s.charAt(i));
		}
		while(!st.isEmpty()) {
			System.out.print(st.pop());
		}
	}

}
