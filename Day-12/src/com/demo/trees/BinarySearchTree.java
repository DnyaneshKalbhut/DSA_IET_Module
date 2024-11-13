package com.demo.trees;

public class BinarySearchTree {
	Node root;
	class Node{
		Node left;
		int data;
		Node right;
		public Node(int val) {
			this.left = null;
			this.data = val;
			this.right = null;
		}
	}
	public BinarySearchTree() {
		this.root = null;
	}
	
	public void insertValue(int val) {
		root = insertData(root , val);
	}

	private Node insertData(Node root, int val) {
		Node newnode = new Node(val);
		if(root==null) {
			root = newnode;
//			System.out.println(root.data);
		}
		else {
			if(val<root.data) {
				root.left=insertData(root.left,val);

			}else {
				root.right=insertData(root.right,val);
			}
		}
		return root;
	}

	
	public void preorder() {
		preorderTraversal(root);
	}

	private void preorderTraversal(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
	}
	public void inorder() {
		inorderTraversal(root);
	}

	private void inorderTraversal(Node root) {
		if(root!=null) {
			inorderTraversal(root.left);
			System.out.print(root.data+" ");
			inorderTraversal(root.right);
		}
		}

	public void postorder() {
		postorderTraversal(root);
	}

	private void postorderTraversal(Node root) {
		if(root!=null) {
			postorderTraversal(root.left);
			postorderTraversal(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public boolean binarySearchValue(int val) {
		return binarySearchData(root,val);
	}

	private boolean binarySearchData(Node root, int val) {
		if (root==null) {
			return false;
		}
		
		if(root.data==val) {
			return true;
		}else if (val<root.data) {
		return	binarySearchData(root.left,val);
		}else {
	    return	binarySearchData(root.right,val);
		}
		
	}
	
}
