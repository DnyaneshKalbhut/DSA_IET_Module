package com.demo.test;

import com.demo.stack.MyStack;

public class TestBalnceParenthesis {

	public static void main(String[] args) {
		String str="{{{[](){}}}]}";
		MyStack st=new MyStack(20);
		boolean flag=isBalanced(st,str);
		if(flag) {
			System.out.println("The string has balanced parenthesis");
		}else {
			System.out.println("The string has not balanced parenthesis");
		}
		

	}

	private static boolean isBalanced(MyStack st, String str) {
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='(' || ch=='[' || ch=='{') {
				st.push(ch);
			}else {
				if(!st.isEmpty()) {
					char ch1=st.pop();
					
					if((ch=='}' && ch1!='{') || (ch==')' && ch1!='(') || (ch==']' && ch1!='[')){
						return false;
					}
					
				}else {
					return false;
				}
			}
			
			
		}
		if(st.isEmpty()) {
			return true;
		}else { 
			return false;
		}
	}

}
