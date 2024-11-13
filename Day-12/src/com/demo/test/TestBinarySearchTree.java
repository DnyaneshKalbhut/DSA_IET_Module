package com.demo.test;

import com.demo.trees.BinarySearchTree;

public class TestBinarySearchTree {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		
		bst.insertValue(12);
		bst.insertValue(54);
		bst.insertValue(4);
		bst.insertValue(43);
		bst.insertValue(33);
		bst.insertValue(1);
		bst.insertValue(10);
		bst.insertValue(45);
		System.out.println("PreOrder Traversal");
		bst.preorder();
		System.out.println();
		System.out.println("InOrder Traversal");
		bst.inorder();
		System.out.println();
		System.out.println("PostOrder Traversal");
		bst.postorder();
		boolean status = bst.binarySearchValue(1);
		System.out.println(status);

	}

}
